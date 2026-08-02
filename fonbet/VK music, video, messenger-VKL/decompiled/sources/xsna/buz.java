package xsna;

import com.vk.catalog2.common.dto.ui.UIBlockList;

/* compiled from: CatalogCommand.kt */
/* loaded from: classes16.dex */
public final class buz extends n3a {
    public final izs<UIBlockList, Boolean> a;
    public final wzs<UIBlockList, com.vk.lists.c, UIBlockList> b;
    public final boolean c;
    public final boolean d;

    public buz() {
        throw null;
    }

    public buz(int i, izs izsVar, wzs wzsVar) {
        boolean z = (i & 4) == 0;
        boolean z2 = (i & 8) == 0;
        this.a = izsVar;
        this.b = wzsVar;
        this.c = z;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof buz)) {
            return false;
        }
        buz buzVar = (buz) obj;
        return epx.f(this.a, buzVar.a) && epx.f(this.b, buzVar.b) && this.c == buzVar.c && this.d == buzVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LocalBlockUpdateEventCmd(shouldUpdate=");
        sb.append(this.a);
        sb.append(", updater=");
        sb.append(this.b);
        sb.append(", disableInEditMode=");
        sb.append(this.c);
        sb.append(", shouldRequestNecessaryBlocks=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
