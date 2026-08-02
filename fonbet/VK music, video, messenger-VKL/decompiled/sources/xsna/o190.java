package xsna;

import androidx.annotation.NonNull;
import java.util.Objects;

/* compiled from: OutputConfigurationCompatBaseImpl.java */
/* loaded from: classes11.dex */
public class o190 {
    public final Object a;

    public o190(@NonNull Object obj) {
        this.a = obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof o190)) {
            return false;
        }
        return Objects.equals(this.a, ((o190) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
