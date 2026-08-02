package xsna;

import com.facebook.imagepipeline.request.ImageRequest;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* compiled from: LocalFileFetchProducer.kt */
/* loaded from: classes12.dex */
public final class muz extends luz {
    public muz(Executor executor, b320 b320Var) {
        super(executor, b320Var);
    }

    @Override // xsna.luz
    public final rip d(ImageRequest imageRequest) throws IOException {
        return c(new FileInputStream(imageRequest.k().toString()), (int) imageRequest.k().length());
    }

    @Override // xsna.luz
    public final String e() {
        return "LocalFileFetchProducer";
    }
}
