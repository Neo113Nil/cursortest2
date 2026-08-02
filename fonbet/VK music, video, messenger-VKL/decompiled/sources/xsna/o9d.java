package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment;
import com.vk.music.player.LoopMode;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.apu0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class o9d implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o9d(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                p9d.a(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                break;
            case 1:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                int i2 = ref$IntRef.element;
                ref$IntRef.element = i2 + 1;
                ((kotlin.coroutines.d[]) obj4)[i2] = (d.b) obj2;
                break;
            case 2:
                ((Integer) obj2).getClass();
                com.vk.profile.community.impl.ui.trust_mark.e.a(ne7.I(1), (androidx.compose.runtime.a) obj, (List) obj4, (izs) obj3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((voj) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                jai jaiVar = (jai) obj4;
                Object obj5 = (anx) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(534475473, intValue, -1, "com.vk.core.compose.component.internal.InternalTabRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InternalTabs.kt:200)");
                    }
                    jaiVar.invoke(obj5, aVar, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                MarketLinkedContentFragment marketLinkedContentFragment = (MarketLinkedContentFragment) obj4;
                ComposeView composeView = (ComposeView) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = MarketLinkedContentFragment.R;
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1337380460, intValue2, -1, "com.vk.ecomm.market.good.linkedcontent.mvi2.ui.MarketLinkedContentFragment.onCreateView.<anonymous>.<anonymous> (MarketLinkedContentFragment.kt:51)");
                    }
                    u1h0 u1h0Var = marketLinkedContentFragment.Q;
                    qcy<Object> qcyVar = MarketLinkedContentFragment.R[0];
                    m710 m710Var = (m710) u1h0Var.getValue();
                    boolean y = aVar2.y(marketLinkedContentFragment) | aVar2.y(composeView);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new bp7(20, marketLinkedContentFragment, composeView);
                        aVar2.R(x);
                    }
                    j710.d(m710Var, (izs) x, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((lb40) obj4).e((LoopMode) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 7:
                bkd0 bkd0Var = (bkd0) obj4;
                ikd0 ikd0Var = (ikd0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(182326814, intValue3, -1, "com.vk.ecomm.market.good.good2.presentation.community.ProductCardCommunityInfoHolder.onBind.<anonymous> (ProductCardCommunityInfoHolder.kt:79)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1775176957, new rv7(5, bkd0Var, ikd0Var), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                fmd0.a((ArrayList) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 9:
                ((Integer) obj2).getClass();
                vgg0.a((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                com.vk.core.compose.component.datetime.d dVar = (com.vk.core.compose.component.datetime.d) obj4;
                d0l d0lVar = (d0l) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2035461360, intValue4, -1, "com.vk.core.compose.component.datetime.VkDatePickerDialog.<anonymous> (VkDatePicker.kt:73)");
                    }
                    boolean J = aVar4.J(dVar);
                    Object x2 = aVar4.x();
                    if (J || x2 == c0012a) {
                        apu0.a aVar5 = new apu0.a(0, dVar, com.vk.core.compose.component.datetime.d.class, "dismissDialog", "dismissDialog$components_release()V", 0);
                        aVar4.R(aVar5);
                        x2 = aVar5;
                    }
                    kyk.a((gzs) ((fcy) x2), kai.c(-108426078, new hz7(7, d0lVar, dVar), aVar4), null, kai.c(14855588, new s77(dVar, 15), aVar4), null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, kai.c(-1697208391, new u8u0(d0lVar, 1 == true ? 1 : 0), aVar4), aVar4, 100666416);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ o9d(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
