package xsna;

import android.text.SpannableStringBuilder;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.view.components.text.VkFadeText;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vkontakte.android.R;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class lom implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lom(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                hpm hpmVar = (hpm) this.d;
                hpmVar.b.b().execSQL("UPDATE dialogs SET is_archived = ? WHERE id = ?", new String[]{String.valueOf(hpm.i0(this.c)), String.valueOf(((com.vk.im.engine.models.dialogs.b) obj).b)});
                break;
            case 1:
                VkFadeText vkFadeText = (VkFadeText) obj;
                vkFadeText.setText((SpannableStringBuilder) this.d);
                vkFadeText.setFade(this.c);
                break;
            default:
                ihu0 ihu0Var = (ihu0) this.d;
                Throwable th = (Throwable) obj;
                boolean z = th instanceof VKApiExecutionException;
                if (!z || ((VKApiExecutionException) th).s() != -1) {
                    if (!z) {
                        xgx0.a.getClass();
                        xgx0.d(th);
                    }
                    ihu0Var.d.s();
                } else if (this.c) {
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    if (superappUiRouterBridge == null) {
                        superappUiRouterBridge = null;
                    }
                    superappUiRouterBridge.j(((ggu0) ihu0Var.h.c).b.getString(R.string.vk_apps_common_network_error));
                }
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ lom(ihu0 ihu0Var, boolean z) {
        this.b = 2;
        this.c = z;
        this.d = ihu0Var;
    }
}
