package xsna;

import com.vk.superapp.advertisement.api.dto.BannerAdUiData;
import com.vk.superapp.bridges.advertisement.BannerParamsSnapshot;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.jn00;
import xsna.y31;

/* compiled from: BaseStickyBannerAdRequest.kt */
/* loaded from: classes6.dex */
public abstract class mo6 extends e41 implements eel0 {
    public final y31.c e;
    public final b f;
    public a g;
    public ydl0 h;
    public int i;
    public final bpn0 j;

    /* compiled from: BaseStickyBannerAdRequest.kt */
    public static final class a {
        public final ydl0 a;
        public final String b;
        public final int c;
        public final int d;
        public final BannerAdUiData e;

        public a(ydl0 ydl0Var, String str, int i, int i2, BannerAdUiData bannerAdUiData) {
            this.a = ydl0Var;
            this.b = str;
            this.c = i;
            this.d = i2;
            this.e = bannerAdUiData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c && this.d == aVar.d && epx.f(this.e, aVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + shy.a(this.d, shy.a(this.c, urd0.a(this.a.hashCode() * 31, 31, this.b), 31), 31);
        }

        public final String toString() {
            return "BannerAdInfo(banner=" + this.a + ", adRequestId=" + this.b + ", viewWidthDp=" + this.c + ", viewHeightDp=" + this.d + ", bannerAdUiData=" + this.e + ')';
        }
    }

    /* compiled from: BaseStickyBannerAdRequest.kt */
    public static final class b {
        public final del0 a;
        public final mel0 b;

        public b(del0 del0Var, mel0 mel0Var) {
            this.a = del0Var;
            this.b = mel0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "StickyBannerFactories(stickyBannerAdFactory=" + this.a + ", viewFactoryProvider=" + this.b + ')';
        }
    }

    public mo6(y31.c cVar, b bVar, vh0 vh0Var, r31 r31Var, qe0 qe0Var) {
        super(r31Var, vh0Var, qe0Var);
        this.e = cVar;
        this.f = bVar;
        this.j = new bpn0(new d2(4));
    }

    public static void t(gel0 gel0Var, String str) {
        x19.O(xgx0.a, "Slot compatibility error: id=" + gel0Var.a + ", message=" + str);
    }

    public final BannerParamsSnapshot s(a aVar) {
        BannerParamsSnapshot.BannerLocation bannerLocation;
        BannerParamsSnapshot.BannerAlign bannerAlign;
        BannerParamsSnapshot.LayoutType layoutType;
        BannerParamsSnapshot.HeightType heightType;
        BannerParamsSnapshot.Orientation orientation;
        if (aVar == null) {
            return new BannerParamsSnapshot(0, 0, false, null, null, null, null, null);
        }
        BannerAdUiData bannerAdUiData = aVar.e;
        y31.c cVar = this.e;
        BannerAdUiData.LayoutType layoutType2 = cVar.c() ? bannerAdUiData.b : bannerAdUiData.a;
        BannerAdUiData.BannerAlign bannerAlign2 = bannerAdUiData.d;
        if (bannerAlign2 == BannerAdUiData.BannerAlign.UNSPECIFIED) {
            BannerAdUiData.BannerAlign.Companion.getClass();
            bannerAlign2 = BannerAdUiData.BannerAlign.CENTER;
        }
        BannerAdUiData.HeightType heightType2 = bannerAdUiData.e;
        if (heightType2 == BannerAdUiData.HeightType.UNSPECIFIED) {
            heightType2 = BannerAdUiData.HeightType.REGULAR;
        }
        BannerAdUiData.Orientation orientation2 = bannerAdUiData.f;
        BannerParamsSnapshot.Orientation orientation3 = null;
        if (orientation2 == BannerAdUiData.Orientation.UNSPECIFIED) {
            orientation2 = null;
        }
        int i = aVar.c;
        int i2 = aVar.d;
        boolean z = !cVar.c();
        int i3 = jn00.a.$EnumSwitchMapping$2[bannerAdUiData.c.ordinal()];
        if (i3 == 1) {
            bannerLocation = BannerParamsSnapshot.BannerLocation.TOP;
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            bannerLocation = BannerParamsSnapshot.BannerLocation.BOTTOM;
        }
        BannerParamsSnapshot.BannerLocation bannerLocation2 = bannerLocation;
        int i4 = jn00.a.$EnumSwitchMapping$5[bannerAlign2.ordinal()];
        if (i4 == 1) {
            bannerAlign = BannerParamsSnapshot.BannerAlign.LEFT;
        } else if (i4 == 2) {
            bannerAlign = BannerParamsSnapshot.BannerAlign.RIGHT;
        } else if (i4 == 3) {
            bannerAlign = BannerParamsSnapshot.BannerAlign.CENTER;
        } else {
            if (i4 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            BannerParamsSnapshot.BannerAlign.Companion.getClass();
            bannerAlign = BannerParamsSnapshot.BannerAlign.CENTER;
        }
        BannerParamsSnapshot.BannerAlign bannerAlign3 = bannerAlign;
        int i5 = jn00.a.$EnumSwitchMapping$1[layoutType2.ordinal()];
        if (i5 == 1) {
            layoutType = BannerParamsSnapshot.LayoutType.RESIZE;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            layoutType = BannerParamsSnapshot.LayoutType.OVERLAY;
        }
        BannerParamsSnapshot.LayoutType layoutType3 = layoutType;
        int i6 = jn00.a.$EnumSwitchMapping$3[heightType2.ordinal()];
        if (i6 == 1) {
            heightType = BannerParamsSnapshot.HeightType.REGULAR;
        } else if (i6 == 2) {
            heightType = BannerParamsSnapshot.HeightType.COMPACT;
        } else {
            if (i6 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            BannerParamsSnapshot.HeightType.Companion.getClass();
            heightType = BannerParamsSnapshot.HeightType.REGULAR;
        }
        BannerParamsSnapshot.HeightType heightType3 = heightType;
        if (orientation2 != null) {
            int i7 = jn00.a.$EnumSwitchMapping$4[orientation2.ordinal()];
            if (i7 == 1) {
                orientation = BannerParamsSnapshot.Orientation.VERTICAL;
            } else if (i7 == 2) {
                orientation = BannerParamsSnapshot.Orientation.HORIZONTAL;
            } else {
                if (i7 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                BannerParamsSnapshot.Orientation.Companion.getClass();
                orientation = BannerParamsSnapshot.Orientation.HORIZONTAL;
            }
            orientation3 = orientation;
        }
        return new BannerParamsSnapshot(i, i2, z, layoutType3, bannerLocation2, bannerAlign3, heightType3, orientation3);
    }

    public final void v(ydl0 ydl0Var, String str, int i, int i2, BannerAdUiData bannerAdUiData) {
        bpn0 bpn0Var = this.j;
        Pair pair = ((Number) bpn0Var.getValue()).intValue() > 1 ? new Pair(Integer.valueOf(i / ((Number) bpn0Var.getValue()).intValue()), Integer.valueOf(i2 / ((Number) bpn0Var.getValue()).intValue())) : new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        this.g = new a(ydl0Var, str, ((Number) pair.d()).intValue(), ((Number) pair.g()).intValue(), bannerAdUiData);
    }
}
