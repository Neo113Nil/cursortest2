package xsna;

import xsna.qv4;

/* compiled from: AudioRecordState.kt */
/* loaded from: classes2.dex */
public final class av4 {
    public final io.reactivex.rxjava3.subjects.d<qv4> a = io.reactivex.rxjava3.subjects.d.O0(qv4.c.a);

    public final void a() {
        this.a.onNext(qv4.c.a);
    }

    public final qv4 b() {
        return this.a.P0();
    }
}
