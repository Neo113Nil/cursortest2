package xsna;

import android.content.Context;
import com.vk.balance.BalanceFragment;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.money.subscription.MusicSubscriptionControlFragment;
import com.vk.webapp.fragments.PrivacyFragment;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import com.vkontakte.android.fragments.SettingsAccountFragment;
import com.vkontakte.android.fragments.SettingsListFragment;

/* compiled from: SettingsHandler.kt */
/* loaded from: classes7.dex */
public final class i2j0 implements fhd0, lao0 {
    public final ie7 a;
    public final mh70 b;

    public i2j0(ie7 ie7Var, mh70 mh70Var) {
        this.a = ie7Var;
        this.b = mh70Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    @Override // xsna.g9l
    public final void a(fgx fgxVar) {
        Context context = fgxVar.e;
        String a = fgxVar.a("act");
        if (a != null) {
            switch (a.hashCode()) {
                case -1358972681:
                    if (a.equals("music_subscription")) {
                        new MusicSubscriptionControlFragment.a().k(context);
                        break;
                    }
                    break;
                case -1177318867:
                    if (a.equals("account")) {
                        String a2 = fgxVar.a("highlight");
                        SettingsAccountFragment.a aVar = new SettingsAccountFragment.a();
                        aVar.y(a2);
                        aVar.k(context);
                        break;
                    }
                    break;
                case -1039689911:
                    if (a.equals("notify")) {
                        this.b.c(context);
                        break;
                    }
                    break;
                case -339185956:
                    if (a.equals("balance")) {
                        new oz50(BalanceFragment.class, null, null).k(context);
                        break;
                    }
                    break;
                case -314498168:
                    if (a.equals("privacy")) {
                        int i = PrivacyFragment.a0;
                        PrivacyFragment.b.a(false, false, fgxVar.a("profile_setting"), null, 55).k(context);
                        break;
                    }
                    break;
                case 3138974:
                    if (a.equals("feed")) {
                        new NewsfeedSettingsFragment.a().k(context);
                        break;
                    }
                    break;
                case 739114636:
                    if (a.equals("chat_bg")) {
                        new ImSettingsDialogThemeFragment.a().k(context);
                        break;
                    }
                    break;
                case 1333012765:
                    if (a.equals("blacklist")) {
                        this.a.a(context);
                        break;
                    }
                    break;
            }
        } else {
            new oz50(SettingsListFragment.class, null, null).k(context);
        }
        blk.P(fgxVar).onSuccess();
    }
}
