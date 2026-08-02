package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.tabs.TabLayout;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetRecomResponseDto;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipsMusicSelectorCatalogFullHeightListVh;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.core.view.components.tabs.d;
import com.vk.draftslist.impl.ui.entity.DraftsListState;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.reviews.api.model.communityreviews.CreateCommunityReviewResult;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.im.ui.components.contacts.SortOrder;
import com.vk.im.ui.components.contacts.c;
import com.vk.photos.ui.editalbum.domain.a;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.core.content.ContentTab;
import com.vk.search.integration.api.SearchTab;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.a3i;
import xsna.bre;
import xsna.tra0;
import xsna.tyg;
import xsna.ure;
import xsna.v1j;
import xsna.wih0;
import xsna.xdo;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class i4e implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i4e(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v96, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v18, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v22, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r8v1, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.wzs] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Object obj2;
        xy2 o;
        Object parcelable;
        boolean z = true;
        int i = 0;
        switch (this.b) {
            case 0:
                com.vk.clips.favorites.impl.ui.folders.renaming.b bVar = (com.vk.clips.favorites.impl.ui.folders.renaming.b) this.c;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                String str = com.vk.clips.favorites.impl.ui.folders.renaming.b.m1;
                bVar.An(booleanValue);
                return s3q0.a;
            case 1:
                com.vk.clips.attachments.impl.publish.geolocation.presentation.e eVar = (com.vk.clips.attachments.impl.publish.geolocation.presentation.e) this.c;
                List list = (List) obj;
                if (list.isEmpty()) {
                    return io.reactivex.rxjava3.core.x.k(EmptyList.b);
                }
                eVar.g.getClass();
                return yiz.i(null, list);
            case 2:
                ShortVideoGetRecomResponseDto shortVideoGetRecomResponseDto = (ShortVideoGetRecomResponseDto) obj;
                ArrayList arrayList = ((g0f) ((vie) this.c).a.f.getValue()).a(shortVideoGetRecomResponseDto.f().d(), shortVideoGetRecomResponseDto.k(), shortVideoGetRecomResponseDto.g(), shortVideoGetRecomResponseDto.d(), shortVideoGetRecomResponseDto.e(), shortVideoGetRecomResponseDto.H2(), shortVideoGetRecomResponseDto.i(), shortVideoGetRecomResponseDto.H4(), shortVideoGetRecomResponseDto.j(), null).a;
                ArrayList arrayList2 = new ArrayList();
                for (Object obj3 : arrayList) {
                    if (obj3 instanceof wih0.a) {
                        arrayList2.add(obj3);
                    }
                }
                ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((wih0.a) it.next()).a);
                }
                return arrayList3;
            case 3:
                ClipsMusicSelectorCatalogFullHeightListVh clipsMusicSelectorCatalogFullHeightListVh = (ClipsMusicSelectorCatalogFullHeightListVh) this.c;
                n3a n3aVar = (n3a) obj;
                if (n3aVar instanceof jwp0) {
                    UIBlock uIBlock = clipsMusicSelectorCatalogFullHeightListVh.c;
                    if (!(uIBlock instanceof UIBlockList)) {
                        return s3q0.a;
                    }
                    UIBlockList uIBlockList = (UIBlockList) uIBlock;
                    ArrayList<UIBlock> arrayList4 = uIBlockList.y;
                    ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, 10));
                    Iterator<T> it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        jwp0 jwp0Var = (jwp0) n3aVar;
                        arrayList5.add((UIBlock) jwp0Var.b.invoke((UIBlock) it2.next(), jwp0Var.a));
                    }
                    clipsMusicSelectorCatalogFullHeightListVh.N6(new UIBlockList(uIBlockList, arrayList5));
                } else {
                    qcy<Object>[] qcyVarArr = ClipsMusicSelectorCatalogFullHeightListVh.k;
                }
                return s3q0.a;
            case 4:
                bre breVar = (bre) this.c;
                ure ureVar = (ure) obj;
                bre.b bVar2 = bre.s1;
                if (!(ureVar instanceof ure.a)) {
                    if (!(ureVar instanceof ure.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    cvk.u(R.string.loading_error, false);
                } else if (((BridgeComponent) breVar.n1.getValue()).s().b()) {
                    kbj0.c(((BridgeComponent) breVar.n1.getValue()).h8(), breVar.requireContext(), "https://" + a0a.d + "/clips/playlist/" + ((ure.a) ureVar).a, false, null, null, breVar.co(), 88);
                } else {
                    ((BridgeComponent) breVar.n1.getValue()).h8().y(breVar.requireContext(), "https://" + a0a.d + "/clips/playlist/" + ((ure.a) ureVar).a);
                }
                return s3q0.a;
            case 5:
                ((hjc) this.c).a();
                return s3q0.a;
            case 6:
                return new io.reactivex.rxjava3.internal.operators.single.v(new f8f(i, (Pair) obj, (i8f) this.c));
            case 7:
                Context context = (Context) this.c;
                int i2 = com.vk.core.view.components.tabs.d.G;
                nxv0 a = d.a.a(context);
                a.setText(((TabLayout.g) obj).c);
                return a;
            case 8:
                qyg qygVar = (qyg) this.c;
                tyg tygVar = (tyg) obj;
                int i3 = qyg.n1;
                if (tygVar instanceof tyg.a) {
                    FragmentManager parentFragmentManager = qygVar.getParentFragmentManager();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable(fpf0.a(CreateCommunityReviewResult.class).l(), ((tyg.a) tygVar).a);
                    s3q0 s3q0Var = s3q0.a;
                    parentFragmentManager.k0(bundle, "create_community_review_result");
                    qygVar.dismiss();
                } else if (tygVar instanceof tyg.c) {
                    FragmentManager parentFragmentManager2 = qygVar.getParentFragmentManager();
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable(fpf0.a(CreateCommunityReviewResult.class).l(), ((tyg.c) tygVar).a);
                    s3q0 s3q0Var2 = s3q0.a;
                    parentFragmentManager2.k0(bundle2, "create_community_review_result");
                } else if (tygVar instanceof tyg.d) {
                    qygVar.dismiss();
                }
                return s3q0.a;
            case 9:
                c2h c2hVar = (c2h) this.c;
                VkInputSelect vkInputSelect = c2hVar.l1;
                if (vkInputSelect == null) {
                    vkInputSelect = null;
                }
                String valueOf = String.valueOf(vkInputSelect.getText());
                Bundle requireArguments = c2hVar.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("COMMUNITY_ID_KEY", UserId.class);
                    obj2 = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("COMMUNITY_ID_KEY");
                    if (!(parcelable2 instanceof UserId)) {
                        parcelable2 = null;
                    }
                    obj2 = (UserId) parcelable2;
                }
                UserId userId = (UserId) obj2;
                if (userId == null) {
                    throw new IllegalStateException("communityId argument must not be null");
                }
                VkInputSelect vkInputSelect2 = c2hVar.l1;
                if (vkInputSelect2 == null) {
                    vkInputSelect2 = null;
                }
                mhy.d(vkInputSelect2);
                VkSpinner vkSpinner = c2hVar.n1;
                if (vkSpinner == null) {
                    vkSpinner = null;
                }
                vkSpinner.setVisibility(0);
                ViewGroup viewGroup = c2hVar.k1;
                if (viewGroup == null) {
                    viewGroup = null;
                }
                viewGroup.setVisibility(4);
                o = ((zqu) c2hVar.g1.b).o(fkq0.a(userId), (r30 & 2) != 0 ? null : null, (r30 & 4) != 0 ? null : valueOf, (r30 & 8) != 0 ? null : null, (r30 & 16) != 0 ? null : null, (r30 & 32) != 0 ? null : null, (r30 & 256) != 0 ? null : null, (r30 & 134217728) != 0 ? null : null, (r31 & 4) != 0 ? null : null, (r32 & 64) != 0 ? null : null, (r32 & 256) != 0 ? null : null, (r32 & 512) != 0 ? null : null, (4194304 & r32) != 0 ? null : null, (r32 & 8388608) != 0 ? null : null);
                c2hVar.h1.b(rsg0.y0(yfb.x(o), null, null, 3).subscribe(new b60(new gr3(c2hVar, 23), 14), new c60(new mmf(c2hVar, 6), 12)));
                return s3q0.a;
            case 10:
                x2i x2iVar = ((s6h) this.c).f;
                if (x2iVar != null) {
                    x2iVar.mn(new a3i.b(true));
                }
                return s3q0.a;
            case 11:
                return kn00.a((kn00) obj, null, null, null, 0, null, (ed0) this.c, null, 1919);
            case 12:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) this.c;
                ContentTab contentTab = (ContentTab) obj;
                communityProfileFragment.f0 = contentTab;
                com.vk.profile.community.impl.ui.profile.f fVar = communityProfileFragment.S;
                com.vk.profile.community.impl.ui.profile.f fVar2 = fVar != null ? fVar : null;
                boolean z2 = contentTab instanceof ContentTab.Video;
                fVar2.c.g(z2 ? SearchTab.VIDEOS : contentTab instanceof ContentTab.Wall ? SearchTab.WALL : SearchTab.WALL);
                if (fVar2.i) {
                    fVar2.v.g(z2 ? R.string.community_search_video : R.string.community_search_posts);
                }
                return s3q0.a;
            case 13:
                jvh jvhVar = (jvh) obj;
                ((vvh) this.c).b().h(jvhVar.a, jvhVar.b, jvhVar.c);
                return s3q0.a;
            case 14:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.c;
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                LinearLayout linearLayout = communityReviewsFragment.b0;
                if (linearLayout != null) {
                    bwt0.p0(linearLayout, booleanValue2);
                }
                return s3q0.a;
            case 15:
                ((com.vk.profile.community.suggestions.impl.ui.suggestions.g) this.c).e.setTitle((String) obj);
                return s3q0.a;
            case 16:
                p0j p0jVar = (p0j) this.c;
                int i4 = p0j.j1;
                p0jVar.getFeature().C((j0j) obj);
                return s3q0.a;
            case 17:
                ((u1j) this.c).v.invoke(v1j.i.b);
                return s3q0.a;
            case 18:
                com.vk.im.ui.components.contacts.c cVar = (com.vk.im.ui.components.contacts.c) this.c;
                List<t8j> list2 = (List) obj;
                b25 b25Var = cVar.k;
                c.b bVar3 = cVar.A;
                if (o25.b(b25Var)) {
                    bVar3.b = list2;
                    if (list2.isEmpty()) {
                        cVar.Y0().d();
                    } else {
                        cVar.Y0().c(bVar3.b, SortOrder.BY_HINTS, null);
                    }
                } else {
                    ArrayList arrayList6 = new ArrayList(list2);
                    g5g.D(arrayList6, true, new adj(new ArrayList(bVar3.b), i));
                    List<t8j> D0 = j5g.D0(new oz2(z ? 1 : 0), j5g.u0(arrayList6, bVar3.b));
                    bVar3.b = D0;
                    if (D0.isEmpty()) {
                        cVar.Y0().d();
                    } else {
                        cVar.Y0().c(bVar3.b, SortOrder.BY_HINTS, null);
                    }
                }
                return s3q0.a;
            case 19:
                ocl oclVar = (ocl) this.c;
                vqt vqtVar = (vqt) obj;
                oclVar.n = vqtVar.e;
                oclVar.u(vqtVar);
                return s3q0.a;
            case 20:
                return Long.valueOf((long) (((Number) ((p0m) this.c).h.getValue()).doubleValue() * ((Long) obj).longValue()));
            case 21:
                efm efmVar = ((cfm) this.c).e;
                if (efmVar != null) {
                    efmVar.z();
                }
                return s3q0.a;
            case 22:
                return Boolean.valueOf(((ka80) obj).c.e.c.get(Long.valueOf(((mwm) this.c).b.q().d)) != null);
            case 23:
                h8n.this.f.a.f(new vxf0());
                return s3q0.a;
            case 24:
                hfo hfoVar = (hfo) this.c;
                DraftsListState draftsListState = (DraftsListState) obj;
                DraftsListState.LoadingState loadingState = DraftsListState.LoadingState.IDLE;
                ArrayList u0 = j5g.u0(hfoVar.a, draftsListState.c);
                HashSet hashSet = new HashSet();
                ArrayList arrayList7 = new ArrayList();
                Iterator it3 = u0.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    if (hashSet.add(Integer.valueOf(((Post) next).n))) {
                        arrayList7.add(next);
                    }
                }
                return DraftsListState.a(draftsListState, j5g.D0(new xdo.a(), arrayList7), loadingState, hfoVar.b, hfoVar.c, false, 33);
            case 25:
                xlb0 xlb0Var = (xlb0) obj;
                ((wzs) this.c).invoke(xlb0Var, Float.valueOf(Float.intBitsToFloat((int) (fdi.E(xlb0Var, false) >> 32))));
                xlb0Var.a();
                return s3q0.a;
            case 26:
                ((kzo) this.c).b.invoke(new a.j(((CharSequence) obj).toString()));
                return s3q0.a;
            case 27:
                z6p z6pVar = (z6p) this.c;
                ((u5h0) obj).a().getClass();
                f4m.j((View) z6pVar.j.c.getValue());
                return s3q0.a;
            case 28:
                tra0.a.x((tra0.a) obj, (tra0) this.c, 0, 0);
                return s3q0.a;
            default:
                p0s p0sVar = (p0s) this.c;
                p0sVar.f.compareAndSet(true, false);
                p0sVar.b.d(g580.b);
                return s3q0.a;
        }
    }
}
