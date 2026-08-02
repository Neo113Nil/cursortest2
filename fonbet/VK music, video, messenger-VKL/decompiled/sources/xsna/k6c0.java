package xsna;

import androidx.preference.Preference;
import com.mbridge.msdk.config.component.vc.VCCpt;
import com.vk.censoredsettings.presentation.obscenetext.ObsceneTextFilterFragment;
import com.vk.censoredsettings.presentation.obscenetext.a;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.dto.user.UserProfile;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.superapp.api.dto.story.WebStoryBox;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsGeneralFragment;
import java.util.List;
import xsna.a4f0;
import xsna.epy0;
import xsna.s8z0;
import xsna.xn60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class k6c0 implements io.reactivex.rxjava3.functions.l, SwipeDrawableRefreshLayout.g, Preference.c, VkSwitchItem.a, com.mbridge.msdk.config.activity.backdispatcher.b, s8z0.a, epy0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k6c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.mbridge.msdk.config.activity.backdispatcher.b
    public void a() {
        ((VCCpt) this.c).k();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (UserProfile) ((sux) this.c).invoke(obj);
            case 1:
            case 4:
            case 7:
            case 11:
            default:
                return (io.reactivex.rxjava3.core.b0) ((uw4) this.c).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.b0) ((ksg0) this.c).invoke(obj);
            case 3:
                return (Boolean) ((sux) this.c).invoke(obj);
            case 5:
                return (it80) ((sux) this.c).invoke(obj);
            case 6:
                return (WebStoryBox) ((qze0) this.c).invoke(obj);
            case 8:
                return (List) ((qr0) this.c).invoke(obj);
            case 9:
                return (Boolean) ((wyn0) this.c).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((q7a0) this.c).invoke(obj);
            case 12:
                return (io.reactivex.rxjava3.core.t) ((yl9) this.c).invoke(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.core.view.components.switch.VkSwitchItem.a
    public void b(boolean z) {
        fnn0 fnn0Var = (fnn0) this.c;
        ObsceneTextFilterFragment.b bVar = fnn0Var.n;
        if (bVar != null) {
            long j = ((inn0) fnn0Var.m).d;
            Boolean valueOf = Boolean.valueOf(z);
            if (((int) j) == R.id.censored_settings_obscene_filter_switch) {
                ObsceneTextFilterFragment.this.getFeature().C(new a.b(valueOf.equals(Boolean.TRUE)));
            }
        }
    }

    @Override // androidx.preference.Preference.c
    public boolean eh(Preference preference) {
        SettingsGeneralFragment settingsGeneralFragment = (SettingsGeneralFragment) this.c;
        b87 b87Var = settingsGeneralFragment.u0;
        if (b87Var == null) {
            return true;
        }
        if (settingsGeneralFragment.x0) {
            b87Var.a(settingsGeneralFragment.requireContext());
            return true;
        }
        b87Var.b(settingsGeneralFragment.requireContext());
        return true;
    }

    @Override // com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout.g
    public void h() {
        ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
        qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
        ((k3f0) reactionsFeedFragment.U.getValue()).a(new a4f0.d(xn60.d.b.b));
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((dly0) this.c).f = z9z0Var;
    }

    public /* synthetic */ k6c0(w7z0 w7z0Var, j7z0 j7z0Var) {
        this.b = 15;
        this.c = j7z0Var;
    }

    @Override // xsna.epy0.a
    public void b() {
        j7z0 j7z0Var = (j7z0) this.c;
        if (j7z0Var.isShowing()) {
            j7z0Var.dismiss();
        }
    }
}
