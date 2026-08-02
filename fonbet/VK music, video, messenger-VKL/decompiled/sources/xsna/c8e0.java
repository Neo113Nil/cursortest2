package xsna;

import com.vk.dto.hints.Hint;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import xsna.dh6;
import xsna.iy50;

/* compiled from: ProtectHintDialogFactory.kt */
/* loaded from: classes5.dex */
public final class c8e0 implements dh6.a {
    public final /* synthetic */ d8e0 b;
    public final /* synthetic */ Hint c;

    public c8e0(d8e0 d8e0Var, Hint hint) {
        this.b = d8e0Var;
        this.c = hint;
    }

    @Override // xsna.dh6.a
    public final void a() {
        d8e0 d8e0Var = this.b;
        d8e0Var.c.getClass();
        new cev0(SchemeStatSak$TypeVkConnectNavigationItem.EventType.UNBLOCK_PROTECT_ACCOUNT_SHOW).q();
        iy50 iy50Var = new iy50(0);
        iy50Var.y(true);
        iy50Var.i = new iy50.a(MobileOfficialAppsCoreNavStat$EventScreen.UNBLOCK_PROTECT_ACCOUNT, null, null);
        iy50Var.q();
        d8e0Var.b.getValue().b(this.c.b);
    }

    @Override // xsna.dh6.a
    public final void b() {
        this.b.c.getClass();
        new cev0(SchemeStatSak$TypeVkConnectNavigationItem.EventType.UNBLOCK_PROTECT_ACCOUNT_CANCELLATION).q();
    }
}
