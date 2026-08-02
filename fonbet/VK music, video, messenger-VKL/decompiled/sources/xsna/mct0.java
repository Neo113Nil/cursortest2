package xsna;

import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: VideoRelatedVideosPaging.kt */
/* loaded from: classes7.dex */
public final class mct0 {
    public final int a;
    public final k9x b;
    public final boolean c;
    public final int d;
    public final List<rbt0> e;
    public final VideoFile f;
    public final VideoFile g;

    public mct0(int i, k9x k9xVar, boolean z, int i2, List<rbt0> list, VideoFile videoFile, VideoFile videoFile2) {
        this.a = i;
        this.b = k9xVar;
        this.c = z;
        this.d = i2;
        this.e = list;
        this.f = videoFile;
        this.g = videoFile2;
    }

    public static mct0 a(mct0 mct0Var, k9x k9xVar, int i, ArrayList arrayList, VideoFile videoFile, VideoFile videoFile2, int i2) {
        int i3 = mct0Var.a;
        if ((i2 & 2) != 0) {
            k9xVar = mct0Var.b;
        }
        k9x k9xVar2 = k9xVar;
        boolean z = mct0Var.c;
        if ((i2 & 8) != 0) {
            i = mct0Var.d;
        }
        int i4 = i;
        if ((i2 & 32) != 0) {
            videoFile = mct0Var.f;
        }
        VideoFile videoFile3 = videoFile;
        if ((i2 & 64) != 0) {
            videoFile2 = mct0Var.g;
        }
        return new mct0(i3, k9xVar2, z, i4, arrayList, videoFile3, videoFile2);
    }

    public static boolean e(mct0 mct0Var, int i) {
        rbt0 rbt0Var;
        k9x k9xVar = mct0Var.b;
        return k9xVar.c < mct0Var.d && (rbt0Var = (rbt0) j5g.k0(mct0Var.e)) != null && rbt0Var.a() && k9xVar.c - i < 5;
    }

    public static boolean f(mct0 mct0Var, int i) {
        rbt0 rbt0Var;
        k9x k9xVar = mct0Var.b;
        return k9xVar.b > 0 && (rbt0Var = (rbt0) j5g.a0(mct0Var.e)) != null && rbt0Var.a() && i - k9xVar.b < 5;
    }

    public final int b(VideoFile videoFile) {
        for (rbt0 rbt0Var : this.e) {
            Iterator<VideoFile> it = rbt0Var.d.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (epx.f(it.next().a1(), videoFile.a1())) {
                    break;
                }
                i++;
            }
            if (i > -1) {
                return rbt0Var.a + i;
            }
        }
        return -1;
    }

    public final VideoFile c() {
        List<VideoFile> list;
        rbt0 rbt0Var = (rbt0) j5g.k0(this.e);
        if (rbt0Var != null) {
            if (rbt0Var.a + rbt0Var.b < rbt0Var.c) {
                rbt0Var = null;
            }
            if (rbt0Var != null && (list = rbt0Var.d) != null) {
                return (VideoFile) j5g.k0(list);
            }
        }
        return null;
    }

    public final VideoFile d(VideoFile videoFile) {
        VideoRestriction O;
        VideoRestriction O2;
        List<rbt0> list = this.e;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((rbt0) it.next()).d, arrayList);
        }
        Integer g = i7o0.g(arrayList, new mcj0(videoFile, 24));
        Object obj = null;
        boolean z = this.c;
        if (g != null && z) {
            while (g.intValue() < e43.h(arrayList)) {
                int intValue = g.intValue() + 1;
                g = Integer.valueOf(intValue);
                VideoFile videoFile2 = (VideoFile) j5g.b0(intValue, arrayList);
                if (videoFile2 == null || (O2 = videoFile2.O()) == null || O2.f) {
                    return videoFile2;
                }
            }
            return null;
        }
        if (g != null) {
            return (VideoFile) j5g.b0(g.intValue() + 1, arrayList);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            VideoFile videoFile3 = (VideoFile) next;
            if (!z || (O = videoFile3.O()) == null || O.f) {
                if (videoFile3.o0() != videoFile.o0() || !epx.f(videoFile3.I0(), videoFile.I0())) {
                    obj = next;
                    break;
                }
            }
        }
        return (VideoFile) obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mct0)) {
            return false;
        }
        mct0 mct0Var = (mct0) obj;
        return this.a == mct0Var.a && epx.f(this.b, mct0Var.b) && this.c == mct0Var.c && this.d == mct0Var.d && epx.f(this.e, mct0Var.e) && epx.f(this.f, mct0Var.f) && epx.f(this.g, mct0Var.g);
    }

    public final int hashCode() {
        int a = fw3.a(shy.a(this.d, qoy.b((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31, 31, this.c), 31), 31, this.e);
        VideoFile videoFile = this.f;
        int hashCode = (a + (videoFile == null ? 0 : videoFile.hashCode())) * 31;
        VideoFile videoFile2 = this.g;
        return hashCode + (videoFile2 != null ? videoFile2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoRelatedVideosPaging(playlistId=");
        sb.append(this.a);
        sb.append(", loadedRange=");
        sb.append(this.b);
        sb.append(", skipRestrictedVideos=");
        sb.append(this.c);
        sb.append(", total=");
        sb.append(this.d);
        sb.append(", videos=");
        sb.append(this.e);
        sb.append(", loadedFirstVideo=");
        sb.append(this.f);
        sb.append(", loadedLastVideo=");
        return lq.a(sb, this.g, ')');
    }
}
