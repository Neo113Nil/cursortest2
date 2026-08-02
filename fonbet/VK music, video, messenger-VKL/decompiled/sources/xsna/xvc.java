package xsna;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.unity3d.services.UnityAdsConstants;
import kotlin.jvm.internal.Ref$FloatRef;

/* compiled from: ClipFeedAnimationUtils.kt */
/* loaded from: classes17.dex */
public final class xvc extends ViewOutlineProvider {
    public final /* synthetic */ Rect a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ Ref$FloatRef c;
    public final /* synthetic */ float d;

    public xvc(Rect rect, Rect rect2, Ref$FloatRef ref$FloatRef, float f) {
        this.a = rect;
        this.b = rect2;
        this.c = ref$FloatRef;
        this.d = f;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Rect rect = this.a;
        int i = rect.left;
        float f = i;
        float f2 = this.b.left - i;
        float f3 = this.c.element;
        int i2 = (int) ((f2 * f3) + f);
        int i3 = (int) (((r2.top - r0) * f3) + rect.top);
        int i4 = (int) (((r2.right - r0) * f3) + rect.right);
        int i5 = (int) (((r2.bottom - r11) * f3) + rect.bottom);
        float f4 = this.d;
        outline.setRoundRect(i2, i3, i4, i5, u11.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f4, f3, f4));
    }
}
