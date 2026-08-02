package defpackage;

import com.squareup.moshi.JsonReader;

/* loaded from: classes9.dex */
public abstract /* synthetic */ class mvr0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonReader.Token.values().length];
        try {
            iArr[JsonReader.Token.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JsonReader.Token.NUMBER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
