package xsna;

import android.content.Context;
import android.content.ContextWrapper;
import android.net.Uri;
import android.util.SparseBooleanArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.vk.catalog.mvi.block.BlockId;
import com.vk.catalog.mvi.block.video.impl.catalog.banner.CatalogBannerView;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListViewState;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.design.demo.presentation.screens.SkeletonScreenContent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.cart.impl.cart.feature.state.a;
import com.vk.im.design.view.counter.ImVkCounter;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.media.player.video.view.PlaylistPlayerVideoView;
import com.vk.profile.community.impl.ui.tag.CommunityActionTags;
import com.vk.profile.design.compose.user.FriendsAndFollowersBlockData;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.calls.presentation.model.list.FriendItem;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Lazy;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import one.video.view.debug.VideoDebugInfoView;
import xsna.dis;
import xsna.egm;
import xsna.f3u0;
import xsna.hjl0;
import xsna.i1s0;
import xsna.l8r;
import xsna.me5;
import xsna.o9t;
import xsna.qtt0;
import xsna.rv9;
import xsna.sx40;
import xsna.wqs0;
import xsna.xn50;
import xsna.y1h;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class sk implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ sk(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r7v24, types: [kotlin.coroutines.jvm.internal.SuspendLambda, xsna.izs] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 17;
        boolean z = true;
        int i3 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) obj2;
                Collection<CallMemberId> collection = (Collection) obj;
                accessibilityEvents.c("usersStartRecording(" + collection.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.RECORD_STARTED, AccessibilityEvents.Event.RECORD_STOPPED, collection);
                return s3q0.a;
            case 1:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                return new py0(new d11(e3m.a(R.dimen.clip_owner_avatar_height, (Context) obj)), cVar.h, cVar.j.a instanceof ClipFeedTab.SingleAdv);
            case 2:
                ((izs) obj2).invoke(sx40.b.g.b);
                ((etv0) obj).b(false);
                return s3q0.a;
            case 3:
                ((izs) obj2).invoke(new me5.b(((ne5) obj).b));
                return s3q0.a;
            case 4:
                l8r.a aVar = (l8r.a) obj;
                return "UPLOAD_TRACE getVideoFileInfo: successfully analyzed file " + ((Uri) obj2) + ", size=" + aVar.b + ", mime=" + aVar.h;
            case 5:
                ((izs) obj2).invoke(new rv9.i.C3635i((a.C0919a) obj));
                return s3q0.a;
            case 6:
                ((izs) obj2).invoke(new CatalogBannerView.b.a(((CatalogBannerView.BannerViewState) obj).b));
                return s3q0.a;
            case 7:
                StringBuilder sb = new StringBuilder("truncateMsgHistoryForMissedChannels():\ninconsistentChannelIds = [");
                sb.append(j5g.g0((ArrayList) obj2, null, null, null, 0, null, 63));
                sb.append("]\nserverHistoryChannelIds = [");
                return ho8.a(sb, j5g.g0((ArrayList) obj, null, null, null, 0, null, 63), ']');
            case 8:
                return ((wgb) obj2).s + ": loadNextFromCache: load from cache since=" + ((aeb) obj);
            case 9:
                int i4 = ClipsFavoriteFolderContentListFragment.W;
                xn50.a.c((ClipsFavoriteFolderContentListFragment) obj2, ((ClipsFavoriteFolderContentListViewState.f) obj).d);
                return s3q0.a;
            case 10:
                ((y1h) obj2).i.invoke(((y1h.a) obj).itemView, CommunityActionTags.LEAVE);
                return s3q0.a;
            case 11:
                ((d3h) obj2).f((View) obj, CommunityActionTags.JOIN_UNSURE);
                return s3q0.a;
            case 12:
                p9k p9kVar = (p9k) obj2;
                io.reactivex.rxjava3.internal.operators.single.c C = p9kVar.a.C(p9kVar, new r62((Uri) obj));
                io.reactivex.rxjava3.internal.operators.single.r rVar = new io.reactivex.rxjava3.internal.operators.single.r(C, new w7(new uf1(18, p9kVar, C), i2));
                int i5 = 16;
                p9kVar.d.b(new io.reactivex.rxjava3.internal.operators.single.r(rVar, new y7(new o43(i5, p9kVar, rVar), 13)).q(asu0.a.c()).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new f60(new e15(p9kVar, 6), 19), new tf1(new g15(p9kVar, 6), i5)));
                return s3q0.a;
            case 13:
                hgm hgmVar = (hgm) obj2;
                ViewGroup viewGroup = (ViewGroup) obj;
                ImVkCounter imVkCounter = new ImVkCounter(hgmVar.d, 0);
                imVkCounter.setId(R.id.dialog_item_extra_icon);
                imVkCounter.setImageScaleType(ImageView.ScaleType.CENTER_INSIDE);
                imVkCounter.setRenderMode(ImVkCounter.DrawMode.IMAGE);
                imVkCounter.setSize(VkCounter.Size.Medium);
                imVkCounter.setContentDescription(null);
                egm.b bVar = hgmVar.m;
                imVkCounter.setLayoutParams(egm.W(hgmVar, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).g, (bVar != null ? bVar : null).h, 0, 0, 0, 56));
                viewGroup.addView(imVkCounter);
                return imVkCounter;
            case 14:
                FriendItem friendItem = (FriendItem) obj2;
                dis.a aVar2 = ((dis.b) obj).l;
                FriendItem.CallStatus callStatus = friendItem.e;
                Peer.Member member = friendItem.b;
                int i6 = dis.b.a.$EnumSwitchMapping$0[callStatus.ordinal()];
                if (i6 == 1 || i6 == 2) {
                    aVar2.f(member);
                } else {
                    if (i6 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar2.i(member);
                }
                return s3q0.a;
            case 15:
                ((izs) obj2).invoke(new o9t.m(ydt.b((xdt) obj)));
                return s3q0.a;
            case 16:
                izs izsVar = (izs) obj;
                if (((pju) obj2).t) {
                    izsVar.invoke(new hjl0.a.r(false));
                } else {
                    izsVar.invoke(hjl0.a.q.b);
                }
                return s3q0.a;
            case 17:
                k8z k8zVar = (k8z) obj2;
                hgs0 hgs0Var = (hgs0) obj;
                if (com.vk.libvideo.api.minimizable.a.j(k8zVar.c())) {
                    etn doc2DocConfig = hgs0Var.getDoc2DocConfig();
                    VideoFile videoFile = hgs0Var.getVideoFile();
                    if (!doc2DocConfig.g(videoFile != null ? Boolean.valueOf(videoFile.T1()) : null) || !(k8zVar.c() instanceof VideoMinimizableState.FullscreenHorizontal)) {
                        etn doc2DocConfig2 = hgs0Var.getDoc2DocConfig();
                        VideoFile videoFile2 = hgs0Var.getVideoFile();
                        if (!doc2DocConfig2.h(videoFile2 != null ? Boolean.valueOf(videoFile2.T1()) : null) || !(k8zVar.c() instanceof VideoMinimizableState.FullscreenHorizontal)) {
                            etn doc2DocConfig3 = hgs0Var.getDoc2DocConfig();
                            VideoFile videoFile3 = hgs0Var.getVideoFile();
                            if (!doc2DocConfig3.k(videoFile3 != null ? Boolean.valueOf(videoFile3.T1()) : null) || !com.vk.libvideo.api.minimizable.a.k(k8zVar.c())) {
                                z = false;
                            }
                        }
                    }
                }
                return Boolean.valueOf(z);
            case 18:
                jn60 jn60Var = (jn60) obj2;
                b2c0 b2c0Var = new b2c0((Lazy<? extends g3f0>) jn60Var.a, (h170) jn60Var.h.getValue());
                y1c0 y1c0Var = b2c0Var.p;
                y1c0Var.R = (mbs) obj;
                y1c0Var.P = new in60(jn60Var, i3);
                y1c0Var.O = jn60Var.g;
                y1c0Var.Q = new w4u(jn60Var, 24);
                return b2c0Var;
            case 19:
                return ((s290) ((rn90) obj2).s.getValue()).a(((VideoFile) obj).w2());
            case 20:
                Tag tag = (Tag) obj;
                tbq tbqVar = ((fea0) obj2).j;
                if (tbqVar != null) {
                    tbqVar.invoke(tag);
                }
                return s3q0.a;
            case 21:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_pinned_msg_time_this_year), ((roa0) obj).f);
            case 22:
                Context context = (Context) obj;
                int i7 = PlaylistPlayerVideoView.A;
                ViewParent parent = ((PlaylistPlayerVideoView) obj2).getParent();
                if (!(parent instanceof ViewGroup) || !fxc0.B().i().f()) {
                    return null;
                }
                VideoDebugInfoView videoDebugInfoView = new VideoDebugInfoView(context, null, 0, 14, 0);
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                videoDebugInfoView.setId(View.generateViewId());
                ((ViewGroup) parent).addView(videoDebugInfoView, -2, -2);
                return videoDebugInfoView;
            case 23:
                ((gzs) obj2).invoke();
                ((SkeletonScreenContent) obj).c.d();
                return s3q0.a;
            case 24:
                myc0.h((yvj) obj2, null, CoroutineStart.UNDISPATCHED, new oho0((SuspendLambda) obj, null), 1);
                return s3q0.a;
            case 25:
                ((qvm0) obj2).invoke((f3u0.a) obj);
                return s3q0.a;
            case 26:
                i1s0 i1s0Var = (i1s0) obj2;
                ContextWrapper contextWrapper = (ContextWrapper) obj;
                SparseBooleanArray sparseBooleanArray = i1s0Var.i;
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                List<i1s0.b> y0 = i1s0Var.h.y0();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = ((ArrayList) y0).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    i1s0.b bVar2 = (i1s0.b) next;
                    if (bVar2.e != sparseBooleanArray.get(bVar2.a)) {
                        arrayList3.add(next);
                    }
                }
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    int i8 = ((i1s0.b) it2.next()).a;
                    boolean z2 = sparseBooleanArray.get(i8);
                    Integer valueOf = Integer.valueOf(i8);
                    if (z2) {
                        arrayList2.add(valueOf);
                    } else {
                        arrayList.add(valueOf);
                    }
                }
                if (!arrayList.isEmpty() || !arrayList2.isEmpty()) {
                    UserId userId = i1s0Var.b;
                    VideoFile videoFile4 = i1s0Var.c;
                    io.reactivex.rxjava3.core.q.I0(!arrayList.isEmpty() ? rsg0.y0(yfb.x(tft0.B(new uft0(), videoFile4.I0(), videoFile4.o0(), userId, arrayList, null, i1s0Var.e, videoFile4.r(), 232)), null, null, 3) : io.reactivex.rxjava3.core.q.T(EmptyList.b), !arrayList2.isEmpty() ? rsg0.y0(yfb.x(new uft0().z(videoFile4.I0(), videoFile4.o0(), userId, arrayList2)), null, null, 3) : io.reactivex.rxjava3.core.q.T(EmptyList.b), new x310(new cf3(5), i2)).subscribe(new j1s0(contextWrapper, i1s0Var, arrayList, arrayList2));
                }
                return s3q0.a;
            case 27:
                ((izs) obj2).invoke(new wqs0.l.e((BlockId.CompositeId) obj));
                return s3q0.a;
            case 28:
                ((izs) obj2).invoke(new qtt0.b(((rtt0) obj).b));
                return s3q0.a;
            default:
                ((izs) obj2).invoke(((FriendsAndFollowersBlockData) obj).d);
                return s3q0.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ sk(yvj yvjVar, izs izsVar) {
        this.b = 24;
        this.c = yvjVar;
        this.d = (SuspendLambda) izsVar;
    }
}
