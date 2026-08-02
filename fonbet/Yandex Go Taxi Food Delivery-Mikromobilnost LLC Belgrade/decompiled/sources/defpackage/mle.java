package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.models.data.experiment.SkipAlertCondition;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lmle;", "", "Companion", "kle", "lle", "delivery_form"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class mle {
    public static final lle Companion = new lle();
    public static final i3y[] c = {null, a.b(LazyThreadSafetyMode.PUBLICATION, new bgc(21))};
    public final String a;
    public final SkipAlertCondition b;

    public /* synthetic */ mle(int i, String str, SkipAlertCondition skipAlertCondition) {
        this.a = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.b = SkipAlertCondition.NEVER;
        } else {
            this.b = skipAlertCondition;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mle)) {
            return false;
        }
        mle mleVar = (mle) obj;
        return jl40.l(this.a, mleVar.a) && this.b == mleVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContinueWithRequirementAlertCondition(tariff=" + this.a + ", skipAlertCondition=" + this.b + Extension.C_BRAKE;
    }

    public mle() {
        SkipAlertCondition skipAlertCondition = SkipAlertCondition.NEVER;
        this.a = "";
        this.b = skipAlertCondition;
    }
}
