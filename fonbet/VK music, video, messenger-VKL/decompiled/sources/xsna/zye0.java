package xsna;

import android.content.Context;
import com.getkeepsafe.relinker.MissingLibraryException;
import xsna.yye0;

/* compiled from: ReLinkerInstance.java */
/* loaded from: classes12.dex */
public final class zye0 implements Runnable {
    public final /* synthetic */ Context b;
    public final /* synthetic */ String c;
    public final /* synthetic */ yye0.a d;
    public final /* synthetic */ bze0 e;

    public zye0(bze0 bze0Var, Context context, String str, yye0.a aVar) {
        this.e = bze0Var;
        this.b = context;
        this.c = str;
        this.d = aVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yye0.a aVar = this.d;
        try {
            this.e.b(this.b, this.c);
            aVar.b();
        } catch (MissingLibraryException e) {
            aVar.d(e);
        } catch (UnsatisfiedLinkError e2) {
            aVar.d(e2);
        }
    }
}
