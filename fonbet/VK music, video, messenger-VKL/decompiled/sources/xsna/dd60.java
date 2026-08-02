package xsna;

import android.content.Context;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class dd60 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;

    public /* synthetic */ dd60(Context context, int i) {
        this.b = i;
        this.c = context;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                ((ikv0) obj).a();
                SettingsGeneralFragment.a aVar = new SettingsGeneralFragment.a();
                aVar.j.putString("pref_to_highlight", "smartTab");
                aVar.k(this.c);
                break;
            case 1:
                j03.j(this.c, (Throwable) obj);
                break;
            default:
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                superappUiRouterBridge.j(this.c.getString(R.string.vkim_error_internal));
                break;
        }
        return s3q0.a;
    }
}
