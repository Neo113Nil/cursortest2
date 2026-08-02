package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: AudioMsgInfo.kt */
/* loaded from: classes2.dex */
public final class hr4 {
    public int a;
    public boolean b;
    public boolean c;
    public float d;

    public hr4() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hr4)) {
            return false;
        }
        hr4 hr4Var = (hr4) obj;
        return this.a == hr4Var.a && this.b == hr4Var.b && this.c == hr4Var.c && Float.compare(this.d, hr4Var.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + qoy.b(qoy.b(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioMsgInfo(localId=");
        sb.append(this.a);
        sb.append(", isLoading=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        sb.append(this.c);
        sb.append(", playProgress=");
        return xq.c(')', this.d, sb);
    }

    public /* synthetic */ hr4(int i) {
        this(0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false);
    }

    public hr4(int i, float f, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = f;
    }
}
