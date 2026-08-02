package xsna;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import kotlin.coroutines.d;

/* compiled from: WindowRecomposer.android.kt */
/* loaded from: classes11.dex */
public final class ha30 implements fa30 {
    public final Context b;
    public hpj c;
    public final kg50 d = androidx.compose.runtime.d.a(1.0f);
    public yok0 e;

    public ha30(Context context) {
        this.b = context;
    }

    @Override // kotlin.coroutines.d
    public final <R> R fold(R r, wzs<? super R, ? super d.b, ? extends R> wzsVar) {
        return wzsVar.invoke(r, this);
    }

    @Override // kotlin.coroutines.d
    public final <E extends d.b> E get(d.c<E> cVar) {
        return (E) d.b.a.a(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d minusKey(d.c<?> cVar) {
        return d.b.a.b(this, cVar);
    }

    @Override // kotlin.coroutines.d
    public final kotlin.coroutines.d plus(kotlin.coroutines.d dVar) {
        return d.a.a(this, dVar);
    }

    @Override // xsna.fa30
    public final float w() {
        ttk0<Float> ttk0Var;
        if (this.e == null) {
            Context context = this.b;
            ph50<Context, ttk0<Float>> ph50Var = xrx0.a;
            synchronized (ph50Var) {
                try {
                    ttk0<Float> d = ph50Var.d(context);
                    if (d == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        nm8 a = w0b.a(-1, null, null, 6);
                        d = rsr.w(new izg0(new vrx0(contentResolver, uriFor, new wrx0(a, Handler.createAsync(Looper.getMainLooper())), a, context, null)), zvj.b(), new brk0(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        ph50Var.p(context, d);
                    }
                    ttk0Var = d;
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((vak0) this.d).g(ttk0Var.getValue().floatValue());
            hpj hpjVar = this.c;
            if (hpjVar == null) {
                throw new IllegalStateException("MotionDurationScale scale factor requested before recomposer loop start");
            }
            this.e = myc0.h(hpjVar, null, null, new ga30(ttk0Var, this, null), 3);
        }
        return ((vak0) this.d).getFloatValue();
    }
}
