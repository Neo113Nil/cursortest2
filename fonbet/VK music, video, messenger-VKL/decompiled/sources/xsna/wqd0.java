package xsna;

import com.vk.dto.common.Image;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: FilterItems.kt */
/* loaded from: classes18.dex */
public final class wqd0 {
    public final int a;
    public final int b;
    public final String c;
    public final Image d;
    public final ArrayList<wqd0> e;
    public final wqd0 f;

    public /* synthetic */ wqd0(int i, int i2, String str) {
        this(i, i2, str, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wqd0)) {
            return false;
        }
        wqd0 wqd0Var = (wqd0) obj;
        return this.a == wqd0Var.a && this.b == wqd0Var.b && epx.f(this.c, wqd0Var.c) && epx.f(this.d, wqd0Var.d) && epx.f(this.e, wqd0Var.e);
    }

    public final int hashCode() {
        int a = urd0.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        Image image = this.d;
        int hashCode = (a + (image == null ? 0 : image.hashCode())) * 31;
        ArrayList<wqd0> arrayList = this.e;
        return hashCode + (arrayList != null ? arrayList.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProductParamsDropdownItem(id=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", icon=");
        sb.append(this.d);
        sb.append(", children=");
        return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', sb, this.e);
    }

    public wqd0(int i, int i2, String str, Image image, ArrayList<wqd0> arrayList) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = image;
        this.e = arrayList;
        if (arrayList != null) {
            Iterator<T> it = arrayList.iterator();
            while (it.hasNext()) {
                ((wqd0) it.next()).f = this;
            }
        }
    }
}
