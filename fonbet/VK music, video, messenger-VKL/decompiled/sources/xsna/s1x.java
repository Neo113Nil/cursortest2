package xsna;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.WindowManager;
import androidx.core.app.NotificationCompat;
import androidx.core.graphics.drawable.IconCompat;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.comments.impl.marketitem.commentlist.presentation.MarketItemCommentsFragment;
import com.vk.ecomm.market.impl.photoviewer.di.MarketPhotoviewerComponentImpl;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.ecomm.products_multipicker.api.di.ProductsMultipickerComponent;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.newsfeed_post.presentation.fragment.PostFragment;
import com.vk.newsfeed.posting.api.model.PostingMetricsEntryPoint;
import com.vk.newsfeed.posting.impl.domain.model.PostingScreenContext;
import com.vk.onepasspromo.impl.OnePassPromoFragment;
import com.vk.photogallery.view.CoordinatorLayoutWithContextMenuDelegate;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.tags.presentation.PhotoTagsFragment;
import com.vk.pushes.dto.PushMessage;
import com.vk.pushes.notifications.im.MessageNotificationContainer;
import com.vk.queue.di.QueueSyncComponent;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.analytics.di.SakAnalyticsComponent;
import com.vk.video.ui.share.api.VideoShareComponent;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.Pair;
import xsna.dqb0;
import xsna.hfr;
import xsna.l310;
import xsna.rbc0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class s1x implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ s1x(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
    
        if (r1 != null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x044d  */
    /* JADX WARN: Type inference failed for: r1v12, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v69, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        NotificationCompat.l lVar;
        boolean z;
        Object obj;
        Iterator it;
        NotificationCompat.l lVar2;
        HashMap hashMap;
        String sb;
        Object obj2;
        NotificationCompat.l lVar3;
        NotificationCompat.l.d dVar;
        File file;
        PostingMetricsEntryPoint postingMetricsEntryPoint;
        int i = this.b;
        int i2 = 3;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((r1x) obj3).invoke();
                return s3q0.a;
            case 1:
                return ((jax) obj3).c.W(new irh0(false, false, 495));
            case 2:
                return new udx(((StoryViewerComponent) ((k7m) m7m.f((zex) obj3)).a(fpf0.a(StoryViewerComponent.class))).l9());
            case 3:
                ((NewsFeedComponent) ((k7m) m7m.f((b7z) obj3)).a(fpf0.a(NewsFeedComponent.class))).n0();
                return iuc0.b;
            case 4:
                MarketItemCommentsFragment marketItemCommentsFragment = (MarketItemCommentsFragment) obj3;
                int i3 = MarketItemCommentsFragment.j0;
                if (!marketItemCommentsFragment.a0()) {
                    marketItemCommentsFragment.finish();
                }
                return s3q0.a;
            case 5:
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj3;
                int i4 = MarketItemReviewsFragment.w0;
                l310.a aVar = l310.a.b;
                marketItemReviewsFragment.getClass();
                xn50.a.c(marketItemReviewsFragment, aVar);
                return s3q0.a;
            case 6:
                qcy<Object>[] qcyVarArr = MarketPhotoviewerComponentImpl.c;
                return new t0o0(((ProductsMultipickerComponent) obj3).a());
            case 7:
                return Boolean.valueOf("audio/mp4a-latm".equalsIgnoreCase(((gr10) obj3).b));
            case 8:
                return ((gt10) obj3).g;
            case 9:
                return (VideoShareComponent) ((k7m) m7m.c((k120) obj3)).a(fpf0.a(VideoShareComponent.class));
            case 10:
                pa20 pa20Var = (pa20) obj3;
                ?? r1 = pa20Var.R;
                CharSequence charSequence = pa20Var.p;
                CharSequence charSequence2 = pa20Var.n;
                MessageNotificationContainer messageNotificationContainer = pa20Var.z;
                int i5 = 25;
                if (gz80.a(28)) {
                    if (pa20Var.A()) {
                        return pa20Var.n();
                    }
                    if (!((Boolean) r1.getValue()).booleanValue() && !com.vk.dto.common.b.a(messageNotificationContainer.z)) {
                        i5 = 1;
                    }
                    List I0 = j5g.I0(i5, pa20Var.J());
                    long longValue = z4g.d().a().longValue();
                    boolean z2 = !com.vk.dto.common.b.a(messageNotificationContainer.z) || messageNotificationContainer.q;
                    Bitmap bitmap = pa20Var.A;
                    IconCompat c = bitmap != null ? IconCompat.c(bitmap) : null;
                    IconCompat iconCompat = z2 ? c : null;
                    Set i6 = izi0.i(Long.valueOf(longValue));
                    if (iconCompat == null) {
                        z = true;
                        g5g.z(i6, rli0.j(new ulp0(new i5g(I0), new amp(13)), new js00(i2, c, pa20Var)));
                    } else {
                        z = true;
                    }
                    hfr j = rli0.j(rn00.w(z4g.d().I(i6)), new tcu(10));
                    HashMap hashMap2 = new HashMap(i6.size());
                    hfr.a aVar2 = new hfr.a(j);
                    while (aVar2.hasNext()) {
                        Map.Entry entry = (Map.Entry) aVar2.next();
                        Pair pair = new Pair(entry.getKey(), IconCompat.c((Bitmap) entry.getValue()));
                        hashMap2.put(pair.i(), pair.j());
                    }
                    Long l = messageNotificationContainer.B;
                    if (l != null && c != null) {
                        hashMap2.put(l, c);
                    }
                    String str = o25.a().o().b;
                    String valueOf = String.valueOf(longValue);
                    IconCompat iconCompat2 = (IconCompat) hashMap2.get(Long.valueOf(longValue));
                    j1a0 j1a0Var = new j1a0();
                    j1a0Var.a = str;
                    j1a0Var.b = iconCompat2;
                    j1a0Var.c = null;
                    j1a0Var.d = valueOf;
                    j1a0Var.e = false;
                    j1a0Var.f = false;
                    NotificationCompat.l lVar4 = new NotificationCompat.l(j1a0Var);
                    lVar4.i = Boolean.valueOf(!z2);
                    if (!z2) {
                        lVar4.h = charSequence2;
                    }
                    ListIterator listIterator = I0.listIterator(I0.size());
                    while (true) {
                        if (listIterator.hasPrevious()) {
                            obj = listIterator.previous();
                            if (((PushMessage) obj).e == null || (!drm0.N(r6)) != z) {
                                z = true;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    PushMessage pushMessage = (PushMessage) obj;
                    int i7 = pushMessage != null ? pushMessage.b : Integer.MIN_VALUE;
                    Long j2 = messageNotificationContainer.j();
                    long longValue2 = j2 != null ? j2.longValue() : o25.a().c().b;
                    Iterator it2 = I0.iterator();
                    while (it2.hasNext()) {
                        PushMessage pushMessage2 = (PushMessage) it2.next();
                        IconCompat iconCompat3 = iconCompat == null ? (IconCompat) hashMap2.get(Long.valueOf(pushMessage2.h)) : iconCompat;
                        String str2 = pushMessage2.c;
                        long j3 = pushMessage2.f;
                        String str3 = pushMessage2.d;
                        if (str3.length() == 0) {
                            StringBuilder sb2 = new StringBuilder();
                            it = it2;
                            sb2.append(pushMessage2.hashCode());
                            sb2.append('_');
                            sb2.append(longValue2);
                            sb = sb2.toString();
                        } else {
                            it = it2;
                            if (messageNotificationContainer.q) {
                                StringBuilder sb3 = new StringBuilder();
                                Long l2 = messageNotificationContainer.y;
                                if (l2 == null || (obj2 = l2.toString()) == null) {
                                    obj2 = 0;
                                }
                                sb3.append(obj2);
                                sb3.append('_');
                                sb3.append(longValue2);
                                sb = sb3.toString();
                            } else {
                                StringBuilder sb4 = new StringBuilder();
                                lVar2 = lVar4;
                                hashMap = hashMap2;
                                sb4.append(pushMessage2.h);
                                sb4.append('_');
                                sb4.append(longValue2);
                                sb = sb4.toString();
                                j1a0 j1a0Var2 = new j1a0();
                                j1a0Var2.a = str2;
                                j1a0Var2.b = iconCompat3;
                                j1a0Var2.c = null;
                                j1a0Var2.d = sb;
                                j1a0Var2.e = false;
                                j1a0Var2.f = false;
                                if (i7 == pushMessage2.b) {
                                    if (gz80.a(28)) {
                                        String str4 = pushMessage2.e;
                                        if (str4 == null || !(!drm0.N(str4))) {
                                            str4 = null;
                                        }
                                        if (str4 == null || (file = z4g.d().H(3000L, str4)) == null || !file.exists()) {
                                            file = null;
                                        }
                                        if (file != null) {
                                            dVar = new NotificationCompat.l.d("", j3, j1a0Var2);
                                            abq.a(dVar, file);
                                            if (dVar != null) {
                                                lVar3 = lVar2;
                                                lVar3.f(dVar);
                                                lVar3.f(new NotificationCompat.l.d(str3, j3, j1a0Var2));
                                                lVar4 = lVar3;
                                                hashMap2 = hashMap;
                                                it2 = it;
                                            }
                                        }
                                    }
                                    dVar = null;
                                    if (dVar != null) {
                                    }
                                }
                                lVar3 = lVar2;
                                lVar3.f(new NotificationCompat.l.d(str3, j3, j1a0Var2));
                                lVar4 = lVar3;
                                hashMap2 = hashMap;
                                it2 = it;
                            }
                        }
                        lVar2 = lVar4;
                        hashMap = hashMap2;
                        j1a0 j1a0Var22 = new j1a0();
                        j1a0Var22.a = str2;
                        j1a0Var22.b = iconCompat3;
                        j1a0Var22.c = null;
                        j1a0Var22.d = sb;
                        j1a0Var22.e = false;
                        j1a0Var22.f = false;
                        if (i7 == pushMessage2.b) {
                        }
                        lVar3 = lVar2;
                        lVar3.f(new NotificationCompat.l.d(str3, j3, j1a0Var22));
                        lVar4 = lVar3;
                        hashMap2 = hashMap;
                        it2 = it;
                    }
                    lVar = lVar4;
                } else {
                    if (!gz80.a(24)) {
                        if ((charSequence != null ? charSequence.length() : 0) >= 30 || pa20Var.J().size() <= 1 || !(((Boolean) r1.getValue()).booleanValue() || com.vk.dto.common.b.a(messageNotificationContainer.z))) {
                            NotificationCompat.f fVar = new NotificationCompat.f();
                            fVar.b = NotificationCompat.h.d(charSequence2);
                            fVar.e = NotificationCompat.h.d(pa20Var.F(messageNotificationContainer.o, charSequence));
                            if (pa20Var.J().size() <= 1) {
                                return fVar;
                            }
                            fVar.c = NotificationCompat.h.d(pa20Var.I());
                            fVar.d = true;
                            return fVar;
                        }
                        NotificationCompat.k kVar = new NotificationCompat.k();
                        kVar.b = NotificationCompat.h.d(charSequence2);
                        kVar.c = NotificationCompat.h.d(pa20Var.I());
                        kVar.d = true;
                        for (PushMessage pushMessage3 : j5g.I0(6, pa20Var.J())) {
                            CharSequence F = pa20Var.F(pushMessage3.c, pushMessage3.d);
                            if (F != null) {
                                kVar.e.add(NotificationCompat.h.d(F));
                            }
                        }
                        return kVar;
                    }
                    lVar = new NotificationCompat.l(0);
                    lVar.i = Boolean.TRUE;
                    lVar.h = charSequence2;
                    if (!((Boolean) r1.getValue()).booleanValue() && !com.vk.dto.common.b.a(messageNotificationContainer.z)) {
                        i5 = 1;
                    }
                    for (PushMessage pushMessage4 : j5g.I0(i5, pa20Var.J())) {
                        lVar.e(pushMessage4.f, pushMessage4.d, messageNotificationContainer.l() ? pushMessage4.c : "");
                    }
                }
                return lVar;
            case 11:
                return ((QueueSyncComponent) ((k7m) m7m.f((gt20) obj3)).a(fpf0.a(QueueSyncComponent.class))).i0();
            case 12:
                ((zak0) ((az20) obj3).o).setValue(Boolean.TRUE);
                return s3q0.a;
            case 13:
                vm30 vm30Var = (vm30) obj3;
                awt0.i(vm30Var.u, new m2j(vm30Var, 29));
                return s3q0.a;
            case 14:
                ((gzs) ((zak0) ((wb50) obj3).e).getValue()).invoke();
                return s3q0.a;
            case 15:
                int i8 = MviComponentFragment.S;
                return j5g.S0(((MviComponentFragment) obj3).fo());
            case 16:
                ((wh50) obj3).setValue(Boolean.TRUE);
                return s3q0.a;
            case 17:
                zix od = ((StoriesComponent) ((k7m) m7m.c((kq50) obj3)).a(fpf0.a(StoriesComponent.class))).od();
                kjz0 b = od != null ? od.b() : null;
                if (b != null) {
                    return b;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 18:
                int i9 = OnePassPromoFragment.R;
                return ((SakAnalyticsComponent) m7m.d((OnePassPromoFragment) obj3).a(fpf0.a(SakAnalyticsComponent.class))).Qc();
            case 19:
                OnlineBookingInternalComponent.a aVar3 = OnlineBookingInternalComponent.n;
                return new lq7(((OnlineBookingInternalComponent) obj3).Ef());
            case 20:
                ((gzs) obj3).invoke();
                return s3q0.a;
            case 21:
                com.vk.photogallery.c cVar = (com.vk.photogallery.c) obj3;
                cVar.z.X(3);
                CoordinatorLayoutWithContextMenuDelegate coordinatorLayoutWithContextMenuDelegate = cVar.i;
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) coordinatorLayoutWithContextMenuDelegate.getLayoutParams();
                layoutParams.softInputMode = 16;
                layoutParams.flags &= 2013134847;
                if (coordinatorLayoutWithContextMenuDelegate.isAttachedToWindow()) {
                    coordinatorLayoutWithContextMenuDelegate.requestApplyInsets();
                    cVar.e.updateViewLayout(coordinatorLayoutWithContextMenuDelegate, layoutParams);
                    coordinatorLayoutWithContextMenuDelegate.postDelayed(new to2(cVar, 11), 100L);
                }
                return s3q0.a;
            case 22:
                int i10 = PhotoTagsFragment.U;
                return ((PhotosComponent) ((k7m) m7m.f((PhotoTagsFragment) obj3)).a(fpf0.a(PhotosComponent.class))).r4();
            case 23:
                return ((PlayerAnalyticsComponent) j6i.b(m7m.f((e2b0) obj3), PlayerAnalyticsComponent.class)).Xe();
            case 24:
                dqb0 dqb0Var = (dqb0) obj3;
                int i11 = dqb0.f;
                return dqb0.a.a(dqb0Var.getBounds(), dqb0Var.a);
            case 25:
                return ((ClipsConfigViewersComponent) ((k7m) m7m.f((y1c0) obj3)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 26:
                ((PostFragment) obj3).s();
                return s3q0.a;
            case 27:
                return ((ClipsCoauthorsComponent) ((k7m) m7m.c((o7c0) obj3)).mo408a(fpf0.a(ClipsCoauthorsComponent.class))).Fc();
            case 28:
                rbc0 rbc0Var = (rbc0) obj3;
                Bundle bundle = rbc0Var.a;
                if (bundle.containsKey("creation_entry_point")) {
                    String string = bundle.getString("creation_entry_point");
                    if (string != null) {
                        PostingCreationEntryPoint.Companion.getClass();
                        PostingCreationEntryPoint a = PostingCreationEntryPoint.a.a(string);
                        if (a != null) {
                            switch (rbc0.a.$EnumSwitchMapping$0[a.ordinal()]) {
                                case 1:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.FeedPlus;
                                    break;
                                case 2:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.GroupWallButton;
                                    break;
                                case 3:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.ProfilePlusButton;
                                    break;
                                case 4:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.ProfileWallButton;
                                    break;
                                case 5:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.ChannelWriteBarButton;
                                    break;
                                case 6:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.PostThreeDotMenuEditItem;
                                    break;
                                case 7:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.PrepareSuggestedPostButton;
                                    break;
                                case 8:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.ProfilePostponedPosts;
                                    break;
                                case 9:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.ProfilePostponedPostsThreePoints;
                                    break;
                                case 10:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.GroupPostponedPosts;
                                    break;
                                case 11:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.GroupPostponedPostsThreePoints;
                                    break;
                                case 12:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.CommunityCreationOnboardingBlock;
                                    break;
                                default:
                                    postingMetricsEntryPoint = PostingMetricsEntryPoint.Other;
                                    break;
                            }
                        }
                    }
                    postingMetricsEntryPoint = PostingMetricsEntryPoint.Other;
                } else {
                    postingMetricsEntryPoint = PostingMetricsEntryPoint.Other;
                }
                return new PostingScreenContext(postingMetricsEntryPoint, (UUID) rbc0Var.n.getValue());
            default:
                return ((NewsFeedComponent) ((k7m) m7m.f((b7d0) obj3)).a(fpf0.a(NewsFeedComponent.class))).w();
        }
    }
}
