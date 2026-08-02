package xsna;

import java.util.ArrayList;

/* compiled from: ClipsGridBlockPatch.kt */
/* loaded from: classes17.dex */
public final class tbe implements com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c {
    public final String b;
    public final ArrayList c;
    public final yae d;
    public final tlo0 e;

    public tbe(String str, ArrayList arrayList, yae yaeVar, tlo0 tlo0Var) {
        this.b = str;
        this.c = arrayList;
        this.d = yaeVar;
        this.e = tlo0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbe)) {
            return false;
        }
        tbe tbeVar = (tbe) obj;
        return epx.f(this.b, tbeVar.b) && this.c.equals(tbeVar.c) && epx.f(this.d, tbeVar.d) && epx.f(this.e, tbeVar.e);
    }

    public final int hashCode() {
        int a = qr.a(this.c, this.b.hashCode() * 31, 31);
        yae yaeVar = this.d;
        int hashCode = (a + (yaeVar == null ? 0 : Integer.hashCode(yaeVar.a.a))) * 31;
        tlo0 tlo0Var = this.e;
        return hashCode + (tlo0Var != null ? tlo0Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Full(id=");
        sb.append(this.b);
        sb.append(", clipItems=");
        sb.append(this.c);
        sb.append(", bottomButton=");
        sb.append(this.d);
        sb.append(", accessibilityDescription=");
        return bt.a(sb, this.e, ')');
    }
}
