package xsna;

import com.vk.media.recorder.RecorderBase;
import xsna.mo9;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class ohf0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ ohf0(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                RecorderBase recorderBase = (RecorderBase) this.d;
                long j = this.c;
                mo9.b bVar = recorderBase.j;
                if (bVar != null) {
                    bVar.b(j);
                    break;
                }
                break;
            default:
                ((rfx) this.d).invoke(Long.valueOf(this.c));
                break;
        }
    }
}
