package xsna;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.room.RoomDatabase;
import com.vk.attachpicker.impl.graffiti.presentation.GraffitiDrawingFragment;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.comments.api.model.MarketItemCommentsArgs;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.dialogsscreen.impl.GroupDialogsScreenFragment;
import com.vk.dialogstoolbar.impl.di.DialogsToolbarInternalFeatureComponent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.fullscreenvideo.design.view.bottom.FullscreenBottomControlsView;
import com.vk.gif.data.local.GifDatabase;
import com.vk.gif.di.GifSelectorComponentImpl;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.di.ImCmdRxExecutorComponent;
import com.vk.im.engine.di.ImConfigurationScopedComponent;
import com.vk.im.engine.di.executor.ImCmdRxExecutorScopedComponentImpl;
import com.vk.im.engine.di.scope.ImFeatureScopeProviderComponent;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.ui.fragments.ImDialogsSelectionFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.externcalls.analytics.internal.upload.MultiUploadHelper;
import xsna.b500;
import xsna.e3m;
import xsna.tkt;
import xsna.w1g0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class xis implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xis(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, xsna.jv20] */
    /* JADX WARN: Type inference failed for: r0v59, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v27, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    @Override // xsna.gzs
    public final Object invoke() {
        WebView webView;
        Handler handler_delegate$lambda$0;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((yis) obj).D6();
                return s3q0.a;
            case 1:
                return FullscreenBottomControlsView.B((FullscreenBottomControlsView) obj);
            case 2:
                tkt.a aVar = ((okt) obj).e;
                if (aVar != null) {
                    return new fkt(aVar);
                }
                return null;
            case 3:
                RoomDatabase.a a = bhv0.a(((GifSelectorComponentImpl) obj).a.a, "gif_db", GifDatabase.class);
                a.c();
                asu0.a.getClass();
                a.f = asu0.n();
                return new tyt(new xyt(((GifDatabase) a.b()).y()));
            case 4:
                return ((GlobalSearchAllCatalogRootVh) obj).m.b.e;
            case 5:
                GraffitiDrawingFragment graffitiDrawingFragment = (GraffitiDrawingFragment) obj;
                int i2 = GraffitiDrawingFragment.Q;
                graffitiDrawingFragment.getClass();
                xn50.a.c(graffitiDrawingFragment, tbu.b);
                return s3q0.a;
            case 6:
                int i3 = GroupDialogsScreenFragment.e0;
                return (DialogsToolbarInternalFeatureComponent) m7m.d((GroupDialogsScreenFragment) obj).mo408a(fpf0.a(DialogsToolbarInternalFeatureComponent.class));
            case 7:
                HomeFragment2 homeFragment2 = (HomeFragment2) obj;
                homeFragment2.ro(homeFragment2.Q);
                return s3q0.a;
            case 8:
                ImCmdRxExecutorScopedComponentImpl imCmdRxExecutorScopedComponentImpl = (ImCmdRxExecutorScopedComponentImpl) obj;
                acw acwVar = imCmdRxExecutorScopedComponentImpl.a;
                return acwVar.a ? new mzv(sdy.n(acwVar)) : ((ImCmdRxExecutorComponent) imCmdRxExecutorScopedComponentImpl.b.getValue()).g();
            case 9:
                ImDialogsSelectionFragment imDialogsSelectionFragment = (ImDialogsSelectionFragment) obj;
                int i4 = ImDialogsSelectionFragment.n0;
                l7m d = m7m.d(imDialogsSelectionFragment);
                return ((ImConfigurationScopedComponent) xq.f((ImFeatureScopeProviderComponent) d.a(fpf0.a(ImFeatureScopeProviderComponent.class)), (Peer) imDialogsSelectionFragment.P.getValue(), d).a(fpf0.a(ImConfigurationScopedComponent.class))).b0();
            case 10:
                gzs<s3q0> onLogStart = ((h5x) obj).getOnLogStart();
                if (onLogStart != null) {
                    onLogStart.invoke();
                }
                return s3q0.a;
            case 11:
                return (ImageView) ((wex) obj).itemView.findViewById(R.id.video_single_clip_like);
            case 12:
                fgx0 fgx0Var = ((x6y) obj).n;
                if (fgx0Var == null || (webView = fgx0Var.a) == null) {
                    return null;
                }
                return webView.getUrl();
            case 13:
                return Boolean.valueOf(b500.a.$EnumSwitchMapping$0[((LongPollType) obj).ordinal()] == 1 ? BuildInfo.s() : false);
            case 14:
                int i5 = MarketItemCommentsFragment.j0;
                Bundle arguments = ((MarketItemCommentsFragment) obj).getArguments();
                if (arguments != null) {
                    return (MarketItemCommentsArgs) arguments.getParcelable("MARKET_ITEM_COMMENTS_ARGS_KEY");
                }
                return null;
            case 15:
                qcy<Object>[] qcyVarArr = MarketItemReviewRepliesFragment.b0;
                ((MarketItemReviewRepliesFragment) obj).eo(w1g0.i.b);
                return s3q0.a;
            case 16:
                wh50 wh50Var = ((su10) obj).j;
                ((zak0) wh50Var).setValue(Boolean.valueOf(true ^ ((Boolean) ((zak0) wh50Var).getValue()).booleanValue()));
                return s3q0.a;
            case 17:
                ((wv20) obj).b.G8();
                return s3q0.a;
            case 18:
                return Integer.valueOf(e3m.f(R.attr.vk_ui_text_negative, ((com.vk.im.ui.formatters.spans.dialogitem.a) obj).a));
            case 19:
                Context e = ((zn30) obj).e();
                e3m.a aVar2 = e3m.a;
                return Integer.valueOf(e.getColor(R.color.vk_black_alpha35));
            case 20:
                return (UserId) obj;
            case 21:
                handler_delegate$lambda$0 = MultiUploadHelper.handler_delegate$lambda$0((MultiUploadHelper) obj);
                return handler_delegate$lambda$0;
            case 22:
                MusicCatalogRootVh musicCatalogRootVh = (MusicCatalogRootVh) obj;
                w950 w950Var = (w950) musicCatalogRootVh.q.getValue();
                if (w950Var != null) {
                    String str = musicCatalogRootVh.t;
                    if (str == null) {
                        str = "";
                    }
                    w950Var.A(str);
                }
                return s3q0.a;
            case 23:
                ((FunctionReferenceImpl) obj).invoke();
                return s3q0.a;
            case 24:
                return (TextView) ((y750) obj).findViewById(R.id.tvArtistName);
            case 25:
                return ((NewsFeedComponent) ((k7m) m7m.c(((rr50) obj).itemView)).a(fpf0.a(NewsFeedComponent.class))).ib();
            case 26:
                ((d960) obj).n.a(UserProfileAction.n.b);
                return s3q0.a;
            case 27:
                return ((SharingComponent) ((com.vk.newsfeed.common.helpers.a) obj).f.getValue()).F2();
            case 28:
                qcy<Object>[] qcyVarArr2 = NewsfeedFragment.J0;
                return new eh60(((m6r0) obj).p());
            default:
                return (StoryViewerComponent) ((mo60) obj).c().a(fpf0.a(StoryViewerComponent.class));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ xis(gzs gzsVar) {
        this.b = 23;
        this.c = (FunctionReferenceImpl) gzsVar;
    }
}
