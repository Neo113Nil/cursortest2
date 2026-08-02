package xsna;

import java.util.List;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class wd80 implements ogm {
    public final List<qtd0> b;
    public final boolean c;
    public final boolean d;

    /* JADX WARN: Multi-variable type inference failed */
    public wd80(List<? extends qtd0> list, boolean z, boolean z2) {
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    @Override // xsna.ogm
    public final int Za() {
        return 18;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd80)) {
            return false;
        }
        wd80 wd80Var = (wd80) obj;
        return epx.f(this.b, wd80Var.b) && this.c == wd80Var.c && this.d == wd80Var.d;
    }

    @Override // xsna.hfz
    public final /* bridge */ /* synthetic */ Number getItemId() {
        return 2147483638;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + qoy.b(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingItem(possibleFriends=");
        sb.append(this.b);
        sb.append(", canFindFriend=");
        sb.append(this.c);
        sb.append(", canCreateChat=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
