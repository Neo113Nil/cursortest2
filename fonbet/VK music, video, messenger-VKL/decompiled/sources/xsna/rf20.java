package xsna;

import android.animation.ValueAnimator;
import android.text.TextPaint;
import androidx.fragment.app.Fragment;
import com.unity3d.ads.core.domain.events.GetTransactionRequest;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.paging.list.VkRecyclerPaginatedView;
import com.vk.music.offline.ui.presentation.entity.MusicDownloadsSettingsState;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.di.NewsfeedRouterComponent;
import com.vk.newsfeed.posting.impl.di.Posting2ComponentImpl;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.newsfeed.presentation.model.ActionsMenuType;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import com.vkontakte.android.data.DonutAnalytics;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import xsna.s1c0;
import xsna.tmd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class rf20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rf20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v35, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        float c;
        float d;
        ovj ioDispatcher;
        GetTransactionRequest initialize$lambda$220$lambda$137;
        int i = this.b;
        r2 = false;
        r2 = false;
        r2 = false;
        r2 = false;
        r2 = false;
        boolean z = false;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                xf20 xf20Var = ((sf20) obj).q;
                return Integer.valueOf(xf20Var != null ? xf20Var.b : 0);
            case 1:
                TextPaint textPaint = new TextPaint();
                com.vk.typography.b.c(textPaint, ((hk30) obj).a, FontFamily.REGULAR, Float.valueOf(13.0f), TextSizeUnit.SP);
                return textPaint;
            case 2:
                qk30.f(((vm30) obj).H, EmptyList.b, null);
                return s3q0.a;
            case 3:
                ((MusicCatalogRootVh) obj).B.a().a(false, true);
                return s3q0.a;
            case 4:
                return new af40(((te40) obj).a);
            case 5:
                MusicDownloadsSettingsState musicDownloadsSettingsState = (MusicDownloadsSettingsState) ((gzs) obj).invoke();
                return musicDownloadsSettingsState == null ? new MusicDownloadsSettingsState(false, 0L, 3, null) : musicDownloadsSettingsState;
            case 6:
                return (qdz) ((MusicSearchCatalogConfiguration) obj).M.getValue();
            case 7:
                Fragment fragment = ((xz70) obj).a;
                if (fragment instanceof vxh0) {
                    ((vxh0) fragment).n();
                }
                return s3q0.a;
            case 8:
                ((wh50) obj).setValue(Boolean.TRUE);
                return s3q0.a;
            case 9:
                return rl3.u0(((h5a0) obj).getFillPoints());
            case 10:
                return (VkRecyclerPaginatedView) ((hpb0) obj).g(R.id.poll_background_rv);
            case 11:
                return new ntl(((bzb0) obj).a);
            case 12:
                return (NewsfeedRouterComponent) ((k7m) m7m.f((xzb0) obj)).a(fpf0.a(NewsfeedRouterComponent.class));
            case 13:
                y8c0 y8c0Var = (y8c0) obj;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                f0c0 f0c0Var = y8c0Var.a;
                aVar.e = f0c0Var.g;
                aVar.f = true;
                aVar.g = true;
                aVar.h = f0c0Var.j;
                aVar.i = f0c0Var.k;
                aVar.k = true;
                aVar.o = true;
                aVar.m = f0c0Var.h;
                aVar.n = f0c0Var.i;
                sf2 sf2Var = new sf2();
                sf2Var.b = y8c0Var.h.get();
                aVar.s = sf2Var.a();
                aVar.t = BuildInfo.r();
                aVar.u = ActionsMenuType.REDESIGN_AND_DISABLE;
                aVar.A = DonutAnalytics.DonutCustomTeaserScreen.DONUT_CONTENT_LINK;
                aVar.I = true;
                return aVar.a();
            case 14:
                Posting2ComponentImpl posting2ComponentImpl = (Posting2ComponentImpl) obj;
                return new sz70(posting2ComponentImpl.a, posting2ComponentImpl.c);
            case 15:
                int i3 = PostingFragment.L0;
                return ((mui0) ((PostingFragment) obj).q0.getValue()).a();
            case 16:
                return Boolean.valueOf(((com.vk.newsfeed.impl.items.posting.item.modals.b) obj).a.d);
            case 17:
                return ((NewsFeedComponent) ((k7m) m7m.f((ylc0) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 18:
                ((ml1) obj).invoke(tmd0.f.a);
                return s3q0.a;
            case 19:
                int i4 = QuestionsListFragment.f0;
                ((QuestionsListFragment) obj).finish();
                return s3q0.a;
            case 20:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, b3f0.t);
                ofFloat.setStartDelay(b3f0.q);
                ofFloat.setDuration(b3f0.p);
                ofFloat.setInterpolator(new pkk(0.35f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.7f, 1.0f));
                ofFloat.addUpdateListener(new iex((b3f0) obj, i2));
                return ofFloat;
            case 21:
                com.vk.registration.funnels.b.z(com.vk.registration.funnels.b.a, SchemeStatSak$EventScreen.REGISTRATION_EMAIL_PASSWORD, (ArrayList) obj, null, null, 28);
                return s3q0.a;
            case 22:
                int i5 = RestoreSearchFragment.h0;
                return ((SearchParamsComponent) ((k7m) m7m.f((RestoreSearchFragment) obj)).a(fpf0.a(SearchParamsComponent.class))).M9();
            case 23:
                ((zak0) ((sjg0) obj).A).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 24:
                Class<?> loadClass = ((szg0) obj).a.loadClass("androidx.window.extensions.layout.DisplayFoldFeature");
                Method method = loadClass.getMethod("getType", null);
                Class cls = Integer.TYPE;
                Method method2 = loadClass.getMethod("hasProperty", cls);
                Method method3 = loadClass.getMethod("hasProperties", int[].class);
                if (Modifier.isPublic(method.getModifiers()) && method.getReturnType().equals(cls) && Modifier.isPublic(method2.getModifiers())) {
                    Class<?> returnType = method2.getReturnType();
                    Class cls2 = Boolean.TYPE;
                    if (returnType.equals(cls2) && Modifier.isPublic(method3.getModifiers()) && method3.getReturnType().equals(cls2)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 25:
                r5h0 r5h0Var = (r5h0) obj;
                if (r5h0Var.d() > r5h0Var.c()) {
                    c = r5h0Var.d();
                    d = r5h0Var.c();
                } else {
                    c = r5h0Var.c();
                    d = r5h0Var.d();
                }
                return Float.valueOf(c / d);
            case 26:
                ioDispatcher = ((UnityAdsModule) obj).ioDispatcher();
                return ioDispatcher;
            case 27:
                initialize$lambda$220$lambda$137 = ServiceProvider.initialize$lambda$220$lambda$137((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$137;
            case 28:
                return new c2j(((com.vk.voip.ui.sessionrooms.dialog.model.a) obj).a);
            default:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.comment_container);
        }
    }
}
