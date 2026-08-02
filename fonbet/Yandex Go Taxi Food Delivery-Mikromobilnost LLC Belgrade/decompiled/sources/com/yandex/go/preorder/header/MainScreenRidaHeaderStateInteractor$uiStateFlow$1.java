package com.yandex.go.preorder.header;

import defpackage.sb00;
import defpackage.tls;
import defpackage.w511;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes13.dex */
final /* synthetic */ class MainScreenRidaHeaderStateInteractor$uiStateFlow$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        long j;
        ((g) this.receiver).getClass();
        int i = sb00.a[((MapInteractionState) obj).ordinal()];
        if (i == 1) {
            j = 100;
        } else if (i == 2) {
            j = 400;
        } else {
            if (i != 3) {
                w511.b();
                return null;
            }
            j = 0;
        }
        return Long.valueOf(j);
    }
}
