package com.yx360.design.compose.atoms.modal;

import androidx.compose.foundation.gestures.e;
import androidx.compose.material3.SheetValue;
import defpackage.bam;
import defpackage.c73;
import defpackage.hsm;
import defpackage.ism;
import defpackage.lah;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qrm;
import defpackage.sls;
import defpackage.tse;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yx360.design.compose.atoms.modal.DsModalPhoneKt$ExpandableModalContent$1$1", f = "DsModalPhone.kt", l = {238, 239, 243}, m = "invokeSuspend")
/* loaded from: classes4.dex */
final class DsModalPhoneKt$ExpandableModalContent$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ e $draggableState;
    final /* synthetic */ float $minRequiredModalHeightPx;
    final /* synthetic */ sls $onDismiss;
    final /* synthetic */ qrm $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DsModalPhoneKt$ExpandableModalContent$1$1(e eVar, float f, qrm qrmVar, sls slsVar, Continuation continuation) {
        super(2, continuation);
        this.$draggableState = eVar;
        this.$minRequiredModalHeightPx = f;
        this.$state = qrmVar;
        this.$onDismiss = slsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DsModalPhoneKt$ExpandableModalContent$1$1(this.$draggableState, this.$minRequiredModalHeightPx, this.$state, this.$onDismiss, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DsModalPhoneKt$ExpandableModalContent$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00db, code lost:
    
        if (r8 == r0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (com.yx360.design.compose.atoms.modal.a.e(r8, r1, r7) == r0) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            int i2 = hsm.a[((SheetValue) this.$draggableState.i.getValue()).ordinal()];
            if (i2 == 1) {
                e eVar = this.$draggableState;
                float f = this.$minRequiredModalHeightPx;
                this.label = 1;
            } else if (i2 == 2) {
                e eVar2 = this.$draggableState;
                float f2 = this.$minRequiredModalHeightPx;
                this.label = 3;
                if (a.d(eVar2, f2, this) == coroutineSingletons) {
                }
            } else {
                if (i2 != 3) {
                    w511.b();
                    return null;
                }
                e eVar3 = this.$draggableState;
                float f3 = this.$minRequiredModalHeightPx;
                int i3 = ism.a[((SheetValue) eVar3.g.getValue()).ordinal()];
                if (i3 == 1) {
                    bam bamVar = new bam();
                    bamVar.a(SheetValue.Hidden, f3);
                    float[] fArr = bamVar.b;
                    ArrayList arrayList = bamVar.a;
                    int size = arrayList.size();
                    c73.a(size, fArr.length);
                    e.l(eVar3, new lah(arrayList, Arrays.copyOfRange(fArr, 0, size)));
                } else if (i3 == 2) {
                    bam bamVar2 = new bam();
                    bamVar2.a(SheetValue.Expanded, 0.0f);
                    bamVar2.a(SheetValue.Hidden, f3);
                    float[] fArr2 = bamVar2.b;
                    ArrayList arrayList2 = bamVar2.a;
                    int size2 = arrayList2.size();
                    c73.a(size2, fArr2.length);
                    e.l(eVar3, new lah(arrayList2, Arrays.copyOfRange(fArr2, 0, size2)));
                } else if (i3 != 3) {
                    w511.b();
                    return null;
                }
            }
            return coroutineSingletons;
        }
        if (i == 1) {
            kotlin.b.b(obj);
            qrm qrmVar = this.$state;
            this.label = 2;
            Object e = qrmVar.a.e(this);
            if (e != coroutineSingletons) {
                e = zy11Var;
            }
        } else if (i == 2) {
            kotlin.b.b(obj);
            this.$onDismiss.invoke();
        } else {
            if (i != 3) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11Var;
    }
}
