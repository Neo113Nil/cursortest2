package xsna;

import androidx.annotation.NonNull;
import xsna.qdg0;

/* compiled from: com.google.android.gms:play-services-basement@@18.10.0 */
/* loaded from: classes12.dex */
public class kbg0<T extends qdg0> {
    private qdg0 zza;

    public kbg0() {
    }

    @NonNull
    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(@NonNull T t) {
        this.zza = t;
    }

    public kbg0(@NonNull T t) {
        this.zza = t;
    }
}
