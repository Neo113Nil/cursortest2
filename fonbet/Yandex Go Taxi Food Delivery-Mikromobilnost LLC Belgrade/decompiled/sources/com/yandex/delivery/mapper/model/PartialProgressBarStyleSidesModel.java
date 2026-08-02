package com.yandex.delivery.mapper.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/delivery/mapper/model/PartialProgressBarStyleSidesModel;", "", "ROUNDED", "SQUARE", "mapper"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class PartialProgressBarStyleSidesModel {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ PartialProgressBarStyleSidesModel[] $VALUES;
    public static final PartialProgressBarStyleSidesModel ROUNDED;
    public static final PartialProgressBarStyleSidesModel SQUARE;

    static {
        PartialProgressBarStyleSidesModel partialProgressBarStyleSidesModel = new PartialProgressBarStyleSidesModel("ROUNDED", 0);
        ROUNDED = partialProgressBarStyleSidesModel;
        PartialProgressBarStyleSidesModel partialProgressBarStyleSidesModel2 = new PartialProgressBarStyleSidesModel("SQUARE", 1);
        SQUARE = partialProgressBarStyleSidesModel2;
        PartialProgressBarStyleSidesModel[] partialProgressBarStyleSidesModelArr = {partialProgressBarStyleSidesModel, partialProgressBarStyleSidesModel2};
        $VALUES = partialProgressBarStyleSidesModelArr;
        $ENTRIES = a.a(partialProgressBarStyleSidesModelArr);
    }

    public static PartialProgressBarStyleSidesModel valueOf(String str) {
        return (PartialProgressBarStyleSidesModel) Enum.valueOf(PartialProgressBarStyleSidesModel.class, str);
    }

    public static PartialProgressBarStyleSidesModel[] values() {
        return (PartialProgressBarStyleSidesModel[]) $VALUES.clone();
    }
}
