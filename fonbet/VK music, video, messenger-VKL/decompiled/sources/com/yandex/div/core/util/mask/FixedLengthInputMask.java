package com.yandex.div.core.util.mask;

import com.yandex.div.core.util.mask.BaseInputMask;
import xsna.izs;
import xsna.s3q0;

/* compiled from: FixedLengthInputMask.kt */
/* loaded from: classes7.dex */
public class FixedLengthInputMask extends BaseInputMask {
    private final izs<Exception, s3q0> onError;

    /* JADX WARN: Multi-variable type inference failed */
    public FixedLengthInputMask(BaseInputMask.MaskData maskData, izs<? super Exception, s3q0> izsVar) {
        super(maskData);
        this.onError = izsVar;
    }

    @Override // com.yandex.div.core.util.mask.BaseInputMask
    public void onException(Exception exc) {
        this.onError.invoke(exc);
    }
}
