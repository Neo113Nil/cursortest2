package xsna;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.drawable.Drawable;
import android.transition.Transition;
import android.util.Property;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.video.assistant.c;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.group.header.GroupHeader$Right;
import com.vk.core.compose.component.group.header.b;
import com.vk.core.compose.component.group.header.f;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistActionItem;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.yandex.mobile.ads.nativeads.NativeAdLoader;
import java.util.ArrayList;
import one.video.player.OneVideoPlayer;
import xsna.dg70;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class qg implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ qg(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ikg0 ikg0Var;
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ArrayList arrayList = (ArrayList) obj4;
                Transition transition = (Transition) obj3;
                com.vk.stories.design.view.polls.a aVar = (com.vk.stories.design.view.polls.a) obj;
                ((Integer) obj2).getClass();
                int i2 = AbstractPollView.S;
                Drawable background = aVar.getBackground();
                if (background instanceof rqb0) {
                    ((rqb0) background).a(0, false);
                }
                if (aVar.getVisibility() == 0) {
                    TextView textView = aVar.d;
                    Transition excludeTarget = transition.excludeTarget((View) textView, true);
                    AppCompatCheckBox appCompatCheckBox = aVar.e;
                    excludeTarget.excludeTarget((View) appCompatCheckBox, true).excludeTarget((View) aVar.c, true);
                    appCompatCheckBox.setVisibility(4);
                    textView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    textView.setTranslationX(com.vk.stories.design.view.polls.a.l);
                    AnimatorSet animatorSet = new AnimatorSet();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_X, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                    qq2.g(ofFloat, 2.0f);
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, 1.0f);
                    ofFloat2.setInterpolator(qq2.f);
                    animatorSet.playTogether(ofFloat, ofFloat2);
                    animatorSet.setDuration(600L);
                    arrayList.add(animatorSet);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.vk.catalog2.common.ui.mvp.holder.video.assistant.b.c((c.a) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                bgr.a(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                fg70.g((dg70.f) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                String str = (String) obj4;
                etv0 etv0Var = (etv0) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(113822577, intValue, -1, "com.vk.design.demo.presentation.screens.OnboardingTooltipScreenContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous> (OnboardingTooltipScreenContent.kt:177)");
                    }
                    boolean y = aVar2.y(etv0Var);
                    Object x = aVar2.x();
                    if (y || x == c0012a) {
                        x = new c950(etv0Var, 7);
                        aVar2.R(x);
                    }
                    mpj0.a(0, 2, aVar2, str, (gzs) x, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 5:
                ((ohk0) obj).c("onPlayerPaused");
                ks80.g((ks80) obj4, (OneVideoPlayer) obj3, "STATE:PAUSED", (String) obj2);
                break;
            case 6:
                ((Integer) obj2).getClass();
                kab0.a((kbb0) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(49));
                break;
            case 7:
                e64 e64Var = (e64) obj4;
                e64 e64Var2 = (e64) obj3;
                em50 em50Var = (em50) obj;
                k4f0 k4f0Var = (k4f0) obj2;
                if (!(k4f0Var instanceof l4f0)) {
                    break;
                } else {
                    break;
                }
            case 8:
                ((Integer) obj2).getClass();
                ((h1j0) obj4).d((bn50) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 9:
                zem0 zem0Var = (zem0) obj4;
                yem0 yem0Var = (yem0) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(98044640, intValue2, -1, "com.vk.stories.design.view.stats.tabs.header.StoryStatisticsHeaderHolder.bind.<anonymous>.<anonymous> (StoryStatisticsHeaderHolder.kt:24)");
                    }
                    String str2 = zem0Var.c;
                    int i3 = 6;
                    if (str2 == null || str2.length() == 0) {
                        aVar3.K(270176541);
                        aVar3.j();
                        ikg0Var = null;
                    } else {
                        aVar3.K(270220841);
                        String str3 = zem0Var.c;
                        boolean y2 = aVar3.y(yem0Var);
                        Object x2 = aVar3.x();
                        if (y2 || x2 == c0012a) {
                            x2 = new re40(yem0Var, 28);
                            aVar3.R(x2);
                        }
                        gzs gzsVar = (gzs) x2;
                        ButtonStyle buttonStyle = ButtonStyle.Link;
                        String str4 = zem0Var.c;
                        boolean J = aVar3.J(zem0Var);
                        Object x3 = aVar3.x();
                        if (J || x3 == c0012a) {
                            x3 = new iyd0(zem0Var, i3);
                            aVar3.R(x3);
                        }
                        GroupHeader$Right.a.C0743a a = GroupHeader$Right.a.C0743a.C0744a.a(str3, gzsVar, null, buttonStyle, null, str4, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar3, 3072, 12276);
                        aVar3 = aVar3;
                        ikg0Var = GroupHeader$Right.c.a(a, null, null, null, aVar3, 14);
                        aVar3.j();
                    }
                    String str5 = zem0Var.b;
                    boolean J2 = aVar3.J(zem0Var);
                    Object x4 = aVar3.x();
                    if (J2 || x4 == c0012a) {
                        x4 = new b8j0(zem0Var, i3);
                        aVar3.R(x4);
                    }
                    androidx.compose.runtime.a aVar4 = aVar3;
                    com.vk.core.compose.component.group.header.f a2 = f.a.a(str5, null, null, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x4, 3), null, false, aVar4, 805306368, 446);
                    b.d dVar = b.d.a;
                    Object x5 = aVar4.x();
                    if (x5 == c0012a) {
                        x5 = new q8w(24);
                        aVar4.R(x5);
                    }
                    com.vk.core.compose.component.group.header.g.b(a2, ahn.E(egi0.b(q630.a.a, false, (izs) x5), "story_statistics_header"), dVar, null, null, ikg0Var, false, aVar4, 384, 88);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                y4t0.a((VideoPlaylistActionItem) obj4, (gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((krt0) obj4).d((bn50) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            default:
                z4y0 z4y0Var = (z4y0) obj;
                ((e5y0) obj4).g.put(z4y0Var, (NativeAdLoader) obj2);
                ((io.reactivex.rxjava3.core.y) obj3).onSuccess(z4y0Var);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ qg(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
