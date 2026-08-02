package xsna;

import android.view.View;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vk.core.tool.onboarding.VkTooltip$MarkerStyle;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.m8v0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j5p implements gzs {
    public final /* synthetic */ View b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ WeakReference e;
    public final /* synthetic */ ou5 f;

    public /* synthetic */ j5p(View view, String str, Ref$ObjectRef ref$ObjectRef, WeakReference weakReference, ou5 ou5Var) {
        this.b = view;
        this.c = str;
        this.d = ref$ObjectRef;
        this.e = weakReference;
        this.f = ou5Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = m8v0.M;
        VkTooltip$MarkerStyle vkTooltip$MarkerStyle = VkTooltip$MarkerStyle.Style1;
        VkTooltip$MarkerSize vkTooltip$MarkerSize = VkTooltip$MarkerSize.Size96;
        VkTooltip$BalloonPosition vkTooltip$BalloonPosition = VkTooltip$BalloonPosition.TopRight;
        VkTooltip$BalloonTilt vkTooltip$BalloonTilt = VkTooltip$BalloonTilt.Left;
        View view = this.b;
        int i2 = 14;
        k7f k7fVar = new k7f(view, i2);
        k5p k5pVar = new k5p(view, 0);
        Ref$ObjectRef ref$ObjectRef = this.d;
        WeakReference weakReference = this.e;
        ou5 ou5Var = this.f;
        m8v0.a.a(view, this.c, null, vkTooltip$MarkerStyle, vkTooltip$MarkerSize, null, vkTooltip$BalloonPosition, vkTooltip$BalloonTilt, k7fVar, k5pVar, null, null, new zo8(ref$ObjectRef, weakReference, ou5Var, 2), new mu1(i2, weakReference, ou5Var), null, 0, false, null, null, false, null, false, 15715364);
        return s3q0.a;
    }
}
