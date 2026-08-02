package xsna;

import com.vk.profile.design.view.cover.SnowballsCoverView;
import com.vk.profile.user.impl.ui.viewdelegates.SnowballsCoverHolder;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.stat.scheme.SchemeStat$TypeSnowballEvents;
import java.util.List;

/* compiled from: SnowballsCoverHolder.kt */
/* loaded from: classes5.dex */
public final class idk0 implements izs<List<SnowballsCoverView.a>, s3q0> {
    public final /* synthetic */ SnowballsCoverHolder b;

    public idk0(SnowballsCoverHolder snowballsCoverHolder) {
        this.b = snowballsCoverHolder;
    }

    @Override // xsna.izs
    public final s3q0 invoke(List<SnowballsCoverView.a> list) {
        SnowballsCoverHolder snowballsCoverHolder = this.b;
        SnowballsCoverView snowballsCoverView = snowballsCoverHolder.a;
        d9f0 d9f0Var = snowballsCoverHolder.c;
        snowballsCoverView.c = d9f0Var;
        snowballsCoverView.d = list;
        if (d9f0Var != null) {
            new tbn0(MobileOfficialAppsCoreNavStat$EventScreen.PROFILE, SchemeStat$TypeAction.a.b(null, null, new SchemeStat$TypeSnowballEvents(d9f0Var.b, Long.valueOf(d9f0Var.g), Boolean.valueOf(d9f0Var.f)), 3)).q();
        }
        snowballsCoverView.invalidate();
        return s3q0.a;
    }
}
