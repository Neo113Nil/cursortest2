package xsna;

import com.vk.log.L;
import java.util.Arrays;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: KnetLogger.kt */
/* loaded from: classes.dex */
public final class fky implements rjv {
    public final boolean a;

    /* compiled from: KnetLogger.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, String> {
        public a(fky fkyVar) {
            super(1, fkyVar, fky.class, "stripSecureInfo", "stripSecureInfo(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // xsna.izs
        public final String invoke(String str) {
            ((fky) this.receiver).getClass();
            return p2i0.c.a(str);
        }
    }

    /* compiled from: KnetLogger.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<String, String> {
        public b(fky fkyVar) {
            super(1, fkyVar, fky.class, "stripSecureInfo", "stripSecureInfo(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // xsna.izs
        public final String invoke(String str) {
            ((fky) this.receiver).getClass();
            return p2i0.c.a(str);
        }
    }

    /* compiled from: KnetLogger.kt */
    /* loaded from: classes2.dex */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<String, String> {
        public c(fky fkyVar) {
            super(1, fkyVar, fky.class, "stripSecureInfo", "stripSecureInfo(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // xsna.izs
        public final String invoke(String str) {
            ((fky) this.receiver).getClass();
            return p2i0.c.a(str);
        }
    }

    public fky(boolean z) {
        this.a = z;
    }

    @Override // xsna.rjv
    public final void a(Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        L.a.t(L.LogType.v, Arrays.copyOf(copyOf, copyOf.length), new c(this));
    }

    @Override // xsna.rjv
    public final void b(Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        L.a.t(L.LogType.e, Arrays.copyOf(copyOf, copyOf.length), new b(this));
    }

    @Override // xsna.rjv
    public final void c(Object... objArr) {
        if (this.a) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            L.a.t(L.LogType.d, Arrays.copyOf(copyOf, copyOf.length), new a(this));
        }
    }
}
