package defpackage;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes11.dex */
public final class fsy0 {
    public static final fsy0 c;
    public final AtomicReference a = new AtomicReference();
    public final String b = "taser_tflite_gocrlatin_mbv2_scriptid_aksara_layout_gcn_mobile";

    static {
        new esy0();
        c = new fsy0();
    }

    public final boolean a() {
        AtomicReference atomicReference = this.a;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean z = gan.a(qk20.c().b(), "com.google.mlkit.dynamite.text.latin") > 0;
        atomicReference.set(Boolean.valueOf(z));
        return z;
    }

    public final String b() {
        return true != a() ? "play-services-mlkit-text-recognition" : "text-recognition";
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fsy0) {
            return ooc.m(null, null);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{null});
    }
}
