package defpackage;

import com.google.firebase.messaging.reporting.MessagingClientEvent$Event;
import com.google.firebase.messaging.reporting.MessagingClientEvent$MessageType;
import com.google.firebase.messaging.reporting.MessagingClientEvent$SDKPlatform;

/* loaded from: classes11.dex */
public final class nz10 {
    public long a;
    public String b;
    public String c;
    public MessagingClientEvent$MessageType d;
    public MessagingClientEvent$SDKPlatform e;
    public String f;
    public String g;
    public int h;
    public int i;
    public String j;
    public MessagingClientEvent$Event k;
    public String l;
    public String m;

    public final oz10 a() {
        return new oz10(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    public final void b(String str) {
        this.l = str;
    }

    public final void c(String str) {
        this.g = str;
    }

    public final void d(String str) {
        this.m = str;
    }

    public final void e(MessagingClientEvent$Event messagingClientEvent$Event) {
        this.k = messagingClientEvent$Event;
    }

    public final void f(String str) {
        this.c = str;
    }

    public final void g(String str) {
        this.b = str;
    }

    public final void h(MessagingClientEvent$MessageType messagingClientEvent$MessageType) {
        this.d = messagingClientEvent$MessageType;
    }

    public final void i(String str) {
        this.f = str;
    }

    public final void j(int i) {
        this.h = i;
    }

    public final void k(long j) {
        this.a = j;
    }

    public final void l(MessagingClientEvent$SDKPlatform messagingClientEvent$SDKPlatform) {
        this.e = messagingClientEvent$SDKPlatform;
    }

    public final void m(String str) {
        this.j = str;
    }

    public final void n(int i) {
        this.i = i;
    }
}
