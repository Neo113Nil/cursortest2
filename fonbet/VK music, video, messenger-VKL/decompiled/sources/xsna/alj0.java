package xsna;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.auth.ui.consent.VkConsentView;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.design.demo.presentation.screens.SkeletonScreenContent;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.model.StoryQuestionEntry;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.libvideo.design.view.fullscreen.VideoFullscreenBottomBarView;
import com.vk.newsfeed.impl.requests.WallWithCounters;
import com.vk.profile.user.impl.ui.f;
import com.vk.stickers.details.holders.PackStylesListHolder;
import com.vk.stories.design.view.viewer.StoryBottomViewGroup;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import one.video.cast.model.VideoType;
import xsna.atq0;
import xsna.fh8;
import xsna.kng;
import xsna.tj50;
import xsna.uam0;
import xsna.val0;
import xsna.zhr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class alj0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ alj0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v29, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 12;
        int i3 = 4;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((clj0) obj2).e.invoke(new fh8.f(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 1:
                ((zak0) ((SkeletonScreenContent) obj2).f).setValue((SkeletonScreenContent.ImplementationType) obj);
                return s3q0.a;
            case 2:
                ikv0 ikv0Var = (ikv0) obj;
                gzs<s3q0> gzsVar = ((j7k0) obj2).e;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                ikv0Var.a();
                return s3q0.a;
            case 3:
                return new sek0(((uek0) obj2).c(), ((Integer) obj).intValue());
            case 4:
                zvk0 zvk0Var = (zvk0) obj2;
                Activity L = blk.L(zvk0Var.c);
                if (L == null) {
                    return s3q0.a;
                }
                zvk0Var.a.a(L, new jaa0(zvk0Var, 15));
                return s3q0.a;
            case 5:
                return new PackStylesListHolder(((e7l0) obj2).i, (ViewGroup) obj, true);
            case 6:
                ((StoryBottomViewGroup) obj2).G = (List) obj;
                return s3q0.a;
            case 7:
                b6f0 b6f0Var = ((uam0.a) obj2).j;
                if (b6f0Var != null) {
                    b6f0Var.invoke();
                }
                return s3q0.a;
            case 8:
                com.vk.stories.design.view.stats.tabs.stickers.mvi.k kVar = (com.vk.stories.design.view.stats.tabs.stickers.mvi.k) obj2;
                StoryQuestionEntry storyQuestionEntry = (StoryQuestionEntry) obj;
                boolean z = kVar.e;
                Set<StoryQuestionEntry> set = kVar.f;
                return new val0(storyQuestionEntry, (z && set.contains(storyQuestionEntry)) ? new val0.a.C3878a(true) : (!kVar.e || set.contains(storyQuestionEntry)) ? val0.a.b.a : new val0.a.C3878a(false));
            case 9:
                com.vk.metrics.eventtracking.b.a.a((Throwable) obj);
                ((q5n0) obj2).c.setVisibility(4);
                return s3q0.a;
            case 10:
                Object obj3 = ((wpp) obj).c.get(Long.valueOf(((Peer) obj2).b));
                if (obj3 != null) {
                    return (Dialog) obj3;
                }
                throw new IllegalArgumentException("Required value was null.");
            case 11:
                return ((qyo0) obj2).a((List) obj);
            case 12:
                Throwable th = (Throwable) obj;
                fpq0 fpq0Var = ((rlq0) obj2).k;
                (fpq0Var != null ? fpq0Var : null).B(new f.h(new atq0.b(th)));
                return s3q0.a;
            case 13:
                zvq0 zvq0Var = (zvq0) obj2;
                WallWithCounters wallWithCounters = (WallWithCounters) obj;
                es60 es60Var = zvq0Var.f;
                return odq.c(es60Var.a, new xc3(wallWithCounters, null, es60Var.b, zvq0Var.g, null, false, null)).l(new o860(new fda0(wallWithCounters, 18), i2));
            case 14:
                g8r0 g8r0Var = ((j8r0) obj2).a;
                hja hjaVar = g8r0Var.g;
                ArrayList arrayList = hjaVar.d;
                arrayList.clear();
                arrayList.addAll((List) obj);
                hjaVar.notifyDataSetChanged();
                VkTopBar vkTopBar = g8r0Var.d;
                awt0.q(vkTopBar != null ? vkTopBar : null);
                return s3q0.a;
            case 15:
                VideoUrl videoUrl = (VideoUrl) obj;
                String Ab = ((VideoFile) obj2).w9().Ab(videoUrl);
                int m = videoUrl.m();
                VideoType videoType = m != -4 ? m != -2 ? (m == 144 || m == 240 || m == 360 || m == 480 || m == 720 || m == 1080 || m == 1440 || m == 2160) ? VideoType.MP4 : null : VideoType.HLS : VideoType.DASH;
                if (videoType == null || Ab == null) {
                    return null;
                }
                return new zhr0.a(Ab, videoType);
            case 16:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ki4) obj2).invoke(bool);
                return s3q0.a;
            case 17:
                ((ppr0) obj2).k.U4((iz8) obj);
                return s3q0.a;
            case 18:
                ((jsr0) obj2).l.j((String) obj);
                return s3q0.a;
            case 19:
                gcs0 gcs0Var = (gcs0) obj2;
                kng.a aVar = (kng.a) obj;
                if (aVar instanceof kng.a.C3190a) {
                    gcs0Var.M7(((kng.a.C3190a) aVar).a);
                } else if (aVar instanceof kng.a.b) {
                    gcs0Var.N7(((kng.a.b) aVar).a);
                } else {
                    if (!(aVar instanceof kng.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gcs0Var.O7(((kng.a.c) aVar).a);
                }
                return s3q0.a;
            case 20:
                View view = (View) obj;
                rwo0 rwo0Var = ((VideoEditTimelineView) obj2).F;
                if (rwo0Var != null) {
                    rwo0Var.x(view);
                }
                return s3q0.a;
            case 21:
                int i4 = VideoEpisodesFragment.V;
                ((isp) ((VideoEpisodesFragment) obj2).T.getValue()).setItems((List) obj);
                return s3q0.a;
            case 22:
                com.vk.fullscreenvideo.a aVar2 = (com.vk.fullscreenvideo.a) obj;
                izs<? super com.vk.fullscreenvideo.a, s3q0> izsVar = ((VideoFullscreenBottomBarView) obj2).c;
                if (izsVar != null) {
                    izsVar.invoke(aVar2);
                }
                return s3q0.a;
            case 23:
                com.vk.video.ui.discovery.minimizable.p pVar = (com.vk.video.ui.discovery.minimizable.p) obj2;
                tj50.a aVar3 = (tj50.a) obj;
                int i5 = 6;
                int i6 = 7;
                h0u0 c = tj50.a.c(aVar3, new xep0(i3), new udk0(i5), new g2h0(9), new gbi(i6));
                int i7 = 23;
                int i8 = 16;
                h0u0 b = tj50.a.b(aVar3, new wo40(i7), new acc0(i8));
                h0u0 b2 = tj50.a.b(aVar3, new t810(i7), new m0m0(8));
                kws0 kws0Var = kws0.b;
                ao8 ao8Var = ao8.d;
                return new s.a(aVar3.a(dws0.b, ao8Var), c, b, b2, aVar3.a(ews0.b, ao8Var), aVar3.a(kws0Var, ao8Var), tj50.a.d(aVar3, new j6e0(19), new t9o0(5), new ncb(pVar, i8)), aVar3.a(fws0.b, ao8Var), tj50.a.b(aVar3, new awm0(i6), new d7l0(i2)), aVar3.a(gws0.b, ao8Var), tj50.a.b(aVar3, new d220(27), new yml0(pVar)), aVar3.a(com.vk.video.ui.discovery.minimizable.o.b, ao8Var), aVar3.a(hws0.b, ao8Var), aVar3.a(iws0.b, ao8Var), tj50.a.c(aVar3, new n0m0(11), new p6e0(17), new c220(26), new b86(pVar, 2)), tj50.a.d(aVar3, new tdk0(i5), new av70(23), new oa5(pVar, 14)), aVar3.a(jws0.b, ao8Var));
            case 24:
                ozs0 ozs0Var = (ozs0) obj2;
                ArrayList arrayList2 = ozs0Var.e;
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    pu90 pu90Var = (pu90) it.next();
                    ozs0Var.N(pu90Var.a, pu90Var.b);
                }
                arrayList2.clear();
                return s3q0.a;
            case 25:
                a3t0 a3t0Var = (a3t0) obj2;
                VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
                List<VideoVideoFullDto> e = videoGetResponseDto.e();
                ArrayList arrayList3 = new ArrayList(c5g.u(e, 10));
                Iterator<T> it2 = e.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(ums0.d(a3t0Var.c, (VideoVideoFullDto) it2.next(), null, null, null, 30));
                }
                VKList vKList = new VKList(arrayList3);
                vKList.o(videoGetResponseDto.getCount());
                return vKList;
            case 26:
                ((vkt0) obj2).invoke();
                return s3q0.a;
            case 27:
                tx txVar = ((VkAuthPhoneView) obj2).i;
                if (txVar != null) {
                    txVar.invoke();
                }
                return s3q0.a;
            case 28:
                ((ihu0) obj2).i = true;
                return s3q0.a;
            default:
                ((VkConsentView) obj2).j.c((com.vk.auth.ui.consent.c) obj);
                return s3q0.a;
        }
    }
}
