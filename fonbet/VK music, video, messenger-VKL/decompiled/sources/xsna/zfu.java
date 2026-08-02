package xsna;

import androidx.viewpager.widget.ViewPager;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.viewer.impl.grid.lists.ClipsGridTabData;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.preference.Preference;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: GridPageListener.kt */
/* loaded from: classes17.dex */
public final class zfu implements ViewPager.j {
    public final tde b;
    public final d3p0 c;
    public final SwipeDrawableRefreshLayout d;

    /* compiled from: GridPageListener.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClipsGridTabData.values().length];
            try {
                iArr[ClipsGridTabData.OwnerClips.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClipsGridTabData.CommonClips.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClipsGridTabData.DelayedPublications.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ClipsGridTabData.Drafts.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ClipsGridTabData.Favorites.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ClipsGridTabData.LikedClips.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zfu(tde tdeVar, sjd sjdVar, SwipeDrawableRefreshLayout swipeDrawableRefreshLayout) {
        this.b = tdeVar;
        this.c = sjdVar;
        this.d = swipeDrawableRefreshLayout;
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrollStateChanged(int i) {
        SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = this.d;
        if (swipeDrawableRefreshLayout != null) {
            swipeDrawableRefreshLayout.setEnabled(i == 0);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageSelected(int i) {
        float f;
        dg9 c;
        ClipsGridTabData i2 = this.b.k.get(i).i();
        if (i2 == ClipsGridTabData.Drafts) {
            Preference.F(0L, "clips_draft_prefs", "unseen_drafts_pref");
        }
        switch (a.$EnumSwitchMapping$0[i2.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                break;
            case 5:
            case 6:
                f = 1.0f;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        d3p0 d3p0Var = this.c;
        if (d3p0Var == null || (c = d3p0Var.c()) == null) {
            return;
        }
        cfu cfuVar = c.d;
        if (c.b.f() && !c.a.c() && g620.f().getExperiments().c()) {
            c.e.setVisible(false);
            cfuVar.d(true);
            cfuVar.e(f);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.j
    public final void onPageScrolled(int i, float f, int i2) {
    }
}
