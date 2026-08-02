package defpackage;

import android.util.Log;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.HttpException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

/* loaded from: classes10.dex */
public final class mw60 implements gog, al7 {
    public final xf7 a;
    public final cit b;
    public wge c;
    public rvj0 w;
    public fog x;
    public volatile yf7 y;

    public mw60(xf7 xf7Var, cit citVar) {
        this.a = xf7Var;
        this.b = citVar;
    }

    @Override // defpackage.gog
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.gog
    public final void b(Priority priority, fog fogVar) {
        t4j0 t4j0Var = new t4j0();
        t4j0Var.h(this.b.d());
        for (Map.Entry entry : this.b.b.getHeaders().entrySet()) {
            t4j0Var.a((String) entry.getKey(), (String) entry.getValue());
        }
        d5j0 d5j0Var = new d5j0(t4j0Var);
        this.x = fogVar;
        this.y = this.a.newCall(d5j0Var);
        this.y.I(this);
    }

    @Override // defpackage.gog
    public final DataSource c() {
        return DataSource.REMOTE;
    }

    @Override // defpackage.gog
    public final void cancel() {
        yf7 yf7Var = this.y;
        if (yf7Var != null) {
            yf7Var.cancel();
        }
    }

    @Override // defpackage.gog
    public final void cleanup() {
        try {
            wge wgeVar = this.c;
            if (wgeVar != null) {
                wgeVar.close();
            }
        } catch (IOException unused) {
        }
        rvj0 rvj0Var = this.w;
        if (rvj0Var != null) {
            rvj0Var.close();
        }
        this.x = null;
    }

    @Override // defpackage.al7
    public final void onFailure(yf7 yf7Var, IOException iOException) {
        Log.isLoggable("OkHttpFetcher", 3);
        this.x.e(iOException);
    }

    @Override // defpackage.al7
    public final void onResponse(yf7 yf7Var, kvj0 kvj0Var) {
        rvj0 rvj0Var = kvj0Var.z;
        this.w = rvj0Var;
        if (!kvj0Var.J) {
            this.x.e(new HttpException(kvj0Var.w, null, kvj0Var.c));
        } else {
            z2a1.e(rvj0Var, "Argument must not be null");
            wge wgeVar = new wge(this.w.byteStream(), rvj0Var.contentLength());
            this.c = wgeVar;
            this.x.d(wgeVar);
        }
    }
}
