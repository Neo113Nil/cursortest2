package xsna;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
/* loaded from: classes13.dex */
public final class ke01 implements Runnable {
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Bundle e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ bf01 i;

    public ke01(bf01 bf01Var, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.i = bf01Var;
        this.b = str;
        this.c = str2;
        this.d = j;
        this.e = bundle;
        this.f = z;
        this.g = z2;
        this.h = z3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.i.t(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }
}
