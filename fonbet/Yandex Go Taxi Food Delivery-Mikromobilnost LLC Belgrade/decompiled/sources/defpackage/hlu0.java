package defpackage;

import com.yandex.div.data.StoredValue$Type;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class hlu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[StoredValue$Type.values().length];
        try {
            iArr[StoredValue$Type.STRING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[StoredValue$Type.INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[StoredValue$Type.BOOLEAN.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[StoredValue$Type.NUMBER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[StoredValue$Type.COLOR.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[StoredValue$Type.URL.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
