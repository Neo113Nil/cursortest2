package com.ybsdk.feature.autotopup.internal.presentation.setup.v2;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.core.utils.text.c;
import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;
import defpackage.at01;
import defpackage.dzh0;
import defpackage.e5a0;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupSetupV2Fragment$onCreate$2 extends FunctionReferenceImpl implements tls {
    public AutoTopupSetupV2Fragment$onCreate$2(uc5 uc5Var) {
        super(1, uc5Var, b.class, "onMe2MeSelected", "onMe2MeSelected(Lcom/ybsdk/feature/transfer/api/TransferSelectedTargetEntity;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        TransferSelectedTargetEntity transferSelectedTargetEntity = (TransferSelectedTargetEntity) obj;
        b bVar = (b) this.receiver;
        bVar.L = false;
        e5a0 a = at01.a(transferSelectedTargetEntity);
        com.ybsdk.core.utils.text.b bVar2 = Text.Companion;
        int i = dzh0.ybsdk_deposit_deposit_payment_method_prefix;
        c cVar = Text.Formatted.Arg.Companion;
        String title = transferSelectedTargetEntity.getTitle();
        cVar.getClass();
        Text.Formatted.Arg[] argArr = {new Text.Formatted.Arg.StringArg(title)};
        bVar2.getClass();
        bVar.z0(e5a0.e(a, com.ybsdk.core.utils.text.b.b(i, argArr)));
        return zy11.a;
    }
}
