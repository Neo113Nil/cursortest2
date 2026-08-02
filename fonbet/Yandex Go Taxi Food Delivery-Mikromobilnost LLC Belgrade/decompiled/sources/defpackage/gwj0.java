package defpackage;

import com.apollographql.apollo3.api.json.JsonReader$Token;

/* loaded from: classes10.dex */
public abstract /* synthetic */ class gwj0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[JsonReader$Token.values().length];
        try {
            iArr[JsonReader$Token.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[JsonReader$Token.LONG.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
