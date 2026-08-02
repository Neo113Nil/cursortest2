package xsna;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: JobSupport.kt */
/* loaded from: classes11.dex */
public class gyx extends pyx implements s7i {
    public final boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyx(eyx eyxVar) {
        super(true);
        boolean z = true;
        f0(eyxVar);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = pyx.c;
        r9c r9cVar = (r9c) atomicReferenceFieldUpdater.get(this);
        s9c s9cVar = r9cVar instanceof s9c ? (s9c) r9cVar : null;
        if (s9cVar != null) {
            pyx pyxVar = s9cVar.e;
            pyxVar = pyxVar == null ? null : pyxVar;
            if (pyxVar != null) {
                while (!pyxVar.Z()) {
                    r9c r9cVar2 = (r9c) atomicReferenceFieldUpdater.get(pyxVar);
                    s9c s9cVar2 = r9cVar2 instanceof s9c ? (s9c) r9cVar2 : null;
                    if (s9cVar2 != null) {
                        pyxVar = s9cVar2.e;
                        if (pyxVar == null) {
                            pyxVar = null;
                        }
                        if (pyxVar == null) {
                        }
                    }
                }
                this.d = z;
            }
        }
        z = false;
        this.d = z;
    }

    @Override // xsna.pyx
    public final boolean Z() {
        return this.d;
    }

    @Override // xsna.pyx
    public final boolean b0() {
        return true;
    }
}
