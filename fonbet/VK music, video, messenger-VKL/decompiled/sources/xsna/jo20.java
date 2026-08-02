package xsna;

import xsna.jlq;

/* compiled from: OneVideoPlayerFactory.kt */
/* loaded from: classes3.dex */
public final class jo20 {
    public final jlq.b a;

    public jo20(jlq.b bVar) {
        this.a = bVar;
    }

    public final long a(long j) {
        jlq.b bVar = this.a;
        return j < 4500000 ? bVar.a : j < 7500000 ? bVar.b : j < 10500000 ? bVar.c : bVar.d;
    }
}
