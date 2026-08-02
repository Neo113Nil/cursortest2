package xsna;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: LocalAssetFetchProducer.kt */
/* loaded from: classes12.dex */
public final class ytz extends luz {
    public final AssetManager c;

    /* compiled from: LocalAssetFetchProducer.kt */
    public static final class a {
    }

    public ytz(Executor executor, b320 b320Var, AssetManager assetManager) {
        super(executor, b320Var);
        this.c = assetManager;
    }

    @Override // xsna.luz
    public final rip d(ImageRequest imageRequest) throws IOException {
        int i;
        String substring = imageRequest.b.getPath().substring(1);
        AssetManager assetManager = this.c;
        InputStream open = assetManager.open(substring, 2);
        AssetFileDescriptor assetFileDescriptor = null;
        try {
            assetFileDescriptor = assetManager.openFd(imageRequest.b.getPath().substring(1));
            i = (int) assetFileDescriptor.getLength();
            try {
                assetFileDescriptor.close();
            } catch (IOException unused) {
            }
        } catch (IOException unused2) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused3) {
                }
            }
            i = -1;
        } catch (Throwable th) {
            if (assetFileDescriptor != null) {
                try {
                    assetFileDescriptor.close();
                } catch (IOException unused4) {
                }
            }
            throw th;
        }
        return c(open, i);
    }

    @Override // xsna.luz
    public final String e() {
        return "LocalAssetFetchProducer";
    }
}
