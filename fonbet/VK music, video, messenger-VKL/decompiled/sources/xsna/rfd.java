package xsna;

import android.os.SystemClock;
import android.util.SparseArray;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.stat.model.DevNullEventKey;
import com.vk.stat.scheme.SchemeStat$TypeDevNullItem;

/* compiled from: ClipVisibilityTracker.kt */
/* loaded from: classes4.dex */
public final class rfd implements b5r {
    public final v8d a;
    public final SparseArray<pfd> b = new SparseArray<>();
    public final SparseArray<pfd> c = new SparseArray<>();

    public rfd(ClipsViewerComponent clipsViewerComponent) {
        this.a = clipsViewerComponent.Xb();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.b5r
    public final void a(RecyclerView.e0 e0Var, int i) {
        String W0;
        if (e0Var instanceof qfd) {
            qfd qfdVar = (qfd) e0Var;
            if (qfdVar.J5()) {
                SparseArray<pfd> sparseArray = this.c;
                if (sparseArray.indexOfKey(i) >= 0) {
                    return;
                }
                float D = bwt0.D(qfdVar.F1());
                double d = D;
                SparseArray<pfd> sparseArray2 = this.b;
                if (0.01d <= d && d <= 0.24d) {
                    pfd pfdVar = sparseArray2.get(i, new pfd(0));
                    if (pfdVar.b != -1) {
                        return;
                    }
                    pfdVar.b = SystemClock.elapsedRealtime();
                    sparseArray2.put(i, pfdVar);
                    return;
                }
                if (0.25d <= d && d <= 0.49d) {
                    pfd pfdVar2 = sparseArray2.get(i, new pfd(0));
                    if (pfdVar2.c != -1) {
                        return;
                    }
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    long j = pfdVar2.b;
                    if (j == -1) {
                        j = elapsedRealtime;
                    }
                    pfdVar2.b = j;
                    pfdVar2.c = elapsedRealtime;
                    sparseArray2.put(i, pfdVar2);
                    return;
                }
                if (0.5d <= d && d <= 0.74d) {
                    pfd pfdVar3 = sparseArray2.get(i, new pfd(0));
                    if (pfdVar3.d != -1) {
                        return;
                    }
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    long j2 = pfdVar3.b;
                    if (j2 == -1) {
                        j2 = elapsedRealtime2;
                    }
                    pfdVar3.b = j2;
                    long j3 = pfdVar3.c;
                    if (j3 == -1) {
                        j3 = elapsedRealtime2;
                    }
                    pfdVar3.c = j3;
                    pfdVar3.d = elapsedRealtime2;
                    sparseArray2.put(i, pfdVar3);
                    return;
                }
                if (0.75d <= d && d <= 0.99d) {
                    pfd pfdVar4 = sparseArray2.get(i, new pfd(0));
                    if (pfdVar4.e != -1) {
                        return;
                    }
                    long elapsedRealtime3 = SystemClock.elapsedRealtime();
                    long j4 = pfdVar4.b;
                    if (j4 == -1) {
                        j4 = elapsedRealtime3;
                    }
                    pfdVar4.b = j4;
                    long j5 = pfdVar4.c;
                    if (j5 == -1) {
                        j5 = elapsedRealtime3;
                    }
                    pfdVar4.c = j5;
                    long j6 = pfdVar4.d;
                    if (j6 == -1) {
                        j6 = elapsedRealtime3;
                    }
                    pfdVar4.d = j6;
                    pfdVar4.e = elapsedRealtime3;
                    sparseArray2.put(i, pfdVar4);
                    return;
                }
                if (D == 1.0f) {
                    pfd pfdVar5 = sparseArray2.get(i, new pfd(0));
                    if (pfdVar5.f == -1) {
                        long elapsedRealtime4 = SystemClock.elapsedRealtime();
                        long j7 = pfdVar5.b;
                        if (j7 == -1) {
                            j7 = elapsedRealtime4;
                        }
                        pfdVar5.b = j7;
                        long j8 = pfdVar5.c;
                        if (j8 == -1) {
                            j8 = elapsedRealtime4;
                        }
                        pfdVar5.c = j8;
                        long j9 = pfdVar5.d;
                        if (j9 == -1) {
                            j9 = elapsedRealtime4;
                        }
                        pfdVar5.d = j9;
                        long j10 = pfdVar5.e;
                        if (j10 == -1) {
                            j10 = elapsedRealtime4;
                        }
                        pfdVar5.e = j10;
                        pfdVar5.f = elapsedRealtime4;
                        sparseArray2.put(i, pfdVar5);
                    }
                    pfd pfdVar6 = sparseArray2.get(i);
                    if (pfdVar6 == null || (W0 = qfdVar.W0()) == null) {
                        return;
                    }
                    pfdVar6.a = W0;
                    sparseArray.put(i, pfdVar6);
                    sparseArray2.remove(i);
                }
            }
        }
    }

    @Override // xsna.b5r
    public final void b(int i, int i2) {
        SparseArray<pfd> sparseArray = this.c;
        int size = sparseArray.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            }
            int keyAt = sparseArray.keyAt(size);
            if (i > keyAt || keyAt > i2) {
                pfd valueAt = sparseArray.valueAt(size);
                long b = this.a.b(valueAt.a);
                l5m l5mVar = new l5m(null, null, 3);
                l5mVar.g = new SchemeStat$TypeDevNullItem(DevNullEventKey.CLIP_IN_FEED_PLAYBACK_TIMINGS.h(), null, null, Integer.valueOf((int) b), null, Integer.valueOf((int) valueAt.b), null, Integer.valueOf((int) valueAt.c), null, Integer.valueOf((int) valueAt.d), null, Integer.valueOf((int) valueAt.e), null, Integer.valueOf((int) valueAt.f), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -10922, 3, null);
                l5mVar.q();
                sparseArray.removeAt(size);
            }
        }
        SparseArray<pfd> sparseArray2 = this.b;
        for (int size2 = sparseArray2.size() - 1; -1 < size2; size2--) {
            int keyAt2 = sparseArray2.keyAt(size2);
            if (i > keyAt2 || keyAt2 > i2) {
                sparseArray2.removeAt(size2);
            }
        }
    }
}
