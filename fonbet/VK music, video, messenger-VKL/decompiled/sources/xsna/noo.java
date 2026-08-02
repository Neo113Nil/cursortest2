package xsna;

import com.vkontakte.android.R;

/* compiled from: AutoPlayDelegateResources.kt */
/* loaded from: classes2.dex */
public final class noo {
    public final int a;
    public final int b;
    public final int c;

    public noo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof noo)) {
            return false;
        }
        noo nooVar = (noo) obj;
        return this.a == nooVar.a && this.b == nooVar.b && this.c == nooVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DurationViewResources(backgroundResource=");
        sb.append(this.a);
        sb.append(", liveBackgroundResource=");
        sb.append(this.b);
        sb.append(", liveUpcomingBackgroundResource=");
        return vu5.b(sb, this.c, ')');
    }

    public /* synthetic */ noo(int i) {
        this(R.drawable.bg_video_live, R.drawable.bg_video_live_spectators);
    }

    public noo(int i, int i2) {
        this.a = R.drawable.bg_video_duration_label_old;
        this.b = i;
        this.c = i2;
    }
}
