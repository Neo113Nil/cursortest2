package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.util.Base64;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.imagepipeline.request.ImageRequest;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.api.base.VkPaginationList;
import com.vk.audiomsg.player.SpeakerType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.catalog2.feature.music.ui.holder.MusicVerticalListVh;
import com.vk.channels.impl.list.e;
import com.vk.channels.impl.list.g;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.stories.model.GifItem;
import com.vk.dto.user.UserProfile;
import com.vk.imageloader.view.VKImageView;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.d;
import com.vk.profile.core.tabs.state.CommunityProfileContentItem;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsImStat$TypeImConversationsBannerItem;
import com.vk.stat.scheme.SchemeStat$TypeAction;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.superapp.vkhealth.permissions.api.RequestedMiniApp;
import com.vk.superapp.vkpay.checkout.data.model.Card;
import com.vk.superapp.vkpay.checkout.data.model.PayMethodData;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.Cipher;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$FloatRef;
import xsna.av20;
import xsna.dw20;
import xsna.ea7;
import xsna.kxu0;
import xsna.kyl;
import xsna.r2c;
import xsna.tlo0;
import xsna.yls;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ nk0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v145, types: [REQUEST, com.facebook.imagepipeline.request.ImageRequest] */
    /* JADX WARN: Type inference failed for: r0v34, types: [io.reactivex.rxjava3.subjects.g$b, java.util.concurrent.atomic.AtomicReference] */
    /* JADX WARN: Type inference failed for: r2v52, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.util.AttributeSet] */
    /* JADX WARN: Type inference failed for: r8v11 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        List list;
        int i = this.b;
        int i2 = 12;
        int i3 = 24;
        int i4 = 2;
        int i5 = 6;
        int i6 = 3;
        int i7 = 0;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                sk0 sk0Var = (sk0) obj3;
                ymz ymzVar = sk0Var.b;
                UserId userId = ((Group) obj2).c;
                ymzVar.getClass();
                io.reactivex.rxjava3.internal.operators.observable.m1 y0 = rsg0.y0(new hqu(userId, (String) null, (String) null, (AdminLeaveAction) obj, (String) null), null, null, 3);
                ok0 ok0Var = new ok0(sk0Var);
                y0.subscribe(ok0Var);
                sk0Var.h = ok0Var;
                return s3q0.a;
            case 1:
                String str = (String) obj3;
                String str2 = (String) obj2;
                qyg0 V0 = ((hyg0) obj).V0("DELETE FROM app_values WHERE name = ? AND storage_name = ?");
                try {
                    V0.D3(1, str);
                    V0.D3(2, str2);
                    V0.step();
                    V0.close();
                    return s3q0.a;
                } catch (Throwable th) {
                    V0.close();
                    throw th;
                }
            case 2:
                Cipher cipher = (Cipher) obj;
                ((y97) obj3).getClass();
                String string = ((SharedPreferences) obj2).getString("DATA_ENCRYPTED", null);
                return cipher.doFinal(string != null ? Base64.decode(string, 0) : 0);
            case 3:
                h5a0 h5a0Var = (h5a0) obj3;
                vj9 vj9Var = (vj9) obj2;
                T t = ((it80) obj).a;
                if (t != 0) {
                    UserProfile userProfile = (UserProfile) t;
                    String D = userProfile.D();
                    if (D == null) {
                        D = userProfile.e;
                    }
                    h5a0Var.p(i5a0.a(h5a0Var.f, D, VerifyInfoHelper.h(VerifyInfoHelper.a, userProfile.B, vj9Var.a, VerifyInfoHelper.ColorTheme.white, 24), null, 415), false);
                }
                return s3q0.a;
            case 4:
                ((com.vk.channels.impl.list.f) obj3).O(new e.t(((g.h.a.c) ((g.h.a) obj2)).a));
                ((ikv0) obj).a();
                return s3q0.a;
            case 5:
                ttb ttbVar = (ttb) obj2;
                Peer peer = ((stb) obj3).f;
                if (peer != null) {
                    ttbVar.e.a(peer);
                }
                return s3q0.a;
            case 6:
                ((izs) obj3).invoke(new r2c.j(((u1x) obj2).b));
                return s3q0.a;
            case 7:
                a8c a8cVar = (a8c) obj3;
                String str3 = (String) obj2;
                io.reactivex.rxjava3.subjects.g<List<PayMethodData>> gVar = a8cVar.c;
                if (gVar != null && (list = (List) gVar.b.getValue()) != null) {
                    ArrayList arrayList = new ArrayList(list);
                    Iterator it = g5g.E(arrayList, Card.class).iterator();
                    while (it.hasNext()) {
                        Card card = (Card) it.next();
                        if (epx.f(card.getId(), str3)) {
                            arrayList.remove(card);
                            io.reactivex.rxjava3.subjects.g<List<PayMethodData>> gVar2 = a8cVar.c;
                            if (gVar2 != null) {
                                gVar2.onNext(arrayList);
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                return s3q0.a;
            case 8:
                v1h v1hVar = (v1h) obj3;
                Context context = (Context) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                if (myc0.f(extendedCommunityProfile.t0)) {
                    return new s4m(rik0.a(v1hVar.c, extendedCommunityProfile.t0), R.drawable.vk_icon_phone_outline_20, null, new t1h(context, extendedCommunityProfile, v1hVar, 0), extendedCommunityProfile.t0, "phone", extendedCommunityProfile.a.c, null, 2252);
                }
                return null;
            case 9:
                ((ush) obj3).f.invoke(new d.n.c.b.f(((p9h) obj2).a.b, ((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 10:
                xig0 xig0Var = (xig0) obj2;
                StringBuilder e = fw3.e((String) obj3);
                e.append(String.valueOf(xig0Var.a));
                e.append(" ");
                e.append(xig0Var.b);
                qgi0.h((tgi0) obj, e.toString());
                return s3q0.a;
            case 11:
                List<i5u0> list2 = ((kyl.e.C3216e) obj3).c;
                ((nvy) obj).e(list2.size(), new ywl(new tr0(15), list2), new zwl(new d40(25), list2), new jai(802480018, new axl(list2, (izs) obj2), true));
                return s3q0.a;
            case 12:
                return ((psm) obj3).w((oum) obj, Collections.singleton(Long.valueOf(((ua80) ((sxp) obj2)).c)));
            case 13:
                com.vk.lists.c cVar = (com.vk.lists.c) obj3;
                run runVar = (run) obj2;
                com.vk.documents.impl.ui.fragments.a aVar = runVar.e;
                VkPaginationList vkPaginationList = (VkPaginationList) obj;
                List<T> list3 = vkPaginationList.b;
                int i8 = cVar.i() + list3.size();
                int i9 = vkPaginationList.c;
                boolean z = i8 < i9;
                cVar.l(i9);
                aVar.n0(list3);
                if (z) {
                    cVar.q(aVar.getItemCount());
                } else {
                    cVar.r(false);
                }
                runVar.c = new VkPaginationList<>(j5g.u0(list3, runVar.c.b), vkPaginationList.c, vkPaginationList.d, 0, 8, null);
                runVar.d.invoke();
                return s3q0.a;
            case 14:
                UserId userId2 = (UserId) obj;
                MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType eventType = MobileOfficialAppsImStat$TypeImConversationsBannerItem.EventType.CLICK_PROFILE;
                iid0 iid0Var = new iid0();
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                SchemeStat$TypeAction b = SchemeStat$TypeAction.a.b(null, null, new MobileOfficialAppsImStat$TypeImConversationsBannerItem("friends_birthdays_modal", eventType, Long.valueOf(userId2.b)), 3);
                iid0Var.f = c;
                iid0Var.g = b;
                iid0Var.q();
                ((xzt) obj3).invoke(userId2);
                dw20 dw20Var = ((yls) obj2).b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 15:
                Context context2 = (Context) obj3;
                ca7 ca7Var = (ca7) obj;
                g22 g22Var = new g22(14, context2, (String) obj2);
                xzt xztVar = new xzt(context2, i7);
                List<ga7> list4 = ca7Var.d;
                yls ylsVar = new yls();
                View inflate = LayoutInflater.from(context2).inflate(R.layout.friends_birthday_modal_page, (ViewGroup) null);
                VkTopBar vkTopBar = (VkTopBar) inflate.findViewById(R.id.toolbar);
                RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.recycler);
                defpackage.a0 a0Var = new defpackage.a0(g22Var, ca7Var, ylsVar, i6);
                FrameLayout frameLayout = new FrameLayout(context2);
                f4m.x(cn70.b(16), frameLayout);
                f4m.w(cn70.b(16), frameLayout);
                f4m.v(cn70.b(12), frameLayout);
                VkButton vkButton = new VkButton(context2, r8, i5, i7);
                vkButton.setText(R.string.gifts_users_to_gift_modal_page_button);
                vkButton.setMode(VkButton.Mode.Primary);
                vkButton.setAppearance(VkButton.Appearance.Accent);
                vkButton.setSize(VkButton.Size.Large);
                vkButton.a5(true, Integer.valueOf(R.drawable.vk_icon_gift_24));
                bwt0.i0(vkButton, new dhh(a0Var, 14));
                frameLayout.addView(vkButton);
                vkTopBar.setBefore(new VkTopBar.c.d(tq.h(tlo0.Companion, R.string.talkback_ic_cancel), new fbh(ylsVar, 17), null, null, 12));
                String str4 = ca7Var.a;
                if (str4 == null) {
                    str4 = context2.getString(R.string.gifts_users_to_gift_modal_page_title);
                }
                String str5 = ca7Var.b;
                if (str5 == null) {
                    str5 = context2.getString(R.string.gifts_users_to_gift_modal_page_subtitle);
                }
                vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(new tlo0.h(str4), null, null, null, null, 30), new VkTopBar.Middle.Text.c(new tlo0.h(str5), null, null, 30), false ? 1 : 0, false ? 1 : 0, 12));
                h1 h1Var = new h1(13, g22Var, ylsVar);
                nk0 nk0Var = new nk0(14, xztVar, ylsVar);
                av20.a aVar2 = new av20.a();
                aVar2.d(R.layout.friends_birthday_modal_page_item, LayoutInflater.from(context2));
                aVar2.d = new yls.b(h1Var, nk0Var);
                av20 b2 = aVar2.b();
                recyclerView.setAdapter(b2);
                ArrayList arrayList2 = new ArrayList();
                List<ga7> list5 = list4;
                for (ga7 ga7Var : list5) {
                    if (ga7Var.a.length() > 0) {
                        arrayList2.add(new ea7.a(ga7Var.a));
                    }
                    ArrayList arrayList3 = ga7Var.b;
                    ArrayList arrayList4 = new ArrayList(c5g.u(arrayList3, 10));
                    Iterator it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new ea7.b((ba7) it2.next()));
                    }
                    arrayList2.addAll(arrayList4);
                }
                b2.setItems(arrayList2);
                ArrayList arrayList5 = new ArrayList();
                Iterator<T> it3 = list5.iterator();
                while (it3.hasNext()) {
                    g5g.y(((ga7) it3.next()).b, arrayList5);
                }
                ylsVar.b = ((dw20.b) new dw20.b(context2, null).c(new cpo(false, cn70.b((list4.size() * 34) + (j5g.R(arrayList5).size() * 52) + 150), 3)).F0(true).D0(inflate, false).u(0).x(0).z(frameLayout).B(cn70.a() * 12.0f, true, true)).I0("FriendsBirthdayModalPage");
                return s3q0.a;
            case 16:
                ((GroupVh) obj3).q((View) obj, (Group) obj2);
                return s3q0.a;
            case 17:
                ((ro40) obj3).c.b.e.b(new cer(10, (String) obj, null, new mgz((String) obj2, 9), false), false);
                return s3q0.a;
            case 18:
                MusicVerticalListVh musicVerticalListVh = (MusicVerticalListVh) obj3;
                ViewGroup viewGroup = (ViewGroup) obj2;
                UIBlockActionOpenUrl uIBlockActionOpenUrl = (UIBlockActionOpenUrl) obj;
                UIBlock uIBlock = musicVerticalListVh.K;
                if (uIBlock != null) {
                    musicVerticalListVh.e.b.f.a(new cfp0(uIBlock, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Broadcast)));
                    com.vk.catalog2.common.ui.mvp.util.a.e(musicVerticalListVh.G, viewGroup.getContext(), uIBlock, uIBlockActionOpenUrl, null, 56);
                }
                return s3q0.a;
            case 19:
                ((hs50) obj3).d7((View) obj, (cjx) obj2, "DEFAULT", 0);
                return s3q0.a;
            case 20:
                ((tgp0) obj).h((bgk0) obj3, (SpeakerType) obj2);
                return s3q0.a;
            case 21:
                ((com.vk.im.popup.a) obj3).b((ehd0) obj2, new so40((io.reactivex.rxjava3.disposables.c) obj, i2));
                return s3q0.a;
            case 22:
                final pid0 pid0Var = (pid0) obj3;
                final tmc tmcVar = (tmc) obj2;
                final pmc pmcVar = (pmc) obj;
                if (pmcVar instanceof c5u) {
                    c5u c5uVar = (c5u) pmcVar;
                    final MarketFavable marketFavable = new MarketFavable(c5uVar.a, c5uVar.b, null, c5uVar.f, c5uVar.j);
                    isq.b((isq) pid0Var.i.getValue(), pid0Var.b, marketFavable, new wzs() { // from class: xsna.oid0
                        /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
                        @Override // xsna.wzs
                        public final Object invoke(Object obj4, Object obj5) {
                            boolean booleanValue = ((Boolean) obj4).booleanValue();
                            pmc pmcVar2 = pmcVar;
                            pid0 pid0Var2 = pid0.this;
                            pid0Var2.e((c5u) pmcVar2, booleanValue);
                            lt00 lt00Var = (lt00) pid0Var2.h.getValue();
                            MarketFavable marketFavable2 = marketFavable;
                            marketFavable2.f = booleanValue;
                            lt00Var.d(marketFavable2, kid0.a(tmcVar.c), Integer.valueOf(pid0Var2.m.indexOf(pmcVar2)), "");
                            return s3q0.a;
                        }
                    }, new rig(i5, pid0Var, pmcVar), new defpackage.v(19, pid0Var, pmcVar), true, null, null, 448);
                }
                return s3q0.a;
            case 23:
                AtomicInteger atomicInteger = ((d6f0) obj3).d.get((String) obj2);
                if (atomicInteger != null) {
                    atomicInteger.incrementAndGet();
                }
                return s3q0.a;
            case 24:
                return v9f0.d((v9f0) obj3, (ArrayList) obj2);
            case 25:
                Throwable th2 = (Throwable) obj;
                L.i(th2);
                ((d9j0) obj3).c.invoke(th2, new kb40((com.vk.lists.c) obj2, i3));
                return s3q0.a;
            case 26:
                Ref$FloatRef ref$FloatRef = (Ref$FloatRef) obj3;
                float floatValue = ref$FloatRef.element - ((Float) obj).floatValue();
                ref$FloatRef.element = floatValue;
                ((izs) obj2).invoke(Float.valueOf(floatValue));
                return s3q0.a;
            case 27:
                GifItem gifItem = (GifItem) obj3;
                f4m0 f4m0Var = (f4m0) obj2;
                ImageSize Cb = gifItem.c.Cb(((VKImageView) obj).getWidth(), true, false);
                String str6 = Cb != null ? Cb.d.d : null;
                if (str6 == null) {
                    String h = ixj0.h(gifItem.c.b);
                    if (h == null) {
                        h = "";
                    }
                    str6 = h;
                }
                ImageRequestBuilder h2 = ImageRequestBuilder.h(Uri.parse(str6));
                h2.g = ImageRequest.CacheChoice.SMALL;
                VKImageView vKImageView = f4m0Var.m;
                lpa0 e2 = rhs.e();
                e2.c = h2.a();
                e2.j = true;
                e2.l = vKImageView.getController();
                vKImageView.setController(e2.b());
                return s3q0.a;
            case 28:
                com.vk.superapp.ui.a aVar3 = (com.vk.superapp.ui.a) obj3;
                Activity activity = (Activity) obj2;
                if (jyu0.a((iyu0) obj)) {
                    aVar3.x4(activity);
                } else {
                    SuperAppFragment superAppFragment = aVar3.b;
                    tfm0 tfm0Var = new tfm0(aVar3, i4);
                    int i10 = SuperAppFragment.a.$EnumSwitchMapping$0[superAppFragment.oo().h(superAppFragment.requireContext()).ordinal()];
                    if (i10 != 1) {
                        if (i10 == 2) {
                            superAppFragment.oo().c(kxu0.a.a(superAppFragment), tfm0Var, new pkd0(i5));
                        } else if (i10 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                    } else if (e370.s != null) {
                        superAppFragment.oo().m(kxu0.a.a(superAppFragment), tfm0Var, new sqf0(i5), RequestedMiniApp.VK_STEPS);
                    } else {
                        superAppFragment.oo().e(kxu0.a.a(superAppFragment), tfm0Var, new kr6(26), RequestedMiniApp.VK_STEPS);
                    }
                }
                return s3q0.a;
            default:
                ((ymq0) obj3).z(Clips.i((Clips) obj2, null, null, null, null, false, false, null, null, null, null, CommunityProfileContentItem.State.LOADED, null, false, 258047));
                return s3q0.a;
        }
    }

    public /* synthetic */ nk0(kw70 kw70Var, bgk0 bgk0Var, SpeakerType speakerType) {
        this.b = 20;
        this.c = bgk0Var;
        this.d = speakerType;
    }
}
