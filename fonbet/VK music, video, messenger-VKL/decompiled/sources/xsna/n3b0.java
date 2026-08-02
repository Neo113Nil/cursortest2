package xsna;

import android.net.Uri;
import android.os.Bundle;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.base.VkPaginationList;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.core.view.StaticMapView;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.newsfeed.entries.Poster;
import com.vk.dto.polls.Poll;
import com.vk.dto.posting.DonutPostingSettings;
import com.vk.dto.stickers.AnimatedStickerInfo;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.user.UserProfile;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.newsfeed.api.posting.dto.PosterBackground;
import com.vk.newsfeed.api.posting.dto.PosterConfigCategory;
import com.vk.newsfeed.api.posting.dto.PosterSettings;
import com.vk.newsfeed.api.posting.profilefriendslists.ProfileFriendItem;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.ui.friends.VkFriendsPickerActivity;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.vmoji.character.model.CharacterContext;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import org.json.JSONObject;
import xsna.adw0;
import xsna.bsm;
import xsna.bwq0;
import xsna.e8w0;
import xsna.equ0;
import xsna.hg1;
import xsna.i3b0;
import xsna.ikv0;
import xsna.khm0;
import xsna.nov;
import xsna.q8j0;
import xsna.rtb0;
import xsna.xn50;
import xsna.xrb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class n3b0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n3b0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:161:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x03f2  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x059f  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x05a1  */
    /* JADX WARN: Type inference failed for: r0v100 */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v102 */
    /* JADX WARN: Type inference failed for: r0v24, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v26, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v28, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v30, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v45, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v47, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v51, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v53, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v57, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v59, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v60 */
    /* JADX WARN: Type inference failed for: r0v61 */
    /* JADX WARN: Type inference failed for: r0v64, types: [xsna.b3j0] */
    /* JADX WARN: Type inference failed for: r0v65 */
    /* JADX WARN: Type inference failed for: r0v80, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v91 */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r0v95 */
    /* JADX WARN: Type inference failed for: r0v96 */
    /* JADX WARN: Type inference failed for: r0v97 */
    /* JADX WARN: Type inference failed for: r0v98 */
    /* JADX WARN: Type inference failed for: r0v99 */
    /* JADX WARN: Type inference failed for: r1v104, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v57, types: [xsna.o8l0$a] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v17, types: [com.vk.dto.stickers.StickerItem] */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v2, types: [xsna.t68] */
    /* JADX WARN: Type inference failed for: r7v3 */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        List<DonutPostingSettings.Duration> list;
        PosterSettings posterSettings;
        ArrayList arrayList;
        xac0 xac0Var;
        PosterSettings posterSettings2;
        List<PosterBackground> list2;
        Integer num;
        Object obj2;
        Poster.Constants constants;
        Iterator it;
        int i = this.b;
        int i2 = 6;
        String str = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                o3b0 o3b0Var = (o3b0) obj3;
                bpn0 bpn0Var = o3b0Var.l1;
                i3b0 i3b0Var = (i3b0) obj;
                qcy<Object>[] qcyVarArr = o3b0.m1;
                if (i3b0Var.equals(i3b0.a.a)) {
                    o3b0Var.dismiss();
                } else if (i3b0Var.equals(i3b0.b.a)) {
                    ((ic40) bpn0Var.getValue()).b(o3b0Var.kn(), o3b0Var.requireArguments().getBoolean("FORCE_DARK_THEME", false));
                    o3b0Var.dismiss();
                } else {
                    if (!i3b0Var.equals(i3b0.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ((ic40) bpn0Var.getValue()).g(o3b0Var.kn(), o3b0Var.requireArguments().getBoolean("FORCE_DARK_THEME", false));
                    o3b0Var.dismiss();
                }
                return s3q0.a;
            case 1:
                ((bqb0) obj3).C(xrb0.e.b);
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((Poll) obj3).b == ((rtb0.a) obj).a.b);
            case 3:
                ikc0 ikc0Var = (ikc0) obj3;
                olc0 olc0Var = (olc0) obj;
                wxu wxuVar = ikc0Var.y;
                if (wxuVar == null) {
                    wxuVar = null;
                }
                VKList<Group> vKList = olc0Var.a;
                VkPaginationList<ProfileFriendItem> vkPaginationList = olc0Var.g;
                VkPaginationList<UserProfile> vkPaginationList2 = olc0Var.b;
                wxuVar.x(vKList, true);
                g420 g420Var = ikc0Var.E;
                if (g420Var == null) {
                    g420Var = null;
                }
                g420Var.g(vkPaginationList2);
                g420 g420Var2 = ikc0Var.E;
                if (g420Var2 == null) {
                    g420Var2 = null;
                }
                g420Var2.k(olc0Var.c);
                ikc0Var.N = olc0Var.e;
                sbc0 sbc0Var = ikc0Var.x;
                if (sbc0Var == null) {
                    sbc0Var = null;
                }
                if (sbc0Var.K && (posterSettings = olc0Var.d) != null) {
                    ikc0Var.E0 = posterSettings;
                    tac0 tac0Var = ikc0Var.A;
                    if (tac0Var == null) {
                        tac0Var = null;
                    }
                    qdc0 qdc0Var = tac0Var.b;
                    rac0 rac0Var = tac0Var.c;
                    List<PosterConfigCategory> list3 = posterSettings.b;
                    boolean z4 = tac0Var.f != null;
                    tac0Var.f = posterSettings;
                    List<PosterConfigCategory> list4 = list3;
                    ArrayList arrayList2 = new ArrayList(c5g.u(list4, 10));
                    Iterator it2 = list4.iterator();
                    while (it2.hasNext()) {
                        arrayList2.add(((PosterConfigCategory) it2.next()).d);
                    }
                    ArrayList arrayList3 = new ArrayList(c5g.v(arrayList2));
                    if (!arrayList3.isEmpty()) {
                        Iterator it3 = arrayList3.iterator();
                        while (it3.hasNext()) {
                            PosterBackground posterBackground = (PosterBackground) it3.next();
                            PosterBackground posterBackground2 = tac0Var.m;
                            if (posterBackground2 != null && posterBackground.b == posterBackground2.b && epx.f(posterBackground.c, posterBackground2.c)) {
                                ArrayList arrayList4 = new ArrayList(arrayList3);
                                tac0Var.h = arrayList4;
                                List<xac0> B = rli0.B(new ulp0(new i5g(arrayList4), new oqu(24)));
                                arrayList = (ArrayList) B;
                                if (!arrayList.isEmpty()) {
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        xac0 xac0Var2 = (xac0) it4.next();
                                        xac0 xac0Var3 = tac0Var.k;
                                        if (xac0Var3 != null) {
                                            it = it4;
                                            if (xac0Var2.a == xac0Var3.a && epx.f(xac0Var2.b, xac0Var3.b)) {
                                                tac0Var.g = B;
                                                posterSettings2 = tac0Var.f;
                                                if (posterSettings2 != null && (constants = posterSettings2.c) != null) {
                                                    rac0Var.Hd(constants);
                                                }
                                                list2 = tac0Var.h;
                                                if (list2 == null) {
                                                    list2 = EmptyList.b;
                                                }
                                                rac0Var.di(list2);
                                                num = tac0Var.i;
                                                if (num == null) {
                                                    qdc0Var.nl(tac0Var.g, z4);
                                                    if (!z4) {
                                                        tac0Var.z((PosterConfigCategory) j5g.b0(0, list3));
                                                    }
                                                } else {
                                                    UserId userId = tac0Var.j;
                                                    if (userId == null) {
                                                        userId = UserId.d;
                                                    }
                                                    tac0Var.e0(userId, num);
                                                    qdc0Var.nl(tac0Var.g, z4);
                                                }
                                                ikc0Var.N7();
                                                obj2 = ikc0Var.D;
                                                ?? r0 = obj2;
                                                if (obj2 == null) {
                                                    r0 = 0;
                                                }
                                                r0.f4(posterSettings.e);
                                            }
                                        } else {
                                            it = it4;
                                        }
                                        it4 = it;
                                    }
                                }
                                xac0Var = tac0Var.k;
                                if (xac0Var != null) {
                                    arrayList.add(0, xac0Var);
                                }
                                tac0Var.g = B;
                                posterSettings2 = tac0Var.f;
                                if (posterSettings2 != null) {
                                    rac0Var.Hd(constants);
                                }
                                list2 = tac0Var.h;
                                if (list2 == null) {
                                }
                                rac0Var.di(list2);
                                num = tac0Var.i;
                                if (num == null) {
                                }
                                ikc0Var.N7();
                                obj2 = ikc0Var.D;
                                ?? r02 = obj2;
                                if (obj2 == null) {
                                }
                                r02.f4(posterSettings.e);
                            }
                        }
                    }
                    PosterBackground posterBackground3 = tac0Var.m;
                    if (posterBackground3 != null) {
                        arrayList3.add(0, posterBackground3);
                    }
                    ArrayList arrayList42 = new ArrayList(arrayList3);
                    tac0Var.h = arrayList42;
                    List<xac0> B2 = rli0.B(new ulp0(new i5g(arrayList42), new oqu(24)));
                    arrayList = (ArrayList) B2;
                    if (!arrayList.isEmpty()) {
                    }
                    xac0Var = tac0Var.k;
                    if (xac0Var != null) {
                    }
                    tac0Var.g = B2;
                    posterSettings2 = tac0Var.f;
                    if (posterSettings2 != null) {
                    }
                    list2 = tac0Var.h;
                    if (list2 == null) {
                    }
                    rac0Var.di(list2);
                    num = tac0Var.i;
                    if (num == null) {
                    }
                    ikc0Var.N7();
                    obj2 = ikc0Var.D;
                    ?? r022 = obj2;
                    if (obj2 == null) {
                    }
                    r022.f4(posterSettings.e);
                }
                DonutPostingSettings donutPostingSettings = olc0Var.f;
                ikc0Var.y0 = donutPostingSettings;
                boolean z5 = (donutPostingSettings == null || donutPostingSettings.b.isEmpty()) ? false : true;
                ikc0Var.s0 = z5;
                if (!z5) {
                    Object obj4 = ikc0Var.C;
                    ?? r03 = obj4;
                    if (obj4 == null) {
                        r03 = 0;
                    }
                    r03.K5();
                }
                if (ikc0Var.F7()) {
                    sbc0 sbc0Var2 = ikc0Var.x;
                    if (sbc0Var2 == null) {
                        sbc0Var2 = null;
                    }
                    String str2 = sbc0Var2.O;
                    ikc0Var.A0 = str2;
                    DonutPostingSettings donutPostingSettings2 = ikc0Var.y0;
                    if (donutPostingSettings2 != null && (list = donutPostingSettings2.b) != null && !list.isEmpty()) {
                        if (epx.f(str2, "all")) {
                            Object obj5 = ikc0Var.C;
                            ?? r04 = obj5;
                            if (obj5 == null) {
                                r04 = 0;
                            }
                            z3 = true;
                            r04.t4(true);
                            Object obj6 = ikc0Var.C;
                            ?? r05 = obj6;
                            if (obj6 == null) {
                                r05 = 0;
                            }
                            r05.j2(true);
                            ikc0Var.i0 = z3;
                        } else if (epx.f(str2, "duration")) {
                            Object obj7 = ikc0Var.C;
                            ?? r06 = obj7;
                            if (obj7 == null) {
                                r06 = 0;
                            }
                            r06.t4(true);
                            Object obj8 = ikc0Var.C;
                            ?? r07 = obj8;
                            if (obj8 == null) {
                                r07 = 0;
                            }
                            r07.j2(false);
                        } else {
                            Object obj9 = ikc0Var.C;
                            ?? r08 = obj9;
                            if (obj9 == null) {
                                r08 = 0;
                            }
                            r08.t4(false);
                            Object obj10 = ikc0Var.C;
                            ?? r09 = obj10;
                            if (obj10 == null) {
                                r09 = 0;
                            }
                            r09.j2(false);
                        }
                    }
                    z3 = true;
                    ikc0Var.i0 = z3;
                }
                ikc0Var.X7(ikc0Var.D7());
                Object obj11 = ikc0Var.C;
                ?? r010 = obj11;
                if (obj11 == null) {
                    r010 = 0;
                }
                r010.r3(vkPaginationList2);
                Object obj12 = ikc0Var.C;
                ?? r011 = obj12;
                if (obj12 == null) {
                    r011 = 0;
                }
                r011.p1(vkPaginationList);
                Object obj13 = ikc0Var.C;
                ?? r012 = obj13;
                if (obj13 == null) {
                    r012 = 0;
                }
                r012.G3(olc0Var.i);
                Object obj14 = ikc0Var.C;
                ?? r013 = obj14;
                if (obj14 == null) {
                    r013 = 0;
                }
                r013.S6(olc0Var.h);
                ikc0Var.j7(vkPaginationList);
                boolean z6 = olc0Var.k;
                boolean z7 = olc0Var.l;
                boolean z8 = olc0Var.m;
                scc0 scc0Var = ikc0Var.s;
                if (z7 || z8 || z6) {
                    ikc0Var.I0 = z8;
                    ikc0Var.K0 = z7;
                    ikc0Var.J0 = z6;
                    Boolean valueOf = Boolean.valueOf(z6);
                    if (!(z8 ^ z7)) {
                        valueOf = null;
                    }
                    ikc0Var.L0 = valueOf != null ? valueOf.booleanValue() : z8;
                    if (z7) {
                        io.reactivex.rxjava3.subjects.f<bwr0> fVar = wjs0.b;
                        hg1.g3 g3Var = new hg1.g3();
                        fVar.getClass();
                        io.reactivex.rxjava3.internal.operators.observable.j1 U = new io.reactivex.rxjava3.internal.operators.observable.i0(fVar, g3Var).U(new hg1.f3());
                        o3y o3yVar = new o3y(new bq00(ikc0Var, 25), 17);
                        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                        ikc0Var.b.b(U.E(o3yVar, lVar, kVar, kVar).subscribe());
                        z84 z84Var = ikc0Var.B;
                        if (z84Var == null) {
                            z84Var = null;
                        }
                        z = true;
                        z84Var.t = true;
                        scc0Var.g = true;
                    } else {
                        z = true;
                    }
                    if (z8) {
                        scc0Var.h = z;
                    }
                    Group group = ikc0Var.v0;
                    if (group != null) {
                        boolean z9 = group.s >= 2 && z6;
                        z84 z84Var2 = ikc0Var.B;
                        if (z84Var2 == null) {
                            z84Var2 = null;
                        }
                        List<Attachment> u = z84Var2.u();
                        if (!u.isEmpty()) {
                            Iterator it5 = u.iterator();
                            while (it5.hasNext()) {
                                if (((Attachment) it5.next()) instanceof f010) {
                                    z2 = true;
                                    Object obj15 = ikc0Var.D;
                                    (obj15 != null ? 0 : obj15).O7(z9);
                                    if (!z2 && !ikc0Var.F7() && z9) {
                                        scc0Var.c();
                                    }
                                }
                            }
                        }
                        z2 = false;
                        Object obj152 = ikc0Var.D;
                        (obj152 != null ? 0 : obj152).O7(z9);
                        if (!z2) {
                            scc0Var.c();
                        }
                    }
                }
                return s3q0.a;
            case 4:
                return new ood0((ViewGroup) obj, ((aod0) obj3).j);
            case 5:
                ((ube0) obj3).a.a.e.b((io.reactivex.rxjava3.disposables.c) obj);
                return s3q0.a;
            case 6:
                com.vk.auth.modal.qrwithcode.a aVar = (com.vk.auth.modal.qrwithcode.a) obj3;
                aVar.n = null;
                QrWithCodeAuthModal qrWithCodeAuthModal = aVar.h;
                qrWithCodeAuthModal.f(false);
                qrWithCodeAuthModal.e();
                return s3q0.a;
            case 7:
                ate0 ate0Var = (ate0) obj3;
                ate0 ate0Var2 = new ate0((AnimatedStickerInfo) obj, ate0Var.l, ate0Var.i, null);
                nov.a.b(ate0Var, ate0Var2);
                return ate0Var2;
            case 8:
                ((pbf0) obj3).v6(xus.c);
                return s3q0.a;
            case 9:
                int i3 = r9i0.j1;
                ((ixi0) obj3).j = (Integer) obj;
                return s3q0.a;
            case 10:
                ((io.reactivex.rxjava3.core.b) obj3).onError((Throwable) obj);
                return s3q0.a;
            case 11:
                return p4g.f((Set) obj, ((q8j0.g) ((q8j0) obj3)).b);
            case 12:
                ah5 ah5Var = (ah5) obj3;
                String str3 = (String) obj;
                try {
                    str = Uri.parse(str3).getQueryParameter("join_by_url");
                } catch (Exception unused) {
                }
                if (str != null) {
                    ((izs) ah5Var.e).invoke(str);
                } else {
                    ((z9z) ah5Var.d).a(str3);
                }
                return s3q0.a;
            case 13:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "vk_top_bar_back_btn");
                qgi0.h(tgi0Var, ((FragmentActivity) obj3).getString(R.string.accessibility_toolbar_return_back));
                return s3q0.a;
            case 14:
                int i4 = StaticMapView.n;
                ((oj00) obj).f((am00) obj3);
                return s3q0.a;
            case 15:
                b8l0 b8l0Var = (b8l0) obj3;
                ?? r1 = b8l0Var.l;
                StickerItem stickerItem = b8l0Var.o;
                r1.a(stickerItem != null ? stickerItem : 0);
                return s3q0.a;
            case 16:
                ((mfm0) obj3).e.setPreviewCadres((khm0.d) obj);
                return s3q0.a;
            case 17:
                ((rg50) obj3).C((int) ((Float) obj).floatValue());
                return s3q0.a;
            case 18:
                isq0 isq0Var = (isq0) obj3;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                int size = wallWithCounters.size();
                isq0Var.x(wallWithCounters, false);
                isq0Var.e(new bwq0.a.C2629a(size));
                return s3q0.a;
            case 19:
                ((ubr0) obj3).c.j(JsApiMethodType.SHOW_INVITE_BOX, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
            case 20:
                ber0 ber0Var = (ber0) obj3;
                mfu0 mfu0Var = ber0Var.c;
                if (((Boolean) obj).booleanValue()) {
                    mfu0Var.n(JsApiMethodType.DENY_NOTIFICATIONS, new JSONObject().put("result", true));
                    SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                    (superappUiRouterBridge != null ? superappUiRouterBridge : null).j(((ggu0) ber0Var.d.c).b.getString(R.string.vk_apps_mini_notifications_denied));
                } else {
                    mfu0Var.m(JsApiMethodType.DENY_NOTIFICATIONS, VkAppsErrors.Client.USER_DENIED, null, null);
                }
                ber0Var.b.m().g.g(!r2.booleanValue());
                return s3q0.a;
            case 21:
                bsm.i iVar = ((nqr0) obj3).o;
                if (iVar != null) {
                    iVar.g();
                }
                return s3q0.a;
            case 22:
                com.vk.movika.sdk.base.observable.a aVar2 = ((com.vk.voip.ui.settings.participants_view.o) obj3).n;
                if (aVar2 != null) {
                    aVar2.invoke(j.C2090j.a);
                }
                return s3q0.a;
            case 23:
                VideoOfflineFragment videoOfflineFragment = (VideoOfflineFragment) obj3;
                int i5 = VideoOfflineFragment.f1;
                videoOfflineFragment.q();
                if (fxc0.B().J().u0()) {
                    ((edt0) videoOfflineFragment.e1.getValue()).a();
                } else {
                    FragmentActivity activity = videoOfflineFragment.getActivity();
                    if (activity != null) {
                        ikv0.a aVar3 = new ikv0.a(activity);
                        aVar3.u = new ikv0.d(activity.getString(R.string.video_offline_open_online), (String) r7, (ikv0.d.a) r7, i2);
                        aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, activity.getString(R.string.video_open_catalog), new mvl0(videoOfflineFragment, 12));
                        videoOfflineFragment.c1 = aVar3.n();
                    }
                }
                return s3q0.a;
            case 24:
                ((ner) ((ViewGroup) obj3)).reset();
                return s3q0.a;
            case 25:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Bundle arguments = ((ubu0) obj3).getArguments();
                return Boolean.valueOf(!(arguments != null ? arguments.getBoolean("keepAlive", false) : false) && booleanValue);
            case 26:
                equ0.c cVar = (equ0.c) obj3;
                ArrayList E = g5g.E((List) obj, Contact.class);
                ArrayList arrayList5 = new ArrayList();
                Iterator it6 = E.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    if (((Contact) next).g) {
                        arrayList5.add(next);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    cVar.invoke(arrayList5);
                }
                return s3q0.a;
            case 27:
                VkFriendsPickerActivity vkFriendsPickerActivity = (VkFriendsPickerActivity) obj3;
                iwu0 iwu0Var = vkFriendsPickerActivity.n;
                if (iwu0Var == null) {
                    iwu0Var = null;
                }
                zxv0 zxv0Var = vkFriendsPickerActivity.o;
                iwu0Var.b.Q1((zxv0Var != null ? zxv0Var : null).g);
                return s3q0.a;
            case 28:
                CharacterContext characterContext = (CharacterContext) obj;
                e8w0.a aVar4 = ((e8w0) obj3).u;
                boolean z10 = characterContext == CharacterContext.MY_CHARACTER;
                aVar4.getClass();
                t6w0 t6w0Var = new t6w0(z10);
                j6w0 j6w0Var = j6w0.b;
                p6w0 p6w0Var = p6w0.b;
                aVar4.setItems(e43.l(t6w0Var, u9w0.b, j6w0Var, i7w0.b, j6w0Var, p6w0Var, p6w0Var, p6w0Var, p6w0Var, p6w0Var, p6w0Var));
                return s3q0.a;
            default:
                cdw0 cdw0Var = (cdw0) obj3;
                VkInputSelect vkInputSelect = cdw0Var.m1;
                mhy.j(vkInputSelect != null ? vkInputSelect : null);
                xn50.a.c(cdw0Var, adw0.b.a.b);
                return s3q0.a;
        }
    }
}
