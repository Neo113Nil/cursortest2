package xsna;

import java.util.Date;
import one.video.calls.sdk_private.f;

/* compiled from: NewSessionTicket.java */
/* loaded from: classes8.dex */
public final class soy0 {
    public byte[] a;
    public Date b;
    public long c;
    public byte[] d;
    public int e;
    public f.b f;

    public final int a() {
        return Integer.max(0, ((int) ((this.b.getTime() + (this.e * 1000)) - new Date().getTime())) / 1000);
    }

    public final String toString() {
        return "Ticket, creation date = " + this.b + ", ticket lifetime = " + this.e + (a() > 0 ? tgw.b(a(), " (still valid for ", " seconds)") : " (not valid anymore)");
    }
}
