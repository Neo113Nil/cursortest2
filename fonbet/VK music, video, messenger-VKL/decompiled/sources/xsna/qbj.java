package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.store.entity.core.impl.EntityCacheComponentImpl;
import com.vk.core.store.entity.models.StoriesEventsStack;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Source;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.folders.impl.configure.g;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.stat.scheme.CommonCommunitiesStat$ClickEvent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.superapp.vibration.js.bridge.api.di.JsVibrationDelegateComponent;
import com.vk.video.ui.discovery.minimizable.player.controllers.MiniPlayerControllersWrapper;
import com.vkontakte.android.R;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import xsna.i6w;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qbj implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qbj(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v136, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        d80 d80Var;
        Object obj;
        switch (this.b) {
            case 0:
                ((com.vk.im.ui.components.contacts.a) this.c).e1(Source.CACHE, false);
                return s3q0.a;
            case 1:
                egm egmVar = (egm) this.c;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_online_status_icon);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(16), cn70.b(20), 0, 0, 0, 0, 60));
                vkImageSimple.setVisibility(8);
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 2:
                vtm vtmVar = (vtm) this.c;
                vtmVar.l.setVisibility(8);
                vtmVar.w.e(!vtmVar.D.h);
                vtmVar.x.c(vtmVar.D.h);
                igp igpVar = vtmVar.w;
                qsm qsmVar = vtmVar.D;
                boolean z = qsmVar.e;
                int i = qsmVar.f;
                igpVar.h = z;
                igpVar.i = i;
                igpVar.c();
                igp igpVar2 = vtmVar.w;
                igpVar2.j = vtmVar.D.d;
                igpVar2.d();
                vtmVar.y.c(false);
                vtmVar.z.c(false);
                vtmVar.A.c(false);
                vtmVar.B.c(false);
                vtmVar.n.setVisibility(4);
                vtmVar.r.submitList(vtmVar.D.a);
                return s3q0.a;
            case 3:
                v0n v0nVar = (v0n) this.c;
                return new z6g(v0nVar.c, v0nVar.d);
            case 4:
                return new x1n((m2c0) this.c);
            case 5:
                Context context = (Context) this.c;
                qcy<Object>[] qcyVarArr = EntityCacheComponentImpl.c;
                return new hvg0(new uy90(new File(context.getApplicationContext().getCacheDir(), "entity_cache/".concat("stories_preview_events")), StoriesEventsStack.b));
            case 6:
                return ((NewsFeedComponent) ((k7m) m7m.c(((fyq) this.c).C)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 7:
                Object obj2 = ((iar) this.c).h;
                return "Directory " + (obj2 != null ? obj2 : null) + " does not exist";
            case 8:
                return ((ipr) this.c).b.getCornersStateKeeper();
            case 9:
                ((com.vk.folders.impl.configure.h) this.c).a.onNext(g.a.b);
                return s3q0.a;
            case 10:
                ((evs) this.c).T(true);
                return s3q0.a;
            case 11:
                GalleryFragmentImpl galleryFragmentImpl = (GalleryFragmentImpl) this.c;
                int i2 = GalleryFragmentImpl.R0;
                return ((BridgeComponent) ((k7m) m7m.f(galleryFragmentImpl)).a(fpf0.a(BridgeComponent.class))).a0();
            case 12:
                return new gmt(((vmt) this.c).a, null, ur60.h);
            case 13:
                e3u e3uVar = (e3u) this.c;
                Context context2 = e3uVar.a;
                if (e3uVar.c) {
                    ijq ijqVar = new ijq(context2);
                    ijqVar.e = true;
                    ArrayList arrayList = ijqVar.c;
                    arrayList.clear();
                    arrayList.add(0);
                    arrayList.add(1);
                    ijqVar.f = 2;
                    return ijqVar;
                }
                synchronized (s101.class) {
                    try {
                        if (s101.b == null) {
                            Context applicationContext = context2.getApplicationContext();
                            if (applicationContext != null) {
                                context2 = applicationContext;
                            }
                            s101.b = new d80(new mbl(context2));
                        }
                        d80Var = s101.b;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return (ra3) ((dwz0) d80Var.b).zza();
            case 14:
                GroupMembersFragment groupMembersFragment = (GroupMembersFragment) this.c;
                int i3 = GroupMembersFragment.k0;
                Bundle arguments = groupMembersFragment.getArguments();
                if (arguments == null) {
                    return null;
                }
                if (Build.VERSION.SDK_INT >= 33) {
                    obj = arguments.getSerializable("source", CommonCommunitiesStat$ClickEvent.Source.class);
                } else {
                    Object serializable = arguments.getSerializable("source");
                    obj = (CommonCommunitiesStat$ClickEvent.Source) (serializable instanceof CommonCommunitiesStat$ClickEvent.Source ? serializable : null);
                }
                return (CommonCommunitiesStat$ClickEvent.Source) obj;
            case 15:
                GroupedNotificationListFragment groupedNotificationListFragment = (GroupedNotificationListFragment) this.c;
                int i4 = GroupedNotificationListFragment.Y;
                return ((MarketComponent) m7m.d(groupedNotificationListFragment).a(fpf0.a(MarketComponent.class))).Ob();
            case 16:
                ((p7w) this.c).d.invoke(i6w.u.b);
                return s3q0.a;
            case 17:
                return (InputMethodManager) ((j2x) this.c).a.getContext().getSystemService("input_method");
            case 18:
                ytw W0 = j5g.W0(((gwx) this.c).a);
                int e = on00.e(c5g.u(W0, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(e >= 16 ? e : 16);
                Iterator it = W0.iterator();
                while (true) {
                    ztw ztwVar = (ztw) it;
                    if (!ztwVar.b.hasNext()) {
                        return linkedHashMap;
                    }
                    xtw xtwVar = (xtw) ztwVar.next();
                    FeedItem feedItem = (FeedItem) xtwVar.b;
                    linkedHashMap.put(feedItem.F(), new c1r(xtwVar.a, feedItem));
                }
            case 19:
                return new gvw0(((wzx) this.c).h, null);
            case 20:
                return new rvp(((l2y) this.c).e);
            case 21:
                return new a2n0(((b4y) this.c).d);
            case 22:
                r6y r6yVar = (r6y) this.c;
                return ((JsVibrationDelegateComponent) x6y.H().a(fpf0.a(JsVibrationDelegateComponent.class))).ef().a(r6yVar, r6yVar.M(), new qfj(r6yVar, 14));
            case 23:
                ((p7y) this.c).a.A(JsApiMethodType.SECURE_TOKEN_REQUEST_ACCESS, VkAppsErrors.Client.i(VkAppsErrors.Client.USER_DENIED, null, null, 7));
                return s3q0.a;
            case 24:
                xgy xgyVar = (xgy) this.c;
                View view = xgyVar.c;
                int[] iArr = xgyVar.B;
                view.getLocationOnScreen(iArr);
                View view2 = xgyVar.z;
                int width = view2 != null ? view2.getWidth() : 0;
                ewb0 ewb0Var = xgyVar.q;
                int i5 = (width / 2) + (xgyVar.A[0] - iArr[0]);
                ewb0Var.getClass();
                ewb0Var.c = iah0.a(5) + i5;
                ewb0Var.b = null;
                return s3q0.a;
            case 25:
                return ((MarketComponent) ((k7m) m7m.f((bw00) this.c)).a(fpf0.a(MarketComponent.class))).U1();
            case 26:
                ((l410) this.c).l.e();
                return s3q0.a;
            case 27:
                return (ucg0) ((jd10) this.c).m.getValue();
            case 28:
                return ((MiniPlayerControllersWrapper) this.c).p;
            default:
                return ((ip30) this.c).a().getString(R.string.vkim_accessibility_icon_play);
        }
    }
}
