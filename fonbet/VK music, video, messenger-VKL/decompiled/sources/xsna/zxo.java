package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.compose.foundation.gestures.Orientation;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.sdk.exceptions.ApiErrorViewType;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.entername.EnterProfilePresenter;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.group.GroupFilterVh;
import com.vk.channels.api.ChannelEntryPoint;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.ColorProgressBar;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.text.expandable.VkExpandableText;
import com.vk.dto.attaches.AttachForMediaViewer;
import com.vk.dto.attaches.AttachWithImage;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.geo.GeoLocation;
import com.vk.dto.stories.model.GetStoriesResponse;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.ecomm.market.album.editor.cover.presentation.MarketEditAlbumCoverFragment;
import com.vk.im.engine.ChannelSource;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photo.editor.views.DashedSeekBar;
import com.vk.photogallery.LocalGalleryProvider;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchChannelsCatalogRootVh;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vk.stickers.VasProductType;
import com.vk.superapp.base.js.bridge.JsMethod;
import com.vk.superapp.health.js.bridge.api.events.GetSteps$Response;
import com.vk.superapp.miniapps.picker.PickerItem;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.g;
import com.vk.voip.api.id.CallId;
import com.vk.voip.ui.join.directly.withpreview.JoinCallFragment;
import com.vk.webapp.fragments.GiftsCatalogFragment;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.az20;
import xsna.bmt;
import xsna.cuy;
import xsna.gm50;
import xsna.l3s;
import xsna.niu;
import xsna.oiu;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zxo implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zxo(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x062a  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0651  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x0631  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0208  */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v54, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v57, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v61, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v64, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r2v74, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r3v75, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        jpp jppVar;
        DialogBackground dialogBackground;
        Enum valueOf;
        Integer num;
        Integer num2;
        ArrayList arrayList;
        JSONArray optJSONArray;
        JSONArray optJSONArray2;
        x9p x9pVar;
        float f;
        long j;
        mry mryVar;
        s3q0 observeLocalGalleryContentChangePaginated$lambda$16;
        Long l;
        int i = this.b;
        int i2 = 9;
        int i3 = 10;
        int i4 = 26;
        mry mryVar2 = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.b) obj2).l.b(new g.f(0));
                return s3q0.a;
            case 1:
                ((ikp) obj2).a();
                return s3q0.a;
            case 2:
                EnterProfilePresenter enterProfilePresenter = (EnterProfilePresenter) obj2;
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                if ((th instanceof IOException) || ((th instanceof VKApiExecutionException) && ((VKApiExecutionException) th).s() == -1)) {
                    com.vk.registration.funnels.b.t(com.vk.registration.funnels.b.a);
                } else {
                    com.vk.registration.funnels.b.a.getClass();
                    RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                    frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.INCORRECT_NAME, null, null, null, null, null, null, 238);
                }
                if (vggVar.b() == ApiErrorViewType.CUSTOM) {
                    if (th instanceof VKApiExecutionException) {
                        VKApiExecutionException vKApiExecutionException = (VKApiExecutionException) th;
                        if (vKApiExecutionException.x() && (jppVar = (jpp) enterProfilePresenter.a) != null) {
                            jppVar.E4(new ipp(vKApiExecutionException.t()));
                        }
                    }
                    s3q0 s3q0Var = s3q0.a;
                } else {
                    vggVar.c();
                }
                return s3q0.a;
            case 3:
                int i5 = ExploreFragment.h0;
                ((ExploreFragment) obj2).jo();
                return Boolean.TRUE;
            case 4:
                ci50 ci50Var = (ci50) obj2;
                T[] tArr = ci50Var.b;
                int i6 = ci50Var.d;
                for (int i7 = 0; i7 < i6; i7++) {
                    ((dp10) tArr[i7]).j();
                }
                return s3q0.a;
            case 5:
                ((h3s) obj2).T((l3s.d.b) obj);
                return s3q0.a;
            case 6:
                evs evsVar = (evs) obj2;
                evsVar.K.b(false, (View) obj, new ldl(evsVar, 15), new xrj(evsVar, i2));
                return s3q0.a;
            case 7:
                zvs zvsVar = ((fws) obj2).b;
                b6l0 b6l0Var = zvsVar.b;
                return io.reactivex.rxjava3.core.q.m(((io.reactivex.rxjava3.core.q) b6l0Var.d.getValue()).r0(io.reactivex.rxjava3.schedulers.a.a()).U(new tj60(new s1f0(r6 ? 1 : 0, b6l0Var, (String) obj), i2)), zvsVar.b(), new kb(new com.vk.movika.tools.controls.seekbar.u(zvsVar, 6), i4));
            case 8:
                io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) obj2;
                xpp xppVar = (xpp) j5g.a0((List) obj);
                if (xppVar == null || (dialogBackground = (DialogBackground) xppVar.a()) == null) {
                    rVar.b(new IllegalStateException("Couldn't find custom background in storage"));
                } else {
                    rVar.onNext(dialogBackground);
                }
                return s3q0.a;
            case 9:
                bmt bmtVar = (bmt) obj2;
                bmt.a aVar = (bmt.a) obj;
                blt bltVar = aVar.a;
                GeoLocation geoLocation = bltVar.c;
                GetStoriesResponse getStoriesResponse = bltVar.d;
                vmt vmtVar = bmtVar.f;
                vmtVar.c.a();
                qn60 qn60Var = vmtVar.b;
                pn60 pn60Var = vmtVar.c;
                aic aicVar = new aic();
                xwi xwiVar = new xwi(new ml0(new rlt(geoLocation, aVar.b, aVar.c), pn60Var), (geoLocation == null || geoLocation.g == ConnectivityTracker.DEFAULT_UPLINK_BITRATE || geoLocation.h == ConnectivityTracker.DEFAULT_UPLINK_BITRATE) ? false : true);
                ArrayList<StoriesContainer> arrayList2 = getStoriesResponse != null ? getStoriesResponse.c : null;
                return odq.c(qn60Var, aicVar, xwiVar, new xwi(new nl0(new ry60(getStoriesResponse, y8g0.e(R.string.geo_stories_near), null), pn60Var), !(arrayList2 == null || arrayList2.isEmpty())), new xc3(bltVar.a, null, pn60Var, bmtVar.g, null, true, null)).l(new kf3(new kdn(aVar, 7), 20));
            case 10:
                kvt kvtVar = (kvt) obj2;
                List list = (List) obj;
                String b = defpackage.j0.b("VKWebAppGetSteps", kvtVar.b);
                xgx0 xgx0Var = xgx0.a;
                StringBuilder sb = new StringBuilder("VkStepsGetStepsHealthConnectDelegate.handleStepsReceivedFromDataSource() -> steps: ");
                sb.append(list);
                sb.append(", thread: ");
                mft0.a(sb, xgx0Var);
                com.vk.superapp.base.js.bridge.b.p(kvtVar.b, new JsMethod("VKWebAppGetSteps"), new GetSteps$Response(null, new GetSteps$Response.Data(n0l0.a(list), b), b, 1, null), null, null, false, null, 60);
                return s3q0.a;
            case 11:
                GiftsCatalogFragment giftsCatalogFragment = (GiftsCatalogFragment) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                nzt nztVar = giftsCatalogFragment.a0;
                if (nztVar == null) {
                    return null;
                }
                Context requireContext = giftsCatalogFragment.requireContext();
                ArrayList J = (jSONObject == null || (optJSONArray2 = jSONObject.optJSONArray("product_ids")) == null) ? null : f370.J(optJSONArray2);
                String optString = jSONObject != null ? jSONObject.optString("product_type") : null;
                if (optString != null) {
                    try {
                        valueOf = Enum.valueOf(VasProductType.class, optString.toUpperCase(Locale.US));
                    } catch (IllegalArgumentException unused) {
                    }
                    VasProductType vasProductType = (VasProductType) valueOf;
                    num = J == null ? (Integer) j5g.a0(J) : null;
                    if (num != null || vasProductType == null) {
                        num2 = null;
                    } else {
                        int intValue = num.intValue();
                        num2 = Integer.valueOf(vasProductType == VasProductType.STICKER ? -Math.abs(intValue) : Math.abs(intValue));
                    }
                    if (num2 != null) {
                        L l2 = L.a;
                        l2.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.u(l2, L.LogType.e, new Object[]{"giftsCatalog.openGiftSendScreen error: invalid product id"});
                        }
                    } else {
                        if (jSONObject == null || (optJSONArray = jSONObject.optJSONArray("recipient_ids")) == null) {
                            arrayList = null;
                        } else {
                            ArrayList L = f370.L(optJSONArray);
                            ArrayList arrayList3 = new ArrayList(c5g.u(L, 10));
                            Iterator it = L.iterator();
                            while (it.hasNext()) {
                                dq.h(((Number) it.next()).longValue(), arrayList3);
                            }
                            arrayList = arrayList3;
                        }
                        String optString2 = jSONObject != null ? jSONObject.optString("ref") : null;
                        String optString3 = jSONObject != null ? jSONObject.optString("text") : null;
                        nztVar.c = jSONObject != null ? jSONObject.optBoolean("close_catalog_on_finish") : false;
                        zal0 a = g2v.d().a();
                        int intValue2 = num2.intValue();
                        if (nztVar.d == null) {
                            nztVar.d = UUID.randomUUID().toString();
                        }
                        a.k(requireContext, intValue2, arrayList, optString3, optString2);
                    }
                    return jSONObject;
                }
                valueOf = null;
                VasProductType vasProductType2 = (VasProductType) valueOf;
                if (J == null) {
                }
                if (num != null) {
                }
                num2 = null;
                if (num2 != null) {
                }
                return jSONObject;
            case 12:
                GlobalSearchChannelsCatalogRootVh globalSearchChannelsCatalogRootVh = (GlobalSearchChannelsCatalogRootVh) obj2;
                io.reactivex.rxjava3.disposables.b bVar = globalSearchChannelsCatalogRootVh.w;
                ?? r2 = globalSearchChannelsCatalogRootVh.v;
                l3a l3aVar = (l3a) obj;
                if (l3aVar instanceof b3a) {
                    b3a b3aVar = (b3a) l3aVar;
                    xyv.i(g2v.c().a(), globalSearchChannelsCatalogRootVh.b, b3aVar.a.b, null, new ChannelEntryPoint.Global(b3aVar.b), 4);
                } else if (l3aVar instanceof c3a) {
                    c3a c3aVar = (c3a) l3aVar;
                    bVar.b(((obb) r2.getValue()).b(c3aVar.a.b, new ChannelSource.GlobalPlus(c3aVar.b)).subscribe(new va4(0), new defpackage.z(new dam(i3), i4)));
                } else if (l3aVar instanceof d3a) {
                    obb obbVar = (obb) r2.getValue();
                    d3a d3aVar = (d3a) l3aVar;
                    long j2 = d3aVar.a.b;
                    new ChannelSource.GlobalPlus(d3aVar.b);
                    bVar.b(obbVar.a(j2).subscribe(new va4(0), new f40(new tc(i4), 22)));
                }
                return s3q0.a;
            case 13:
                ((jcu) obj2).d.invoke(sbu.b);
                return s3q0.a;
            case 14:
                miu miuVar = (miu) obj2;
                niu niuVar = (niu) obj;
                io.reactivex.rxjava3.subjects.f<oiu> fVar = miuVar.e;
                io.reactivex.rxjava3.subjects.d<jhu> dVar = miuVar.d;
                if (niuVar instanceof niu.a) {
                    jhu P0 = dVar.P0();
                    if (P0 != null) {
                        dVar.onNext(jhu.a(P0, false, true, false, false, false, 0, 61));
                    }
                } else if (epx.f(niuVar, niu.b.a)) {
                    jhu P02 = dVar.P0();
                    if (P02 != null) {
                        dVar.onNext(jhu.a(P02, false, false, false, true, false, 0, 55));
                    }
                    fVar.onNext(oiu.a.a);
                } else {
                    if (!epx.f(niuVar, niu.c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if (BuildInfo.s() || BuildInfo.t()) {
                        fVar.onNext(new oiu.b((CallId) miuVar.a.invoke()));
                    } else {
                        jhu P03 = dVar.P0();
                        if (P03 != null) {
                            dVar.onNext(jhu.a(P03, false, false, true, false, true, 0, 43));
                        }
                        p7j0 p7j0Var = miuVar.f;
                        p7j0Var.b.dispose();
                        r99 r99Var = r99.a;
                        x19.z(new i0b0(p7j0Var, 11));
                    }
                }
                return s3q0.a;
            case 15:
                return Boolean.valueOf(GroupFilterVh.t((UIBlockList) obj, (UIBlockGroupFilter) obj2));
            case 16:
                ((nav) obj2).a.g();
                return s3q0.a;
            case 17:
                return na8.a((int) sa30.E(((Float) obj).floatValue(), new k9x(0, 100, 1), new k9x(-50, 50, 1)), ((DashedSeekBar) obj2).getContext().getString(R.string.editor_lightness), " ");
            case 18:
                zrw zrwVar = (zrw) obj2;
                if (((Integer) obj) != null) {
                    zrwVar.o.setText(uqm0.o(r1.intValue()));
                }
                return s3q0.a;
            case 19:
                com.vk.superapp.miniapps.picker.f fVar2 = (com.vk.superapp.miniapps.picker.f) obj2;
                PickerItem.d dVar2 = fVar2.n;
                if (dVar2 != null) {
                    fVar2.l.g(dVar2);
                }
                return s3q0.a;
            case 20:
                JoinCallFragment joinCallFragment = (JoinCallFragment) obj2;
                x9p x9pVar2 = joinCallFragment.T;
                if (x9pVar2 != null && !x9pVar2.a() && (x9pVar = joinCallFragment.T) != null) {
                    FrameLayout frameLayout = joinCallFragment.S;
                    x9pVar.c(frameLayout != null ? frameLayout : null, new lzx());
                }
                return s3q0.a;
            case 21:
                return new com.vk.stickers.keyboard.navigation.e((ViewGroup) obj, ((com.vk.stickers.keyboard.navigation.a) obj2).k);
            case 22:
                dsy dsyVar = (dsy) obj2;
                bsy bsyVar = dsyVar.p;
                khl khlVar = dsyVar.a;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dsyVar.c()) && (f2 <= UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || dsyVar.e())) {
                    if (Math.abs(dsyVar.g) > 0.5f) {
                        xzw.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = dsyVar.g + f2;
                    dsyVar.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = dsyVar.g;
                        int b2 = an10.b(f4);
                        mry i8 = ((mry) ((zak0) dsyVar.e).getValue()).i(b2, !dsyVar.b);
                        if (i8 != null && (mryVar = dsyVar.c) != null) {
                            mry i9 = mryVar.i(b2, true);
                            if (i9 != null) {
                                dsyVar.c = i9;
                            }
                            if (mryVar2 == null) {
                                dsyVar.f(mryVar2, dsyVar.b, true);
                                zq70.A(dsyVar.r);
                                float f5 = f4 - dsyVar.g;
                                if (dsyVar.i) {
                                    ci50<cuy.b> ci50Var2 = khlVar.b;
                                    if (mryVar2.f().isEmpty()) {
                                        f = 0.5f;
                                    } else {
                                        boolean z = f5 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        int b3 = khl.b(mryVar2, z);
                                        f = 0.5f;
                                        int a2 = khl.a(mryVar2, z);
                                        if (a2 >= 0 && a2 < mryVar2.d()) {
                                            if (b3 == khlVar.a || b3 < 0) {
                                                j = 4294967295L;
                                            } else {
                                                if (khlVar.c != z) {
                                                    cuy.b[] bVarArr = ci50Var2.b;
                                                    int i10 = ci50Var2.d;
                                                    j = 4294967295L;
                                                    for (int i11 = 0; i11 < i10; i11++) {
                                                        bVarArr[i11].cancel();
                                                    }
                                                } else {
                                                    j = 4294967295L;
                                                }
                                                khlVar.c = z;
                                                khlVar.a = b3;
                                                ci50Var2.g();
                                                ci50Var2.c(ci50Var2.d, bsyVar.a(b3));
                                            }
                                            if (z) {
                                                xqy xqyVar = (xqy) j5g.i0(mryVar2.f());
                                                if (((wry.a(xqyVar, mryVar2.getOrientation()) + ((int) (mryVar2.getOrientation() == Orientation.Vertical ? xqyVar.a() & j : xqyVar.a() >> 32))) + mryVar2.e()) - mryVar2.h() < (-f5)) {
                                                    cuy.b[] bVarArr2 = ci50Var2.b;
                                                    int i12 = ci50Var2.d;
                                                    for (int i13 = 0; i13 < i12; i13++) {
                                                        bVarArr2[i13].d();
                                                    }
                                                }
                                            } else if (mryVar2.g() - wry.a((xqy) j5g.Y(mryVar2.f()), mryVar2.getOrientation()) < f5) {
                                                cuy.b[] bVarArr3 = ci50Var2.b;
                                                int i14 = ci50Var2.d;
                                                for (int i15 = 0; i15 < i14; i15++) {
                                                    bVarArr3[i15].d();
                                                }
                                            }
                                        }
                                    }
                                    khlVar.e = f5;
                                }
                            } else {
                                f = 0.5f;
                                stf0 stf0Var = dsyVar.j;
                                if (stf0Var != null) {
                                    stf0Var.k();
                                }
                                float f6 = f4 - dsyVar.g;
                                kry i16 = dsyVar.i();
                                if (dsyVar.i) {
                                    ci50<cuy.b> ci50Var3 = khlVar.b;
                                    if (!i16.f().isEmpty()) {
                                        r6 = f6 < UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                                        int b4 = khl.b(i16, r6);
                                        int a3 = khl.a(i16, r6);
                                        if (a3 >= 0 && a3 < i16.d()) {
                                            if (b4 != khlVar.a && b4 >= 0) {
                                                if (khlVar.c != r6) {
                                                    cuy.b[] bVarArr4 = ci50Var3.b;
                                                    int i17 = ci50Var3.d;
                                                    for (int i18 = 0; i18 < i17; i18++) {
                                                        bVarArr4[i18].cancel();
                                                    }
                                                }
                                                khlVar.c = r6;
                                                khlVar.a = b4;
                                                ci50Var3.g();
                                                ci50Var3.c(ci50Var3.d, bsyVar.a(b4));
                                            }
                                            if (r6) {
                                                xqy xqyVar2 = (xqy) j5g.i0(i16.f());
                                                if (((wry.a(xqyVar2, i16.getOrientation()) + ((int) (i16.getOrientation() == Orientation.Vertical ? xqyVar2.a() & 4294967295L : xqyVar2.a() >> 32))) + i16.e()) - i16.h() < (-f6)) {
                                                    cuy.b[] bVarArr5 = ci50Var3.b;
                                                    int i19 = ci50Var3.d;
                                                    for (int i20 = 0; i20 < i19; i20++) {
                                                        bVarArr5[i20].d();
                                                    }
                                                }
                                            } else if (i16.g() - wry.a((xqy) j5g.Y(i16.f()), i16.getOrientation()) < f6) {
                                                cuy.b[] bVarArr6 = ci50Var3.b;
                                                int i21 = ci50Var3.d;
                                                for (int i22 = 0; i22 < i21; i22++) {
                                                    bVarArr6[i22].d();
                                                }
                                            }
                                        }
                                    }
                                    khlVar.e = f6;
                                }
                            }
                            if (Math.abs(dsyVar.g) > f) {
                                f2 -= dsyVar.g;
                                dsyVar.g = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                            }
                        }
                        mryVar2 = i8;
                        if (mryVar2 == null) {
                        }
                        if (Math.abs(dsyVar.g) > f) {
                        }
                    }
                    f = 0.5f;
                    if (Math.abs(dsyVar.g) > f) {
                    }
                } else {
                    f2 = 0.0f;
                }
                return Float.valueOf(-f2);
            case 23:
                observeLocalGalleryContentChangePaginated$lambda$16 = LocalGalleryProvider.observeLocalGalleryContentChangePaginated$lambda$16((LocalGalleryProvider) obj2, (List) obj);
                return observeLocalGalleryContentChangePaginated$lambda$16;
            case 24:
                MarketEditAlbumCoverFragment marketEditAlbumCoverFragment = (MarketEditAlbumCoverFragment) obj2;
                lx00 lx00Var = (lx00) obj;
                ColorProgressBar colorProgressBar = marketEditAlbumCoverFragment.X;
                if (colorProgressBar == null) {
                    colorProgressBar = null;
                }
                f4m.j(colorProgressBar);
                LinearLayout linearLayout = marketEditAlbumCoverFragment.Y;
                (linearLayout != null ? linearLayout : null).setVisibility(0);
                gm50.a.a(marketEditAlbumCoverFragment, lx00Var.a, new iie(marketEditAlbumCoverFragment, 24));
                gm50.a.a(marketEditAlbumCoverFragment, lx00Var.b, new bgy(marketEditAlbumCoverFragment, r6 ? 1 : 0));
                gm50.a.a(marketEditAlbumCoverFragment, lx00Var.c, new sop(marketEditAlbumCoverFragment, 25));
                gm50.a.a(marketEditAlbumCoverFragment, lx00Var.d, new l6u(marketEditAlbumCoverFragment, 8));
                return s3q0.a;
            case 25:
                ((f810) obj2).T((p810) obj);
                return s3q0.a;
            case 26:
                q3v0 q3v0Var = ((h120) obj2).a;
                AttachWithImage attachWithImage = (AttachWithImage) q3v0Var.f.get(q3v0Var.s);
                if ((attachWithImage instanceof AttachForMediaViewer) && (l = q3v0Var.g) != null) {
                    AttachForMediaViewer attachForMediaViewer = (AttachForMediaViewer) attachWithImage;
                    if (l.longValue() == attachForMediaViewer.y()) {
                        q3v0Var.d.n(attachForMediaViewer.sa());
                    }
                }
                return s3q0.a;
            case 27:
                ((io.reactivex.rxjava3.subjects.d) obj2).onNext(Integer.valueOf(((xf20) obj).a));
                return s3q0.a;
            case 28:
                dr20 dr20Var = (dr20) obj2;
                VkMiniInfoCell vkMiniInfoCell = (VkMiniInfoCell) obj;
                vkMiniInfoCell.setMode((VkMiniInfoCell.Mode) dr20Var.e.get((String) ((zak0) dr20Var.i).getValue()));
                vkMiniInfoCell.setIcon((VkMiniInfoCell.d) dr20Var.f.get((String) ((zak0) dr20Var.k).getValue()));
                tlo0.a aVar2 = tlo0.Companion;
                ?? r3 = dr20Var.b;
                wh50 wh50Var = dr20Var.h;
                vkMiniInfoCell.setMiddle(new VkMiniInfoCell.e(u11.f(aVar2, (CharSequence) r3.get((String) ((zak0) wh50Var).getValue())), ((Boolean) dr20Var.c.get((String) ((zak0) dr20Var.j).getValue())).booleanValue(), ((Boolean) dr20Var.d.get((String) ((zak0) dr20Var.l).getValue())).booleanValue(), ((Boolean) ((zak0) dr20Var.n).getValue()).booleanValue(), false, epx.f((String) ((zak0) wh50Var).getValue(), "expandable") ? new VkMiniInfoCell.c(new VkExpandableText.a(new tlo0.h("Показать еще"), null, null, null, 30), 14) : null, 16));
                vkMiniInfoCell.setUserStack((VkMiniInfoCell.f) dr20Var.g.get((String) ((zak0) dr20Var.m).getValue()));
                return s3q0.a;
            default:
                ((zak0) ((az20) obj2).l).setValue((az20.b) obj);
                return s3q0.a;
        }
    }

    public /* synthetic */ zxo(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }
}
