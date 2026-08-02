package xsna;

import android.graphics.Bitmap;
import com.my.tracker.obfuscated.e0;
import java.util.List;
import xsna.o2z0;
import xsna.uwl0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class v4h0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ v4h0(Object obj, Object obj2, Object obj3, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                cc ccVar = (cc) this.c;
                uwl0.a aVar = (uwl0.a) this.d;
                wm80 wm80Var = (wm80) this.e;
                if ((aVar instanceof uwl0.a.AbstractC3841a.C3842a) || (aVar instanceof uwl0.a.AbstractC3841a.e)) {
                    wm80Var.invoke();
                    ccVar.W5();
                    break;
                }
                break;
            case 1:
                ((com.my.tracker.obfuscated.e0) this.c).a((e0.c) this.d, (List) this.e);
                break;
            default:
                r1z0 r1z0Var = (r1z0) this.c;
                String str = (String) this.d;
                if (!r1z0Var.b(str, (o2z0.a) this.e)) {
                    r1z0Var.a(str, (Bitmap) new ibz0().d(str, null, null).c);
                    break;
                } else {
                    gu8.c(null, "ImageLoader: can't load. Image already loading");
                    break;
                }
        }
    }
}
