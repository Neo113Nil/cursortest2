package xsna;

import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;

/* compiled from: CompositeSequenceableLoader.java */
/* loaded from: classes12.dex */
public final class pui implements androidx.media3.exoplayer.source.q {
    public final com.google.common.collect.g b;
    public long c;

    /* compiled from: CompositeSequenceableLoader.java */
    public static final class a implements androidx.media3.exoplayer.source.q {
        public final androidx.media3.exoplayer.source.q b;
        public final ImmutableList<Integer> c;

        public a(androidx.media3.exoplayer.source.q qVar, List<Integer> list) {
            this.b = qVar;
            this.c = ImmutableList.m(list);
        }

        @Override // androidx.media3.exoplayer.source.q
        public final long getBufferedPositionUs() {
            return this.b.getBufferedPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.q
        public final long getNextLoadPositionUs() {
            return this.b.getNextLoadPositionUs();
        }

        @Override // androidx.media3.exoplayer.source.q
        public final boolean isLoading() {
            return this.b.isLoading();
        }

        @Override // androidx.media3.exoplayer.source.q
        public final boolean k(androidx.media3.exoplayer.f fVar) {
            return this.b.k(fVar);
        }

        @Override // androidx.media3.exoplayer.source.q
        public final void reevaluateBuffer(long j) {
            this.b.reevaluateBuffer(j);
        }
    }

    public pui(List<? extends androidx.media3.exoplayer.source.q> list, List<List<Integer>> list2) {
        ImmutableList.b bVar = ImmutableList.c;
        ImmutableList.a aVar = new ImmutableList.a();
        fxc0.p(list.size() == list2.size());
        for (int i = 0; i < list.size(); i++) {
            aVar.c(new a(list.get(i), list2.get(i)));
        }
        this.b = aVar.g();
        this.c = C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getBufferedPositionUs() {
        int i = 0;
        long j = Long.MAX_VALUE;
        long j2 = Long.MAX_VALUE;
        while (true) {
            com.google.common.collect.g gVar = this.b;
            if (i >= gVar.e) {
                break;
            }
            a aVar = (a) gVar.get(i);
            long bufferedPositionUs = aVar.b.getBufferedPositionUs();
            ImmutableList<Integer> immutableList = aVar.c;
            if ((immutableList.contains(1) || immutableList.contains(2) || immutableList.contains(4)) && bufferedPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, bufferedPositionUs);
            }
            if (bufferedPositionUs != Long.MIN_VALUE) {
                j2 = Math.min(j2, bufferedPositionUs);
            }
            i++;
        }
        if (j != Long.MAX_VALUE) {
            this.c = j;
            return j;
        }
        if (j2 == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        long j3 = this.c;
        return j3 != C.TIME_UNSET ? j3 : j2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final long getNextLoadPositionUs() {
        int i = 0;
        long j = Long.MAX_VALUE;
        while (true) {
            com.google.common.collect.g gVar = this.b;
            if (i >= gVar.e) {
                break;
            }
            long nextLoadPositionUs = ((a) gVar.get(i)).b.getNextLoadPositionUs();
            if (nextLoadPositionUs != Long.MIN_VALUE) {
                j = Math.min(j, nextLoadPositionUs);
            }
            i++;
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean isLoading() {
        int i = 0;
        while (true) {
            com.google.common.collect.g gVar = this.b;
            if (i >= gVar.e) {
                return false;
            }
            if (((a) gVar.get(i)).b.isLoading()) {
                return true;
            }
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public final boolean k(androidx.media3.exoplayer.f fVar) {
        boolean z;
        boolean z2 = false;
        do {
            long nextLoadPositionUs = getNextLoadPositionUs();
            if (nextLoadPositionUs == Long.MIN_VALUE) {
                return z2;
            }
            int i = 0;
            z = false;
            while (true) {
                com.google.common.collect.g gVar = this.b;
                if (i >= gVar.e) {
                    break;
                }
                long nextLoadPositionUs2 = ((a) gVar.get(i)).b.getNextLoadPositionUs();
                boolean z3 = nextLoadPositionUs2 != Long.MIN_VALUE && nextLoadPositionUs2 <= fVar.a;
                if (nextLoadPositionUs2 == nextLoadPositionUs || z3) {
                    z |= ((a) gVar.get(i)).b.k(fVar);
                }
                i++;
            }
            z2 |= z;
        } while (z);
        return z2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public final void reevaluateBuffer(long j) {
        int i = 0;
        while (true) {
            com.google.common.collect.g gVar = this.b;
            if (i >= gVar.e) {
                return;
            }
            ((a) gVar.get(i)).reevaluateBuffer(j);
            i++;
        }
    }
}
