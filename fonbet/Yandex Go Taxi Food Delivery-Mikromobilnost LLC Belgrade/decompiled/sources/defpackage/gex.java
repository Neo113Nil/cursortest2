package defpackage;

import com.squareup.moshi.JsonReader;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class gex {
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
        try {
            iArr[JsonReader.Token.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[JsonReader.Token.BEGIN_OBJECT.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[JsonReader.Token.BEGIN_ARRAY.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
