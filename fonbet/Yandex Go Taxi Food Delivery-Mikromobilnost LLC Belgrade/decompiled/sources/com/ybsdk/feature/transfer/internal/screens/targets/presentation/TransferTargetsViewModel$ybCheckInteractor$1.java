package com.ybsdk.feature.transfer.internal.screens.targets.presentation;

import com.ybsdk.feature.transfer.api.TransferSelectedTargetEntity;
import defpackage.tls;
import defpackage.vt01;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
final /* synthetic */ class TransferTargetsViewModel$ybCheckInteractor$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        TransferSelectedTargetEntity transferSelectedTargetEntity = (TransferSelectedTargetEntity) obj;
        b bVar = (b) this.receiver;
        bVar.C.l(transferSelectedTargetEntity != null, "", null);
        if (transferSelectedTargetEntity != null) {
            bVar.Z(new vt01(transferSelectedTargetEntity));
        }
        return zy11.a;
    }
}
