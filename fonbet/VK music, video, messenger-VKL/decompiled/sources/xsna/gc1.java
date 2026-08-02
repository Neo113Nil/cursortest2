package xsna;

import androidx.compose.runtime.a;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonAppearance;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonMode;
import com.vk.core.compose.component.subnavigation.SubnavigationButtonSize;
import java.util.List;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gc1 implements yzs {
    public final /* synthetic */ List b;
    public final /* synthetic */ izs c;
    public final /* synthetic */ rg50 d;

    public /* synthetic */ gc1(List list, izs izsVar, rg50 rg50Var) {
        this.b = list;
        this.c = izsVar;
        this.d = rg50Var;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        gc1 gc1Var = this;
        lum0 lum0Var = (lum0) obj;
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj2;
        int intValue = ((Integer) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= (intValue & 8) == 0 ? aVar.J(lum0Var) : aVar.y(lum0Var) ? 4 : 2;
        }
        if (aVar.t(intValue & 1, (intValue & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1412614052, intValue, -1, "com.vk.catalog2.common.ui.mvp.holder.video.assistant.AiAssistantCardCommonContent.<anonymous>.<anonymous> (AiAssistantCard.kt:217)");
            }
            float f = 12;
            q630.a aVar2 = q630.a.a;
            char c = 6;
            f9t.e(txj0.v(aVar2, f), aVar, 6);
            aVar.K(312441827);
            List list = gc1Var.b;
            for (T t : (list != null ? new wow(list) : null).b) {
                int i = intValue;
                SubnavigationButtonSize subnavigationButtonSize = SubnavigationButtonSize.Small;
                float f2 = f;
                SubnavigationButtonMode subnavigationButtonMode = SubnavigationButtonMode.Secondary;
                SubnavigationButtonAppearance subnavigationButtonAppearance = SubnavigationButtonAppearance.Neutral;
                t.getClass();
                izs izsVar = gc1Var.c;
                boolean J = aVar.J(izsVar) | aVar.y(t);
                Object x = aVar.x();
                if (J || x == a.C0011a.a) {
                    x = new com.vk.movika.sdk.base.logic.processor.actions.e(izsVar, t, gc1Var.d);
                    aVar.R(x);
                }
                lum0Var.a(subnavigationButtonSize, subnavigationButtonMode, false, (gzs) x, null, subnavigationButtonAppearance, null, null, null, null, false, aVar, 197046, (i << 3) & 112, 1936);
                f = f2;
                intValue = i;
                aVar2 = aVar2;
                c = 6;
                gc1Var = this;
            }
            aVar.j();
            f9t.e(txj0.v(aVar2, f), aVar, 6);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar.h();
        }
        return s3q0.a;
    }
}
