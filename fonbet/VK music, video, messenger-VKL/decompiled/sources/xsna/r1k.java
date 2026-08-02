package xsna;

import android.graphics.RectF;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r1k implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ r1k(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.f;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                CoverCropActivity coverCropActivity = (CoverCropActivity) obj5;
                String str = (String) obj4;
                String str2 = (String) this.e;
                RectF rectF = (RectF) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = CoverCropActivity.w;
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1592716729, intValue, -1, "com.vk.profile.user.impl.ui.edit.cover.crop.CoverCropActivity.onCreate.<anonymous> (CoverCropActivity.kt:91)");
                    }
                    lyd0 lyd0Var = coverCropActivity.v;
                    if (lyd0Var == null) {
                        lyd0Var = null;
                    }
                    coverCropActivity.T1(str, str2, rectF, lyd0Var, aVar, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            default:
                dll0 dll0Var = (dll0) obj5;
                izs izsVar = (izs) obj4;
                yw90 yw90Var = (yw90) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(233260438, intValue2, -1, "com.vk.ecomm.storefront.impl.albums.presentation.fragment.ui.StorefrontAlbumsContent.<anonymous> (StorefrontAlbumsScreen.kt:74)");
                    }
                    phv0.b(null, kai.c(-1610081745, new yn7(13, dll0Var, izsVar), aVar2), null, null, null, 0, 0L, 0L, kai.c(-537332294, new okl0(dll0Var, izsVar, this.e, yw90Var, 0), aVar2), aVar2, 805306416, IronSourceError.ERROR_CODE_NO_ADS_TO_SHOW);
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
