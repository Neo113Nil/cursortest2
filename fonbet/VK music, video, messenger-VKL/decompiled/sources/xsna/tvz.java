package xsna;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalResourceFetchProducer.kt */
/* loaded from: classes12.dex */
public final class tvz extends luz {
    public final Resources c;

    /* compiled from: LocalResourceFetchProducer.kt */
    public static final class a {
    }

    public tvz(Executor executor, b320 b320Var, Resources resources) {
        super(executor, b320Var);
        this.c = resources;
    }

    @Override // xsna.luz
    public final rip d(ImageRequest imageRequest) throws IOException {
        int i;
        String path;
        String path2 = imageRequest.b.getPath();
        if (path2 == null) {
            throw new IllegalStateException("Required value was null.");
        }
        int parseInt = Integer.parseInt(path2.substring(1));
        Resources resources = this.c;
        InputStream openRawResource = resources.openRawResource(parseInt);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            path = imageRequest.b.getPath();
        } catch (Resources.NotFoundException unused) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused2) {
                }
            }
            i = -1;
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            throw th;
        }
        if (path == null) {
            throw new IllegalStateException("Required value was null.");
        }
        AssetFileDescriptor openRawResourceFd = resources.openRawResourceFd(Integer.parseInt(path.substring(1)));
        i = (int) openRawResourceFd.getLength();
        try {
            openRawResourceFd.close();
        } catch (IOException unused4) {
        }
        return c(openRawResource, i);
    }

    @Override // xsna.luz
    public final String e() {
        return "LocalResourceFetchProducer";
    }
}
