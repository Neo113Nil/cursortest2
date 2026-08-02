package xsna;

import com.vk.im.engine.models.InfoBar;
import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: DialogsListInfoBarCallbackCmd.kt */
/* loaded from: classes2.dex */
public final class rsm extends le6<Boolean> {
    public final String b;
    public final String c;
    public final boolean d;

    public rsm(String str, String str2, boolean z) {
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        InfoBar infoBar = (InfoBar) bz2.c(new ssm(w2wVar.getContext(), this.b, this.c, this.d), "DialogsListInfoBarCallbackApiCmd");
        Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
        w2wVar.I0().u(new ng3(15, infoBar, ref$BooleanRef));
        if (ref$BooleanRef.element) {
            w2wVar.S0().B(this, true);
        }
        return Boolean.TRUE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rsm)) {
            return false;
        }
        rsm rsmVar = (rsm) obj;
        return epx.f(this.b, rsmVar.b) && epx.f(this.c, rsmVar.c) && this.d == rsmVar.d;
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return Boolean.hashCode(this.d) + urd0.a(this.b.hashCode() * 31, 31, this.c);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsListInfoBarCallbackCmd(barName=");
        sb.append(this.b);
        sb.append(", callbackData=");
        sb.append(this.c);
        sb.append(", isAwaitNetwork=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
