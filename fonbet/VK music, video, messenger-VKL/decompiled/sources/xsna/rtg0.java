package xsna;

import android.util.Size;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.ViewFlipper;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoDiscoverResponseDto;
import com.vk.auth.loginconfirmation.VkLoginConfirmationStatusType;
import com.vk.catalog2.feature.music.api.CatalogGetAudioSearchRequestFactory;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.formitem.VkFormField;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.dto.photo.Photo;
import com.vk.libvideo.adfree.impl.ui.VideoAdFreeSubscriptionFragment;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.libvideo.ui.VideoAuthorView;
import com.vk.stat.scheme.SchemeStat$PostDraftItemEventType;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.video.ui.discovery.recommendations.VideoDiscoveryRecommendationsRepository;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vk.voip.ui.watchmovie.player.CommandForPlayer;
import com.vkontakte.android.R;
import com.vkontakte.android.sdk.SDKInviteDialog;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import org.json.JSONObject;
import xsna.gdw0;
import xsna.hdw0;
import xsna.ikv0;
import xsna.imw0;
import xsna.kos0;
import xsna.m7a0;
import xsna.nps0;
import xsna.r4n0;
import xsna.tlo0;
import xsna.xcw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class rtg0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rtg0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v15, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r11v49, types: [xsna.gei0] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r5v0, types: [android.util.Size, java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r5v1, types: [xsna.ldi0] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        hdw0.a.C2987a.AbstractC2988a abstractC2988a;
        int i = this.b;
        int i2 = 10;
        int i3 = 12;
        int i4 = 6;
        boolean z = false;
        z = false;
        z = false;
        z = false;
        int i5 = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                a2e0 a2e0Var = (a2e0) obj2;
                a2e0Var.b((io.reactivex.rxjava3.disposables.c) obj);
                a2e0Var.c(300L);
                return s3q0.a;
            case 1:
                View view = ((SDKInviteDialog) obj2).U;
                if (view != null) {
                    bwt0.p0(view, true);
                }
                return s3q0.a;
            case 2:
                hqh0 hqh0Var = (hqh0) obj2;
                String str = (String) obj;
                String str2 = hqh0Var.r;
                if (hqh0Var.m != CatalogGetAudioSearchRequestFactory.SearchMusicEntrypoint.SearchInServiceKids) {
                    hqh0Var.c.a(str2);
                }
                hqh0Var.a().R(str);
                w950 w950Var = (w950) hqh0Var.o.getValue();
                if (w950Var != null) {
                    String str3 = ((MusicCatalogRootVh) hqh0Var.h.c).t;
                    if (str3 == null) {
                        str3 = "";
                    }
                    w950Var.j(str3);
                }
                return s3q0.a;
            case 3:
                ((io.reactivex.rxjava3.core.y) obj2).onError((Throwable) obj);
                return s3q0.a;
            case 4:
                e3j0 e3j0Var = (e3j0) obj2;
                Date date = (Date) obj;
                e3j0Var.b.e1(date);
                ((fhc0) e3j0Var.q.getValue()).x().d(date.getTime(), e3j0Var.o);
                jbc0 jbc0Var = (jbc0) e3j0Var.p.getValue();
                SchemeStat$PostDraftItemEventType schemeStat$PostDraftItemEventType = SchemeStat$PostDraftItemEventType.POST_NOW;
                jbc0Var.g();
                return s3q0.a;
            case 5:
                ((i6l0) obj2).o.toggle();
                return s3q0.a;
            case 6:
                n3n0 n3n0Var = (n3n0) obj2;
                n3n0Var.b.invoke(((View) obj).getContext(), n3n0Var);
                return s3q0.a;
            case 7:
                ((r4n0.a) obj2).a();
                return s3q0.a;
            case 8:
                final boolean booleanValue = ((Boolean) obj).booleanValue();
                rdi.y((gce0) obj2, new izs() { // from class: xsna.zdq0
                    @Override // xsna.izs
                    public final Object invoke(Object obj3) {
                        return PublishState.a((PublishState) obj3, null, null, null, null, false, null, null, null, null, null, false, false, null, null, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, false, null, null, false, false, null, false, false, null, false, false, booleanValue, false, -1, 1791);
                    }
                });
                return s3q0.a;
            case 9:
                r0e0 r0e0Var = ((vnq0) obj2).a;
                m7a0 m7a0Var = (m7a0) obj;
                if (m7a0Var instanceof m7a0.a) {
                    List<Photo> list = ((m7a0.a) m7a0Var).b;
                    if (!(list instanceof Collection) || !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((Photo) it.next()).e, r0e0Var.a())) {
                                z = true;
                            }
                        }
                    }
                } else if (m7a0Var instanceof m7a0.b) {
                    List<Photo> list2 = ((m7a0.b) m7a0Var).a;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((Photo) it2.next()).e);
                    }
                    z = arrayList.contains(r0e0Var.a());
                } else {
                    if (!(m7a0Var instanceof m7a0.d) && !(m7a0Var instanceof m7a0.e)) {
                        if (!(m7a0Var instanceof m7a0.f) && !(m7a0Var instanceof m7a0.g)) {
                            if (!(m7a0Var instanceof m7a0.c)) {
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 10:
                arq0 arq0Var = (arq0) obj2;
                VkContextMenu vkContextMenu = (VkContextMenu) obj;
                ((zak0) arq0Var.t).setValue(vkContextMenu);
                arq0Var.s6(true);
                vkContextMenu.e(new zv(20, arq0Var, vkContextMenu));
                return s3q0.a;
            case 11:
                hyq0 hyq0Var = (hyq0) obj2;
                xyq0 xyq0Var = hyq0Var.f;
                RecomSettingsGetAvailableRecomThemesResponseDto recomSettingsGetAvailableRecomThemesResponseDto = (RecomSettingsGetAvailableRecomThemesResponseDto) obj;
                if (!recomSettingsGetAvailableRecomThemesResponseDto.d().isEmpty()) {
                    xyq0Var.i();
                }
                io.reactivex.rxjava3.core.x c = xyq0Var.c();
                asu0 asu0Var = asu0.a;
                hyq0Var.e.b(c.q(asu0Var.c()).m(asu0Var.d()).subscribe(new le50(new il7(22, hyq0Var, recomSettingsGetAvailableRecomThemesResponseDto), 21), new gyq0(new noq0(i5, hyq0Var, recomSettingsGetAvailableRecomThemesResponseDto), z ? 1 : 0)));
                return s3q0.a;
            case 12:
                i0r0 i0r0Var = (i0r0) obj2;
                ?? r11 = i0r0Var.l;
                ldi0 ldi0Var = i0r0Var.p;
                r11.j(ldi0Var != null ? ldi0Var : 0);
                return s3q0.a;
            case 13:
                ((ubr0) obj2).c.j(JsApiMethodType.SHOW_REQUEST_BOX, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
            case 14:
                brr0 brr0Var = (brr0) obj2;
                pk30 pk30Var = brr0Var.n;
                if (pk30Var != null) {
                    List<Integer> list3 = brr0Var.p;
                    pk30Var.h(list3 != null ? list3 : null);
                }
                return s3q0.a;
            case 15:
                ((gvr0) obj2).l.a0();
                return s3q0.a;
            case 16:
                VideoAdFreeSubscriptionFragment videoAdFreeSubscriptionFragment = (VideoAdFreeSubscriptionFragment) obj2;
                JSONObject jSONObject = (JSONObject) obj;
                int i6 = VideoAdFreeSubscriptionFragment.b0;
                ?? r0 = videoAdFreeSubscriptionFragment.a0;
                ((vyr0) r0.getValue()).e();
                yyr0 d = ((vyr0) r0.getValue()).d();
                if (d != null) {
                    d.a();
                }
                ikv0.a aVar = new ikv0.a(videoAdFreeSubscriptionFragment.requireContext());
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_positive), (Size) r5, i3);
                aVar.u = new ikv0.d(videoAdFreeSubscriptionFragment.getString(R.string.video_ad_free_subscription_success_snackbar), (String) r5, (ikv0.d.a) r5, i4);
                aVar.e = 4000L;
                aVar.n();
                videoAdFreeSubscriptionFragment.eo();
                return jSONObject;
            case 17:
                ((VideoAuthorView) obj2).e.invoke(VideoAuthorView.Action.Click);
                return s3q0.a;
            case 18:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                mm50<ups0, nps0, rps0> mm50Var = ((t3s0) obj2).U0;
                if (mm50Var != null) {
                    mm50Var.b(new nps0.c(booleanValue2));
                }
                return s3q0.a;
            case 19:
                VideoDiscoveryRecommendationsRepository videoDiscoveryRecommendationsRepository = (VideoDiscoveryRecommendationsRepository) obj2;
                VideoGetVideoDiscoverResponseDto videoGetVideoDiscoverResponseDto = (VideoGetVideoDiscoverResponseDto) obj;
                videoDiscoveryRecommendationsRepository.getClass();
                ddt0.a.getClass();
                return videoDiscoveryRecommendationsRepository.a(new c3t(com.vk.dto.video.a.a(ums0.e(ums0.a, videoGetVideoDiscoverResponseDto.f(), videoGetVideoDiscoverResponseDto.j(), videoGetVideoDiscoverResponseDto.e(), false, 52)), videoGetVideoDiscoverResponseDto.getCount()), videoGetVideoDiscoverResponseDto.d(), videoGetVideoDiscoverResponseDto.i(), videoGetVideoDiscoverResponseDto.g());
            case 20:
                String str4 = (String) obj;
                JSONObject optJSONObject = ((JSONObject) obj2).optJSONObject(str4);
                if (optJSONObject == null) {
                    return null;
                }
                kos0.r.getClass();
                kos0 b = kos0.a.b(optJSONObject);
                if (b == null) {
                    return null;
                }
                return new Pair(str4, b);
            case 21:
                tgi0 tgi0Var = (tgi0) obj;
                int i7 = VideoOfflineFragment.f1;
                qgi0.r(tgi0Var, "VideoOfflineTopBarBack");
                qgi0.h(tgi0Var, ((VideoOfflineFragment) obj2).requireContext().getString(R.string.video_accessibility_back));
                return s3q0.a;
            case 22:
                MotionEvent motionEvent = (MotionEvent) obj;
                ((LinearLayout) obj2).getBackground().setHotspot(motionEvent.getX(), motionEvent.getY());
                return s3q0.a;
            case 23:
                vgg vggVar = (vgg) obj;
                Throwable th = vggVar.a;
                v2v0 v2v0Var = (v2v0) ((a3v0) obj2).a;
                if (v2v0Var != null) {
                    v2v0Var.oa(VkLoginConfirmationStatusType.ERROR_DENY);
                }
                par0.a.getClass();
                par0.d(th);
                vggVar.c();
                return s3q0.a;
            case 24:
                ((mov0) obj2).c.j(JsApiMethodType.SHOW_GOODS_ORDER_BOX, VkAppsErrors.b((Throwable) obj));
                return s3q0.a;
            case 25:
                gdw0 gdw0Var = (gdw0) obj;
                ((fdw0) obj2).d.getClass();
                if (!(gdw0Var instanceof gdw0.a)) {
                    return hdw0.a.b.a;
                }
                gdw0.a aVar2 = (gdw0.a) gdw0Var;
                String str5 = aVar2.b;
                tlo0.a aVar3 = tlo0.Companion;
                String str6 = aVar2.c;
                tlo0.h d2 = oq.d(aVar3, str6);
                if (str6.length() > 12) {
                    str6 = str6.substring(0, 12).concat("...");
                }
                gdw0.a.AbstractC2935a abstractC2935a = aVar2.f;
                if (abstractC2935a instanceof gdw0.a.AbstractC2935a.b) {
                    abstractC2988a = hdw0.a.C2987a.AbstractC2988a.b.a;
                } else {
                    if (!(abstractC2935a instanceof gdw0.a.AbstractC2935a.C2936a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    abstractC2988a = hdw0.a.C2987a.AbstractC2988a.C2989a.a;
                }
                return new hdw0.a.c(new hdw0.a.C2987a(str5, d2, str6, abstractC2988a), aVar2.e);
            case 26:
                ((nfw0) obj2).i.onNext(((List) obj).isEmpty() ? CommandForPlayer.TRANSLATION_DOWN : CommandForPlayer.TRANSLATION_UP);
                return s3q0.a;
            case 27:
                ((dkw0) obj2).b.a((fh8) ((it80) obj).a);
                return s3q0.a;
            case 28:
                ylw0 ylw0Var = (ylw0) obj2;
                imw0.a aVar4 = (imw0.a) obj;
                if (aVar4 instanceof imw0.a.f) {
                    ViewFlipper viewFlipper = ylw0Var.i1;
                    if (viewFlipper == null) {
                        viewFlipper = null;
                    }
                    boolean g = sp.g(viewFlipper, 2);
                    imw0.a.f fVar = (imw0.a.f) aVar4;
                    imw0.a.C3063a c3063a = fVar.b;
                    ((ulw0) ylw0Var.v1.getValue()).setItems(fVar.a);
                    VkInputSelect vkInputSelect = ylw0Var.r1;
                    if (vkInputSelect == null) {
                        vkInputSelect = null;
                    }
                    if (!String.valueOf(vkInputSelect.getText()).equals(c3063a.a)) {
                        ylw0Var.s1.dispose();
                        VkInputSelect vkInputSelect2 = ylw0Var.r1;
                        if (vkInputSelect2 == null) {
                            vkInputSelect2 = null;
                        }
                        vkInputSelect2.setText(c3063a.a);
                        if (g) {
                            VkInputSelect vkInputSelect3 = ylw0Var.r1;
                            if (vkInputSelect3 == null) {
                                vkInputSelect3 = null;
                            }
                            bwt0.j(vkInputSelect3, new eci0(i2, c3063a, ylw0Var));
                        }
                    }
                    if (ylw0Var.s1.h()) {
                        VkInputSelect vkInputSelect4 = ylw0Var.r1;
                        if (vkInputSelect4 == null) {
                            vkInputSelect4 = null;
                        }
                        ylw0Var.s1 = new io.reactivex.rxjava3.internal.operators.observable.y(new qno0(vkInputSelect4.getEditText()).U(new u1j0(new pzt0(i4), i3)), io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).y(150L, TimeUnit.MILLISECONDS).subscribe(new cgu0(new zyl0(ylw0Var, 26), i4));
                    }
                    VkFormField vkFormField = ylw0Var.q1;
                    if (vkFormField == null) {
                        vkFormField = null;
                    }
                    vkFormField.setDisabled(!c3063a.b);
                    VkInputSelect vkInputSelect5 = ylw0Var.r1;
                    if (vkInputSelect5 == null) {
                        vkInputSelect5 = null;
                    }
                    vkInputSelect5.setHint(c3063a.c.a(ylw0Var.requireContext()));
                    RecyclerView recyclerView = ylw0Var.k1;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    recyclerView.post(new hv1(ylw0Var, 23));
                    VkButton vkButton = ylw0Var.j1;
                    if (vkButton == null) {
                        vkButton = null;
                    }
                    vkButton.setEnabled(c3063a.f);
                    ProgressBar progressBar = ylw0Var.p1;
                    if (progressBar == null) {
                        progressBar = null;
                    }
                    bwt0.p0(progressBar, fVar.c);
                    boolean z2 = c3063a.e instanceof imw0.a.b.C3065b;
                    VkFormField vkFormField2 = ylw0Var.q1;
                    if (vkFormField2 == null) {
                        vkFormField2 = null;
                    }
                    vkFormField2.setError(z2);
                    if (z2) {
                        VkFormField vkFormField3 = ylw0Var.q1;
                        if (vkFormField3 == null) {
                            vkFormField3 = null;
                        }
                        vkFormField3.setError(true);
                        VkFormField vkFormField4 = ylw0Var.q1;
                        if (vkFormField4 == null) {
                            vkFormField4 = null;
                        }
                        vkFormField4.setError(ylw0Var.getString(R.string.voip_change_name_validation_error_text));
                    } else {
                        String str7 = c3063a.d;
                        VkFormField vkFormField5 = ylw0Var.q1;
                        if (vkFormField5 == null) {
                            vkFormField5 = null;
                        }
                        vkFormField5.setCaption(str7.length() == 0 ? ylw0Var.getString(R.string.voip_change_name_block_description_without_name) : ylw0Var.getString(R.string.voip_change_name_block_description, str7));
                    }
                    RecyclerView recyclerView2 = ylw0Var.k1;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    bwt0.p0(recyclerView2, fVar.d);
                    boolean z3 = c3063a.g;
                    VkFormField vkFormField6 = ylw0Var.q1;
                    if (vkFormField6 == null) {
                        vkFormField6 = null;
                    }
                    bwt0.p0(vkFormField6, z3);
                    if (!z3) {
                        VkInputSelect vkInputSelect6 = ylw0Var.r1;
                        mhy.d(vkInputSelect6 != null ? vkInputSelect6 : null);
                    }
                } else if (aVar4 instanceof imw0.a.e) {
                    ViewFlipper viewFlipper2 = ylw0Var.i1;
                    sp.g(viewFlipper2 != null ? viewFlipper2 : null, 0);
                } else {
                    if (!(aVar4 instanceof imw0.a.c)) {
                        int i8 = ylw0.x1;
                        throw new NoWhenBranchMatchedException();
                    }
                    ViewFlipper viewFlipper3 = ylw0Var.i1;
                    if (viewFlipper3 == null) {
                        viewFlipper3 = null;
                    }
                    sp.g(viewFlipper3, 1);
                    imw0.a.c cVar = (imw0.a.c) aVar4;
                    TextView textView = ylw0Var.l1;
                    (textView != null ? textView : null).setText(cVar.a.getMessage());
                }
                return s3q0.a;
            default:
                ((nrw0) obj2).q(xcw0.f.a);
                return s3q0.a;
        }
    }

    public /* synthetic */ rtg0(qst0 qst0Var, LinearLayout linearLayout) {
        this.b = 22;
        this.c = linearLayout;
    }
}
