package defpackage;

import com.yandex.div2.DivActionSetStoredValue$Scope;

/* loaded from: classes11.dex */
public abstract /* synthetic */ class ilu0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[DivActionSetStoredValue$Scope.values().length];
        try {
            iArr[DivActionSetStoredValue$Scope.GLOBAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DivActionSetStoredValue$Scope.CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
