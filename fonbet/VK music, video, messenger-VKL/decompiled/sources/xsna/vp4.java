package xsna;

import android.content.Context;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.media3.common.StreamKey;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import com.vk.catalog2.common.dto.api.music.RadioStation;
import com.vk.catalog2.feature.music.dto.ui.search.UIBlockSearchHistory;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.feed.core.models.Text;
import com.vk.feed.core.models.actions.ActionOpenModal;
import com.vk.lists.DefaultErrorView;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.functions.a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.ListBuilder;
import xsna.cri;
import xsna.dt1;
import xsna.hfr;
import xsna.isc.d;
import xsna.kpv;
import xsna.phw;
import xsna.q630;
import xsna.ty6;
import xsna.yzk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class vp4 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vp4(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x02dd  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Collection collection;
        iyk0 iyk0Var;
        Object bVar;
        ActionOpenModal.OverlayImage overlayImage;
        ActionOpenModal.ModalButton modalButton;
        ActionOpenModal.ModalImage modalImage;
        q630 b;
        String str;
        us2 us2Var;
        cri.a.e eVar;
        boolean z;
        String str2;
        String str3;
        Integer num;
        LayoutNode.a aVar;
        cri.a.e eVar2;
        cri.a.C2678a c2678a;
        boolean z2;
        lg90 a;
        float f;
        androidx.compose.runtime.a aVar2;
        Image image;
        ImageSize Cb;
        String str4;
        String str5;
        String str6;
        Integer d;
        ImageSize Cb2;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        int i2 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                rsk rskVar = (rsk) obj3;
                hfr m = rli0.m(new tlp0(new bli0(new wp4((jx90) obj2, null)), new up4(((Integer) obj).intValue())));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                hfr.a aVar3 = new hfr.a(m);
                while (aVar3.hasNext()) {
                    Object next = aVar3.next();
                    StreamKey streamKey = (StreamKey) next;
                    String str7 = rskVar.b(streamKey.b).c.get(streamKey.c).c.get(streamKey.d).b.n;
                    if (str7 == null) {
                        str7 = "";
                    }
                    Object obj4 = linkedHashMap.get(str7);
                    if (obj4 == null) {
                        obj4 = s5a.a(str7, linkedHashMap);
                    }
                    ((List) obj4).add(next);
                }
                int i3 = ao80.m;
                p8l.b.a();
                p8l.c.a();
                boolean a2 = p8l.d.a();
                ListBuilder e = e43.e();
                if (a2) {
                    e.add(MimeTypes.AUDIO_OPUS);
                }
                e.add("audio/mp4a-latm");
                e.add(MimeTypes.AUDIO_MP4);
                ListIterator listIterator = e.g().listIterator(0);
                while (true) {
                    ListBuilder.a aVar4 = (ListBuilder.a) listIterator;
                    if (aVar4.hasNext()) {
                        Collection collection2 = (List) linkedHashMap.get((String) aVar4.next());
                        if (collection2 != null) {
                            collection = collection2;
                        }
                    } else {
                        collection = null;
                    }
                }
                if (collection == null) {
                    collection = EmptyList.b;
                }
                return collection;
            case 1:
                ((Integer) obj2).getClass();
                mb5.f((q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                isc iscVar = (isc) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                qcy<Object>[] qcyVarArr = isc.t1;
                if (aVar5.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1320400286, intValue, -1, "com.vk.clips.viewer.edit.presentation.fragment.ClipEditSdkBottomSheet.Content.<anonymous> (ClipEditSdkBottomSheet.kt:202)");
                    }
                    boolean J = aVar5.J(iscVar);
                    Object x = aVar5.x();
                    if (J || x == c0012a) {
                        x = new dsc(iscVar, 0);
                        aVar5.R(x);
                    }
                    izs izsVar = (izs) x;
                    boolean J2 = aVar5.J(iscVar);
                    Object x2 = aVar5.x();
                    if (J2 || x2 == c0012a) {
                        x2 = iscVar.new d(null);
                        aVar5.R(x2);
                    }
                    r37.a(izsVar, (yzs) x2, kai.c(-475560629, new esc(iscVar, 0), aVar5), aVar5, 384, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 3:
                izs izsVar2 = (izs) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2031158988, intValue2, -1, "com.vk.draftslist.impl.ui.view.DraftsListScreen.<anonymous>.<anonymous> (DraftsListScreen.kt:35)");
                    }
                    jeo.c(0, aVar6, d370.N(R.string.newsfeed_drafts, 0, aVar6), izsVar2, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                ((axq) obj3).e(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 5:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                DefaultErrorView defaultErrorView = ((GeoPostsFragment) obj3).c0;
                if (defaultErrorView != null) {
                    defaultErrorView.setVisibility(booleanValue ? 0 : 8);
                }
                return s3q0.a;
            case 6:
                d0g0 d0g0Var = (d0g0) obj3;
                List list = (List) obj;
                List list2 = (List) obj2;
                Object a0 = j5g.a0(list);
                Integer valueOf = a0 != null ? Integer.valueOf(d0g0Var.m(a0)) : null;
                Object a02 = j5g.a0(list2);
                return Boolean.valueOf(epx.f(valueOf, a02 != null ? Integer.valueOf(d0g0Var.m(a02)) : null) && list.size() == list2.size());
            case 7:
                huh0 huh0Var = (huh0) obj3;
                com.vk.music.track.a aVar7 = huh0Var.e;
                Context context = (Context) obj;
                RadioStation radioStation = ((UIBlockSearchHistory.UIBlockSearchHistoryRadioStation) obj2).B;
                int i4 = radioStation.b;
                if (radioStation.g) {
                    a630.h0(aVar7, i4, null, 6).subscribe();
                } else {
                    io.reactivex.rxjava3.core.q L1 = a630.L1(aVar7, i4, null, 6);
                    cc20 cc20Var = new cc20(new cae(huh0Var, context), 20);
                    a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
                    a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
                    L1.E(cc20Var, lVar, kVar, kVar).subscribe();
                }
                return s3q0.a;
            case 8:
                yzk0 yzk0Var = (yzk0) obj3;
                androidx.compose.runtime.a aVar8 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar8.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(658229333, intValue3, -1, "com.vk.newsfeed.common.popups.status.StatusPopupBottomSheet.ThemedContent.<anonymous> (StatusPopupBottomSheet.kt:50)");
                    }
                    iyk0 iyk0Var2 = AndroidCompositionLocals_androidKt.b;
                    Context context2 = (Context) aVar8.r(iyk0Var2);
                    ActionOpenModal actionOpenModal = yzk0Var.i1;
                    ActionOpenModal.ModalImage modalImage2 = (actionOpenModal == null ? null : actionOpenModal).b;
                    ActionOpenModal.OverlayImage overlayImage2 = (actionOpenModal == null ? null : actionOpenModal).c;
                    String str8 = (actionOpenModal == null ? null : actionOpenModal).d;
                    us2 us2Var2 = yzk0Var.j1;
                    if (actionOpenModal == null) {
                        actionOpenModal = null;
                    }
                    ActionOpenModal.ModalButton modalButton2 = actionOpenModal.f;
                    boolean y = aVar8.y(yzk0Var) | aVar8.y(context2);
                    Object x3 = aVar8.x();
                    if (y || x3 == c0012a) {
                        x3 = new xzk0(i2, yzk0Var, context2);
                        aVar8.R(x3);
                    }
                    izs izsVar3 = (izs) x3;
                    boolean y2 = aVar8.y(yzk0Var);
                    Object x4 = aVar8.x();
                    if (y2 || x4 == c0012a) {
                        iyk0Var = iyk0Var2;
                        overlayImage = overlayImage2;
                        modalButton = modalButton2;
                        modalImage = modalImage2;
                        bVar = new yzk0.b(0, yzk0Var, yzk0.class, "dismiss", "dismiss()V", 0);
                        aVar8.R(bVar);
                    } else {
                        bVar = x4;
                        iyk0Var = iyk0Var2;
                        modalButton = modalButton2;
                        modalImage = modalImage2;
                        overlayImage = overlayImage2;
                    }
                    gzs gzsVar = (gzs) ((fcy) bVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1872388495, 0, -1, "com.vk.newsfeed.common.popups.status.StatusPopupContent (StatusPopupContent.kt:67)");
                    }
                    q630.a aVar9 = q630.a.a;
                    if (str8 == null) {
                        aVar8.K(1585762012);
                        aVar8.j();
                        b = null;
                    } else {
                        aVar8.K(1585762013);
                        boolean J3 = aVar8.J(str8);
                        Object x5 = aVar8.x();
                        if (J3 || x5 == c0012a) {
                            x5 = new j020(str8, 2);
                            aVar8.R(x5);
                        }
                        b = egi0.b(aVar9, false, (izs) x5);
                        aVar8.j();
                    }
                    if (b == null) {
                        b = aVar9;
                    }
                    dt1.a.getClass();
                    cp10 d2 = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar8));
                    sy90 D = aVar8.D();
                    q630 c = qri.c(aVar8, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar10 = cri.a.b;
                    if (aVar8.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar8.H();
                    if (aVar8.L()) {
                        aVar8.I(aVar10);
                    } else {
                        aVar8.f();
                    }
                    cri.a.c cVar = cri.a.f;
                    k9q0.w(aVar8, d2, cVar);
                    cri.a.e eVar3 = cri.a.e;
                    k9q0.w(aVar8, D, eVar3);
                    Integer valueOf2 = Integer.valueOf(hashCode);
                    cri.a.b bVar2 = cri.a.g;
                    k9q0.w(aVar8, valueOf2, bVar2);
                    cri.a.C2678a c2678a2 = cri.a.h;
                    k9q0.t(aVar8, c2678a2);
                    cri.a.d dVar = cri.a.d;
                    k9q0.w(aVar8, c, dVar);
                    aVar8.K(-2094156105);
                    if (androidx.compose.runtime.b.d()) {
                        str = str8;
                        us2Var = us2Var2;
                        androidx.compose.runtime.b.f(1590503023, 0, -1, "com.vk.newsfeed.common.popups.status.MilkshakeContent (StatusPopupContent.kt:230)");
                    } else {
                        str = str8;
                        us2Var = us2Var2;
                    }
                    q630 z3 = txj0.z(txj0.f(aVar9, 1.0f), null, 3);
                    ty6.a aVar11 = dt1.a.o;
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(mVar, aVar11, aVar8, 48);
                    int hashCode2 = Long.hashCode(n34.n(aVar8));
                    sy90 D2 = aVar8.D();
                    q630 c2 = qri.c(aVar8, z3);
                    if (aVar8.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar8.H();
                    if (aVar8.L()) {
                        aVar8.I(aVar10);
                    } else {
                        aVar8.f();
                    }
                    k9q0.w(aVar8, a3, cVar);
                    k9q0.w(aVar8, D2, eVar3);
                    ur.d(hashCode2, aVar8, bVar2, aVar8, c2678a2);
                    k9q0.w(aVar8, c2, dVar);
                    ActionOpenModal.ModalImage modalImage3 = modalImage;
                    if (modalImage3 == null) {
                        aVar8.K(1742359873);
                        aVar8.j();
                        aVar2 = aVar8;
                        eVar2 = eVar3;
                        aVar = aVar10;
                        c2678a = c2678a2;
                    } else {
                        aVar8.K(1742359874);
                        if (androidx.compose.runtime.b.d()) {
                            eVar = eVar3;
                            z = false;
                            androidx.compose.runtime.b.f(417550523, 0, -1, "com.vk.newsfeed.common.popups.status.Picture (StatusPopupContent.kt:272)");
                        } else {
                            eVar = eVar3;
                            z = false;
                        }
                        Context context3 = (Context) aVar8.r(iyk0Var);
                        Image image2 = modalImage3.c;
                        if (image2 == null || (Cb2 = image2.Cb(iah0.a(72), z, z)) == null || (str2 = Cb2.d.d) == null) {
                            str2 = modalImage3.b;
                        }
                        String str9 = str2;
                        if (str9 == null) {
                            aVar8.K(1022641062);
                            aVar8.j();
                            aVar2 = aVar8;
                            aVar = aVar10;
                            c2678a = c2678a2;
                            eVar2 = eVar;
                        } else {
                            aVar8.K(1022641063);
                            ActionOpenModal.OverlayImage overlayImage3 = overlayImage;
                            if (overlayImage3 != null && (str6 = overlayImage3.b) != null) {
                                switch (str6.hashCode()) {
                                    case -1842295000:
                                        if (str6.equals("prometey_circle_fill_red")) {
                                            str3 = str9;
                                            num = Integer.valueOf(R.drawable.vk_icon_prometey_circle_fill_red_32);
                                            break;
                                        }
                                        str3 = str9;
                                        d = wp.d(context3, "vk_icon_", str6, "_32");
                                        if (d != null) {
                                            num = d;
                                            break;
                                        } else {
                                            num = wp.d(context3, "vk_icon_", str6, "_outline_32");
                                            break;
                                        }
                                    case -1562868162:
                                        if (str6.equals("users_circle_fill_blue")) {
                                            num = Integer.valueOf(R.drawable.vk_icon_users_circle_fill_blue_32);
                                            str3 = str9;
                                            break;
                                        }
                                        str3 = str9;
                                        d = wp.d(context3, "vk_icon_", str6, "_32");
                                        if (d != null) {
                                        }
                                        break;
                                    case 851719219:
                                        if (str6.equals("favorite_circle_fill_green")) {
                                            num = Integer.valueOf(R.drawable.vk_icon_favorite_circle_fill_green_32);
                                            str3 = str9;
                                            break;
                                        }
                                        str3 = str9;
                                        d = wp.d(context3, "vk_icon_", str6, "_32");
                                        if (d != null) {
                                        }
                                        break;
                                    case 1491613182:
                                        if (str6.equals("donut_circle_fill_yellow")) {
                                            num = Integer.valueOf(R.drawable.vk_icon_donut_color_24);
                                            str3 = str9;
                                            break;
                                        }
                                        str3 = str9;
                                        d = wp.d(context3, "vk_icon_", str6, "_32");
                                        if (d != null) {
                                        }
                                        break;
                                    default:
                                        str3 = str9;
                                        d = wp.d(context3, "vk_icon_", str6, "_32");
                                        if (d != null) {
                                        }
                                        break;
                                }
                            } else {
                                str3 = str9;
                                num = null;
                            }
                            boolean z4 = (overlayImage3 == null || (str5 = overlayImage3.b) == null) ? true : !str5.equals("donut_circle_fill_yellow");
                            String str10 = (overlayImage3 == null || (image = overlayImage3.d) == null || (Cb = image.Cb(iah0.a((float) 32), false, false)) == null || (str4 = Cb.d.d) == null) ? overlayImage3 != null ? overlayImage3.c : null : str4;
                            f9t.e(txj0.q(aVar9, 16), aVar8, 6);
                            String N = d370.N(R.string.accessibility_photo_profile, 0, aVar8);
                            boolean J4 = aVar8.J(N);
                            Object x6 = aVar8.x();
                            if (J4 || x6 == c0012a) {
                                x6 = new tks(N, 2);
                                aVar8.R(x6);
                            }
                            q630 b2 = egi0.b(aVar9, true, (izs) x6);
                            aVar = aVar10;
                            eVar2 = eVar;
                            Integer num2 = num;
                            c2678a = c2678a2;
                            phw a4 = phw.a.a(fwu0.l(str3, null, null, null, aVar8, 0, 62), null, null, null, null, aVar8, 196616, 30);
                            androidx.compose.runtime.a aVar12 = aVar8;
                            float f2 = 72;
                            if (num2 == null) {
                                aVar12.K(-584182559);
                                aVar12.j();
                                z2 = z4;
                                a = null;
                            } else {
                                aVar12.K(-584182558);
                                z2 = z4;
                                a = pg90.a(num2.intValue(), 0, aVar12);
                                aVar12.j();
                            }
                            if (a == null) {
                                aVar12.K(-1404315913);
                                f = f2;
                                a = fwu0.l(str10, null, null, null, aVar12, 0, 62);
                                aVar12 = aVar12;
                                aVar12.j();
                            } else {
                                f = f2;
                                aVar12.K(-1404318300);
                                aVar12.j();
                            }
                            float f3 = 24;
                            androidx.compose.runtime.a aVar13 = aVar12;
                            ldu0.b(a4, f, b2, kpv.a.a(a, l5g.k, byc0.b(f3, f3), null, z2, null, null, aVar13, 100663736, Sdk.SDKError.Reason.AD_RESPONSE_INVALID_TEMPLATE_TYPE_VALUE), null, false, null, null, null, aVar13, 48, 496);
                            aVar2 = aVar13;
                            aVar2.j();
                        }
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        aVar2.j();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-623355896, 0, -1, "com.vk.newsfeed.common.popups.status.TextBlock (StatusPopupContent.kt:315)");
                    }
                    float f4 = 16;
                    q630 D3 = s200.D(aVar9, f4);
                    androidx.compose.foundation.layout.c a5 = androidx.compose.foundation.layout.b.a(mVar, aVar11, aVar2, 48);
                    int hashCode3 = Long.hashCode(n34.n(aVar2));
                    sy90 D4 = aVar2.D();
                    q630 c3 = qri.c(aVar2, D3);
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, a5, cVar);
                    k9q0.w(aVar2, D4, eVar2);
                    ur.d(hashCode3, aVar2, bVar2, aVar2, c2678a);
                    k9q0.w(aVar2, c3, dVar);
                    if (str == null) {
                        aVar2.K(2060248357);
                    } else {
                        aVar2.K(2060248358);
                        q630 E = ahn.E(aVar9, "StatusPopupTitle");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var = wuv0Var.C;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar14 = aVar2;
                        String str11 = str;
                        yqv0.c(str11, E, ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, aVar14, 48, 0, 8120);
                        str = str11;
                        aVar2 = aVar14;
                    }
                    aVar2.j();
                    if (str == null || !(!drm0.N(str)) || us2Var == null || !(!drm0.N(us2Var))) {
                        aVar2.K(2049086436);
                    } else {
                        aVar2.K(2060630278);
                        f9t.e(txj0.q(aVar9, 8), aVar2, 6);
                    }
                    aVar2.j();
                    if (us2Var == null) {
                        aVar2.K(2060717418);
                    } else {
                        aVar2.K(2060717419);
                        q630 E2 = ahn.E(aVar9, "StatusPopupText");
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                        }
                        wuv0 wuv0Var2 = (wuv0) aVar2.r(rrv0.c);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        frv0 frv0Var2 = wuv0Var2.i0;
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                        }
                        ylu0 ylu0Var2 = (ylu0) aVar2.r(rrv0.a);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        androidx.compose.runtime.a aVar15 = aVar2;
                        yqv0.d(us2Var, E2, ylu0Var2.getText().r, 3, null, 0, false, 0, null, null, frv0Var2, aVar15, 48, 0, 8120);
                        aVar2 = aVar15;
                    }
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    ActionOpenModal.ModalButton modalButton3 = modalButton;
                    if (modalButton3 == null) {
                        aVar2.K(1742609051);
                    } else {
                        aVar2.K(1742609052);
                        q630 E3 = ahn.E(txj0.f(s200.D(aVar9, f4), 1.0f), "CreatePostButton");
                        ButtonSize buttonSize = ButtonSize.Large;
                        ButtonStyle buttonStyle = ButtonStyle.Secondary;
                        ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                        Text text = modalButton3.b;
                        String str12 = text != null ? text.b : null;
                        boolean y3 = aVar2.y(modalButton3) | aVar2.J(izsVar3);
                        Object x7 = aVar2.x();
                        if (y3 || x7 == c0012a) {
                            x7 = new fqd(14, modalButton3, izsVar3);
                            aVar2.R(x7);
                        }
                        androidx.compose.runtime.a aVar16 = aVar2;
                        bhu0.e((gzs) x7, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, str12, null, null, null, null, false, null, null, null, aVar16, 28080, 0, 0, 4190176);
                        aVar2 = aVar16;
                    }
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    zzk0.a(0, aVar2, gzsVar, ra8.a.b(aVar9, dt1.a.d));
                    aVar2.j();
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar8.h();
                }
                return s3q0.a;
            case 9:
                ((Integer) obj2).getClass();
                com.vk.profile.design.view.profileheader.b.k((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            default:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar17 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar17.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-127559170, intValue4, -1, "com.vk.profile.design.compose.user.VkProfileFriendsInfo.<anonymous> (VkProfileFriendsInfo.kt:65)");
                    }
                    if (cq.i(6, aVar17, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar17.h();
                }
                return s3q0.a;
        }
    }

    public /* synthetic */ vp4(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
