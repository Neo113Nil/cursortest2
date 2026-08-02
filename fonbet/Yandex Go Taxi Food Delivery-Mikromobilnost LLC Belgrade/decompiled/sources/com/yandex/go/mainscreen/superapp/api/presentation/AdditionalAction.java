package com.yandex.go.mainscreen.superapp.api.presentation;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;
import ru.CryptoPro.JCP.JCP;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/yandex/go/mainscreen/superapp/api/presentation/AdditionalAction;", "", "PREORDER", "ORDER_TO_ANOTHER", JCP.RAW_PREFIX, "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AdditionalAction {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ AdditionalAction[] $VALUES;
    public static final AdditionalAction NONE;
    public static final AdditionalAction ORDER_TO_ANOTHER;
    public static final AdditionalAction PREORDER;

    static {
        AdditionalAction additionalAction = new AdditionalAction("PREORDER", 0);
        PREORDER = additionalAction;
        AdditionalAction additionalAction2 = new AdditionalAction("ORDER_TO_ANOTHER", 1);
        ORDER_TO_ANOTHER = additionalAction2;
        AdditionalAction additionalAction3 = new AdditionalAction(JCP.RAW_PREFIX, 2);
        NONE = additionalAction3;
        AdditionalAction[] additionalActionArr = {additionalAction, additionalAction2, additionalAction3};
        $VALUES = additionalActionArr;
        $ENTRIES = a.a(additionalActionArr);
    }

    public static AdditionalAction valueOf(String str) {
        return (AdditionalAction) Enum.valueOf(AdditionalAction.class, str);
    }

    public static AdditionalAction[] values() {
        return (AdditionalAction[]) $VALUES.clone();
    }
}
