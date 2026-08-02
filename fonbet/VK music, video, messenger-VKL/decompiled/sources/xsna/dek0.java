package xsna;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import com.unity3d.services.UnityAdsConstants;
import com.vk.toggle.Features;

/* compiled from: SocialNetworkHelper.kt */
/* loaded from: classes17.dex */
public final class dek0 {
    public static final int a = View.generateViewId();
    public static final int b = View.generateViewId();
    public static final boolean c = com.vk.toggle.b.A.a(Features.Type.FEATURE_CORE_SOCIAL_NET);
    public static final tsx d;

    /* compiled from: SocialNetworkHelper.kt */
    public static final class a extends ViewOutlineProvider {
        public final float a;
        public final boolean b;

        public a(float f, boolean z) {
            this.a = f;
            this.b = z;
        }

        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            float f = this.a;
            if (f < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                return;
            }
            if (this.b) {
                f = 0.0f;
            }
            outline.setRoundRect(0, 0, view.getWidth(), an10.b(view.getHeight() + f), this.a);
        }
    }

    static {
        bek0 b2 = com.vk.toggle.d.a.b();
        if (b2 == null) {
            bek0.b.getClass();
            b2 = bek0.c;
        }
        d = new tsx(b2.a, new g2c0(4));
    }

    public static boolean a(View view) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        return viewGroup != null && viewGroup.getId() == a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void b(View view, b780 b780Var, a aVar, int i) {
        if ((i & 2) != 0) {
            b780Var = null;
        }
        if ((i & 4) != 0) {
            aVar = null;
        }
        ((kgw) view).setOnLoadCallback(new eek0(b780Var, view, aVar, (i & 8) != 0));
    }
}
