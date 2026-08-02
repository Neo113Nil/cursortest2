package xsna;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* compiled from: ImageInfoImpl.java */
/* loaded from: classes12.dex */
public final class qjw implements mjw {
    public final int b;
    public final int c;
    public final Map<String, Object> d;

    public qjw(int i, int i2, HashMap hashMap) {
        this.b = i;
        this.c = i2;
        this.d = hashMap;
    }

    @Override // xsna.muu, xsna.kuu
    @NonNull
    public final Map<String, Object> getExtras() {
        return this.d;
    }

    @Override // xsna.mjw
    public final int getHeight() {
        return this.c;
    }

    @Override // xsna.mjw
    public final int getWidth() {
        return this.b;
    }
}
