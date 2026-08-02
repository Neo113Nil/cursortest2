package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: classes9.dex */
public class g3r extends f3r {
    public static byte[] c(File file) {
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            long length = file.length();
            if (length > 2147483647L) {
                throw new OutOfMemoryError("File " + file + " is too big (" + length + " bytes) to fit in memory.");
            }
            int i = (int) length;
            byte[] bArr = new byte[i];
            int i2 = i;
            int i3 = 0;
            while (i2 > 0) {
                int read = fileInputStream.read(bArr, i3, i2);
                if (read < 0) {
                    break;
                }
                i2 -= read;
                i3 += read;
            }
            if (i2 > 0) {
                bArr = Arrays.copyOf(bArr, i3);
            } else {
                int read2 = fileInputStream.read();
                if (read2 != -1) {
                    ckn cknVar = new ckn();
                    cknVar.write(read2);
                    rzo.l(fileInputStream, cknVar);
                    int size = cknVar.size() + i;
                    if (size < 0) {
                        throw new OutOfMemoryError("File " + file + " is too big to fit in memory.");
                    }
                    byte[] c = cknVar.c();
                    bArr = Arrays.copyOf(bArr, size);
                    System.arraycopy(c, 0, bArr, i, cknVar.size());
                }
            }
            fileInputStream.close();
            return bArr;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ooc.g(fileInputStream, th);
                throw th2;
            }
        }
    }

    public static ArrayList d(File file) {
        Charset charset = uza.a;
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), charset));
        try {
            Iterator it = new a7e(new i73(4, bufferedReader)).iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            bufferedReader.close();
            return arrayList;
        } finally {
        }
    }

    public static String e(File file) {
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file), uza.a);
        try {
            String x0 = cma1.x0(inputStreamReader);
            inputStreamReader.close();
            return x0;
        } finally {
        }
    }

    public static void f(File file, byte[] bArr) {
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } finally {
        }
    }

    public static void g(File file, String str) {
        Charset charset = uza.a;
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        try {
            h(fileOutputStream, str, charset);
            fileOutputStream.close();
        } finally {
        }
    }

    public static final void h(FileOutputStream fileOutputStream, String str, Charset charset) {
        if (str.length() < 16384) {
            fileOutputStream.write(str.getBytes(charset));
            return;
        }
        CharsetEncoder newEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        CharsetEncoder onUnmappableCharacter = newEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction);
        CharBuffer allocate = CharBuffer.allocate(8192);
        ByteBuffer allocate2 = ByteBuffer.allocate(8192 * ((int) Math.ceil(onUnmappableCharacter.maxBytesPerChar())));
        int i = 0;
        int i2 = 0;
        while (i < str.length()) {
            int min = Math.min(8192 - i2, str.length() - i);
            int i3 = i + min;
            str.getChars(i, i3, allocate.array(), i2);
            allocate.limit(min + i2);
            i2 = 1;
            if (!onUnmappableCharacter.encode(allocate, allocate2, i3 == str.length()).isUnderflow()) {
                ny61.r("Check failed.");
                return;
            }
            fileOutputStream.write(allocate2.array(), 0, allocate2.position());
            if (allocate.position() != allocate.limit()) {
                allocate.put(0, allocate.get());
            } else {
                i2 = 0;
            }
            allocate.clear();
            allocate2.clear();
            i = i3;
        }
    }
}
