package xsna;

import android.content.Context;
import ru.mail.libverify.api.VerificationFactory;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class bnr0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bnr0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.b) {
            case 0:
                VerificationFactory.b((Context) this.c);
                break;
            default:
                com.my.tracker.obfuscated.p0.a((com.my.tracker.obfuscated.p0) this.c);
                break;
        }
    }
}
