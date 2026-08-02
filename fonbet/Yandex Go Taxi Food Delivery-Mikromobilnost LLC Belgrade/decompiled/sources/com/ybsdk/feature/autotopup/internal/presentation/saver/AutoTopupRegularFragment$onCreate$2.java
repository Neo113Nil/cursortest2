package com.ybsdk.feature.autotopup.internal.presentation.saver;

import com.ybsdk.core.utils.text.Text;
import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;
import defpackage.at01;
import defpackage.dzh0;
import defpackage.e5a0;
import defpackage.eo1;
import defpackage.tls;
import defpackage.uc5;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public /* synthetic */ class AutoTopupRegularFragment$onCreate$2 extends FunctionReferenceImpl implements tls {
    public AutoTopupRegularFragment$onCreate$2(uc5 uc5Var) {
        super(1, uc5Var, a.class, "onMe2MeSelected", "onMe2MeSelected(Lcom/ybsdk/feature/transfer/api/TransferSelectedTargetEntity;)V", 0);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        TransferSelectedTargetEntity transferSelectedTargetEntity = (TransferSelectedTargetEntity) obj;
        a aVar = (a) this.receiver;
        aVar.getClass();
        if (transferSelectedTargetEntity != null) {
            e5a0 a = at01.a(transferSelectedTargetEntity);
            com.ybsdk.core.utils.text.b bVar = Text.Companion;
            int i = dzh0.ybsdk_deposit_deposit_payment_method_prefix;
            com.ybsdk.core.utils.text.c cVar = Text.Formatted.Arg.Companion;
            String title = transferSelectedTargetEntity.getTitle();
            cVar.getClass();
            Text.Formatted.Arg[] argArr = {new Text.Formatted.Arg.StringArg(title)};
            bVar.getClass();
            e5a0 e = e5a0.e(a, com.ybsdk.core.utils.text.b.b(i, argArr));
            aVar.a0(new eo1(24, e));
            aVar.L0(e);
        }
        return zy11.a;
    }
}
