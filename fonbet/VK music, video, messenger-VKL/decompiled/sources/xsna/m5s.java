package xsna;

import android.content.Context;
import java.util.List;
import java.util.concurrent.Callable;
import xsna.o5s;

/* compiled from: FontRequestWorker.java */
/* loaded from: classes11.dex */
public final class m5s implements Callable<o5s.a> {
    public final /* synthetic */ String b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ List d;
    public final /* synthetic */ int e;

    public m5s(Context context, List list, String str, int i) {
        this.b = str;
        this.c = context;
        this.d = list;
        this.e = i;
    }

    @Override // java.util.concurrent.Callable
    public final o5s.a call() throws Exception {
        try {
            return o5s.b(this.c, this.d, this.b, this.e);
        } catch (Throwable unused) {
            return new o5s.a(-3);
        }
    }
}
