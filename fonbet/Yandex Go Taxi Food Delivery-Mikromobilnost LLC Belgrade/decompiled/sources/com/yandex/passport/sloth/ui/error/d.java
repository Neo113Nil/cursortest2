package com.yandex.passport.sloth.ui.error;

import com.yandex.passport.sloth.ui.string.SlothString;
import defpackage.jl40;
import defpackage.unr0;

/* loaded from: classes2.dex */
public final class d {
    public static final d f = new d(true, null, null, null, false);
    public final boolean a;
    public final SlothString b;
    public final ButtonMode c;
    public final c d;
    public final boolean e;

    public d(boolean z, SlothString slothString, ButtonMode buttonMode, c cVar, boolean z2) {
        this.a = z;
        this.b = slothString;
        this.c = buttonMode;
        this.d = cVar;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a == dVar.a && this.b == dVar.b && this.c == dVar.c && jl40.l(this.d, dVar.d) && this.e == dVar.e;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        SlothString slothString = this.b;
        int hashCode2 = (hashCode + (slothString == null ? 0 : slothString.hashCode())) * 31;
        ButtonMode buttonMode = this.c;
        int hashCode3 = (hashCode2 + (buttonMode == null ? 0 : buttonMode.hashCode())) * 31;
        c cVar = this.d;
        return Boolean.hashCode(this.e) + ((hashCode3 + (cVar != null ? cVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ZeroPageState(isShowProgress=");
        sb.append(this.a);
        sb.append(", errorText=");
        sb.append(this.b);
        sb.append(", buttonMode=");
        sb.append(this.c);
        sb.append(", buttonAction=");
        sb.append(this.d);
        sb.append(", isShowErrorImage=");
        return unr0.u(sb, this.e, ')');
    }
}
