package com.yandex.messaging.ui.folders;

import defpackage.b5f;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class CreateEditFolderDialogFragment$CreateEditFolderDialogRoot$3$2$1$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        Object value;
        b5f b5fVar;
        String str = (String) obj;
        r0 r0Var = ((e) this.receiver).C;
        do {
            value = r0Var.getValue();
            b5f b5fVar2 = (b5f) value;
            b5fVar = null;
            if (b5fVar2 != null) {
                b5fVar = b5f.a(b5fVar2, str.length() < 18 ? str : b5fVar2.a, null, null, 30);
            }
        } while (!r0Var.k(value, b5fVar));
        return zy11.a;
    }
}
