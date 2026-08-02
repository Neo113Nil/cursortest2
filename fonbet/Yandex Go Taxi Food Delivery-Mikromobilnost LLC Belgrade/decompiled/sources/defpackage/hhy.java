package defpackage;

import com.yandex.go.design.compose.input.InputState;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class hhy {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[InputState.values().length];
        try {
            iArr[InputState.ErrorFocused.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InputState.ErrorUnfocused.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[InputState.FillFocused.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[InputState.EmptyFocused.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[InputState.FillUnfocused.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[InputState.EmptyUnfocused.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        a = iArr;
    }
}
