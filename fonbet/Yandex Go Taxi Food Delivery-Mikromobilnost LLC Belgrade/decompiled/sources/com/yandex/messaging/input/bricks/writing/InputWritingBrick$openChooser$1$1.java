package com.yandex.messaging.input.bricks.writing;

import android.content.Intent;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class InputWritingBrick$openChooser$1$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int intValue = ((Number) obj2).intValue();
        ((d) this.receiver).startActivityForResult((Intent) obj, intValue);
        return zy11.a;
    }
}
