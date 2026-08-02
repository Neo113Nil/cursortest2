package ru.ok.android.webrtc.participant;

import androidx.annotation.NonNull;
import java.util.Objects;
import xsna.vu5;

/* loaded from: classes9.dex */
public final class CallExternalId {
    public final String a;
    public final Type b;
    public final int c;

    public enum Type {
        UNKNOWN,
        VK,
        ANONYM
    }

    public CallExternalId(@NonNull String str, @NonNull Type type, int i) {
        this.a = str;
        this.b = type;
        this.c = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && CallExternalId.class == obj.getClass()) {
            CallExternalId callExternalId = (CallExternalId) obj;
            if (this.a.equals(callExternalId.a) && this.b == callExternalId.b && this.c == callExternalId.c) {
                return true;
            }
        }
        return false;
    }

    public int getDeviceIndex() {
        return this.c;
    }

    @NonNull
    public String getId() {
        return this.a;
    }

    @NonNull
    public Type getType() {
        return this.b;
    }

    public int hashCode() {
        return Objects.hash(this.a, this.b, Integer.valueOf(this.c));
    }

    @NonNull
    public String toString() {
        StringBuilder sb = new StringBuilder("CallExternalId{id='");
        sb.append(this.a);
        sb.append("', type=");
        sb.append(this.b);
        sb.append(", deviceIndex=");
        return vu5.b(sb, this.c, '}');
    }
}
