package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.libvideo.video.queue.api.model.VideoApplyNewVideoSourceType;
import com.vk.libvideo.video.queue.api.model.recommendations.VideoRecommendationVideosType;
import com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode;
import java.util.Stack;
import kotlin.NoWhenBranchMatchedException;
import xsna.zst0;

/* compiled from: VideosQueueImpl.kt */
/* loaded from: classes3.dex */
public final class itt0 implements zst0 {
    public pat0 b;
    public nct0 c;
    public boolean d;
    public ece0 e;
    public zst0.a a = zst0.a.C4199a.a;
    public final Stack<a2s0> f = new Stack<>();

    /* compiled from: VideosQueueImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[VideoRecommendationVideosType.values().length];
            try {
                iArr[VideoRecommendationVideosType.OFFLINE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoRecommendationVideosType.SIMILAR_VIDEOS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoRecommendationVideosType.SIMILAR_MUSIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[VideoRecommendationVideosType.MUSIC_MIX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.zst0
    public final void a(ece0 ece0Var) {
        this.e = ece0Var;
    }

    @Override // xsna.zst0
    public final a2s0 b(boolean z, boolean z2) {
        a2s0 a2s0Var;
        nct0 nct0Var;
        VideoRelatedVideosLoopMode a2;
        if (z2) {
            kat0 kat0Var = this.c;
            if (kat0Var == null && (kat0Var = this.b) == null) {
                kat0Var = null;
            }
            if (((kat0Var != null ? kat0Var.f() : null) != null || ((nct0Var = this.c) != null && (a2 = nct0Var.a()) != null && a2 == VideoRelatedVideosLoopMode.ALL_VIDEOS)) && !this.d) {
                k();
            }
        }
        nct0 nct0Var2 = this.c;
        if (nct0Var2 != null) {
            int i = zbt0.$EnumSwitchMapping$0[nct0Var2.a().ordinal()];
            if (i == 1) {
                a2s0Var = nct0Var2.f();
            } else if (i == 2) {
                a2s0Var = nct0Var2.f();
                if (a2s0Var == null) {
                    a2s0Var = nct0Var2.g();
                }
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2s0Var = z ? nct0Var2.f() : new a2s0(nct0Var2.e(), VideoApplyNewVideoSourceType.FromRelatedVideoDialog);
            }
        } else {
            a2s0Var = null;
        }
        if (a2s0Var != null) {
            return a2s0Var;
        }
        kat0 kat0Var2 = this.c;
        if (kat0Var2 == null && (kat0Var2 = this.b) == null) {
            kat0Var2 = null;
        }
        if (kat0Var2 != null) {
            return kat0Var2.f();
        }
        return null;
    }

    @Override // xsna.zst0
    public final a2s0 c() {
        a2s0 a2s0Var;
        nct0 nct0Var = this.c;
        if (nct0Var != null) {
            int i = act0.$EnumSwitchMapping$0[nct0Var.a().ordinal()];
            if (i == 1) {
                a2s0Var = nct0Var.d();
            } else if (i == 2) {
                a2s0 d = nct0Var.d();
                a2s0Var = d == null ? nct0Var.c() : d;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                a2s0Var = nct0Var.d();
            }
        } else {
            a2s0Var = null;
        }
        if (a2s0Var != null) {
            return a2s0Var;
        }
        zst0.a aVar = this.a;
        if (aVar instanceof zst0.a.C4199a) {
            Stack<a2s0> stack = this.f;
            if (stack.isEmpty()) {
                return null;
            }
            return stack.pop();
        }
        if (!(aVar instanceof zst0.a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        kat0 kat0Var = this.c;
        if (kat0Var == null && (kat0Var = this.b) == null) {
            kat0Var = null;
        }
        if (kat0Var != null) {
            return kat0Var.d();
        }
        return null;
    }

    @Override // xsna.zst0
    public final kat0 d() {
        nct0 nct0Var = this.c;
        if (nct0Var != null) {
            return nct0Var;
        }
        pat0 pat0Var = this.b;
        if (pat0Var != null) {
            return pat0Var;
        }
        return null;
    }

    @Override // xsna.zst0
    public final void e(nct0 nct0Var) {
        if (nct0Var == null) {
            nct0Var = null;
        }
        this.c = nct0Var;
        j();
        l();
    }

    @Override // xsna.zst0
    public final Stack<a2s0> f() {
        return this.f;
    }

    @Override // xsna.zst0
    public final void g() {
        k();
    }

    @Override // xsna.zst0
    public final void h(zst0.a aVar, boolean z, boolean z2) {
        this.a = aVar;
        this.d = z2;
        if (z) {
            this.f.clear();
        }
    }

    @Override // xsna.zst0
    public final void i(pat0 pat0Var) {
        if (pat0Var == null) {
            pat0Var = null;
        }
        this.b = pat0Var;
        j();
        l();
    }

    public final void j() {
        zst0.a aVar;
        if (this.c != null) {
            aVar = new zst0.a.b(false);
        } else {
            pat0 pat0Var = this.b;
            if (pat0Var != null) {
                VideoRecommendationVideosType type = pat0Var.getType();
                int i = type == null ? -1 : a.$EnumSwitchMapping$0[type.ordinal()];
                aVar = i != 1 ? i != 2 ? i != 3 ? i != 4 ? zst0.a.C4199a.a : zst0.a.C4199a.a : zst0.a.C4199a.a : zst0.a.C4199a.a : new zst0.a.b(true);
            } else {
                aVar = zst0.a.C4199a.a;
            }
        }
        if (epx.f(this.a, aVar)) {
            return;
        }
        this.a = aVar;
        this.f.clear();
    }

    public final void k() {
        if (this.a instanceof zst0.a.C4199a) {
            kat0 kat0Var = this.c;
            if (kat0Var == null && (kat0Var = this.b) == null) {
                kat0Var = null;
            }
            VideoFile e = kat0Var != null ? kat0Var.e() : null;
            if (e != null) {
                this.f.add(new a2s0(e, VideoApplyNewVideoSourceType.Other));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x001b, code lost:
    
        if (r7.f.isEmpty() == false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0044, code lost:
    
        if (r2 != com.vk.libvideo.video.queue.api.model.related.VideoRelatedVideosLoopMode.ALL_VIDEOS) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void l() {
        boolean z;
        kat0 kat0Var;
        nct0 nct0Var;
        VideoRelatedVideosLoopMode a2;
        ece0 ece0Var = this.e;
        if (ece0Var != null) {
            boolean z2 = false;
            if (!this.d) {
                zst0.a aVar = this.a;
                if (!(aVar instanceof zst0.a.C4199a)) {
                    if (!(aVar instanceof zst0.a.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kat0 kat0Var2 = this.c;
                    if (kat0Var2 == null && (kat0Var2 = this.b) == null) {
                        kat0Var2 = null;
                    }
                    if ((kat0Var2 != null ? kat0Var2.d() : null) == null) {
                        nct0 nct0Var2 = this.c;
                        if (nct0Var2 != null) {
                            VideoRelatedVideosLoopMode a3 = nct0Var2.a();
                            if (a3 != null) {
                            }
                        }
                    }
                    z = true;
                }
                kat0Var = this.c;
                if (kat0Var == null && (kat0Var = this.b) == null) {
                    kat0Var = null;
                }
                if (((kat0Var != null ? kat0Var.f() : null) == null || ((nct0Var = this.c) != null && (a2 = nct0Var.a()) != null && a2 == VideoRelatedVideosLoopMode.ALL_VIDEOS)) && !this.d) {
                    z2 = true;
                }
                ece0Var.invoke(new lat0(z, z2));
            }
            z = false;
            kat0Var = this.c;
            if (kat0Var == null) {
                kat0Var = null;
            }
            if ((kat0Var != null ? kat0Var.f() : null) == null) {
            }
            z2 = true;
            ece0Var.invoke(new lat0(z, z2));
        }
    }

    @Override // xsna.zst0
    public final zst0.a u() {
        return this.a;
    }
}
