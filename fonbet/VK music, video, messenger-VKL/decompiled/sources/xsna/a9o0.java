package xsna;

import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: TemplatesAnimationDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class a9o0 {
    public final Object a;
    public Object b;
    public Object c;

    public a9o0(byte[] bArr, String str, String str2) {
        this.a = bArr;
        this.b = str;
        this.c = str2;
    }

    public a9o0(FrameLayout frameLayout) {
        this.a = frameLayout;
        frameLayout.setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        frameLayout.setPivotX(iah0.f().widthPixels / 2.0f);
        xwt0.a(iah0.f().widthPixels, (int) (iah0.f().widthPixels / 0.5625f), frameLayout);
    }
}
