package xsna;

import com.vk.attachpicker.impl.fragment.StoryFragment;
import com.vk.attachpicker.stat.data.PhotoParamsDatabase_Impl;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder;
import com.vk.catalog2.common.ui.mvp.holder.sticker.StickerCatalogRootVh;
import com.vk.donut.price.api.di.DonutPriceComponent;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.images.ImageConfig;
import com.vk.dto.stickers.images.ImagesConfigsSet;
import com.vk.dzenarticle.api.DzenArticleComponent;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.impl.order.presentation.OrderFragment;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.multiplecoownership.di.MultipleCoownershipComponent;
import com.vk.newsfeed.common.delegates.OnMediaAudioComponentProvider;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.repository.internal.repos.stickers.database.entity.ImageConfigEntity;
import com.vk.repository.internal.repos.stickers.database.entity.ImagesConfigsEntity;
import com.vk.search.ui.impl.catalog.GlobalSearchVideosCatalogFragment;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchVideoRootVh;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import xsna.cca0;
import xsna.cvj0.e;
import xsna.dt1;
import xsna.tmd0;
import xsna.uwl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class dj60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dj60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // xsna.gzs
    public final Object invoke() {
        KSerializer<?>[] childSerializers;
        Object obj;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = NewsfeedFragment.J0;
                return ((NewsfeedFragment) obj2).fo();
            case 1:
                CatalogRootViewHolder catalogRootViewHolder = ((GlobalSearchVideosCatalogFragment) ((xz70) obj2).a).P;
                GlobalSearchVideoRootVh globalSearchVideoRootVh = catalogRootViewHolder instanceof GlobalSearchVideoRootVh ? (GlobalSearchVideoRootVh) catalogRootViewHolder : null;
                if (globalSearchVideoRootVh != null) {
                    globalSearchVideoRootVh.A.b.z0(false, false);
                }
                return s3q0.a;
            case 2:
                return new w0x(((OnMediaAudioComponentProvider) obj2).b);
            case 3:
                dt1.a.getClass();
                ((wh50) obj2).setValue(dt1.a.o);
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr2 = OrderFragment.Y;
                return (BridgeComponent) ((k7m) m7m.f((OrderFragment) obj2)).a(fpf0.a(BridgeComponent.class));
            case 5:
                ((dz80) obj2).a = null;
                return s3q0.a;
            case 6:
                return new com.vk.attachpicker.stat.data.a((PhotoParamsDatabase_Impl) obj2);
            case 7:
                ((jca0) obj2).a.getFeature().C(cca0.d.b);
                return s3q0.a;
            case 8:
                ((pha0) obj2).b();
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((ocb0) obj2).g.J().X1());
            case 10:
                vht<?> vhtVar = ((xfb0) obj2).b;
                return (vhtVar == null || (childSerializers = vhtVar.childSerializers()) == null) ? x1o0.c : childSerializers;
            case 11:
                return (DzenArticleComponent) ((k7m) m7m.f((xzb0) obj2)).a(fpf0.a(DzenArticleComponent.class));
            case 12:
                return ((MultipleCoownershipComponent) ((k7m) m7m.f((j1c0) obj2)).a(fpf0.a(MultipleCoownershipComponent.class))).a();
            case 13:
                int i2 = PostingFragment.L0;
                return ((StoryViewerComponent) ((k7m) m7m.f((PostingFragment) obj2)).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 14:
                com.vk.newsfeed.impl.items.posting.item.modals.b bVar = (com.vk.newsfeed.impl.items.posting.item.modals.b) obj2;
                bVar.b.d2(true, null, bVar.a.h);
                return s3q0.a;
            case 15:
                return ((DonutPriceComponent) ((k7m) m7m.c((roc0) obj2)).a(fpf0.a(DonutPriceComponent.class))).kf();
            case 16:
                return ((MarketComponent) ((rkd0) obj2).e.getValue()).Ob();
            case 17:
                ((ml1) obj2).invoke(tmd0.g.a);
                return s3q0.a;
            case 18:
                ArrayList arrayList = (ArrayList) obj2;
                StringBuilder sb = new StringBuilder("PromotedStickersRepositoryImpl insert loaded stickers ids[");
                sb.append(arrayList.size());
                sb.append("]=");
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((h6e0) it.next()).b.b));
                }
                sb.append(arrayList2);
                return sb.toString();
            case 19:
                int i3 = QuestionsListFragment.f0;
                return ((StoryViewerComponent) m7m.d((QuestionsListFragment) obj2).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 20:
                return ((xvy) obj2).j().f();
            case 21:
                dbi0 dbi0Var = (dbi0) obj2;
                int i4 = dbi0.r1;
                ((zak0) dbi0Var.l1).setValue(Boolean.valueOf(!dbi0Var.fo()));
                ((izs) ((zak0) dbi0Var.j1).getValue()).invoke(Boolean.valueOf(dbi0Var.fo()));
                dbi0Var.eo().stop(33);
                return s3q0.a;
            case 22:
                tq2 tq2Var = sdi0.a;
                return new ov70(((ov70) ((mtk0) obj2).getValue()).a);
            case 23:
                return ((StoryEditorExtDepsComponent) m7m.d((e8j0) obj2).a(fpf0.a(StoryEditorExtDepsComponent.class))).k7();
            case 24:
                return ((cvj0) obj2).new e();
            case 25:
                StickerCatalogRootVh stickerCatalogRootVh = (StickerCatalogRootVh) obj2;
                g2v.d().a().p(stickerCatalogRootVh.b, stickerCatalogRootVh.t);
                return s3q0.a;
            case 26:
                ImagesConfigsSet imagesConfigsSet = (ImagesConfigsSet) obj2;
                HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
                dyi y = StickersDatabase.a.b().y();
                String str = imagesConfigsSet.b;
                int i5 = imagesConfigsSet.c;
                List<ImageConfig> list = imagesConfigsSet.d;
                ArrayList arrayList3 = new ArrayList(c5g.u(list, 10));
                for (ImageConfig imageConfig : list) {
                    arrayList3.add(new ImageConfigEntity(imageConfig.b, imageConfig.c, imageConfig.d, imageConfig.e));
                }
                y.a(Collections.singletonList(new ImagesConfigsEntity(str, i5, arrayList3)));
                return s3q0.a;
            case 27:
                return Boolean.valueOf(((StickersView) obj2).D.a());
            case 28:
                StoryBottomViewGroup storyBottomViewGroup = (StoryBottomViewGroup) obj2;
                if (!storyBottomViewGroup.L) {
                    Iterator it2 = storyBottomViewGroup.C.e.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            obj = it2.next();
                            uwl0 uwl0Var = ((cc) obj).o;
                            if (uwl0Var == null) {
                                uwl0Var = null;
                            }
                            if (uwl0Var instanceof uwl0.a.c) {
                            }
                        } else {
                            obj = null;
                        }
                    }
                    cc ccVar = (cc) obj;
                    storyBottomViewGroup.postDelayed(new fs2(new mzl0(storyBottomViewGroup.K, storyBottomViewGroup, ccVar != null ? ccVar.itemView : null), 12), 16L);
                }
                return s3q0.a;
            default:
                int i6 = StoryFragment.X;
                return ((StoryViewerComponent) ((k7m) m7m.f((StoryFragment) obj2)).a(fpf0.a(StoryViewerComponent.class))).l9();
        }
    }

    public /* synthetic */ dj60(m9l0 m9l0Var, ImagesConfigsSet imagesConfigsSet) {
        this.b = 26;
        this.c = imagesConfigsSet;
    }
}
