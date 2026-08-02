package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* compiled from: pagerStateInternal.kt */
/* loaded from: classes17.dex */
public final class pc90 {
    public static final fh9 a = q6x.C(new nc90(0), new n21(6));

    /* compiled from: pagerStateInternal.kt */
    public static final class a extends mc90 {
        public final /* synthetic */ List<Integer> G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List<Integer> list, int i) {
            super(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i, 0);
            this.G = list;
        }

        @Override // xsna.mc90
        public final int o() {
            return ((Number) j5g.i0(this.G)).intValue();
        }
    }
}
