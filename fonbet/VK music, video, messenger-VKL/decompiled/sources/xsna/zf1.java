package xsna;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import com.vk.api.generated.ads.dto.AdsGetAutoPromotionLinkGoalDto;
import com.vk.api.generated.market.dto.MarketAddAlbumResponseDto;
import com.vk.auth.DefaultAuthActivity;
import com.vk.auth.ui.checkaccess.PasswordCheckInitStructure;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.checkaccess.VkCheckAccessRequiredData;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.narratives.Narrative;
import com.vk.ecomm.market.album.GoodAlbumEditFlowEntity;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.games.model.GamesCatalogScreenTab;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.common.MemberAction;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.albumdetails.presentation.i;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.photos.root.photoflow.presentation.l;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vk.superapp.api.dto.auth.InitPasswordCheckResponse;
import com.vk.superapp.api.exceptions.AuthException;
import com.vk.superapp.api.internal.requests.app.ConfirmResult;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.b9a0;
import xsna.d5v;
import xsna.e8v0;
import xsna.edt;
import xsna.gg1;
import xsna.gm50;
import xsna.im90;
import xsna.m0f;
import xsna.n1c;
import xsna.r69;
import xsna.rtb0;
import xsna.rxh;
import xsna.t69;
import xsna.tlo0;
import xsna.wco;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class zf1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zf1(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v129, types: [T, java.lang.Integer] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Pair pair;
        boolean z;
        com.vk.im.engine.models.dialogs.a aVar;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen;
        int i = this.b;
        int i2 = 5;
        int i3 = 12;
        int i4 = 21;
        io.reactivex.rxjava3.core.q qVar = null;
        char c = 1;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((gg1) obj3).p.b(i.e.a);
                ((gg1.b) obj2).c();
                return s3q0.a;
            case 1:
                CodeState.MaxCodeWait maxCodeWait = (CodeState.MaxCodeWait) obj2;
                izs<String, s3q0> izsVar = ((bs8) obj3).e;
                if (izsVar != null) {
                    izsVar.invoke(maxCodeWait.h);
                }
                return s3q0.a;
            case 2:
                ((e39) obj3).l.invoke(new r69.b(((t69.a.C3724a) obj2).b));
                return s3q0.a;
            case 3:
                return z9a.s((z9a) obj3, (String) obj2, null, (List) obj, null, 26);
            case 4:
                ((izs) obj3).invoke(MemberAction.h().get(((Integer) obj).intValue()));
                dw20 dw20Var = (dw20) ((Ref$ObjectRef) obj2).element;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 5:
                q8e q8eVar = (q8e) obj2;
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                int i5 = ClipFeedListFragment.a2;
                m0f<FeedItem> xo = ((ClipFeedListFragment) obj3).xo();
                if (!xo.f && (pair = (Pair) xo.c.invoke(num)) != null) {
                    xo.m(new m0f.a<>(intValue, (String) pair.j(), pair.i()), q8eVar);
                }
                return s3q0.a;
            case 6:
                final com.vk.attachpicker.collages.a aVar2 = (com.vk.attachpicker.collages.a) obj2;
                int i6 = com.vk.attachpicker.collages.a.k1;
                ((gys) obj).a((List) obj3, new jai(1629988272, new a0t() { // from class: xsna.u1g
                    @Override // xsna.a0t
                    public final Object invoke(Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                        kys kysVar = (kys) obj4;
                        q630 q630Var = (q630) obj6;
                        androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj7;
                        int intValue2 = ((Integer) obj8).intValue();
                        int i7 = com.vk.attachpicker.collages.a.k1;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1629988272, intValue2, -1, "com.vk.attachpicker.collages.CollageOnboardingBottomSheet.ThemedContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CollageOnboardingBottomSheet.kt:61)");
                        }
                        com.vk.attachpicker.collages.a aVar4 = com.vk.attachpicker.collages.a.this;
                        VideoFile videoFile = (VideoFile) ((zak0) aVar4.h1).getValue();
                        if (videoFile == null) {
                            aVar3.K(80456941);
                        } else {
                            aVar3.K(80456942);
                            kysVar.b((String) ((zak0) aVar4.i1).getValue(), q630Var, kai.c(-1297546910, new v1g(videoFile, 0), aVar3), aVar3, ((intValue2 >> 3) & 112) | 28032 | ((intValue2 << 15) & 458752));
                        }
                        aVar3.j();
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        return s3q0.a;
                    }
                }, true));
                return s3q0.a;
            case 7:
                ((yyg) obj3).V((Throwable) obj, (fzg) obj2);
                return s3q0.a;
            case 8:
                final fyh fyhVar = (fyh) obj2;
                return new bye0((ViewGroup) obj, new eig0() { // from class: xsna.cyh
                    @Override // xsna.eig0
                    public final void a(Object obj4) {
                        if (((bhg0) obj4) instanceof chg0) {
                            fyh.this.i.c(rxh.c.a);
                        }
                    }
                }, ((Boolean) ((com.vk.movika.sdk.base.logic.interactor.h) obj3).invoke()).booleanValue(), cn70.b(16), 8);
            case 9:
                hpd0 hpd0Var = ((yij) obj2).b;
                rdi.y((gkj) obj3, new mu0(hpd0Var, hpd0Var.e.f, c == true ? 1 : 0));
                return s3q0.a;
            case 10:
                com.vk.profile.questions.impl.b bVar = (com.vk.profile.questions.impl.b) obj3;
                t9k t9kVar = bVar.i1;
                UserId userId = t9kVar.c.a.c;
                String d = cqm0.d(t9kVar.f);
                boolean z2 = t9kVar.g;
                tfx tfxVar = new tfx("questions.send", new sqe0(0), new yu50(i2));
                tfx.n(tfxVar, "owner_id", userId, 1L, 0L, 8);
                tfx.o(tfxVar, "text", d, 0, 2048, 4);
                tfxVar.j("is_anonymous", z2);
                itg0.g(hg1.l(rsg0.Z(yfb.x(tfxVar)).o(asu0.a.d()), ((View) obj2).getContext(), 62), new dof(bVar, 13), new i8(29));
                bVar.bo(SchemeStat$TypeQuestionItem.Type.CLICK_TO_SEND, null);
                return s3q0.a;
            case 11:
                bmm bmmVar = (bmm) obj3;
                c400 c400Var = (c400) obj2;
                xgl0 xgl0Var = (xgl0) obj;
                w2w w2wVar = bmmVar.c;
                Peer peer = bmmVar.d;
                if (!w2wVar.getExperiments().n() || (aVar = (com.vk.im.engine.models.dialogs.a) c400Var.d.get(Long.valueOf(peer.b))) == null) {
                    z = false;
                } else {
                    z = false;
                    new wfm(Collections.singletonList(aVar), null, 0, 14).o(w2wVar);
                }
                hpm e = xgl0Var.b().e();
                e.h0(peer.b, z);
                com.vk.im.engine.models.dialogs.b c2 = e.c(peer.b);
                if (c2 == null) {
                    return null;
                }
                new sum(xgl0Var).a(c2);
                return s3q0.a;
            case 12:
                ((wco.a) obj3).l.invoke((ido) obj2);
                return s3q0.a;
            case 13:
                ((etv0) obj).b(false);
                ((lrs) obj3).a.a((VkOnboardingCampaign) obj2, VkOnboardingType.Tooltip, e8v0.f.b);
                return s3q0.a;
            case 14:
                xbt xbtVar = (xbt) obj3;
                GamesCatalogScreenTab gamesCatalogScreenTab = (GamesCatalogScreenTab) obj2;
                adt adtVar = (adt) obj;
                w9t w9tVar = xbtVar.h;
                w9tVar.f.clear();
                w9tVar.g.clear();
                w9tVar.h.clear();
                xbtVar.T(new edt.f.e(adtVar.f, uca.a() ? adtVar.g : null, vdt.a(adtVar.c), adtVar.e, adtVar.d, gamesCatalogScreenTab));
                return s3q0.a;
            case 15:
                int i7 = ImDialogsSelectionFragment.n0;
                ((ImDialogsSelectionFragment) obj3).go((DialogExt) obj2);
                return s3q0.a;
            case 16:
                List list = (List) obj3;
                izs izsVar2 = (izs) obj2;
                nvy nvyVar = (nvy) obj;
                wow wowVar = list != null ? new wow(list) : null;
                nvyVar.e(wowVar.b.size(), null, new ziw(wowVar, 0), new jai(2039820996, new ajw(wowVar, izsVar2), true));
                return s3q0.a;
            case 17:
                MarketEditAlbumGoodsFragment marketEditAlbumGoodsFragment = (MarketEditAlbumGoodsFragment) obj3;
                GoodAlbumEditFlowEntity goodAlbumEditFlowEntity = (GoodAlbumEditFlowEntity) obj2;
                MarketAddAlbumResponseDto marketAddAlbumResponseDto = (MarketAddAlbumResponseDto) obj;
                int i8 = MarketEditAlbumGoodsFragment.c1;
                io.reactivex.rxjava3.internal.operators.observable.g1 T = io.reactivex.rxjava3.core.q.T(marketAddAlbumResponseDto);
                Integer d2 = marketAddAlbumResponseDto.d();
                if (d2 != null) {
                    int intValue2 = d2.intValue();
                    UserId userId2 = goodAlbumEditFlowEntity.b;
                    marketEditAlbumGoodsFragment.getClass();
                    UserId e2 = fkq0.e(userId2);
                    AdsGetAutoPromotionLinkGoalDto adsGetAutoPromotionLinkGoalDto = AdsGetAutoPromotionLinkGoalDto.GOODS;
                    tfx tfxVar2 = new tfx("ads.getAutoPromotionLink", new u11(0), new v11(0));
                    tfx.n(tfxVar2, "group_id", e2, 1L, 0L, 8);
                    tfx.l(tfxVar2, "album_id", intValue2, -2, 0, 8);
                    if (adsGetAutoPromotionLinkGoalDto != null) {
                        tfx.o(tfxVar2, "goal", adsGetAutoPromotionLinkGoalDto.i(), 0, 0, 12);
                    }
                    qVar = rsg0.y0(yfb.x(tfxVar2), null, null, 3);
                }
                return T.L0(qVar, new nb(new kli((byte) 0, i2), i4));
            case 18:
                w2w w2wVar2 = (w2w) obj3;
                xgl0 xgl0Var2 = (xgl0) obj;
                int d3 = xgl0Var2.system().d();
                Collection<Msg> collection = ((f140) obj2).c;
                cn30.a.getClass();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj4 : collection) {
                    Long valueOf = Long.valueOf(((Msg) obj4).c);
                    Object obj5 = linkedHashMap.get(valueOf);
                    if (obj5 == null) {
                        obj5 = new ArrayList();
                        linkedHashMap.put(valueOf, obj5);
                    }
                    ((List) obj5).add(obj4);
                }
                Set<Map.Entry> entrySet = linkedHashMap.entrySet();
                ArrayList arrayList = new ArrayList(c5g.u(entrySet, 10));
                for (Map.Entry entry : entrySet) {
                    long longValue = ((Number) entry.getKey()).longValue();
                    List list2 = (List) entry.getValue();
                    cn30.a.getClass();
                    cn30.b().clear();
                    cn30.c().clear();
                    d040 o = w2wVar2.I0().o();
                    Collection b = cn30.b();
                    List<Msg> list3 = list2;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj6 : list3) {
                        if (((Msg) obj6).Mb()) {
                            arrayList2.add(obj6);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(Integer.valueOf(((Msg) it.next()).d));
                    }
                    b.addAll(arrayList3);
                    SparseArray<Msg> I0 = o.I0(longValue, cn30.b());
                    Collection c3 = cn30.c();
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj7 : list3) {
                        if (!zik0.a(I0, ((Msg) obj7).d)) {
                            arrayList4.add(obj7);
                        }
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        Object next = it2.next();
                        if (((Msg) next).f != 0) {
                            arrayList5.add(next);
                        }
                    }
                    ArrayList arrayList6 = new ArrayList(c5g.u(arrayList5, 10));
                    Iterator it3 = arrayList5.iterator();
                    while (it3.hasNext()) {
                        arrayList6.add(Integer.valueOf(((Msg) it3.next()).f));
                    }
                    c3.addAll(arrayList6);
                    SparseArray<Msg> F = o.F(cn30.c(), cn30.c);
                    ArrayList arrayList7 = new ArrayList(c5g.u(list3, 10));
                    for (Msg msg : list3) {
                        Msg msg2 = I0.get(msg.d);
                        if (msg2 == null) {
                            msg2 = F.get(msg.f);
                        }
                        if (msg2 == null) {
                            cn30.a(w2wVar2, msg);
                        } else {
                            cn30.d(w2wVar2, msg, msg2, true);
                        }
                        arrayList7.add(msg);
                    }
                    arrayList.add(arrayList7);
                }
                ArrayList v = c5g.v(arrayList);
                Iterator it4 = v.iterator();
                while (it4.hasNext()) {
                    Msg msg3 = (Msg) it4.next();
                    msg3.p = n140.b(msg3.d, 0, false);
                    msg3.u = d3;
                }
                xgl0Var2.o().W(v);
                return v;
            case 19:
                ((q8b0) ((vh40) obj3).k.getValue()).a((Playlist) obj2).b((Throwable) obj);
                return s3q0.a;
            case 20:
                ((iu50) obj3).b.a(new Pair<>((UserId) obj2, new d5v.a((Narrative) obj)));
                return s3q0.a;
            case 21:
                im90 im90Var = (im90) obj3;
                PasswordCheckInitStructure passwordCheckInitStructure = (PasswordCheckInitStructure) obj2;
                InitPasswordCheckResponse initPasswordCheckResponse = (InitPasswordCheckResponse) obj;
                im90Var.f = initPasswordCheckResponse;
                hm90 hm90Var = im90Var.b;
                n1c n1cVar = im90Var.g;
                InitPasswordCheckResponse.AccessFactor accessFactor = initPasswordCheckResponse.a;
                n1cVar.getClass();
                int i9 = n1c.a.$EnumSwitchMapping$0[accessFactor.ordinal()];
                if (i9 == 1) {
                    schemeStatSak$EventScreen = SchemeStatSak$EventScreen.PASSWORD_CUA;
                } else {
                    if (i9 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    schemeStatSak$EventScreen = SchemeStatSak$EventScreen.SMS_PROCESS_CUA;
                }
                SchemeStatSak$EventScreen schemeStatSak$EventScreen2 = schemeStatSak$EventScreen;
                SchemeStatSak$EventScreen schemeStatSak$EventScreen3 = SchemeStatSak$EventScreen.OTHER;
                new c0h0(schemeStatSak$EventScreen3, new SchemeStatSak$TypeVkConnectNavigationItem(SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, null, null, null, null, schemeStatSak$EventScreen3, null, schemeStatSak$EventScreen2, 94, null)).q();
                int i10 = im90.a.$EnumSwitchMapping$0[accessFactor.ordinal()];
                if (i10 == 1) {
                    hm90Var.i0();
                } else {
                    if (i10 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (passwordCheckInitStructure.f) {
                        hm90Var.Jd();
                    }
                    oju0 oju0Var = im90Var.c;
                    String str = im90Var.e;
                    boolean z3 = passwordCheckInitStructure.f;
                    String str2 = passwordCheckInitStructure.c;
                    Context context = oju0Var.a;
                    VkCheckAccessRequiredData vkCheckAccessRequiredData = new VkCheckAccessRequiredData(str, z3, str2, false);
                    if (z3) {
                        DefaultAuthActivity defaultAuthActivity = DefaultAuthActivity.U;
                        Intent intent = new Intent(context, (Class<?>) DefaultAuthActivity.BottomSheetActivity.class);
                        intent.putExtra("validateAccessData", vkCheckAccessRequiredData);
                        context.startActivity(intent);
                    } else {
                        FragmentManager fragmentManager = oju0Var.b;
                        Bundle bundle = new Bundle();
                        bundle.putParcelable("open_sms", vkCheckAccessRequiredData);
                        s3q0 s3q0Var = s3q0.a;
                        fragmentManager.k0(bundle, "key_check_access_result");
                    }
                }
                return s3q0.a;
            case 22:
                tho0 tho0Var = (tho0) obj;
                ((wh50) obj2).setValue(tho0Var);
                zak0 zak0Var = (zak0) ((lv90) obj3).l1;
                VkPeopleSearchParams copy = ((VkPeopleSearchParams) zak0Var.getValue()).copy();
                copy.h = tho0Var.a.c;
                zak0Var.setValue(copy);
                return s3q0.a;
            case 23:
                com.vk.movika.sdk.android.defaultplayer.container.e eVar = (com.vk.movika.sdk.android.defaultplayer.container.e) obj3;
                x3a0 x3a0Var = (x3a0) obj2;
                ConfirmResult confirmResult = (ConfirmResult) obj;
                par0.a.getClass();
                par0.a("Phone validation skip result: " + confirmResult);
                if (confirmResult == ConfirmResult.OK) {
                    eVar.invoke();
                } else {
                    x3a0Var.u0(new AuthException.UnknownException(null, null));
                }
                y3a0 y3a0Var = (y3a0) x3a0Var.a;
                if (y3a0Var != null) {
                    y3a0Var.S(false);
                }
                frf0.g(null, null, null, null, 12);
                return s3q0.a;
            case 24:
                com.vk.photos.root.photoflow.presentation.b bVar2 = (com.vk.photos.root.photoflow.presentation.b) obj3;
                bVar2.h.b(new b9a0.k(new j7k0(tq.h(tlo0.Companion, R.string.photo_flow_error_on_move), Integer.valueOf(R.drawable.vk_icon_warning_triangle_outline_28), Integer.valueOf(R.attr.vk_ui_accent_orange), new tlo0.f(R.string.photos_retry), new ge0(i3, bVar2, (a.f) obj2), null, 32)));
                return s3q0.a;
            case 25:
                com.vk.photos.root.photoflow.presentation.j jVar = (com.vk.photos.root.photoflow.presentation.j) obj3;
                Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj2;
                l.a aVar3 = (l.a) obj;
                int i11 = 17;
                gm50.a.a(jVar, aVar3.a, new kn20(jVar, i11));
                gm50.a.a(jVar, aVar3.b, new v4w(jVar, 15));
                gm50.a.a(jVar, aVar3.c, new hl1(26, jVar, ref$BooleanRef));
                gm50.a.a(jVar, aVar3.d, new sf4(i11, jVar, ref$BooleanRef));
                gm50.a.a(jVar, aVar3.e, new fju(jVar, i4));
                return s3q0.a;
            case 26:
                frg frgVar = (frg) obj3;
                mor morVar = (mor) obj2;
                rtb0.a aVar4 = (rtb0.a) obj;
                if (aVar4.b) {
                    frgVar.invoke(aVar4.a);
                    s3q0 s3q0Var2 = s3q0.a;
                } else {
                    morVar.invoke();
                    s3q0 s3q0Var3 = s3q0.a;
                }
                return s3q0.a;
            case 27:
                ?? r1 = (Integer) obj;
                r1.intValue();
                ((Ref$ObjectRef) obj3).element = r1;
                ((CountDownLatch) obj2).countDown();
                return s3q0.a;
            case 28:
                ggj ggjVar = (ggj) obj;
                ggjVar.s1();
                ((lop0) obj3).a(ggjVar, ((Number) ((c1h) obj2).r.getValue()).floatValue());
                return s3q0.a;
            default:
                gzs gzsVar = (gzs) obj2;
                jdo0 jdo0Var = (jdo0) obj;
                ((gzs) obj3).invoke();
                if (gzsVar != null ? ((Boolean) gzsVar.invoke()).booleanValue() : true) {
                    jdo0Var.close();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ zf1(com.vk.story.viewer.impl.presentation.stories.view.dynstickers.poll.f fVar, frg frgVar, mor morVar) {
        this.b = 26;
        this.c = frgVar;
        this.d = morVar;
    }
}
