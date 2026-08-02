package xsna;

import kotlin.jvm.internal.Ref$BooleanRef;

/* compiled from: DialogsListInfoBarHideCmd.kt */
/* loaded from: classes2.dex */
public final class vsm extends le6<Boolean> {
    public final String b;
    public final String c;

    public vsm(String str, String str2) {
        this.b = str;
        this.c = str2;
    }

    @Override // xsna.le6
    public final Boolean e(w2w w2wVar) {
        String str = this.b;
        int hashCode = str.hashCode();
        boolean z = true;
        if (hashCode == -1051177964 ? str.equals("dialogs_list_info_bar_sync_contacts_disabled") : hashCode == 543775731 ? str.equals("dialogs_list_info_bar_msg_push_disabled") : hashCode == 722597741 && str.equals("dialogs_list_info_bar_connect_edu_chats")) {
            avz.g(w2wVar.f1(), this.b, w2wVar);
            if (epx.f(this.c, "action")) {
                avz.f(w2wVar, this.b);
            }
            w2wVar.S0().B(this, true);
        } else {
            String str2 = this.b;
            Ref$BooleanRef ref$BooleanRef = new Ref$BooleanRef();
            w2wVar.I0().u(new g84(11, str2, ref$BooleanRef));
            boolean z2 = ref$BooleanRef.element;
            if (z2) {
                w2wVar.S0().B(this, true);
                x6x O0 = w2wVar.O0();
                wsm wsmVar = new wsm(this.b, this.c);
                x6x O02 = w2wVar.O0();
                mla mlaVar = this.a;
                if (mlaVar == null) {
                    mlaVar = null;
                }
                O0.j(wsmVar, O02.h("", mlaVar.b()));
            }
            z = z2;
        }
        return Boolean.valueOf(z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vsm)) {
            return false;
        }
        vsm vsmVar = (vsm) obj;
        return epx.f(this.b, vsmVar.b) && epx.f(this.c, vsmVar.c);
    }

    @Override // xsna.le6, xsna.e1w
    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // xsna.e1w
    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsListInfoBarHideCmd(barName=");
        sb.append(this.b);
        sb.append(", source=");
        return ho8.a(sb, this.c, ')');
    }
}
