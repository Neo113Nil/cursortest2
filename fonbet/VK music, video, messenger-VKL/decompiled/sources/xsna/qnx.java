package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.friends.groupinvite.api.di.InviteFriendsComponent;
import com.vk.friends.groupinvite.api.domain.InviteFriendsAnalytics;
import com.vk.profile.provider.di.ProfileFragmentProviderComponent;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.bridges.dto.VkAlertData;
import com.vk.webapp.fragments.NeedChangePasswordFragment;
import com.vkontakte.android.ChangePasswordActivity;
import com.vkontakte.android.fragments.WebViewFragment;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;

/* compiled from: InternalWebRouterBridge.kt */
/* loaded from: classes7.dex */
public final class qnx implements pnx {
    public final hc8 a;
    public final SuperappUiRouterBridge b;
    public final FragmentImpl c;
    public final bpn0 d = new bpn0(new xyh(this, 24));

    public qnx(hc8 hc8Var, SuperappUiRouterBridge superappUiRouterBridge) {
        this.a = hc8Var;
        this.b = superappUiRouterBridge;
        this.c = hc8Var.g();
    }

    @Override // xsna.pnx
    public final void a(UserId userId, UserId userId2) {
        Context mo2getContext;
        FragmentImpl fragmentImpl = this.c;
        if (fragmentImpl.isAdded() && (mo2getContext = fragmentImpl.mo2getContext()) != null) {
            ((InviteFriendsComponent) m7m.d(fragmentImpl).mo408a(fpf0.a(InviteFriendsComponent.class))).a().a(mo2getContext, userId, userId2, InviteFriendsAnalytics.InviteFriendsSource.MAIN, true);
        }
    }

    @Override // xsna.pnx
    public final void b(UserId userId, boolean z) {
        FragmentImpl fragmentImpl = this.c;
        if (!fragmentImpl.isAdded() || fragmentImpl.mo2getContext() == null) {
            return;
        }
        ProfileFragmentProviderComponent profileFragmentProviderComponent = (ProfileFragmentProviderComponent) this.d.getValue();
        ProfileFragmentProviderComponent.Companion companion = ProfileFragmentProviderComponent.Companion;
        profileFragmentProviderComponent.ye(userId, null).B(z).k(fragmentImpl.mo2getContext());
    }

    @Override // xsna.pnx
    public final void c(VkAlertData vkAlertData, SuperappUiRouterBridge.d dVar) {
        this.b.c(vkAlertData, dVar);
    }

    @Override // xsna.pnx
    public final void d(String str) {
        Context mo2getContext = this.c.mo2getContext();
        if (mo2getContext != null) {
            WebViewFragment.c cVar = new WebViewFragment.c(str);
            cVar.F(false, false);
            cVar.j.putBoolean("should_close_on_blank", true);
            cVar.k(mo2getContext);
        }
    }

    @Override // xsna.pnx
    public final void e() {
        FragmentImpl fragmentImpl = this.c;
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        Intent intent = new Intent(mo2getContext, (Class<?>) PhotoVideoAttachActivity.class);
        intent.putExtra("single_mode", true);
        intent.putExtra("media_type", 111);
        intent.putExtra("prevent_styling_photo", false);
        intent.putExtra("prevent_styling_video", false);
        intent.putExtra("big_previews", true);
        intent.putExtra("video_max_length_ms", ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS);
        fragmentImpl.startActivityForResult(intent, 1);
    }

    @Override // xsna.pnx
    public final void f(Intent intent) {
        this.c.setResult(-1, intent);
    }

    @Override // xsna.pnx
    public final void finish() {
        qcy<Object>[] qcyVarArr = FragmentImpl.M;
        this.c.Mf(-1, null);
    }

    @Override // xsna.pnx
    public final void g() {
        FragmentImpl fragmentImpl = this.c;
        Context mo2getContext = fragmentImpl.mo2getContext();
        if (mo2getContext == null) {
            return;
        }
        Intent intent = new Intent(mo2getContext, (Class<?>) ChangePasswordActivity.class);
        int i = NeedChangePasswordFragment.a0;
        fragmentImpl.startActivityForResult(intent, 101);
    }
}
