package xsna;

import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoSimilarVideosTitleRedesignDelegate;
import com.vk.libvideo.bottomsheet.about.delegate.x;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.builders.ListBuilder;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: VideoMinimizableDiscoveryFragment.kt */
@b6l(c = "com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment$prefetchItems$1", f = "VideoMinimizableDiscoveryFragment.kt", l = {2196}, m = "invokeSuspend")
/* loaded from: classes7.dex */
public final class qvs0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    int label;
    final /* synthetic */ VideoMinimizableDiscoveryFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qvs0(VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment, spj<? super qvs0> spjVar) {
        super(2, spjVar);
        this.this$0 = videoMinimizableDiscoveryFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new qvs0(this.this$0, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((qvs0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0189 A[EDGE_INSN: B:46:0x0189->B:47:0x0189 BREAK  A[LOOP:0: B:39:0x015f->B:45:0x0185], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0198 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Class cls;
        int i2;
        int i3;
        VideoFeatures videoFeatures;
        ArrayList arrayList;
        ListIterator listIterator;
        ListBuilder.a aVar;
        s3q0 p0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i4 = this.label;
        if (i4 == 0) {
            kotlin.a.a(obj);
            VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = this.this$0;
            int i5 = VideoMinimizableDiscoveryFragment.p1;
            igs0 igs0Var = (igs0) videoMinimizableDiscoveryFragment.X0.getValue();
            dhr0.a.getClass();
            dhr0.s();
            this.label = 1;
            igs0Var.getClass();
            ListBuilder e = e43.e();
            e.add(new axc0(R.layout.video_about_similar_videos_skeleton, fpf0.a(com.vk.libvideo.bottomsheet.about.delegate.y.class), 1));
            e.add(new axc0(R.layout.video_about_video_big_skeleton, fpf0.a(com.vk.libvideo.bottomsheet.about.delegate.y.class), 5));
            VideoFeatures videoFeatures2 = VideoFeatures.NEW_FULLSCREEN_REDESIGN_DISCOVERY;
            videoFeatures2.getClass();
            com.vk.toggle.b bVar = com.vk.toggle.b.A;
            if (bVar.a(videoFeatures2)) {
                VideoFeatures videoFeatures3 = VideoFeatures.ABOUT_VIDEO_REDESIGN;
                videoFeatures3.getClass();
                if (bVar.a(videoFeatures3)) {
                    i = R.layout.video_about_description;
                    if (bVar.a(videoFeatures2)) {
                        VideoFeatures videoFeatures4 = VideoFeatures.ABOUT_VIDEO_REDESIGN;
                        videoFeatures4.getClass();
                        if (bVar.a(videoFeatures4)) {
                            cls = com.vk.libvideo.bottomsheet.about.delegate.f.class;
                            e.add(new axc0(i, fpf0.a(cls), 1));
                            e.add(new axc0(R.layout.video_about_author, fpf0.a(w4.class), 1));
                            e.add(new axc0(bVar.a(videoFeatures2) ? R.layout.video_controls_bar_item : R.layout.video_controls_bar, fpf0.a(bVar.a(videoFeatures2) ? pds0.class : qds0.class), 1));
                            i2 = com.vk.libvideo.bottomsheet.about.delegate.c0.$EnumSwitchMapping$0[AboutVideoSimilarVideosTitleRedesignDelegate.Type.Default.ordinal()];
                            if (i2 == 1) {
                                i3 = R.layout.video_about_similar_videos_title_redesign;
                            } else if (i2 == 2) {
                                i3 = R.layout.video_about_similar_videos_title_redesign_tablet;
                            } else {
                                if (i2 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                i3 = R.layout.video_about_similar_videos_title_redesign_tablet_landscape;
                            }
                            e.add(new axc0(i3, fpf0.a(AboutVideoSimilarVideosTitleRedesignDelegate.class), 1));
                            videoFeatures = VideoFeatures.DISCOVERY_VIDEO_CARD_REDESIGN;
                            videoFeatures.getClass();
                            if (!bVar.a(videoFeatures)) {
                                int i6 = x.b.A;
                                e.add(new axc0(R.layout.video_about_similar_big_video_redesign, fpf0.a(com.vk.libvideo.bottomsheet.about.delegate.y.class), 10));
                            }
                            e.add(new axc0(R.layout.ad_overlay_banner, fpf0.a(tg0.class), 1));
                            e.add(new axc0(R.layout.video_ad_banner, fpf0.a(cd0.class), 1));
                            e.add(new axc0(R.layout.ad_redirect_view, fpf0.a(com.vk.libvideo.bottomsheet.about.delegate.b.class), 1));
                            ListBuilder g = e.g();
                            arrayList = new ArrayList();
                            listIterator = g.listIterator(0);
                            while (true) {
                                aVar = (ListBuilder.a) listIterator;
                                if (!aVar.hasNext()) {
                                    break;
                                }
                                axc0 axc0Var = (axc0) aVar.next();
                                int i7 = axc0Var.c;
                                ArrayList arrayList2 = new ArrayList(i7);
                                for (int i8 = 0; i8 < i7; i8++) {
                                    arrayList2.add(new Integer(axc0Var.a));
                                }
                                g5g.y(arrayList2, arrayList);
                            }
                            p0 = igs0Var.a.p0();
                            if (p0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                                p0 = s3q0.a;
                            }
                            if (p0 == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    cls = com.vk.libvideo.bottomsheet.about.delegate.g.class;
                    e.add(new axc0(i, fpf0.a(cls), 1));
                    e.add(new axc0(R.layout.video_about_author, fpf0.a(w4.class), 1));
                    e.add(new axc0(bVar.a(videoFeatures2) ? R.layout.video_controls_bar_item : R.layout.video_controls_bar, fpf0.a(bVar.a(videoFeatures2) ? pds0.class : qds0.class), 1));
                    i2 = com.vk.libvideo.bottomsheet.about.delegate.c0.$EnumSwitchMapping$0[AboutVideoSimilarVideosTitleRedesignDelegate.Type.Default.ordinal()];
                    if (i2 == 1) {
                    }
                    e.add(new axc0(i3, fpf0.a(AboutVideoSimilarVideosTitleRedesignDelegate.class), 1));
                    videoFeatures = VideoFeatures.DISCOVERY_VIDEO_CARD_REDESIGN;
                    videoFeatures.getClass();
                    if (!bVar.a(videoFeatures)) {
                    }
                    e.add(new axc0(R.layout.ad_overlay_banner, fpf0.a(tg0.class), 1));
                    e.add(new axc0(R.layout.video_ad_banner, fpf0.a(cd0.class), 1));
                    e.add(new axc0(R.layout.ad_redirect_view, fpf0.a(com.vk.libvideo.bottomsheet.about.delegate.b.class), 1));
                    ListBuilder g2 = e.g();
                    arrayList = new ArrayList();
                    listIterator = g2.listIterator(0);
                    while (true) {
                        aVar = (ListBuilder.a) listIterator;
                        if (!aVar.hasNext()) {
                        }
                        g5g.y(arrayList2, arrayList);
                    }
                    p0 = igs0Var.a.p0();
                    if (p0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
                    }
                    if (p0 == coroutineSingletons) {
                    }
                }
            }
            i = R.layout.video_about_description_redesign;
            if (bVar.a(videoFeatures2)) {
            }
            cls = com.vk.libvideo.bottomsheet.about.delegate.g.class;
            e.add(new axc0(i, fpf0.a(cls), 1));
            e.add(new axc0(R.layout.video_about_author, fpf0.a(w4.class), 1));
            e.add(new axc0(bVar.a(videoFeatures2) ? R.layout.video_controls_bar_item : R.layout.video_controls_bar, fpf0.a(bVar.a(videoFeatures2) ? pds0.class : qds0.class), 1));
            i2 = com.vk.libvideo.bottomsheet.about.delegate.c0.$EnumSwitchMapping$0[AboutVideoSimilarVideosTitleRedesignDelegate.Type.Default.ordinal()];
            if (i2 == 1) {
            }
            e.add(new axc0(i3, fpf0.a(AboutVideoSimilarVideosTitleRedesignDelegate.class), 1));
            videoFeatures = VideoFeatures.DISCOVERY_VIDEO_CARD_REDESIGN;
            videoFeatures.getClass();
            if (!bVar.a(videoFeatures)) {
            }
            e.add(new axc0(R.layout.ad_overlay_banner, fpf0.a(tg0.class), 1));
            e.add(new axc0(R.layout.video_ad_banner, fpf0.a(cd0.class), 1));
            e.add(new axc0(R.layout.ad_redirect_view, fpf0.a(com.vk.libvideo.bottomsheet.about.delegate.b.class), 1));
            ListBuilder g22 = e.g();
            arrayList = new ArrayList();
            listIterator = g22.listIterator(0);
            while (true) {
                aVar = (ListBuilder.a) listIterator;
                if (!aVar.hasNext()) {
                }
                g5g.y(arrayList2, arrayList);
            }
            p0 = igs0Var.a.p0();
            if (p0 != CoroutineSingletons.COROUTINE_SUSPENDED) {
            }
            if (p0 == coroutineSingletons) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
