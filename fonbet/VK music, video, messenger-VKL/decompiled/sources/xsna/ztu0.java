package xsna;

import java.util.ArrayList;
import xsna.tlo0;

/* compiled from: VkFeedCarouselCard.kt */
/* loaded from: classes18.dex */
public final class ztu0 {
    public final tlo0.h a;
    public final x7g b;
    public final eko c;
    public final ArrayList d;

    public ztu0() {
        throw null;
    }

    public ztu0(tlo0.h hVar, x7g x7gVar, eko ekoVar, ArrayList arrayList) {
        this.a = hVar;
        this.b = x7gVar;
        this.c = ekoVar;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ztu0)) {
            return false;
        }
        ztu0 ztu0Var = (ztu0) obj;
        return epx.f(this.a, ztu0Var.a) && epx.f(this.b, ztu0Var.b) && epx.f(this.c, ztu0Var.c) && epx.f(this.d, ztu0Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        x7g x7gVar = this.b;
        int hashCode2 = (hashCode + (x7gVar == null ? 0 : Integer.hashCode(x7gVar.a))) * 31;
        eko ekoVar = this.c;
        int hashCode3 = (hashCode2 + (ekoVar == null ? 0 : ekoVar.a.hashCode())) * 961;
        ArrayList arrayList = this.d;
        return hashCode3 + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Badge(title=");
        sb.append(this.a);
        sb.append(", titleTint=");
        sb.append(this.b);
        sb.append(", background=");
        sb.append(this.c);
        sb.append(", photosSize=null, photos=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.d);
    }
}
