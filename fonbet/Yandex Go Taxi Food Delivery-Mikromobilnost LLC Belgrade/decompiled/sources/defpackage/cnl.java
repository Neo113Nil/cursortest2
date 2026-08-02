package defpackage;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes3.dex */
public final class cnl extends jnl {
    public static final cnl c = new cnl("platform", "ANDROID");

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cnl(float f, int i) {
        super("keyboard_inset", Float.valueOf(f));
        switch (i) {
            case 2:
                super("safe_area_bottom", Float.valueOf(f));
                break;
            case 3:
                super("safe_area_top", Float.valueOf(f));
                break;
            case 4:
                super(CommonUrlParts.SCREEN_HEIGHT, Float.valueOf(f));
                break;
            case 5:
                super(CommonUrlParts.SCREEN_WIDTH, Float.valueOf(f));
                break;
            default:
                break;
        }
    }
}
