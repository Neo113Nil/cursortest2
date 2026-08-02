package xsna;

import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rsa implements yzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rsa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.yzs
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.b) {
            case 0:
                tsa tsaVar = (tsa) this.c;
                ((Integer) obj3).intValue();
                int i = ((e520) obj2).a;
                if (i == R.id.postpone_date_menu_change) {
                    tsaVar.a.invoke();
                } else if (i == R.id.postpone_date_menu_delete) {
                    tsaVar.b.invoke();
                }
                dw20 dw20Var = tsaVar.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                tsaVar.c = null;
                break;
            default:
                mkw0 mkw0Var = (mkw0) this.c;
                View view = (View) obj;
                int intValue = ((Integer) obj2).intValue();
                int intValue2 = ((Integer) obj3).intValue();
                if (intValue > 0 && intValue2 > 0) {
                    zzz zzzVar = mkw0Var.e;
                    View view2 = mkw0Var.b;
                    float c = zzzVar.c();
                    view.setTranslationX(c == 90.0f ? w65.h(view) + (view2.getWidth() - view2.getHeight()) : c == 270.0f ? (-(view2.getWidth() - view2.getHeight())) - w65.h(view) : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
        }
        return s3q0.a;
    }
}
