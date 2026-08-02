package xsna;

import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.ArraySet;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.core.tool.view.vkblur.VkBlurView;
import com.vk.dto.common.Direction;
import com.vk.dto.common.RecommendedProfile;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.im.settings.appearance.AppearanceSettingsWithBackgroundsFragment;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.log.L;
import com.vk.stat.scheme.CommonVideoStat$CommunityClickInfo;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.impl.ui.FooterButtonType;
import com.vk.superapp.sessionmanagment.api.domain.utils.exceptions.MasterSessionNotFoundException;
import com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity.AttachedClipsState;
import com.vk.voip.ui.settings.participants_view.CallParticipantsViewModel;
import com.vk.voip.ui.settings.participants_view.j;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.collections.builders.ListBuilder;
import org.json.JSONObject;
import xsna.cwb0;
import xsna.dyo;
import xsna.g9k;
import xsna.hrm;
import xsna.io8;
import xsna.mi3;
import xsna.qs80;
import xsna.sxo;
import xsna.tj50;
import xsna.uxo;
import xsna.xnn0;
import xsna.z9a;
import xsna.znn0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class vl1 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vl1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        hrm.a aVar;
        Object obj3;
        LinkedHashMap linkedHashMap;
        pum pumVar;
        gkx0 gkx0Var;
        pum pumVar2;
        int i;
        ListBuilder listBuilder;
        Object obj4;
        int i2 = 5;
        switch (this.b) {
            case 0:
                PhotoAlbum photoAlbum = (PhotoAlbum) this.c;
                PhotoAlbum photoAlbum2 = (PhotoAlbum) obj;
                photoAlbum2.g = photoAlbum.g;
                photoAlbum2.h = photoAlbum.h;
                photoAlbum2.f = photoAlbum.f;
                photoAlbum2.i = photoAlbum.i;
                photoAlbum2.j = photoAlbum.j;
                photoAlbum2.p = photoAlbum.p;
                photoAlbum2.n = photoAlbum.n;
                return photoAlbum2;
            case 1:
                j03.j(((lu1) this.c).c.getActivity(), (Throwable) obj);
                return s3q0.a;
            case 2:
                AppearanceSettingsWithBackgroundsFragment appearanceSettingsWithBackgroundsFragment = (AppearanceSettingsWithBackgroundsFragment) this.c;
                int i3 = AppearanceSettingsWithBackgroundsFragment.b0;
                new ImSettingsDialogThemeFragment.a().k(appearanceSettingsWithBackgroundsFragment.getActivity());
                return s3q0.a;
            case 3:
                ((rh3) this.c).T(new mi3.d(Collections.singleton(Integer.valueOf(((zaa0) obj).b))));
                return s3q0.a;
            case 4:
                com.vk.articles.a aVar2 = (com.vk.articles.a) this.c;
                Map map = (Map) obj;
                L.p("ArticleWebView", "received info from myTarget(map size = " + map.size() + ')');
                aVar2.d = new JSONObject(map);
                com.vk.articles.a.d(aVar2);
                return s3q0.a;
            case 5:
                h54 h54Var = (h54) this.c;
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                rdi.y(h54Var, new izs() { // from class: xsna.d54
                    @Override // xsna.izs
                    public final Object invoke(Object obj5) {
                        return AttachedClipsState.a((AttachedClipsState) obj5, null, null, null, null, null, false, false, false, booleanValue, null, 767);
                    }
                });
                return s3q0.a;
            case 6:
                q75 q75Var = (q75) this.c;
                if (((qs80) obj) instanceof qs80.c) {
                    q75Var.c(CommonVideoStat$CommunityClickInfo.Direction.TO_PLAYER_LIVE);
                } else {
                    q75Var.b();
                }
                return s3q0.a;
            case 7:
                ((qi5) this.c).a.N(k15.A((SdkVideoFile) obj));
                return s3q0.a;
            case 8:
                ((p66) this.c).e.getClass();
                return s3q0.a;
            case 9:
                wk6 wk6Var = (wk6) this.c;
                if (((gmq) obj).equals(wk6Var.C)) {
                    wk6Var.X6();
                }
                return s3q0.a;
            case 10:
                VkBlurView vkBlurView = (VkBlurView) this.c;
                float measuredHeight = vkBlurView.getMeasuredHeight();
                int[] iArr = k0v0.a;
                float[] fArr = k0v0.b;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                vkBlurView.setColorOverlayShader(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, measuredHeight, iArr, fArr, tileMode));
                vkBlurView.setFallbackColorOverlay(new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, vkBlurView.getMeasuredHeight(), iArr, fArr, tileMode));
                return s3q0.a;
            case 11:
                tj8 tj8Var = (tj8) this.c;
                ((kbj0) tj8Var.b).n((Context) tj8Var.a, (VideoFile) obj);
                return s3q0.a;
            case 12:
                com.vk.voip.ui.settings.participants_view.c cVar = (com.vk.voip.ui.settings.participants_view.c) this.c;
                bzb0 bzb0Var = cVar.p;
                CallParticipantsViewModel.a aVar3 = (CallParticipantsViewModel.a) obj;
                if (aVar3 instanceof CallParticipantsViewModel.a.C2083a) {
                    bzb0Var.a();
                } else if (aVar3 instanceof CallParticipantsViewModel.a.b) {
                    bzb0Var.c(new cwb0.s0(null, R.string.voip_add_to_call_loading, 5), new defpackage.f(cVar, 6));
                } else {
                    if (!(aVar3 instanceof CallParticipantsViewModel.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bzb0Var.a();
                    cVar.a(j.a.a);
                }
                return s3q0.a;
            case 13:
                ((m99) this.c).d(new iz((whr0) obj, i2));
                return s3q0.a;
            case 14:
                z9a z9aVar = (z9a) this.c;
                List<Playlist> list = (List) obj;
                nt70 nt70Var = new nt70(z9aVar.e);
                nt70Var.m = list;
                mt70 a = nt70Var.a(z9aVar.f);
                z9aVar.i.getClass();
                return new hda(lu70.h(a), new CatalogExtendedData(null, null, null, null, null, null, null, null, z9a.a.b(list), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 7, null), null);
            case 15:
                ((zak0) ((noa) this.c).l).setValue((String) obj);
                return s3q0.a;
            case 16:
                i9b i9bVar = (i9b) this.c;
                i9bVar.m(i9bVar.c.b.k(i9bVar.a), null, new xv(i9bVar, 1));
                ((ikv0) obj).a();
                return s3q0.a;
            case 17:
                ExecutorService executorService = com.vk.mvi.core.internal.executors.a.a;
                com.vk.mvi.core.internal.executors.a.b(new xm6(1, (ymb) this.c, (Collection) obj));
                return s3q0.a;
            case 18:
                zcc zccVar = (zcc) this.c;
                jzd0 jzd0Var = zccVar.u;
                if (jzd0Var != null) {
                    jzd0Var.g((RecommendedProfile) zccVar.m, zccVar);
                }
                return s3q0.a;
            case 19:
                return ((com.vk.clips.favorites.impl.ui.folders.content.f) this.c).f.a((ClipsFavoriteFolderContentListState.Content) obj);
            case 20:
                com.vk.core.view.components.tabs.d dVar = (com.vk.core.view.components.tabs.d) this.c;
                ((etv0) obj).b(false);
                dVar.callOnClick();
                return s3q0.a;
            case 21:
                com.vk.profile.core.scheduled_clips.h hVar = (com.vk.profile.core.scheduled_clips.h) this.c;
                if (((Boolean) obj).booleanValue()) {
                    hVar.g.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    f4m.j(hVar.h);
                    hVar.j.setVisibility(0);
                } else {
                    f4m.j(hVar.j);
                }
                return s3q0.a;
            case 22:
                tny tnyVar = (tny) obj;
                mjo0 d = ((j1z) this.c).d();
                if (d != null) {
                    d.c = tnyVar;
                }
                return s3q0.a;
            case 23:
                x8k x8kVar = (x8k) this.c;
                tj50.a aVar4 = (tj50.a) obj;
                y8 y8Var = new y8(16);
                ao8 ao8Var = ao8.d;
                int i4 = 15;
                int i5 = 13;
                int i6 = 18;
                return new g9k.a(aVar4.a(y8Var, ao8Var), aVar4.a(new qm(i4), ao8Var), aVar4.a(new af2(i5), ao8Var), aVar4.a(new g53(x8kVar, 14), ao8Var), aVar4.a(new n82(x8kVar, i4), ao8Var), aVar4.a(new ob(x8kVar, i6), ao8Var), aVar4.a(new sm(16), ao8Var), aVar4.a(new vd1(i5), ao8Var), aVar4.a(new j60(i6), ao8Var), aVar4.a(w8k.b, ao8Var), aVar4.a(new x4(25), ao8Var), aVar4.a(new k60(24), ao8Var));
            case 24:
                com.vk.profile.questions.impl.b bVar = (com.vk.profile.questions.impl.b) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                t9k t9kVar = bVar.i1;
                if (t9kVar != null) {
                    t9kVar.g = booleanValue2;
                }
                bVar.Zn(booleanValue2);
                return s3q0.a;
            case 25:
                ((ugl) this.c).y(((gmq) obj).X());
                return s3q0.a;
            case 26:
                hrm.c cVar2 = (hrm.c) this.c;
                xgl0 xgl0Var = (xgl0) obj;
                gkx0 gkx0Var2 = cVar2.a;
                pum pumVar3 = cVar2.b;
                final int i7 = cVar2.c;
                gkx0 gkx0Var3 = gkx0.e;
                if (i7 <= 0) {
                    throw new IllegalArgumentException(lhg.a(i7, "Expect limit to be > 0. Given: "));
                }
                com.vk.im.engine.internal.storage.delegates.dialogs.b a2 = xgl0Var.b().a();
                int d2 = xgl0Var.system().d();
                nrm f = a2.f(pumVar3);
                boolean z = f != null && f.d == d2;
                final boolean z2 = !z;
                boolean z3 = f != null ? f.c : false;
                if (f == null) {
                    return new hrm.b(EmptyList.b, jgp.b, EmptySet.b, !gkx0Var2.equals(gkx0Var3), false, true, false);
                }
                gkx0 c = lmm.c((vjm) jw5.v(f.b, new vjm(0, 1)));
                com.vk.im.engine.internal.storage.delegates.dialogs.b a3 = xgl0Var.b().a();
                ArrayList c2 = a3.c(gkx0Var2, pumVar3, Direction.BEFORE, c, i7 + 1);
                gkx0 gkx0Var4 = gkx0Var3;
                ArrayList c3 = a3.c(gkx0Var2, pumVar3, Direction.AFTER, gkx0Var4, 2);
                List subList = c2.subList(0, Math.min(c2.size(), i7));
                boolean z4 = c2.size() > i7;
                int size = c3.size();
                hrm.a aVar5 = new hrm.a(subList, z4, (size == 0 || (size == 1 && epx.f(j5g.a0(c2), j5g.a0(c3)))) ? false : true);
                d040 o = xgl0Var.o();
                List list2 = subList;
                ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((arm) it.next()).a));
                    gkx0Var2 = gkx0Var2;
                    pumVar3 = pumVar3;
                }
                final gkx0 gkx0Var5 = gkx0Var2;
                final pum pumVar4 = pumVar3;
                Map<Long, lj30> R = o.R(arrayList);
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry<Long, lj30> entry : R.entrySet()) {
                    if (!entry.getValue().j) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                Iterator it2 = subList.iterator();
                int i8 = 0;
                while (true) {
                    if (it2.hasNext()) {
                        arm armVar = (arm) it2.next();
                        obj2 = gkx0Var4;
                        lj30 lj30Var = (lj30) linkedHashMap2.get(Long.valueOf(armVar.a));
                        if (armVar.e <= 0 || lj30Var != null || !armVar.g.isEmpty()) {
                            i8++;
                            gkx0Var4 = obj2;
                        }
                    } else {
                        obj2 = gkx0Var4;
                        i8 = -1;
                    }
                }
                hrm.a aVar6 = i8 < 0 ? aVar5 : new hrm.a(subList.subList(0, i8), false, aVar5.c);
                boolean z5 = aVar6.c;
                List<arm> list3 = aVar6.a;
                boolean z6 = list3.size() < subList.size();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                Iterator<T> it3 = list3.iterator();
                while (it3.hasNext()) {
                    List<arm> list4 = list3;
                    hrm.a aVar7 = aVar5;
                    lj30 lj30Var2 = (lj30) linkedHashMap2.get(Long.valueOf(((arm) it3.next()).a));
                    boolean z7 = z5;
                    LinkedHashMap linkedHashMap4 = linkedHashMap2;
                    if (lj30Var2 != null) {
                        linkedHashMap3.put(Long.valueOf(lj30Var2.b), lj30Var2);
                    }
                    linkedHashMap2 = linkedHashMap4;
                    aVar5 = aVar7;
                    z5 = z7;
                    list3 = list4;
                }
                boolean z8 = z5;
                List<arm> list5 = list3;
                final hrm.a aVar8 = aVar5;
                if (!z6 || i7 <= 1) {
                    aVar = aVar6;
                    obj3 = obj2;
                    linkedHashMap = linkedHashMap3;
                    pumVar = pumVar4;
                    gkx0Var = gkx0Var5;
                } else {
                    obj3 = obj2;
                    linkedHashMap = linkedHashMap3;
                    final hrm.a aVar9 = aVar6;
                    gzs gzsVar = new gzs() { // from class: xsna.erm
                        @Override // xsna.gzs
                        public final Object invoke() {
                            List<arm> list6 = hrm.a.this.a;
                            ArrayList arrayList2 = new ArrayList(c5g.u(list6, 10));
                            Iterator<T> it4 = list6.iterator();
                            while (it4.hasNext()) {
                                arrayList2.add(Long.valueOf(((arm) it4.next()).a));
                            }
                            Set S0 = j5g.S0(arrayList2);
                            List<arm> list7 = aVar9.a;
                            ArrayList arrayList3 = new ArrayList(c5g.u(list7, 10));
                            Iterator<T> it5 = list7.iterator();
                            while (it5.hasNext()) {
                                arrayList3.add(Long.valueOf(((arm) it5.next()).a));
                            }
                            return "Dialogs history trimmed, removedIds = " + izi0.g(S0, j5g.S0(arrayList3)) + ", since = " + gkx0Var5 + ", " + pumVar4 + ", limit = " + i7;
                        }
                    };
                    gkx0Var = gkx0Var5;
                    aVar = aVar9;
                    pumVar = pumVar4;
                    L.c("DialogMissedIssue", gzsVar);
                }
                ArraySet arraySet = new ArraySet();
                Iterator it4 = list5.iterator();
                while (it4.hasNext()) {
                    arm armVar2 = (arm) it4.next();
                    pum pumVar5 = pumVar;
                    Iterator it5 = it4;
                    lj30 lj30Var3 = (lj30) linkedHashMap.get(Long.valueOf(armVar2.a));
                    boolean z9 = armVar2.f != d2;
                    boolean z10 = (lj30Var3 == null || lj30Var3.l == d2) ? false : true;
                    if (z9 || z10) {
                        arraySet.add(Long.valueOf(armVar2.a));
                    }
                    it4 = it5;
                    pumVar = pumVar5;
                }
                final pum pumVar6 = pumVar;
                final boolean z11 = (list5.isEmpty() || ((arm) j5g.Y(list5)).f == d2) ? false : true;
                boolean z12 = (list5.isEmpty() || ((arm) j5g.i0(list5)).f == d2) ? false : true;
                boolean z13 = z && z3;
                boolean z14 = !gkx0Var.equals(obj3) && (z8 || z11 || !z);
                boolean z15 = !gkx0Var.equals(obj3) && z8;
                boolean z16 = aVar.b;
                boolean z17 = z16 || z6 || z12 || !z13;
                boolean z18 = z16 && !z6;
                if (z14) {
                    i = 1;
                    if (i7 > 1) {
                        final gkx0 gkx0Var6 = gkx0Var;
                        final hrm.a aVar10 = aVar;
                        gzs gzsVar2 = new gzs() { // from class: xsna.frm
                            @Override // xsna.gzs
                            public final Object invoke() {
                                StringBuilder sb = new StringBuilder("DialogsCacheHelper hasHistoryAfter: afterInCache = ");
                                gsi0.c(sb, hrm.a.this.c, ", firstExpired = ", z11, ", metaExpired = ");
                                sb.append(z2);
                                sb.append(", since = ");
                                sb.append(gkx0Var6);
                                sb.append(", ");
                                sb.append(pumVar6);
                                sb.append(", limit = ");
                                sb.append(i7);
                                return sb.toString();
                            }
                        };
                        aVar = aVar10;
                        gkx0Var = gkx0Var6;
                        pumVar2 = pumVar6;
                        L.c("DialogMissedIssue", gzsVar2);
                    } else {
                        pumVar2 = pumVar6;
                    }
                } else {
                    pumVar2 = pumVar6;
                    i = 1;
                }
                if (z17 && i7 > i) {
                    final gkx0 gkx0Var7 = gkx0Var;
                    final hrm.a aVar11 = aVar;
                    final pum pumVar7 = pumVar2;
                    final boolean z19 = z12;
                    final boolean z20 = z13;
                    L.c("DialogMissedIssue", new gzs() { // from class: xsna.grm
                        @Override // xsna.gzs
                        public final Object invoke() {
                            StringBuilder sb = new StringBuilder("DialogsCacheHelper hasHistoryBefore: beforeInCache = ");
                            gsi0.c(sb, hrm.a.this.b, ", lastExpired = ", z19, ", notFullyFetched = ");
                            sb.append(!z20);
                            sb.append(", since = ");
                            sb.append(gkx0Var7);
                            sb.append(", ");
                            sb.append(pumVar7);
                            sb.append(", limit = ");
                            sb.append(i7);
                            return sb.toString();
                        }
                    });
                }
                return new hrm.b(list5, linkedHashMap, arraySet, z14, z15, z17, z18);
            case 27:
                csm csmVar = (csm) this.c;
                if (epx.f(((xpp) obj).a(), Boolean.FALSE)) {
                    return io.reactivex.rxjava3.core.x.k(io8.a.a);
                }
                int i9 = 17;
                return csmVar.a.C(csmVar, new cbm()).l(new e8(new oc0(i9), i9));
            case 28:
                return Boolean.valueOf(epx.f(((cms0) ((one.video.player.tracks.c) ((kao) this.c).a).c).a, ((androidx.media3.common.a) obj).a));
            default:
                oxo oxoVar = (oxo) this.c;
                sxo sxoVar = (sxo) obj;
                sxo.a aVar12 = sxoVar.b;
                SwitcherUiMode switcherUiMode = sxoVar.c;
                ynn0 ynn0Var = oxoVar.d;
                if (!(aVar12 instanceof sxo.a.c)) {
                    if (aVar12 instanceof sxo.a.b.C3703b) {
                        return new uxo.a.InterfaceC3850a.b.C3853b(((sxo.a.b.C3703b) aVar12).a);
                    }
                    if (!(aVar12 instanceof sxo.a.b.C3702a)) {
                        if (aVar12 instanceof sxo.a.C3701a) {
                            return uxo.a.InterfaceC3850a.C3851a.a;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    sxo.a.b.C3702a c3702a = (sxo.a.b.C3702a) aVar12;
                    c3702a.getClass();
                    int i10 = c3702a.a;
                    exo exoVar = c3702a.b;
                    ynn0Var.getClass();
                    ListBuilder e = e43.e();
                    if (!(switcherUiMode instanceof SwitcherUiMode.EcoplateRestricted)) {
                        e.add(new znn0.b(exoVar));
                    }
                    if (i10 == 0) {
                        i10 = 1;
                    }
                    if (i10 > 1) {
                        e.add(znn0.c.a);
                    }
                    int min = Math.min(2, i10);
                    for (int i11 = 0; i11 < min; i11++) {
                        e.add(znn0.a.a);
                    }
                    return new uxo.a.InterfaceC3850a.b.C3852a(e.g());
                }
                ArrayList<aon0> arrayList2 = ((sxo.a.c) aVar12).a;
                dyo dyoVar = g70.a;
                jzq0 jzq0Var = ynn0Var.a;
                boolean d3 = ((aon0) j5g.Y(arrayList2)).a.a().d();
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                for (aon0 aon0Var : arrayList2) {
                    arrayList3.add(new xnn0.h(aon0Var.a, aon0Var.b, iah0.a(10)));
                }
                ArrayList arrayList4 = new ArrayList();
                Iterator it6 = arrayList3.iterator();
                while (it6.hasNext()) {
                    Object next = it6.next();
                    AccountProfileType accountProfileType = ((xnn0.h) next).a.a().m;
                    accountProfileType.getClass();
                    if (accountProfileType == AccountProfileType.NORMAL) {
                        arrayList4.add(next);
                    }
                }
                ListBuilder e2 = e43.e();
                if (switcherUiMode instanceof SwitcherUiMode.EcoplateRestricted) {
                    e2.add(new xnn0.e.a(2));
                    e2.addAll(arrayList4);
                } else if (d3) {
                    ListBuilder e3 = e43.e();
                    xnn0.h hVar2 = (xnn0.h) j5g.Y(arrayList3);
                    com.vk.superapp.multiaccount.api.f fVar = hVar2.a;
                    Iterator it7 = arrayList3.iterator();
                    while (true) {
                        if (it7.hasNext()) {
                            obj4 = it7.next();
                            xnn0.h hVar3 = (xnn0.h) obj4;
                            UserId userId = fVar.a().n;
                            if (userId != null) {
                                listBuilder = e3;
                                if (hVar3.a.a().b.b == userId.b) {
                                }
                            } else {
                                listBuilder = e3;
                            }
                            e3 = listBuilder;
                        } else {
                            listBuilder = e3;
                            obj4 = null;
                        }
                    }
                    xnn0.h hVar4 = (xnn0.h) obj4;
                    if (hVar4 == null) {
                        throw new MasterSessionNotFoundException(fVar.a().n);
                    }
                    ArrayList c4 = ynn0.c(rdi.A(0, arrayList3), hVar4.a);
                    xnn0.c cVar3 = new xnn0.c(new xxo(dyoVar, 30), switcherUiMode, hVar2.a);
                    ListBuilder listBuilder2 = listBuilder;
                    listBuilder2.add(cVar3);
                    float f2 = 16;
                    listBuilder2.add(new xnn0.g(iah0.a(f2)));
                    xnn0.b bVar2 = xnn0.b.a;
                    listBuilder2.add(bVar2);
                    jzq0Var.getClass();
                    listBuilder2.add(new xnn0.e.b("", 1));
                    listBuilder2.add(hVar4);
                    ArrayList b = ynn0.b(arrayList3, hVar2);
                    p4g.a(new xnn0.g(iah0.a(f2)), listBuilder2, !c4.isEmpty());
                    p4g.a(bVar2, listBuilder2, !c4.isEmpty());
                    p4g.a(new xnn0.e.b("", 1), listBuilder2, !c4.isEmpty());
                    if (!c4.isEmpty()) {
                        listBuilder2.addAll(c4);
                    }
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it8 = b.iterator();
                    while (it8.hasNext()) {
                        Object next2 = it8.next();
                        if (!((xnn0.h) next2).a.a().d()) {
                            arrayList5.add(next2);
                        }
                    }
                    p4g.a(new xnn0.g(iah0.a(f2)), listBuilder2, !arrayList5.isEmpty());
                    p4g.a(xnn0.b.a, listBuilder2, !arrayList5.isEmpty());
                    p4g.a(new xnn0.e.b(null, 2), listBuilder2, !arrayList5.isEmpty());
                    listBuilder2.addAll(ynn0.a(b, arrayList5, false));
                    e2.addAll(listBuilder2.g());
                } else {
                    ListBuilder e4 = e43.e();
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it9 = arrayList3.iterator();
                    while (it9.hasNext()) {
                        Object next3 = it9.next();
                        if (!((xnn0.h) next3).a.a().d()) {
                            arrayList6.add(next3);
                        }
                    }
                    boolean z21 = arrayList6.size() < 3;
                    xnn0.h hVar5 = (xnn0.h) j5g.Y(arrayList3);
                    ArrayList c5 = ynn0.c(arrayList3, hVar5.a);
                    boolean z22 = switcherUiMode instanceof SwitcherUiMode.EcoplateLK;
                    if (!z22) {
                        dyoVar = dyo.a.a;
                    }
                    e4.add(new xnn0.c(new xxo(dyoVar, 30), switcherUiMode, hVar5.a));
                    p4g.a(new xnn0.g(iah0.a(2)), e4, !c5.isEmpty());
                    p4g.a(xnn0.b.a, e4, z22 && !c5.isEmpty());
                    jzq0Var.getClass();
                    p4g.a(new xnn0.e.b("", 1), e4, !c5.isEmpty());
                    if (!c5.isEmpty()) {
                        e4.addAll(c5);
                    }
                    ArrayList b2 = ynn0.b(arrayList3, hVar5);
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it10 = b2.iterator();
                    while (it10.hasNext()) {
                        Object next4 = it10.next();
                        if (!((xnn0.h) next4).a.a().d()) {
                            arrayList7.add(next4);
                        }
                    }
                    float f3 = 16;
                    p4g.a(new xnn0.g(iah0.a(f3)), e4, !b2.isEmpty());
                    xnn0.b bVar3 = xnn0.b.a;
                    p4g.a(bVar3, e4, (b2.isEmpty() || (c5.isEmpty() && (switcherUiMode instanceof SwitcherUiMode.Ecoplate))) ? false : true);
                    p4g.a(new xnn0.e.b(null, 2), e4, !b2.isEmpty());
                    e4.addAll(ynn0.a(b2, arrayList7, true));
                    ListBuilder e5 = e43.e();
                    if (epx.f(switcherUiMode, SwitcherUiMode.EcoplateLK.b)) {
                        e5.add(new xnn0.g(iah0.a(f3)));
                        e5.add(bVar3);
                        if (z21) {
                            e5.add(new xnn0.d(FooterButtonType.ADD));
                        }
                        e5.add(new xnn0.d(FooterButtonType.LOGOUT));
                    } else if (epx.f(switcherUiMode, SwitcherUiMode.Ecoplate.b) && z21) {
                        e5.add(new xnn0.a(iah0.a(f3)));
                    }
                    e4.addAll(e5.g());
                    e2.addAll(e4.g());
                }
                return new uxo.a.InterfaceC3850a.c(e2.g());
        }
    }
}
