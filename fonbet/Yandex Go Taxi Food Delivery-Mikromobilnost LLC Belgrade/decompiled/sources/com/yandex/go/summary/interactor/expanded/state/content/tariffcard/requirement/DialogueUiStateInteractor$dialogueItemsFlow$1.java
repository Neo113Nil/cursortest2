package com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement;

import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementRoundedCornersUiState;
import com.yandex.go.summary.ui.model.expanded.content.tariffcard.requirement.RequirementTypeUiState;
import defpackage.amj0;
import defpackage.evu0;
import defpackage.flj0;
import defpackage.igj;
import defpackage.jdj0;
import defpackage.jkj0;
import defpackage.mja1;
import defpackage.mkj0;
import defpackage.mvg;
import defpackage.ny6;
import defpackage.ny61;
import defpackage.qtb1;
import defpackage.scc;
import defpackage.sfj;
import defpackage.tcc;
import defpackage.tfj;
import defpackage.ufj;
import defpackage.uij0;
import defpackage.vfj;
import defpackage.w511;
import defpackage.wfj;
import defpackage.xfj;
import defpackage.zfj;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lxfj;", "dialogue", "", "isRedesignEnabled", "", "Lamj0;", "<anonymous>", "(Lxfj;Z)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.summary.interactor.expanded.state.content.tariffcard.requirement.DialogueUiStateInteractor$dialogueItemsFlow$1", f = "DialogueUiStateInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class DialogueUiStateInteractor$dialogueItemsFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ igj this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogueUiStateInteractor$dialogueItemsFlow$1(igj igjVar, Continuation continuation) {
        super(3, continuation);
        this.this$0 = igjVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean booleanValue = ((Boolean) obj2).booleanValue();
        DialogueUiStateInteractor$dialogueItemsFlow$1 dialogueUiStateInteractor$dialogueItemsFlow$1 = new DialogueUiStateInteractor$dialogueItemsFlow$1(this.this$0, (Continuation) obj3);
        dialogueUiStateInteractor$dialogueItemsFlow$1.L$0 = (xfj) obj;
        dialogueUiStateInteractor$dialogueItemsFlow$1.Z$0 = booleanValue;
        return dialogueUiStateInteractor$dialogueItemsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        mkj0 mkj0Var;
        xfj xfjVar = (xfj) this.L$0;
        boolean z = this.Z$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        amj0 amj0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (xfjVar == null) {
            return EmptyList.a;
        }
        this.this$0.d.getClass();
        if (!xfjVar.equals(sfj.a) && !xfjVar.equals(tfj.a)) {
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
            uij0 uij0Var = (!evu0.J(str) || z) ? new uij0(mja1.b(str, null, 6), null, null) : null;
            jdj0 jdj0Var = new jdj0(charSequence, "");
            wfj wfjVar = ufjVar.d;
            if (wfjVar instanceof vfj) {
                ArrayList<zfj> arrayList = ((vfj) wfjVar).a;
                ArrayList arrayList2 = new ArrayList(tcc.n(arrayList, 10));
                for (zfj zfjVar : arrayList) {
                    ny6 ny6Var = zfjVar.a;
                    arrayList2.add(new jkj0(ny6Var.b, zfjVar.c, zfjVar.b, new flj0(ny6Var.d, HapticEffect.ClickMedium)));
                }
                mkj0Var = new mkj0(arrayList2);
            } else {
                if (!wfjVar.equals(qtb1.B)) {
                    w511.b();
                    return null;
                }
                mkj0Var = null;
            }
            amj0Var = new amj0("dialogue_promotion", "dialogue_promotion", true, ufjVar.g, RequirementRoundedCornersUiState.NONE, com.yandex.go.summary.mapper.a.d(z), uij0Var, jdj0Var, null, mkj0Var, null, charSequence.toString(), RequirementTypeUiState.DEFAULT);
        }
        return scc.h(amj0Var);
    }
}
