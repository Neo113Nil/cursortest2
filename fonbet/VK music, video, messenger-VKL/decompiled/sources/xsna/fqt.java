package xsna;

import com.vk.uxpolls.api.models.UxPollsPoll;
import com.vk.uxpolls.domain.exception.ParamsAreRequiredException;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: GetCachedPollsUseCase.kt */
/* loaded from: classes6.dex */
public final class fqt extends pc6<a, List<? extends UxPollsPoll>> {
    public final n5r0 a;

    /* compiled from: GetCachedPollsUseCase.kt */
    public static abstract class a {

        /* compiled from: GetCachedPollsUseCase.kt */
        /* renamed from: xsna.fqt$a$a, reason: collision with other inner class name */
        public static final class C2889a extends a {
            public final List<Long> a;

            public C2889a(List<Long> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C2889a) && epx.f(this.a, ((C2889a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("IdParams(ids="), this.a);
            }
        }

        /* compiled from: GetCachedPollsUseCase.kt */
        public static final class b extends a {
            public final List<String> a;

            public b(List<String> list) {
                this.a = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("TriggerParams(triggers="), this.a);
            }
        }
    }

    public fqt(n5r0 n5r0Var) {
        this.a = n5r0Var;
    }

    @Override // xsna.pc6
    public final Object c(a aVar, spj<? super List<? extends UxPollsPoll>> spjVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            throw new ParamsAreRequiredException("Params should be passed");
        }
        boolean z = aVar2 instanceof a.b;
        n5r0 n5r0Var = this.a;
        if (z) {
            return n5r0Var.e(((a.b) aVar2).a, (ContinuationImpl) spjVar);
        }
        if (aVar2 instanceof a.C2889a) {
            return n5r0Var.c(((a.C2889a) aVar2).a, (ContinuationImpl) spjVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
