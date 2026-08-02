package xsna;

import androidx.annotation.NonNull;
import java.lang.Thread;
import java.util.Iterator;
import xsna.b9o;

/* compiled from: DownloadManager.java */
/* loaded from: classes3.dex */
public final class a9o implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ b9o a;

    public a9o(b9o b9oVar) {
        this.a = b9oVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(@NonNull Thread thread, @NonNull Throwable th) {
        Iterator<b9o.c> it = this.a.c.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }
}
