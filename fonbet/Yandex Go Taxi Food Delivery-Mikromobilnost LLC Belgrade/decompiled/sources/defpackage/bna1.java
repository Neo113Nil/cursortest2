package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.j;

/* loaded from: classes.dex */
public final class bna1 implements Runnable {
    public final /* synthetic */ j A;
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Bundle w;
    public final /* synthetic */ boolean x;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public bna1(j jVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.w = bundle;
        this.x = z;
        this.y = z2;
        this.z = z3;
        this.A = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.A.Pg(this.a, this.b, this.c, this.w, this.x, this.y, this.z);
    }
}
