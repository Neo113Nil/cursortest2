package defpackage;

import ru.yandex.logistics.sdk.cargo_form.impl.model.common.SlotTrailModel$TrailButton$TrailButtonStyle;

/* loaded from: classes5.dex */
public abstract /* synthetic */ class ovs0 {
    public static final /* synthetic */ int[] a;

    static {
        int[] iArr = new int[SlotTrailModel$TrailButton$TrailButtonStyle.values().length];
        try {
            iArr[SlotTrailModel$TrailButton$TrailButtonStyle.MAIN.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[SlotTrailModel$TrailButton$TrailButtonStyle.OUTLINE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[SlotTrailModel$TrailButton$TrailButtonStyle.MINOR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        a = iArr;
    }
}
