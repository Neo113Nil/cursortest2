package xsna;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.hvw0;

/* compiled from: VoipPermissionsProvider.kt */
/* loaded from: classes7.dex */
public final class ivw0 {
    public final io.reactivex.rxjava3.subjects.d<a> a = io.reactivex.rxjava3.subjects.d.O0(a.b.a);
    public final io.reactivex.rxjava3.subjects.f<hvw0> b;
    public final io.reactivex.rxjava3.disposables.c c;

    /* compiled from: VoipPermissionsProvider.kt */
    public interface a {

        /* compiled from: VoipPermissionsProvider.kt */
        /* renamed from: xsna.ivw0$a$a, reason: collision with other inner class name */
        public static final class C3084a implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3084a)) {
                    return false;
                }
                ((C3084a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                return Boolean.hashCode(true);
            }

            public final String toString() {
                return "HasPermissions(hasPrimaryPermissions=true)";
            }
        }

        /* compiled from: VoipPermissionsProvider.kt */
        public static final class b implements a {
            public static final b a = new b();
        }
    }

    /* compiled from: VoipPermissionsProvider.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<hvw0, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(hvw0 hvw0Var) {
            ivw0 ivw0Var = (ivw0) this.receiver;
            ivw0Var.getClass();
            io.reactivex.rxjava3.subjects.d<a> dVar = ivw0Var.a;
            if (!epx.f(hvw0Var, hvw0.a.a)) {
                throw new NoWhenBranchMatchedException();
            }
            a P0 = dVar.P0();
            if (P0 instanceof a.b) {
                dVar.onNext(new a.C3084a());
            } else {
                if (!(P0 instanceof a.C3084a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((a.C3084a) P0).getClass();
            }
            return s3q0.a;
        }
    }

    public ivw0() {
        io.reactivex.rxjava3.subjects.f<hvw0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        this.c = fVar.a0(asu0.a.d()).subscribe(new yhw0(new b(1, this, ivw0.class, "applyEvent", "applyEvent(Lcom/vk/voip/ui/permissions/VoipPermissionsEvent;)V", 0), 1));
    }
}
