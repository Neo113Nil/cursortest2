package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.components.button.VkButton;
import com.vk.video.ui.discovery.minimizable.fullscreen_lock.FullscreenOrientationLockType;
import com.vk.video.ui.discovery.minimizable.player.orientation.OrientationManagerImpl;
import com.vkontakte.android.R;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import xsna.fys;

/* compiled from: FullscreenLockController.kt */
/* loaded from: classes7.dex */
public final class cys {
    public zy80 a;
    public final kus0 b;
    public final lus0 c;
    public final mus0 d;
    public fys e = fys.d.a;
    public final a f;

    /* compiled from: FullscreenLockController.kt */
    public static final class a {
        public final FrameLayout a;
        public final VkButton b;

        public a(ViewGroup viewGroup) {
            FrameLayout frameLayout = (FrameLayout) viewGroup.findViewById(R.id.videoScreenLockOverlayFl);
            this.a = frameLayout;
            VkButton vkButton = (VkButton) frameLayout.findViewById(R.id.videoScreenLockUnlockBtn);
            this.b = vkButton;
            frameLayout.setVisibility(8);
            WeakHashMap<View, b0u0> weakHashMap = iut0.a;
            frameLayout.setTranslationZ(100.0f);
            vkButton.setCornerRadius(Float.valueOf(100.0f));
        }
    }

    /* compiled from: FullscreenLockController.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FullscreenOrientationLockType.values().length];
            try {
                iArr[FullscreenOrientationLockType.Portrait.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FullscreenOrientationLockType.SensorLandscape.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FullscreenOrientationLockType.None.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public cys(OrientationManagerImpl orientationManagerImpl, ViewGroup viewGroup, kus0 kus0Var, lus0 lus0Var, mus0 mus0Var) {
        this.a = orientationManagerImpl;
        this.b = kus0Var;
        this.c = lus0Var;
        this.d = mus0Var;
        a aVar = new a(viewGroup);
        this.f = aVar;
        bwt0.i0(aVar.a, new frg(this, 14));
        bwt0.i0(aVar.b, new eph(this, 20));
    }

    public final void a(FullscreenOrientationLockType fullscreenOrientationLockType) {
        zy80 zy80Var;
        int i = b.$EnumSwitchMapping$0[fullscreenOrientationLockType.ordinal()];
        if (i == 1) {
            zy80 zy80Var2 = this.a;
            if (zy80Var2 != null) {
                zy80Var2.b(true);
                return;
            }
            return;
        }
        if (i == 2) {
            zy80 zy80Var3 = this.a;
            if (zy80Var3 != null) {
                zy80Var3.d(true);
                return;
            }
            return;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        zy80 zy80Var4 = this.a;
        if (zy80Var4 == null || !zy80Var4.c() || (zy80Var = this.a) == null) {
            return;
        }
        zy80Var.reset();
    }

    public final void b() {
        VkButton vkButton = this.f.b;
        vkButton.setText(R.string.video_fullscreen_locked_button_label);
        vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_lock_outline_16));
        vkButton.setClickable(false);
        d3m.c(vkButton, (r15 & 1) != 0 ? 300L : 0L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : new js6(vkButton, 3), (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }
}
