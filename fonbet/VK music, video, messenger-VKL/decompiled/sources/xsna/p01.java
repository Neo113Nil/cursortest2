package xsna;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.video.VideoSearchParamsVh;
import com.vk.catalog2.feature.music.dto.ui.UiBlockInteractiveVkMix;
import com.vk.catalog2.feature.music.holders.vkmix.MusicVkMixVh;
import com.vk.catalog2.feature.music.holders.vkmix.viewholders.MusicBaseVkMixInteractiveVh;
import com.vk.clips.design.view.actionlinks.holders.tip.ItemTipView;
import com.vk.clips.sdk.shared.item.market_ads.events.MarketAdsItemViewEvent;
import com.vk.core.view.components.spinner.VkSpinnerContent;
import com.vk.music.mixsettings.MixSettingsEntity;
import com.vk.newsfeed.common.recycler.holders.donut.DonutPostClickSource;
import com.vk.newsfeed.impl.explore.ExploreFragment;
import com.vk.photo.editor.features.crop.models.stat.CropStatEvent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.voip.ui.history.friends.ui.VoipHistoryFriendsFragment;
import com.vkontakte.android.R;
import kotlin.random.Random;
import xsna.dw20;
import xsna.jgz0;
import xsna.k840;
import xsna.kkz0;
import xsna.ptw0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class p01 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p01(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        jfk jfkVar;
        tnt tntVar;
        dw20.a c;
        r1o r1oVar;
        Long l;
        r80 a;
        MixSettingsEntity mixSettingsEntity;
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                w01 w01Var = (w01) obj;
                Activity L = blk.L(w01Var.a);
                if (L != null) {
                    w01Var.c.a(L, new yc(w01Var, i2));
                    break;
                }
                break;
            case 1:
                ((ComponentWebView) obj).a(view);
                break;
            case 2:
                gik gikVar = (gik) obj;
                uik uikVar = gikVar.n;
                if (uikVar != null && (jfkVar = uikVar.o) != null && (tntVar = jfkVar.j) != null && !uikVar.n) {
                    uikVar.n = true;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(uikVar.b.getContent().getMirror(), (Property<rhk, Float>) View.SCALE_X, !tntVar.c ? -1.0f : 1.0f);
                    we2.a(ofFloat, new com.vk.movika.sdk.base.ui.r(6, tntVar, uikVar));
                    ofFloat.start();
                }
                gikVar.j.b(CropStatEvent.e.a);
                break;
            case 3:
                enm enmVar = (enm) obj;
                Context context = enmVar.itemView.getContext();
                View view2 = new View(context);
                view2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
                dw20.b bVar = new dw20.b(context, null);
                cbq.a(bVar);
                c = ((dw20.b) bVar.w0("Title").s0("Subtitle").D0(view2, false).j0("Click Me!", new krh(enmVar, 5)).F(uko.d(R.drawable.vk_icon_write_24, R.color.vk_gray_400, context), null)).b0(new ifg(enmVar, 10)).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                enmVar.l = c.I0(null);
                break;
            case 4:
                ((aan) obj).a();
                break;
            case 5:
                b0o b0oVar = (b0o) obj;
                d0o d0oVar = (d0o) b0oVar.C;
                if (d0oVar != null && (r1oVar = d0oVar.l) != null) {
                    j1o.a(b0oVar, b0oVar.itemView.getContext(), r1oVar, (p4r) b0oVar.H.getValue(), DonutPostClickSource.Background);
                    break;
                }
                break;
            case 6:
                int i3 = ExploreFragment.h0;
                ((ExploreFragment) obj).s();
                break;
            case 7:
                sys sysVar = (sys) obj;
                otu0 un = sysVar.un();
                Context requireContext = sysVar.requireContext();
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.AUTH_PASSWORD;
                un.getClass();
                otu0.b(requireContext, schemeStatSak$EventScreen);
                break;
            case 8:
                quv.p((quv) obj);
                break;
            case 9:
                int i4 = ItemTipView.f;
                dvx presenter = ((ItemTipView) obj).getPresenter();
                if (presenter != null) {
                    presenter.P1();
                    break;
                }
                break;
            case 10:
                ((cq00) obj).b.a(MarketAdsItemViewEvent.g.b);
                break;
            case 11:
                ((gzs) obj).invoke();
                break;
            case 12:
                MusicBaseVkMixInteractiveVh musicBaseVkMixInteractiveVh = (MusicBaseVkMixInteractiveVh) obj;
                ib40 ib40Var = musicBaseVkMixInteractiveVh.n;
                aud audVar = musicBaseVkMixInteractiveVh.k;
                r6m.a.getClass();
                if (!r6m.j()) {
                    ib40Var.t3(null);
                    break;
                } else {
                    UiBlockInteractiveVkMix a2 = audVar.a();
                    if (a2 != null ? a2.B : false) {
                        Random.b.getClass();
                        l = Long.valueOf(Random.c.n(9999999999999L));
                    } else {
                        l = null;
                    }
                    s750 s750Var = k840.a.e;
                    if (s750Var == null) {
                        s750Var = null;
                    }
                    UiBlockInteractiveVkMix a3 = audVar.a();
                    String str = a3 != null ? a3.y : null;
                    if (str == null) {
                        str = "";
                    }
                    s750Var.G0(str, l, null);
                    l4v0 l4v0Var = musicBaseVkMixInteractiveVh.i;
                    if (l4v0Var != null && (a = l4v0Var.a()) != null && (mixSettingsEntity = (MixSettingsEntity) a.c) != null) {
                        mixSettingsEntity.f();
                    }
                    musicBaseVkMixInteractiveVh.b.P0(ib40Var, false);
                    MusicVkMixVh.l(musicBaseVkMixInteractiveVh, null, l, 1);
                    break;
                }
            case 13:
                sbs0 sbs0Var = (sbs0) obj;
                sbs0Var.b();
                sbs0Var.d.invoke();
                break;
            case 14:
                wet0 wet0Var = ((VideoSearchParamsVh) obj).f;
                izs<Boolean, s3q0> izsVar = wet0Var.f;
                if (izsVar != null) {
                    izsVar.invoke(Boolean.TRUE);
                }
                wet0Var.b();
                wet0Var.a.invoke(wet0Var.g);
                break;
            case 15:
                int i5 = VkSpinnerContent.k;
                ((VkSpinnerContent.a.C0864a) obj).getClass();
                break;
            case 16:
                tyv0 tyv0Var = ((com.vk.superapp.verification.account.d) obj).M;
                (tyv0Var != null ? tyv0Var : null).a();
                break;
            case 17:
                int i6 = VoipHistoryFriendsFragment.U;
                ((VoipHistoryFriendsFragment) obj).finish();
                break;
            case 18:
                ((cuw0) obj).c.invoke(ptw0.i.b);
                break;
            case 19:
                kkz0.a aVar = ((fxy0) obj).r;
                if (aVar != null) {
                    ((jgz0.b) aVar).a(1, new akz0());
                    break;
                }
                break;
            default:
                ((z7z0) obj).g.a(view, 2);
                break;
        }
    }
}
