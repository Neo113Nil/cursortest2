package xsna;

import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.domain.exception.ParamsAreRequiredException;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* compiled from: CachePollsUseCase.kt */
/* loaded from: classes6.dex */
public final class dx8 extends mf6<a> {
    public final n5r0 a;

    /* compiled from: CachePollsUseCase.kt */
    public static final class a {
        public final List<UxPollsPoll> a;
        public final List<String> b;

        public a(List<UxPollsPoll> list, List<String> list2) {
            this.a = list;
            this.b = list2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(polls=");
            sb.append(this.a);
            sb.append(", triggers=");
            return ms9.a(')', sb, this.b);
        }
    }

    public dx8(n5r0 n5r0Var) {
        this.a = n5r0Var;
    }

    @Override // xsna.mf6
    public final Object a(a aVar, spj spjVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            throw new ParamsAreRequiredException("Polls list should be passed");
        }
        Object m = this.a.m(aVar2.a, aVar2.b, (lf6) spjVar);
        return m == CoroutineSingletons.COROUTINE_SUSPENDED ? m : s3q0.a;
    }
}
