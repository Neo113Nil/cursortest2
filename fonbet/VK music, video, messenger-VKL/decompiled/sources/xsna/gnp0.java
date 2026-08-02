package xsna;

import android.annotation.SuppressLint;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: TransitionValues.java */
/* loaded from: classes12.dex */
public final class gnp0 {

    @SuppressLint({"UnknownNullness"})
    public final View b;
    public final HashMap a = new HashMap();
    public final ArrayList<vlp0> c = new ArrayList<>();

    @Deprecated
    public gnp0() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof gnp0)) {
            return false;
        }
        gnp0 gnp0Var = (gnp0) obj;
        return this.b == gnp0Var.b && this.a.equals(gnp0Var.a);
    }

    public final int hashCode() {
        return this.a.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder b = ho8.b("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n", "    view = ");
        b.append(this.b);
        b.append("\n");
        String a = fo8.a(b.toString(), "    values:");
        HashMap hashMap = this.a;
        for (String str : hashMap.keySet()) {
            a = a + "    " + str + ": " + hashMap.get(str) + "\n";
        }
        return a;
    }

    public gnp0(View view) {
        this.b = view;
    }
}
