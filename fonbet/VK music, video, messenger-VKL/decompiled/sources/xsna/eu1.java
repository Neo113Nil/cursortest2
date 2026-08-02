package xsna;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.SignUpRouter;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog.mvi.section.di.CatalogComponent;
import com.vk.catalog.mvi.section.screen.impl.ui.CatalogSectionScreenFragment;
import com.vk.catalog2.common.ui.mvp.clip.ClipMusicTemplatesCatalogFragment;
import com.vk.channels.impl.channel_screen.profile.ChannelProfileFragment;
import com.vk.clips.editor.templates.api.di.ClipsTemplatesEditorComponent;
import com.vk.clips.favorites.impl.ui.folders.picker.a;
import com.vk.clips.sdk.shared.item.clip.events.ClipItemViewEvent;
import com.vk.clips.viewer.edit.api.domain.model.ClipEditSdkItem;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.clips.viewer.impl.utils.performance.ClipsScreenPerformanceReporter;
import com.vk.dto.articles.ArticleTts;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.newsfeed.impl.fragments.CommentThreadFragment;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.AwayWebViewFragment;
import java.util.ArrayList;
import xsna.dzc.e;
import xsna.p16.c;
import xsna.x3b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class eu1 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ eu1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int i = this.b;
        int i2 = 2;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                int i3 = AllHighlightsFragment.g0;
                ((AllHighlightsFragment) obj2).finish();
                return s3q0.a;
            case 1:
                e12 e12Var = (e12) obj2;
                wh50 wh50Var = e12Var.k;
                wh50 wh50Var2 = e12Var.f;
                Object value = ((zak0) wh50Var).getValue();
                if (value != null) {
                    return value;
                }
                float floatValue = ((vak0) e12Var.i).getFloatValue();
                return !Float.isNaN(floatValue) ? e12Var.c(floatValue, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((zak0) wh50Var2).getValue()) : ((zak0) wh50Var2).getValue();
            case 2:
                ((bq3) obj2).f.getCallback();
                return s3q0.a;
            case 3:
                return (TextView) ((aw3) obj2).b.findViewById(R.id.asr_status);
            case 4:
                return Integer.valueOf(((com.vk.attachpicker.fragment.gallery.a) obj2).e.k());
            case 5:
                int i4 = AwayWebViewFragment.t0;
                return ((LinksBridgeComponent) m7m.d((AwayWebViewFragment) obj2).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 6:
                return ((p16) obj2).new c();
            case 7:
                SignUpRouter signUpRouter = ((p66) obj2).n;
                SignUpRouter.a.a(signUpRouter != null ? signUpRouter : null, null, null, null, null, 15);
                return s3q0.a;
            case 8:
                lj8 lj8Var = (lj8) obj2;
                p5h0 p5h0Var = new p5h0((ViewGroup) lj8Var.b);
                p5h0Var.c = new io.reactivex.rxjava3.android.a(lj8Var, i2);
                return p5h0Var;
            case 9:
                qcy<Object>[] qcyVarArr = CatalogSectionScreenFragment.T;
                return (CatalogComponent) m7m.d((CatalogSectionScreenFragment) obj2).a(fpf0.a(CatalogComponent.class));
            case 10:
                ((k4b) obj2).d.invoke(x3b.d.b);
                return s3q0.a;
            case 11:
                int i5 = ChannelProfileFragment.e0;
                Bundle arguments = ((ChannelProfileFragment) obj2).getArguments();
                Boolean valueOf = arguments != null ? Boolean.valueOf(arguments.getBoolean("param_messages_to_channel_enabled")) : null;
                if (valueOf != null) {
                    return valueOf;
                }
                throw new IllegalArgumentException("There is no 'param_messages_to_channel_enabled' key in bundle.");
            case 12:
                ryb rybVar = ((azb) obj2).h;
                Dialog dialog = rybVar.j;
                dialog.notificationsDisabledUntil = 0L;
                dialog.notificationsIsUseSound = true;
                if (rybVar.getItemCount() > 0) {
                    rybVar.notifyItemChanged(0);
                }
                return s3q0.a;
            case 13:
                dw20 dw20Var = ((fgc) obj2).a.c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 14:
                qcy<Object>[] qcyVarArr2 = isc.t1;
                Bundle arguments2 = ((isc) obj2).getArguments();
                if (arguments2 != null) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        parcelable = arguments2.getParcelable("input_clip", ClipEditSdkItem.class);
                        obj = (Parcelable) parcelable;
                    } else {
                        Object parcelable2 = arguments2.getParcelable("input_clip");
                        obj = (ClipEditSdkItem) (parcelable2 instanceof ClipEditSdkItem ? parcelable2 : null);
                    }
                    ClipEditSdkItem clipEditSdkItem = (ClipEditSdkItem) obj;
                    if (clipEditSdkItem != null) {
                        return clipEditSdkItem;
                    }
                }
                throw new IllegalStateException("Edit should be opened with starter clip");
            case 15:
                SwipeRefreshLayout swipeRefreshLayout = ((ClipFeedListFragment) obj2).z1;
                if (swipeRefreshLayout != null) {
                    float f = 46;
                    int a = iah0.a(f);
                    int a2 = iah0.a(24) + iah0.a(f);
                    swipeRefreshLayout.s = true;
                    swipeRefreshLayout.y = a;
                    swipeRefreshLayout.z = a2;
                    swipeRefreshLayout.J = true;
                    swipeRefreshLayout.h();
                    swipeRefreshLayout.d = false;
                }
                return s3q0.a;
            case 16:
                return ((dzc) obj2).new e();
            case 17:
                return o1d.J((o1d) obj2);
            case 18:
                ((w2d) obj2).b.a(ClipItemViewEvent.k.b);
                return s3q0.a;
            case 19:
                int i6 = ClipMusicTemplatesCatalogFragment.U;
                return ((ClipsTemplatesEditorComponent) m7m.d((ClipMusicTemplatesCatalogFragment) obj2).a(fpf0.a(ClipsTemplatesEditorComponent.class))).l4();
            case 20:
                bzd bzdVar = (bzd) obj2;
                return new j0e(bzdVar.n, bzdVar.q, bzdVar.p);
            case 21:
                q0e q0eVar = (q0e) obj2;
                szd szdVar = q0eVar.e;
                s0e s0eVar = q0eVar.l;
                return new wo4(szdVar, (s0eVar != null ? s0eVar : null).h, q0eVar.c);
            case 22:
                ((p4e) obj2).b.invoke(a.C0604a.b);
                return s3q0.a;
            case 23:
                int i7 = ClipsGridCommonClipsListFragment.q0;
                return (BridgeComponent) m7m.d((ClipsGridCommonClipsListFragment) obj2).a(fpf0.a(BridgeComponent.class));
            case 24:
                final gje gjeVar = (gje) obj2;
                final ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.setInterpolator(new PathInterpolator(0.2f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.fje
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        if (ofFloat.isRunning()) {
                            Float f2 = (Float) valueAnimator.getAnimatedValue();
                            f2.getClass();
                            gjeVar.a.invoke(f2);
                        }
                    }
                });
                ofFloat.addListener(new hje(ofFloat, gjeVar));
                return ofFloat;
            case 25:
                ClipsWrapperInputArguments.a aVar = ClipsWrapperInputArguments.r;
                Bundle a3 = ((roe) obj2).a();
                aVar.getClass();
                return ClipsWrapperInputArguments.a.c(a3);
            case 26:
                gzs gzsVar = (gzs) ((zak0) ((naf) obj2).j1).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 27:
                int i8 = ClipsWrapperFragment.Q0;
                return new ffe(new ClipsWrapperFragment.g(0, (ClipsWrapperFragment) obj2, ClipsWrapperFragment.class, "getCurrentClipFeedPage", "getCurrentClipFeedPage()Lcom/vk/clips/sdk/shared/api/ui/ClipsFeedViewPage;", 0));
            case 28:
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a4 = ((ClipsWrapperInputArguments) obj2).a();
                aVar2.getClass();
                if (a4 != null) {
                    return (ClipsScreenPerformanceReporter) a4.getParcelable("ClipsWrapperFragment.performance_reporter");
                }
                return null;
            default:
                ArrayList<dl60> arrayList = CommentThreadFragment.y0;
                hl60 hl60Var = hl60.a;
                hl60.j(CommentThreadFragment.y0, (RecyclerView) obj2, null, null, 28);
                return s3q0.a;
        }
    }

    public /* synthetic */ eu1(bq3 bq3Var, ArticleTts articleTts) {
        this.b = 2;
        this.c = bq3Var;
    }
}
