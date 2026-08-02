package xsna;

import android.content.ContentResolver;
import com.facebook.imagepipeline.request.ImageRequest;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Executor;

/* compiled from: QualifiedResourceFetchProducer.kt */
/* loaded from: classes12.dex */
public final class uoe0 extends luz {
    public final ContentResolver c;

    public uoe0(Executor executor, b320 b320Var, ContentResolver contentResolver) {
        super(executor, b320Var);
        this.c = contentResolver;
    }

    @Override // xsna.luz
    public final rip d(ImageRequest imageRequest) throws IOException {
        InputStream openInputStream = this.c.openInputStream(imageRequest.b);
        if (openInputStream != null) {
            return c(openInputStream, -1);
        }
        throw new IllegalStateException("ContentResolver returned null InputStream");
    }

    @Override // xsna.luz
    public final String e() {
        return "QualifiedResourceFetchProducer";
    }
}
