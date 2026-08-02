package com.yandex.go.requirements.comment.summary.ui.v3.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/go/requirements/comment/summary/ui/v3/data/UpdateReason;", "", "Input", "Fill", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final class UpdateReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ UpdateReason[] $VALUES;
    public static final UpdateReason Fill;
    public static final UpdateReason Input;

    static {
        UpdateReason updateReason = new UpdateReason("Input", 0);
        Input = updateReason;
        UpdateReason updateReason2 = new UpdateReason("Fill", 1);
        Fill = updateReason2;
        UpdateReason[] updateReasonArr = {updateReason, updateReason2};
        $VALUES = updateReasonArr;
        $ENTRIES = kotlin.enums.a.a(updateReasonArr);
    }

    public static UpdateReason valueOf(String str) {
        return (UpdateReason) Enum.valueOf(UpdateReason.class, str);
    }

    public static UpdateReason[] values() {
        return (UpdateReason[]) $VALUES.clone();
    }
}
