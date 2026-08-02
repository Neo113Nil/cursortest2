package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.HandlerThread;
import android.os.Messenger;
import android.text.TextPaint;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.ui.holder.MusicArtistCatalogRootVh;
import com.vk.catalog2.feature.music.ui.holder.MusicOfflineCatalogRootVh;
import com.vk.donut.privacy.levels.PrivacyEditDonutLevelsFragment;
import com.vk.dto.donut.DonutLevel;
import com.vk.dto.im.MsgType;
import com.vk.ecomm.catalog.api.di.ClassifiedsComponent;
import com.vk.music.notifications.subscription.MusicBuyMusicSubscriptionFragment;
import com.vk.music.onboarding.impl.phone.MusicRecommendationOnboardingFragment;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.profile.core.scheduled_clips.g;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.restriction.di.VideoRestrictionManagerComponent;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.che0;
import xsna.dw20;
import xsna.fhc0;
import xsna.gv20;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class by20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ by20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        dw20.a c;
        int i = this.b;
        boolean z = false;
        Class<?> cls = null;
        Object obj = this.c;
        switch (i) {
            case 0:
                c = new dw20.b((Context) obj, null).w0("Сегодня — их день").s0("Порайдуте именинников подарком").c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                c.I0(null);
                return s3q0.a;
            case 1:
                hk30 hk30Var = (hk30) obj;
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(-16777216);
                com.vk.typography.b.c(textPaint, hk30Var.a, FontFamily.REGULAR, Float.valueOf(hk30Var.b.b(R.dimen.vkim_msg_part_fwd_subtitle)), TextSizeUnit.SP);
                return textPaint;
            case 2:
                ym30 ym30Var = ((vm30) obj).t0;
                if (ym30Var != null) {
                    ym30Var.D0();
                }
                return s3q0.a;
            case 3:
                return new ey30((sw30) obj);
            case 4:
                e140 e140Var = (e140) obj;
                e140Var.a();
                izs<? super MsgType, s3q0> izsVar = e140Var.s;
                if (izsVar == null) {
                    izsVar = null;
                }
                izsVar.invoke(null);
                return Boolean.TRUE;
            case 5:
                ((MusicArtistCatalogRootVh) obj).j0(false);
                return s3q0.a;
            case 6:
                int i2 = MusicBuyMusicSubscriptionFragment.V;
                return ((PlayerAnalyticsComponent) m7m.d((MusicBuyMusicSubscriptionFragment) obj).a(fpf0.a(PlayerAnalyticsComponent.class))).z7();
            case 7:
                return Boolean.valueOf(((MusicOfflineCatalogRootVh) obj).p);
            case 8:
                int i3 = MusicRecommendationOnboardingFragment.Y;
                return ((MusicPrefsComponent) m7m.d((MusicRecommendationOnboardingFragment) obj).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            case 9:
                return ((VideoRestrictionManagerComponent) ((k7m) m7m.f((MusicSearchCatalogConfiguration) obj)).a(fpf0.a(VideoRestrictionManagerComponent.class))).n2();
            case 10:
                return ((Posting2Component) ((k7m) m7m.f((q860) obj)).mo408a(fpf0.a(Posting2Component.class))).a();
            case 11:
                return ((NewsfeedFragment) obj).n0;
            case 12:
                ((ik70) obj).g.getClass();
                return s3q0.a;
            case 13:
                return enj.c(R.drawable.vk_icon_delete_outline_28, dhr0.t.c(R.attr.vk_ui_icon_negative), ((View) obj).getContext());
            case 14:
                gjb0 gjb0Var = ((cib0) obj).c;
                if (gjb0Var != null) {
                    gjb0Var.L();
                }
                return s3q0.a;
            case 15:
                return ((hpb0) obj).g(R.id.poll_option_description);
            case 16:
                return (ClassifiedsComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(ClassifiedsComponent.class));
            case 17:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj;
                kgc0.Z1(bVar.b, bVar.a.h, true, 12);
                return s3q0.a;
            case 18:
                ylc0 ylc0Var = (ylc0) obj;
                return new mlq0(ylc0Var, ylc0Var.c, (jbc0) ylc0Var.f.getValue(), (fhc0.e) ylc0Var.g.getValue(), ylc0Var.e);
            case 19:
                qcy<Object>[] qcyVarArr = PostsFromNotificationsFragment.p0;
                return ((PostsFromNotificationsFragment) obj).ho();
            case 20:
                qcy<Object>[] qcyVarArr2 = PrivacyEditDonutLevelsFragment.T;
                Bundle requireArguments = ((PrivacyEditDonutLevelsFragment) obj).requireArguments();
                ArrayList parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? requireArguments.getParcelableArrayList("donut_levels", DonutLevel.class) : requireArguments.getParcelableArrayList("donut_levels");
                List O0 = parcelableArrayList != null ? j5g.O0(parcelableArrayList) : null;
                return O0 == null ? EmptyList.b : O0;
            case 21:
                return ((SharingComponent) ((rkd0) obj).i.getValue()).u();
            case 22:
                ((dee0) obj).c.a(g.d.a);
                wjs0.a(uxr0.a);
                return s3q0.a;
            case 23:
                che0 che0Var = (che0) obj;
                return new Messenger(new che0.a(che0Var, ((HandlerThread) che0Var.c.getValue()).getLooper()));
            case 24:
                QuestionsListFragment questionsListFragment = (QuestionsListFragment) obj;
                ((spl0) questionsListFragment.e0.getValue()).k(questionsListFragment.requireContext(), false, true, null);
                return s3q0.a;
            case 25:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.BANNED_ACCOUNT, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 26:
                szg0 szg0Var = (szg0) obj;
                try {
                    cls = szg0Var.b.a.loadClass("java.util.function.Consumer");
                } catch (ClassNotFoundException unused) {
                }
                if (cls != null) {
                    Class<?> loadClass = szg0Var.a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
                    z = Modifier.isPublic(loadClass.getMethod("addWindowLayoutInfoListener", Activity.class, cls).getModifiers()) && Modifier.isPublic(loadClass.getMethod("removeWindowLayoutInfoListener", cls).getModifiers());
                }
                return Boolean.valueOf(z);
            case 27:
                ((gv20.c) obj).getClass();
                throw null;
            case 28:
                ((gzs) obj).invoke();
                return s3q0.a;
            default:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_header_shadow);
        }
    }

    public /* synthetic */ by20(gv20.c cVar, cah0 cah0Var) {
        this.b = 27;
        this.c = cVar;
    }

    public /* synthetic */ by20(iy20 iy20Var, Context context) {
        this.b = 0;
        this.c = context;
    }
}
