package xsna;

import com.vk.im.engine.exceptions.ImEngineUnrecoverableException;

/* compiled from: ImEngineState.kt */
/* loaded from: classes.dex */
public abstract class q2w {

    /* compiled from: ImEngineState.kt */
    /* loaded from: classes2.dex */
    public static final class a extends q2w {
        public final ImEngineUnrecoverableException a;
        public final boolean b;

        public a(ImEngineUnrecoverableException imEngineUnrecoverableException, boolean z) {
            this.a = imEngineUnrecoverableException;
            this.b = z;
        }
    }

    /* compiled from: ImEngineState.kt */
    public static final class b extends q2w {
        public static final b a = new b();
    }

    /* compiled from: ImEngineState.kt */
    public static final class c extends q2w {
        public static final c a = new c();
    }

    /* compiled from: ImEngineState.kt */
    public static final class d extends q2w {
        public static final d a = new d();
    }

    /* compiled from: ImEngineState.kt */
    public static final class e extends q2w {
        public static final e a = new e();
    }
}
