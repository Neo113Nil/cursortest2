package xsna;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.core.view.components.button.VkButton;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.notifications.restriction.MusicRestrictionPopupDisplayer;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioModal;
import com.vkontakte.android.R;
import kotlin.Triple;
import xsna.dw20;
import xsna.k840;

/* compiled from: MusicOfflineSubscriptionFlowDelegateImpl.kt */
/* loaded from: classes16.dex */
public final class vq40 {
    public static boolean b;
    public final uq40 a = new uq40();

    /* JADX WARN: Removed duplicated region for block: B:9:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Activity activity) {
        boolean z;
        if (!k840.a.i.c()) {
            com.vk.core.utils.newtork.b.a.getClass();
            if (!com.vk.core.utils.newtork.b.d() || !b) {
                z = true;
                if (z) {
                    com.vk.core.utils.newtork.b.a.getClass();
                    final boolean d = com.vk.core.utils.newtork.b.d();
                    final uq40 uq40Var = this.a;
                    dw20 dw20Var = uq40Var.a;
                    if (dw20Var == null || !dw20Var.isVisible()) {
                        View inflate = LayoutInflater.from(activity).inflate(R.layout.music_offline_subscription_bottom_sheet, (ViewGroup) null);
                        uq40Var.a = new dw20.b(activity, null).P0().D0(inflate, false).I0(null);
                        Triple triple = d ? new Triple(Integer.valueOf(R.string.music_offline_subscription_expired_online), Integer.valueOf(R.string.music_offline_subscription_proceed_online), Integer.valueOf(R.string.music_offline_subscription_expired_accept_online)) : new Triple(Integer.valueOf(R.string.music_offline_subscription_expired), Integer.valueOf(R.string.music_offline_subscription_proceed), Integer.valueOf(R.string.music_offline_subscription_expired_accept));
                        int intValue = ((Number) triple.d()).intValue();
                        int intValue2 = ((Number) triple.g()).intValue();
                        int intValue3 = ((Number) triple.h()).intValue();
                        ((TextView) inflate.findViewById(R.id.subscription_expired_title)).setText(activity.getString(intValue));
                        ((TextView) inflate.findViewById(R.id.subscription_expired_description)).setText(activity.getString(intValue2));
                        VkButton vkButton = (VkButton) inflate.findViewById(R.id.subscription_expired_button);
                        vkButton.setText(activity.getString(intValue3));
                        vkButton.setOnClickListener(new View.OnClickListener() { // from class: xsna.tq40
                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                if (d) {
                                    com.vk.music.notifications.restriction.a aVar = k840.a.d;
                                    if (aVar == null) {
                                        aVar = null;
                                    }
                                    MusicRestrictionPopupDisplayer.d(aVar, "audio_download_library", MusicPlaybackLaunchContext.e, "audio_download_library", null, 8);
                                }
                                dw20 dw20Var2 = uq40Var.a;
                                if (dw20Var2 != null) {
                                    dw20Var2.dismiss();
                                }
                            }
                        });
                        inflate.findViewById(R.id.subscription_expired_close).setOnClickListener(new vw0(uq40Var, 13));
                        CommonAudioStat$TypeAudioModal.ModalId modalId = d ? CommonAudioStat$TypeAudioModal.ModalId.SUBSCRIPTION_EXPIRED_DOWNLOADS : CommonAudioStat$TypeAudioModal.ModalId.SUBSCRIPTION_EXPIRED_DOWNLOADS_OFFLINE;
                        s750 s750Var = k840.a.e;
                        (s750Var != null ? s750Var : null).H0(modalId);
                    }
                    if (com.vk.core.utils.newtork.b.d()) {
                        b = true;
                    }
                }
                return z;
            }
        }
        z = false;
        if (z) {
        }
        return z;
    }
}
