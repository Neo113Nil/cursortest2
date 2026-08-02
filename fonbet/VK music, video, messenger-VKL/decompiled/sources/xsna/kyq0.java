package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.unity3d.ads.adplayer.WebViewAdPlayer;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.StorageEventInfo;
import com.vk.api.generated.auth.dto.AuthExternalFlowOutResponseDto;
import com.vk.api.generated.calls.dto.CallsGetHistoryResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.im.engine.models.c;
import com.vk.im.ui.views.StencilLayout;
import com.vk.im.ui.views.WriteBarDisabled;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.search.restore.VkRestoreSearchActivity;
import com.vk.stories.design.view.editor.verticalization.VerticalizationLoadingView;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.browser.internal.utils.FlashlightUtils;
import com.vk.superapp.core.ui.VkDelegatingActivity;
import com.vk.video.polls.di.UxPollsComponentImpl;
import com.vk.video.polls.entrypoint.model.UxPollEntryPoint;
import com.vk.voip.dto.RecordType;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import xsna.hpe0;
import xsna.i770;
import xsna.iat0;
import xsna.ikv0;
import xsna.imw0;
import xsna.kew.a;
import xsna.nts0;
import xsna.nts0.b;
import xsna.tj50;
import xsna.xuw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class kyq0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kyq0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        s3q0 storageEventCallback$lambda$0;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                return Integer.valueOf(((lyq0) obj2).d.size());
            case 1:
                UxPollsComponentImpl uxPollsComponentImpl = (UxPollsComponentImpl) obj2;
                qcy<Object>[] qcyVarArr = UxPollsComponentImpl.i;
                Context context = uxPollsComponentImpl.a.a;
                nwy nwyVar = uxPollsComponentImpl.f;
                qcy<Object> qcyVar = UxPollsComponentImpl.i[2];
                return new com.vk.video.polls.analytics.a(context, (UxPollEntryPoint) obj, (o4r0) nwyVar.c(), uxPollsComponentImpl.b, uxPollsComponentImpl.c);
            case 2:
                gzs<s3q0> gzsVar = ((VerticalizationLoadingView) obj2).z;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 3:
                ((nrr0) obj2).l.r();
                return s3q0.a;
            case 4:
                nts0 nts0Var = (nts0) obj2;
                List<e0l0> list = (List) obj;
                if (!list.isEmpty()) {
                    int i2 = nts0.E;
                    kew kewVar = nts0Var.b;
                    if (kewVar != null) {
                        StencilLayout stencilLayout = nts0Var.o;
                        ViewGroup viewGroup = stencilLayout == null ? null : stencilLayout;
                        nts0.b bVar = nts0Var.new b();
                        Context context2 = viewGroup.getContext();
                        bpn0 bpn0Var = enj.a;
                        Activity h = e3m.h(context2);
                        kewVar.e = list;
                        c.C1123c c1123c = c.C1123c.b;
                        L l = L.a;
                        l.getClass();
                        if (!L.m(LoggerOutputTarget.NONE)) {
                            L.LogType logType = L.LogType.i;
                            StringBuilder sb = new StringBuilder("size=");
                            mbw.a.getClass();
                            sb.append(mbw.d(mbw.c().getString("round_camera_preview_target_size", null)));
                            L.u(l, logType, new Object[]{"VideoMessageLog", sb.toString()});
                        }
                        List<e0l0> list2 = list;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            arrayList.add(((e0l0) it.next()).b);
                        }
                        int i3 = 0;
                        nih nihVar = new nih(0, bVar, pew.class, "onCameraFirstFrameDrawn", "onCameraFirstFrameDrawn()V", i3, 2);
                        lew lewVar = new lew(0, kewVar, kew.class, "onCameraReady", "onCameraReady()V", 0, 0);
                        cq6 cq6Var = new cq6(0, bVar, pew.class, "onStencilsReady", "onStencilsReady()V", i3, 4);
                        c1123c.getClass();
                        int h2 = c1123c.a.h();
                        mbw.a.getClass();
                        ung0 ung0Var = new ung0(h, arrayList, nihVar, lewVar, cq6Var, h2, mbw.d(mbw.c().getString("round_camera_preview_target_size", null)));
                        if (kewVar.a.get()) {
                            ung0Var.k();
                        } else {
                            ung0Var.j();
                        }
                        jhu0 jhu0Var = ((fj9) ij9.a.a.getValue()).a;
                        kewVar.b = jhu0Var != null ? jhu0Var.p() : false;
                        kewVar.c = ung0Var.getHasMoreThenOneCamera();
                        for (View view : awt0.d(viewGroup)) {
                            if (epx.f(view, kewVar.d.get())) {
                                viewGroup.removeView(view);
                            }
                        }
                        viewGroup.addView(ung0Var, 0);
                        kewVar.f = bVar;
                        ung0Var.setRecordingCallback(kewVar.new a());
                        kewVar.d = new WeakReference<>(ung0Var);
                        kewVar.d(i2);
                    }
                    nts0Var.g();
                    kew kewVar2 = nts0Var.b;
                    if (kewVar2 == null || !kewVar2.c) {
                        ImageView imageView = nts0Var.k;
                        d3m.e(imageView == null ? null : imageView, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? false : false);
                    } else {
                        ImageView imageView2 = nts0Var.k;
                        d3m.c(imageView2 == null ? null : imageView2, (r15 & 1) != 0 ? 300L : 150L, (r15 & 2) != 0 ? 0L : 0L, (r15 & 4) != 0 ? null : null, (r15 & 8) == 0 ? null : null, (r15 & 16) != 0 ? 1.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    }
                    nts0Var.getHandler().postDelayed(new ebq(nts0Var, list, i2), 100L);
                }
                return s3q0.a;
            case 5:
                cys0 cys0Var = (cys0) obj2;
                ezn eznVar = (ezn) obj;
                bpn0 bpn0Var2 = xwk.a;
                ((qdz) (bpn0Var2 != null ? bpn0Var2 : null).getValue()).e().a(cys0Var.getContext(), xeq0.b(eznVar.a, "video_channel"));
                return s3q0.a;
            case 6:
                iat0.d dVar = (iat0.d) obj2;
                iat0.a aVar = dVar.n;
                if (aVar != null) {
                    aVar.a(((hpe0.c) dVar.m.get(dVar.getAbsoluteAdapterPosition())).a.d);
                }
                iat0 iat0Var = dVar.o;
                List O0 = j5g.O0(iat0Var.e);
                List<hpe0> invoke = iat0Var.c.invoke();
                iat0Var.e = invoke;
                int size = invoke.size();
                for (int i4 = 0; i4 < size; i4++) {
                    Object obj3 = O0.get(i4);
                    hpe0.c cVar = obj3 instanceof hpe0.c ? (hpe0.c) obj3 : null;
                    hpe0 hpe0Var = iat0Var.e.get(i4);
                    hpe0.c cVar2 = hpe0Var instanceof hpe0.c ? (hpe0.c) hpe0Var : null;
                    if (cVar != null && cVar2 != null && cVar.a.e != cVar2.a.e) {
                        iat0Var.notifyItemChanged(i4);
                    }
                }
                return s3q0.a;
            case 7:
                com.vk.newsfeed.common.recycler.holders.i iVar = (com.vk.newsfeed.common.recycler.holders.i) obj2;
                io.reactivex.rxjava3.disposables.c cVar3 = (io.reactivex.rxjava3.disposables.c) obj;
                io.reactivex.rxjava3.disposables.c cVar4 = iVar.V;
                if (cVar4 != null) {
                    cVar4.dispose();
                }
                iVar.V = cVar3;
                return s3q0.a;
            case 8:
                lcv0 lcv0Var = (lcv0) obj2;
                Bundle bundle = new Bundle();
                bundle.putBoolean("from_builder", true);
                bundle.putInt("country", 0);
                bundle.putString("hint", lcv0Var.getContext().getString(R.string.vk_discover_search_choose_a_city));
                bundle.putBoolean("show_none", lcv0Var.b.b > 0);
                int i5 = VkDelegatingActivity.f;
                VkDelegatingActivity.a.a(lcv0Var.c, VkRestoreSearchActivity.class, pku0.class, bundle, 747);
                return s3q0.a;
            case 9:
                ggu0 ggu0Var = (ggu0) obj2;
                Boolean bool = (Boolean) obj;
                io.reactivex.rxjava3.core.w wVar = FlashlightUtils.a;
                boolean hasSystemFeature = jgn0.a().getPackageManager().hasSystemFeature("android.hardware.camera.flash");
                ggu0Var.d.n(JsApiMethodType.FLASH_GET_INFO, new JSONObject().put("is_available", hasSystemFeature).put("level", (hasSystemFeature && bool.booleanValue()) ? 1.0d : ConnectivityTracker.DEFAULT_UPLINK_BITRATE));
                return s3q0.a;
            case 10:
                w6v0 w6v0Var = (w6v0) obj2;
                AuthExternalFlowOutResponseDto authExternalFlowOutResponseDto = (AuthExternalFlowOutResponseDto) obj;
                SignUpDataHolder signUpDataHolder = w6v0Var.p;
                Bundle bundle2 = (signUpDataHolder != null ? signUpDataHolder : null).K;
                if (bundle2 != null) {
                    m63.m(bundle2, authExternalFlowOutResponseDto.d());
                }
                w6v0Var.y0();
                return s3q0.a;
            case 11:
                lcw0 lcw0Var = (lcw0) obj2;
                com.vk.voip.ui.c.b.getClass();
                com.vk.voip.ui.c.j0().u0();
                lcw0Var.g(true);
                lcw0Var.c.invoke();
                return s3q0.a;
            case 12:
                mjw0 mjw0Var = (mjw0) obj2;
                ikv0.a aVar2 = new ikv0.a(mjw0Var.v());
                aVar2.u = new ikv0.d(mjw0Var.getContext().getString(((Integer) obj).intValue()), (String) null, (ikv0.d.a) null, 6);
                aVar2.n();
                return s3q0.a;
            case 13:
                return new imw0.b(((tj50.a) obj).a(new bmw0(1, ((cmw0) obj2).d, jmw0.class, "toViewState", "toViewState(Lcom/vk/voip/ui/change_name/feature/VoipChangeNameState;)Lcom/vk/voip/ui/change_name/ui/VoipChangeNameViewState$ContentDialog;", 0), ao8.d));
            case 14:
                puw0 puw0Var = (puw0) obj2;
                CallsGetHistoryResponseDto callsGetHistoryResponseDto = (CallsGetHistoryResponseDto) obj;
                puw0Var.o.getClass();
                ArrayList a = qp90.a(callsGetHistoryResponseDto);
                xx1 xx1Var = puw0Var.n;
                List<UsersUserFullDto> j = callsGetHistoryResponseDto.j();
                xx1Var.getClass();
                LinkedHashMap n = xx1.n(j);
                LinkedHashMap l2 = xx1.l(callsGetHistoryResponseDto.e());
                LinkedHashMap i6 = xx1.i(callsGetHistoryResponseDto.d());
                Long i7 = callsGetHistoryResponseDto.i();
                return new xuw0.a(a, n, l2, i6, i7 != null ? i7.longValue() : 0L, callsGetHistoryResponseDto.f());
            case 15:
                ((io.reactivex.rxjava3.subjects.d) obj2).onNext((RecordType) obj);
                return s3q0.a;
            case 16:
                storageEventCallback$lambda$0 = WebViewAdPlayer.storageEventCallback$lambda$0((WebViewAdPlayer) obj2, (StorageEventInfo) obj);
                return storageEventCallback$lambda$0;
            case 17:
                ((ykx0) obj2).b.invoke();
                return s3q0.a;
            case 18:
                i770.a aVar3 = (i770.a) obj;
                ((lpx0) obj2).a(aVar3.a, aVar3.b);
                return s3q0.a;
            case 19:
                t1y0 t1y0Var = ((WriteBar) obj2).L;
                if (t1y0Var != null) {
                    t1y0Var.b();
                }
                return s3q0.a;
            default:
                return Integer.valueOf(((kkm) obj).f(((WriteBarDisabled) obj2).g.h()));
        }
    }
}
