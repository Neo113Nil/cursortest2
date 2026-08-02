package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vk.dto.user.deactivation.Deactivation;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.external.miniapp.net.app.WebImage;
import com.vk.log.L;
import com.vk.multiaccount.api.domain.model.VkClientOpenSwitcherConfig;
import com.vk.profile.user.api.domain.actions.ProfileAction;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$AnotherUserProfileEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$ServiceItem;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$ServicesEvent;
import com.vk.stat.scheme.MobileOfficialAppsProfileStat$UserMenuEvent;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.toggle.features.CoreFeatures;
import com.vk.upload.impl.tasks.t;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.atq0;
import xsna.gs90;
import xsna.ios;
import xsna.moq0;
import xsna.nyd0;
import xsna.wg90;
import xsna.yuq0;
import xsna.zp0;

/* compiled from: UserProfileHeaderFeatureDelegate.kt */
/* loaded from: classes5.dex */
public final class fqq0 implements huq {
    public final Context b;
    public final ProfileAction.a c;
    public final ouq0 d;
    public final dvq0 e;
    public final lyd0 f;
    public final l36 g;
    public final hlu0 h;
    public final jlu0 i;
    public final String j;
    public u5p0 k;
    public izs<? super com.vk.profile.user.impl.ui.b, s3q0> l;
    public fpq0 m;
    public final Object n = msy.a(LazyThreadSafetyMode.NONE, new qdh0(3));

    /* compiled from: UserProfileHeaderFeatureDelegate.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final gzs<s3q0> c;
        public final gzs<s3q0> d;

        public a(int i, int i2, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
            this.a = i;
            this.b = i2;
            this.c = gzsVar;
            this.d = gzsVar2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + sf3.a(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationSettings(enableMessage=");
            sb.append(this.a);
            sb.append(", disableMessage=");
            sb.append(this.b);
            sb.append(", onSuccess=");
            sb.append(this.c);
            sb.append(", cancelAction=");
            return uf3.d(sb, this.d, ')');
        }
    }

    /* compiled from: UserProfileHeaderFeatureDelegate.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VkClientOpenSwitcherConfig.values().length];
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_AUTH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VkClientOpenSwitcherConfig.OPEN_SWITCHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public fqq0(Context context, ProfileAction.a aVar, ouq0 ouq0Var, dvq0 dvq0Var, lyd0 lyd0Var, l36 l36Var, hlu0 hlu0Var, jlu0 jlu0Var, String str) {
        this.b = context;
        this.c = aVar;
        this.d = ouq0Var;
        this.e = dvq0Var;
        this.f = lyd0Var;
        this.g = l36Var;
        this.h = hlu0Var;
        this.i = jlu0Var;
        this.j = str;
    }

    @Override // xsna.huq
    public final void H(fpq0 fpq0Var) {
        this.m = fpq0Var;
    }

    @Override // xsna.huq
    public final void J(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.a aVar) {
        RectF rectF;
        Bundle extras;
        Intent intent = aVar.d;
        Boolean bool = null;
        String str = this.j;
        int n = xo9.n(13195, hashCode(), 8, str != null ? Integer.valueOf(str.hashCode()) : null);
        L.o(new mzl0(aVar, this, n));
        if (aVar.a() && aVar.b == n) {
            String stringExtra = intent != null ? intent.getStringExtra("__cover_url_key__") : null;
            if (stringExtra == null) {
                stringExtra = "";
            }
            String str2 = stringExtra;
            if (intent == null || (rectF = (RectF) intent.getParcelableExtra("__cover_rect_key__")) == null) {
                rectF = new RectF();
            }
            if (intent != null && (extras = intent.getExtras()) != null) {
                bool = Boolean.valueOf(extras.getBoolean("is_from_gallery"));
            }
            if (bool != null) {
                boolean booleanValue = bool.booleanValue();
                lyd0 lyd0Var = this.f;
                if (booleanValue) {
                    lyd0Var.f().c();
                } else {
                    lyd0Var.f().b();
                }
            }
            com.vk.upload.impl.a.i(new com.vk.upload.impl.tasks.t(new t.a(str2, Float.valueOf(rectF.left), Float.valueOf(rectF.top), Float.valueOf(rectF.right), Float.valueOf(rectF.bottom))));
        }
    }

    @Override // xsna.ruu
    public final izs<com.vk.profile.user.impl.ui.b, s3q0> L() {
        izs izsVar = this.l;
        if (izsVar != null) {
            return izsVar;
        }
        return null;
    }

    public final void a(ListBuilder listBuilder) {
        if (this.h.a()) {
            int i = b.$EnumSwitchMapping$0[this.i.d(MultiAccountEntryPoint.ProfileMenu.d).ordinal()];
            if (i == 1) {
                moq0.c.a aVar = moq0.c.a.g;
                aVar.c = true;
                listBuilder.add(aVar);
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                moq0.c.s sVar = moq0.c.s.g;
                sVar.c = true;
                listBuilder.add(sVar);
            }
        }
    }

    public final void b(ExtendedUserProfile extendedUserProfile) {
        this.f.j().d();
        dvq0 dvq0Var = this.e;
        dvq0Var.b(dvq0Var.g(extendedUserProfile));
        fpq0 fpq0Var = this.m;
        if (fpq0Var == null) {
            fpq0Var = null;
        }
        fpq0Var.B(new f.h(new atq0.d(Integer.valueOf(R.string.link_copied), null, null, null, 0, null, null, 254)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r4v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v21, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlin.collections.EmptyList] */
    public final void c(com.vk.profile.user.impl.ui.g gVar, UserProfileAction.m mVar) {
        ImageSize Cb;
        ?? r4;
        ArrayList arrayList;
        List<ytd0> list;
        je80 je80Var;
        wg90.a aVar;
        String optString;
        ?? r9;
        Map<String, String> map;
        ListBuilder g;
        ExtendedUserProfile extendedUserProfile = gVar.j;
        if (extendedUserProfile == null) {
            return;
        }
        boolean z = mVar instanceof UserProfileAction.m.c;
        moq0.c.C3356c c3356c = moq0.c.C3356c.g;
        r6 = false;
        r6 = false;
        boolean z2 = false;
        r7 = null;
        String str = null;
        if (z) {
            UserProfileAction.m.c cVar = (UserProfileAction.m.c) mVar;
            if (extendedUserProfile.g()) {
                ListBuilder e = e43.e();
                e.add(moq0.c.o.g);
                moq0.c.e eVar = moq0.c.e.g;
                eVar.c = false;
                e.add(eVar);
                Deactivation deactivation = extendedUserProfile.q;
                if ((deactivation != null ? deactivation.getReason() : null) == Deactivation.Reason.Blacklisted) {
                    e.add(moq0.c.m.g);
                }
                if (bwd0.e(extendedUserProfile)) {
                    e.add(moq0.c.l.g);
                }
                if (extendedUserProfile.a.Z) {
                    e.add(c3356c);
                } else if (extendedUserProfile.i0) {
                    e.add(moq0.c.t.g);
                }
                a(e);
                g = e.g();
            } else {
                ListBuilder e2 = e43.e();
                e2.add(moq0.c.h.g);
                e2.add(moq0.c.d.g);
                moq0.c.e eVar2 = moq0.c.e.g;
                eVar2.c = true;
                e2.add(eVar2);
                e2.add(moq0.c.p.g);
                moq0.c.r rVar = moq0.c.r.g;
                rVar.c = true;
                e2.add(rVar);
                e2.add(moq0.c.q.g);
                moq0.c.f fVar = moq0.c.f.g;
                wvd0 wvd0Var = extendedUserProfile.T1;
                p4g.a(fVar, e2, wvd0Var != null ? wvd0Var.a : false);
                moq0.c.g gVar2 = moq0.c.g.g;
                if (((Boolean) this.n.getValue()).booleanValue() && bwd0.d(extendedUserProfile) && extendedUserProfile.B1) {
                    z2 = true;
                }
                p4g.a(gVar2, e2, z2);
                moq0.c.j jVar = moq0.c.j.g;
                jVar.c = true;
                e2.add(jVar);
                moq0.c.n nVar = moq0.c.n.g;
                nVar.c = true;
                e2.add(nVar);
                moq0.c.i iVar = moq0.c.i.g;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                p4g.a(iVar, e2, p1p0.a(com.vk.toggle.b.A.i(CoreFeatures.PROFILE_HELP_BUTTON)));
                a(e2);
                g = e2.g();
            }
            fpq0 fpq0Var = this.m;
            (fpq0Var != null ? fpq0Var : null).B(new f.c.k(cVar.b, cVar.c, g));
            return;
        }
        boolean z3 = mVar instanceof UserProfileAction.m.e;
        moq0.d.a aVar2 = moq0.d.a.f;
        moq0.d.C3357d c3357d = moq0.d.C3357d.f;
        moq0.d.c cVar2 = moq0.d.c.f;
        moq0.d.f fVar2 = moq0.d.f.f;
        moq0.d.b bVar = moq0.d.b.f;
        moq0.d.e eVar3 = moq0.d.e.f;
        if (z3) {
            UserProfileAction.m.e eVar4 = (UserProfileAction.m.e) mVar;
            ListBuilder e3 = e43.e();
            if (extendedUserProfile.j1) {
                e3.add(eVar3);
            } else if (extendedUserProfile.G1) {
                e3.add(bVar);
            }
            if (extendedUserProfile.I1) {
                e3.add(fVar2);
            } else if (extendedUserProfile.H1) {
                e3.add(cVar2);
            }
            if (extendedUserProfile.h1 && !extendedUserProfile.a.G() && (extendedUserProfile.k1 == null || extendedUserProfile.i1)) {
                if (extendedUserProfile.i1) {
                    e3.add(c3357d);
                } else {
                    e3.add(aVar2);
                }
            }
            ListBuilder g2 = e3.g();
            fpq0 fpq0Var2 = this.m;
            (fpq0Var2 != null ? fpq0Var2 : null).B(new f.c.l(eVar4.b, eVar4.c, g2));
            return;
        }
        boolean equals = mVar.equals(UserProfileAction.m.j.b);
        lyd0 lyd0Var = this.f;
        if (equals) {
            int b2 = this.d.b();
            ProfileAction.a aVar3 = this.c;
            List<ProfileAction> c = aVar3.c(extendedUserProfile, b2);
            ArrayList b3 = aVar3.b(extendedUserProfile, false);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : b3) {
                if (((ProfileAction) obj).getType() == ProfileAction.Type.OPEN_APP) {
                    arrayList2.add(obj);
                }
            }
            List<ProfileAction> a2 = aVar3.a(extendedUserProfile, false);
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : a2) {
                if (((ProfileAction) obj2).getType() == ProfileAction.Type.OPEN_APP) {
                    arrayList3.add(obj2);
                }
            }
            Hint p = ((wvw) this.g.a).b().p(HintId.PROFILE_REDESIGN_SERVICES_MENU_BANNER.getId());
            String str2 = (p == null || (map = p.e) == null) ? null : map.get("services_onboarding_panel");
            if (str2 != null) {
                JSONObject jSONObject = new JSONObject(str2);
                long optLong = jSONObject.optLong("uid", 0L);
                String optString2 = jSONObject.optString("title");
                String optString3 = jSONObject.optString("subtitle");
                WebImage.a aVar4 = WebImage.CREATOR;
                JSONArray optJSONArray = jSONObject.optJSONArray("icon");
                aVar4.getClass();
                WebImage a3 = WebImage.a.a(optJSONArray);
                JSONObject optJSONObject = jSONObject.optJSONObject("action");
                if (optJSONObject == null || (optString = optJSONObject.optString("type")) == null || !optString.equals("show_video_cards_onboarding")) {
                    aVar = null;
                } else {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("video_cards");
                    if (optJSONArray2 != null) {
                        r9 = new ArrayList(optJSONArray2.length());
                        int length = optJSONArray2.length();
                        for (int i = 0; i < length; i++) {
                            JSONObject jSONObject2 = optJSONArray2.getJSONObject(i);
                            r9.add(new h8s0(jSONObject2.optString("title"), jSONObject2.optString("subtitle"), jSONObject2.optString("video_url_light"), jSONObject2.optString("video_url_dark"), jSONObject2.optString("button_text")));
                        }
                    } else {
                        r9 = EmptyList.b;
                    }
                    aVar = new wg90.a(r9);
                }
                je80Var = new je80(optLong, optString2, optString3, a3, aVar);
            } else {
                je80Var = null;
            }
            List singletonList = je80Var != null ? Collections.singletonList(new yuq0.a(je80Var)) : EmptyList.b;
            ArrayList u0 = j5g.u0(arrayList3, j5g.u0(arrayList2, c));
            ArrayList arrayList4 = new ArrayList(c5g.u(u0, 10));
            Iterator it = u0.iterator();
            while (it.hasNext()) {
                arrayList4.add(new yuq0.b((ProfileAction) it.next()));
            }
            nyd0.k h = lyd0Var.h();
            h.getClass();
            h.b(MobileOfficialAppsProfileStat$ServicesEvent.ServicesEventType.CLICK_TO_SERVICES, null, null);
            List list2 = singletonList;
            if (!list2.isEmpty()) {
                fpq0 fpq0Var3 = this.m;
                if (fpq0Var3 == null) {
                    fpq0Var3 = null;
                }
                fpq0Var3.B(new f.C1726f(((yuq0.a) j5g.Y(singletonList)).b.a));
            }
            fpq0 fpq0Var4 = this.m;
            (fpq0Var4 != null ? fpq0Var4 : null).B(new f.c.p(j5g.u0(arrayList4, list2)));
            return;
        }
        if (mVar.equals(UserProfileAction.m.g.b)) {
            fpq0 fpq0Var5 = this.m;
            (fpq0Var5 != null ? fpq0Var5 : null).B(new f.e.b1(extendedUserProfile));
            return;
        }
        boolean z4 = mVar instanceof UserProfileAction.m.a;
        moq0.b.C3355b c3355b = moq0.b.C3355b.f;
        moq0.b.a aVar5 = moq0.b.a.f;
        if (z4) {
            UserProfileAction.m.a aVar6 = (UserProfileAction.m.a) mVar;
            fpq0 fpq0Var6 = this.m;
            (fpq0Var6 != null ? fpq0Var6 : null).B(new f.c.C1719f(aVar6.b, aVar6.c, e43.l(aVar5, c3355b)));
            return;
        }
        if (mVar instanceof UserProfileAction.m.i) {
            ProfileAction profileAction = ((UserProfileAction.m.i) mVar).b;
            gs90.a payload = profileAction.getPayload();
            WebApiApplication webApiApplication = payload != null ? payload.a : null;
            if (webApiApplication != null) {
                lyd0Var.h().a(webApiApplication.b, null);
                fpq0 fpq0Var7 = this.m;
                if (fpq0Var7 == null) {
                    fpq0Var7 = null;
                }
                fpq0Var7.B(new f.e.y(webApiApplication));
            } else if (profileAction.getType() == ProfileAction.Type.PROFILE_QUESTION) {
                nyd0.k h2 = lyd0Var.h();
                MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType nativeServiceType = MobileOfficialAppsProfileStat$ServiceItem.NativeServiceType.QUESTIONS;
                oyd0.a(nativeServiceType);
                h2.a(-1L, nativeServiceType);
                fpq0 fpq0Var8 = this.m;
                if (fpq0Var8 == null) {
                    fpq0Var8 = null;
                }
                fpq0Var8.B(new f.e.z0(extendedUserProfile));
            } else if (profileAction.getType() == ProfileAction.Type.MEMORIES) {
                lyd0Var.j().c();
                fpq0 fpq0Var9 = this.m;
                if (fpq0Var9 == null) {
                    fpq0Var9 = null;
                }
                fpq0Var9.B(f.e.p0.a);
            }
            xtd0 xtd0Var = extendedUserProfile.N1;
            if (xtd0Var == null || (list = xtd0Var.a) == null) {
                r4 = 0;
            } else {
                List<ytd0> list3 = list;
                r4 = new ArrayList(c5g.u(list3, 10));
                for (ytd0 ytd0Var : list3) {
                    if (epx.f(ytd0Var.b, profileAction.getType().h())) {
                        ytd0Var = ytd0.a(ytd0Var);
                    }
                    r4.add(ytd0Var);
                }
            }
            if (r4 == 0) {
                r4 = EmptyList.b;
            }
            extendedUserProfile.N1 = new xtd0(r4);
            ArrayList arrayList5 = extendedUserProfile.M1;
            if (arrayList5 != null) {
                arrayList = new ArrayList(c5g.u(arrayList5, 10));
                Iterator it2 = arrayList5.iterator();
                while (it2.hasNext()) {
                    List<ytd0> list4 = ((xtd0) it2.next()).a;
                    ArrayList arrayList6 = new ArrayList(c5g.u(list4, 10));
                    for (ytd0 ytd0Var2 : list4) {
                        if (epx.f(ytd0Var2.b, profileAction.getType().h())) {
                            ytd0Var2 = ytd0.a(ytd0Var2);
                        }
                        arrayList6.add(ytd0Var2);
                    }
                    arrayList.add(new xtd0(arrayList6));
                }
            } else {
                arrayList = null;
            }
            extendedUserProfile.M1 = arrayList;
            izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = this.l;
            (izsVar != null ? izsVar : null).invoke(new b.y(extendedUserProfile));
            return;
        }
        if (mVar instanceof UserProfileAction.m.f) {
            moq0.d dVar = ((UserProfileAction.m.f) mVar).b;
            if (epx.f(dVar, bVar)) {
                f(extendedUserProfile, true);
                return;
            }
            if (epx.f(dVar, eVar3)) {
                f(extendedUserProfile, false);
                return;
            }
            if (epx.f(dVar, cVar2)) {
                g(extendedUserProfile, true);
                return;
            }
            if (epx.f(dVar, fVar2)) {
                g(extendedUserProfile, false);
                return;
            } else if (epx.f(dVar, aVar2)) {
                e(extendedUserProfile, true);
                return;
            } else {
                if (!epx.f(dVar, c3357d)) {
                    throw new NoWhenBranchMatchedException();
                }
                e(extendedUserProfile, false);
                return;
            }
        }
        if (!(mVar instanceof UserProfileAction.m.d)) {
            if (!(mVar instanceof UserProfileAction.m.b)) {
                if (!mVar.equals(UserProfileAction.m.h.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                fpq0 fpq0Var10 = this.m;
                (fpq0Var10 != null ? fpq0Var10 : null).B(f.d.c.a);
                return;
            }
            moq0.b bVar2 = ((UserProfileAction.m.b) mVar).b;
            if (epx.f(bVar2, aVar5)) {
                b(extendedUserProfile);
                return;
            } else {
                if (!epx.f(bVar2, c3355b)) {
                    throw new NoWhenBranchMatchedException();
                }
                u5p0 u5p0Var = this.k;
                (u5p0Var != null ? u5p0Var : null).invoke(new UserProfileAction.s.a.b.C1692b(zp0.a.k.g));
                return;
            }
        }
        moq0.c cVar3 = ((UserProfileAction.m.d) mVar).b;
        if (epx.f(cVar3, moq0.c.d.g)) {
            lyd0Var.j().a();
            String str3 = this.j;
            final int n = xo9.n(13195, hashCode(), 8, str3 != null ? Integer.valueOf(str3.hashCode()) : null);
            L.o(new gzs() { // from class: xsna.eqq0
                @Override // xsna.gzs
                public final Object invoke() {
                    StringBuilder sb = new StringBuilder("UserProfileHeaderFeatureDelegate: openChangeCover(): saltStableId = ");
                    fqq0 fqq0Var = fqq0.this;
                    String str4 = fqq0Var.j;
                    sb.append(str4 != null ? Integer.valueOf(str4.hashCode()) : null);
                    sb.append(", saltFallbackId = ");
                    sb.append(fqq0Var.hashCode());
                    sb.append(", requestCode = ");
                    sb.append(n);
                    return sb.toString();
                }
            });
            fpq0 fpq0Var11 = this.m;
            if (fpq0Var11 == null) {
                fpq0Var11 = null;
            }
            Image image = extendedUserProfile.a.O;
            if (image != null && (Cb = image.Cb(400, true, false)) != null) {
                str = Cb.d.d;
            }
            fpq0Var11.B(new f.e.C1724e(str, n));
            return;
        }
        if (epx.f(cVar3, moq0.c.h.g)) {
            nyd0.n j = lyd0Var.j();
            j.getClass();
            j.e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_CHANGE_PROFILE);
            fpq0 fpq0Var12 = this.m;
            (fpq0Var12 != null ? fpq0Var12 : null).B(f.c.g.a);
            return;
        }
        if (epx.f(cVar3, moq0.c.q.g)) {
            UserId userId = extendedUserProfile.a.c;
            nyd0.n j2 = lyd0Var.j();
            j2.getClass();
            j2.e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_STATS);
            fpq0 fpq0Var13 = this.m;
            (fpq0Var13 != null ? fpq0Var13 : null).B(new f.e.c1(userId));
            return;
        }
        if (epx.f(cVar3, moq0.c.f.g)) {
            fpq0 fpq0Var14 = this.m;
            (fpq0Var14 != null ? fpq0Var14 : null).B(f.e.k0.a);
            return;
        }
        if (epx.f(cVar3, moq0.c.r.g)) {
            nyd0.n j3 = lyd0Var.j();
            j3.getClass();
            j3.e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_ARCHIVE);
            fpq0 fpq0Var15 = this.m;
            (fpq0Var15 != null ? fpq0Var15 : null).B(f.e.d1.a);
            return;
        }
        if (epx.f(cVar3, moq0.c.i.g)) {
            nyd0.n j4 = lyd0Var.j();
            j4.getClass();
            j4.e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_HELP);
            fpq0 fpq0Var16 = this.m;
            (fpq0Var16 != null ? fpq0Var16 : null).B(f.e.n0.a);
            return;
        }
        if (epx.f(cVar3, moq0.c.e.g)) {
            b(extendedUserProfile);
            return;
        }
        if (epx.f(cVar3, moq0.c.p.g)) {
            nyd0.n j5 = lyd0Var.j();
            j5.getClass();
            j5.e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.SHOW_QR);
            fpq0 fpq0Var17 = this.m;
            (fpq0Var17 != null ? fpq0Var17 : null).B(f.e.t0.a);
            return;
        }
        if (epx.f(cVar3, moq0.c.b.g)) {
            u5p0 u5p0Var2 = this.k;
            (u5p0Var2 != null ? u5p0Var2 : null).invoke(new UserProfileAction.s.a.b.C1692b(zp0.a.c.g));
            return;
        }
        if (epx.f(cVar3, c3356c)) {
            u5p0 u5p0Var3 = this.k;
            (u5p0Var3 != null ? u5p0Var3 : null).invoke(new UserProfileAction.s.a.b.C1692b(zp0.a.d.g));
            return;
        }
        if (epx.f(cVar3, moq0.c.k.g)) {
            u5p0 u5p0Var4 = this.k;
            (u5p0Var4 != null ? u5p0Var4 : null).invoke(new UserProfileAction.s.a.b.C1692b(zp0.a.h.g));
            return;
        }
        if (epx.f(cVar3, moq0.c.m.g)) {
            u5p0 u5p0Var5 = this.k;
            (u5p0Var5 != null ? u5p0Var5 : null).invoke(new UserProfileAction.s.a.b.C1692b(zp0.a.j.g));
            return;
        }
        if (epx.f(cVar3, moq0.c.o.g)) {
            u5p0 u5p0Var6 = this.k;
            (u5p0Var6 != null ? u5p0Var6 : null).invoke(new UserProfileAction.s.a.b.C1692b(zp0.a.k.g));
            return;
        }
        if (epx.f(cVar3, moq0.c.t.g)) {
            u5p0 u5p0Var7 = this.k;
            (u5p0Var7 != null ? u5p0Var7 : null).invoke(new UserProfileAction.s.a.b.C1692b(zp0.a.m.g));
            return;
        }
        if (epx.f(cVar3, moq0.c.l.g)) {
            fpq0 fpq0Var18 = this.m;
            (fpq0Var18 != null ? fpq0Var18 : null).B(new f.c.h(new hos(extendedUserProfile, ios.c.a)));
            return;
        }
        if (epx.f(cVar3, moq0.c.a.g) || epx.f(cVar3, moq0.c.s.g)) {
            fpq0 fpq0Var19 = this.m;
            (fpq0Var19 != null ? fpq0Var19 : null).B(f.i.a);
            return;
        }
        if (epx.f(cVar3, moq0.c.n.g)) {
            nyd0.n j6 = lyd0Var.j();
            j6.getClass();
            j6.e(MobileOfficialAppsProfileStat$UserMenuEvent.UserMenuEventType.CLICK_TO_SETTINGS);
            fpq0 fpq0Var20 = this.m;
            (fpq0Var20 != null ? fpq0Var20 : null).B(f.j.a);
            return;
        }
        if (epx.f(cVar3, moq0.c.j.g)) {
            fpq0 fpq0Var21 = this.m;
            (fpq0Var21 != null ? fpq0Var21 : null).B(new f.e.b1(extendedUserProfile));
        } else {
            if (!epx.f(cVar3, moq0.c.g.g)) {
                throw new NoWhenBranchMatchedException();
            }
            fpq0 fpq0Var22 = this.m;
            (fpq0Var22 != null ? fpq0Var22 : null).B(new f.e.k(extendedUserProfile.a.c));
        }
    }

    public final void d(io.reactivex.rxjava3.core.q qVar, boolean z, ExtendedUserProfile extendedUserProfile, a aVar) {
        w250 w250Var = new w250(new cgh(aVar, this, z, extendedUserProfile), 26);
        int i = kwg0.a;
        qVar.subscribe(w250Var, new iwg0());
    }

    public final void e(final ExtendedUserProfile extendedUserProfile, final boolean z) {
        h(z, MobileOfficialAppsProfileStat$AnotherUserProfileEvent.ContentSubscriptionType.LIVE);
        d(this.d.k(z), z, extendedUserProfile, new a(R.string.user_profile_notification_live_subscribed, R.string.user_profile_notification_live_unsubscribed, new dbw(this, extendedUserProfile, z, 1), new gzs() { // from class: xsna.bqq0
            @Override // xsna.gzs
            public final Object invoke() {
                fqq0.this.e(extendedUserProfile, !z);
                return s3q0.a;
            }
        }));
    }

    public final void f(final ExtendedUserProfile extendedUserProfile, final boolean z) {
        h(z, MobileOfficialAppsProfileStat$AnotherUserProfileEvent.ContentSubscriptionType.POST);
        d(this.d.j(z), z, extendedUserProfile, new a(R.string.user_profile_notification_post_subscribed, R.string.user_profile_notification_post_unsubscribed, new gzs() { // from class: xsna.cqq0
            @Override // xsna.gzs
            public final Object invoke() {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = fqq0.this.l;
                if (izsVar == null) {
                    izsVar = null;
                }
                ExtendedUserProfile extendedUserProfile2 = extendedUserProfile;
                extendedUserProfile2.j1 = z;
                izsVar.invoke(new b.y(extendedUserProfile2));
                return s3q0.a;
            }
        }, new gzs() { // from class: xsna.dqq0
            @Override // xsna.gzs
            public final Object invoke() {
                fqq0.this.f(extendedUserProfile, !z);
                return s3q0.a;
            }
        }));
    }

    public final void g(final ExtendedUserProfile extendedUserProfile, final boolean z) {
        h(z, MobileOfficialAppsProfileStat$AnotherUserProfileEvent.ContentSubscriptionType.STORY);
        d(this.d.s(z), z, extendedUserProfile, new a(R.string.user_profile_notification_story_subscribed, R.string.user_profile_notification_story_unsubscribed, new gzs() { // from class: xsna.zpq0
            @Override // xsna.gzs
            public final Object invoke() {
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = fqq0.this.l;
                if (izsVar == null) {
                    izsVar = null;
                }
                ExtendedUserProfile extendedUserProfile2 = extendedUserProfile;
                extendedUserProfile2.I1 = z;
                extendedUserProfile2.H1 = true;
                izsVar.invoke(new b.y(extendedUserProfile2));
                return s3q0.a;
            }
        }, new gzs() { // from class: xsna.aqq0
            @Override // xsna.gzs
            public final Object invoke() {
                fqq0.this.g(extendedUserProfile, !z);
                return s3q0.a;
            }
        }));
    }

    public final void h(boolean z, MobileOfficialAppsProfileStat$AnotherUserProfileEvent.ContentSubscriptionType contentSubscriptionType) {
        lyd0 lyd0Var = this.f;
        if (z) {
            nyd0.a m = lyd0Var.m();
            m.getClass();
            m.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.CONTENT_SUBSCRIBE, contentSubscriptionType);
        } else {
            nyd0.a m2 = lyd0Var.m();
            m2.getClass();
            m2.a(MobileOfficialAppsProfileStat$AnotherUserProfileEvent.AnotherUserProfileEventType.CONTENT_UNSUBSCRIBE, contentSubscriptionType);
        }
    }

    @Override // xsna.huq
    public final void k(u5p0 u5p0Var) {
        this.k = u5p0Var;
    }

    @Override // xsna.ruu
    public final void r(r9c0 r9c0Var) {
        this.l = r9c0Var;
    }

    @Override // xsna.huq
    public final void j() {
    }

    @Override // xsna.huq
    public final void onDestroy() {
    }

    @Override // xsna.huq
    public final void onPause() {
    }

    @Override // xsna.huq
    public final void onResume() {
    }

    @Override // xsna.huq
    public final void onStart() {
    }

    @Override // xsna.huq
    public final void onStop() {
    }

    @Override // xsna.huq
    public final void i(io.reactivex.rxjava3.disposables.b bVar) {
    }

    @Override // xsna.huq
    public final void m(Activity activity) {
    }
}
