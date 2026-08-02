package xsna;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.media3.common.StreamKey;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/* compiled from: DashManifest.java */
/* loaded from: classes12.dex */
public final class rsk implements uer<rsk> {
    public final long a;
    public final long b;
    public final long c;
    public final boolean d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    @Nullable
    public final wak i;

    @Nullable
    public final voi0 j;

    @Nullable
    public final Uri k;

    @Nullable
    public final p1e0 l;
    public final List<jx90> m;

    public rsk(long j, long j2, long j3, boolean z, long j4, long j5, long j6, long j7, @Nullable p1e0 p1e0Var, @Nullable wak wakVar, @Nullable voi0 voi0Var, @Nullable Uri uri, ArrayList arrayList) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = z;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.h = j7;
        this.l = p1e0Var;
        this.i = wakVar;
        this.k = uri;
        this.j = voi0Var;
        this.m = arrayList;
    }

    @Override // xsna.uer
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final rsk copy(List<StreamKey> list) {
        long j;
        long j2;
        LinkedList linkedList = new LinkedList(list);
        Collections.sort(linkedList);
        linkedList.add(new StreamKey(-1, -1, -1));
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        int i = 0;
        while (true) {
            int size = this.m.size();
            j = C.TIME_UNSET;
            if (i >= size) {
                break;
            }
            if (((StreamKey) linkedList.peek()).b != i) {
                long c = c(i);
                if (c != C.TIME_UNSET) {
                    j3 += c;
                }
            } else {
                jx90 b = b(i);
                List<cj0> list2 = b.c;
                StreamKey streamKey = (StreamKey) linkedList.poll();
                int i2 = streamKey.b;
                ArrayList arrayList2 = new ArrayList();
                while (true) {
                    int i3 = streamKey.c;
                    cj0 cj0Var = list2.get(i3);
                    List<e7g0> list3 = cj0Var.c;
                    ArrayList arrayList3 = new ArrayList();
                    do {
                        arrayList3.add(list3.get(streamKey.d));
                        streamKey = (StreamKey) linkedList.poll();
                        if (streamKey.b != i2) {
                            break;
                        }
                    } while (streamKey.c == i3);
                    j2 = j3;
                    arrayList2.add(new cj0(cj0Var.a, cj0Var.b, arrayList3, cj0Var.d, cj0Var.e, cj0Var.f));
                    if (streamKey.b != i2) {
                        break;
                    }
                    j3 = j2;
                }
                linkedList.addFirst(streamKey);
                arrayList.add(new jx90(b.a, b.b - j2, arrayList2, b.d));
                j3 = j2;
            }
            i++;
        }
        long j4 = j3;
        long j5 = this.b;
        if (j5 != C.TIME_UNSET) {
            j = j5 - j4;
        }
        return new rsk(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this.i, this.j, this.k, arrayList);
    }

    public final jx90 b(int i) {
        return this.m.get(i);
    }

    public final long c(int i) {
        long j;
        long j2;
        List<jx90> list = this.m;
        if (i == list.size() - 1) {
            j = this.b;
            if (j == C.TIME_UNSET) {
                return C.TIME_UNSET;
            }
            j2 = list.get(i).b;
        } else {
            j = list.get(i + 1).b;
            j2 = list.get(i).b;
        }
        return j - j2;
    }

    public final long d(int i) {
        return y2r0.S(c(i));
    }
}
