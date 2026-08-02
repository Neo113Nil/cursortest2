package xsna;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;

/* compiled from: CaptureRequestOptions.java */
/* loaded from: classes11.dex */
public class fs9 implements androidx.camera.core.impl.q {
    public final Config s;

    /* compiled from: CaptureRequestOptions.java */
    public static final class a implements hbq<fs9> {
        public final androidx.camera.core.impl.n a = androidx.camera.core.impl.n.z();

        @Override // xsna.hbq
        @NonNull
        public final androidx.camera.core.impl.m d() {
            throw null;
        }
    }

    public fs9(@NonNull Config config) {
        this.s = config;
    }

    @Override // androidx.camera.core.impl.q
    @NonNull
    public final Config getConfig() {
        return this.s;
    }
}
