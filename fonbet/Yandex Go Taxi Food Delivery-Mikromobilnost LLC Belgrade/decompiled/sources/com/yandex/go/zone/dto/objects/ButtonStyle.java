package com.yandex.go.zone.dto.objects;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.l37;
import defpackage.r66;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/zone/dto/objects/ButtonStyle;", "", "Companion", "l37", "MAIN", "MINOR", "zone_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ButtonStyle {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ButtonStyle[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final l37 Companion;
    public static final ButtonStyle MAIN;
    public static final ButtonStyle MINOR;

    static {
        ButtonStyle buttonStyle = new ButtonStyle("MAIN", 0);
        MAIN = buttonStyle;
        ButtonStyle buttonStyle2 = new ButtonStyle("MINOR", 1);
        MINOR = buttonStyle2;
        ButtonStyle[] buttonStyleArr = {buttonStyle, buttonStyle2};
        $VALUES = buttonStyleArr;
        $ENTRIES = kotlin.enums.a.a(buttonStyleArr);
        Companion = new l37();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new r66(11));
    }

    public static ButtonStyle valueOf(String str) {
        return (ButtonStyle) Enum.valueOf(ButtonStyle.class, str);
    }

    public static ButtonStyle[] values() {
        return (ButtonStyle[]) $VALUES.clone();
    }
}
