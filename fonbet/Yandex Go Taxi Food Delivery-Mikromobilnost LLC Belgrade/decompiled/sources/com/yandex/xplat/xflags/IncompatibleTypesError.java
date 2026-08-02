package com.yandex.xplat.xflags;

import com.yandex.xplat.common.YSError;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/yandex/xplat/xflags/IncompatibleTypesError;", "Lcom/yandex/xplat/common/YSError;", "Lcom/yandex/xplat/xflags/VariableType;", "type1", "Lcom/yandex/xplat/xflags/VariableType;", "getType1", "()Lcom/yandex/xplat/xflags/VariableType;", "type2", "getType2", "xplat-xflags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class IncompatibleTypesError extends YSError {
    private final VariableType type1;
    private final VariableType type2;

    public IncompatibleTypesError(VariableType variableType, VariableType variableType2) {
        super("Incompatible types " + variableType + " and " + variableType2, null);
        this.type1 = variableType;
        this.type2 = variableType2;
    }
}
