package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayDeque;
import java.util.Objects;
import one.video.player.live.DebugInfo;
import xsna.j0h0.a;
import xsna.oqg0;

/* compiled from: SampleQueue.java */
/* loaded from: classes8.dex */
public final class j0h0<Entry extends a> {
    public final int a;
    public final int b;
    public final boolean f;
    public final DebugInfo h;
    public final ArrayDeque e = new ArrayDeque();
    public boolean g = true;
    public final int c = 20;
    public boolean d = true;

    /* compiled from: SampleQueue.java */
    public static class a implements Comparable<a> {
        public int b;
        public final boolean c;

        public a(int i, boolean z) {
            this.b = i;
            this.c = z;
        }

        public int a() {
            return this.b;
        }

        @Override // java.lang.Comparable
        public final int compareTo(a aVar) {
            return Integer.compare(this.b, aVar.b);
        }
    }

    public j0h0(int i, int i2, boolean z, @Nullable DebugInfo debugInfo) {
        this.a = i;
        this.b = i2;
        this.f = z;
        this.h = debugInfo;
    }

    public final synchronized void a(oqg0.c cVar) {
        a aVar;
        boolean z = false;
        if (this.d) {
            if (!cVar.c) {
                if (this.h != null) {
                    Objects.toString(DebugInfo.PacketDropReason.WAITING_KEY_FRAME);
                }
                return;
            }
            this.d = false;
        }
        boolean z2 = true;
        if (!this.e.isEmpty() && (aVar = (a) this.e.getLast()) != null && aVar.a() > cVar.d) {
            if (this.f && this.g && aVar.c && this.e.size() == 1 && !cVar.c) {
                this.g = false;
                aVar.b = cVar.d - 33;
            } else {
                while (!this.e.isEmpty()) {
                    a aVar2 = (a) this.e.removeLast();
                    if (aVar2 != null) {
                        if (this.f && aVar2.c && !cVar.c) {
                            this.e.addLast(aVar2);
                            if (this.h != null) {
                                Objects.toString(DebugInfo.PacketDropReason.TIMESTAMP_ORDER_NON_KEY_FRAME);
                            }
                            return;
                        } else if (this.h != null) {
                            Objects.toString(DebugInfo.PacketDropReason.TIMESTAMP_ORDER);
                        }
                    }
                }
                if (!cVar.c) {
                    this.d = true;
                    if (this.h != null) {
                        Objects.toString(DebugInfo.PacketDropReason.WAITING_KEY_FRAME);
                    }
                    return;
                }
            }
        }
        this.e.add(cVar);
        if (this.e.size() > 1) {
            this.g = false;
        }
        if (d() > this.b) {
            do {
                a aVar3 = (a) this.e.poll();
                if (this.h != null) {
                    aVar3.getClass();
                    Objects.toString(DebugInfo.PacketDropReason.ADD_TIMESTAMP_OVERFLOW);
                }
            } while (d() > (this.b * this.c) / 100);
            z = true;
        }
        if (this.e.size() > this.a) {
            do {
                a aVar4 = (a) this.e.poll();
                if (this.h != null) {
                    aVar4.getClass();
                    Objects.toString(DebugInfo.PacketDropReason.ADD_FRAME_OVERFLOW);
                }
            } while (this.e.size() > (this.a * this.c) / 100);
        } else {
            z2 = z;
        }
        if (z2) {
            b();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0012, code lost:
    
        r2.d = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void b() {
        try {
            this.d = true;
            while (true) {
                a aVar = (a) this.e.peek();
                if (aVar == null) {
                    break;
                }
                if (aVar.c) {
                    break;
                }
                a aVar2 = (a) this.e.poll();
                if (this.h != null) {
                    aVar2.getClass();
                    Objects.toString(DebugInfo.PacketDropReason.TILL_KEYFRAME);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized int c() {
        return this.e.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[Catch: all -> 0x0021, TryCatch #0 {all -> 0x0021, blocks: (B:3:0x0001, B:7:0x0017, B:8:0x0024, B:10:0x0028, B:15:0x0039, B:16:0x003b), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized int d() {
        int i;
        DebugInfo debugInfo;
        try {
            a aVar = (a) this.e.peekLast();
            a aVar2 = (a) this.e.peekFirst();
            boolean z = false;
            if (aVar != null && aVar2 != null) {
                i = aVar.a() - aVar2.a();
                debugInfo = this.h;
                if (debugInfo != null) {
                    boolean z2 = this.f;
                    int size = this.e.size();
                    boolean[] zArr = debugInfo.c;
                    if (i == 0 && size == 0) {
                        z = true;
                    }
                    if (z) {
                        boolean z3 = zArr[z2 ? 1 : 0];
                    }
                    zArr[z2 ? 1 : 0] = z;
                }
            }
            i = 0;
            debugInfo = this.h;
            if (debugInfo != null) {
            }
        } catch (Throwable th) {
            throw th;
        }
        return i;
    }

    public final synchronized Entry e() {
        return (Entry) this.e.peek();
    }

    public final synchronized Entry f(int i) {
        a aVar = (a) this.e.peek();
        if (aVar == null) {
            return null;
        }
        if (aVar.a() > i) {
            return null;
        }
        return (Entry) this.e.poll();
    }
}
