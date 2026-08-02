package com.yandex.go.summary.interactor.anchored.state.content;

import defpackage.agj;
import defpackage.egj;
import defpackage.fgj;
import defpackage.gsc;
import defpackage.hgj;
import defpackage.jfj;
import defpackage.jl40;
import defpackage.k4p;
import defpackage.kfj;
import defpackage.mja1;
import defpackage.ny6;
import defpackage.ny61;
import defpackage.o4p;
import defpackage.p4p;
import defpackage.qtb1;
import defpackage.rfj;
import defpackage.sfj;
import defpackage.tcc;
import defpackage.tfj;
import defpackage.ufj;
import defpackage.vfj;
import defpackage.vpr;
import defpackage.w511;
import defpackage.wfj;
import defpackage.xfj;
import defpackage.yfj;
import defpackage.zfj;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar, l lVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1 dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1;
        int i;
        int i2;
        yfj yfjVar;
        Object egjVar;
        Object obj2;
        if (continuation instanceof DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1) {
            dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1 = (DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1) continuation;
            int i3 = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.label = i3 - Integer.MIN_VALUE;
                Object obj3 = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    xfj xfjVar = (xfj) ((gsc) obj).b;
                    if (jl40.l(xfjVar, sfj.a)) {
                        egjVar = null;
                        obj2 = null;
                    } else if (jl40.l(xfjVar, tfj.a)) {
                        egjVar = fgj.a;
                        obj2 = null;
                    } else {
                        if (!(xfjVar instanceof ufj)) {
                            w511.b();
                            return null;
                        }
                        ufj ufjVar = (ufj) xfjVar;
                        String str = ufjVar.h;
                        CharSequence charSequence = ufjVar.c;
                        if (str == null) {
                            str = "";
                        }
                        rfj rfjVar = new rfj(mja1.b(str, null, 6));
                        int i4 = hgj.a[ufjVar.e.ordinal()];
                        if (i4 == 1) {
                            i2 = 5;
                        } else {
                            if (i4 != 2) {
                                w511.b();
                                return null;
                            }
                            i2 = 3;
                        }
                        jfj jfjVar = new jfj(i2, charSequence);
                        wfj wfjVar = ufjVar.d;
                        if (wfjVar instanceof vfj) {
                            ArrayList<zfj> arrayList = ((vfj) wfjVar).a;
                            ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                            for (zfj zfjVar : arrayList) {
                                ny6 ny6Var = zfjVar.a;
                                arrayList2.add(new kfj(ny6Var.b, zfjVar.c, zfjVar.b, new agj(ny6Var.d)));
                            }
                            yfjVar = new yfj(arrayList2);
                        } else {
                            if (!wfjVar.equals(qtb1.B)) {
                                w511.b();
                                return null;
                            }
                            yfjVar = null;
                        }
                        p4p p4pVar = o4p.a;
                        k4p k4pVar = p4pVar.a;
                        egjVar = new egj(rfjVar, jfjVar, yfjVar, new p4p(new k4p(k4pVar.a, k4pVar.b, ufjVar.g, k4pVar.d), p4pVar.b, p4pVar.c, p4pVar.d, p4pVar.e), charSequence.toString());
                        obj2 = null;
                    }
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.L$0 = obj2;
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.L$1 = obj2;
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.L$2 = obj2;
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.L$3 = obj2;
                    dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(egjVar, dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1 = new DialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1(this, continuation);
        Object obj32 = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = dialogueUiStateInteractor$dialogueUiStateFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
