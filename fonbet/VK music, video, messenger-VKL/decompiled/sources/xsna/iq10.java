package xsna;

import ru.ok.media.logging.LoggerInterface;

/* compiled from: MediaCodecLoggerHelper.java */
/* loaded from: classes12.dex */
public final class iq10 {
    public final LoggerInterface a;
    public final String b;
    public long c;
    public String d;

    public iq10(String str, LoggerInterface loggerInterface) {
        this.a = loggerInterface;
        this.b = str;
    }

    public final void a(int i, String str) {
        StringBuilder b = ho8.b(str, ".");
        b.append(Integer.toString(i));
        String sb = b.toString();
        if (sb.equals(this.d)) {
            return;
        }
        b();
        this.d = sb;
        this.c = System.currentTimeMillis();
        this.a.logEvent(this.b.concat("_start"), this.d, null);
    }

    public final void b() {
        if (this.c > 0) {
            long min = Math.min(3600000L, System.currentTimeMillis() - this.c);
            this.a.logEvent(i5s.a(new StringBuilder(), this.b, "_stop"), this.d, Long.toString(min));
        }
    }
}
