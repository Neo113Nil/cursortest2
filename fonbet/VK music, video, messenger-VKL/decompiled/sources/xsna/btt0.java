package xsna;

import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.api.generated.video.dto.VideoGetFromAlbumResponseDto;
import com.vk.api.generated.video.dto.VideoGetFromAlbumSortAlbumDto;
import com.vk.api.generated.video.dto.VideoGetVideoDiscoverResponseDto;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.video.VideoListWithTotalCount;
import com.vk.dto.video.VideoSeason;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosOrder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.sft0;

/* compiled from: VideosQueueBackgroundManagerImpl.kt */
/* loaded from: classes3.dex */
public final class btt0 implements att0 {
    public VideoFile a;
    public VideoApplyNewVideoSourceType b;
    public hpj c;
    public yok0 d;
    public w4t0 e;
    public final LinkedHashSet f = new LinkedHashSet();
    public final ArrayList g = new ArrayList();
    public final bpn0 h = new bpn0(new g2c0(14));

    /* compiled from: VideosQueueBackgroundManagerImpl.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final int c;
        public final List<VideoFile> d;

        public a(List list, int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VideoPage(videoPageId=");
            sb.append(this.a);
            sb.append(", totalCount=");
            sb.append(this.b);
            sb.append(", offset=");
            sb.append(this.c);
            sb.append(", videos=");
            return ms9.a(')', sb, this.d);
        }
    }

    /* compiled from: VideosQueueBackgroundManagerImpl.kt */
    @b6l(c = "com.vk.libvideo.video.queue.impl.VideosQueueBackgroundManagerImpl$updateVideosQueue$1", f = "VideosQueueBackgroundManagerImpl.kt", l = {TokenParametersOuterClass$TokenParameters.TOPICS_FIELD_NUMBER, TokenParametersOuterClass$TokenParameters.GPP_FIELD_NUMBER}, m = "invokeSuspend")
    public static final class b extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
        final /* synthetic */ boolean $isCurrentVideoInited;
        final /* synthetic */ VideoFile $video;
        final /* synthetic */ zst0 $videosQueue;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(VideoFile videoFile, zst0 zst0Var, boolean z, spj<? super b> spjVar) {
            super(2, spjVar);
            this.$video = videoFile;
            this.$videosQueue = zst0Var;
            this.$isCurrentVideoInited = z;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return btt0.this.new b(this.$video, this.$videosQueue, this.$isCurrentVideoInited, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
            return ((b) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:55:0x00d4, code lost:
        
            if (xsna.btt0.e(r2, r3, r18) == r1) goto L64;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x010f, code lost:
        
            return r1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x010d, code lost:
        
            if (r2 == r1) goto L64;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object j;
            Object obj2;
            w4t0 w4t0Var;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.a.a(obj);
                btt0 btt0Var = btt0.this;
                w4t0 w4t0Var2 = btt0Var.e;
                if (w4t0Var2 != null) {
                    VideoFile videoFile = this.$video;
                    List<VideoSeason> list = w4t0Var2.c;
                    if (list != null) {
                        Iterator it = btt0Var.g.iterator();
                        loop0: while (true) {
                            if (!it.hasNext()) {
                                obj2 = null;
                                break;
                            }
                            obj2 = it.next();
                            List<VideoFile> list2 = ((a) obj2).d;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                Iterator<T> it2 = list2.iterator();
                                while (it2.hasNext()) {
                                    if (epx.f(((VideoFile) it2.next()).r1(), videoFile.r1())) {
                                        break loop0;
                                    }
                                }
                            }
                        }
                        a aVar = (a) obj2;
                        if (aVar != null) {
                            w4t0 w4t0Var3 = btt0Var.e;
                            if (w4t0Var3 != null) {
                                List<VideoSeason> list3 = list;
                                ArrayList arrayList = new ArrayList(c5g.u(list3, 10));
                                for (VideoSeason videoSeason : list3) {
                                    arrayList.add(videoSeason.b == aVar.a ? VideoSeason.zb(videoSeason, true) : VideoSeason.zb(videoSeason, false));
                                }
                                w4t0Var = new w4t0(w4t0Var3.a, w4t0Var3.b, arrayList, w4t0Var3.d, w4t0Var3.e, w4t0Var3.f, w4t0Var3.g);
                            } else {
                                w4t0Var = null;
                            }
                            btt0Var.e = w4t0Var;
                        }
                    }
                    this.$videosQueue.i(null);
                    btt0 btt0Var2 = btt0.this;
                    zst0 zst0Var = this.$videosQueue;
                    this.label = 1;
                } else {
                    this.$videosQueue.e(null);
                    btt0 btt0Var3 = btt0.this;
                    boolean z = this.$isCurrentVideoInited;
                    zst0 zst0Var2 = this.$videosQueue;
                    this.label = 2;
                    if (btt0Var3.b == VideoApplyNewVideoSourceType.Other) {
                        if (z) {
                            kat0 d = zst0Var2.d();
                            pat0 pat0Var = d instanceof pat0 ? (pat0) d : null;
                            zst0Var2.i(pat0Var != null ? pat0Var.b() : null);
                        }
                        j = s3q0.a;
                    } else {
                        j = btt0Var3.j(zst0Var2, this);
                        if (j != coroutineSingletons) {
                            j = s3q0.a;
                        }
                    }
                }
            } else {
                if (i != 1 && i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
            }
            return s3q0.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object e(btt0 btt0Var, zst0 zst0Var, ContinuationImpl continuationImpl) {
        gtt0 gtt0Var;
        int i;
        Object obj;
        btt0 btt0Var2;
        yok0 yok0Var;
        ArrayList arrayList = btt0Var.g;
        if (continuationImpl instanceof gtt0) {
            gtt0Var = (gtt0) continuationImpl;
            int i2 = gtt0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                gtt0Var.label = i2 - Integer.MIN_VALUE;
                gtt0 gtt0Var2 = gtt0Var;
                Object obj2 = gtt0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = gtt0Var2.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    w4t0 w4t0Var = btt0Var.e;
                    if ((w4t0Var != null ? w4t0Var.d : null) == VideoRelatedVideosLoopMode.SINGLE_VIDEO) {
                        zst0Var.e(btt0Var.f());
                        return s3q0.a;
                    }
                    if (arrayList == null || !arrayList.isEmpty()) {
                        Iterator it = arrayList.iterator();
                        loop1: while (it.hasNext()) {
                            List<VideoFile> list = ((a) it.next()).d;
                            if (!(list instanceof Collection) || !list.isEmpty()) {
                                Iterator<T> it2 = list.iterator();
                                while (it2.hasNext()) {
                                    String r1 = ((VideoFile) it2.next()).r1();
                                    VideoFile videoFile = btt0Var.a;
                                    if (epx.f(r1, videoFile != null ? videoFile.r1() : null)) {
                                        break loop1;
                                    }
                                }
                            }
                        }
                    }
                    w4t0 w4t0Var2 = btt0Var.e;
                    VideoFile videoFile2 = btt0Var.a;
                    if (w4t0Var2 != null && videoFile2 != null) {
                        yok0 yok0Var2 = btt0Var.d;
                        if (yok0Var2 != null) {
                            yok0Var2.b(null);
                        }
                        arrayList.clear();
                        zst0Var.e(null);
                        Iterator<T> it3 = w4t0Var2.c.iterator();
                        while (true) {
                            if (!it3.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it3.next();
                            if (((VideoSeason) obj).e) {
                                break;
                            }
                        }
                        VideoSeason videoSeason = (VideoSeason) obj;
                        int i3 = videoSeason != null ? videoSeason.b : w4t0Var2.a;
                        long j = w4t0Var2.b;
                        VideoRelatedVideosOrder videoRelatedVideosOrder = w4t0Var2.e;
                        gtt0Var2.L$0 = zst0Var;
                        gtt0Var2.L$1 = null;
                        gtt0Var2.L$2 = null;
                        gtt0Var2.L$3 = null;
                        gtt0Var2.L$4 = null;
                        gtt0Var2.I$0 = 0;
                        gtt0Var2.I$1 = 0;
                        gtt0Var2.label = 1;
                        btt0Var2 = btt0Var;
                        if (btt0Var2.g(i3, j, videoFile2, videoRelatedVideosOrder, gtt0Var2) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        zst0Var.e(btt0Var2.f());
                        yok0Var = btt0Var2.d;
                        if (yok0Var == null && yok0Var.isActive()) {
                            return s3q0.a;
                        }
                        hpj hpjVar = btt0Var2.c;
                        btt0Var2.d = hpjVar != null ? myc0.h(hpjVar, null, null, new htt0(btt0Var2, zst0Var, null), 3) : null;
                        return s3q0.a;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    zst0Var = (zst0) gtt0Var2.L$0;
                    kotlin.a.a(obj2);
                }
                btt0Var2 = btt0Var;
                zst0Var.e(btt0Var2.f());
                yok0Var = btt0Var2.d;
                if (yok0Var == null) {
                }
                hpj hpjVar2 = btt0Var2.c;
                btt0Var2.d = hpjVar2 != null ? myc0.h(hpjVar2, null, null, new htt0(btt0Var2, zst0Var, null), 3) : null;
                return s3q0.a;
            }
        }
        gtt0Var = new gtt0(btt0Var, continuationImpl);
        gtt0 gtt0Var22 = gtt0Var;
        Object obj22 = gtt0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = gtt0Var22.label;
        if (i != 0) {
        }
        btt0Var2 = btt0Var;
        zst0Var.e(btt0Var2.f());
        yok0Var = btt0Var2.d;
        if (yok0Var == null) {
        }
        hpj hpjVar22 = btt0Var2.c;
        btt0Var2.d = hpjVar22 != null ? myc0.h(hpjVar22, null, null, new htt0(btt0Var2, zst0Var, null), 3) : null;
        return s3q0.a;
    }

    @Override // xsna.att0
    public final void a() {
        this.e = null;
        this.a = null;
        this.g.clear();
    }

    @Override // xsna.att0
    public final u4s0 b() {
        VideoFile videoFile = this.a;
        if (videoFile == null) {
            return null;
        }
        w4t0 w4t0Var = this.e;
        VideoApplyNewVideoSourceType videoApplyNewVideoSourceType = this.b;
        if (videoApplyNewVideoSourceType == null) {
            videoApplyNewVideoSourceType = VideoApplyNewVideoSourceType.Other;
        }
        return new u4s0(videoFile, w4t0Var, videoApplyNewVideoSourceType);
    }

    @Override // xsna.att0
    public final void c(VideoFile videoFile, zst0 zst0Var, VideoApplyNewVideoSourceType videoApplyNewVideoSourceType) {
        String r1 = videoFile.r1();
        VideoFile videoFile2 = this.a;
        if (epx.f(r1, videoFile2 != null ? videoFile2.r1() : null)) {
            return;
        }
        boolean z = this.a != null;
        this.a = videoFile;
        this.b = videoApplyNewVideoSourceType;
        hpj hpjVar = this.c;
        if (hpjVar != null) {
            myc0.h(hpjVar, null, null, new b(videoFile, zst0Var, z, null), 3);
        }
    }

    @Override // xsna.att0
    public final void d(w4t0 w4t0Var) {
        this.e = w4t0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r10 != (-1)) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (r8 == null) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        r4 = r8.intValue();
        r6 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0073, code lost:
    
        r10 = (xsna.btt0.a) xsna.j5g.b0(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0079, code lost:
    
        if (r10 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x007b, code lost:
    
        r10 = r10.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007d, code lost:
    
        if (r10 == null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007f, code lost:
    
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0081, code lost:
    
        if (r4 < 0) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0087, code lost:
    
        if (r4 >= r10.size()) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0089, code lost:
    
        r10 = r10.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a4, code lost:
    
        r10 = r10;
        r10 = r6;
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (r6 == null) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b6, code lost:
    
        if (xsna.fxc0.B().c(r6) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00bc, code lost:
    
        if (r6.I6() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c2, code lost:
    
        if (r6.z0() == false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c6, code lost:
    
        r4 = r8.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ca, code lost:
    
        r8 = (xsna.btt0.a) xsna.j5g.b0(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00d0, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00d2, code lost:
    
        r8 = r8.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00d4, code lost:
    
        if (r8 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d6, code lost:
    
        r4 = r4 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d8, code lost:
    
        if (r4 < 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00de, code lost:
    
        if (r4 >= r8.size()) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00e0, code lost:
    
        r8 = r8.get(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0102, code lost:
    
        r14 = r7;
        r7 = r4;
        r4 = r8;
        r8 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x010c, code lost:
    
        if (r4 == null) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
    
        if (xsna.fxc0.B().c(r4) != false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
    
        if (r4.I6() == false) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0122, code lost:
    
        if (r4.z0() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0127, code lost:
    
        r7 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0124, code lost:
    
        r4 = r7;
        r7 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00e5, code lost:
    
        r7 = r7 - 1;
        r8 = (xsna.btt0.a) xsna.j5g.b0(r7, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00ed, code lost:
    
        if (r8 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00ef, code lost:
    
        r4 = r8.d;
        r8 = r4.size() - 1;
        r8 = (com.vk.dto.common.VideoFile) xsna.j5g.k0(r4);
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0101, code lost:
    
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0109, code lost:
    
        r8 = r7;
        r7 = r4;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0013, code lost:
    
        if ((r1 != null ? r1.d : null) != com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode.SINGLE_VIDEO) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x00c4, code lost:
    
        r6 = r10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x008e, code lost:
    
        r6 = r6 + 1;
        r10 = (xsna.btt0.a) xsna.j5g.b0(r6, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0096, code lost:
    
        if (r10 == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0098, code lost:
    
        r10 = (com.vk.dto.common.VideoFile) xsna.j5g.a0(r10.d);
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00a3, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x00aa, code lost:
    
        r10 = r6;
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x0068, code lost:
    
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ktt0 f() {
        a2s0 a2s0Var;
        a2s0 a2s0Var2;
        ArrayList arrayList = this.g;
        if (arrayList.isEmpty()) {
            w4t0 w4t0Var = this.e;
        }
        VideoFile videoFile = this.a;
        if (videoFile != null) {
            Iterator it = arrayList.iterator();
            VideoFile videoFile2 = null;
            VideoFile videoFile3 = null;
            int i = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    e43.t();
                    throw null;
                }
                Iterator<T> it2 = ((a) next).d.iterator();
                int i3 = 0;
                while (true) {
                    if (!it2.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    Object next2 = it2.next();
                    if (i3 < 0) {
                        e43.t();
                        throw null;
                    }
                    if (epx.f(((VideoFile) next2).r1(), videoFile.r1())) {
                        break;
                    }
                    i3++;
                }
            }
            Pair pair = new Pair(videoFile2, videoFile3);
            VideoFile videoFile4 = (VideoFile) pair.d();
            VideoFile videoFile5 = (VideoFile) pair.g();
            a2s0 a2s0Var3 = videoFile5 != null ? new a2s0(videoFile5, VideoApplyNewVideoSourceType.FromRelatedVideoDialog) : null;
            w4t0 w4t0Var2 = this.e;
            if (w4t0Var2 != null) {
                VideoFile videoFile6 = w4t0Var2.e instanceof VideoRelatedVideosOrder.Reverse ? w4t0Var2.g : w4t0Var2.f;
                if (videoFile6 != null) {
                    a2s0Var = new a2s0(videoFile6, VideoApplyNewVideoSourceType.FromRelatedVideoDialog);
                    if (w4t0Var2 != null) {
                        VideoFile videoFile7 = w4t0Var2.e instanceof VideoRelatedVideosOrder.Reverse ? w4t0Var2.f : w4t0Var2.g;
                        if (videoFile7 != null) {
                            a2s0Var2 = new a2s0(videoFile7, VideoApplyNewVideoSourceType.FromRelatedVideoDialog);
                            a2s0 a2s0Var4 = videoFile4 != null ? new a2s0(videoFile4, VideoApplyNewVideoSourceType.FromRelatedVideoDialog) : null;
                            if (w4t0Var2 != null || (r0 = w4t0Var2.d) == null) {
                                VideoRelatedVideosLoopMode videoRelatedVideosLoopMode = VideoRelatedVideosLoopMode.DISABLED;
                            }
                            return new ktt0(videoFile, a2s0Var, a2s0Var2, a2s0Var3, a2s0Var4, videoRelatedVideosLoopMode);
                        }
                    }
                    a2s0Var2 = null;
                    a2s0 a2s0Var42 = videoFile4 != null ? new a2s0(videoFile4, VideoApplyNewVideoSourceType.FromRelatedVideoDialog) : null;
                    if (w4t0Var2 != null) {
                    }
                    VideoRelatedVideosLoopMode videoRelatedVideosLoopMode2 = VideoRelatedVideosLoopMode.DISABLED;
                    return new ktt0(videoFile, a2s0Var, a2s0Var2, a2s0Var3, a2s0Var42, videoRelatedVideosLoopMode2);
                }
            }
            a2s0Var = null;
            if (w4t0Var2 != null) {
            }
            a2s0Var2 = null;
            a2s0 a2s0Var422 = videoFile4 != null ? new a2s0(videoFile4, VideoApplyNewVideoSourceType.FromRelatedVideoDialog) : null;
            if (w4t0Var2 != null) {
            }
            VideoRelatedVideosLoopMode videoRelatedVideosLoopMode22 = VideoRelatedVideosLoopMode.DISABLED;
            return new ktt0(videoFile, a2s0Var, a2s0Var2, a2s0Var3, a2s0Var422, videoRelatedVideosLoopMode22);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(int i, long j, VideoFile videoFile, VideoRelatedVideosOrder videoRelatedVideosOrder, ContinuationImpl continuationImpl) {
        ctt0 ctt0Var;
        int i2;
        int i3;
        List<VideoFile> list;
        if (continuationImpl instanceof ctt0) {
            ctt0Var = (ctt0) continuationImpl;
            int i4 = ctt0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ctt0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = ctt0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = ctt0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    uft0 uft0Var = new uft0();
                    UserId userId = new UserId(j);
                    String a1 = videoFile.a1();
                    VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto = videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Reverse ? VideoGetFromAlbumSortAlbumDto.TYPE_1 : VideoGetFromAlbumSortAlbumDto.TYPE_0;
                    boolean z = videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Shuffled;
                    VideoRelatedVideosOrder.Shuffled shuffled = z ? (VideoRelatedVideosOrder.Shuffled) videoRelatedVideosOrder : null;
                    Integer num = shuffled != null ? new Integer(shuffled.b) : null;
                    VideoRelatedVideosOrder.Shuffled shuffled2 = z ? (VideoRelatedVideosOrder.Shuffled) videoRelatedVideosOrder : null;
                    i3 = i;
                    iz2 A = yfb.A(sft0.a.d(uft0Var, i3, userId, new Integer(20), null, null, videoGetFromAlbumSortAlbumDto, a1, num, shuffled2 != null ? shuffled2.c : null, null, 1560));
                    fo50.J(A);
                    ctt0Var.L$0 = null;
                    ctt0Var.L$1 = null;
                    ctt0Var.I$0 = i3;
                    ctt0Var.J$0 = j;
                    ctt0Var.label = 1;
                    obj = evj.p(A, ctt0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = ctt0Var.I$0;
                    kotlin.a.a(obj);
                    i3 = i5;
                }
                ddt0.a.getClass();
                VideoListWithTotalCount a2 = ddt0.a((VideoGetFromAlbumResponseDto) obj);
                list = a2.b;
                if (!list.isEmpty()) {
                    this.g.add(new a(list, i3, a2.c, a2.d));
                }
                return s3q0.a;
            }
        }
        ctt0Var = new ctt0(this, continuationImpl);
        Object obj2 = ctt0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ctt0Var.label;
        if (i2 != 0) {
        }
        ddt0.a.getClass();
        VideoListWithTotalCount a22 = ddt0.a((VideoGetFromAlbumResponseDto) obj2);
        list = a22.b;
        if (!list.isEmpty()) {
        }
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e6 A[EDGE_INSN: B:26:0x00e6->B:17:0x00e6 BREAK  A[LOOP:0: B:11:0x00d4->B:25:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(int i, long j, int i2, VideoRelatedVideosOrder videoRelatedVideosOrder, d7s0 d7s0Var, ContinuationImpl continuationImpl) {
        dtt0 dtt0Var;
        int i3;
        int i4;
        int i5;
        gzs gzsVar;
        Iterator it;
        a aVar;
        if (continuationImpl instanceof dtt0) {
            dtt0Var = (dtt0) continuationImpl;
            int i6 = dtt0Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                dtt0Var.label = i6 - Integer.MIN_VALUE;
                Object obj = dtt0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = dtt0Var.label;
                Object obj2 = null;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    uft0 uft0Var = new uft0();
                    UserId userId = new UserId(j);
                    VideoGetFromAlbumSortAlbumDto videoGetFromAlbumSortAlbumDto = videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Reverse ? VideoGetFromAlbumSortAlbumDto.TYPE_1 : VideoGetFromAlbumSortAlbumDto.TYPE_0;
                    boolean z = videoRelatedVideosOrder instanceof VideoRelatedVideosOrder.Shuffled;
                    VideoRelatedVideosOrder.Shuffled shuffled = z ? (VideoRelatedVideosOrder.Shuffled) videoRelatedVideosOrder : null;
                    Integer num = shuffled != null ? new Integer(shuffled.b) : null;
                    VideoRelatedVideosOrder.Shuffled shuffled2 = z ? (VideoRelatedVideosOrder.Shuffled) videoRelatedVideosOrder : null;
                    i4 = i;
                    iz2 A = yfb.A(sft0.a.d(uft0Var, i4, userId, new Integer(20), new Integer(i2), null, videoGetFromAlbumSortAlbumDto, null, num, shuffled2 != null ? shuffled2.c : null, null, 1616));
                    fo50.J(A);
                    dtt0Var.L$0 = null;
                    dtt0Var.L$1 = d7s0Var;
                    dtt0Var.I$0 = i4;
                    dtt0Var.J$0 = j;
                    dtt0Var.I$1 = i2;
                    dtt0Var.label = 1;
                    Object p = evj.p(A, dtt0Var);
                    if (p == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = p;
                    i5 = i2;
                    gzsVar = d7s0Var;
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i5 = dtt0Var.I$1;
                    int i7 = dtt0Var.I$0;
                    gzsVar = (gzs) dtt0Var.L$1;
                    kotlin.a.a(obj);
                    i4 = i7;
                }
                ddt0.a.getClass();
                VideoListWithTotalCount a2 = ddt0.a((VideoGetFromAlbumResponseDto) obj);
                ArrayList arrayList = this.g;
                it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (((a) next).a == i4) {
                        obj2 = next;
                        break;
                    }
                }
                aVar = (a) obj2;
                if (aVar != null) {
                    a aVar2 = new a(j5g.u0(a2.b, aVar.d), aVar.a, a2.c, i5);
                    Integer j2 = p4g.j(aVar, arrayList);
                    if (j2 != null) {
                        arrayList.set(j2.intValue(), aVar2);
                    }
                }
                gzsVar.invoke();
                return s3q0.a;
            }
        }
        dtt0Var = new dtt0(this, continuationImpl);
        Object obj3 = dtt0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = dtt0Var.label;
        Object obj22 = null;
        if (i3 != 0) {
        }
        ddt0.a.getClass();
        VideoListWithTotalCount a22 = ddt0.a((VideoGetFromAlbumResponseDto) obj3);
        ArrayList arrayList2 = this.g;
        it = arrayList2.iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        aVar = (a) obj22;
        if (aVar != null) {
        }
        gzsVar.invoke();
        return s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(int i, long j, d7s0 d7s0Var, ContinuationImpl continuationImpl) {
        ett0 ett0Var;
        int i2;
        int i3;
        gzs gzsVar;
        List<VideoFile> list;
        if (continuationImpl instanceof ett0) {
            ett0Var = (ett0) continuationImpl;
            int i4 = ett0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ett0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = ett0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = ett0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    i3 = i;
                    iz2 A = yfb.A(sft0.a.d(new uft0(), i3, new UserId(j), new Integer(20), new Integer(0), null, null, null, null, null, null, 2032));
                    fo50.J(A);
                    ett0Var.L$0 = d7s0Var;
                    ett0Var.I$0 = i3;
                    ett0Var.J$0 = j;
                    ett0Var.label = 1;
                    obj = evj.p(A, ett0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    gzsVar = d7s0Var;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    int i5 = ett0Var.I$0;
                    gzsVar = (gzs) ett0Var.L$0;
                    kotlin.a.a(obj);
                    i3 = i5;
                }
                ddt0.a.getClass();
                VideoListWithTotalCount a2 = ddt0.a((VideoGetFromAlbumResponseDto) obj);
                list = a2.b;
                if (!list.isEmpty()) {
                    this.g.add(new a(list, i3, a2.c, 0));
                    gzsVar.invoke();
                }
                return s3q0.a;
            }
        }
        ett0Var = new ett0(this, continuationImpl);
        Object obj2 = ett0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = ett0Var.label;
        if (i2 != 0) {
        }
        ddt0.a.getClass();
        VideoListWithTotalCount a22 = ddt0.a((VideoGetFromAlbumResponseDto) obj2);
        list = a22.b;
        if (!list.isEmpty()) {
        }
        return s3q0.a;
    }

    @Override // xsna.att0
    public final void init() {
        if (this.c == null) {
            this.c = zvj.a(hqu0.b().plus(whn0.a()));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(zst0 zst0Var, ContinuationImpl continuationImpl) {
        ftt0 ftt0Var;
        int i;
        VideoFile videoFile;
        zst0 zst0Var2;
        Iterator it;
        boolean hasNext;
        LinkedHashSet linkedHashSet;
        jtt0 jtt0Var;
        Object obj;
        VideoFile videoFile2;
        if (continuationImpl instanceof ftt0) {
            ftt0Var = (ftt0) continuationImpl;
            int i2 = ftt0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ftt0Var.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ftt0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ftt0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj2);
                    VideoFile videoFile3 = this.a;
                    if (videoFile3 != null) {
                        iz2 A = yfb.A(((Boolean) this.h.getValue()).booleanValue() ? tft0.p(new uft0(), videoFile3.I0(), videoFile3.o0(), null, null, null, null, null, null, 4092) : tft0.k(new uft0(), videoFile3.I0(), videoFile3.o0(), null, null, null, null, null, null, null, 4092));
                        fo50.J(A);
                        ftt0Var.L$0 = zst0Var;
                        ftt0Var.L$1 = videoFile3;
                        ftt0Var.I$0 = 0;
                        ftt0Var.label = 1;
                        Object p = evj.p(A, ftt0Var);
                        if (p == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        videoFile = videoFile3;
                        obj2 = p;
                        zst0Var2 = zst0Var;
                    }
                    return s3q0.a;
                }
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                VideoFile videoFile4 = (VideoFile) ftt0Var.L$1;
                zst0Var2 = (zst0) ftt0Var.L$0;
                kotlin.a.a(obj2);
                videoFile = videoFile4;
                it = ums0.e(ums0.a, ((VideoGetVideoDiscoverResponseDto) obj2).f(), null, null, false, 62).iterator();
                while (true) {
                    hasNext = it.hasNext();
                    linkedHashSet = this.f;
                    jtt0Var = null;
                    if (hasNext) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (!linkedHashSet.contains(((VideoFile) obj).a1())) {
                        break;
                    }
                }
                videoFile2 = (VideoFile) obj;
                if (videoFile2 != null) {
                    linkedHashSet.add(videoFile2.a1());
                    a2s0 a2s0Var = new a2s0(videoFile2, VideoApplyNewVideoSourceType.FromRecommendations);
                    jtt0Var = new jtt0(videoFile, a2s0Var, a2s0Var, a2s0Var, a2s0Var);
                }
                zst0Var2.i(jtt0Var);
                return s3q0.a;
            }
        }
        ftt0Var = new ftt0(this, continuationImpl);
        Object obj22 = ftt0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ftt0Var.label;
        if (i != 0) {
        }
        it = ums0.e(ums0.a, ((VideoGetVideoDiscoverResponseDto) obj22).f(), null, null, false, 62).iterator();
        while (true) {
            hasNext = it.hasNext();
            linkedHashSet = this.f;
            jtt0Var = null;
            if (hasNext) {
            }
        }
        videoFile2 = (VideoFile) obj;
        if (videoFile2 != null) {
        }
        zst0Var2.i(jtt0Var);
        return s3q0.a;
    }

    @Override // xsna.att0
    public final void release() {
        this.f.clear();
        hpj hpjVar = this.c;
        if (hpjVar != null) {
            zvj.c(hpjVar, null);
        }
        this.c = null;
        this.d = null;
    }
}
