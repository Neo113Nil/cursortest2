package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import xsna.fbw;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class u1f0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ u1f0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                v1f0 v1f0Var = (v1f0) this.c;
                Msg msg = (Msg) this.d;
                String str = (String) this.e;
                wzs wzsVar = (wzs) this.f;
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (num2 == null) {
                    v1f0Var.a.d(msg.d, msg.b, msg.c, msg instanceof MsgFromChannel);
                } else {
                    v1f0Var.a.e(new fbw.a(msg.c, msg.d, msg.b, msg instanceof MsgFromChannel, num2.intValue(), str));
                    v1f0Var.c.a(msg.b, num2.intValue(), msg.c);
                    vvr0.d();
                }
                wzsVar.invoke(num, num2);
                break;
            default:
                q630 q630Var = (q630) this.c;
                m5i0 m5i0Var = (m5i0) this.d;
                jai jaiVar = (jai) this.e;
                Integer num3 = (Integer) this.f;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2032325938, intValue, -1, "com.vk.core.compose.component.VkSegmentedControl.<anonymous> (VkSegmentedControl.kt:89)");
                    }
                    jai c = kai.c(1446873139, new t3b0(1, jaiVar), aVar);
                    jai c2 = kai.c(-1999989071, new gb10(1, m5i0Var, num3), aVar);
                    q630 g = egi0.b(q630.a.a, false, new t6c0(4)).g(q630Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    uov0.a(g, m5i0Var.g(aVar), ylu0Var.getBackground().x, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1186024825, new v17(m5i0Var, c, c2, 7), aVar), aVar, 1572864, 56);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
        }
        return s3q0.a;
    }
}
