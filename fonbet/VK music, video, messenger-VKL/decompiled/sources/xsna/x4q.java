package xsna;

import android.graphics.Path;
import android.graphics.RectF;
import com.unity3d.services.UnityAdsConstants;
import com.vk.superapp.ui.VkRoundedTopDelegate;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ExistingProfilePresenter.kt */
/* loaded from: classes15.dex */
public final /* synthetic */ class x4q extends FunctionReferenceImpl implements gzs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4q(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(i, obj, cls, str, str2, i2);
        this.b = 1;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((com.vk.registration.funnels.b) this.receiver).getClass();
                com.vk.registration.funnels.b.y();
                return s3q0.a;
            case 1:
                VkRoundedTopDelegate vkRoundedTopDelegate = (VkRoundedTopDelegate) this.receiver;
                float f = VkRoundedTopDelegate.i;
                vkRoundedTopDelegate.getClass();
                Path path = new Path();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f2 = VkRoundedTopDelegate.i;
                path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2);
                path.addArc(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f2, f2), 180.0f, 90.0f);
                path.lineTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return path;
            default:
                ((h7p0) this.receiver).a();
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4q(Object obj, int i) {
        super(0, obj, com.vk.registration.funnels.b.class, "onWhiteLabelForgotPassword", "onWhiteLabelForgotPassword()V", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(0, obj, h7p0.class, "drawerIconClick", "drawerIconClick()V", 0);
                break;
            default:
                break;
        }
    }
}
