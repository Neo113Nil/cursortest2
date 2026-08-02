package xsna;

import com.vk.dto.common.Image;
import com.vk.dto.common.actions.Action;
import java.util.ArrayList;

/* compiled from: EasterEgg.kt */
/* loaded from: classes18.dex */
public final class muo {
    public final int a;
    public final int b;
    public final int c;
    public final Action d;
    public final Image e;
    public final nuo f;
    public final nuo g;
    public final ArrayList h;
    public final int i;
    public final int j;

    public muo(int i, int i2, int i3, Action action, Image image, nuo nuoVar, nuo nuoVar2, ArrayList arrayList, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = action;
        this.e = image;
        this.f = nuoVar;
        this.g = nuoVar2;
        this.h = arrayList;
        this.i = i4;
        this.j = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof muo)) {
            return false;
        }
        muo muoVar = (muo) obj;
        return this.a == muoVar.a && this.b == muoVar.b && this.c == muoVar.c && epx.f(this.d, muoVar.d) && epx.f(this.e, muoVar.e) && epx.f(this.f, muoVar.f) && epx.f(this.g, muoVar.g) && this.h.equals(muoVar.h) && this.i == muoVar.i && this.j == muoVar.j;
    }

    public final int hashCode() {
        int a = shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        Action action = this.d;
        int hashCode = (a + (action == null ? 0 : action.hashCode())) * 31;
        Image image = this.e;
        int hashCode2 = (hashCode + (image == null ? 0 : image.hashCode())) * 31;
        nuo nuoVar = this.f;
        int hashCode3 = (hashCode2 + (nuoVar == null ? 0 : nuoVar.hashCode())) * 31;
        nuo nuoVar2 = this.g;
        return Integer.hashCode(this.j) + shy.a(this.i, qr.a(this.h, (hashCode3 + (nuoVar2 != null ? nuoVar2.hashCode() : 0)) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EasterEgg(id=");
        sb.append(this.a);
        sb.append(", eventId=");
        sb.append(this.b);
        sb.append(", appId=");
        sb.append(this.c);
        sb.append(", action=");
        sb.append(this.d);
        sb.append(", images=");
        sb.append(this.e);
        sb.append(", animation=");
        sb.append(this.f);
        sb.append(", clickAnimation=");
        sb.append(this.g);
        sb.append(", positions=");
        sb.append(this.h);
        sb.append(", maxWidth=");
        sb.append(this.i);
        sb.append(", maxHeight=");
        return vu5.b(sb, this.j, ')');
    }
}
