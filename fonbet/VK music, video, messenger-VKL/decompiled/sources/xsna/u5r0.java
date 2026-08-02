package xsna;

import com.vk.uxpolls.api.models.UxPollsAnswer;
import com.vk.uxpolls.domain.exception.ParamsAreRequiredException;
import com.vk.uxpolls.domain.exception.SendAnswerError;
import java.util.List;

/* compiled from: UxPollsSendAnswerUseCase.kt */
/* loaded from: classes6.dex */
public final class u5r0 extends pc6<a, Boolean> {
    public final n5r0 a;

    /* compiled from: UxPollsSendAnswerUseCase.kt */
    public static final class a {
        public final blq0 a;
        public final int b;
        public final String c;
        public final List<UxPollsAnswer> d;

        public a(blq0 blq0Var, int i, String str, List<UxPollsAnswer> list) {
            this.a = blq0Var;
            this.b = i;
            this.c = str;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + urd0.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Params(userData=");
            sb.append(this.a);
            sb.append(", pollId=");
            sb.append(this.b);
            sb.append(", trigger=");
            sb.append(this.c);
            sb.append(", answers=");
            return ms9.a(')', sb, this.d);
        }
    }

    public u5r0(n5r0 n5r0Var) {
        this.a = n5r0Var;
    }

    @Override // xsna.pc6
    public final Void a(a aVar, Throwable th) {
        a aVar2 = aVar;
        if (th instanceof ParamsAreRequiredException) {
            throw th;
        }
        StringBuilder sb = new StringBuilder("Unable to send answer for poll: ");
        sb.append(aVar2 != null ? Integer.valueOf(aVar2.b) : null);
        throw new SendAnswerError(sb.toString());
    }

    @Override // xsna.pc6
    public final Object c(a aVar, spj<? super Boolean> spjVar) {
        a aVar2 = aVar;
        if (aVar2 == null) {
            throw new ParamsAreRequiredException("Params should be passed");
        }
        return this.a.f(aVar2.a, aVar2.b, aVar2.c, aVar2.d);
    }
}
