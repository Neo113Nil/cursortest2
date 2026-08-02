package ru.ok.android.webrtc.utils;

import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.webrtc.RTCLog;

/* loaded from: classes9.dex */
public class Condition {
    public final String a;
    public final RTCLog d;
    public boolean b = false;
    public final ArrayList c = new ArrayList();
    public final AtomicLong e = new AtomicLong();

    public Condition(String str, RTCLog rTCLog) {
        this.a = str;
        this.d = rTCLog;
    }

    public void fire() {
        this.d.log("Condition", "Condition # " + this.a + " - 🔥 " + this.e.incrementAndGet());
        synchronized (this) {
            try {
                if (this.b) {
                    throw new IllegalStateException("Is already fired");
                }
                this.b = true;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    Pair pair = (Pair) obj;
                    this.d.log("Condition", "Condition # " + this.a + " - executing from queue " + ((String) pair.first) + " " + this.e.incrementAndGet());
                    ((Runnable) pair.second).run();
                }
                this.c.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean isFired() {
        return this.b;
    }

    public void reset() {
        synchronized (this) {
            try {
                if (!this.b) {
                    throw new IllegalStateException("Is not fired");
                }
                if (!this.c.isEmpty()) {
                    throw new IllegalStateException("Tasks exist");
                }
                this.b = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void run(String str, Runnable runnable) {
        synchronized (this) {
            try {
                if (this.b) {
                    this.d.log("Condition", "Condition # " + this.a + " - alreay fired. executing " + str + " " + this.e.incrementAndGet());
                    runnable.run();
                } else {
                    this.d.log("Condition", "Condition # " + this.a + " - queue " + str + " " + this.e.incrementAndGet());
                    this.c.add(new Pair(str, runnable));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
