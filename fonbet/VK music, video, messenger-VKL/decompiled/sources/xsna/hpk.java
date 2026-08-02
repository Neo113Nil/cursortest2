package xsna;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.charset.Charset;

/* compiled from: CustomVirtualBackgroundResource.kt */
/* loaded from: classes7.dex */
public final class hpk {
    public static boolean a(File file, File file2) {
        vhk0.d(file2);
        if (file2.mkdirs()) {
            File file3 = new File(file2, "image");
            if (file3.mkdirs()) {
                File file4 = new File(file3, "0.jpg");
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options);
                options.inSampleSize = kd7.a(2000, 2000, options);
                options.inJustDecodeBounds = false;
                Bitmap decodeFile = BitmapFactory.decodeFile(file.getPath(), options);
                if (decodeFile != null) {
                    Bitmap k = kd7.k(decodeFile, ahn.t(file), false);
                    if (k != null) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file4);
                        try {
                            k.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
                            fileOutputStream.close();
                        } finally {
                        }
                    }
                    File file5 = new File(file2, "version");
                    Charset charset = emb.b;
                    PrintWriter printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file5), charset), 8192));
                    try {
                        System.out.println((Object) "1128");
                        s3q0 s3q0Var = s3q0.a;
                        printWriter.close();
                        File file6 = new File(file2, "string");
                        if (file6.mkdirs()) {
                            printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file6, "en_us")), charset), 8192));
                            try {
                                printWriter.print("Tap\n1\nfalse\n-1\ncenterCrop");
                                printWriter.close();
                                printWriter = new PrintWriter(new BufferedWriter(new OutputStreamWriter(new FileOutputStream(new File(file6, "ru_ru")), charset), 8192));
                                try {
                                    printWriter.print("Tap\n1\nfalse\n-1\ncenterCrop");
                                    printWriter.close();
                                    return true;
                                } finally {
                                }
                            } finally {
                                try {
                                    throw th;
                                } finally {
                                }
                            }
                        }
                    } finally {
                        try {
                            throw th;
                        } finally {
                        }
                    }
                }
            }
        }
        return false;
    }
}
