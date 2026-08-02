package xsna;

import android.content.DialogInterface;
import com.vk.im.channelcreation.impl.g;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import ru.mail.libverify.notifications.SmsCodeNotificationActivity;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class exa implements DialogInterface.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ exa(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.b;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((com.vk.im.channelcreation.impl.h) obj).O(g.h.b);
                dialogInterface.dismiss();
                break;
            case 1:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                    break;
                }
                break;
            case 2:
                SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) obj;
                int i3 = SettingsGeneralFragment.z0;
                com.vk.core.view.components.spinner.c cVar = new com.vk.core.view.components.spinner.c(settingsGeneralFragment.getActivity());
                cVar.n(settingsGeneralFragment.getResources().getString(R.string.loading));
                cVar.show();
                cVar.setCancelable(false);
                asu0.a.getClass();
                asu0.h().execute(new wc2(cVar, 16));
                break;
            default:
                SmsCodeNotificationActivity.a((SmsCodeNotificationActivity) obj, dialogInterface, i);
                break;
        }
    }
}
