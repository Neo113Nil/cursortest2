package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.cell.content.RichCell$Middle;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import xsna.q630;
import xsna.u700;
import xsna.zph0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class wph0 implements zzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wph0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.zzs
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        switch (this.b) {
            case 0:
                ykt yktVar = (ykt) this.c;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj3;
                int intValue = ((Integer) obj4).intValue();
                if (aVar.t(intValue & 1, (intValue & 129) != 128)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1749475882, intValue, -1, "com.vk.search.params.impl.presentation.modal.database.ui.view.SearchDatabaseViewContent.GeoLocationListItemDraw.<anonymous> (SearchDatabaseViewContent.kt:258)");
                    }
                    t700 c = guf0.c(new u700.e(R.raw.location_outline_animation_28), aVar, 0);
                    s600 a = y600.a(aVar);
                    i700 i700Var = (i700) c.getValue();
                    boolean J = aVar.J(a) | aVar.J(c);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new zph0.a(a, c, null);
                        aVar.R(x);
                    }
                    bap.g(i700Var, (wzs) x, aVar, 0);
                    float f = 28;
                    z600.b((i700) c.getValue(), txj0.h(txj0.v(q630.a.a, f), f), yktVar.g, false, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, Integer.MAX_VALUE, false, false, false, false, null, false, false, null, null, null, false, false, null, false, null, aVar, 1572912, 0, 0, 4194232);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                RichCell$Middle.f fVar = (RichCell$Middle.f) this.c;
                q9g q9gVar = (q9g) obj;
                q630 q630Var = (q630) obj2;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = (aVar2.J(q9gVar) ? 4 : 2) | intValue2;
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= aVar2.J(q630Var) ? 32 : 16;
                }
                if (aVar2.t(i & 1, (i & 147) != 146)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(661093322, i, -1, "com.vk.core.compose.component.cell.content.toSexyCellSlot.<anonymous> (SexyMiddleImpl.kt:196)");
                    }
                    fVar.a(q9gVar, q630Var, aVar2, i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
        }
        return s3q0.a;
    }
}
