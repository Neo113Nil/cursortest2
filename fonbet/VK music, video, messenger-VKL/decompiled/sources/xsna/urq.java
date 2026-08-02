package xsna;

import android.content.Context;
import com.facebook.soloader.MinElf;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.entities.FavePage;
import com.vk.log.L;
import com.vkontakte.android.data.b;
import xsna.o0r0;

/* compiled from: FaveRouter.kt */
/* loaded from: classes4.dex */
public final class urq {
    public static void a(Context context, FavePage favePage) {
        UserId userId;
        ksq ksqVar;
        String str = favePage.b;
        Owner owner = favePage.e;
        if (owner == null || (userId = owner.b) == null) {
            return;
        }
        String valueOf = String.valueOf(userId.b);
        b.d dVar = new b.d("bookmarks_open_item");
        dVar.b("page", "type");
        dVar.b(null, "owner_id");
        dVar.b(valueOf, "item_id");
        dVar.b("bookmarks", "nav_screen");
        dVar.e();
        xwk.e().m(context, userId, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
        if (epx.f(str, "user")) {
            ksqVar = new ksq(userId, false);
        } else if (epx.f(str, "group")) {
            ksqVar = new ksq(userId, true);
        } else {
            L.l(go9.b("Can't mark open page with type: ", str));
            ksqVar = null;
        }
        if (ksqVar != null) {
            rsg0.y0(ksqVar, null, null, 3).subscribe(new trq(new com.vk.movika.sdk.base.observable.s(28)), new x8(new com.vk.movika.sdk.base.observable.u(27), 21));
        }
    }
}
