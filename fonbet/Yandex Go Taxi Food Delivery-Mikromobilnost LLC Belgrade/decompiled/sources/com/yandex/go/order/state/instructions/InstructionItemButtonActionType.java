package com.yandex.go.order.state.instructions;

import defpackage.b4w;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.smv;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u0000 \u00022\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/yandex/go/order/state/instructions/InstructionItemButtonActionType;", "", "Companion", "b4w", "REMOVE_PREORDER", "UNSUPPORTED", "go-client-android.features.zone:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class InstructionItemButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ InstructionItemButtonActionType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final b4w Companion;
    public static final InstructionItemButtonActionType REMOVE_PREORDER;
    public static final InstructionItemButtonActionType UNSUPPORTED;

    static {
        InstructionItemButtonActionType instructionItemButtonActionType = new InstructionItemButtonActionType("REMOVE_PREORDER", 0);
        REMOVE_PREORDER = instructionItemButtonActionType;
        InstructionItemButtonActionType instructionItemButtonActionType2 = new InstructionItemButtonActionType("UNSUPPORTED", 1);
        UNSUPPORTED = instructionItemButtonActionType2;
        InstructionItemButtonActionType[] instructionItemButtonActionTypeArr = {instructionItemButtonActionType, instructionItemButtonActionType2};
        $VALUES = instructionItemButtonActionTypeArr;
        $ENTRIES = kotlin.enums.a.a(instructionItemButtonActionTypeArr);
        Companion = new b4w();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new smv(28));
    }

    public static InstructionItemButtonActionType valueOf(String str) {
        return (InstructionItemButtonActionType) Enum.valueOf(InstructionItemButtonActionType.class, str);
    }

    public static InstructionItemButtonActionType[] values() {
        return (InstructionItemButtonActionType[]) $VALUES.clone();
    }
}
