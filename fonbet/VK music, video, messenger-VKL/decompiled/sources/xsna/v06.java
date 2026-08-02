package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.fragments.groupadmin.BannedUserSettingsFragment;

/* compiled from: BannedUserSettingsFragment.java */
/* loaded from: classes7.dex */
public final class v06 extends q76 {
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ BannedUserSettingsFragment g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v06(BannedUserSettingsFragment bannedUserSettingsFragment, FragmentActivity fragmentActivity, int i, int i2, String str, boolean z) {
        super(fragmentActivity);
        this.g = bannedUserSettingsFragment;
        this.c = i;
        this.d = i2;
        this.e = str;
        this.f = z;
    }

    @Override // xsna.hx2
    public final void b(Object obj) {
        BannedUserSettingsFragment.oo(this.g, this.c, this.d, this.e, this.f);
    }
}
