package xsna;

import androidx.compose.runtime.a;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class bpc implements wzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ izs d;
    public final /* synthetic */ Object e;

    public /* synthetic */ bpc(zpc zpcVar, boolean z, izs izsVar, int i) {
        this.e = zpcVar;
        this.c = z;
        this.d = izsVar;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                ((Integer) obj2).getClass();
                cpc.c((zpc) this.e, this.c, this.d, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                mtk0 mtk0Var = (mtk0) this.e;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-791727452, intValue, -1, "com.vk.settings.impl.presentation.base.mvi.settings.NotificationSettingsView.ContentSurface.<anonymous> (NotificationSettingsView.kt:131)");
                    }
                    q630 E = ahn.E(q630.a.a, this.c ? "NotificationSectionAppbar" : "NotificationSettingsAppbar");
                    String str = (String) mtk0Var.getValue();
                    if (str == null) {
                        str = zq.a(aVar, -640864209, R.string.notification_settings_screen_title, aVar, 0);
                    } else {
                        aVar.K(-640864767);
                        aVar.j();
                    }
                    izs izsVar = this.d;
                    boolean J = aVar.J(izsVar);
                    Object x = aVar.x();
                    if (J || x == a.C0011a.a) {
                        x = new ws0(izsVar, 4);
                        aVar.R(x);
                    }
                    cg70.a(0, aVar, str, (gzs) x, E);
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

    public /* synthetic */ bpc(th70 th70Var, boolean z, izs izsVar, wh50 wh50Var) {
        this.c = z;
        this.d = izsVar;
        this.e = wh50Var;
    }
}
