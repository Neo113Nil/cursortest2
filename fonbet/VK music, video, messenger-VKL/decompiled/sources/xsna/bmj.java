package xsna;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.channelrestrictions.WarningReason;
import kotlin.Pair;

/* compiled from: ContentWarningLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class bmj implements zlj {
    @Override // xsna.zlj
    public final void a(FragmentActivity fragmentActivity, WarningReason warningReason, boolean z, final gzs<s3q0> gzsVar, final gzs<s3q0> gzsVar2, gzs<s3q0> gzsVar3, WarningNotification warningNotification) {
        if (warningReason == WarningReason.NONE) {
            return;
        }
        final FragmentManager supportFragmentManager = fragmentActivity.getSupportFragmentManager();
        supportFragmentManager.f("WARNING_MODAL_RESULT_REQUEST_KEY");
        supportFragmentManager.e("WARNING_MODAL_RESULT_KEY");
        supportFragmentManager.l0("WARNING_MODAL_RESULT_REQUEST_KEY", fragmentActivity, new pcs() { // from class: xsna.amj
            @Override // xsna.pcs
            public final void p(Bundle bundle, String str) {
                if (bundle.getBoolean("WARNING_MODAL_RESULT_KEY", false)) {
                    gzs.this.invoke();
                } else {
                    gzsVar2.invoke();
                }
                FragmentManager fragmentManager = supportFragmentManager;
                fragmentManager.f("WARNING_MODAL_RESULT_REQUEST_KEY");
                fragmentManager.e("WARNING_MODAL_RESULT_KEY");
            }
        });
        if (fragmentActivity.getSupportFragmentManager().H("ChannelWarningBottomSheet") == null) {
            com.vk.channelrestrictions.b bVar = new com.vk.channelrestrictions.b();
            bVar.setArguments(yfb.b(new Pair("reason", Integer.valueOf(warningReason.h())), new Pair("allowCloseAnonym", Boolean.valueOf(z)), new Pair("warningNotification", warningNotification)));
            ((zak0) bVar.g1).setValue(gzsVar3);
            bVar.Td(fragmentActivity.getSupportFragmentManager(), "ChannelWarningBottomSheet");
        }
    }

    @Override // xsna.zlj
    public final void b(FragmentActivity fragmentActivity) {
        Fragment H = fragmentActivity.getSupportFragmentManager().H("ChannelWarningBottomSheet");
        if (H != null) {
            ((com.vk.channelrestrictions.b) H).dismiss();
        }
    }
}
