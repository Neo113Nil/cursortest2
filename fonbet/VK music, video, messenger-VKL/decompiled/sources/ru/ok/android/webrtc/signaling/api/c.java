package ru.ok.android.webrtc.signaling.api;

import xsna.ho8;

/* loaded from: classes9.dex */
public final class c {
    public final String a;
    public final long b;
    public long c = 200;
    public long d;

    public c(String str, long j) {
        this.a = str;
        this.b = j;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Command{seq:");
        sb.append(this.b);
        sb.append("|retry count:");
        sb.append(this.d);
        sb.append("|retry timeout:");
        sb.append(this.c);
        sb.append('|');
        return ho8.a(sb, this.a, '}');
    }
}
