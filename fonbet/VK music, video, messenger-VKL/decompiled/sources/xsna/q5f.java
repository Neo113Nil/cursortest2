package xsna;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.di.NewsfeedOptionalAdsComponent;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.ClickType;
import com.vk.catalog2.common.ui.mvp.holder.friends.FriendsComposeHeaderIconShowAllBadgeVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.CommunitiesSearchTopBarVh;
import com.vk.catalog2.common.ui.mvp.holder.group.topbar.a;
import com.vk.clips.viewer.impl.di.ClipsViewersSdkComponentImpl;
import com.vk.core.view.components.text.VkText;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.ecomm.storefrontservices.api.StorefrontServicesComponent;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.narratives.impl.highlights.HighlightChooseCoverFragment;
import com.vk.navigation.ImNavigationDelegateActivity;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.feed.views.FeedRecyclerPaginatedView;
import com.vk.newsfeed.impl.presentation.discover_media.presentation.fragment.DiscoverMediaTabFragment2;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.story.api.di.StoriesComponent;
import com.vk.typography.Font;
import com.vk.typography.FontFamily;
import com.vk.typography.TextFlag;
import com.vk.typography.TextSizeUnit;
import com.vk.typography.a;
import com.vk.typography.b;
import com.vk.utils.vectordrawable.EnhancedAnimatedVectorDrawable;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.ok.android.webrtc.Call;
import xsna.egm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class q5f implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q5f(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [T, androidx.recyclerview.widget.RecyclerView$Adapter] */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        RecyclerPaginatedView recyclerPaginatedView;
        float f;
        EnhancedAnimatedVectorDrawable.c animatorListener_delegate$lambda$0;
        int i = this.b;
        int i2 = 6;
        int i3 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((BridgeComponent) ((k7m) m7m.f((r5f) obj)).a(fpf0.a(BridgeComponent.class))).t().b();
            case 1:
                ((y7f) obj).a.finish();
                return s3q0.a;
            case 2:
                return ((StoriesComponent) ((k7m) m7m.f((mlf) obj)).a(fpf0.a(StoriesComponent.class))).S9();
            case 3:
                return new z2f(((ClipsViewersSdkComponentImpl) obj).a.x());
            case 4:
                ((CommunitiesSearchTopBarVh) obj).b.invoke(a.c.a);
                return s3q0.a;
            case 5:
                f8h f8hVar = (f8h) obj;
                f8hVar.e.a.invoke(new CommunityProfileAction.g.d.C1587d(false));
                w8h w8hVar = f8hVar.n;
                w8hVar.b = new hd(f8hVar, 29);
                i8h i8hVar = f8hVar.l;
                View view = f8hVar.c.b;
                i8hVar.getClass();
                FrameLayout frameLayout = w8hVar.a;
                frameLayout.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                Iterator<View> it = w8hVar.c.iterator();
                while (it.hasNext()) {
                    it.next().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                Iterator<View> it2 = w8hVar.d.iterator();
                while (it2.hasNext()) {
                    it2.next().setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                frameLayout.setClipBounds(null);
                if (view != null) {
                    view.setTranslationY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                i8hVar.a.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                frameLayout.invalidate();
                return s3q0.a;
            case 6:
                return ((StorefrontServicesComponent) ((h7m) obj).a(fpf0.a(StorefrontServicesComponent.class))).a();
            case 7:
                return ((NewsFeedComponent) ((k7m) m7m.f((tij) obj)).a(fpf0.a(NewsFeedComponent.class))).l0();
            case 8:
                jlj jljVar = (jlj) obj;
                jljVar.getClass();
                Runnable runnable = jljVar.e;
                if (runnable != null) {
                    runnable.run();
                }
                return s3q0.a;
            case 9:
                return ((Call) obj).getMediaOptionsChangeVerifier();
            case 10:
                return (EditText) ((lak) obj).findViewById(R.id.voip_rooms_time_limit_input);
            case 11:
                final fhl fhlVar = (fhl) obj;
                final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ?? adapter = fhlVar.a.getAdapter();
                ref$ObjectRef.element = adapter;
                if (adapter instanceof pd90) {
                    ref$ObjectRef.element = ((pd90) adapter).c;
                }
                final mf7 mf7Var = (mf7) ref$ObjectRef.element;
                kzd0 kzd0Var = new kzd0(iah0.b(20.0f), iah0.a(8), new mf7() { // from class: xsna.dhl
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // xsna.mf7
                    public final int e0(int i4) {
                        int e0 = mf7Var.e0(i4);
                        int itemCount = ((RecyclerView.Adapter) ref$ObjectRef.element).getItemCount();
                        if (i4 == 0) {
                            return 1;
                        }
                        int i5 = itemCount - 1;
                        fhl fhlVar2 = fhlVar;
                        return (!(i4 == i5 && fhlVar2.j()) && (fhl.k(fhlVar2.a, i4) instanceof ho60)) ? (e0 & (-5)) | 1 : e0;
                    }
                }, new x7c(fhlVar, i2));
                kzd0Var.o = fhlVar.j();
                if (fhlVar.j() && (recyclerPaginatedView = fhlVar.b) != null) {
                    recyclerPaginatedView.setDecoration(new cjf0());
                }
                return kzd0Var;
            case 12:
                egm egmVar = (egm) obj;
                Context context = egmVar.d;
                VkText vkText = new VkText(context, null, 6, 0);
                vkText.setId(R.id.dialog_item_reply_button);
                FontFamily fontFamily = FontFamily.REGULAR;
                egm.b bVar = egmVar.m;
                if (bVar == null) {
                    bVar = null;
                }
                float f2 = bVar.c;
                TextSizeUnit textSizeUnit = TextSizeUnit.PX;
                int i4 = a.C1933a.C1934a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
                if (i4 == 1) {
                    f = f2;
                } else {
                    if (i4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = com.vk.typography.b.b(f2);
                }
                Font.Companion.getClass();
                Font a = Font.a.a(fontFamily, f);
                Typeface k = a.k(context);
                float j = a.j();
                vkText.setTypeface(k);
                vkText.setLetterSpacing(j);
                if ((TextFlag.DO_NOT_CHANGE_SIZE.h() & 0) == 0) {
                    int i5 = b.a.$EnumSwitchMapping$0[textSizeUnit.ordinal()];
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = 2;
                    }
                    vkText.setTextSize(i3, f2);
                }
                vkText.setText(R.string.vkim_dialog_reply_to);
                vkText.setTextColor(e3m.f(R.attr.vk_ui_text_accent, context));
                vkText.setSingleLine(true);
                vkText.setEllipsize(TextUtils.TruncateAt.END);
                egm.b bVar2 = egmVar.m;
                vkText.setLayoutParams(egm.W(egmVar, 0, 0, (bVar2 != null ? bVar2 : null).h, 0, 0, 0, 59));
                egmVar.b.addView(vkText);
                return vkText;
            case 13:
                ((io.reactivex.rxjava3.disposables.c) obj).dispose();
                return s3q0.a;
            case 14:
                DiscoverMediaTabFragment2 discoverMediaTabFragment2 = (DiscoverMediaTabFragment2) obj;
                qcy<Object>[] qcyVarArr = DiscoverMediaTabFragment2.C0;
                int i6 = 5;
                return new h3n(new jpf(discoverMediaTabFragment2, 13), new sfg(discoverMediaTabFragment2, 12), new m2j(discoverMediaTabFragment2, i6), new tvj(discoverMediaTabFragment2, i6), discoverMediaTabFragment2.Q);
            case 15:
                return ((w3p) obj).h;
            case 16:
                animatorListener_delegate$lambda$0 = EnhancedAnimatedVectorDrawable.animatorListener_delegate$lambda$0((EnhancedAnimatedVectorDrawable) obj);
                return animatorListener_delegate$lambda$0;
            case 17:
                EditText editText = ((zop) obj).w;
                return com.vk.registration.funnels.a.d(editText != null ? editText : null);
            case 18:
                u4q u4qVar = (u4q) obj;
                NestedScrollView nestedScrollView = u4qVar.m;
                if (nestedScrollView == null) {
                    return null;
                }
                VkLoadingButton vkLoadingButton = u4qVar.w;
                nestedScrollView.scrollTo(0, (vkLoadingButton != null ? vkLoadingButton : null).getBottom());
                return s3q0.a;
            case 19:
                int i7 = FeedRecyclerPaginatedView.U;
                return (NewsfeedOptionalAdsComponent) ((k7m) m7m.c((FeedRecyclerPaginatedView) obj)).mo408a(fpf0.a(NewsfeedOptionalAdsComponent.class));
            case 20:
                com.vk.photo.editor.features.filter.f fVar = ((com.vk.photo.editor.features.filter.b) obj).l;
                if (fVar != null) {
                    fVar.a();
                }
                return s3q0.a;
            case 21:
                return ((StoriesComponent) ((k7m) m7m.f((jlr) obj)).a(fpf0.a(StoriesComponent.class))).r2();
            case 22:
                RecyclerView recyclerView = ((com.vk.folders.impl.configure.h) obj).j;
                return new com.vk.im.popup.b((recyclerView != null ? recyclerView : null).getContext());
            case 23:
                FriendsComposeHeaderIconShowAllBadgeVh friendsComposeHeaderIconShowAllBadgeVh = (FriendsComposeHeaderIconShowAllBadgeVh) obj;
                int i8 = FriendsComposeHeaderIconShowAllBadgeVh.B;
                if (!jjc.d().a()) {
                    int i9 = FriendsComposeHeaderIconShowAllBadgeVh.B;
                    friendsComposeHeaderIconShowAllBadgeVh.b(ClickType.SHOW_ALL);
                    s3q0 s3q0Var = s3q0.a;
                }
                return s3q0.a;
            case 24:
                return ((GalleryFragmentImpl) obj).g0;
            case 25:
                GoodFragment goodFragment = (GoodFragment) obj;
                qcy<Object>[] qcyVarArr2 = GoodFragment.U0;
                io.reactivex.rxjava3.disposables.b bVar3 = new io.reactivex.rxjava3.disposables.b();
                qdz qdzVar = (qdz) goodFragment.Lo().Y.getValue();
                ?? r3 = goodFragment.J0;
                cxo cxoVar = new cxo(goodFragment.Lo(), bVar3, new a5u(qdzVar, (sld0) r3.getValue()));
                cxoVar.g0 = (sld0) r3.getValue();
                return cxoVar;
            case 26:
                int i10 = HighlightChooseCoverFragment.R;
                return ((BridgeComponent) m7m.d((HighlightChooseCoverFragment) obj).a(fpf0.a(BridgeComponent.class))).id();
            case 27:
                elm0 elm0Var = ((quv) obj).x;
                if (elm0Var != null) {
                    return elm0Var.getRef();
                }
                return null;
            case 28:
                return ((p7w) obj).k.b0().a();
            default:
                int i11 = ImNavigationDelegateActivity.n;
                return new vbs((ImNavigationDelegateActivity) obj);
        }
    }
}
