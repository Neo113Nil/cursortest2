package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ironsource.X3;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.dto.ads.AdBlockItem;
import com.vk.dto.attaches.AttachGift;
import com.vk.dto.common.gift.GiftType;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionAction;
import com.vk.ecomm.reviews.impl.pinnedreview.domain.SubscriptionStatus;
import com.vk.ecomm.reviews.impl.pinnedreview.presentation.model.UserType;
import com.vk.im.engine.models.InfoBar;
import com.vk.stat.scheme.MobileOfficialAppsSearchStat$TypeSearchClickItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import xsna.k1m;
import xsna.kna0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class ftm implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ ftm(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                InfoBar.Button button = (InfoBar.Button) this.c;
                com.vk.im.ui.components.dialogs_list.c cVar = (com.vk.im.ui.components.dialogs_list.c) this.d;
                InfoBar infoBar = (InfoBar) this.e;
                if (button.h) {
                    cVar.p(infoBar, "action");
                }
                break;
            case 1:
                t1z t1zVar = (t1z) this.c;
                d790 d790Var = (d790) this.d;
                Collection collection = (Collection) this.e;
                View view = (View) obj;
                ucl0 ucl0Var = t1zVar.m;
                if (ucl0Var != null) {
                    ucl0Var.a(d790Var.a.b, MobileOfficialAppsSearchStat$TypeSearchClickItem.Action.SEND_GIFT_OUT);
                }
                is8 is8Var = t1zVar.i;
                if (is8Var != null) {
                    is8Var.c();
                }
                zal0 a = g2v.d().a();
                Context context = view.getContext();
                ArrayList f = d790Var.f();
                String str = d790Var.a.O;
                if (epx.f(str, X3.i.U) || str == null) {
                    str = "stickers_store";
                }
                a.w(context, f, collection, str);
                break;
            case 2:
                tho0 tho0Var = (tho0) this.c;
                izs izsVar = (izs) this.d;
                tho0 tho0Var2 = (tho0) obj;
                ((wh50) this.e).setValue(tho0Var2);
                us2 us2Var = tho0Var2.a;
                if (!epx.f(us2Var.c, tho0Var.a.c)) {
                    izsVar.invoke(new k1m.d(us2Var.c));
                }
                break;
            case 3:
                AttachGift attachGift = (AttachGift) this.c;
                wq30 wq30Var = (wq30) this.d;
                br30 br30Var = (br30) this.e;
                if (attachGift.l == GiftType.GIFT_CARD) {
                    wq30Var.s(br30Var, attachGift);
                } else {
                    wq30Var.t(br30Var);
                }
                break;
            case 4:
                AdBlockItem adBlockItem = (AdBlockItem) obj;
                break;
            case 5:
                hca0 hca0Var = (hca0) this.c;
                ida0 ida0Var = (ida0) this.d;
                jca0 jca0Var = (jca0) this.e;
                View view2 = (View) obj;
                hca0Var.g.d();
                int l = krv0.l(R.attr.vk_ui_icon_accent);
                view2.getContext();
                e.b bVar = new e.b(view2, null, null, l, 6);
                bVar.w = R.layout.ds_internal_context_menu_item;
                VkContextMenu.c.c(bVar, R.string.accept_all_photo_tags, (Drawable) ida0Var.e.getValue(), false, null, new tu80(jca0Var, 4), 28);
                VkContextMenu.c.c(bVar, R.string.decline_all_photo_tags, (Drawable) ida0Var.f.getValue(), false, null, new dj60(jca0Var, 7), 28);
                pli.r(bVar.a(), view2, true);
                break;
            case 6:
                sma0 sma0Var = (sma0) this.c;
                kna0 kna0Var = (kna0) this.d;
                Group group = (Group) this.e;
                ana0 ana0Var = (ana0) obj;
                sma0Var.e.w(ana0Var.b.b);
                UserId userId = new UserId(kna0Var.a);
                String str2 = group.d;
                String str3 = group.f;
                if (str3 == null) {
                    str3 = group.e;
                }
                String a2 = js5.a(cn70.b(40), str3);
                if (a2 == null) {
                    a2 = "";
                }
                String i = uqm0.i(group.v, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                String str4 = kna0Var.e;
                UserType userType = !epx.f(ana0Var.f, userId) ? UserType.NotBuyer : group.d() ? UserType.Buyer : UserType.BuyerWithoutRole;
                SubscriptionStatus subscriptionStatus = kna0Var.b;
                SubscriptionAction subscriptionAction = kna0Var.h;
                kna0.a aVar = kna0Var.f;
                mxm0 mxm0Var = new mxm0(aVar.a, aVar.b);
                kna0.c cVar2 = kna0Var.c;
                String str5 = a2;
                l6d0 l6d0Var = new l6d0(cVar2.a, cVar2.b);
                int i2 = kna0Var.d;
                ks90 ks90Var = new ks90(i2, a020.o(i2));
                kna0.b bVar2 = kna0Var.g;
                String str6 = bVar2.a;
                break;
            case 7:
                fah0 fah0Var = (fah0) this.c;
                Context context2 = (Context) this.d;
                List<String> list = (List) this.e;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    if (((Boolean) entry.getValue()).booleanValue()) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                fah0Var.e(context2, list, j5g.O0(linkedHashMap.keySet()));
                break;
            default:
                mwo0 mwo0Var = (mwo0) this.c;
                gwo0 gwo0Var = (gwo0) this.d;
                kcj0 kcj0Var = (kcj0) this.e;
                ywo0 ywo0Var = mwo0Var.d;
                ywo0Var.getClass();
                ywo0Var.f = gwo0Var.a;
                ArrayList arrayList = gwo0Var.b;
                ArrayList arrayList2 = gwo0Var.c;
                ywo0Var.g = j5g.u0(arrayList2, arrayList);
                ywo0Var.h = arrayList;
                ywo0Var.i = arrayList2;
                ywo0Var.l(true);
                mwo0Var.a();
                mwo0Var.b.requestLayout();
                kcj0Var.invoke();
                break;
        }
        return s3q0.a;
    }
}
