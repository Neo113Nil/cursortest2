package defpackage;

import android.content.Context;
import androidx.appcompat.app.b;

/* loaded from: classes10.dex */
public final /* synthetic */ class fr2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ fr2(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Context context = this.b;
        switch (i) {
            case 0:
                b.a(context);
                break;
            default:
                b.syncRequestedAndStoredLocales(context);
                break;
        }
    }
}
