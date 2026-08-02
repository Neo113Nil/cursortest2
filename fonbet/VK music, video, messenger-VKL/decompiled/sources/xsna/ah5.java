package xsna;

/* compiled from: AutoPlayConfigDelegate.kt */
/* loaded from: classes2.dex */
public final class ah5 implements p7f0 {
    public final Object b;
    public Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ ah5(Object obj, Object obj2, Object obj3, Object obj4) {
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // xsna.i7f0
    public Object getValue(Object obj, qcy qcyVar) {
        com.vk.libvideo.autoplay.a aVar = (com.vk.libvideo.autoplay.a) this.c;
        return aVar == null ? (com.vk.libvideo.autoplay.a) this.b : aVar;
    }

    @Override // xsna.p7f0
    public void setValue(Object obj, qcy qcyVar, Object obj2) {
        com.vk.libvideo.autoplay.a aVar = (com.vk.libvideo.autoplay.a) obj2;
        com.vk.libvideo.autoplay.a aVar2 = (com.vk.libvideo.autoplay.a) this.c;
        this.c = aVar;
        if (aVar2 == null) {
            ((vw4) this.d).invoke(aVar);
        } else {
            if (aVar2.equals(aVar)) {
                return;
            }
            ((j3s0) this.e).invoke(aVar2, aVar);
        }
    }

    public ah5(com.vk.libvideo.autoplay.a aVar, vw4 vw4Var, j3s0 j3s0Var) {
        this.b = aVar;
        this.d = vw4Var;
        this.e = j3s0Var;
    }
}
