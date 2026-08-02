package xsna;

import android.net.Uri;
import com.vk.upload.impl.tasks.VideoUploadTaskNew;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.Selector;
import one.video.upload.exceptions.UploadUrlExpiredException;
import one.video.upload.impl.UploadMode;
import xsna.tdq0;

/* compiled from: Uploader.kt */
/* loaded from: classes8.dex */
public final class ldq0 {
    public static boolean a(Uri uri, RandomAccessFile randomAccessFile, int i, mdq0 mdq0Var, VideoUploadTaskNew.f fVar) throws IOException, UploadUrlExpiredException {
        tdq0 tdq0Var = new tdq0(uri, randomAccessFile, UploadMode.FIXED_FILE, new tdq0.b(2097152, i), mdq0Var, fVar, new cdi());
        try {
            udq0 udq0Var = tdq0Var.n;
            udq0Var.getClass();
            Selector open = Selector.open();
            try {
                udq0Var.b = open;
                udq0Var.f();
                try {
                    udq0Var.c(open);
                    udq0Var.b = null;
                    s3q0 s3q0Var = s3q0.a;
                    open.close();
                    tdq0Var.b();
                    scq0 scq0Var = tdq0Var.i;
                    b9r b9rVar = scq0Var.a;
                    return b9rVar.b && b9rVar.a == scq0Var.b();
                } catch (Throwable th) {
                    udq0Var.b = null;
                    throw th;
                }
            } finally {
            }
        } catch (Throwable th2) {
            tdq0Var.b();
            throw th2;
        }
    }
}
