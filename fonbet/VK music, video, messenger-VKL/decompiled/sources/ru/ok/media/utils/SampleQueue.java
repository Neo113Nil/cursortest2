package ru.ok.media.utils;

import java.util.ArrayDeque;
import java.util.Deque;
import ru.ok.media.utils.SampleQueue.Sample;

/* loaded from: classes9.dex */
public class SampleQueue<Entry extends Sample> {
    private final int dropPercent;
    private final int maxFrames;
    private final int maxMS;
    private Deque<Entry> queue = new ArrayDeque();
    private boolean waitingSync;

    public static class Sample {
        private final boolean isKey;
        private final int timestamp;

        public Sample(int i, boolean z) {
            this.timestamp = i;
            this.isKey = z;
        }

        public int getTimestamp() {
            return this.timestamp;
        }

        public boolean isKey() {
            return this.isKey;
        }
    }

    public SampleQueue(int i, int i2, int i3) {
        this.maxFrames = i;
        this.maxMS = i2;
        this.dropPercent = i3;
    }

    private void dropTillKeyFrame() {
        this.waitingSync = true;
        while (true) {
            Entry peek = this.queue.peek();
            if (peek == null) {
                return;
            }
            if (peek.isKey()) {
                this.waitingSync = false;
                return;
            }
            this.queue.poll();
        }
    }

    public synchronized void add(Entry entry) {
        if (!this.waitingSync || entry.isKey()) {
            boolean z = false;
            this.waitingSync = false;
            this.queue.add(entry);
            boolean z2 = true;
            if (getBufferedTime() > this.maxMS) {
                do {
                    this.queue.poll();
                } while (getBufferedTime() > (this.maxMS * this.dropPercent) / 100);
                z = true;
            }
            if (this.queue.size() > this.maxFrames) {
                do {
                    this.queue.poll();
                } while (this.queue.size() > (this.maxFrames * this.dropPercent) / 100);
            } else {
                z2 = z;
            }
            if (z2) {
                dropTillKeyFrame();
            }
        }
    }

    public synchronized int getBufferedTime() {
        Entry peekLast = this.queue.peekLast();
        Entry peekFirst = this.queue.peekFirst();
        if (peekLast != null && peekFirst != null) {
            return peekLast.getTimestamp() - peekFirst.getTimestamp();
        }
        return 0;
    }

    public int getDeepnessMS() {
        return this.maxMS;
    }

    public synchronized Entry poll() {
        return this.queue.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0025, code lost:
    
        if (r0.getTimestamp() > r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return r4.queue.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public synchronized Entry pollIfDue(int i) {
        while (true) {
            try {
                Entry peek = this.queue.peek();
                if (peek != null) {
                    if (peek.getTimestamp() >= i - 1000) {
                        break;
                    }
                    this.queue.poll();
                    dropTillKeyFrame();
                } else {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
