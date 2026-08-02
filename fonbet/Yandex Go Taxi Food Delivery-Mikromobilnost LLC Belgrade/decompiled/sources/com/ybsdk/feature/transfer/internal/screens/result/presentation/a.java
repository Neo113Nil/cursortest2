package com.ybsdk.feature.transfer.internal.screens.result.presentation;

import com.ybsdk.core.navigation.cicerone.OpenScreenRequirement;
import com.ybsdk.core.navigation.cicerone.Screen;
import com.ybsdk.core.transfer.utils.domain.entities.TransferStatus;
import com.ybsdk.core.utils.text.Text;
import com.ybsdk.screens.registration.codeconfirmation.presentation.CodeConfirmationParams;
import defpackage.ayp0;
import defpackage.et01;
import defpackage.fyp0;
import defpackage.h9g;
import defpackage.ki01;
import defpackage.mw3;
import defpackage.ns01;
import defpackage.ny61;
import defpackage.pbv;
import defpackage.rbv;
import defpackage.vpr;
import defpackage.w511;
import defpackage.xxp0;
import defpackage.yxp0;
import defpackage.zxp0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes3.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(ayp0 ayp0Var, Continuation continuation) {
        TransferResultViewModel$startStatusesReceiving$1$1$emit$1 transferResultViewModel$startStatusesReceiving$1$1$emit$1;
        int i;
        if (continuation instanceof TransferResultViewModel$startStatusesReceiving$1$1$emit$1) {
            transferResultViewModel$startStatusesReceiving$1$1$emit$1 = (TransferResultViewModel$startStatusesReceiving$1$1$emit$1) continuation;
            int i2 = transferResultViewModel$startStatusesReceiving$1$1$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferResultViewModel$startStatusesReceiving$1$1$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferResultViewModel$startStatusesReceiving$1$1$emit$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferResultViewModel$startStatusesReceiving$1$1$emit$1.label;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    if (!(ayp0Var instanceof xxp0)) {
                        if (ayp0Var instanceof yxp0) {
                            b.b0(bVar, new et01(TransferStatus.ERROR, (String) null, (String) null, (mw3) null, 30));
                        } else {
                            if (!(ayp0Var instanceof zxp0)) {
                                w511.b();
                                return null;
                            }
                            b.b0(bVar, (et01) ((zxp0) ayp0Var).a);
                        }
                        return zy11.a;
                    }
                    fyp0 fyp0Var = bVar.D;
                    Text text = ((ns01) bVar.X()).k;
                    Text text2 = ((ns01) bVar.X()).l;
                    rbv rbvVar = ((ns01) bVar.X()).m;
                    String str = rbvVar instanceof pbv ? ((pbv) rbvVar).a : null;
                    String str2 = ((xxp0) ayp0Var).a;
                    transferResultViewModel$startStatusesReceiving$1$1$emit$1.label = 1;
                    obj = com.ybsdk.screens.registration.a.e((com.ybsdk.screens.registration.a) ((h9g) ((ki01) fyp0Var).a).R.get(), new CodeConfirmationParams.HeaderText.UniversalText(null, 1, null), str2, str != null ? new CodeConfirmationParams.HeaderImage.Url(str) : null, text2, false, null, null, null, OpenScreenRequirement.WithBuid.INSTANCE, false, null, 3552);
                    if (obj == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                bVar.H.h((Screen) obj);
                return zy11.a;
            }
        }
        transferResultViewModel$startStatusesReceiving$1$1$emit$1 = new TransferResultViewModel$startStatusesReceiving$1$1$emit$1(this, continuation);
        Object obj3 = transferResultViewModel$startStatusesReceiving$1$1$emit$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferResultViewModel$startStatusesReceiving$1$1$emit$1.label;
        b bVar2 = this.a;
        if (i != 0) {
        }
        bVar2.H.h((Screen) obj3);
        return zy11.a;
    }
}
