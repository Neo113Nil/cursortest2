package com.yandex.go.masstransit.sdk.order.impl.tickets.uicomponents.ticket_item;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/masstransit/sdk/order/impl/tickets/uicomponents/ticket_item/MtPerforationEdge;", "", "Top", "Bottom", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class MtPerforationEdge {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MtPerforationEdge[] $VALUES;
    public static final MtPerforationEdge Bottom;
    public static final MtPerforationEdge Top;

    static {
        MtPerforationEdge mtPerforationEdge = new MtPerforationEdge("Top", 0);
        Top = mtPerforationEdge;
        MtPerforationEdge mtPerforationEdge2 = new MtPerforationEdge("Bottom", 1);
        Bottom = mtPerforationEdge2;
        MtPerforationEdge[] mtPerforationEdgeArr = {mtPerforationEdge, mtPerforationEdge2};
        $VALUES = mtPerforationEdgeArr;
        $ENTRIES = kotlin.enums.a.a(mtPerforationEdgeArr);
    }

    public static MtPerforationEdge valueOf(String str) {
        return (MtPerforationEdge) Enum.valueOf(MtPerforationEdge.class, str);
    }

    public static MtPerforationEdge[] values() {
        return (MtPerforationEdge[]) $VALUES.clone();
    }
}
