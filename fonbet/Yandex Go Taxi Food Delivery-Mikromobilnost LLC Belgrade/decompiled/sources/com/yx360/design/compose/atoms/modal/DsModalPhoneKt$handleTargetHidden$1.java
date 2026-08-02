package com.yx360.design.compose.atoms.modal;

import defpackage.mvg;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@mvg(c = "com.yx360.design.compose.atoms.modal.DsModalPhoneKt", f = "DsModalPhone.kt", l = {HProv.ALG_SID_SHA_224}, m = "handleTargetHidden")
/* loaded from: classes4.dex */
final class DsModalPhoneKt$handleTargetHidden$1 extends ContinuationImpl {
    float F$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return a.e(null, 0.0f, this);
    }
}
