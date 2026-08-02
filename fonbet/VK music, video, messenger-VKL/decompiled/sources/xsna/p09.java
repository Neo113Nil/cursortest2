package xsna;

import com.ironsource.C4459nb;
import ru.ok.android.webrtc.Call;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes9.dex */
public final /* synthetic */ class p09 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p09(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((Call) this.d).a(this.c);
                break;
            default:
                C4459nb.a((C4459nb) this.d, this.c);
                break;
        }
    }
}
