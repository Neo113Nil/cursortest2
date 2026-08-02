package defpackage;

import android.content.Context;
import androidx.appcompat.view.ContextThemeWrapper;
import kotlin.jvm.internal.PropertyReference1Impl;

/* loaded from: classes8.dex */
public final class ab90 {
    public static final /* synthetic */ kgx[] x = {new PropertyReference1Impl("bgMain", 0, "getBgMain()I", ab90.class), b64.x(qoi0.a, ab90.class, "bgMinor", "getBgMinor()I", 0), new PropertyReference1Impl("bgFloating", 0, "getBgFloating()I", ab90.class), new PropertyReference1Impl("bgInvert", 0, "getBgInvert()I", ab90.class), new PropertyReference1Impl("bgTransparent", 0, "getBgTransparent()I", ab90.class), new PropertyReference1Impl("bgRipple", 0, "getBgRipple()I", ab90.class), new PropertyReference1Impl("shimmering", 0, "getShimmering()I", ab90.class), new PropertyReference1Impl("textMain", 0, "getTextMain()I", ab90.class), new PropertyReference1Impl("textMinor", 0, "getTextMinor()I", ab90.class), new PropertyReference1Impl("textInvert", 0, "getTextInvert()I", ab90.class), new PropertyReference1Impl("textOnControl", 0, "getTextOnControl()I", ab90.class), new PropertyReference1Impl("textOnControlMinor", 0, "getTextOnControlMinor()I", ab90.class), new PropertyReference1Impl("controlMain", 0, "getControlMain()I", ab90.class), new PropertyReference1Impl("controlMinor", 0, "getControlMinor()I", ab90.class), new PropertyReference1Impl("controlPressed", 0, "getControlPressed()I", ab90.class), new PropertyReference1Impl("line", 0, "getLine()I", ab90.class), new PropertyReference1Impl("pin", 0, "getPin()I", ab90.class), new PropertyReference1Impl("fogDark", 0, "getFogDark()I", ab90.class), new PropertyReference1Impl("error", 0, "getError()I", ab90.class), new PropertyReference1Impl("textOnError", 0, "getTextOnError()I", ab90.class), new PropertyReference1Impl("cardDivider", 0, "getCardDivider()I", ab90.class), new PropertyReference1Impl("everFront", 0, "getEverFront()I", ab90.class), new PropertyReference1Impl("everBack", 0, "getEverBack()I", ab90.class)};
    public final i3f a;
    public final ContextThemeWrapper b;
    public final int c = tng0.plaque_sdk_bgMain;
    public final int d = tng0.plaque_sdk_bgMinor;
    public final int e = tng0.plaque_sdk_bgFloating;
    public final int f = tng0.plaque_sdk_bgInvert;
    public final int g = tng0.plaque_sdk_bgTransparent;
    public final int h = tng0.plaque_sdk_bgRipple;
    public final int i = tng0.plaque_sdk_shimmeringDefaultColor;
    public final int j = tng0.plaque_sdk_textMain;
    public final int k = tng0.plaque_sdk_textMinor;
    public final int l = tng0.plaque_sdk_textInvert;
    public final int m = tng0.plaque_sdk_textOnControl;
    public final int n = tng0.plaque_sdk_textOnControlMinor;
    public final int o = tng0.plaque_sdk_controlMain;
    public final int p = tng0.plaque_sdk_controlMinor;
    public final int q = tng0.plaque_sdk_controlPressed;
    public final int r = tng0.plaque_sdk_line;
    public final int s = tng0.plaque_sdk_pin;
    public final int t = tng0.plaque_sdk_fogDark;
    public final int u = tng0.plaque_sdk_error;
    public final int v = tng0.plaque_sdk_textOnError;
    public final int w = tng0.plaque_sdk_cardDivider;

    public ab90(Context context, i3f i3fVar) {
        this.a = i3fVar;
        this.b = new ContextThemeWrapper(context, i3fVar.a());
    }

    public final int a(int i) {
        int a = this.a.a();
        ContextThemeWrapper contextThemeWrapper = this.b;
        contextThemeWrapper.setTheme(a);
        return xqb1.c(contextThemeWrapper, i);
    }
}
