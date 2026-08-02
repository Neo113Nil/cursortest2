package xsna;

import kotlin.Pair;
import xsna.a05;

/* compiled from: AudioWaveFromFileController.kt */
/* loaded from: classes18.dex */
public final class h05 implements a05.a {
    public final /* synthetic */ io.reactivex.rxjava3.core.r<Pair<Integer, float[]>> a;

    public h05(io.reactivex.rxjava3.core.r<Pair<Integer, float[]>> rVar) {
        this.a = rVar;
    }

    @Override // xsna.a05.a
    public final void a(Exception exc) {
        io.reactivex.rxjava3.core.r<Pair<Integer, float[]>> rVar = this.a;
        if (rVar.h()) {
            return;
        }
        rVar.onError(exc);
    }

    @Override // xsna.a05.a
    public final void b(float[] fArr) {
        io.reactivex.rxjava3.core.r<Pair<Integer, float[]>> rVar = this.a;
        if (rVar.h()) {
            return;
        }
        rVar.onNext(new Pair<>(Integer.valueOf(fArr.length), fArr));
        rVar.onComplete();
    }

    @Override // xsna.a05.a
    public final void c(int i, float[] fArr) {
        io.reactivex.rxjava3.core.r<Pair<Integer, float[]>> rVar = this.a;
        if (rVar.h()) {
            return;
        }
        rVar.onNext(new Pair<>(Integer.valueOf(i), fArr));
    }
}
