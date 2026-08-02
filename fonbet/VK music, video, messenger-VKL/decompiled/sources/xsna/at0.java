package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.clips.attachments.impl.publish.cta.ActionButtonsPickerTestTags;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.defaults.SeparatorAppearance;
import com.vk.core.compose.component.defaults.SeparatorDpi;
import com.vk.dto.common.id.UserId;
import com.vkontakte.android.R;
import java.util.List;
import xsna.cp8;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class at0 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ at0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                gzs gzsVar = (gzs) this.c;
                q630 q630Var = (q630) this.d;
                ((Integer) obj2).getClass();
                bt0.i(ne7.I(1), (androidx.compose.runtime.a) obj, gzsVar, q630Var);
                return s3q0.a;
            case 1:
                fha fhaVar = (fha) this.c;
                UserId userId = (UserId) this.d;
                UIBlockList uIBlockList = (UIBlockList) obj;
                fhaVar.getClass();
                edi.y(uIBlockList, new com.vk.movika.sdk.base.hooks.p(userId, 23), new c2(8));
                return uIBlockList;
            case 2:
                zpc zpcVar = (zpc) this.c;
                izs izsVar = (izs) this.d;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2035747490, intValue, -1, "com.vk.clips.attachments.impl.publish.cta.donut.presentation.compose.ClipCtaWithDonutScreen.<anonymous> (ClipCtaWithDonutComposeContent.kt:122)");
                    }
                    SeparatorDpi separatorDpi = SeparatorDpi.At3x;
                    SeparatorAppearance separatorAppearance = SeparatorAppearance.PrimaryAlpha;
                    q630.a aVar2 = q630.a.a;
                    ijv0.c(separatorDpi, separatorAppearance, txj0.f(aVar2, 1.0f), aVar, 438, 0);
                    a.b bVar = androidx.compose.foundation.layout.a.d;
                    q630 E = s200.E(aVar2, kqu0.b, kqu0.c);
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(bVar, dt1.a.n, aVar, 6);
                    int hashCode = Long.hashCode(n34.n(aVar));
                    sy90 D = aVar.D();
                    q630 c = qri.c(aVar, E);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar.H();
                    if (aVar.L()) {
                        aVar.I(aVar3);
                    } else {
                        aVar.f();
                    }
                    k9q0.w(aVar, a, cri.a.f);
                    k9q0.w(aVar, D, cri.a.e);
                    k9q0.w(aVar, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar, cri.a.h);
                    k9q0.w(aVar, c, cri.a.d);
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    gio0 a2 = cp8.d.a.a(d370.N(R.string.done, 0, aVar), null, aVar, 3072, 6);
                    q630 E2 = ahn.E(txj0.f(aVar2, 1.0f), ActionButtonsPickerTestTags.ActionButtonsPickerDone.h());
                    boolean z = zpcVar.c;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new dz7(izsVar, 1);
                        aVar.R(x);
                    }
                    bhu0.d((gzs) x, buttonStyle, buttonAppearance, E2, buttonSize, null, null, a2, z, null, aVar, 28080, 3424);
                    aVar.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                return s3q0.a;
            case 3:
                kkd kkdVar = (kkd) this.d;
                gzs gzsVar2 = (gzs) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1343207963, intValue2, -1, "com.vk.clips.viewer.impl.feed.view.bottomsheet.redesign.ClipsBottomSheetRedesign.Content.<anonymous>.<anonymous> (ClipsBottomSheetRedesign.kt:56)");
                    }
                    List<yu20> list = kkdVar.a.b;
                    boolean y = aVar4.y(kkdVar) | aVar4.J(gzsVar2);
                    Object x2 = aVar4.x();
                    if (y || x2 == a.C0011a.a) {
                        x2 = new b1a(4, kkdVar, gzsVar2);
                        aVar4.R(x2);
                    }
                    hle.a(0, aVar4, list, (izs) x2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                izs izsVar2 = (izs) this.c;
                qg80 qg80Var = (qg80) this.d;
                ((Integer) obj2).getClass();
                izsVar2.invoke(new se80(qg80Var, ((yg5) obj).A().getDuration()));
                return s3q0.a;
            case 5:
                ((Integer) obj2).getClass();
                ((bkd0) this.c).q6((ikd0) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 6:
                nmo nmoVar = (nmo) this.c;
                hod0 hod0Var = (hod0) this.d;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(741949261, intValue3, -1, "com.vk.ecomm.market.search.filters.adapter.holders.ProductFilterDropdownHolder.bind.<anonymous> (ProductFilterDropdownHolder.kt:32)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-574623630, new jkd(5, nmoVar, hod0Var), aVar5), aVar5, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                ((gzk0) this.c).a((q630) this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                niu0.a((q630) this.d, (jai) this.c, (androidx.compose.runtime.a) obj, ne7.I(55));
                return s3q0.a;
        }
    }

    public /* synthetic */ at0(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }

    public /* synthetic */ at0(kkd kkdVar, gzs gzsVar) {
        this.b = 3;
        this.d = kkdVar;
        this.c = gzsVar;
    }

    public /* synthetic */ at0(q630 q630Var, jai jaiVar, int i) {
        this.b = 8;
        this.d = q630Var;
        this.c = jaiVar;
    }
}
