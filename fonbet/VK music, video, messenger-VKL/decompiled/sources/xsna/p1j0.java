package xsna;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.fragments.SettingsDomainFragment;
import xsna.zp;

/* compiled from: SettingsDomainFragment.java */
/* loaded from: classes7.dex */
public final class p1j0 extends rpj0<zp.a> {
    public final /* synthetic */ String d;
    public final /* synthetic */ SettingsDomainFragment e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1j0(SettingsDomainFragment settingsDomainFragment, FragmentActivity fragmentActivity, String str) {
        super(fragmentActivity);
        this.e = settingsDomainFragment;
        this.d = str;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        int i = SettingsDomainFragment.j0;
        o6r0 c = q6r0.c();
        m6r0 m6r0Var = c.a;
        n7r n7rVar = m6r0.j;
        String str = this.d;
        m6r0Var.f(n7rVar, str);
        c.f();
        hf8.a(new Intent("com.vkontakte.android.ACTION_PROFILE_UPDATED").putExtra("uid", q6r0.f().y()));
        Intent intent = new Intent();
        intent.putExtra("new_domain", str);
        this.e.Mf(-1, intent);
    }
}
