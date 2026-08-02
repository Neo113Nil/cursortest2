package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockTitleSubtitleAvatar;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.fave.entities.FavePage;
import com.vk.lists.c;
import com.vk.superapp.api.dto.menu.BadgeInfo;
import com.vk.superapp.ui.widgets.SuperAppShowcaseExpandableServiceMenu;
import com.vk.superapp.ui.widgets.SuperAppWidget;
import com.vk.superapp.ui.widgets.menu.CustomMenuInfo;
import com.vk.superapp.ui.widgets.menu.SuperAppWidgetCustomMenu;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import xsna.m0x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class l9n implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ l9n(c.m mVar, String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        String str;
        SuperAppWidgetCustomMenu.Payload payload;
        boolean z;
        switch (this.b) {
            case 0:
                GetStoriesResponse getStoriesResponse = (GetStoriesResponse) obj;
                if (this.c == null) {
                    m9n.f = getStoriesResponse;
                }
                return s3q0.a;
            case 1:
                Iterable<FavePage> iterable = (Iterable) ((ad90) obj).a;
                ArrayList arrayList = new ArrayList();
                for (FavePage favePage : iterable) {
                    Owner owner = favePage.e;
                    String str2 = this.c;
                    Integer valueOf = (owner == null || (str = owner.c) == null) ? null : Integer.valueOf(drm0.K(0, 2, str, str2, true));
                    Pair pair = (valueOf == null || valueOf.intValue() < 0) ? null : new Pair(valueOf, Integer.valueOf(str2.length() + valueOf.intValue()));
                    z990 z990Var = pair != null ? new z990(favePage, pair) : null;
                    if (z990Var != null) {
                        arrayList.add(z990Var);
                    }
                }
                return arrayList;
            case 2:
                return Boolean.valueOf(epx.f(this.c, ((m0x.a) obj).a));
            case 3:
                qgi0.e((tgi0) obj, this.c, new c24(0));
                return s3q0.a;
            case 4:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, this.c);
                qgi0.r(tgi0Var, "TEST_TAG_IMAGE");
                return s3q0.a;
            case 5:
                BadgeInfo badgeInfo = (BadgeInfo) obj;
                n9n0 z2 = com.vk.superapp.ui.a.S1().z();
                if (z2 != null) {
                    ArrayList arrayList2 = new ArrayList(1);
                    for (SuperAppWidget superAppWidget : z2.a.a) {
                        boolean z3 = superAppWidget instanceof SuperAppWidgetCustomMenu;
                        String str3 = this.c;
                        BadgeInfo badgeInfo2 = null;
                        if (z3) {
                            SuperAppWidgetCustomMenu superAppWidgetCustomMenu = (SuperAppWidgetCustomMenu) superAppWidget;
                            List<CustomMenuInfo> list = superAppWidgetCustomMenu.p;
                            SuperAppWidgetCustomMenu.Payload payload2 = superAppWidgetCustomMenu.o;
                            CustomMenuInfo customMenuInfo = superAppWidgetCustomMenu.q;
                            Iterator<CustomMenuInfo> it = list.iterator();
                            int i = 0;
                            while (true) {
                                if (!it.hasNext()) {
                                    i = -1;
                                } else if (!epx.f(it.next().d, str3)) {
                                    i++;
                                }
                            }
                            if (i >= 0) {
                                List<CustomMenuInfo> list2 = superAppWidgetCustomMenu.p;
                                ArrayList arrayList3 = new ArrayList(c5g.u(list2, 10));
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    arrayList3.add(com.vk.superapp.ui.a.p3(str3, (CustomMenuInfo) it2.next(), badgeInfo));
                                }
                                payload = SuperAppWidgetCustomMenu.Payload.a(payload2, arrayList3, null, 14);
                            } else {
                                if (customMenuInfo != null) {
                                    String str4 = customMenuInfo.d;
                                    if (epx.f(str4, str3)) {
                                        payload = SuperAppWidgetCustomMenu.Payload.a(payload2, null, com.vk.superapp.ui.a.p3(str4, customMenuInfo, badgeInfo), 7);
                                    }
                                }
                                payload = null;
                            }
                            if (payload != null) {
                                arrayList2.add(SuperAppWidgetCustomMenu.i(superAppWidgetCustomMenu, null, payload, 31));
                            }
                        } else if (superAppWidget instanceof SuperAppShowcaseExpandableServiceMenu) {
                            SuperAppShowcaseExpandableServiceMenu superAppShowcaseExpandableServiceMenu = (SuperAppShowcaseExpandableServiceMenu) superAppWidget;
                            List<SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem> list3 = superAppShowcaseExpandableServiceMenu.o.b;
                            ArrayList arrayList4 = new ArrayList(c5g.u(list3, 10));
                            for (SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem menuItem : list3) {
                                if (menuItem.c.equals(str3)) {
                                    BadgeInfo badgeInfo3 = menuItem.j;
                                    menuItem = new SuperAppShowcaseExpandableServiceMenu.Payload.MenuItem(menuItem.b, menuItem.c, menuItem.d, menuItem.e, menuItem.f, menuItem.g, menuItem.h, menuItem.i, badgeInfo3 != null ? BadgeInfo.a(badgeInfo3, badgeInfo.b, badgeInfo.c, badgeInfo.d, badgeInfo.e, badgeInfo.g, 16) : badgeInfo2);
                                }
                                arrayList4.add(menuItem);
                                badgeInfo2 = null;
                            }
                            arrayList2.add(SuperAppShowcaseExpandableServiceMenu.i(superAppShowcaseExpandableServiceMenu, null, new SuperAppShowcaseExpandableServiceMenu.Payload(arrayList4, superAppShowcaseExpandableServiceMenu.o.c), 31));
                        }
                    }
                    com.vk.superapp.ui.a.S1().j(arrayList2);
                }
                return s3q0.a;
            default:
                String str5 = this.c.toString();
                ArrayList<UIBlock> Sb = ((UIBlockList) obj).Sb();
                if (Sb == null || !Sb.isEmpty()) {
                    for (UIBlock uIBlock : Sb) {
                        if ((uIBlock instanceof UIBlockTitleSubtitleAvatar) && epx.f(((UIBlockTitleSubtitleAvatar) uIBlock).E, str5)) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }

    public /* synthetic */ l9n(String str, int i) {
        this.b = i;
        this.c = str;
    }

    public /* synthetic */ l9n(String str, String str2) {
        this.b = 0;
        this.c = str;
    }
}
