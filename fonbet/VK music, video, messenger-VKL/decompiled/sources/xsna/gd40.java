package xsna;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import com.unity3d.services.UnityAdsConstants;
import com.vk.badges.api.di.BadgesComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.feature.music.configuration.MusicSearchCatalogConfiguration;
import com.vk.catalog2.feature.music.dto.ui.UIBlockOfflinePodcastItem;
import com.vk.catalog2.feature.music.holders.podcast.PodcastOfflineVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.dto.music.Thumb;
import com.vk.dto.podcast.OfflinePodcast;
import com.vk.dto.podcast.Podcast;
import com.vk.dto.podcast.PodcastInfo;
import com.vk.ecomm.shop_conditions.api.di.MarketShopConditionsComponent;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsArgs;
import com.vk.ecomm.storefront.impl.albums.presentation.fragment.StorefrontAlbumsFragment;
import com.vk.fave.di.FaveComponent;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.newsfeed.impl.items.posting.item.modals.a;
import com.vk.newsfeed.impl.presentation.from_notifications.presentation.fragment.PostsFromNotificationsFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vkontakte.android.R;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.builders.ListBuilder;
import xsna.bcp0;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gd40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gd40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x0130, code lost:
    
        if (java.lang.reflect.Modifier.isPublic(r1.getModifiers()) != false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.gzs] */
    /* JADX WARN: Type inference failed for: r15v0, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    /* JADX WARN: Type inference failed for: r1v41, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v74, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r2v41, types: [E extends xsna.hzf, java.lang.Object, xsna.hzf] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        Activity h;
        UIBlockOfflinePodcastItem uIBlockOfflinePodcastItem;
        OfflinePodcast offlinePodcast;
        Podcast podcast;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        int i2 = 10;
        boolean z = true;
        Object obj = this.c;
        switch (i) {
            case 0:
                return Boolean.valueOf(((MusicCatalogRootVh) obj).m.b.b.c(false));
            case 1:
                return new xe40(((te40) obj).a);
            case 2:
                return ((MusicSearchCatalogConfiguration) obj).j0();
            case 3:
                ((b78) obj).a().invoke(new sx40.t(PlayerContext.MINI_STANDALONE, null));
                return s3q0.a;
            case 4:
                return Float.valueOf(f17.e((h17) obj));
            case 5:
                List<xuy> f = ((xvy) obj).j().f();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : f) {
                    xuy xuyVar = (xuy) obj2;
                    float max = 100.0f - (((Math.max(0, (xuyVar.getSize() + xuyVar.getOffset()) - r7.j().h()) + Math.max(0, r7.j().g() - xuyVar.getOffset())) * 100.0f) / xuyVar.getSize());
                    if (UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT >= max) {
                        max = 0.0f;
                    }
                    if (max >= 80.0f) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                OnMediaAudioComponentProvider onMediaAudioComponentProvider = (OnMediaAudioComponentProvider) obj;
                return new m780(onMediaAudioComponentProvider.a(), onMediaAudioComponentProvider.g(), onMediaAudioComponentProvider.c(), onMediaAudioComponentProvider.a.a(), onMediaAudioComponentProvider.b(), onMediaAudioComponentProvider.c, onMediaAudioComponentProvider.d);
            case 7:
                return ((NewsFeedComponent) ((k7m) m7m.f((vp80) obj)).a(fpf0.a(NewsFeedComponent.class))).Vb();
            case 8:
                tha0 tha0Var = (tha0) obj;
                return new xia0(tha0Var.i, tha0Var.q, tha0Var.l);
            case 9:
                PodcastOfflineVh podcastOfflineVh = (PodcastOfflineVh) obj;
                VkRichCell vkRichCell = podcastOfflineVh.h;
                if (vkRichCell == null) {
                    vkRichCell = null;
                }
                Context context = vkRichCell.getContext();
                if (context != null && (h = e3m.h(context)) != null && (uIBlockOfflinePodcastItem = podcastOfflineVh.g) != null && (offlinePodcast = uIBlockOfflinePodcastItem.y) != null && (podcast = offlinePodcast.b) != null) {
                    String str = podcast.d;
                    String str2 = str == null ? "" : str;
                    List<Thumb> list = podcast.f;
                    if (list != null) {
                        Iterator it = list.iterator();
                        if (!it.hasNext()) {
                            throw new NoSuchElementException();
                        }
                        Object next = it.next();
                        if (it.hasNext()) {
                            int i3 = ((Thumb) next).c;
                            do {
                                Object next2 = it.next();
                                int i4 = ((Thumb) next2).c;
                                if (i3 > i4) {
                                    next = next2;
                                    i3 = i4;
                                }
                            } while (it.hasNext());
                        }
                        r5 = (Thumb) next;
                    }
                    podcastOfflineVh.c.w().a(h, podcastOfflineVh.b, new PodcastInfo(str2, null, null, null, null, null, r5, false, false, false, podcast.l, false, Integer.MIN_VALUE, null), new ie8(podcastOfflineVh, 10));
                }
                return s3q0.a;
            case 10:
                xzb0 xzb0Var = (xzb0) obj;
                return new mrp(xzb0Var.r, xzb0Var.q, xzb0Var.s);
            case 11:
                ((com.vk.channels.impl.post_settings.a) obj).p.finish();
                return s3q0.a;
            case 12:
                return new AtomicReference(((y8c0) obj).a.m);
            case 13:
                int i5 = PostingFragment.L0;
                return (ibc0) ((PostingFragment) obj).s0.getValue();
            case 14:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj;
                ListBuilder e = e43.e();
                e.add(bVar.f());
                e.add(com.vk.newsfeed.impl.items.posting.item.modals.b.e(bVar));
                e.add(bVar.a());
                e.add(new a.b(R.drawable.vk_icon_picture_outline_28, R.string.newsfeed_newpost_photo, new aq0(i2), new b990(bVar, 5), null, null, "CreatePhotoButton", 112));
                e.add(bVar.g(false));
                e.add(bVar.b());
                e.add(bVar.d());
                return e.g();
            case 15:
                return ((PostsFromNotificationsFragment) obj).Z;
            case 16:
                return ((MarketShopConditionsComponent) ((rkd0) obj).l.getValue()).a();
            case 17:
                com.vk.ecomm.product_list.presentation.a aVar = (com.vk.ecomm.product_list.presentation.a) obj;
                return new spd0(aVar.requireContext(), ((FaveComponent) m7m.d(aVar).mo408a(fpf0.a(FaveComponent.class))).xf());
            case 18:
                int i6 = QuestionsListFragment.f0;
                return ((BridgeComponent) m7m.d((QuestionsListFragment) obj).a(fpf0.a(BridgeComponent.class))).f5();
            case 19:
                return ((BadgesComponent) ((k7m) m7m.f((z2f0) obj)).mo408a(fpf0.a(BadgesComponent.class))).Kb();
            case 20:
                return rl3.u0(((r4g0) obj).getFillPoints());
            case 21:
                Class<?> loadClass = ((szg0) obj).a.loadClass("androidx.window.extensions.layout.FoldingFeature");
                Method method = loadClass.getMethod("getBounds", null);
                Method method2 = loadClass.getMethod("getType", null);
                Method method3 = loadClass.getMethod("getState", null);
                if (method.getReturnType().equals(fpf0.a(Rect.class).a()) && Modifier.isPublic(method.getModifiers())) {
                    Class cls = Integer.TYPE;
                    if (method2.getReturnType().equals(fpf0.a(cls).a()) && Modifier.isPublic(method2.getModifiers())) {
                        if (method3.getReturnType().equals(fpf0.a(cls).a())) {
                            break;
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 22:
                Size size = ((r5h0) obj).b;
                return Float.valueOf((size == null || !k9q0.q(size)) ? 1.0f : size.getWidth() / size.getHeight());
            case 23:
                mwh0 mwh0Var = (mwh0) obj;
                return new mrp(mwh0Var.b, mwh0Var.c, mwh0Var.d);
            case 24:
                return ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sending_loader);
            case 25:
                gzs gzsVar = (gzs) obj;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 26:
                qcy<Object>[] qcyVarArr = StorefrontAlbumsFragment.R;
                Bundle requireArguments = ((StorefrontAlbumsFragment) obj).requireArguments();
                String l = fpf0.a(StorefrontAlbumsArgs.class).l();
                String str3 = l != null ? l : "";
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable(str3, StorefrontAlbumsArgs.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable3 = requireArguments.getParcelable(str3);
                    parcelable = (StorefrontAlbumsArgs) (parcelable3 instanceof StorefrontAlbumsArgs ? parcelable3 : null);
                }
                return (StorefrontAlbumsArgs) parcelable;
            case 27:
                bcp0.a aVar2 = bcp0.w;
                Bundle arguments = ((bcp0) obj).getArguments();
                return Boolean.valueOf(arguments != null ? arguments.getBoolean("extra_is_tablet") : false);
            case 28:
                ?? r2 = ((kfp0) obj).b;
                r2.getClass();
                return new gr10((MediaFormat) r2.d("getInputFormat", izf.b));
            default:
                return new coo(((tnr0) obj).itemView.getContext());
        }
    }
}
