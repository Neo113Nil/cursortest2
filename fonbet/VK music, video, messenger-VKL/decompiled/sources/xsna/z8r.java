package xsna;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.vk.core.exceptions.FileFormatException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: FileImageUtils.java */
/* loaded from: classes17.dex */
public final class z8r {

    /* compiled from: FileImageUtils.java */
    public static class a {
        public int a;
        public int b;
        public String c;
        public long d;

        public final String toString() {
            StringBuilder sb = new StringBuilder("AnalyzeResult{width=");
            sb.append(this.a);
            sb.append(", height=");
            sb.append(this.b);
            sb.append(", mimeType='");
            sb.append(this.c);
            sb.append("', fileSize=");
            return vu5.a('}', this.d, sb);
        }
    }

    public static a a(Context context, Uri uri) throws IOException {
        AssetFileDescriptor assetFileDescriptor = null;
        InputStream inputStream = null;
        try {
            AssetFileDescriptor openAssetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
            try {
                if (openAssetFileDescriptor == null) {
                    throw new FileNotFoundException("Cannot open uri: " + uri);
                }
                if (openAssetFileDescriptor.getLength() == -1 || openAssetFileDescriptor.getLength() < 0) {
                    throw new FileFormatException("Incorrect fileSize: " + openAssetFileDescriptor.getLength());
                }
                BitmapFactory.Options options = new BitmapFactory.Options();
                boolean z = true;
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFileDescriptor(openAssetFileDescriptor.getFileDescriptor(), null, options);
                try {
                    openAssetFileDescriptor.close();
                } catch (Exception unused) {
                }
                if (options.outWidth <= 0 || options.outHeight <= 0) {
                    options.outWidth = -1;
                    options.outHeight = -1;
                }
                try {
                    InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                    try {
                        if (openInputStream == null) {
                            throw new FileNotFoundException("Cannot open uri: " + uri);
                        }
                        int d = new p4q(openInputStream).d(1, "Orientation");
                        if (d != 6 && d != 8) {
                            z = false;
                        }
                        try {
                            openInputStream.close();
                        } catch (Exception unused2) {
                        }
                        a aVar = new a();
                        aVar.a = z ? options.outHeight : options.outWidth;
                        aVar.b = z ? options.outWidth : options.outHeight;
                        String str = options.outMimeType;
                        if (str == null) {
                            str = "";
                        }
                        aVar.c = str;
                        try {
                            AssetFileDescriptor openAssetFileDescriptor2 = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                            if (openAssetFileDescriptor2 == null) {
                                throw new FileNotFoundException("Cannot open uri: " + uri);
                            }
                            if (openAssetFileDescriptor2.getLength() == -1 || openAssetFileDescriptor2.getLength() < 0) {
                                throw new FileFormatException("Incorrect fileSize: " + openAssetFileDescriptor2.getLength());
                            }
                            long length = openAssetFileDescriptor2.getLength();
                            try {
                                openAssetFileDescriptor2.close();
                            } catch (Exception unused3) {
                            }
                            aVar.d = length;
                            return aVar;
                        } catch (Throwable th) {
                            if (0 != 0) {
                                try {
                                    assetFileDescriptor.close();
                                } catch (Exception unused4) {
                                }
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        inputStream = openInputStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (Exception unused5) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                assetFileDescriptor = openAssetFileDescriptor;
                if (assetFileDescriptor != null) {
                    try {
                        assetFileDescriptor.close();
                    } catch (Exception unused6) {
                    }
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }
}
