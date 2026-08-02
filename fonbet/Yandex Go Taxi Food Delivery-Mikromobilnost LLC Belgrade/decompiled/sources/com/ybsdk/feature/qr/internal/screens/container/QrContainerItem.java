package com.ybsdk.feature.qr.internal.screens.container;

import com.ybsdk.widgets.common.segmented.SegmentedControlView;
import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/ybsdk/feature/qr/internal/screens/container/QrContainerItem;", "", "selectedDesign", "Lcom/ybsdk/widgets/common/segmented/SegmentedControlView$ItemDesign;", "unselectedDesign", "<init>", "(Ljava/lang/String;ILcom/ybsdk/widgets/common/segmented/SegmentedControlView$ItemDesign;Lcom/ybsdk/widgets/common/segmented/SegmentedControlView$ItemDesign;)V", "getSelectedDesign", "()Lcom/ybsdk/widgets/common/segmented/SegmentedControlView$ItemDesign;", "getUnselectedDesign", "NFC_SCAN", "QR_SCAN", "QR_GENERATE", "feature-qr_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class QrContainerItem {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ QrContainerItem[] $VALUES;
    public static final QrContainerItem NFC_SCAN;
    public static final QrContainerItem QR_GENERATE;
    public static final QrContainerItem QR_SCAN;
    private final SegmentedControlView.ItemDesign selectedDesign;
    private final SegmentedControlView.ItemDesign unselectedDesign;

    private static final /* synthetic */ QrContainerItem[] $values() {
        return new QrContainerItem[]{NFC_SCAN, QR_SCAN, QR_GENERATE};
    }

    static {
        SegmentedControlView.ItemDesign itemDesign = SegmentedControlView.ItemDesign.COMMON_SELECTED;
        SegmentedControlView.ItemDesign itemDesign2 = SegmentedControlView.ItemDesign.COMMON;
        NFC_SCAN = new QrContainerItem("NFC_SCAN", 0, itemDesign, itemDesign2);
        QR_SCAN = new QrContainerItem("QR_SCAN", 1, SegmentedControlView.ItemDesign.INVERTED_SELECTED, SegmentedControlView.ItemDesign.INVERTED);
        QR_GENERATE = new QrContainerItem("QR_GENERATE", 2, itemDesign, itemDesign2);
        QrContainerItem[] $values = $values();
        $VALUES = $values;
        $ENTRIES = kotlin.enums.a.a($values);
    }

    private QrContainerItem(String str, int i, SegmentedControlView.ItemDesign itemDesign, SegmentedControlView.ItemDesign itemDesign2) {
        this.selectedDesign = itemDesign;
        this.unselectedDesign = itemDesign2;
    }

    public static k4o getEntries() {
        return $ENTRIES;
    }

    public static QrContainerItem valueOf(String str) {
        return (QrContainerItem) Enum.valueOf(QrContainerItem.class, str);
    }

    public static QrContainerItem[] values() {
        return (QrContainerItem[]) $VALUES.clone();
    }

    public final SegmentedControlView.ItemDesign getSelectedDesign() {
        return this.selectedDesign;
    }

    public final SegmentedControlView.ItemDesign getUnselectedDesign() {
        return this.unselectedDesign;
    }
}
