package xsna;

import android.content.ContentResolver;
import java.util.concurrent.Executor;

/* compiled from: VkLocalVideoThumbnailProducer.kt */
/* loaded from: classes2.dex */
public final class s2v0 extends iwz {
    public final Executor c;
    public final ContentResolver d;

    /* compiled from: VkLocalVideoThumbnailProducer.kt */
    public static final class a extends uk6 {
        public final /* synthetic */ r2v0 a;

        public a(r2v0 r2v0Var) {
            this.a = r2v0Var;
        }

        @Override // xsna.vhd0
        public final void c() {
            this.a.a();
        }
    }

    public s2v0(Executor executor, ContentResolver contentResolver) {
        super(executor, contentResolver);
        this.c = executor;
        this.d = contentResolver;
    }

    @Override // xsna.iwz, xsna.thd0
    public final void b(l7j<uvf<svf>> l7jVar, uhd0 uhd0Var) {
        uhd0Var.s("local", "video");
        r2v0 r2v0Var = new r2v0(l7jVar, uhd0Var.q(), uhd0Var, this, uhd0Var.r());
        uhd0Var.p(new a(r2v0Var));
        this.c.execute(r2v0Var);
    }
}
