package xsna;

import android.content.ComponentCallbacks2;
import android.content.Intent;
import android.os.Bundle;
import com.vk.ads.di.NewsfeedOptionalAdsComponentImpl;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.PagerGridListVh;
import com.vk.catalog2.feature.music.holders.MusicKidsAgeCategoryVh;
import com.vk.clips.clipchecker.api.di.ClipCheckerComponent;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.repository.data.api.di.DataRepositoryComponent;
import com.vkontakte.android.R;
import ru.ok.media.OkmpStreamPublisher;
import xsna.ejd0;
import xsna.rfa0.k;
import xsna.s1c0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class fr20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ fr20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v111, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        s3q0 start$lambda$25;
        switch (this.b) {
            case 0:
                yg5 yg5Var = ((gr20) this.c).s;
                if (yg5Var != null) {
                    if (yg5Var.w0()) {
                        yg5Var.c();
                    } else {
                        yg5Var.f();
                    }
                }
                return s3q0.a;
            case 1:
                return new pl40(new w1((MusicKidsAgeCategoryVh) this.c, 5));
            case 2:
                return ((NewsFeedComponent) ((k7m) m7m.c(((pq50) this.c).itemView)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 3:
                return m33.a(R.drawable.vk_icon_illustration_disclaimer_bad_feed_360w, ((bv50) this.c).b.getContext());
            case 4:
                return (MarketComponent) ((k7m) m7m.f((fa60) this.c)).a(fpf0.a(MarketComponent.class));
            case 5:
                hbt0 hbt0Var = ((tc60) this.c).e;
                if (hbt0Var != null) {
                    hbt0Var.y();
                }
                return s3q0.a;
            case 6:
                return new oc60(((mo60) this.c).d());
            case 7:
                NewsfeedOptionalAdsComponentImpl newsfeedOptionalAdsComponentImpl = (NewsfeedOptionalAdsComponentImpl) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedOptionalAdsComponentImpl.d;
                return new z9v0(newsfeedOptionalAdsComponentImpl.Df());
            case 8:
                NotificationListFragment notificationListFragment = (NotificationListFragment) this.c;
                int i = NotificationListFragment.a0;
                return (ClipCheckerComponent) m7m.d(notificationListFragment).a(fpf0.a(ClipCheckerComponent.class));
            case 9:
                id70 id70Var = (id70) this.c;
                int i2 = id70.q1;
                return ((DataRepositoryComponent) m7m.d(id70Var).a(fpf0.a(DataRepositoryComponent.class))).C();
            case 10:
                start$lambda$25 = OkmpStreamPublisher.start$lambda$25((OkmpStreamPublisher) this.c);
                return start$lambda$25;
            case 11:
                return "internalShouldIgnoreCallback() - ignore in state= " + wl80.this.G;
            case 12:
                return ((PagerGridListVh) this.c).k;
            case 13:
                PhotoFlowFragment photoFlowFragment = (PhotoFlowFragment) this.c;
                int i3 = PhotoFlowFragment.m0;
                return photoFlowFragment.fo().L9();
            case 14:
                return ((rfa0) this.c).new k();
            case 15:
                msb0 msb0Var = (msb0) this.c;
                int i4 = msb0.n1;
                return ((Posting2Component) ((k7m) m7m.f(msb0Var)).mo408a(fpf0.a(Posting2Component.class))).a();
            case 16:
                com.vk.newsfeed.common.util.j jVar = (com.vk.newsfeed.common.util.j) this.c;
                return new zxm(jVar, (b25) jVar.b.getValue());
            case 17:
                return new r3c0((t3c0) ((w3c0) this.c).K.getValue());
            case 18:
                PostingAttachGalleryFragment postingAttachGalleryFragment = (PostingAttachGalleryFragment) this.c;
                int i5 = PostingAttachGalleryFragment.p0;
                Bundle arguments = postingAttachGalleryFragment.getArguments();
                return arguments != null ? arguments.getBoolean("shouldMeasureTechStats", false) : false ? new ifl() : new urm0();
            case 19:
                final PostingFragment postingFragment = (PostingFragment) this.c;
                int i6 = PostingFragment.s0;
                return new tb0() { // from class: xsna.jfc0
                    @Override // xsna.tb0
                    public final void onActivityResult(int i7, int i8, Intent intent) {
                        int i9 = PostingFragment.s0;
                        PostingFragment.this.onActivityResult(i7, i8, intent);
                    }
                };
            case 20:
                return ((BridgeComponent) ((k7m) m7m.f((rhc0) this.c)).a(fpf0.a(BridgeComponent.class))).p().e();
            case 21:
                ((enc0) this.c).U.invoke(PostingAction.Navigation.CloseInCurrentStep.b);
                return s3q0.a;
            case 22:
                cqc0 cqc0Var = (cqc0) this.c;
                ComponentCallbacks2 h = e3m.h(cqc0Var.c);
                aeg0 aeg0Var = h instanceof aeg0 ? (aeg0) h : null;
                if (aeg0Var != null) {
                    aeg0Var.yk(cqc0Var.u);
                }
                return s3q0.a;
            case 23:
                cr4 cr4Var = ((g7d0) this.c).D;
                return new lm4(cr4Var.a(), cr4Var.c(), null, 12);
            case 24:
                ((bkd0) this.c).n.invoke(ejd0.b.C2816b.b);
                return s3q0.a;
            case 25:
                return ((CartComponent) ((zqd0) this.c).e.getValue()).f8();
            case 26:
                return Float.valueOf(((Number) ((mtk0) this.c).getValue()).floatValue());
            case 27:
                ReactionsFeedFragment reactionsFeedFragment = (ReactionsFeedFragment) this.c;
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                sf2 sf2Var = new sf2();
                sf2Var.b = reactionsFeedFragment.h0.get();
                aVar.s = sf2Var.a();
                return aVar.a();
            case 28:
                dzf0 dzf0Var = (dzf0) this.c;
                dzf0Var.f++;
                dzf0Var.b.a(new z260(dzf0Var, 21));
                dzf0Var.b();
                return s3q0.a;
            default:
                return Boolean.valueOf(((wak0) ((jgh0) this.c).a).getIntValue() > 0);
        }
    }
}
