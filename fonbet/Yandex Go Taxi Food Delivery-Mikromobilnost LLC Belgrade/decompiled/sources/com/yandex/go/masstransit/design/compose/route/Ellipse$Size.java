package com.yandex.go.masstransit.design.compose.route;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/yandex/go/masstransit/design/compose/route/Ellipse$Size", "", "Lcom/yandex/go/masstransit/design/compose/route/Ellipse$Size;", "SMALL", "BIG", "design"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class Ellipse$Size {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Ellipse$Size[] $VALUES;
    public static final Ellipse$Size BIG;
    public static final Ellipse$Size SMALL;

    static {
        Ellipse$Size ellipse$Size = new Ellipse$Size("SMALL", 0);
        SMALL = ellipse$Size;
        Ellipse$Size ellipse$Size2 = new Ellipse$Size("BIG", 1);
        BIG = ellipse$Size2;
        Ellipse$Size[] ellipse$SizeArr = {ellipse$Size, ellipse$Size2};
        $VALUES = ellipse$SizeArr;
        $ENTRIES = kotlin.enums.a.a(ellipse$SizeArr);
    }

    public static Ellipse$Size valueOf(String str) {
        return (Ellipse$Size) Enum.valueOf(Ellipse$Size.class, str);
    }

    public static Ellipse$Size[] values() {
        return (Ellipse$Size[]) $VALUES.clone();
    }
}
