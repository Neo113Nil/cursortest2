package xsna;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.profile.CatchUpBanner;
import com.vk.dzenarticle.impl.domain.ReadStatState;
import com.vk.dzenarticle.impl.ui.entity.DzenArticleState;
import com.vk.dzenarticle.impl.ui.store.DzenArticleInlineActor;
import com.vk.im.engine.models.attaches.HistoryAttach;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.views.avatars.ImAvatarView;
import com.vk.log.L;
import com.vk.music.playlist.display.domain.h;
import com.vk.music.playlist.display.presentation.DisplayMusicPlaylistFragment;
import com.vk.permission.PermissionHelper;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.stat.scheme.MobileOfficialAppsConStoriesStat$ViewEntryPoint;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import com.vk.update.core.RuntimePermissionsNeededException;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import me.grishka.appkit.views.UsableRecyclerPaginatedView;
import xsna.czg;
import xsna.d1j;
import xsna.ikv0;
import xsna.jns;
import xsna.qvq;
import xsna.tlo0;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class m4g implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ m4g(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:153:0x049c, code lost:
    
        if (r6 != null) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x0540, code lost:
    
        if (r1 != null) goto L175;
     */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Handler handler;
        Integer num;
        boolean z;
        Integer num2;
        String str;
        ikv0.a aVar;
        String str2;
        String str3;
        Parcelable parcelable;
        xy2 o;
        Object parcelable2;
        int i = this.b;
        int i2 = 5;
        int i3 = 14;
        int i4 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((n4g) obj2).b.b(false);
                return s3q0.a;
            case 1:
                xeg xegVar = (xeg) obj2;
                xegVar.n = false;
                xegVar.l((Throwable) obj);
                return s3q0.a;
            case 2:
                jtg jtgVar = (jtg) obj2;
                CatchUpBanner catchUpBanner = jtgVar.b;
                Handler handler2 = jtgVar.e;
                p69 p69Var = jtgVar.h;
                if (((Boolean) obj).booleanValue()) {
                    qap qapVar = jtgVar.d;
                    ikv0 ikv0Var = jtgVar.c;
                    if (ikv0Var == null || !ikv0Var.b.c()) {
                        long a = (catchUpBanner.f * 1000) - qapVar.a();
                        if (a >= 0) {
                            if (a < 5000) {
                                qapVar.b += a - 5000;
                                a = 5000;
                            }
                            CommunityProfileFragment communityProfileFragment = jtgVar.a;
                            go1 go1Var = new go1(jtgVar, 26);
                            dof dofVar = new dof(jtgVar, i2);
                            String str4 = catchUpBanner.d;
                            Image image = catchUpBanner.g;
                            if (epx.f(catchUpBanner.c.d, "subscribe_ads_acceptance")) {
                                Context requireContext = communityProfileFragment.requireContext();
                                aVar = new ikv0.a(requireContext);
                                if (image != null) {
                                    str2 = "";
                                    handler = handler2;
                                    ImageSize Cb = image.Cb(iah0.a(40), true, false);
                                    if (Cb != null) {
                                        str3 = Cb.d.d;
                                        break;
                                    }
                                } else {
                                    str2 = "";
                                    handler = handler2;
                                }
                                str3 = str2;
                                aVar.t = new ikv0.c.e(new c.d(str3, null), null, null, 14);
                                aVar.u = new ikv0.d(new ikv0.d.c(str4, 3), (ikv0.d.b) null, (ikv0.d.a) null, 6);
                                aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, requireContext.getString(R.string.market_banner_action_button), new y90(7));
                            } else {
                                handler = handler2;
                                Context requireContext2 = communityProfileFragment.requireContext();
                                try {
                                    num = Integer.valueOf(Color.parseColor("#" + catchUpBanner.i));
                                } catch (Exception unused) {
                                    num = null;
                                }
                                Context u = num != null ? n8g.f(num.intValue()) < 0.5d ? bwt0.u(requireContext2) : bwt0.v(requireContext2) : requireContext2;
                                boolean c = dhr0.a.c(requireContext2);
                                ikv0.a aVar2 = new ikv0.a(u);
                                if (image != null) {
                                    z = c;
                                    num2 = num;
                                    ImageSize Cb2 = image.Cb(iah0.a(40), true, false);
                                    if (Cb2 != null) {
                                        str = Cb2.d.d;
                                        break;
                                    }
                                } else {
                                    z = c;
                                    num2 = num;
                                }
                                str = "";
                                aVar2.t = new ikv0.c.e(new c.d(str, null), null, null, 14);
                                ikv0.d.c cVar = new ikv0.d.c(str4, 2);
                                String str5 = catchUpBanner.e;
                                if (drm0.N(str5)) {
                                    str5 = null;
                                }
                                aVar2.u = new ikv0.d(cVar, new ikv0.d.b(str5, 1), (ikv0.d.a) null, 4);
                                aVar2.s = new ikv0.e.b(new gko(R.drawable.vk_icon_chevron_24), new z7g(z ? R.color.white_opacity48 : R.color.vk_gray_200), (Size) null, (izs) null, 28);
                                if (num2 != null) {
                                    aVar2.v = Integer.valueOf(num2.intValue());
                                }
                                aVar2.g = dofVar;
                                aVar = aVar2;
                            }
                            aVar.q = 0;
                            aVar.h = go1Var;
                            aVar.a(communityProfileFragment);
                            aVar.e = a;
                            aVar.i = catchUpBanner.h ? FloatingViewGesturesHelper.SwipeDirection.Horizontal : FloatingViewGesturesHelper.SwipeDirection.None;
                            aVar.c = 0.25f;
                            jtgVar.c = aVar.b();
                            Handler handler3 = handler;
                            handler3.removeCallbacks(p69Var);
                            handler3.postDelayed(p69Var, 200L);
                            if (jtgVar.f) {
                                jtgVar.f = false;
                                b.d a2 = io.reactivex.rxjava3.processors.b.a("catch_up_link_action", "action", "impression");
                                a2.b(catchUpBanner.j, "track_code");
                                a2.e();
                            }
                        }
                    }
                } else {
                    handler2.removeCallbacks(p69Var);
                    ikv0 ikv0Var2 = jtgVar.c;
                    if (ikv0Var2 != null) {
                        ikv0Var2.a();
                    }
                }
                return s3q0.a;
            case 3:
                yyg yygVar = (yyg) obj2;
                Throwable th = (Throwable) obj;
                L.i(th);
                if (h03.a(th)) {
                    yygVar.T(new czg.d(tq.h(tlo0.Companion, R.string.community_review_initial_state_loading_internet_error_title), new tlo0.f(R.string.community_review_initial_state_loading_internet_error_description)));
                } else {
                    yygVar.T(new czg.d(tq.h(tlo0.Companion, R.string.community_review_initial_state_loading_error_title), new tlo0.f(R.string.community_review_initial_state_loading_error_description)));
                }
                return s3q0.a;
            case 4:
                d2h d2hVar = (d2h) obj2;
                VkInputSelect vkInputSelect = d2hVar.m1;
                if (vkInputSelect == null) {
                    vkInputSelect = null;
                }
                String valueOf = String.valueOf(vkInputSelect.getText());
                Bundle requireArguments = d2hVar.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("COMMUNITY_ID_KEY", UserId.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Parcelable parcelable3 = requireArguments.getParcelable("COMMUNITY_ID_KEY");
                    if (!(parcelable3 instanceof UserId)) {
                        parcelable3 = null;
                    }
                    parcelable = (UserId) parcelable3;
                }
                UserId userId = (UserId) parcelable;
                if (userId == null) {
                    throw new IllegalStateException("communityId argument must not be null");
                }
                VkInputSelect vkInputSelect2 = d2hVar.m1;
                if (vkInputSelect2 == null) {
                    vkInputSelect2 = null;
                }
                mhy.d(vkInputSelect2);
                View view = d2hVar.n1;
                if (view == null) {
                    view = null;
                }
                view.setVisibility(0);
                ViewGroup viewGroup = d2hVar.k1;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                viewGroup.setVisibility(4);
                o = ((zqu) d2hVar.g1.a).o(fkq0.a(userId), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : null, (r30 & 8) != 0 ? null : valueOf, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
                d2hVar.h1.b(rsg0.y0(yfb.x(o), null, null, 3).subscribe(new com.vk.im.ui.components.dialogs_list.b(new p4f(d2hVar, i4), 15), new eu0(new com.vk.im.ui.components.viewcontrollers.dialog_header.info.a(d2hVar, 29), i3)));
                return s3q0.a;
            case 5:
                int i5 = CommunityNameHistoryFragment.S;
                ((UsableRecyclerPaginatedView) obj2).g0();
                return s3q0.a;
            case 6:
                ((z37) obj2).b((rma0) obj);
                return s3q0.a;
            case 7:
                L.g("Can't update room participants", (Throwable) obj);
                ((s0j) obj2).T(d1j.a.b);
                return s3q0.a;
            case 8:
                kdj kdjVar = (kdj) obj2;
                kdjVar.b.b().execSQL("DELETE FROM contacts WHERE 1");
                kdjVar.m(false);
                kdjVar.j(false);
                return s3q0.a;
            case 9:
                tny tnyVar = (tny) obj;
                ((zak0) ((ygk) obj2).m).setValue(jgz.p(tnyVar).z(tnyVar, true));
                return s3q0.a;
            case 10:
                com.vk.ads.core.a aVar3 = (com.vk.ads.core.a) obj2;
                kh50 kh50Var = (kh50) obj;
                boolean isEmpty = kh50Var.f().isEmpty();
                if (isEmpty) {
                    try {
                        aVar3.b.submit(new ew4(i4, aVar3, kh50Var.a));
                    } catch (Throwable th2) {
                        com.vk.metrics.eventtracking.b.a.a(th2);
                    }
                }
                return Boolean.valueOf(isEmpty);
            case 11:
                com.vk.im.ui.components.viewcontrollers.dialog_header.info.b bVar = (com.vk.im.ui.components.viewcontrollers.dialog_header.info.b) obj2;
                dtk0 dtk0Var = bVar.N;
                qtd0 zb = dtk0Var.c.zb(dtk0Var.b.Zb());
                if (zb != null) {
                    mdw g = g2v.c().g();
                    ImAvatarView imAvatarView = bVar.o;
                    ImStoryState imStoryState = dtk0Var.l;
                    imStoryState.getClass();
                    g.a(imAvatarView, zb, imStoryState == ImStoryState.NEW, MobileOfficialAppsConStoriesStat$ViewEntryPoint.IM_DIALOG_HEADER, MobileOfficialAppsCoreNavStat$EventScreen.IM_CHAT, new l9(14));
                }
                return s3q0.a;
            case 12:
                ((hpm) obj2).b.b().h(new zkh((Collection) obj, 8));
                return s3q0.a;
            case 13:
                k9n k9nVar = (k9n) obj2;
                return new q9n((ViewGroup) obj, k9nVar.i, k9nVar.j);
            case 14:
                w71 w71Var = ((ndn) obj2).r;
                yj40 yj40Var = (yj40) obj;
                if (yj40Var instanceof ib50) {
                    ib50 ib50Var = (ib50) yj40Var;
                    w71Var.a(ib50Var.b.Fb(), ib50Var.a.J);
                } else if (yj40Var instanceof gc50) {
                    LinkedHashMap linkedHashMap = ((gc50) yj40Var).a;
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap(on00.e(linkedHashMap.size()));
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        linkedHashMap2.put(entry.getKey(), ((MusicTrack) entry.getValue()).J);
                    }
                    w71Var.b(linkedHashMap2);
                }
                return s3q0.a;
            case 15:
                com.vk.music.playlist.display.domain.h hVar = (com.vk.music.playlist.display.domain.h) obj;
                int i6 = DisplayMusicPlaylistFragment.b0;
                Context requireContext3 = ((DisplayMusicPlaylistFragment) obj2).requireContext();
                if (!(hVar instanceof h.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ikv0.a aVar4 = new ikv0.a(requireContext3);
                aVar4.u = new ikv0.d(requireContext3.getString(((h.a) hVar).a), (String) null, (ikv0.d.a) null, 6);
                aVar4.n();
                return s3q0.a;
            case 16:
                return DzenArticleState.a((DzenArticleState) obj, null, ReadStatState.a(((DzenArticleState) ((DzenArticleInlineActor) obj2).b.getCurrentState()).d, System.currentTimeMillis(), false, false, false, false, false, false, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), null, null, null, false, 123);
            case 17:
                qop qopVar = (qop) obj2;
                VkAuthCredentials vkAuthCredentials = (VkAuthCredentials) obj;
                try {
                    o200 o200Var = (o200) qopVar.a;
                    if (o200Var != null) {
                        o200Var.x1(new k4(i2, qopVar, vkAuthCredentials), new dof(qopVar, 18));
                    }
                } catch (Throwable th3) {
                    par0.a.getClass();
                    par0.d(th3);
                }
                return s3q0.a;
            case 18:
                c9q c9qVar = (c9q) obj2;
                VkExpandableText vkExpandableText = (VkExpandableText) obj;
                if (((Boolean) ((zak0) c9qVar.c).getValue()).booleanValue()) {
                    vkExpandableText.q();
                } else {
                    vkExpandableText.o();
                }
                vkExpandableText.setText(d9q.a((ibo0) ((zak0) c9qVar.b).getValue()));
                return s3q0.a;
            case 19:
                wk50.a aVar5 = (wk50.a) obj2;
                FeedItem.d dVar = (FeedItem.d) obj;
                aVar5.b(new g2r(dVar));
                aVar5.a(new qvq.a.C3575a(Collections.singletonList(dVar)));
                return s3q0.a;
            case 20:
                gsr gsrVar = (gsr) obj2;
                MotionEvent motionEvent = (MotionEvent) obj;
                gsrVar.getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                gsrVar.setPressed(false);
                return s3q0.a;
            case 21:
                ((z0s) obj2).c.d(new w480(((rpm) obj).a));
                return s3q0.a;
            case 22:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((zak0) ((v1z) obj2).g).setValue(bool);
                return s3q0.a;
            case 23:
                ((xms) obj2).T(new jns.c.a((Throwable) obj));
                return s3q0.a;
            case 24:
                pno0 pno0Var = (pno0) obj;
                int i7 = vnt.n1;
                unt untVar = (unt) ((vnt) obj2).f1;
                if (untVar != null) {
                    untVar.k0(pno0Var.d());
                }
                return s3q0.a;
            case 25:
                return ((od50) obj2).c();
            case 26:
                ((aiu) obj2).c();
                return s3q0.a;
            case 27:
                ((zak0) ((c1h) obj2).i).setValue(new q9x(((q9x) obj).a));
                return s3q0.a;
            case 28:
                c8v c8vVar = (c8v) obj2;
                List<HistoryAttach> list = (List) obj;
                c8vVar.d1().e(false);
                c8vVar.d1().d(list);
                c8vVar.f1().r(list.isEmpty());
                return s3q0.a;
            default:
                com.vk.update.core.a aVar6 = (com.vk.update.core.a) obj2;
                Throwable th4 = (Throwable) obj;
                if (th4 instanceof RuntimePermissionsNeededException) {
                    aVar6.g.l("request permissions");
                    PermissionHelper.f(PermissionHelper.a, aVar6.b, ((RuntimePermissionsNeededException) th4).d(), aVar6.c.e(), 0, null, null, 56);
                }
                return s3q0.a;
        }
    }
}
