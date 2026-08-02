package xsna;

import android.app.Activity;
import com.vk.permission.PermissionHelper;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeSystemPushClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AuthorActionHandler.kt */
/* loaded from: classes2.dex */
public final /* synthetic */ class o75 extends FunctionReferenceImpl implements gzs<s3q0> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.gzs
    public final s3q0 invoke() {
        q75 q75Var = (q75) this.receiver;
        q75Var.getClass();
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.VIDEO_DISCOVERY;
        yks0 yks0Var = q75Var.b;
        new bjc(mobileOfficialAppsCoreNavStat$EventScreen, SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, Long.valueOf(yks0Var.e.o0()), Long.valueOf(yks0Var.e.I0().b), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeSystemPushClick(null, 1, 0 == true ? 1 : 0), 2)).q();
        Activity h = e3m.h(q75Var.a);
        if (h != null) {
            PermissionHelper.a.getClass();
            h.startActivityForResult(PermissionHelper.m(h), 7534);
        }
        return s3q0.a;
    }
}
