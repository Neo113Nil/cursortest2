package com.yandex.go.navigator.compose.button;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.gz6;
import defpackage.k4o;
import defpackage.rzo;
import defpackage.vp2;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/yandex/go/navigator/compose/button/CustomButtonStyle;", "", "Lgz6;", "buttonColors", "Lgz6;", "a", "()Lgz6;", "Fill", "Blur80", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CustomButtonStyle[] $VALUES;
    public static final CustomButtonStyle Blur80;
    public static final CustomButtonStyle Fill;
    private final gz6 buttonColors;

    static {
        CustomButtonStyle customButtonStyle = new CustomButtonStyle("Fill", 0, new gz6(AppColor$Palette.Background, AppColor$Palette.Text));
        Fill = customButtonStyle;
        CustomButtonStyle customButtonStyle2 = new CustomButtonStyle("Blur80", 1, new gz6(new vp2(rzo.f(3439329279L), rzo.f(3424196889L)), AppColor$Palette.TextOnControl));
        Blur80 = customButtonStyle2;
        CustomButtonStyle[] customButtonStyleArr = {customButtonStyle, customButtonStyle2};
        $VALUES = customButtonStyleArr;
        $ENTRIES = a.a(customButtonStyleArr);
    }

    public CustomButtonStyle(String str, int i, gz6 gz6Var) {
        this.buttonColors = gz6Var;
    }

    public static CustomButtonStyle valueOf(String str) {
        return (CustomButtonStyle) Enum.valueOf(CustomButtonStyle.class, str);
    }

    public static CustomButtonStyle[] values() {
        return (CustomButtonStyle[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final gz6 getButtonColors() {
        return this.buttonColors;
    }
}
