package xsna;

import android.content.Context;
import com.vk.voip.api.id.CallId;
import com.vk.voip.call_effects.CallEffectsDependency;
import com.vk.voip.dto.type.StartCallType;

/* compiled from: VoipCoreDependencies.kt */
/* loaded from: classes7.dex */
public interface zmw0 {

    /* compiled from: VoipCoreDependencies.kt */
    public static final class a {
        public final dhw0 a;
        public final Throwable b;
        public final int c;
        public final String d;
        public final CallId e;
        public final StartCallType f;
        public final String g;
        public final izs<mlp, s3q0> h;

        /* JADX WARN: Multi-variable type inference failed */
        public a(dhw0 dhw0Var, Throwable th, int i, String str, CallId callId, StartCallType startCallType, String str2, izs<? super mlp, s3q0> izsVar) {
            this.a = dhw0Var;
            this.b = th;
            this.c = i;
            this.d = str;
            this.e = callId;
            this.f = startCallType;
            this.g = str2;
            this.h = izsVar;
        }
    }

    /* compiled from: VoipCoreDependencies.kt */
    /* loaded from: classes11.dex */
    public static final class b {
        public final boolean a;
        public final boolean b;
        public final boolean c;

        public b(boolean z, boolean z2, boolean z3) {
            this.a = z;
            this.b = z2;
            this.c = z3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b && this.c == bVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoState(isVideoEnabled=");
            sb.append(this.a);
            sb.append(", isScreenCaptureEnabled=");
            sb.append(this.b);
            sb.append(", isAnimojiEnabled=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    CallEffectsDependency a();

    String[] b();

    io.reactivex.rxjava3.internal.operators.single.y c(String str);

    boolean d();

    void e(a aVar);

    boolean f();

    irw0 g();

    Context getContext();

    h19 h();

    or2 i();

    String[] j();

    fq4 k();
}
