package ru.ok.tensorflow.tflite;

import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.tensorflow.lite.a;
import org.tensorflow.lite.nnapi.NnApiDelegate;
import ru.ok.proto.rtmp.amf.AmfConstants;

/* loaded from: classes9.dex */
public class Util {
    static final int NUM_THREADS = 4;

    public enum Api2BufferType {
        None,
        PassCPU,
        PassGPU
    }

    public enum DelegateType {
        CPU,
        GPU,
        NNAPI
    }

    public static String calculateSha1Hash(ByteBuffer byteBuffer) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
            messageDigest.update(byteBuffer);
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                int i = (b >>> 4) & 15;
                int i2 = 0;
                while (true) {
                    sb.append((char) ((i < 0 || i > 9) ? i + 87 : i + 48));
                    i = b & AmfConstants.TYPE_XML_DOCUMENT_MARKER;
                    int i3 = i2 + 1;
                    if (i2 >= 1) {
                        break;
                    }
                    i2 = i3;
                }
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return new String();
        }
    }

    public static org.tensorflow.lite.a createInterpreter(ByteBuffer byteBuffer, int i, DelegateType delegateType) {
        try {
            a.C2187a c2187a = new a.C2187a();
            if (delegateType == DelegateType.GPU) {
                throw new RuntimeException("TFL GPU Java delegate is disabled");
            }
            if (delegateType == DelegateType.NNAPI) {
                c2187a.c.add(new NnApiDelegate());
            } else {
                c2187a.b = Boolean.TRUE;
            }
            c2187a.a = i;
            return new org.tensorflow.lite.a(byteBuffer, c2187a);
        } catch (Exception e) {
            if (e.toString().contains("Landmarks2TransformMatrix")) {
                return null;
            }
            throw new RuntimeException(e);
        }
    }

    public static ByteBuffer readBinFile(File file) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) file.length());
        allocateDirect.order(ByteOrder.LITTLE_ENDIAN);
        try {
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.read(allocateDirect);
            channel.close();
            return allocateDirect;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return allocateDirect;
        } catch (IOException e2) {
            e2.printStackTrace();
            return allocateDirect;
        }
    }

    public static void saveBinFile(File file, ByteBuffer byteBuffer) {
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileChannel channel = new FileOutputStream(file).getChannel();
            channel.write(byteBuffer);
            channel.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
