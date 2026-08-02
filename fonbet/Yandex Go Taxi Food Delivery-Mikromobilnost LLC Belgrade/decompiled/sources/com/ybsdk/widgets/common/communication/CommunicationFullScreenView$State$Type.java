package com.ybsdk.widgets.common.communication;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"com/ybsdk/widgets/common/communication/CommunicationFullScreenView$State$Type", "", "Lcom/ybsdk/widgets/common/communication/CommunicationFullScreenView$State$Type;", "<init>", "(Ljava/lang/String;I)V", "VIDEO", "GRAPHIC", "DESCRIPTION", "widgets-common_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CommunicationFullScreenView$State$Type {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ CommunicationFullScreenView$State$Type[] $VALUES;
    public static final CommunicationFullScreenView$State$Type VIDEO = new CommunicationFullScreenView$State$Type("VIDEO", 0);
    public static final CommunicationFullScreenView$State$Type GRAPHIC = new CommunicationFullScreenView$State$Type("GRAPHIC", 1);
    public static final CommunicationFullScreenView$State$Type DESCRIPTION = new CommunicationFullScreenView$State$Type("DESCRIPTION", 2);

    private static final /* synthetic */ CommunicationFullScreenView$State$Type[] $values() {
        return new CommunicationFullScreenView$State$Type[]{VIDEO, GRAPHIC, DESCRIPTION};
    }

    static {
        CommunicationFullScreenView$State$Type[] $values = $values();
        $VALUES = $values;
        $ENTRIES = a.a($values);
    }

    private CommunicationFullScreenView$State$Type(String str, int i) {
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static CommunicationFullScreenView$State$Type valueOf(String str) {
        return (CommunicationFullScreenView$State$Type) Enum.valueOf(CommunicationFullScreenView$State$Type.class, str);
    }

    public static CommunicationFullScreenView$State$Type[] values() {
        return (CommunicationFullScreenView$State$Type[]) $VALUES.clone();
    }
}
