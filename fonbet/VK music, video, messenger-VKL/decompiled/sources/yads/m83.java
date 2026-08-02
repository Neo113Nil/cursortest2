package yads;

import android.os.Bundle;
import java.util.ArrayList;
import xsna.wga0;

/* loaded from: classes10.dex */
public final class m83 implements xq {
    public static final m83 e = new m83(new l83[0]);
    public static final wq f = new wga0(13);
    public final int b;
    public final tn2 c;
    public int d;

    public m83(l83... l83VarArr) {
        this.c = s51.b(l83VarArr);
        this.b = l83VarArr.length;
        a();
    }

    public final l83 a(int i) {
        return (l83) this.c.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m83.class == obj.getClass()) {
            m83 m83Var = (m83) obj;
            if (this.b == m83Var.b && this.c.equals(m83Var.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.d == 0) {
            this.d = this.c.hashCode();
        }
        return this.d;
    }

    public static m83 a(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(0, 36));
        return parcelableArrayList == null ? new m83(new l83[0]) : new m83((l83[]) yq.a(l83.g, parcelableArrayList).toArray(new l83[0]));
    }

    public final void a() {
        int i = 0;
        while (i < this.c.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.c.size(); i3++) {
                if (((l83) this.c.get(i)).equals(this.c.get(i3))) {
                    ji1.a("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }
}
