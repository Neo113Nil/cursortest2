package com.yandex.go.morphlex.action.change_requirement;

import com.yandex.go.morphlex.action.change_requirement.ChangeRequirementAction;

/* loaded from: classes12.dex */
public abstract /* synthetic */ class e {
    public static final /* synthetic */ int[] a;
    public static final /* synthetic */ int[] b;

    static {
        int[] iArr = new int[ChangeRequirementAction.Operation.values().length];
        try {
            iArr[ChangeRequirementAction.Operation.SET.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ChangeRequirementAction.Operation.REMOVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        a = iArr;
        int[] iArr2 = new int[ChangeRequirementAction.ValueType.values().length];
        try {
            iArr2[ChangeRequirementAction.ValueType.BOOLEAN.ordinal()] = 1;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr2[ChangeRequirementAction.ValueType.INTEGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[ChangeRequirementAction.ValueType.STRING.ordinal()] = 3;
        } catch (NoSuchFieldError unused5) {
        }
        b = iArr2;
    }
}
