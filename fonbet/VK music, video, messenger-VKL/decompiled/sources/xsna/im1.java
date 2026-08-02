package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import java.util.Iterator;

/* compiled from: AlbumsDataProvider.kt */
/* loaded from: classes15.dex */
public final class im1 {
    public final io.reactivex.rxjava3.disposables.b a;
    public final int b;
    public final String c;
    public final defpackage.m d;
    public final yz10 e;
    public final hm1 f = new hm1(this, new Handler(Looper.getMainLooper()));
    public boolean g;
    public boolean h;
    public final ContentResolver i;

    public im1(Context context, io.reactivex.rxjava3.disposables.b bVar, int i, String str, defpackage.m mVar) {
        this.a = bVar;
        this.b = i;
        this.c = str;
        this.d = mVar;
        this.e = iz10.a(context);
        this.i = context.getContentResolver();
    }

    public final void a() {
        b();
        if (!this.g) {
            int i = this.b;
            Iterator it = (i != 111 ? i != 222 ? i != 333 ? h020.c : h020.b : h020.a : h020.c).iterator();
            while (it.hasNext()) {
                this.i.registerContentObserver((Uri) it.next(), true, this.f);
            }
            this.g = true;
        }
        if (this.h) {
            return;
        }
        this.a.b(new io.reactivex.rxjava3.disposables.f(new sb(this, 1)));
        this.h = true;
    }

    public final void b() {
        this.a.b(this.e.b(this.b, this.c).subscribe(new jv(this.d, 2), new v8(new u8(this, 3), 4)));
    }
}
