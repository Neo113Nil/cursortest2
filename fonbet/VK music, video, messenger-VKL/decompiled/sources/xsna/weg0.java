package xsna;

import com.vk.uxpolls.api.models.UxPollsGetResponse;
import com.vk.uxpolls.domain.exception.ParamsAreRequiredException;
import com.vk.uxpolls.domain.exception.RetrievePollsError;
import java.util.List;

/* compiled from: RetrievePollsByIdsUseCase.kt */
/* loaded from: classes6.dex */
public final class weg0 extends pc6<a, UxPollsGetResponse> {
    public final n5r0 a;

    /* compiled from: RetrievePollsByIdsUseCase.kt */
    public static final class a {
        public final blq0 a;
        public final List<Long> b;
        public final String c;
        public final String d;

        public a(String str, String str2, List list, blq0 blq0Var) {
            this.a = blq0Var;
            this.b = list;
            this.c = str;
            this.d = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(fw3.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(userData=");
            sb.append(this.a);
            sb.append(", ids=");
            sb.append(this.b);
            sb.append(", project=");
            sb.append(this.c);
            sb.append(", notifier=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public weg0(n5r0 n5r0Var) {
        this.a = n5r0Var;
    }

    @Override // xsna.pc6
    public final Void a(a aVar, Throwable th) {
        a aVar2 = aVar;
        if (th instanceof ParamsAreRequiredException) {
            throw th;
        }
        StringBuilder sb = new StringBuilder("Unable to retrieve polls by ids: ");
        sb.append(aVar2 != null ? aVar2.b : null);
        throw new RetrievePollsError(sb.toString());
    }

    @Override // xsna.pc6
    public final Object c(a aVar, spj<? super UxPollsGetResponse> spjVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            throw new ParamsAreRequiredException("Params should be passed");
        }
        return this.a.d(aVar2.b, new e4e0(aVar2.c, aVar2.d, aVar2.a));
    }
}
