package ru.ok.gl.objects;

import androidx.annotation.NonNull;
import xsna.h5s;

/* loaded from: classes9.dex */
public class GLVersion {
    public final int majVersion;
    public final int minVersion;

    public GLVersion(int i, int i2) {
        this.majVersion = i;
        this.minVersion = i2;
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("GLVersion {major: ");
        sb.append(this.majVersion);
        sb.append(", minor: ");
        return h5s.c(this.minVersion, "}", sb);
    }

    public GLVersion(int i) {
        this(i, 0);
    }
}
