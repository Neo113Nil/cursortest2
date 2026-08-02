package xsna;

import android.view.View;
import androidx.compose.runtime.a;
import com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh;
import com.vk.core.compose.component.cell.content.Cell$Middle;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.view.components.cell.VkCell;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Pair;
import xsna.kx;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ix implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ix(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        switch (this.b) {
            case 0:
                kx.a aVar = (kx.a) this.c;
                String str = aVar.a;
                Cell$Middle.Size size = (Cell$Middle.Size) this.d;
                izs izsVar = (izs) obj;
                ((Boolean) obj2).getClass();
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 6) == 0) {
                    intValue |= aVar2.y(izsVar) ? 4 : 2;
                }
                if (aVar2.t(intValue & 1, (intValue & Sdk.SDKError.Reason.MRAID_JS_WRITE_FAILED_VALUE) != 130)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2017583058, intValue, -1, "com.vk.newsfeed.posting.action_button.presentation.ActionButtonsContentView.HighlightedTitle.Content.<anonymous> (ActionButtonsContentView.kt:312)");
                    }
                    v5v v5vVar = new v5v(str, new Pair(0, Integer.valueOf(str.length())));
                    boolean z = aVar.b;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    iyk0 iyk0Var = rrv0.a;
                    ylu0 ylu0Var = (ylu0) aVar2.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    boolean s = true ^ ylu0Var.s();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var2 = (ylu0) aVar2.r(iyk0Var);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    Cell$Middle.d.b.b(d8v0.c(v5vVar, z, s, ylu0Var2.getText().o, aVar2, 0), null, null, null, 0, 0, null, null, izsVar, aVar2, (intValue << 27) & 1879048192, 6, 510).c(q630.a.a, size, aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            default:
                ComposeMusicActionPlayAudiosFromBlockIdVh composeMusicActionPlayAudiosFromBlockIdVh = (ComposeMusicActionPlayAudiosFromBlockIdVh) this.c;
                VkCell.Left.Main.Size size2 = composeMusicActionPlayAudiosFromBlockIdVh.e;
                View view = (View) this.d;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1840630964, intValue2, -1, "com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh.createView.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ComposeMusicActionPlayAudiosFromBlockIdVh.kt:75)");
                    }
                    q630 E = ahn.E(txj0.q(q630.a.a, size2.j()), "ActionButtonIcon");
                    ButtonStyle buttonStyle = ButtonStyle.Secondary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Neutral;
                    ButtonSize buttonSize = ButtonSize.Medium;
                    uog0 b = vog0.b(4);
                    lg90 a = pg90.a(composeMusicActionPlayAudiosFromBlockIdVh.d.intValue(), 0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var3 = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var3.getIcon().b;
                    float j2 = size2.j() / 2;
                    boolean y = aVar3.y(composeMusicActionPlayAudiosFromBlockIdVh) | aVar3.y(view);
                    Object x = aVar3.x();
                    if (y || x == a.C0011a.a) {
                        x = new com.vk.movika.sdk.base.ui.r0(10, composeMusicActionPlayAudiosFromBlockIdVh, view);
                        aVar3.R(x);
                    }
                    bhu0.e((gzs) x, buttonSize, buttonStyle, buttonAppearance, E, b, false, false, a, new l5g(j), new pco(j2), null, null, null, null, null, false, null, null, null, aVar3, 1073745328, 0, 0, 4190656);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
        }
        return s3q0.a;
    }
}
