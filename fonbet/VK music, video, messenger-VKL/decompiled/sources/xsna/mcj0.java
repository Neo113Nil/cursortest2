package xsna;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.soloader.MinElf;
import com.vk.auth.main.VkClientAuthActivity;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.header.VkTopBarSearchQueryVh;
import com.vk.channels.impl.channel_screen.UnreadCounterDataSourceImpl;
import com.vk.core.view.components.cell.button.VkCellButton;
import com.vk.core.view.components.context.menu.VkContextMenu;
import com.vk.core.view.components.context.menu.e;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.common.restrictions.RestrictionButton;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.log.L;
import com.vk.sharing.core.view.l;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stories.StorySettingsActivity;
import com.vk.stories.design.view.stats.tabs.viewers.model.StoryUserViewer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.i;
import com.vk.storycamera.picker.feature.f;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.storycamera.picker.ui.a;
import com.vk.superapp.browser.ui.VkBrowserActivity;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.av20;
import xsna.bgp0;
import xsna.eam0;
import xsna.ejm0;
import xsna.gm50;
import xsna.h1o0;
import xsna.hjm0;
import xsna.i8w0;
import xsna.iim0;
import xsna.ikv0;
import xsna.kd0;
import xsna.l1o0;
import xsna.lvv0;
import xsna.nnj0;
import xsna.o0r0;
import xsna.s0s0.a;
import xsna.s0s0.b;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class mcj0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mcj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0626  */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String, xsna.ikv0$d$a] */
    /* JADX WARN: Type inference failed for: r5v26, types: [T, kotlin.Pair] */
    /* JADX WARN: Type inference failed for: r5v6, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v15, types: [xsna.iim0$a] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        l.a aVar;
        Dialog dialog;
        Window window;
        CharSequence a;
        RestrictionButton restrictionButton;
        p180 onBackPressedDispatcher;
        int i = this.b;
        int i2 = 24;
        r5 = null;
        String str = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.sharing.core.view.f fVar = (com.vk.sharing.core.view.f) obj2;
                pno0 pno0Var = (pno0) obj;
                if (fVar.D != null) {
                    if (fVar.T0) {
                        CharSequence d = pno0Var.d();
                        int length = d.length() - 1;
                        int i3 = 0;
                        boolean z = false;
                        while (i3 <= length) {
                            boolean z2 = epx.g(d.charAt(!z ? i3 : length), 32) <= 0;
                            if (z) {
                                if (z2) {
                                    length--;
                                } else {
                                    String obj3 = d.subSequence(i3, length + 1).toString();
                                    aVar = fVar.D;
                                    if (aVar != null) {
                                        aVar.p2(obj3);
                                    }
                                }
                            } else if (z2) {
                                i3++;
                            } else {
                                z = true;
                            }
                        }
                        String obj32 = d.subSequence(i3, length + 1).toString();
                        aVar = fVar.D;
                        if (aVar != null) {
                        }
                    } else {
                        fVar.T0 = true;
                    }
                }
                return s3q0.a;
            case 1:
                ((znj0) obj2).j(nnj0.a.a);
                return s3q0.a;
            case 2:
                com.vk.stickers.keyboard.d dVar = ((xdl0) obj2).c;
                if (dVar != null) {
                    d6w0 e = b6m.e();
                    StickersView stickersView = dVar.a;
                    e.b(stickersView.getContext(), "keyboard", "create");
                    stickersView.H = true;
                }
                return s3q0.a;
            case 3:
                return ((nol0) obj2).invoke((mol0) obj);
            case 4:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj2;
                com.vk.storycamera.picker.feature.f fVar2 = (com.vk.storycamera.picker.feature.f) obj;
                int i4 = StoryMediaPickerFragment.d0;
                if (!(fVar2 instanceof f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                xn50.a.c(storyMediaPickerFragment, new a.g(((f.a) fVar2).a));
                return s3q0.a;
            case 5:
                L.i((Throwable) obj);
                ((p9m0) obj2).j.b(eam0.e.a);
                return s3q0.a;
            case 6:
                long longValue = ((Long) obj).longValue();
                VkCellButton vkCellButton = ((StorySettingsActivity) obj2).F;
                bwt0.p0(vkCellButton != null ? vkCellButton : 0, longValue > 0);
                return s3q0.a;
            case 7:
                StoryStatisticsViewersFragment storyStatisticsViewersFragment = (StoryStatisticsViewersFragment) obj2;
                com.vk.stories.design.view.stats.tabs.viewers.mvi.i iVar = (com.vk.stories.design.view.stats.tabs.viewers.mvi.i) obj;
                int i5 = StoryStatisticsViewersFragment.f0;
                if (iVar instanceof i.b) {
                    xwk.e().m(storyStatisticsViewersFragment.requireContext(), ((i.b) iVar).a.c, new o0r0.a(false, null, null, null, null, null, null, false, false, false, false, null, null, null, MinElf.PN_XNUM));
                } else if (iVar instanceof i.d) {
                    i.d dVar2 = (i.d) iVar;
                    com.vk.stories.design.view.stats.tabs.viewers.mvi.d dVar3 = storyStatisticsViewersFragment.d0;
                    if (dVar3 != null) {
                        RecyclerView.e0 findViewHolderForAdapterPosition = dVar3.e.getRecyclerView().findViewHolderForAdapterPosition(dVar2.b);
                        View view = findViewHolderForAdapterPosition != null ? findViewHolderForAdapterPosition.itemView : null;
                        if (view != null) {
                            Rect d2 = w11.d(view);
                            d2.left = d2.right - iah0.a(16);
                            him0 him0Var = storyStatisticsViewersFragment.e0;
                            Context requireContext = storyStatisticsViewersFragment.requireContext();
                            lpj lpjVar = requireContext instanceof lpj ? (lpj) requireContext : null;
                            Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                            dhr0.a.getClass();
                            Context l7sVar = (valueOf != null && valueOf.intValue() == dhr0.u().c) ? requireContext : new l7s(requireContext, dhr0.u().c);
                            StoryUserViewer storyUserViewer = dVar2.a;
                            com.vk.stories.design.view.stats.tabs.viewers.mvi.c cVar = new com.vk.stories.design.view.stats.tabs.viewers.mvi.c(1, storyStatisticsViewersFragment, StoryStatisticsViewersFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0);
                            him0Var.getClass();
                            ListBuilder e2 = e43.e();
                            if (storyUserViewer.d()) {
                                e2.add(iim0.c.c);
                            }
                            e2.add(storyUserViewer.j0 ? iim0.a.c : iim0.b.c);
                            ListBuilder g = e2.g();
                            av20.a aVar2 = new av20.a();
                            aVar2.d(R.layout.pds_actions_popup_story_statistics_viewers_item, LayoutInflater.from(l7sVar));
                            aVar2.d = new fim0(l7sVar);
                            aVar2.e = new gim0(cVar, storyUserViewer, l7sVar, him0Var);
                            av20 b = aVar2.b();
                            b.setItems(g);
                            int l = krv0.l(R.attr.vk_ui_icon_accent);
                            view.getContext();
                            e.c cVar2 = new e.c(null, d2, view, l, 1);
                            cVar2.e = l7sVar;
                            cVar2.m = cn70.b(4);
                            cVar2.l = b;
                            VkContextMenu a2 = cVar2.a();
                            a2.j(false);
                            him0Var.a = a2;
                        }
                    }
                } else if (iVar instanceof i.a) {
                    o0w.x(g2v.c().b(), storyStatisticsViewersFragment.requireContext(), null, ((i.a) iVar).a.c.b, null, null, null, false, null, null, null, null, null, null, "story_feedback", null, null, null, false, null, null, null, null, null, 1073733618);
                } else {
                    if (!(iVar instanceof i.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i.c cVar3 = (i.c) iVar;
                    Fragment parentFragment = storyStatisticsViewersFragment.getParentFragment();
                    androidx.fragment.app.d dVar4 = parentFragment instanceof androidx.fragment.app.d ? (androidx.fragment.app.d) parentFragment : null;
                    if (dVar4 != null && (dialog = dVar4.s) != null && (window = dialog.getWindow()) != null) {
                        ikv0.a aVar3 = new ikv0.a(bwt0.u(storyStatisticsViewersFragment.requireContext()));
                        CharSequence a3 = cVar3.a.a(storyStatisticsViewersFragment.requireContext());
                        if (a3 != null) {
                            aVar3.u = new ikv0.d(a3.toString(), (String) r5, (ikv0.d.a) r5, 6);
                        }
                        q9i0 q9i0Var = new q9i0(cVar3, 8);
                        tlo0 tlo0Var = cVar3.b;
                        if (tlo0Var != null && (a = tlo0Var.a(storyStatisticsViewersFragment.requireContext())) != null) {
                            aVar3.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, a.toString(), new hb40(q9i0Var, 23));
                        }
                        aVar3.o = Integer.valueOf(iah0.a(8));
                        aVar3.p(window);
                    }
                }
                return s3q0.a;
            case 8:
                ajm0 ajm0Var = (ajm0) obj2;
                ejm0.b bVar = (ejm0.b) ((it80) obj).a;
                if (bVar != null) {
                    ajm0Var.T(new hjm0.a(bVar));
                } else {
                    ajm0Var.T(hjm0.e.b);
                }
                return s3q0.a;
            case 9:
                pn0 pn0Var = (pn0) obj2;
                ((uov) pn0Var.b).setActionInProgress(false);
                uov uovVar = (uov) pn0Var.b;
                uovVar.play();
                sdi.v((Throwable) obj, uovVar.getView());
                return s3q0.a;
            case 10:
                com.vk.lists.c cVar4 = ((com.vk.superapp.ui.a) obj2).I;
                if (cVar4 != null) {
                    cVar4.p(true);
                }
                return s3q0.a;
            case 11:
                l1o0.a aVar4 = (l1o0.a) obj;
                return new h1o0.c.b(j5g.u0(aVar4.a, ((m1o0) obj2).b), aVar4.b, aVar4.c);
            case 12:
                ((tdu) obj).b(((Number) ((mtk0) obj2).getValue()).floatValue());
                return s3q0.a;
            case 13:
                ib50 ib50Var = (ib50) obj;
                ((xfp0) obj2).T(new bgp0.c(ib50Var.b, ib50Var.a.J));
                return s3q0.a;
            case 14:
                UnreadCounterDataSourceImpl unreadCounterDataSourceImpl = (UnreadCounterDataSourceImpl) obj2;
                if (!unreadCounterDataSourceImpl.c) {
                    anj.d(unreadCounterDataSourceImpl.a, unreadCounterDataSourceImpl.d, z23.a("com.vkontakte.android.COUNTERS_UPDATED"), hf8.a, 4);
                    unreadCounterDataSourceImpl.c = true;
                }
                return s3q0.a;
            case 15:
                zhf0 zhf0Var = (zhf0) obj2;
                return new h9x((((an10.b(zhf0Var.c) + an10.b(zhf0Var.a)) / 2) << 32) | (an10.b(zhf0Var.b) & 4294967295L));
            case 16:
                ((View) obj2).performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 17:
                ((b2r0) obj2).b.b().execSQL("UPDATE users SET contact_id = NULL");
                return s3q0.a;
            case 18:
                oor0 oor0Var = ((ror0) obj2).e;
                if (oor0Var != null) {
                    oor0Var.S();
                }
                return s3q0.a;
            case 19:
                s0s0 s0s0Var = (s0s0) obj2;
                m290 m290Var = (m290) j5g.Y((List) obj);
                io.reactivex.rxjava3.subjects.d<a21> dVar5 = s0s0Var.k;
                g2d0 g2d0Var = s0s0Var.i;
                g2d0 g2d0Var2 = g2d0Var != null ? new g2d0(g2d0Var.a, g2d0Var.b, m290Var.b) : null;
                s0s0Var.i = g2d0Var2;
                int i6 = m290Var.a;
                kd0.b a4 = s0s0Var.c.a();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                zu50 zu50Var = new zu50(i6, a4, context);
                qnk qnkVar = zu50Var.a.a;
                qnkVar.g("video_id", dVar5.P0().a);
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                qnkVar.g("device_id", b6m.b(context2));
                bpn0 bpn0Var = o25.a;
                qnkVar.g("user_id", String.valueOf(((b25) (bpn0Var != null ? bpn0Var : null).getValue()).o().b().c.b));
                qnkVar.g(CommonUrlParts.REQUEST_ID, dVar5.P0().b);
                qnkVar.g("video_owner_id", String.valueOf(dVar5.P0().c));
                zu50Var.i = s0s0Var.new b(g2d0Var2);
                zu50Var.l = s0s0Var.new a();
                zu50Var.g();
                s0s0Var.g = zu50Var;
                return s3q0.a;
            case 20:
                return (kfs0) obj2;
            case 21:
                VideoEmbedFragment videoEmbedFragment = (VideoEmbedFragment) obj2;
                VideoFile videoFile = (VideoFile) obj;
                int i7 = VideoEmbedFragment.q0;
                videoEmbedFragment.c0 = videoFile;
                yks0 yks0Var = videoEmbedFragment.Y;
                if (yks0Var != null) {
                    yks0Var.j(videoFile);
                }
                kz20 kz20Var = videoEmbedFragment.Z;
                if (kz20Var != null) {
                    kz20Var.g = videoFile;
                }
                videoEmbedFragment.ko();
                return s3q0.a;
            case 22:
                UserId userId = (UserId) obj2;
                UIBlock uIBlock = (UIBlock) obj;
                if (uIBlock instanceof UIBlockVideo) {
                    UIBlockVideo uIBlockVideo = (UIBlockVideo) uIBlock;
                    if (epx.f(uIBlockVideo.B.I0(), userId)) {
                        VideoRestriction O = uIBlockVideo.B.O();
                        if (O != null && (restrictionButton = O.e) != null) {
                            str = restrictionButton.b;
                        }
                        if (epx.f(str, RestrictionButton.Action.DONAT.h())) {
                            r6 = true;
                        }
                    }
                }
                return Boolean.valueOf(r6);
            case 23:
                int i8 = VideoMinimizableDiscoveryFragment.p1;
                ((VideoMinimizableDiscoveryFragment) obj2).getFeature().L0((AboutVideoItem.a) obj);
                return s3q0.a;
            case 24:
                VideoFile videoFile2 = (VideoFile) obj2;
                VideoFile videoFile3 = (VideoFile) obj;
                if (videoFile3.o0() == videoFile2.o0() && epx.f(videoFile3.I0(), videoFile2.I0())) {
                    r6 = true;
                }
                return Boolean.valueOf(r6);
            case 25:
                ubu0 ubu0Var = (ubu0) obj2;
                lvv0 lvv0Var = (lvv0) obj;
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                if (lvv0Var instanceof lvv0.b) {
                    lvv0.b bVar2 = (lvv0.b) lvv0Var;
                    if (bVar2.a) {
                        Context requireContext2 = ubu0Var.requireContext();
                        ref$ObjectRef.element = new Pair(requireContext2, new Intent(requireContext2, (Class<?>) VkClientAuthActivity.class).addFlags(603979776).putExtra("openLoginPass", true));
                    } else if (bVar2.d) {
                        ubu0Var.requireContext();
                        int i9 = VkBrowserActivity.l;
                        bpn0 bpn0Var2 = com.vk.auth.main.f.a;
                        throw null;
                    }
                } else if (lvv0Var instanceof lvv0.a) {
                    q55 q55Var = q55.a;
                    q55.d(((lvv0.a) lvv0Var).a);
                } else {
                    if (!(lvv0Var instanceof lvv0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ubu0Var.jk();
                    if (ubu0Var.getParentFragmentManager().K() > 1) {
                        ubu0Var.getParentFragmentManager().W();
                    } else {
                        FragmentActivity activity = ubu0Var.getActivity();
                        if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                            onBackPressedDispatcher.d();
                        }
                    }
                }
                qro0.c(new d5f(ubu0Var, lvv0Var, ref$ObjectRef, 7));
                return s3q0.a;
            case 26:
                lgv0 lgv0Var = (lgv0) obj2;
                lgv0Var.r.reset();
                ysg0.b.a(new nru0(lgv0Var.r, true));
                lgv0Var.tn(null, true);
                return s3q0.a;
            case 27:
                i0q0.f(new yqd0((Ref$ObjectRef) obj2, i2));
                return s3q0.a;
            case 28:
                VkTopBarSearchQueryVh vkTopBarSearchQueryVh = (VkTopBarSearchQueryVh) obj2;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                VkTopBarSearchQueryVh.b bVar3 = vkTopBarSearchQueryVh.r;
                VkTopBar.Middle.d dVar6 = bVar3.g;
                vkTopBarSearchQueryVh.h(VkTopBarSearchQueryVh.b.a(bVar3, false, null, false, null, false, dVar6 != null ? VkTopBar.Middle.d.a(dVar6, null, null, booleanValue, null, 4091) : null, false, null, null, 959));
                if (booleanValue) {
                    vkTopBarSearchQueryVh.c.a3(vkTopBarSearchQueryVh.i());
                }
                return s3q0.a;
            default:
                e8w0 e8w0Var = (e8w0) obj2;
                bwt0.p0(e8w0Var.n, true);
                bwt0.p0(e8w0Var.o, false);
                gm50.a.a(e8w0Var, ((i8w0.b) obj).a, new mdm0(e8w0Var, i2));
                return s3q0.a;
        }
    }
}
