package xsna;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Optional;
import one.video.calls.sdk_private.aG;

/* compiled from: AckGenerator.java */
/* loaded from: classes8.dex */
public class tdy0 {
    public final Clock a;
    public final aG b;
    public final hjy0 c;
    public final ArrayList d;
    public boolean e;
    public Instant f;
    public final HashMap g;
    public int h;

    public tdy0(aG aGVar, one.video.calls.sdk_private.x xVar) {
        Clock systemUTC = Clock.systemUTC();
        this.d = new ArrayList();
        this.g = new HashMap();
        this.h = 0;
        this.a = systemUTC;
        this.b = aGVar;
        this.c = xVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0070, code lost:
    
        r10 = r4.b;
        r12 = r5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r10 >= r12) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (r12 > r6) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007f, code lost:
    
        if (r8 < r10) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0089, code lost:
    
        if (r4.b(r5) != false) goto L88;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008f, code lost:
    
        if (r4.equals(r5) != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
    
        if (r4.b(r5) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009b, code lost:
    
        if (r5.b(r4) != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x009d, code lost:
    
        r6 = r4.a;
        r8 = r5.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a3, code lost:
    
        if (r6 > r8) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a5, code lost:
    
        r10 = r4.b;
        r12 = r5.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
    
        if (r10 >= r12) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00b2, code lost:
    
        if (r6 >= r12) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b6, code lost:
    
        if (r10 != r8) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b8, code lost:
    
        r5 = new xsna.jhy0(r6, r12 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ed, code lost:
    
        r3.set(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00bf, code lost:
    
        if (r6 <= r12) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c3, code lost:
    
        if (r10 <= r8) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00c5, code lost:
    
        r5 = new xsna.jhy0(r8 + 1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00cc, code lost:
    
        if (r6 != r12) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d0, code lost:
    
        if (r10 <= r8) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00d2, code lost:
    
        r5 = new xsna.jhy0(r8 + 1, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00d9, code lost:
    
        if (r6 >= r12) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00dd, code lost:
    
        if (r10 >= r8) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00df, code lost:
    
        r5 = new xsna.jhy0(r6, r12 - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00eb, code lost:
    
        throw new java.lang.IllegalStateException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00ec, code lost:
    
        r5 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00f7, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x00fd, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0103, code lost:
    
        throw new java.lang.IllegalArgumentException();
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x004c, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0081, code lost:
    
        r3.remove();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized void a(yby0 yby0Var) {
        try {
            Optional findFirst = yby0Var.e.stream().flatMap(new yvn()).filter(new ti40(this, 4)).findFirst();
            if (findFirst.isPresent()) {
                yby0 yby0Var2 = (yby0) this.g.get(findFirst.get());
                ArrayList arrayList = this.d;
                if (!arrayList.isEmpty()) {
                    ListIterator listIterator = arrayList.listIterator();
                    ListIterator<jhy0> listIterator2 = yby0Var2.e.listIterator();
                    jhy0 jhy0Var = (jhy0) listIterator.next();
                    loop0: while (listIterator2.hasNext()) {
                        jhy0 next = listIterator2.next();
                        while (true) {
                            long j = jhy0Var.a;
                            long j2 = next.b;
                            if (j <= j2) {
                                break;
                            } else if (!listIterator.hasNext()) {
                                break loop0;
                            } else {
                                jhy0Var = (jhy0) listIterator.next();
                            }
                        }
                    }
                }
                this.g.keySet().removeIf(new c86(findFirst, 2));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void b(yby0 yby0Var, long j) {
        this.g.put(Long.valueOf(j), yby0Var);
        this.e = false;
        this.f = null;
        this.h = 0;
    }

    public synchronized void c(tly0 tly0Var) {
        try {
            if (tly0Var.r()) {
                jhy0.a(this.d, tly0Var.p().longValue());
                if (tly0Var.s()) {
                    this.e = true;
                    if (this.f == null) {
                        this.f = this.a.instant();
                    }
                    aG aGVar = this.b;
                    if (aGVar != aG.c) {
                        ((one.video.calls.sdk_private.x) this.c).d(aGVar, 0);
                        return;
                    }
                    int i = this.h + 1;
                    this.h = i;
                    if (i >= 2) {
                        ((one.video.calls.sdk_private.x) this.c).d(aGVar, 0);
                        this.h = 0;
                        return;
                    }
                    ((one.video.calls.sdk_private.x) this.c).d(aGVar, 20);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean d() {
        return !this.d.isEmpty();
    }

    public synchronized boolean e() {
        return this.e;
    }

    public final synchronized Optional<yby0> f() {
        int millis;
        try {
            Instant instant = this.f;
            int i = 0;
            if (instant != null && this.b == aG.c && (millis = (int) Duration.between(instant, this.a.instant()).toMillis()) >= 0) {
                i = millis;
            }
            return !this.d.isEmpty() ? Optional.of(new yby0(this.d, i)) : Optional.empty();
        } catch (Throwable th) {
            throw th;
        }
    }
}
