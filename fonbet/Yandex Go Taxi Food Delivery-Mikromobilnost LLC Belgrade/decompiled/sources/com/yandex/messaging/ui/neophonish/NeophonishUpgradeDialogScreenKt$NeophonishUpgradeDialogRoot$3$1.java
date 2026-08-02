package com.yandex.messaging.ui.neophonish;

import com.yandex.messaging.ChatRequest;
import defpackage.ds31;
import defpackage.gm50;
import defpackage.sls;
import defpackage.tje;
import defpackage.tm50;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class NeophonishUpgradeDialogScreenKt$NeophonishUpgradeDialogRoot$3$1 extends FunctionReferenceImpl implements sls {
    /* renamed from: invoke, reason: collision with other method in class */
    public final void m222invoke() {
        String str;
        tm50 tm50Var = (tm50) this.receiver;
        gm50 gm50Var = tm50Var.w;
        ChatRequest chatRequest = gm50Var.c;
        if (chatRequest == null || (str = gm50Var.b) == null) {
            return;
        }
        tje.N(ds31.a(tm50Var), null, null, new NeophonishUpgradeViewModel$onCancelSending$1(tm50Var, chatRequest, str, null), 3);
    }

    @Override // defpackage.sls
    public final /* bridge */ /* synthetic */ Object invoke() {
        m222invoke();
        return zy11.a;
    }
}
