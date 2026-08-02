package xsna;

import android.hardware.camera2.params.OutputConfiguration;
import android.view.Surface;
import androidx.annotation.NonNull;

/* compiled from: OutputConfigurationCompat.java */
/* loaded from: classes11.dex */
public final class m190 {
    public final n190 a;

    public m190(@NonNull Surface surface) {
        this.a = new n190(new OutputConfiguration(surface));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m190)) {
            return false;
        }
        return this.a.equals(((m190) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public m190(@NonNull n190 n190Var) {
        this.a = n190Var;
    }
}
