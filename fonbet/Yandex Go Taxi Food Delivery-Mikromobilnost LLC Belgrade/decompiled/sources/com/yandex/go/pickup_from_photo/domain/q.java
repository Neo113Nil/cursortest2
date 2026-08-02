package com.yandex.go.pickup_from_photo.domain;

import com.yandex.go.pickup_from_photo.experiment.PickupPhotoRecognitionExperiment;
import defpackage.apb0;
import defpackage.avj0;
import defpackage.bhi0;
import defpackage.bpb0;
import defpackage.chi0;
import defpackage.cpb0;
import defpackage.d6z;
import defpackage.dhi0;
import defpackage.kyh0;
import defpackage.m7x0;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.q5z;
import defpackage.shi0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.yob0;
import defpackage.zob0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ s b;

    public q(vpr vprVar, s sVar) {
        this.a = vprVar;
        this.b = sVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ca, code lost:
    
        if (defpackage.evu0.J(r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00e2, code lost:
    
        if (defpackage.evu0.J(r6) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00fa, code lost:
    
        if (defpackage.evu0.J(r6) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0112, code lost:
    
        if (defpackage.evu0.J(r3) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0144, code lost:
    
        if (defpackage.evu0.J(r2) == false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0175, code lost:
    
        if (defpackage.evu0.J(r3) == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0194, code lost:
    
        if (defpackage.evu0.J(r6) == false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01b3, code lost:
    
        if (defpackage.evu0.J(r2) == false) goto L85;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01da A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RecognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1 recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        shi0 shi0Var;
        String str;
        dhi0 dhi0Var;
        String str2;
        String str3;
        String str4;
        dhi0 bhi0Var;
        String str5;
        String str6;
        String str7;
        String str8;
        s sVar = this.b;
        zuj0 zuj0Var = sVar.c;
        com.yandex.go.pickup_from_photo.experiment.p pVar = sVar.b;
        if (continuation instanceof RecognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1) {
            recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1 = (RecognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    cpb0 cpb0Var = (cpb0) obj;
                    PickupPhotoRecognitionExperiment b = pVar.b();
                    String Y = d6z.Y(b, b.i.getA());
                    PickupPhotoRecognitionExperiment b2 = pVar.b();
                    String Y2 = d6z.Y(b2, b2.i.getD());
                    String h = ((avj0) zuj0Var).h(kyh0.common_done);
                    PickupPhotoRecognitionExperiment b3 = pVar.b();
                    String Y3 = d6z.Y(b3, b3.i.getC());
                    String str9 = pVar.b().i.b;
                    String a = str9 != null ? ((m7x0) pVar.b).a(str9) : null;
                    pv0 pv0Var = cpb0Var.a;
                    String F = q5z.F(pv0Var.a);
                    String D = q5z.D(pv0Var.a);
                    String h2 = ((avj0) zuj0Var).h(kyh0.summary_porch_button_label);
                    zzs B = pv0Var.a.B();
                    bpb0 bpb0Var = cpb0Var.b;
                    PickupPhotoRecognitionExperiment b4 = pVar.b();
                    PickupPhotoRecognitionExperiment.RecognitionSuccessScreen recognitionSuccessScreen = b4.i;
                    PickupPhotoRecognitionExperiment.RecognitionSuccessScreen recognitionSuccessScreen2 = b4.i;
                    String a2 = recognitionSuccessScreen.getE().getA();
                    if (a2 != null) {
                        str = d6z.Y(b4, a2);
                    }
                    str = null;
                    if (str != null) {
                        String d = recognitionSuccessScreen2.getE().getD();
                        if (d != null) {
                            str2 = d6z.Y(b4, d);
                        }
                        str2 = null;
                        if (str2 != null) {
                            String c = recognitionSuccessScreen2.getE().getC();
                            if (c != null) {
                                str3 = d6z.Y(b4, c);
                            }
                            str3 = null;
                            if (str3 != null) {
                                String b5 = recognitionSuccessScreen2.getE().getB();
                                if (b5 != null) {
                                    str4 = d6z.Y(b4, b5);
                                }
                                str4 = null;
                                if (str4 != null && !bpb0Var.equals(yob0.a)) {
                                    if (bpb0Var.equals(zob0.a)) {
                                        PickupPhotoRecognitionExperiment b6 = pVar.b();
                                        String d2 = b6.i.getE().getD();
                                        if (d2 != null) {
                                            str8 = d6z.Y(b6, d2);
                                        }
                                        str8 = null;
                                        if (str8 != null) {
                                            bhi0Var = new chi0(str8);
                                            dhi0Var = bhi0Var;
                                        }
                                    } else {
                                        if (!bpb0Var.equals(apb0.a)) {
                                            w511.b();
                                            return null;
                                        }
                                        PickupPhotoRecognitionExperiment b7 = pVar.b();
                                        String a3 = b7.i.getE().getA();
                                        if (a3 != null) {
                                            str5 = d6z.Y(b7, a3);
                                        }
                                        str5 = null;
                                        if (str5 != null) {
                                            PickupPhotoRecognitionExperiment b8 = pVar.b();
                                            String c2 = b8.i.getE().getC();
                                            if (c2 != null) {
                                                str6 = d6z.Y(b8, c2);
                                            }
                                            str6 = null;
                                            if (str6 != null) {
                                                PickupPhotoRecognitionExperiment b9 = pVar.b();
                                                String b10 = b9.i.getE().getB();
                                                if (b10 != null) {
                                                    str7 = d6z.Y(b9, b10);
                                                }
                                                str7 = null;
                                                if (str7 != null) {
                                                    bhi0Var = new bhi0(str5, str6, str7);
                                                    dhi0Var = bhi0Var;
                                                }
                                            }
                                        }
                                    }
                                    shi0Var = new shi0(Y, Y2, h, Y3, a, F, D, h2, B, dhi0Var);
                                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                                    if (this.a.emit(shi0Var, recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                }
                            }
                        }
                    }
                    dhi0Var = null;
                    shi0Var = new shi0(Y, Y2, h, Y3, a, F, D, h2, B, dhi0Var);
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(shi0Var, recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1 = new RecognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = recognitionSuccessUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
