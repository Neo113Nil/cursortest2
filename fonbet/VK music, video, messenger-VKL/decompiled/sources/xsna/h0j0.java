package xsna;

import android.content.Context;
import androidx.preference.Preference;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsAccountInnerFragment;

/* compiled from: SettingsAccountInnerFragment.java */
/* loaded from: classes7.dex */
public final class h0j0 implements io.reactivex.rxjava3.functions.f<Throwable> {
    public final /* synthetic */ CharSequence b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ SettingsAccountInnerFragment d;

    public h0j0(SettingsAccountInnerFragment settingsAccountInnerFragment, CharSequence charSequence, Context context) {
        this.d = settingsAccountInnerFragment;
        this.b = charSequence;
        this.c = context;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Throwable th) throws Throwable {
        Throwable th2 = th;
        Preference findPreference = this.d.findPreference("accountCommentOrder");
        if (findPreference != null) {
            findPreference.I(this.b);
        }
        cvk.w(j03.g(this.c, th2, R.string.error), false);
    }
}
