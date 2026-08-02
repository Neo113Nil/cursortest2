package xsna;

import com.vkontakte.android.R;

/* compiled from: CaptionRecyclerItem.kt */
/* loaded from: classes16.dex */
public final class xr9 extends v8l {
    public final int c;
    public final long d;

    public xr9(long j) {
        super(0);
        this.c = R.string.censored_sett_view;
        this.d = j;
    }

    @Override // xsna.zif0
    public final long a() {
        return this.d;
    }

    @Override // xsna.zif0
    public final int b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return xr9.class.equals(obj != null ? obj.getClass() : null) && this.c == ((xr9) obj).c;
    }

    public final int hashCode() {
        return this.c;
    }
}
