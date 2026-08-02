package com.ybsdk.core.common.domain.entities;

import defpackage.dp;
import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/ybsdk/core/common/domain/entities/Action;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "dp", "REGISTRATION", "OPEN_PRODUCT", "core-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Action {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ Action[] $VALUES;
    public static final dp Companion;
    public static final Action REGISTRATION = new Action("REGISTRATION", 0);
    public static final Action OPEN_PRODUCT = new Action("OPEN_PRODUCT", 1);

    private static final /* synthetic */ Action[] $values() {
        return new Action[]{REGISTRATION, OPEN_PRODUCT};
    }

    static {
        Action[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
        Companion = new dp();
    }

    private Action(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static Action valueOf(String str) {
        return (Action) Enum.valueOf(Action.class, str);
    }

    public static Action[] values() {
        return (Action[]) $VALUES.clone();
    }
}
