package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.video.VideoSeason;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.btt0;

/* compiled from: VideosQueueBackgroundManagerImpl.kt */
@b6l(c = "com.vk.libvideo.video.queue.impl.VideosQueueBackgroundManagerImpl$updateRelatedProvider$5", f = "VideosQueueBackgroundManagerImpl.kt", l = {183}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class htt0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ zst0 $videosQueue;
    int label;
    final /* synthetic */ btt0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public htt0(btt0 btt0Var, zst0 zst0Var, spj<? super htt0> spjVar) {
        super(2, spjVar);
        this.this$0 = btt0Var;
        this.$videosQueue = zst0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new htt0(this.this$0, this.$videosQueue, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((htt0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00de, code lost:
    
        if (r0 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0148, code lost:
    
        if (r1.a != r2.b) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0167, code lost:
    
        if (r0 == kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Throwable th;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        boolean z = true;
        if (i2 == 0) {
            kotlin.a.a(obj);
            btt0 btt0Var = this.this$0;
            VideoFile videoFile = btt0Var.a;
            d7s0 d7s0Var = new d7s0(3, this.$videosQueue, btt0Var);
            this.label = 1;
            ArrayList arrayList = btt0Var.g;
            w4t0 w4t0Var = btt0Var.e;
            if (w4t0Var != null && videoFile != null) {
                List<VideoSeason> list = w4t0Var.c;
                List<VideoSeason> list2 = list;
                Iterator<T> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it.next();
                    if (((VideoSeason) obj3).e) {
                        break;
                    }
                }
                Integer j = p4g.j((VideoSeason) obj3, list2);
                btt0.a aVar = (btt0.a) j5g.k0(arrayList);
                int i3 = 0;
                if (aVar != null) {
                    List<VideoFile> list3 = aVar.d;
                    Iterator<T> it2 = list3.iterator();
                    int i4 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            th = null;
                            i = -1;
                            break;
                        }
                        Object next = it2.next();
                        if (i4 < 0) {
                            e43.t();
                            throw null;
                        }
                        boolean z2 = z;
                        th = null;
                        if (epx.f(((VideoFile) next).r1(), videoFile.r1())) {
                            i = i4;
                            break;
                        }
                        i4++;
                        z = z2;
                    }
                    Integer valueOf = i == -1 ? th : Integer.valueOf(i);
                    if (valueOf != 0 && list3.size() - valueOf.intValue() < 5 && aVar.c + 20 < aVar.b) {
                        btt0.a aVar2 = (btt0.a) j5g.k0(arrayList);
                        if (aVar2 != null) {
                            obj2 = btt0Var.h(aVar2.a, w4t0Var.b, aVar2.c + 20, w4t0Var.e, d7s0Var, this);
                        }
                    }
                } else {
                    th = null;
                }
                btt0.a aVar3 = (btt0.a) j5g.k0(arrayList);
                if (aVar3 != null) {
                    List<VideoFile> list4 = aVar3.d;
                    Iterator<T> it3 = list4.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            i3 = -1;
                            break;
                        }
                        Object next2 = it3.next();
                        if (i3 < 0) {
                            e43.t();
                            throw th;
                        }
                        if (epx.f(((VideoFile) next2).r1(), videoFile.r1())) {
                            break;
                        }
                        i3++;
                    }
                    Integer valueOf2 = i3 == -1 ? th : Integer.valueOf(i3);
                    if (valueOf2 != 0) {
                        if (list4.size() - valueOf2.intValue() < 5) {
                            w4t0 w4t0Var2 = btt0Var.e;
                            if (w4t0Var2 != null) {
                                List<VideoSeason> list5 = w4t0Var2.c;
                                if (list5 != null) {
                                    VideoSeason videoSeason = (VideoSeason) j5g.k0(list5);
                                    if (videoSeason != null) {
                                    }
                                }
                            }
                            if (j != null) {
                                VideoSeason videoSeason2 = (VideoSeason) j5g.b0(j.intValue() + 1, list);
                                if (videoSeason2 != null) {
                                    obj2 = btt0Var.i(videoSeason2.b, w4t0Var.b, d7s0Var, this);
                                }
                            }
                        }
                    }
                }
            }
            obj2 = s3q0.a;
            if (obj2 == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
