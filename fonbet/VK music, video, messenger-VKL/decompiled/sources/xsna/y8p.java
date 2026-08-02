package xsna;

import ru.ok.gleffects.EffectHolder;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class y8p implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ y8p(Object obj, long j, int i) {
        this.b = i;
        this.d = obj;
        this.c = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((EffectHolder) this.d).lambda$applyRecordingTime$5(this.c);
                break;
            default:
                zvr zvrVar = (zvr) this.d;
                zvrVar.b.execute(new f6r(zvrVar, this.c, 1));
                break;
        }
    }
}
