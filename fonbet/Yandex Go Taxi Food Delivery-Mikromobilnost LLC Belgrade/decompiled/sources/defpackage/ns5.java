package defpackage;

import com.google.android.gms.internal.play_billing.g;

/* loaded from: classes.dex */
public final class ns5 {
    public int a;
    public String b;

    public static ms5 a() {
        ms5 ms5Var = new ms5();
        ms5Var.b = "";
        return ms5Var;
    }

    public final String toString() {
        return b64.l("Response Code: ", g.f(this.a), ", Debug Message: ", this.b);
    }
}
