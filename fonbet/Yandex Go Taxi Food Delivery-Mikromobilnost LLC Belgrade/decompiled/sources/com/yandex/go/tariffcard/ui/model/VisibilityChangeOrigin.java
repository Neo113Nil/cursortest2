package com.yandex.go.tariffcard.ui.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/tariffcard/ui/model/VisibilityChangeOrigin;", "", "SYSTEM", "USER", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class VisibilityChangeOrigin {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ VisibilityChangeOrigin[] $VALUES;
    public static final VisibilityChangeOrigin SYSTEM;
    public static final VisibilityChangeOrigin USER;

    static {
        VisibilityChangeOrigin visibilityChangeOrigin = new VisibilityChangeOrigin("SYSTEM", 0);
        SYSTEM = visibilityChangeOrigin;
        VisibilityChangeOrigin visibilityChangeOrigin2 = new VisibilityChangeOrigin("USER", 1);
        USER = visibilityChangeOrigin2;
        VisibilityChangeOrigin[] visibilityChangeOriginArr = {visibilityChangeOrigin, visibilityChangeOrigin2};
        $VALUES = visibilityChangeOriginArr;
        $ENTRIES = a.a(visibilityChangeOriginArr);
    }

    public static VisibilityChangeOrigin valueOf(String str) {
        return (VisibilityChangeOrigin) Enum.valueOf(VisibilityChangeOrigin.class, str);
    }

    public static VisibilityChangeOrigin[] values() {
        return (VisibilityChangeOrigin[]) $VALUES.clone();
    }
}
