package xsna;

import android.content.Context;
import com.google.android.gms.maps.GoogleMapOptions;

/* compiled from: VKMapView.kt */
/* loaded from: classes3.dex */
public class pdr0 extends km00 implements jm00 {

    /* compiled from: VKMapView.kt */
    public static final class a implements g780 {
        public final /* synthetic */ ger0 a;

        public a(ger0 ger0Var) {
            this.a = ger0Var;
        }

        @Override // xsna.g780
        public final void a(s9u s9uVar) {
            this.a.a(new ndr0(s9uVar));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0033, code lost:
    
        if (r1 != 4) goto L15;
     */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public pdr0(Context context, xl00 xl00Var) {
        super(context, r0);
        int i;
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        googleMapOptions.n = Boolean.valueOf(xl00Var.a);
        googleMapOptions.g = Boolean.valueOf(xl00Var.b);
        googleMapOptions.l = Boolean.valueOf(xl00Var.c);
        googleMapOptions.m = Boolean.valueOf(xl00Var.d);
        int i2 = xl00Var.e;
        if (i2 != 0) {
            i = 1;
            if (i2 != 1) {
                int i3 = 2;
                if (i2 != 2) {
                    i3 = 3;
                    if (i2 != 3) {
                        i3 = 4;
                    }
                }
                i = i3;
            }
        } else {
            i = 0;
        }
        googleMapOptions.d = i;
        googleMapOptions.k = Boolean.valueOf(xl00Var.f);
        googleMapOptions.h = Boolean.valueOf(xl00Var.g);
        googleMapOptions.j = Boolean.valueOf(xl00Var.h);
        googleMapOptions.c = Boolean.valueOf(xl00Var.i);
        googleMapOptions.f = Boolean.valueOf(xl00Var.j);
    }

    @Override // xsna.jm00
    public final void a() {
        twz0 twz0Var = this.b;
        l4z l4zVar = twz0Var.a;
        if (l4zVar != null) {
            l4zVar.onPause();
        } else {
            twz0Var.c(5);
        }
    }

    @Override // xsna.jm00
    public final void b() {
        twz0 twz0Var = this.b;
        twz0Var.getClass();
        twz0Var.d(null, new eoz0(twz0Var));
    }

    @Override // xsna.jm00
    public final void c(ger0 ger0Var) {
        h(new a(ger0Var));
    }

    @Override // xsna.jm00
    public final void e() {
        twz0 twz0Var = this.b;
        twz0Var.getClass();
        twz0Var.d(null, new ioz0(twz0Var));
    }

    @Override // xsna.jm00
    public final void f() {
        twz0 twz0Var = this.b;
        l4z l4zVar = twz0Var.a;
        if (l4zVar != null) {
            l4zVar.onDestroy();
        } else {
            twz0Var.c(1);
        }
    }

    @Override // xsna.jm00
    public final void g() {
        twz0 twz0Var = this.b;
        l4z l4zVar = twz0Var.a;
        if (l4zVar != null) {
            l4zVar.onStop();
        } else {
            twz0Var.c(4);
        }
    }
}
