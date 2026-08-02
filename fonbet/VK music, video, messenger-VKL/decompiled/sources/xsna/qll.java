package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.audio.d;
import androidx.media3.exoplayer.video.c;
import java.util.ArrayList;
import xsna.cc7;

/* compiled from: DefaultRenderersFactory.java */
/* loaded from: classes12.dex */
public class qll implements izf0 {
    public final Context a;
    public final androidx.media3.exoplayer.mediacodec.b b;
    public boolean c;
    public androidx.media3.exoplayer.mediacodec.e d = androidx.media3.exoplayer.mediacodec.e.T6;

    public qll(Context context) {
        this.a = context;
        this.b = new androidx.media3.exoplayer.mediacodec.b(context);
    }

    @Override // xsna.izf0
    public final androidx.media3.exoplayer.j[] a(Handler handler, androidx.media3.exoplayer.video.g gVar, androidx.media3.exoplayer.audio.b bVar, ako0 ako0Var, ui20 ui20Var) {
        ArrayList arrayList = new ArrayList();
        e(this.a, this.d, this.c, handler, gVar, arrayList);
        Context context = this.a;
        androidx.media3.exoplayer.audio.d c = c(context);
        androidx.media3.exoplayer.mediacodec.e eVar = this.d;
        boolean z = this.c;
        arrayList.add(new androidx.media3.exoplayer.audio.f(this.a, this.b, eVar, z, handler, bVar, c));
        d(ako0Var, handler.getLooper(), arrayList);
        Looper looper = handler.getLooper();
        arrayList.add(new wi20(ui20Var, looper));
        arrayList.add(new wi20(ui20Var, looper));
        arrayList.add(new lj9());
        arrayList.add(new jlw(new cc7.a(context)));
        return (androidx.media3.exoplayer.j[]) arrayList.toArray(new androidx.media3.exoplayer.j[0]);
    }

    @Override // xsna.izf0
    @Nullable
    public final void b(androidx.media3.exoplayer.j jVar) {
        jVar.getClass();
    }

    @Nullable
    public androidx.media3.exoplayer.audio.d c(Context context) {
        return new d.c(context).a();
    }

    public void d(ako0 ako0Var, Looper looper, ArrayList arrayList) {
        arrayList.add(new uko0(ako0Var, looper, p0n0.a));
    }

    public void e(Context context, androidx.media3.exoplayer.mediacodec.e eVar, boolean z, Handler handler, androidx.media3.exoplayer.video.g gVar, ArrayList arrayList) {
        c.C0068c c0068c = new c.C0068c(context);
        c0068c.d = this.b;
        c0068c.c = eVar;
        c0068c.e = 5000L;
        c0068c.f = z;
        c0068c.g = handler;
        c0068c.h = gVar;
        c0068c.i = 50;
        fxc0.z(!c0068c.b);
        Handler handler2 = c0068c.g;
        fxc0.z((handler2 == null && c0068c.h == null) || !(handler2 == null || c0068c.h == null));
        c0068c.b = true;
        arrayList.add(new androidx.media3.exoplayer.video.c(c0068c));
    }
}
