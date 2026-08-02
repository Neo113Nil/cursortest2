package xsna;

import androidx.fragment.app.FragmentActivity;
import com.vkontakte.android.fragments.groupadmin.BannedUserSettingsFragment;

/* compiled from: BannedUserSettingsFragment.java */
/* loaded from: classes7.dex */
public final class w06 extends beg0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ BannedUserSettingsFragment h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w06(BannedUserSettingsFragment bannedUserSettingsFragment, FragmentActivity fragmentActivity, int i, int i2, String str, boolean z) {
        super(fragmentActivity);
        this.h = bannedUserSettingsFragment;
        this.d = i;
        this.e = i2;
        this.f = str;
        this.g = z;
    }

    @Override // xsna.beg0
    public final void r() {
        BannedUserSettingsFragment.oo(this.h, this.d, this.e, this.f, this.g);
    }
}
