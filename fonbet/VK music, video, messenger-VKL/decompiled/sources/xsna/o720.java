package xsna;

import java.util.List;

/* compiled from: BottomActionPopupDelegate.kt */
/* loaded from: classes3.dex */
public final class o720 {
    public final int a;
    public final String b;
    public final List<sh00> c;
    public final Integer d;

    public o720(int i, String str, List<sh00> list, Integer num) {
        this.a = i;
        this.b = str;
        this.c = list;
        this.d = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o720)) {
            return false;
        }
        o720 o720Var = (o720) obj;
        return this.a == o720Var.a && epx.f(this.b, o720Var.b) && epx.f(this.c, o720Var.c) && epx.f(this.d, o720Var.d);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int a = fw3.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c);
        Integer num = this.d;
        return a + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MenuItemData(itemId=");
        sb.append(this.a);
        sb.append(", selectedTabName=");
        sb.append(this.b);
        sb.append(", managedGroupList=");
        sb.append(this.c);
        sb.append(", counter=");
        return uqi.b(sb, this.d, ')');
    }
}
