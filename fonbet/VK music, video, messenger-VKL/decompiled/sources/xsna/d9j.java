package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.base.dto.BaseCityDto;
import com.vk.api.generated.base.dto.BaseSexDto;
import com.vk.api.generated.friends.dto.FriendsGetFieldsResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.catalog2.common.ui.holders.group.GroupVh;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.CircularProgressView;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.PrivacyRules;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.bonus.StickersBonusResult;
import com.vk.dto.user.UserProfile;
import com.vk.ecomm.categories.api.MarketBridgeCategory;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.stickers.views.sticker.ImStickerView;
import com.vk.superapp.api.dto.user.WebUserShortInfo;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.az20;
import xsna.g1e0;
import xsna.l3s;
import xsna.lv00;
import xsna.nfd0;
import xsna.p810;
import xsna.pdg0;
import xsna.qr60;
import xsna.tij;
import xsna.v1j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class d9j implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d9j(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v31, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v43 */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        d3b0 f;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        Object obj2;
        Object obj3;
        Object obj4;
        di30 di30Var;
        Object obj5;
        int i = this.b;
        ?? r4 = 0;
        int i2 = 1;
        Object obj6 = this.c;
        switch (i) {
            case 0:
                nlq0 nlq0Var = (nlq0) obj;
                return Boolean.valueOf((((e9j) obj6).e.a(new UserId(nlq0Var.a)) || nlq0Var.l) ? false : true);
            case 1:
                lak lakVar = (lak) obj6;
                mhy.d(lakVar.s);
                lakVar.r.invoke(v1j.f.b);
                return s3q0.a;
            case 2:
                return ((shm) obj6).Y0((m420) obj);
            case 3:
                ((CircularProgressView) obj).setColor(((kkm) obj6).f(R.attr.vk_ui_text_accent_themed));
                return s3q0.a;
            case 4:
                r5p r5pVar = (r5p) obj6;
                Source source = Source.ACTUAL;
                if (r5pVar.d == null) {
                    io.reactivex.rxjava3.internal.operators.single.c C = r5pVar.a.C(r5pVar, new wt(r5pVar.b, source));
                    asu0 asu0Var = asu0.a;
                    r5pVar.d = io.reactivex.rxjava3.kotlin.c.e(new io.reactivex.rxjava3.internal.operators.single.j(C.q(asu0Var.c()).m(asu0Var.d()), new e9b(r5pVar, i2)), new dam(3), new cvh(r5pVar, 5));
                }
                return s3q0.a;
            case 5:
                ikp ikpVar = (ikp) obj6;
                wjp wjpVar = ikpVar.h;
                if (wjpVar != null) {
                    wjpVar.k0();
                }
                wjp wjpVar2 = ikpVar.h;
                if (wjpVar2 != null) {
                    wjpVar2.h0();
                }
                wjp wjpVar3 = ikpVar.h;
                if (wjpVar3 != null) {
                    wjpVar3.F();
                }
                dw20 dw20Var = ikpVar.g;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                    ikpVar.g = null;
                }
                return s3q0.a;
            case 6:
                return ((dcq) obj6).a;
            case 7:
                return v0r.p((v0r) obj6, (Context) obj, null, null, true, 32);
            case 8:
                vzr vzrVar = (vzr) obj;
                vzr a = vzr.a(vzrVar, null, null, null, null, null, false, null, null, (Set) obj6, null, 6143);
                return vzr.a(a, pzr.E(vzrVar.a, a), pzr.B(vzrVar.b, a), pzr.E(vzrVar.c, a), pzr.B(vzrVar.d, a), null, false, null, null, null, null, 8176);
            case 9:
                ((h3s) obj6).T(new l3s.d.a((Throwable) obj));
                return s3q0.a;
            case 10:
                evs evsVar = (evs) obj6;
                lcx lcxVar = evsVar.q;
                if (lcxVar != null && (f = lcxVar.f()) != null) {
                    evsVar.y().bk(new b1t0(f));
                }
                return s3q0.a;
            case 11:
                fws fwsVar = (fws) obj6;
                String str = (String) obj;
                return new io.reactivex.rxjava3.internal.operators.observable.p1(syt.d(fwsVar.c, str, null, 2).U(new s41(new qbl(str, i2), 17)), new vx6(new x2e(fwsVar, 18), 14));
            case 12:
                ((crs) ((jit) obj6).a.getValue()).getClass();
                List<UsersUserFullDto> d = ((FriendsGetFieldsResponseDto) obj).d();
                ArrayList arrayList = new ArrayList(c5g.u(d, 10));
                for (UsersUserFullDto usersUserFullDto : d) {
                    UserId s1 = usersUserFullDto.s1();
                    String D0 = usersUserFullDto.D0();
                    if (D0 == null) {
                        D0 = "";
                    }
                    String x1 = usersUserFullDto.x1();
                    String str2 = x1 != null ? x1 : "";
                    boolean z = usersUserFullDto.L2() == BaseSexDto.FEMALE;
                    Boolean T2 = usersUserFullDto.T2();
                    Boolean bool = Boolean.TRUE;
                    boolean f2 = epx.f(T2, bool);
                    boolean f3 = epx.f(usersUserFullDto.l(), bool);
                    WebImage a2 = ikw.a(usersUserFullDto);
                    BaseCityDto G = usersUserFullDto.G();
                    arrayList.add(new WebUserShortInfo(s1, D0, str2, z, f2, f3, a2, G != null ? G.getTitle() : null));
                }
                return arrayList;
            case 13:
                bmt.this.e(new cmt(new qr60.a.d(true)));
                return s3q0.a;
            case 14:
                GiftsCatalogFragment giftsCatalogFragment = (GiftsCatalogFragment) obj6;
                JSONObject jSONObject = (JSONObject) obj;
                if (giftsCatalogFragment.a0 != null) {
                    Context requireContext = giftsCatalogFragment.requireContext();
                    if (jSONObject != null && (optJSONObject2 = jSONObject.optJSONObject("stickers_bonus_result")) != null) {
                        gl7 gl7Var = new gl7();
                        Serializer.c<StickersBonusResult> cVar = StickersBonusResult.CREATOR;
                        gl7Var.a(requireContext, StickersBonusResult.a.a(optJSONObject2));
                    }
                    if (jSONObject != null && (optJSONObject = jSONObject.optJSONObject("recipient")) != null) {
                        int i3 = optJSONObject.getInt("id");
                        boolean z2 = optJSONObject.getBoolean("can_write_private_message");
                        boolean z3 = optJSONObject.getBoolean("can_view_gifts");
                        String D = f370.D(optJSONObject, "first_name_gen");
                        if (z2) {
                            g2v.c().b().d(i3, giftsCatalogFragment.requireContext());
                            s3q0 s3q0Var = s3q0.a;
                        } else if (z3) {
                            zal0 a3 = g2v.d().a();
                            UserProfile userProfile = new UserProfile();
                            userProfile.c = new UserId(i3);
                            s3q0 s3q0Var2 = s3q0.a;
                            a3.f(requireContext, userProfile, D);
                        }
                    }
                }
                return jSONObject;
            case 15:
                ((GroupVh) obj6).onClick((View) obj);
                return s3q0.a;
            case 16:
                kqv kqvVar = (kqv) obj6;
                tdu tduVar = (tdu) obj;
                l5g l5gVar = (l5g) ((zak0) kqvVar.e).getValue();
                boolean booleanValue = ((Boolean) ((zak0) kqvVar.c).getValue()).booleanValue();
                boolean d2 = l5gVar == null ? false : l5g.d(l5gVar.a, l5g.k);
                float f4 = 1.0f;
                if (d2 && !booleanValue) {
                    f4 = 0.64f;
                }
                tduVar.b(f4);
                return s3q0.a;
            case 17:
                l4w l4wVar = (l4w) obj6;
                io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar3 = l4wVar.y;
                if (cVar3 != null) {
                    cVar3.dispose();
                }
                l4wVar.y = cVar2;
                return s3q0.a;
            case 18:
                int i4 = ImStickerView.p;
                ((ImStickerView) obj6).getClass();
                return Boolean.valueOf(obj instanceof lnw);
            case 19:
                zrw zrwVar = (zrw) obj6;
                com.vk.voip.ui.sessionrooms.f fVar = (com.vk.voip.ui.sessionrooms.f) obj;
                zrwVar.getClass();
                zrwVar.l = fVar.b;
                zrwVar.n = fVar.c;
                zrwVar.j();
                zrwVar.v.setVisibility(fVar.e ? 0 : 8);
                return s3q0.a;
            case 20:
                return new com.vk.stickers.keyboard.navigation.h((ViewGroup) obj, ((com.vk.stickers.keyboard.navigation.a) obj6).k);
            case 21:
                ((io.reactivex.rxjava3.core.y) obj6).b((Throwable) obj);
                return s3q0.a;
            case 22:
                doz dozVar = (doz) obj6;
                PrivacySetting privacySetting = (PrivacySetting) obj;
                privacySetting.e = zed0.a(privacySetting.e);
                List<String> list = privacySetting.f;
                ArrayList arrayList2 = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    nfd0.b a4 = nfd0.a.a((String) it.next(), false, null);
                    if (a4 != null) {
                        arrayList2.add(a4);
                    }
                }
                List<nfd0.b> singletonList = Collections.singletonList(new nfd0.b("forbidden_some", false, new PrivacyRules.Exclude(), R.string.privacy_add_friends_or_lists, new nfd0.c.b()));
                nfd0 nfd0Var = dozVar.D;
                nfd0Var.h = arrayList2;
                nfd0Var.i = singletonList;
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    nfd0.b bVar = (nfd0.b) it2.next();
                    if (bVar.e == null) {
                        dozVar.S0(true, bVar);
                    } else {
                        dozVar.T0(true, bVar);
                    }
                }
                List<nfd0.b> list2 = singletonList;
                for (nfd0.b bVar2 : list2) {
                    if (bVar2.e == null) {
                        dozVar.S0(false, bVar2);
                    } else {
                        dozVar.T0(false, bVar2);
                    }
                }
                Object obj7 = EmptyList.b;
                Object obj8 = obj7;
                Object obj9 = obj8;
                Object obj10 = obj9;
                for (PrivacySetting.PrivacyRule privacyRule : privacySetting.e) {
                    String str3 = (String) j5g.b0(r4, privacyRule.zb());
                    nfd0.b a5 = str3 != null ? nfd0.a.a(str3, r4, null) : null;
                    if (a5 != null) {
                        nfd0Var.e = a5;
                        obj2 = obj7;
                    } else {
                        long j = 2000000000;
                        if (privacyRule instanceof PrivacyRules.Exclude) {
                            Iterator<T> it3 = list2.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    obj4 = it3.next();
                                    if (((nfd0.b) obj4).c instanceof PrivacyRules.Exclude) {
                                    }
                                } else {
                                    obj4 = null;
                                }
                            }
                            nfd0Var.f = (nfd0.b) obj4;
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            Iterator it4 = ((ArrayList) ((PrivacyRules.UserListPrivacyRule) privacyRule).Cb()).iterator();
                            while (it4.hasNext()) {
                                UserId userId = (UserId) it4.next();
                                Object obj11 = obj7;
                                long j2 = userId.b;
                                if (j2 < 2000000000) {
                                    arrayList3.add(userId);
                                } else {
                                    arrayList4.add(Integer.valueOf((int) (j2 - 2000000000)));
                                }
                                obj7 = obj11;
                            }
                            obj2 = obj7;
                            Pair pair = new Pair(arrayList3, arrayList4);
                            Object i5 = pair.i();
                            obj10 = pair.j();
                            obj9 = i5;
                        } else {
                            obj2 = obj7;
                            if (privacyRule instanceof PrivacyRules.Include) {
                                Iterator it5 = arrayList2.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        obj3 = it5.next();
                                        if (((nfd0.b) obj3).c instanceof PrivacyRules.Include) {
                                        }
                                    } else {
                                        obj3 = null;
                                    }
                                }
                                nfd0Var.e = (nfd0.b) obj3;
                                ArrayList arrayList5 = new ArrayList();
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it6 = ((ArrayList) ((PrivacyRules.UserListPrivacyRule) privacyRule).Cb()).iterator();
                                while (it6.hasNext()) {
                                    UserId userId2 = (UserId) it6.next();
                                    long j3 = j;
                                    long j4 = userId2.b;
                                    if (j4 < j3) {
                                        arrayList5.add(userId2);
                                    } else {
                                        arrayList6.add(Integer.valueOf((int) (j4 - j3)));
                                    }
                                    j = j3;
                                }
                                Pair pair2 = new Pair(arrayList5, arrayList6);
                                Object i6 = pair2.i();
                                obj8 = pair2.j();
                                obj7 = i6;
                                r4 = 0;
                            }
                        }
                    }
                    obj7 = obj2;
                    r4 = 0;
                }
                dozVar.f1(new tij.a((List) obj7, (List) obj8, (List) obj9, (List) obj10));
                return s3q0.a;
            case 23:
                return Boolean.valueOf(!((a000) obj6).h.a());
            case 24:
                iv00 iv00Var = (iv00) obj6;
                lv00 lv00Var = (lv00) obj;
                int i7 = iv00.p1;
                if (!(lv00Var instanceof lv00.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                MarketBridgeCategory marketBridgeCategory = ((lv00.a) lv00Var).a;
                if (marketBridgeCategory != null && (di30Var = iv00Var.i1) != null) {
                    di30Var.invoke(marketBridgeCategory);
                }
                iv00Var.dismiss();
                return s3q0.a;
            case 25:
                ((f810) obj6).T(new p810.p((Throwable) obj));
                return s3q0.a;
            case 26:
                q3v0 q3v0Var = ((h120) obj6).a;
                Attach attach = (Attach) q3v0Var.f.get(q3v0Var.s);
                Activity b = c63.b();
                if (b != null) {
                    q3v0Var.e.A(b, wdw.b(attach, null, false, 6), com.vk.dto.common.a.a(q3v0Var.i));
                }
                return s3q0.a;
            case 27:
                f1e0 f1e0Var = (f1e0) obj;
                ruf0 ruf0Var = ((ia20) obj6).c;
                ruf0Var.getClass();
                if (f1e0Var.f()) {
                    return new ProfilesInfo();
                }
                g1e0.a aVar = new g1e0.a();
                aVar.a.e(f1e0Var);
                aVar.b = Source.NETWORK;
                aVar.d = ruf0Var;
                pdg0 n = ruf0Var.a.n(ruf0Var, new d1e0(new g1e0(aVar)));
                if (n instanceof pdg0.a) {
                    obj5 = new ProfilesInfo();
                } else {
                    if (!(n instanceof pdg0.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    obj5 = ((pdg0.b) n).a;
                }
                return (ProfilesInfo) obj5;
            case 28:
                eg20 eg20Var = (eg20) obj6;
                if (((w8v) obj).b.p()) {
                    eg20Var.e.g();
                }
                return s3q0.a;
            default:
                ((zak0) ((az20) obj6).k).setValue((az20.e) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ d9j(Set set, pzr pzrVar) {
        this.b = 8;
        this.c = set;
    }
}
