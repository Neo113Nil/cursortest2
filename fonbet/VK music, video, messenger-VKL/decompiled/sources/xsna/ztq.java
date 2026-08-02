package xsna;

import android.content.Context;
import xsna.ltq;

/* compiled from: FcmUnknownError.kt */
/* loaded from: classes18.dex */
public class ztq extends ltq {
    public final Context g;
    public final String h;

    public ztq(Context context, Throwable th) {
        super(th);
        this.g = context;
        this.h = "FCM_UNKNOWN_ERROR";
    }

    public final ltq.a a() {
        m2j m2jVar = new m2j(this, 9);
        ltq ltqVar = ltq.this;
        ltqVar.c = m2jVar;
        ltq.a aVar = ltqVar.e;
        wtq wtqVar = new wtq();
        ltq ltqVar2 = ltq.this;
        ltqVar2.b = wtqVar;
        ltq.a aVar2 = ltqVar2.e;
        d80 d80Var = new d80(5);
        ltq ltqVar3 = ltq.this;
        ltqVar3.d = d80Var;
        return ltqVar3.e;
    }

    public String b() {
        return this.h;
    }
}
