package com.yandex.xplat.xflags;

import com.yandex.xplat.common.YSError;
import defpackage.b231;
import defpackage.oyr;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/yandex/xplat/xflags/IncorrectFormatError;", "Lcom/yandex/xplat/common/YSError;", "Lb231;", "variable", "Lb231;", "getVariable", "()Lb231;", "xplat-xflags_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public class IncorrectFormatError extends YSError {
    private final b231 variable;

    public IncorrectFormatError(b231 b231Var) {
        super(oyr.p("Incorrect format for Variable: \"", b231Var.a(), "\""), null);
        this.variable = b231Var;
    }
}
