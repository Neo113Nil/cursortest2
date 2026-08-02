package xsna;

import androidx.compose.runtime.a;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.messagetemplates.impl.details.f;
import java.util.Iterator;
import xsna.q630;

/* compiled from: TemplateDetailsHints.kt */
/* loaded from: classes3.dex */
public final class o8o0 {
    public static final void a(final i4m i4mVar, final izs<? super com.vk.messagetemplates.impl.details.a, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-1407099166);
        int i2 = (M.J(i4mVar) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1407099166, i2, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsHints (TemplateDetailsHints.kt:22)");
            }
            float f = 8;
            androidx.compose.foundation.layout.e.a(s200.F(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(q630.a.a, 1.0f)), androidx.compose.foundation.layout.a.g(f), androidx.compose.foundation.layout.a.g(f), null, 0, 0, kai.c(1061603933, new yzs() { // from class: xsna.n8o0
                @Override // xsna.yzs
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if (aVar2.t(intValue & 1, (intValue & 17) != 16)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1061603933, intValue, -1, "com.vk.messagetemplates.impl.details.ui.TemplateDetailsHints.<anonymous> (TemplateDetailsHints.kt:28)");
                        }
                        Iterator it = i4m.this.c.iterator();
                        while (it.hasNext()) {
                            f.a aVar3 = (f.a) it.next();
                            q630 E = ahn.E(q630.a.a, "template_tag_" + aVar3.a);
                            String d = kq01.d(aVar3.b, aVar2);
                            ButtonSize buttonSize = ButtonSize.Medium;
                            ButtonStyle buttonStyle = ButtonStyle.Secondary;
                            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                            Object obj4 = izsVar;
                            boolean J = aVar2.J(obj4) | aVar2.J(aVar3);
                            Object x = aVar2.x();
                            if (J || x == a.C0011a.a) {
                                x = new n0(26, obj4, aVar3);
                                aVar2.R(x);
                            }
                            bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, null, false, false, null, null, null, d, null, null, null, null, false, null, null, null, aVar2, X2.b.f, 0, 0, 4190176);
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar2.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 1573302, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new og4(i4mVar, izsVar, i, 8);
        }
    }
}
