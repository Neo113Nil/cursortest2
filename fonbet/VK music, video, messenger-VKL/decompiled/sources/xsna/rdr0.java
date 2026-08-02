package xsna;

import com.google.android.gms.maps.model.MarkerOptions;

/* compiled from: VKMarkerOptions.kt */
/* loaded from: classes3.dex */
public final class rdr0 {
    public final MarkerOptions a;

    public rdr0() {
        this(0);
    }

    public final rdr0 a(sb7 sb7Var) {
        jar0 jar0Var = (jar0) sb7Var;
        this.a.e = jar0Var != null ? jar0Var.a : null;
        return this;
    }

    public final rdr0 b(edr0 edr0Var) {
        this.a.b = edi.B(edr0Var);
        return this;
    }

    public rdr0(MarkerOptions markerOptions) {
        this.a = markerOptions;
    }

    public /* synthetic */ rdr0(int i) {
        this(new MarkerOptions());
    }
}
