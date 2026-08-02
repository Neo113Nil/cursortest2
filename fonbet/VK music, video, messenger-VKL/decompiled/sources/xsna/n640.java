package xsna;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.video.player.model.FrameSize;
import one.video.player.model.VideoContentType;

/* compiled from: MultiTrackMp4VideoSource.kt */
/* loaded from: classes8.dex */
public final class n640 extends sht0 {
    public final List<a> d;
    public final FrameSize e;

    /* compiled from: MultiTrackMp4VideoSource.kt */
    public static final class a {
        public final FrameSize a;
        public final Uri b;

        public a(Uri uri, FrameSize frameSize) {
            this.a = frameSize;
            this.b = uri;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Track(frameSize=" + this.a + ", uri=" + this.b + ")";
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n640(List<a> list, FrameSize frameSize) {
        super(r0, (r2 == null || (r2 = r2.b) == null) ? list.get(0).b : r2, false);
        Object obj;
        Uri uri;
        VideoContentType videoContentType = VideoContentType.MP4;
        if (list.isEmpty()) {
            throw new RuntimeException("tracks is empty");
        }
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((a) obj).a == frameSize) {
                    break;
                }
            }
        }
        a aVar = (a) obj;
        this.d = list;
        this.e = frameSize;
    }

    @Override // xsna.sht0
    public final sht0 d(String str) {
        List<a> list = this.d;
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (a aVar : list) {
            arrayList.add(new a(sht0.c(aVar.b, str), aVar.a));
        }
        return new n640(arrayList, this.e);
    }

    @Override // xsna.sht0
    public final boolean equals(Object obj) {
        n640 n640Var = obj instanceof n640 ? (n640) obj : null;
        return epx.f(this.d, n640Var != null ? n640Var.d : null);
    }

    @Override // xsna.sht0
    public final int hashCode() {
        Iterator<a> it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            i = (i * 31) + it.next().hashCode();
        }
        return i;
    }
}
