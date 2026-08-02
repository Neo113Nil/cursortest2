package xsna;

import android.content.Intent;
import android.os.Bundle;
import com.ironsource.C4504q2;
import com.vk.common.view.settings.SettingsSwitchView;
import com.vk.newsfeed.impl.posting.settings.PostingSettingsFragment;

/* compiled from: PostingSettingsPresenter.kt */
/* loaded from: classes4.dex */
public final class xlc0 implements gm6, qtj {
    public final PostingSettingsFragment b;
    public final hpc0 c;
    public final Bundle d;
    public final ptj e = new ptj(this);
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public String j;

    public xlc0(PostingSettingsFragment postingSettingsFragment, hpc0 hpc0Var, Bundle bundle) {
        this.b = postingSettingsFragment;
        this.c = hpc0Var;
        this.d = bundle;
        this.f = bundle != null ? bundle.getBoolean("fb") : false;
        this.g = bundle != null ? bundle.getBoolean("tw") : false;
        this.h = bundle != null ? bundle.getBoolean("commentsClosing") : false;
        this.i = bundle != null ? bundle.getBoolean(C4504q2.x) : false;
    }

    @Override // xsna.gm6
    public final boolean a0() {
        b();
        return true;
    }

    public final void b() {
        Intent intent = new Intent();
        PostingSettingsFragment postingSettingsFragment = this.b;
        SettingsSwitchView settingsSwitchView = postingSettingsFragment.U;
        Intent putExtra = intent.putExtra("fb", settingsSwitchView != null ? settingsSwitchView.a() : false);
        SettingsSwitchView settingsSwitchView2 = postingSettingsFragment.V;
        Intent putExtra2 = putExtra.putExtra("tw", settingsSwitchView2 != null ? settingsSwitchView2.a() : false);
        SettingsSwitchView settingsSwitchView3 = postingSettingsFragment.W;
        Intent putExtra3 = putExtra2.putExtra("commentsClosing", settingsSwitchView3 != null ? settingsSwitchView3.a() : false);
        SettingsSwitchView settingsSwitchView4 = postingSettingsFragment.X;
        Intent putExtra4 = putExtra3.putExtra(C4504q2.x, settingsSwitchView4 != null ? settingsSwitchView4.a() : false);
        String str = this.j;
        if (str != null) {
            putExtra4.putExtra("copyrightLink", str);
        }
        postingSettingsFragment.Mf(-1, putExtra4);
    }

    @Override // xsna.gm6
    public final void d() {
        String str;
        Bundle bundle = this.d;
        boolean z = bundle != null ? bundle.getBoolean("socialExportForbidden") : false;
        boolean z2 = bundle != null ? bundle.getBoolean("socialExportInvisible", true) : false;
        PostingSettingsFragment postingSettingsFragment = this.b;
        SettingsSwitchView settingsSwitchView = postingSettingsFragment.U;
        if (settingsSwitchView != null) {
            settingsSwitchView.setChecked(this.f);
        }
        hpc0 hpc0Var = this.c;
        boolean z3 = hpc0Var.a() && !z;
        SettingsSwitchView settingsSwitchView2 = postingSettingsFragment.U;
        if (settingsSwitchView2 != null) {
            settingsSwitchView2.setButtonEnabled(z3);
        }
        boolean z4 = hpc0Var.a() && z2;
        SettingsSwitchView settingsSwitchView3 = postingSettingsFragment.U;
        if (settingsSwitchView3 != null) {
            bwt0.p0(settingsSwitchView3, z4);
        }
        SettingsSwitchView settingsSwitchView4 = postingSettingsFragment.V;
        if (settingsSwitchView4 != null) {
            settingsSwitchView4.setChecked(this.g);
        }
        boolean z5 = hpc0Var.b() && !z;
        SettingsSwitchView settingsSwitchView5 = postingSettingsFragment.V;
        if (settingsSwitchView5 != null) {
            settingsSwitchView5.setButtonEnabled(z5);
        }
        boolean z6 = hpc0Var.b() && z2;
        SettingsSwitchView settingsSwitchView6 = postingSettingsFragment.V;
        if (settingsSwitchView6 != null) {
            bwt0.p0(settingsSwitchView6, z6);
        }
        boolean z7 = bundle != null ? bundle.getBoolean("keyCommentsClosingAvailable", true) : false;
        boolean z8 = bundle != null ? bundle.getBoolean("keyCommentsClosingEnabled") : false;
        SettingsSwitchView settingsSwitchView7 = postingSettingsFragment.W;
        if (settingsSwitchView7 != null) {
            settingsSwitchView7.setChecked(this.h);
        }
        boolean z9 = !z8;
        SettingsSwitchView settingsSwitchView8 = postingSettingsFragment.W;
        if (settingsSwitchView8 != null) {
            settingsSwitchView8.setButtonEnabled(z9);
        }
        SettingsSwitchView settingsSwitchView9 = postingSettingsFragment.W;
        if (settingsSwitchView9 != null) {
            bwt0.p0(settingsSwitchView9, z7);
        }
        boolean z10 = bundle != null ? bundle.getBoolean("notificationsVisible", true) : false;
        SettingsSwitchView settingsSwitchView10 = postingSettingsFragment.X;
        if (settingsSwitchView10 != null) {
            settingsSwitchView10.setChecked(this.i);
        }
        SettingsSwitchView settingsSwitchView11 = postingSettingsFragment.X;
        if (settingsSwitchView11 != null) {
            bwt0.p0(settingsSwitchView11, z10);
        }
        if (bundle == null || (str = bundle.getString("copyrightLink", "")) == null) {
            str = null;
        } else {
            postingSettingsFragment.lo(str);
        }
        this.j = str;
        boolean z11 = bundle != null ? bundle.getBoolean("copyrightAllowed", false) : false;
        postingSettingsFragment.ko(z11);
        postingSettingsFragment.mo(z11);
        if (z11) {
            String str2 = this.j;
            if (str2 == null || str2.length() == 0) {
                postingSettingsFragment.mo(false);
                return;
            }
            String str3 = this.j;
            this.j = str3;
            postingSettingsFragment.ko(false);
            postingSettingsFragment.mo(true);
            postingSettingsFragment.lo(str3);
        }
    }

    @Override // xsna.qtj
    public final void f0(String str) {
        androidx.appcompat.app.d dVar = this.e.c;
        if (dVar != null) {
            dVar.hide();
        }
        if (str.length() > 0) {
            this.j = str;
            PostingSettingsFragment postingSettingsFragment = this.b;
            postingSettingsFragment.ko(false);
            postingSettingsFragment.mo(true);
            postingSettingsFragment.lo(str);
        }
    }

    @Override // xsna.cc6
    public final void onDestroy() {
        this.e.b.dispose();
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
