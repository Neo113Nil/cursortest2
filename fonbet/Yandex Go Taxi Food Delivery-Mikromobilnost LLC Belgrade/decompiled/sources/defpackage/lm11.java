package defpackage;

import com.google.gson.stream.JsonToken;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class lm11 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonToken.values().length];
        a = iArr;
        try {
            iArr[JsonToken.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[JsonToken.STRING.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[JsonToken.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
    }
}
