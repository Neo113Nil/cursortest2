package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class jvn implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ jvn(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                ((io.reactivex.rxjava3.core.c) this.c).onComplete();
                break;
            case 1:
                n3w n3wVar = (n3w) this.c;
                n3wVar.m = new q5o0(n3wVar);
                break;
            case 2:
                ((qlm) ((ph20) this.c).e.getValue()).b();
                break;
            default:
                Context context = (Context) this.c;
                boolean z = pmr0.a;
                Preference.I("vendor", "hms_services_available", false);
                asu0.a.getClass();
                asu0.o().execute(new wcn(context, 2));
                break;
        }
    }
}
