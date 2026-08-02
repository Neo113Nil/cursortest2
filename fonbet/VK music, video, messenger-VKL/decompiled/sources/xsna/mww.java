package xsna;

import com.vkontakte.android.R;

/* compiled from: InfoWithImageHolder.kt */
/* loaded from: classes18.dex */
public final class mww {
    public final int a;
    public final h6m0 b;

    public mww(int i, h6m0 h6m0Var) {
        this.a = i;
        this.b = h6m0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mww)) {
            return false;
        }
        mww mwwVar = (mww) obj;
        return this.a == mwwVar.a && this.b.equals(mwwVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + shy.a(R.drawable.vk_icon_report_outline_20, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return "InfoWithImageData(title=" + this.a + ", imageRes=2131238971, listener=" + this.b + ')';
    }
}
