package defpackage;

import com.ybsdk.widgets.common.YbButtonView;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class dma0 {
    public final YbButtonView.a a;
    public final tbg0 b;

    public dma0(YbButtonView.a aVar, tbg0 tbg0Var) {
        this.a = aVar;
        this.b = tbg0Var;
    }

    public final YbButtonView.a a() {
        return this.a;
    }

    public final tbg0 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dma0)) {
            return false;
        }
        dma0 dma0Var = (dma0) obj;
        return this.a.equals(dma0Var.a) && this.b.equals(dma0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PaymentWithoutExtraActionsViewState(buttonState=" + this.a + ", innerViewState=" + this.b + Extension.C_BRAKE;
    }
}
