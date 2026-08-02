package com.vkontakte.android.task.di.components;

import android.os.Bundle;
import com.vk.core.serialize.Serializer;
import com.vk.di.component.DiScopedComponent;
import com.vk.dto.common.VideoFile;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.libvideo.api.di.VideoMinimizablePlayerComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.models.comment.ReplyInfo;
import com.vk.newsfeed.impl.fragments.video.thread.VideoCommentsThreadInPlayerFragment;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.video.ui.discovery.minimizable.dialog.about.VideoAboutFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import io.reactivex.rxjava3.subjects.d;
import java.util.Optional;
import kotlin.Pair;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.ab3;
import xsna.bem0;
import xsna.bpn0;
import xsna.c8m;
import xsna.cu2;
import xsna.ep;
import xsna.fp;
import xsna.fpf0;
import xsna.g8m;
import xsna.hfs0;
import xsna.hpf0;
import xsna.nwy;
import xsna.pwj0;
import xsna.qcy;
import xsna.vvs0;
import xsna.wa3;
import xsna.x0f;
import xsna.xa3;
import xsna.xts0;
import xsna.xxs0;
import xsna.y0f;
import xsna.yfb;

/* compiled from: SuperAppMinimizablePlayerComponentImpl.kt */
/* loaded from: classes11.dex */
public final class SuperAppMinimizablePlayerComponentImpl implements VideoMinimizablePlayerComponent {
    public static final /* synthetic */ qcy<Object>[] g;
    public final nwy a = new nwy(new wa3(13));
    public final nwy b = new nwy(new xa3(8));
    public final nwy c = new nwy(new x0f(7));
    public final nwy d = new nwy(new y0f(7));
    public final nwy e = new nwy(new cu2(9));
    public final nwy f = new nwy(new ab3(14));

    /* compiled from: SuperAppMinimizablePlayerComponentImpl.kt */
    /* loaded from: classes7.dex */
    public static final class a implements xts0 {
        public final bpn0 a = new bpn0(new bem0(2));

        @Override // xsna.xts0
        public final xts0.a a() {
            return new xts0.a(VideoAboutFragment.class);
        }

        @Override // xsna.xts0
        public final xts0.a b(VideoFile videoFile, String str, ReplyInfo replyInfo) {
            Bundle b = yfb.b(new Pair("show_comments_count", Boolean.TRUE));
            Serializer.c<Videos> cVar = Videos.CREATOR;
            b.putParcelable("entry", Videos.a.a(videoFile));
            b.putBoolean("arg_can_comment", videoFile.c0());
            b.putString("track_code", videoFile.r());
            if (replyInfo != null) {
                b.putInt("arg_start_comment_id", replyInfo.b);
                Integer num = replyInfo.c;
                if (num != null) {
                    b.putInt("arg_parent_comment_id", num.intValue());
                }
            }
            b.putBoolean("arg_is_order_info_disabled", false);
            b.putString("referrer", str);
            b.putBoolean("start_from_parent", true);
            b.putBoolean("show_writebar_attach", !((Boolean) this.a.getValue()).booleanValue());
            return new xts0.a(VideoCommentsTreeInPlayerFragment.class, b);
        }

        @Override // xsna.xts0
        public final xts0.a c() {
            return new xts0.a(VideoEpisodesFragment.class);
        }

        @Override // xsna.xts0
        public final xts0.a d(Bundle bundle) {
            return new xts0.a(VideoCommentsThreadInPlayerFragment.class, bundle);
        }

        @Override // xsna.xts0
        public final xts0.a e() {
            return new xts0.a(VideoRelatedVideosFragment.class);
        }
    }

    /* compiled from: SuperAppMinimizablePlayerComponentImpl.kt */
    public static final class b implements c8m<VideoMinimizablePlayerComponent, pwj0> {
        @Override // xsna.c8m
        public final DiScopedComponent a(g8m g8mVar, pwj0 pwj0Var) {
            return new SuperAppMinimizablePlayerComponentImpl();
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(SuperAppMinimizablePlayerComponentImpl.class, "minimizableState", "getMinimizableState()Lio/reactivex/rxjava3/subjects/BehaviorSubject;", 0);
        hpf0 hpf0Var = fpf0.a;
        g = new qcy[]{propertyReference1Impl, fp.c(0, SuperAppMinimizablePlayerComponentImpl.class, "navigationEvents", "getNavigationEvents()Lcom/vk/libvideo/api/minimizable/VideoNavigationEventsSubject;", hpf0Var), ep.a(0, SuperAppMinimizablePlayerComponentImpl.class, "lastArgsRepository", "getLastArgsRepository()Lcom/vk/libvideo/api/minimizable/VideoMinimizableDiscoveryLastArgsRepository;", hpf0Var), ep.a(0, SuperAppMinimizablePlayerComponentImpl.class, "actionsTracker", "getActionsTracker()Lcom/vk/libvideo/api/minimizable/VideoDiscoveryActionsTracker;", hpf0Var), ep.a(0, SuperAppMinimizablePlayerComponentImpl.class, "dialogsFactory", "getDialogsFactory()Lcom/vk/libvideo/api/minimizable/dialogs/VideoMinimizableDialogsFactory;", hpf0Var), ep.a(0, SuperAppMinimizablePlayerComponentImpl.class, "currentVideoFile", "getCurrentVideoFile()Lio/reactivex/rxjava3/subjects/BehaviorSubject;", hpf0Var)};
    }

    @Override // com.vk.libvideo.api.di.VideoMinimizablePlayerComponent
    public final xts0 E8() {
        qcy<Object> qcyVar = g[4];
        return (xts0) this.e.c();
    }

    @Override // com.vk.libvideo.api.di.VideoMinimizablePlayerComponent
    public final hfs0 P7() {
        qcy<Object> qcyVar = g[3];
        return (hfs0) this.d.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VideoMinimizablePlayerComponent
    public final d<Optional<VideoFile>> Ua() {
        qcy<Object> qcyVar = g[5];
        return (d) this.f.c();
    }

    @Override // com.vk.libvideo.api.di.VideoMinimizablePlayerComponent
    public final vvs0 Y3() {
        qcy<Object> qcyVar = g[2];
        return (vvs0) this.c.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.vk.libvideo.api.di.VideoMinimizablePlayerComponent
    public final d<VideoMinimizableState> b3() {
        qcy<Object> qcyVar = g[0];
        return (d) this.a.c();
    }

    @Override // com.vk.libvideo.api.di.VideoMinimizablePlayerComponent
    public final xxs0 zb() {
        qcy<Object> qcyVar = g[1];
        return (xxs0) this.b.c();
    }
}
