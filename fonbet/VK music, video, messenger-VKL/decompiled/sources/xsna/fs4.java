package xsna;

import com.vk.music.stats.AdsAudioPixelsContainer;
import com.vk.music.stats.AdsPixel;
import com.vk.music.stats.AdsTrackerState;
import com.vk.statistic.DeprecatedStatisticUrl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.concurrent.ExecutorService;
import xsna.ry40;

/* compiled from: AudioPixelTrackerImpl.kt */
/* loaded from: classes3.dex */
public final class fs4 implements cs4 {
    public final ExecutorService a;

    public fs4() {
        asu0.a.getClass();
        this.a = asu0.j();
    }

    public static void d(AdsPixel adsPixel, boolean z) {
        if (z && adsPixel.b) {
            return;
        }
        com.vkontakte.android.data.b.p(new DeprecatedStatisticUrl(adsPixel.getUrl(), adsPixel.getType(), adsPixel.zb()));
        adsPixel.b = true;
    }

    @Override // xsna.cs4
    public final void a(ry40 ry40Var) {
        AdsAudioPixelsContainer adsAudioPixelsContainer;
        p4b0 p4b0Var = ry40Var.c;
        boolean z = ry40Var instanceof ry40.e.b;
        ExecutorService executorService = this.a;
        if (z) {
            AdsAudioPixelsContainer adsAudioPixelsContainer2 = p4b0Var.b.e.c;
            if (adsAudioPixelsContainer2 == null || adsAudioPixelsContainer2.c.isEmpty()) {
                return;
            }
            executorService.submit(new ds4(adsAudioPixelsContainer2, this));
            return;
        }
        if (ry40Var instanceof ry40.e.a) {
            q4b0 q4b0Var = p4b0Var.b;
            long j = q4b0Var.d;
            final long j2 = ((ry40.e.a) ry40Var).e;
            final AdsAudioPixelsContainer adsAudioPixelsContainer3 = q4b0Var.e.c;
            if (adsAudioPixelsContainer3 != null) {
                final int b = j != 0 ? an10.b((j2 / j) * 100) : 0;
                PriorityQueue<AdsPixel.Reached> priorityQueue = adsAudioPixelsContainer3.e;
                if (priorityQueue.isEmpty() || ((AdsPixel.Reached) j5g.X(priorityQueue)).f > j2) {
                    PriorityQueue<AdsPixel.Reached> priorityQueue2 = adsAudioPixelsContainer3.f;
                    if (priorityQueue2.isEmpty() || ((AdsPixel.Reached) j5g.X(priorityQueue2)).f > b) {
                        return;
                    }
                }
                executorService.submit(new Runnable(j2, this, b) { // from class: xsna.es4
                    public final /* synthetic */ long c;
                    public final /* synthetic */ int d;

                    {
                        this.d = b;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        PriorityQueue<AdsPixel.Reached> priorityQueue3;
                        while (true) {
                            AdsAudioPixelsContainer adsAudioPixelsContainer4 = AdsAudioPixelsContainer.this;
                            PriorityQueue<AdsPixel.Reached> priorityQueue4 = adsAudioPixelsContainer4.e;
                            priorityQueue3 = adsAudioPixelsContainer4.f;
                            AdsPixel.Reached reached = null;
                            if (!priorityQueue4.isEmpty()) {
                                long j3 = ((AdsPixel.Reached) j5g.X(priorityQueue4)).f;
                                long j4 = this.c;
                                if (j3 > j4) {
                                    break;
                                }
                                PriorityQueue<AdsPixel.Reached> priorityQueue5 = adsAudioPixelsContainer4.e;
                                if (!priorityQueue5.isEmpty() && ((AdsPixel.Reached) j5g.X(priorityQueue5)).f <= j4) {
                                    reached = priorityQueue5.poll();
                                }
                                if (reached == null) {
                                    return;
                                } else {
                                    fs4.d(reached, true);
                                }
                            } else {
                                break;
                            }
                        }
                        while (!priorityQueue3.isEmpty()) {
                            long j5 = ((AdsPixel.Reached) j5g.X(priorityQueue3)).f;
                            int i = this.d;
                            if (j5 > i) {
                                return;
                            }
                            AdsPixel.Reached poll = (priorityQueue3.isEmpty() || ((AdsPixel.Reached) j5g.X(priorityQueue3)).f > ((long) i)) ? null : priorityQueue3.poll();
                            if (poll == null) {
                                return;
                            } else {
                                fs4.d(poll, true);
                            }
                        }
                    }
                });
                return;
            }
            return;
        }
        if (!(ry40Var instanceof ry40.d)) {
            if (!(ry40Var instanceof ry40.b.a) || (adsAudioPixelsContainer = p4b0Var.b.e.c) == null) {
                return;
            }
            ArrayList<AdsPixel.Secondary> arrayList = adsAudioPixelsContainer.g;
            ArrayList arrayList2 = new ArrayList();
            Iterator<AdsPixel.Secondary> it = arrayList.iterator();
            while (it.hasNext()) {
                AdsPixel.Secondary next = it.next();
                if (next instanceof AdsPixel.Secondary.Error) {
                    arrayList2.add(next);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                d((AdsPixel.Secondary) it2.next(), true);
            }
            return;
        }
        AdsAudioPixelsContainer adsAudioPixelsContainer4 = p4b0Var.b.e.c;
        if (adsAudioPixelsContainer4 != null) {
            AdsTrackerState adsTrackerState = adsAudioPixelsContainer4.b;
            if (adsTrackerState.b) {
                adsTrackerState.b = false;
                ArrayList<AdsPixel.Secondary> arrayList3 = adsAudioPixelsContainer4.g;
                ArrayList arrayList4 = new ArrayList();
                Iterator<AdsPixel.Secondary> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    AdsPixel.Secondary next2 = it3.next();
                    if (next2 instanceof AdsPixel.Secondary.Paused) {
                        arrayList4.add(next2);
                    }
                }
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    d((AdsPixel.Secondary) it4.next(), false);
                }
            }
        }
    }

    @Override // xsna.cs4
    public final void b(ry40 ry40Var) {
        AdsAudioPixelsContainer adsAudioPixelsContainer = ry40Var.c.b.e.c;
        if (adsAudioPixelsContainer == null || adsAudioPixelsContainer.d.isEmpty()) {
            return;
        }
        this.a.submit(new nx3(adsAudioPixelsContainer, this));
    }

    @Override // xsna.cs4
    public final void c(AdsAudioPixelsContainer adsAudioPixelsContainer) {
        AdsTrackerState adsTrackerState = adsAudioPixelsContainer.b;
        if (adsTrackerState.b) {
            return;
        }
        adsTrackerState.b = true;
        ArrayList<AdsPixel.Secondary> arrayList = adsAudioPixelsContainer.g;
        ArrayList arrayList2 = new ArrayList();
        Iterator<AdsPixel.Secondary> it = arrayList.iterator();
        while (it.hasNext()) {
            AdsPixel.Secondary next = it.next();
            if (next instanceof AdsPixel.Secondary.Resumed) {
                arrayList2.add(next);
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            d((AdsPixel.Secondary) it2.next(), false);
        }
    }
}
