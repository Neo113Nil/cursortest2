package defpackage;

import ru.rt.ebs.cryptosdk.presentation.customView.ScreenIconType;

/* loaded from: classes4.dex */
public abstract /* synthetic */ class hnf {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[ScreenIconType.values().length];
        try {
            iArr[ScreenIconType.ATTENTION.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ScreenIconType.CANCEL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
    }
}
