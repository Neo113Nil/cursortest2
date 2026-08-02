package defpackage;

import com.yandex.plus.home.plaque.repository.api.model.Predicate$Compare$Type;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class fkc0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[Predicate$Compare$Type.values().length];
        try {
            iArr[Predicate$Compare$Type.EQUALS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[Predicate$Compare$Type.GREATER.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[Predicate$Compare$Type.GREATER_OR_EQUALS.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[Predicate$Compare$Type.LESSER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[Predicate$Compare$Type.LESSER_OR_EQUALS.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        a = iArr;
    }
}
