package xsna;

import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.vk.api.generated.video.dto.VideoGetResponseDto;
import com.vk.api.generated.video.dto.VideoVideoFullDto;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.catalog2.common.ui.holders.sticker.StickerHidingToolbarVh;
import com.vk.clips.design.view.timeline.VideoEditTimelineView;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.data.VKList;
import com.vk.dto.stories.entities.stat.StoryBackgroundType;
import com.vk.dto.stories.model.StoriesContainer;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.dto.stories.model.StoryViewAction;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.story.api.storyflexboxfactory.StickerButtonType;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import xsna.asl0;
import xsna.ghw0;
import xsna.i1s0;
import xsna.n2l0;
import xsna.uxd0;
import xsna.v6i0;
import xsna.y6i0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class r6i0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r6i0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Integer num;
        yg5 yg5Var;
        int i = this.b;
        boolean z = true;
        char c = 1;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((s6i0) obj2).n(new y6i0.b(v6i0.a.a));
                return s3q0.a;
            case 1:
                cfk0 cfk0Var = (cfk0) obj2;
                dfk0 dfk0Var = cfk0Var.o;
                bp7 bp7Var = cfk0Var.p;
                if (dfk0Var != null && bp7Var != null) {
                    bp7Var.invoke(dfk0Var);
                }
                return s3q0.a;
            case 2:
                uei0 uei0Var = (uei0) obj2;
                switch (n2l0.a.C3382a.$EnumSwitchMapping$0[((StickerButtonType) obj).ordinal()]) {
                    case 1:
                        uei0Var.b();
                        break;
                    case 2:
                        uei0Var.a();
                        break;
                    case 3:
                        uei0Var.p();
                        break;
                    case 4:
                        uei0Var.k();
                        break;
                    case 5:
                        uei0Var.f();
                        break;
                    case 6:
                        uei0Var.i();
                        break;
                    case 7:
                        uei0Var.j();
                        break;
                    case 8:
                        uei0Var.c();
                        break;
                    case 9:
                        uei0Var.h();
                        break;
                    case 10:
                        uei0Var.e();
                        break;
                    case 11:
                        uei0Var.o();
                        break;
                    default:
                        throw new IllegalStateException("Unsupported StickerButtonType");
                }
                return s3q0.a;
            case 3:
                ((StickerHidingToolbarVh) obj2).b(false, true);
                return s3q0.a;
            case 4:
                return new am2(((e7l0) obj2).i, (ViewGroup) obj);
            case 5:
                sbl0 sbl0Var = (sbl0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    sbl0Var.f.a(sbl0Var.d.b);
                    sbl0Var.d(StoryViewAction.QUESTION_DELETE);
                } else {
                    sbl0Var.b();
                }
                return s3q0.a;
            case 6:
                com.vk.camera.editor.stories.impl.background.b bVar = (com.vk.camera.editor.stories.impl.background.b) obj2;
                StoryBackground storyBackground = (StoryBackground) obj;
                Map<StoryBackgroundType, List<qyl0>> map = bVar.h.a;
                StoryBackgroundType storyBackgroundType = StoryBackgroundType.GRAPHICS;
                List<qyl0> list = map.get(storyBackgroundType);
                if (list == null) {
                    list = EmptyList.b;
                }
                if (!list.isEmpty()) {
                    Map<StoryBackgroundType, List<qyl0>> map2 = bVar.h.a;
                    List<qyl0> list2 = list;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (qyl0 qyl0Var : list2) {
                        if (epx.f(qyl0Var.a.c, storyBackground.c)) {
                            qyl0Var = new qyl0(storyBackground, bVar.h.g);
                        }
                        arrayList.add(qyl0Var);
                    }
                    map2.put(storyBackgroundType, arrayList);
                    bVar.f0(null);
                }
                return s3q0.a;
            case 7:
                com.vk.superapp.ui.a aVar = (com.vk.superapp.ui.a) obj2;
                FragmentActivity activity = aVar.b.getActivity();
                if (activity != null) {
                    aVar.g.b(activity, new whi0(6, aVar, activity));
                    aVar.f.b(activity, new k82(25, aVar, activity));
                }
                return s3q0.a;
            case 8:
                return new rb0((wlp0) obj2, c == true ? 1 : 0);
            case 9:
                tgi0 tgi0Var = (tgi0) obj;
                if (((Boolean) ((mtk0) obj2).getValue()).booleanValue()) {
                    qgi0.a(tgi0Var);
                }
                return s3q0.a;
            case 10:
                nnq0 nnq0Var = (nnq0) obj2;
                asl0 asl0Var = (asl0) obj;
                if (asl0Var instanceof asl0.c) {
                    List<StoriesContainer> list3 = ((asl0.c) asl0Var).a;
                    if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                        Iterator<T> it = list3.iterator();
                        while (it.hasNext()) {
                            if (epx.f(((StoriesContainer) it.next()).Ab(), nnq0Var.c.a())) {
                                return Boolean.valueOf(z);
                            }
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 11:
                ((ioq0) obj2).k(new uxd0.w((Throwable) obj));
                return s3q0.a;
            case 12:
                ((lsq0) obj2).t();
                return s3q0.a;
            case 13:
                int i2 = UxPollsModalFragment.f0;
                ((UxPollsModalFragment) obj2).b(false);
                return s3q0.a;
            case 14:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ((ki4) obj2).invoke(bool);
                return s3q0.a;
            case 15:
                i1s0 i1s0Var = (i1s0) obj2;
                ewr0 ewr0Var = (ewr0) obj;
                HashSet<Integer> hashSet = i1s0Var.j;
                com.vk.lists.c cVar = i1s0Var.l;
                hashSet.clear();
                i1s0.a aVar2 = i1s0Var.h;
                Iterator it2 = ((ArrayList) aVar2.y0()).iterator();
                while (it2.hasNext()) {
                    i1s0.b bVar2 = (i1s0.b) it2.next();
                    boolean z2 = bVar2.e;
                    int i3 = bVar2.a;
                    if (z2 && ((num = i1s0Var.n) == null || i3 != num.intValue())) {
                        hashSet.add(Integer.valueOf(i3));
                    }
                }
                i1s0Var.n = Integer.valueOf(ewr0Var.a.b);
                aVar2.clear();
                cVar.p(false);
                i1s0Var.ui(0, cVar);
                return s3q0.a;
            case 16:
                VideoCatalogFragment videoCatalogFragment = (VideoCatalogFragment) obj2;
                long longValue = ((Long) obj).longValue();
                int i4 = VideoCatalogFragment.l0;
                Context mo2getContext = videoCatalogFragment.mo2getContext();
                if (mo2getContext != null) {
                    ((SearchUiComponent) m7m.d(videoCatalogFragment).a(fpf0.a(SearchUiComponent.class))).G9(mo2getContext, new SearchUiComponent.a.InterfaceC1776a.b(longValue));
                }
                return s3q0.a;
            case 17:
                rwo0 rwo0Var = ((VideoEditTimelineView) obj2).F;
                if (rwo0Var != null) {
                    rwo0Var.p();
                }
                return s3q0.a;
            case 18:
                return VideoEpisodesFragment.fo((VideoEpisodesFragment) obj2, (atp) obj);
            case 19:
                z2t0 z2t0Var = (z2t0) obj2;
                VideoGetResponseDto videoGetResponseDto = (VideoGetResponseDto) obj;
                List<VideoVideoFullDto> e = videoGetResponseDto.e();
                ArrayList arrayList2 = new ArrayList(c5g.u(e, 10));
                Iterator<T> it3 = e.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(ums0.d(z2t0Var.c, (VideoVideoFullDto) it3.next(), null, null, null, 30));
                }
                VKList vKList = new VKList(arrayList2);
                vKList.o(videoGetResponseDto.getCount());
                return vKList;
            case 20:
                return VideoSkippablePartView.g((VideoSkippablePartView) obj2);
            case 21:
                VideoView videoView = (VideoView) obj2;
                VideoFile videoFile = videoView.C;
                if (videoFile != null) {
                    bwt0.a(videoView.getViewBinding().l, fxc0.B().c(videoFile) && (yg5Var = videoView.I) != null && yg5Var.B(), true, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    videoView.F0(true, null);
                    videoView.N(videoFile);
                }
                return s3q0.a;
            case 22:
                return Boolean.valueOf(!((VkAuthPhoneView) obj2).o);
            case 23:
                ((ihu0) obj2).d.m(false);
                return s3q0.a;
            case 24:
                ((l5v0) obj2).c();
                return s3q0.a;
            case 25:
                lcv0 lcv0Var = (lcv0) obj2;
                lcv0Var.getSearchParams().reset();
                lcv0Var.a(lcv0Var.b);
                return s3q0.a;
            case 26:
                return ((VkTopBar.g) obj2).c.a;
            case 27:
                ((lcw0) obj2).f();
                return s3q0.a;
            case 28:
                ((ihw0) obj2).a(ghw0.k.b.a);
                return s3q0.a;
            default:
                ((mjw0) obj2).findViewById(R.id.bounds_debug_view).setVisibility(((Boolean) obj).booleanValue() ? 0 : 8);
                return s3q0.a;
        }
    }
}
