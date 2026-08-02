package defpackage;

import com.yandex.div.evaluable.EvaluableType;

/* loaded from: classes.dex */
public abstract /* synthetic */ class ldo {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[EvaluableType.values().length];
        try {
            iArr[EvaluableType.NUMBER.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        a = iArr;
    }
}
