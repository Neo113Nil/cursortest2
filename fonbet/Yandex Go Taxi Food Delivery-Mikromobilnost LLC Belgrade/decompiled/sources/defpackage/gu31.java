package defpackage;

import io.flutter.plugins.webviewflutter.OverScrollMode;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class gu31 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[OverScrollMode.values().length];
        a = iArr;
        try {
            iArr[OverScrollMode.ALWAYS.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            a[OverScrollMode.IF_CONTENT_SCROLLS.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            a[OverScrollMode.NEVER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            a[OverScrollMode.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
