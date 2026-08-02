package xsna;

import android.app.Dialog;
import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.attachpicker.impl.DeprecatedAttachActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemSearchListVh;
import com.vk.catalog2.common.ui.mvp.holder.container.HorizontalLoopVh;
import com.vk.core.view.components.cell.rich.VkRichCell;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.common.Source;
import com.vk.dto.newsfeed.entries.Html5Entry;
import com.vk.ecomm.reviews.impl.communities.replies.CommunityRepliesFragment;
import com.vk.ecomm.verifiedseller.api.di.VerifiedSellerComponent;
import com.vk.feed.core.models.news.UxPollsEntry;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import com.vk.gallerypicker.configuration.SpoilerConfiguration;
import com.vk.newsfeed.impl.presenters.EntriesListPresenter;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.notifications.list.impl.presentation.base.fragment.grouped.GroupedNotificationListFragment;
import com.vk.profile.community.creationonboarding.impl.finish.presentation.feature.CommunityCreationOnboardingFinishState;
import com.vk.profile.community.impl.ui.members.GroupMembersFragment;
import com.vk.search.integration.api.di.SearchComponent;
import com.vk.superapp.ads.js.bridge.api.di.JsAdsDelegateComponent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.superapp.core.errors.VkAppsErrors;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import xsna.iqh0;
import xsna.mzh0;
import xsna.osp;
import xsna.w1g0;
import xsna.wmk;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qzg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qzg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        gvv0 view;
        int i = this.b;
        int i2 = 4;
        Object obj = this.c;
        switch (i) {
            case 0:
                return (CommunityCreationOnboardingFinishState) ((mm50) obj).getCurrentState();
            case 1:
                return ((VerifiedSellerComponent) ((h7m) obj).a(fpf0.a(VerifiedSellerComponent.class))).a();
            case 2:
                CommunityRepliesFragment communityRepliesFragment = (CommunityRepliesFragment) obj;
                WriteBar writeBar = communityRepliesFragment.U;
                if (writeBar != null) {
                    e2g0 e2g0Var = communityRepliesFragment.Z;
                    String a = e2g0Var != null ? e2g0Var.a() : null;
                    if (a == null) {
                        a = "";
                    }
                    xn50.a.c(communityRepliesFragment, new w1g0.j(a, writeBar.getAttachments()));
                }
                return s3q0.a;
            case 3:
                o1i o1iVar = (o1i) obj;
                o1iVar.d.t8(o1iVar.c, true);
                return s3q0.a;
            case 4:
                com.vk.im.ui.components.contacts.a aVar = (com.vk.im.ui.components.contacts.a) obj;
                com.vk.im.ui.components.contacts.b b1 = aVar.b1();
                b1.getClass();
                com.vk.im.ui.components.contacts.b.c(new k5h(b1, i2));
                aVar.e1(Source.CACHE, false);
                return s3q0.a;
            case 5:
                int i3 = com.vk.channelrestrictions.b.h1;
                ((com.vk.channelrestrictions.b) obj).co(true);
                return s3q0.a;
            case 6:
                jfk jfkVar = ((uik) obj).o;
                if (jfkVar != null) {
                    jfkVar.i();
                }
                return s3q0.a;
            case 7:
                ((wmk.a) obj).m.o();
                return s3q0.a;
            case 8:
                gxl gxlVar = (gxl) obj;
                ComposeView composeView = new ComposeView(gxlVar.d, null, 6);
                composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                composeView.setContent(new jai(-1118314578, new te1(gxlVar, i2), true));
                return composeView;
            case 9:
                DeprecatedAttachActivity deprecatedAttachActivity = (DeprecatedAttachActivity) obj;
                int i4 = DeprecatedAttachActivity.K0;
                return deprecatedAttachActivity.D0.a(deprecatedAttachActivity.T, deprecatedAttachActivity.getIntent().getBooleanExtra("attach_limit_hint", false), deprecatedAttachActivity.Y, deprecatedAttachActivity.q0, deprecatedAttachActivity.m0, Integer.valueOf(iah0.a(20)), new GalleryPickerSourceConfiguration(false, false, deprecatedAttachActivity.q0 != 0 ? GalleryPickerSourceConfiguration.EntryPoint.IM : null, false, false, false, false, false, new SpoilerConfiguration(deprecatedAttachActivity.getIntent().getBooleanExtra("spoiler_tool_need_show", false), deprecatedAttachActivity.getIntent().getBooleanExtra("spoiler_blur_enabled", false), deprecatedAttachActivity.getIntent().getBooleanExtra("spoiler_donate_enabled", false), deprecatedAttachActivity.getIntent().getBooleanExtra("spoiler_donate_system_need_activate", false), deprecatedAttachActivity.getIntent().getBooleanExtra("spoiler_donate_can_show_onboarding", false), deprecatedAttachActivity.getIntent().hasExtra("spoiler_group") ? Long.valueOf(deprecatedAttachActivity.getIntent().getLongExtra("spoiler_group", 0L)) : null)));
            case 10:
                egm egmVar = (egm) obj;
                VkImageSimple vkImageSimple = new VkImageSimple(egmVar.d, null, 6, 0);
                vkImageSimple.setId(R.id.dialog_item_verified_icon);
                vkImageSimple.setContentDescription(null);
                vkImageSimple.setLayoutParams(egm.W(egmVar, cn70.b(16), cn70.b(16), egmVar.c ? cn70.b(4) : cn70.b(6), cn70.b(1), 0, 0, 48));
                egmVar.b.addView(vkImageSimple);
                return vkImageSimple;
            case 11:
                ozf ozfVar = ((xvo) obj).a;
                if (ozfVar != null) {
                    ozfVar.invoke();
                }
                return s3q0.a;
            case 12:
                return new x1n((m2c0) obj);
            case 13:
                final EntriesListPresenter entriesListPresenter = (EntriesListPresenter) obj;
                return new s0d0() { // from class: xsna.arp
                    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
                    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // xsna.s0d0
                    public final u0d0 a(int i5) {
                        u0d0 u0d0Var;
                        EntriesListPresenter entriesListPresenter2 = EntriesListPresenter.this;
                        fqp fqpVar = entriesListPresenter2.b;
                        final u1c0 c = entriesListPresenter2.c.c(i5 - fqpVar.s9());
                        if (c == null) {
                            return u0d0.a;
                        }
                        de deVar = c.p;
                        final rx3 rx3Var = (rx3) entriesListPresenter2.X.getValue();
                        rx3Var.getClass();
                        final int b0 = c.p.b0(c);
                        if (b0 > 0) {
                            final int i6 = rx3Var.c;
                            rx3Var.c = i6 + 1;
                            asu0.a.getClass();
                            asu0.h().submit(new Runnable() { // from class: xsna.ox3
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i7 = b0;
                                    rx3 rx3Var2 = rx3Var;
                                    int i8 = i6;
                                    u1c0 u1c0Var = c;
                                    io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
                                    for (int i9 = 0; i9 < i7; i9++) {
                                        WeakReference<io.reactivex.rxjava3.disposables.b> weakReference = rx3Var2.b.get(Integer.valueOf(i8));
                                        io.reactivex.rxjava3.disposables.b bVar2 = weakReference != null ? weakReference.get() : null;
                                        if ((bVar2 == null || bVar2.c) && !mcr0.p(u1c0Var.p.d0(u1c0Var, i9))) {
                                            hg1.e(bVar, mcr0.r(Uri.parse(u1c0Var.p.d0(u1c0Var, i9)), null, u1c0Var.p.c0(u1c0Var, i9)).subscribe());
                                        }
                                    }
                                    hg1.e(rx3Var2.a, bVar);
                                    rx3Var2.b.put(Integer.valueOf(i8), new WeakReference<>(bVar));
                                }
                            });
                            u0d0Var = new u0d0() { // from class: xsna.px3
                                @Override // xsna.u0d0
                                public final void cancel() {
                                    asu0.a.getClass();
                                    ExecutorService h = asu0.h();
                                    final rx3 rx3Var2 = rx3.this;
                                    final int i7 = i6;
                                    h.submit(new Runnable() { // from class: xsna.qx3
                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            rx3 rx3Var3 = rx3.this;
                                            ConcurrentHashMap<Integer, WeakReference<io.reactivex.rxjava3.disposables.b>> concurrentHashMap = rx3Var3.b;
                                            int i8 = i7;
                                            WeakReference<io.reactivex.rxjava3.disposables.b> weakReference = concurrentHashMap.get(Integer.valueOf(i8));
                                            if (weakReference != null) {
                                                io.reactivex.rxjava3.disposables.b bVar = weakReference.get();
                                                if (bVar != null) {
                                                    bVar.e();
                                                }
                                                rx3Var3.b.remove(Integer.valueOf(i8));
                                            }
                                        }
                                    });
                                }
                            };
                        } else {
                            u0d0Var = u0d0.a;
                        }
                        ((ro10) entriesListPresenter2.l.getValue()).a();
                        Html5Entry Z = deVar.Z(c);
                        if (Z != null) {
                            fqpVar.Gl(Z);
                        }
                        UxPollsEntry k0 = deVar.k0(c);
                        if (k0 != null) {
                            fqpVar.Ok(k0);
                        }
                        if (c.g()) {
                            entriesListPresenter2.G0(c);
                        }
                        int h0 = deVar.h0(c);
                        for (int i7 = 0; i7 < h0; i7++) {
                            String g0 = deVar.g0(c, i7);
                            if (g0 != null) {
                                entriesListPresenter2.C.a(g0);
                            }
                        }
                        return u0d0Var;
                    }
                };
            case 14:
                osp.a aVar2 = (osp.a) obj;
                osp ospVar = aVar2.k;
                Dialog dialog = ospVar.s;
                nw20 nw20Var = dialog instanceof nw20 ? (nw20) dialog : null;
                if (nw20Var != null) {
                    int i5 = iah0.r(nw20Var.getContext()) ? 8388693 : 1;
                    ViewGroup viewGroup = nw20Var.i0;
                    f4m.m(i5, viewGroup != null ? viewGroup : null);
                }
                ww50 v = s200.v(aVar2.c);
                if (v != null) {
                    v.S(ospVar);
                }
                aVar2.g.invoke();
                return s3q0.a;
            case 15:
                ((ipr) obj).b.requestLayout();
                return s3q0.a;
            case 16:
                return ((r3s) obj).b.b(null);
            case 17:
                VkRichCell vkRichCell = ((FriendsItemSearchListVh) obj).g;
                (vkRichCell != null ? vkRichCell : null).performClick();
                return s3q0.a;
            case 18:
                return Boolean.valueOf(((evs) obj).b);
            case 19:
                dw20 dw20Var = ((e5u) obj).d;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 20:
                xn50.a.c(((gdu) obj).a, new PostingAction.Permissions.PermissionGranted(PermissionType.GalleryView));
                return s3q0.a;
            case 21:
                GroupMembersFragment groupMembersFragment = (GroupMembersFragment) obj;
                int i6 = GroupMembersFragment.k0;
                return (m620) ((SearchComponent) m7m.d(groupMembersFragment).mo408a(fpf0.a(SearchComponent.class))).V3().a(new iqh0.b(groupMembersFragment, new mzh0.a(2), fkq0.e(groupMembersFragment.e0), (xsh0) groupMembersFragment.h0.getValue()));
            case 22:
                int i7 = GroupedNotificationListFragment.Y;
                return ((BridgeComponent) m7m.d((GroupedNotificationListFragment) obj).a(fpf0.a(BridgeComponent.class))).i1();
            case 23:
                RecyclerView recyclerView = ((HorizontalLoopVh) obj).j;
                return (recyclerView != null ? recyclerView : null).getContext();
            case 24:
                return Boolean.valueOf(epx.f((String) ((ckv) obj).i().c.getValue(), "http"));
            case 25:
                return "#clearCache: " + ((whc) obj).b();
            case 26:
                ((wzx) obj).e.invoke();
                return s3q0.a;
            case 27:
                fvv0 M = ((d4y) obj).a.M();
                if (M != null && (view = M.getView()) != null) {
                    view.Ii();
                }
                return s3q0.a;
            case 28:
                r6y r6yVar = (r6y) obj;
                return ((JsAdsDelegateComponent) x6y.H().a(fpf0.a(JsAdsDelegateComponent.class))).z1().a(r6yVar.M(), r6yVar, new tbg(r6yVar, 26));
            default:
                ((p7y) obj).a.A(JsApiMethodType.SECURE_TOKEN_GET, VkAppsErrors.Client.i(VkAppsErrors.Client.UNSUPPORTED_PLATFORM, null, null, 7));
                return s3q0.a;
        }
    }
}
