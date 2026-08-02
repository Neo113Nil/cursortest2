package com.fluttercandies.photo_manager.core;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"com/fluttercandies/photo_manager/core/PhotoManagerWriteManager$OperationType", "", "Lcom/fluttercandies/photo_manager/core/PhotoManagerWriteManager$OperationType;", "MOVE", "UPDATE", "photo_manager_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class PhotoManagerWriteManager$OperationType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PhotoManagerWriteManager$OperationType[] $VALUES;
    public static final PhotoManagerWriteManager$OperationType MOVE;
    public static final PhotoManagerWriteManager$OperationType UPDATE;

    static {
        PhotoManagerWriteManager$OperationType photoManagerWriteManager$OperationType = new PhotoManagerWriteManager$OperationType("MOVE", 0);
        MOVE = photoManagerWriteManager$OperationType;
        PhotoManagerWriteManager$OperationType photoManagerWriteManager$OperationType2 = new PhotoManagerWriteManager$OperationType("UPDATE", 1);
        UPDATE = photoManagerWriteManager$OperationType2;
        PhotoManagerWriteManager$OperationType[] photoManagerWriteManager$OperationTypeArr = {photoManagerWriteManager$OperationType, photoManagerWriteManager$OperationType2};
        $VALUES = photoManagerWriteManager$OperationTypeArr;
        $ENTRIES = kotlin.enums.a.a(photoManagerWriteManager$OperationTypeArr);
    }

    public static PhotoManagerWriteManager$OperationType valueOf(String str) {
        return (PhotoManagerWriteManager$OperationType) Enum.valueOf(PhotoManagerWriteManager$OperationType.class, str);
    }

    public static PhotoManagerWriteManager$OperationType[] values() {
        return (PhotoManagerWriteManager$OperationType[]) $VALUES.clone();
    }
}
