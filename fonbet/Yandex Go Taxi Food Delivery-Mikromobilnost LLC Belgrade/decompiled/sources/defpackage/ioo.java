package defpackage;

import android.content.Context;
import androidx.media3.exoplayer.f;

/* loaded from: classes7.dex */
public final class ioo {
    public final Context a;
    public final xxc0 b;
    public final zdh c;
    public f d;

    public ioo(Context context, xxc0 xxc0Var, zdh zdhVar) {
        this.a = context;
        this.b = xxc0Var;
        this.c = zdhVar;
    }

    public final long a() {
        f fVar = this.d;
        if (fVar != null && fVar.getDuration() > 0) {
            return fVar.getDuration();
        }
        return 1L;
    }

    public final void b() {
        if (this.d != null) {
            return;
        }
        Context context = this.a;
        ono onoVar = new ono(context, new seh(2, new rih(context)), new tf3(context, 3));
        vmh vmhVar = new vmh(context);
        d6z.x(!onoVar.y);
        onoVar.e = new seh(1, vmhVar);
        d6z.x(!onoVar.y);
        onoVar.f = new seh(9, this.c);
        f a = onoVar.a();
        a.m.a(this.b);
        this.d = a;
        a.setVolume(0.0f);
    }

    public final void c(boolean z) {
        f fVar = this.d;
        if (fVar != null) {
            fVar.setPlayWhenReady(z);
        }
    }
}
