package xsna;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: NoiseSuppressorControl.kt */
/* loaded from: classes7.dex */
public final class tbx0 implements p7f0<Object, Object> {
    public volatile Object b;
    public final /* synthetic */ vfe c;

    public tbx0(vfe vfeVar) {
        this.c = vfeVar;
    }

    @Override // xsna.i7f0
    public final Object getValue(Object obj, qcy<?> qcyVar) {
        return this.b;
    }

    @Override // xsna.p7f0
    public final void setValue(Object obj, qcy<?> qcyVar, Object obj2) {
        this.b = obj2;
        ((io.reactivex.rxjava3.subjects.d) ((ConcurrentHashMap) this.c.b).get(qcyVar.getName())).onNext(obj2);
    }
}
