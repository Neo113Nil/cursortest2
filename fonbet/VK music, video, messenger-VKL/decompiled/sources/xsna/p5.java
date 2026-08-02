package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog.mvi.block.impl.slider.SliderView;
import com.vk.catalog2.common.dto.ui.UIBlockArtistBio;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.feature.music.holders.artist.ArtistBiographyVh;
import com.vk.clips.design.view.component.button.ClipActionButton;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.core.ui.utils.TitleColorAttr;
import com.vk.core.view.tools.VkViewStub;
import com.vk.dto.articles.Article;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Artist;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.ecomm.design.view.tile.MarketProductTileConfig;
import com.vk.libvideo.ui.VideoBottomBarView;
import com.vk.log.L;
import com.vk.newsfeed.posting.privacy_picker.presentation.PrivacyViewState;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.photos.root.photoflow.presentation.a;
import com.vk.profile.questions.impl.d;
import com.vk.stat.scheme.CommonAudioStat$TypeAudioArtistClickItem;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeRevealObsceneWords;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vk.stat.scheme.SchemeStat$TypeQuestionItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.de30;
import xsna.dw20;
import xsna.dzh;
import xsna.e8v0;
import xsna.ee60;
import xsna.g49;
import xsna.kyh;
import xsna.le60;
import xsna.o9t;
import xsna.or2;
import xsna.pb60;
import xsna.qjc;
import xsna.r5;
import xsna.ugf;
import xsna.wed0;
import xsna.yo60;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p5 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p5(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v45, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v82, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        UIBlockArtistBio uIBlockArtistBio;
        int i = this.b;
        int i2 = 0;
        int i3 = 2;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((r5.a) obj2).e.d((b4) obj);
                break;
            case 1:
                break;
            case 2:
                ClipActionButton clipActionButton = new ClipActionButton(((VkViewStub) obj2).getContext());
                jjc.g(clipActionButton, new v5((w01) obj, 4));
                break;
            case 3:
                Artist artist = (Artist) obj2;
                ArtistBiographyVh artistBiographyVh = (ArtistBiographyVh) obj;
                if (artist.i) {
                    UIBlockArtistBio uIBlockArtistBio2 = artistBiographyVh.j;
                    if (uIBlockArtistBio2 != null) {
                        Context context = artistBiographyVh.q;
                        if (context == null) {
                            context = null;
                        }
                        artistBiographyVh.p = new dw20.b(context, null).P(Collections.singletonList(new brj0(0, 0, null, 0, context.getString(R.string.music_unfollow_artist), true, false, null, 0, null, TitleColorAttr.DESTRUCTIVE, null, null, null, 126894)), new n9(i3, artistBiographyVh, uIBlockArtistBio2)).I0(null);
                    }
                } else if (artist.h && (uIBlockArtistBio = artistBiographyVh.j) != null) {
                    ArtistBiographyVh.a(CommonAudioStat$TypeAudioArtistClickItem.EventType.ITEM_FOLLOW_CLICK, artistBiographyVh.k);
                    artistBiographyVh.e.a(new cfp0(uIBlockArtistBio, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Subscribe)));
                    artistBiographyVh.n = artistBiographyVh.d.a(uIBlockArtistBio.y, uIBlockArtistBio.b).subscribe(new pm1(new o9(3, artistBiographyVh, uIBlockArtistBio), i3), kwg0.b());
                }
                break;
            case 4:
                g49.a aVar = (g49.a) obj;
                StringBuilder sb = new StringBuilder("callLifecycleListeners: ");
                CopyOnWriteArraySet<g49> copyOnWriteArraySet = ((q49) obj2).b;
                L.e("CallLifecycleListenerProxy", fw3.d(copyOnWriteArraySet, sb));
                Iterator<g49> it = copyOnWriteArraySet.iterator();
                while (it.hasNext()) {
                    it.next().i(aVar);
                }
                break;
            case 5:
                ((or2.a.InterfaceC3466a) obj2).d((String) obj);
                break;
            case 6:
                spa spaVar = (spa) obj2;
                Ref$ObjectRef ref$ObjectRef = (Ref$ObjectRef) obj;
                qjc.a aVar2 = spaVar.c;
                if (aVar2 != null) {
                    aVar2.I(null);
                }
                SchemeStat$TypeClick b = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), new MobileOfficialAppsFeedStat$TypeRevealObsceneWords(spaVar.m, spaVar.n), 2);
                UiTracker uiTracker = UiTracker.a;
                MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                uzp0 uzp0Var = UiTracker.h;
                uzp0Var.getClass();
                new bjc(c, b, uzp0Var.a).q();
                dw20 dw20Var = (dw20) ref$ObjectRef.element;
                if (dw20Var != null) {
                    dw20Var.tn();
                }
                break;
            case 7:
                qad qadVar = (qad) obj;
                izs<MarketProductTileConfig, s3q0> izsVar = ((cbd) obj2).l;
                if (izsVar != null) {
                    izsVar.invoke(qadVar.b);
                }
                break;
            case 8:
                q7v0 q7v0Var = (q7v0) obj2;
                jlf jlfVar = (jlf) obj;
                VkOnboardingCampaign e = q7v0Var.e("clips:vk_ticket_action_button");
                if (e != null) {
                    q7v0Var.a(e, VkOnboardingType.Tooltip, e8v0.m.b);
                }
                jlfVar.e(ugf.h.C3804h.a);
                break;
            case 9:
                ((ryh) obj2).b.c(new dzh.n.d(((kyh.a.f) ((kyh.a) obj)).b));
                break;
            case 10:
                ((com.vk.core.fragments.b) obj2).e.c.Qb((ArrayList) obj);
                break;
            case 11:
                ((izs) obj2).invoke(new o9t.a((h8t) obj));
                break;
            case 12:
                ((izs) obj2).invoke(new o9t.a((l6t) obj));
                break;
            case 13:
                break;
            case 14:
                com.vk.photo.editor.features.mlenhance.c cVar = (com.vk.photo.editor.features.mlenhance.c) obj2;
                View view = (View) obj;
                if (!cVar.p.isInitialized() || !((com.vk.photo.editor.features.mlenhance.a) cVar.p.getValue()).e) {
                    view.sendAccessibilityEvent(8);
                }
                break;
            case 15:
                ((izs) obj2).invoke(new de30.a(((ee30) obj).b));
                break;
            case 16:
                ((pb60.a) obj2).b.b((buz) obj, false);
                break;
            case 17:
                ne60 ne60Var = (ne60) obj2;
                w620 w620Var = ne60Var.g;
                UserId userId = ((ie60) obj).a;
                w620Var.invoke(new ee60.a.C2799a(userId));
                ne60Var.f.e(new le60.a.b(userId));
                break;
            case 18:
                vt60 vt60Var = (vt60) obj2;
                it60 it60Var = (it60) vt60Var.e.getValue();
                xk2 xk2Var = vt60Var.c;
                it60Var.getClass();
                it60.a((yo60.j) obj, xk2Var);
                break;
            case 19:
                Ref$ObjectRef ref$ObjectRef2 = (Ref$ObjectRef) obj;
                ((i6a0) obj2).e = null;
                izs izsVar2 = (izs) ref$ObjectRef2.element;
                if (izsVar2 != null) {
                    izsVar2.invoke(Boolean.FALSE);
                }
                ref$ObjectRef2.element = null;
                break;
            case 20:
                ((com.vk.photos.root.photoflow.presentation.b) obj2).C(a.f.a((a.f) obj));
                break;
            case 21:
                ((izs) obj2).invoke(new wed0.b(((PrivacyViewState.c) obj).a));
                break;
            case 22:
                Article article = (Article) obj2;
                boolean z = article.n;
                q76.d((com.vk.qrcode.c) obj, article, new pme0(article, z, i2), 2);
                article.n = !z;
                break;
            case 23:
                d.b bVar = (d.b) obj2;
                qqe0 qqe0Var = ((com.vk.profile.questions.impl.j) obj).l;
                if (bVar.d) {
                    qqe0Var.g(bVar);
                    iqe0.a(bVar, SchemeStat$TypeQuestionItem.Type.CANCEL_DELETE);
                } else {
                    qqe0Var.f(bVar);
                    iqe0.a(bVar, SchemeStat$TypeQuestionItem.Type.CANCEL_DELETE);
                }
                break;
            case 24:
                break;
            case 25:
                ((izs) obj2).invoke(new SliderView.b.C0452b(((SliderView.f) obj).b));
                break;
            case 26:
                break;
            case 27:
                ((sul0) obj2).b.e(Sdk.SDKError.Reason.INVALID_REQUEST_BUILDER_ERROR_VALUE, (StoryEntry) obj);
                break;
            case 28:
                i0b i0bVar = (i0b) obj;
                ((pqr0) obj2).m.j0(i0bVar.getId(), i0bVar instanceof lcf0);
                break;
            default:
                View.OnClickListener onClickListener = (View.OnClickListener) obj2;
                Object obj3 = ((VideoBottomBarView) obj).i;
                onClickListener.onClick(obj3 instanceof View ? (View) obj3 : null);
                break;
        }
        return s3q0.a;
    }
}
