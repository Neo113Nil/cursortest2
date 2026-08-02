package xsna;

import android.view.View;
import com.vk.im.ui.fragments.im_calls_action.ImCallAction;
import com.vkontakte.android.R;
import xsna.av20;

/* compiled from: ImCallActionsBottomSheet.kt */
/* loaded from: classes2.dex */
public final class zxv implements av20.b<e520> {
    public final /* synthetic */ ayv a;

    public zxv(ayv ayvVar) {
        this.a = ayvVar;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        int i2 = ((e520) obj).a;
        ImCallAction imCallAction = i2 == R.id.call_action_create_with_link ? ImCallAction.CREATE_WITH_LINK : i2 == R.id.call_action_create_scheduled ? ImCallAction.CREATE_SCHEDULED : ImCallAction.GO_TO_CALLS;
        ayv ayvVar = this.a;
        ayvVar.a.invoke(imCallAction);
        dw20 dw20Var = ayvVar.b;
        if (dw20Var != null) {
            dw20Var.tn();
        }
    }
}
