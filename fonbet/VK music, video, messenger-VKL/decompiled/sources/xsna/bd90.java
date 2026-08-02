package xsna;

import com.vk.dto.common.id.UserId;

/* compiled from: PagesService.kt */
/* loaded from: classes2.dex */
public interface bd90 {
    static /* synthetic */ xy2 a(bd90 bd90Var, UserId userId, Integer num, Boolean bool, String str, int i) {
        Boolean bool2 = Boolean.TRUE;
        if ((i & 1) != 0) {
            userId = null;
        }
        if ((i & 4) != 0) {
            num = null;
        }
        if ((i & 8) != 0) {
            bool2 = null;
        }
        if ((i & 16) != 0) {
            bool = null;
        }
        return bd90Var.b(userId, bool2, bool, num, (i & 32) != 0 ? null : str);
    }

    default tfx b(UserId userId, Boolean bool, Boolean bool2, Integer num, String str) {
        tfx tfxVar = new tfx("pages.get", new hq(24), new iq(21));
        if (userId != null) {
            tfx.n(tfxVar, "owner_id", userId, 0L, 0L, 12);
        }
        if (num != null) {
            tfx.l(tfxVar, "page_id", num.intValue(), 0, 0, 12);
        }
        if (bool != null) {
            tfxVar.j("global", bool.booleanValue());
        }
        if (bool2 != null) {
            tfxVar.j("site_preview", bool2.booleanValue());
        }
        if (str != null) {
            tfx.o(tfxVar, "title", str, 0, 0, 12);
        }
        tfxVar.j("need_html", true);
        return tfxVar;
    }
}
