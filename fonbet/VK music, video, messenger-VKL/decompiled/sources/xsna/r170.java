package xsna;

import androidx.compose.runtime.internal.AtomicInt;
import xsna.gu5;

/* compiled from: NextFrameEndCallbackQueue.kt */
/* loaded from: classes11.dex */
public final class r170 {
    public final AtomicInt a = new AtomicInt(0);
    public final gu5<a> b = new gu5<>();
    public final com.vk.movika.tools.controls.seekbar.g c;

    public r170(q010 q010Var) {
        this.c = new com.vk.movika.tools.controls.seekbar.g(14, this, q010Var);
    }

    /* compiled from: NextFrameEndCallbackQueue.kt */
    public static final class a extends gu5.a {
        public m5z a;

        public a() {
            throw null;
        }

        @Override // xsna.gu5.a
        public final void a() {
            this.a = null;
        }

        @Override // xsna.gu5.a
        public final void b(Throwable th) {
            throw th;
        }
    }
}
