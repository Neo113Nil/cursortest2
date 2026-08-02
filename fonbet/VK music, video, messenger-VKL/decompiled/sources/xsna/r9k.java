package xsna;

import com.vk.api.generated.apps.dto.AppsClearRecentsPlatformDto;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.clips.design.view.filter.FiltersRecyclerView;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.stories.model.clickable.ClickableMusic;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.domain.FriendsAndFollowersTabType;
import com.vk.newsfeed.impl.postmodal.reactions.ModalPostReactionsFragment;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.permission.PermissionHelper;
import com.vk.search.ui.impl.catalog.roots.apps.GlobalSearchMiniappsCatalogRootVh;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.ui.views.horizontalscroll.MiniWidgetsSpreaderLayoutManagerV2;
import com.vk.update.core.RuntimePermissionsNeededException;
import com.vk.update.core.a;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import xsna.bcw0;
import xsna.bfz;
import xsna.fks;
import xsna.hls;
import xsna.riv;
import xsna.uhu;
import xsna.ws00;
import xsna.xlt;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class r9k implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r9k(EntriesListPresenter entriesListPresenter, NewsEntry newsEntry) {
        this.b = 5;
        this.c = newsEntry;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v18, types: [xsna.riv$b] */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num;
        int i = this.b;
        b69 b69Var = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((s9k) obj2).h.invoke(Boolean.valueOf(((ModalActionSheetListItem) obj).a == 1));
                return s3q0.a;
            case 1:
                zhf0 zhf0Var = (zhf0) obj;
                wh50 wh50Var = ((ygk) obj2).o;
                if (((zhf0) ((zak0) wh50Var).getValue()) == null) {
                    ((zak0) wh50Var).setValue(zhf0Var);
                }
                return s3q0.a;
            case 2:
                ((v940) obj).b((ax1) obj2);
                return s3q0.a;
            case 3:
                UIBlock uIBlock = (UIBlock) obj;
                return uIBlock instanceof UIBlockList ? ((vuk) obj2).a(new i5g(((UIBlockList) uIBlock).y)) : uIBlock instanceof UIBlockVideo ? new fli0(((UIBlockVideo) uIBlock).B) : ghp.a;
            case 4:
                VkSearchView vkSearchView = (VkSearchView) obj2;
                String str = ((bcw0.a) obj).a;
                if (str != null) {
                    vkSearchView.setQuery(str);
                    izs<String, s3q0> onVoiceInputListener = vkSearchView.getOnVoiceInputListener();
                    if (onVoiceInputListener != null) {
                        onVoiceInputListener.invoke(str);
                    }
                }
                return s3q0.a;
            case 5:
                NewsEntry newsEntry = (NewsEntry) obj2;
                u1c0 u1c0Var = (u1c0) obj;
                int i2 = u1c0Var.c;
                return Boolean.valueOf((i2 == 199 || i2 == 264 || i2 == 263) && u1c0Var.b == newsEntry);
            case 6:
                ((zak0) ((c9q) obj2).b).setValue((ibo0) obj);
                return s3q0.a;
            case 7:
                int intValue = ((Integer) obj).intValue();
                int i3 = FiltersRecyclerView.j;
                ((FiltersRecyclerView) obj2).smoothScrollToPosition(intValue);
                return s3q0.a;
            case 8:
                ((jzr) obj2).d.onNext((Set) obj);
                return s3q0.a;
            case 9:
                i2s i2sVar = (i2s) obj2;
                t2s t2sVar = (t2s) obj;
                int i4 = t2sVar.i - 1;
                if (i4 == 0) {
                    i2sVar.h.a();
                }
                return t2s.a(t2sVar, null, false, null, null, false, null, null, false, i4, 255);
            case 10:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((v1z) obj2).l).setValue(bool);
                return s3q0.a;
            case 11:
                gls glsVar = (gls) obj2;
                jks jksVar = (jks) obj;
                glsVar.T(new hls.a.b(new dls(jksVar.a, jksVar.b)));
                FriendsAndFollowersTabType friendsAndFollowersTabType = glsVar.i;
                if (friendsAndFollowersTabType != null && (num = jksVar.c) != null) {
                    int intValue2 = num.intValue();
                    wj50<fks> wj50Var = glsVar.h;
                    if (wj50Var != null) {
                        wj50Var.b(new fks.b(intValue2, friendsAndFollowersTabType));
                    }
                }
                return s3q0.a;
            case 12:
                ((bmt) obj2).c(new xlt.a(new yo60.g.a((Throwable) obj)));
                return s3q0.a;
            case 13:
                xnt xntVar = (xnt) obj2;
                if (xntVar.c) {
                    xntVar.b.ao(true);
                }
                return s3q0.a;
            case 14:
                a69 a69Var = (a69) obj2;
                Iterator it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                        ?? next = it.next();
                        if (epx.f(((b69) next).a, a69Var.a)) {
                            b69Var = next;
                        }
                    }
                }
                return new it80(b69Var);
            case 15:
                GlobalSearchMiniappsCatalogRootVh globalSearchMiniappsCatalogRootVh = (GlobalSearchMiniappsCatalogRootVh) obj2;
                if (((n3a) obj) instanceof lwf0) {
                    ((io.reactivex.rxjava3.disposables.b) globalSearchMiniappsCatalogRootVh.z.getValue()).b(itg0.m(rsg0.T(yfb.x(((wf3) globalSearchMiniappsCatalogRootVh.y.getValue()).c(AppsClearRecentsPlatformDto.VK_APPS)))));
                }
                return s3q0.a;
            case 16:
                uhu.a aVar = ((aiu) obj2).q;
                if (aVar != null) {
                    aVar.a(true);
                }
                return s3q0.a;
            case 17:
                c8v c8vVar = (c8v) obj2;
                c8vVar.d1().e(false);
                c8vVar.f1().a((Throwable) obj);
                return s3q0.a;
            case 18:
                ((riv) obj2).getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (?? r3 : (Collection) obj) {
                    riv.b bVar = (riv.b) r3;
                    String str2 = bVar.a;
                    Object obj3 = linkedHashMap.get(str2);
                    if (obj3 != null || linkedHashMap.containsKey(str2)) {
                        r3 = (riv.b) obj3;
                        if (epx.f(r3.a, bVar.a)) {
                            r3.b += bVar.b;
                            r3.c += bVar.c;
                            r3.d += bVar.d;
                            r3.e += bVar.e;
                        } else {
                            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Statistics for different API methods cannot be summed up.");
                            if (!BuildInfo.m()) {
                                throw illegalArgumentException;
                            }
                            com.vk.metrics.eventtracking.b.a.a(illegalArgumentException);
                        }
                    }
                    linkedHashMap.put(str2, r3);
                }
                return linkedHashMap.values();
            case 19:
                a.C1935a c1935a = (a.C1935a) obj2;
                Throwable th = (Throwable) obj;
                if (!(th instanceof RuntimePermissionsNeededException)) {
                    return io.reactivex.rxjava3.core.q.H(th);
                }
                PermissionHelper permissionHelper = PermissionHelper.a;
                String[] d = ((RuntimePermissionsNeededException) th).d();
                permissionHelper.getClass();
                return PermissionHelper.r(d).L(new nz(new oh3(18, th, c1935a), 22), false);
            case 20:
                ((n5y) obj2).a.z(JsApiMethodType.IS_NATIVE_PAYMENT_ENABLED, (Throwable) obj);
                return s3q0.a;
            case 21:
                return jvy.L0((cvy) obj2, ((Integer) obj).intValue());
            case 22:
                ClickableMusic clickableMusic = (ClickableMusic) obj;
                fmm0 fmm0Var = ((p5z) obj2).a.R;
                return Boolean.valueOf(fmm0Var != null ? fmm0Var.a(clickableMusic) : false);
            case 23:
                ((dfz) obj2).d.onNext((bfz.a.C2608a) obj);
                return s3q0.a;
            case 24:
                com.vk.ecomm.reviews.impl.allreviews.presentation.b bVar2 = (com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj2;
                bVar2.T(c.i.b);
                bVar2.k.b(ws00.a.a);
                return s3q0.a;
            case 25:
                ((c320) obj2).d = null;
                return s3q0.a;
            case 26:
                return Boolean.valueOf(((Integer) obj).intValue() < ((MiniWidgetsSpreaderLayoutManagerV2) obj2).T());
            case 27:
                List<String> list = ModalAuthHostActivity.h;
                ((ModalAuthHostActivity) obj2).finish();
                return s3q0.a;
            case 28:
                ModalPostReactionsFragment.go((ModalPostReactionsFragment) obj2, false, 7);
                return s3q0.a;
            default:
                ah30 ah30Var = (ah30) obj2;
                return ah30Var.d.a(ah30Var.a, (dv30) obj);
        }
    }

    public /* synthetic */ r9k(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
