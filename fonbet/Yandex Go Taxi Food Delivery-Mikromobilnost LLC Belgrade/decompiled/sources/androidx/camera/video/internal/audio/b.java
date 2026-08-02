package androidx.camera.video.internal.audio;

import defpackage.fh3;
import defpackage.ny61;

/* loaded from: classes10.dex */
public final /* synthetic */ class b implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ b(Object obj, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 1;
        boolean z = this.c;
        Object obj = this.b;
        switch (i) {
            case 0:
                d dVar = (d) obj;
                int ordinal = dVar.g.ordinal();
                if (ordinal == 0) {
                    dVar.b.set(null);
                    dVar.c.set(false);
                    dVar.d(AudioSource$InternalState.STARTED);
                    dVar.a.execute(new b(dVar, z, i2));
                    dVar.f();
                    break;
                } else if (ordinal == 2) {
                    ny61.f("AudioSource is released");
                    break;
                }
                break;
            case 1:
                d dVar2 = (d) obj;
                int ordinal2 = dVar2.g.ordinal();
                if (ordinal2 != 0 && ordinal2 != 1) {
                    if (ordinal2 == 2) {
                        ny61.f("AudioSource is released");
                        break;
                    }
                } else if (dVar2.r != z) {
                    dVar2.r = z;
                    if (dVar2.g == AudioSource$InternalState.STARTED) {
                        dVar2.a();
                        break;
                    }
                }
                break;
            default:
                d dVar3 = ((fh3) obj).a;
                dVar3.q = z;
                if (dVar3.g == AudioSource$InternalState.STARTED) {
                    dVar3.a();
                    break;
                }
                break;
        }
    }
}
