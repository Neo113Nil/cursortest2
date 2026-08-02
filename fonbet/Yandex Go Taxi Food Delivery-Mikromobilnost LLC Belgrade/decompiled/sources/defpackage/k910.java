package defpackage;

import com.ybsdk.feature.transfer.version2.internal.screens.me2me.confirm.domain.Me2MeResultPageEntity;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultState$WidgetState;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.Me2MeDebitResultState$WidgetSubState;
import com.ybsdk.feature.transfer.version2.internal.screens.me2me.result.domain.Me2MeDebitResultEntity$Status;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class k910 {
    public final Me2MeResultPageEntity a;
    public final Me2MeDebitResultEntity$Status b;
    public final g910 c;
    public final Me2MeDebitResultState$WidgetState d;
    public final Me2MeDebitResultState$WidgetSubState e;
    public final String f;
    public final String g;

    public /* synthetic */ k910(Me2MeResultPageEntity me2MeResultPageEntity, Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status, g910 g910Var, String str, int i) {
        this(me2MeResultPageEntity, me2MeDebitResultEntity$Status, (i & 4) != 0 ? null : g910Var, Me2MeDebitResultState$WidgetState.OFF, Me2MeDebitResultState$WidgetSubState.ENABLED, (i & 32) != 0 ? null : str, null);
    }

    public static k910 a(k910 k910Var, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState, Me2MeDebitResultState$WidgetSubState me2MeDebitResultState$WidgetSubState, String str, int i) {
        Me2MeResultPageEntity me2MeResultPageEntity = k910Var.a;
        Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status = k910Var.b;
        g910 g910Var = k910Var.c;
        if ((i & 8) != 0) {
            me2MeDebitResultState$WidgetState = k910Var.d;
        }
        Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState2 = me2MeDebitResultState$WidgetState;
        if ((i & 16) != 0) {
            me2MeDebitResultState$WidgetSubState = k910Var.e;
        }
        Me2MeDebitResultState$WidgetSubState me2MeDebitResultState$WidgetSubState2 = me2MeDebitResultState$WidgetSubState;
        String str2 = k910Var.f;
        if ((i & 64) != 0) {
            str = k910Var.g;
        }
        k910Var.getClass();
        return new k910(me2MeResultPageEntity, me2MeDebitResultEntity$Status, g910Var, me2MeDebitResultState$WidgetState2, me2MeDebitResultState$WidgetSubState2, str2, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k910)) {
            return false;
        }
        k910 k910Var = (k910) obj;
        return jl40.l(this.a, k910Var.a) && this.b == k910Var.b && jl40.l(this.c, k910Var.c) && this.d == k910Var.d && this.e == k910Var.e && jl40.l(this.f, k910Var.f) && jl40.l(this.g, k910Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        g910 g910Var = this.c;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (g910Var == null ? 0 : g910Var.hashCode())) * 31)) * 31)) * 31;
        String str = this.f;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Me2MeDebitResultState(pageEntity=");
        sb.append(this.a);
        sb.append(", status=");
        sb.append(this.b);
        sb.append(", widget=");
        sb.append(this.c);
        sb.append(", widgetState=");
        sb.append(this.d);
        sb.append(", widgetSubstate=");
        sb.append(this.e);
        sb.append(", supportUrl=");
        sb.append(this.f);
        sb.append(", operationId=");
        return oyr.t(sb, this.g, Extension.C_BRAKE);
    }

    public k910(Me2MeResultPageEntity me2MeResultPageEntity, Me2MeDebitResultEntity$Status me2MeDebitResultEntity$Status, g910 g910Var, Me2MeDebitResultState$WidgetState me2MeDebitResultState$WidgetState, Me2MeDebitResultState$WidgetSubState me2MeDebitResultState$WidgetSubState, String str, String str2) {
        this.a = me2MeResultPageEntity;
        this.b = me2MeDebitResultEntity$Status;
        this.c = g910Var;
        this.d = me2MeDebitResultState$WidgetState;
        this.e = me2MeDebitResultState$WidgetSubState;
        this.f = str;
        this.g = str2;
    }
}
