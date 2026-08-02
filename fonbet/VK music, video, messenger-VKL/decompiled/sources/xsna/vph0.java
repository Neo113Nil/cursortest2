package xsna;

import com.vkontakte.android.R;

/* compiled from: SearchDatabaseTextsConfig.kt */
/* loaded from: classes5.dex */
public final class vph0 {
    public final int a;
    public final int b;

    public /* synthetic */ vph0(int i) {
        this(i, R.string.search_params_search_hint);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vph0)) {
            return false;
        }
        vph0 vph0Var = (vph0) obj;
        return this.a == vph0Var.a && this.b == vph0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchDatabaseTextsConfig(titleResId=");
        sb.append(this.a);
        sb.append(", searchHintResId=");
        return vu5.b(sb, this.b, ')');
    }

    public vph0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
