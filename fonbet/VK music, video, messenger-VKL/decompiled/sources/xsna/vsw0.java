package xsna;

import com.vk.core.voip.VoipCallSource;
import com.vk.stat.scheme.MobileOfficialAppsCallsStat$TypeVoipCallItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import kotlin.collections.EmptySet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class vsw0 implements gzs {
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ xa4 d;

    public /* synthetic */ vsw0(long j, String str, xa4 xa4Var) {
        this.b = str;
        this.c = j;
        this.d = xa4Var;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        com.vk.voip.ui.c.i1(com.vk.voip.ui.c.b, new zqk0(this.b, 0L, "", "", "", false, false, EmptySet.b, true, null, null, null, null, 0, false, null, Long.valueOf(this.c), this.d, false, false, false, 3800576), new VoipCallSource(MobileOfficialAppsCallsStat$TypeVoipCallItem.Source.MINI_APP, MobileOfficialAppsCoreNavStat$EventScreen.MINI_APP));
        return s3q0.a;
    }
}
