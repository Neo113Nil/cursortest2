package com.yandex.go.payments.shared.family.viewmodels;

import com.yandex.go.payments.shared.family.experiments.FamilyGroupV2Experiment;
import defpackage.d6z;
import defpackage.kap;
import defpackage.kdc;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.sap;
import defpackage.tje;
import defpackage.tse;
import defpackage.ufu;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lsap;", "<anonymous>", "(Ltse;)Lsap;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.family.viewmodels.FamilyGroupMenuItemInteractorImpl$createState$2", f = "FamilyGroupMenuItemInteractorImpl.kt", l = {66, 67}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class FamilyGroupMenuItemInteractorImpl$createState$2 extends SuspendLambda implements wls {
    final /* synthetic */ FamilyGroupV2Experiment $experiment;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    boolean Z$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyGroupMenuItemInteractorImpl$createState$2(FamilyGroupV2Experiment familyGroupV2Experiment, c cVar, Continuation continuation) {
        super(2, continuation);
        this.$experiment = familyGroupV2Experiment;
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FamilyGroupMenuItemInteractorImpl$createState$2 familyGroupMenuItemInteractorImpl$createState$2 = new FamilyGroupMenuItemInteractorImpl$createState$2(this.$experiment, this.this$0, continuation);
        familyGroupMenuItemInteractorImpl$createState$2.L$0 = obj;
        return familyGroupMenuItemInteractorImpl$createState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FamilyGroupMenuItemInteractorImpl$createState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0089, code lost:
    
        if (r8 == r2) goto L20;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00aa  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ActionButton actionButton;
        noh h;
        boolean isEnabled;
        Object s;
        Object k;
        CharSequence charSequence;
        String str;
        ru.yandex.taxi.communications.model.widgets.b bVar;
        ActionButton actionButton2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            FamilyGroupV2Experiment familyGroupV2Experiment = this.$experiment;
            CommunicationItem.a aVar = familyGroupV2Experiment.d.g;
            actionButton = aVar != null ? aVar.b : null;
            qoh h2 = tje.h(tseVar, null, null, new FamilyGroupMenuItemInteractorImpl$createState$2$title$1(familyGroupV2Experiment, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new FamilyGroupMenuItemInteractorImpl$createState$2$description$1(this.$experiment, this.this$0, null), 3);
            isEnabled = this.this$0.c.isEnabled();
            this.L$0 = null;
            this.L$1 = actionButton;
            this.L$2 = null;
            this.L$3 = h;
            this.Z$0 = isEnabled;
            this.label = 1;
            s = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                isEnabled = this.Z$0;
                CharSequence charSequence2 = (CharSequence) this.L$4;
                ActionButton actionButton3 = (ActionButton) this.L$1;
                kotlin.b.b(obj);
                charSequence = charSequence2;
                actionButton = actionButton3;
                k = obj;
                boolean z = isEnabled;
                CharSequence charSequence3 = (CharSequence) k;
                boolean z2 = actionButton == null;
                FamilyGroupV2Experiment familyGroupV2Experiment2 = this.$experiment;
                CommunicationItem.a aVar2 = familyGroupV2Experiment2.d.g;
                str = (aVar2 != null || (actionButton2 = aVar2.b) == null) ? null : actionButton2.b;
                if (str == null) {
                    str = "";
                }
                String Y = d6z.Y(familyGroupV2Experiment2, str);
                kap kapVar = this.this$0.a;
                String str2 = this.$experiment.e;
                String str3 = actionButton == null ? actionButton.a : null;
                String str4 = str3 != null ? str3 : "";
                kapVar.getClass();
                String a = kap.a(str2, str4, true);
                kdc i2 = ((ufu) this.this$0.d).i(actionButton == null ? actionButton.d : null);
                kdc e = ((ufu) this.this$0.d).e(actionButton != null ? actionButton.c : null);
                if (actionButton != null || (bVar = actionButton.e) == null || (r1 = bVar.b()) == null) {
                    ActionButton.ButtonActionType buttonActionType = ActionButton.ButtonActionType.UNKNOWN;
                }
                return new sap(z, charSequence, charSequence3, z2, Y, a, i2, e, buttonActionType, this.$experiment.e);
            }
            isEnabled = this.Z$0;
            h = (noh) this.L$3;
            actionButton = (ActionButton) this.L$1;
            kotlin.b.b(obj);
            s = obj;
        }
        CharSequence charSequence4 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = actionButton;
        this.L$2 = null;
        this.L$3 = null;
        this.L$4 = charSequence4;
        this.Z$0 = isEnabled;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            charSequence = charSequence4;
            boolean z3 = isEnabled;
            CharSequence charSequence32 = (CharSequence) k;
            if (actionButton == null) {
            }
            FamilyGroupV2Experiment familyGroupV2Experiment22 = this.$experiment;
            CommunicationItem.a aVar22 = familyGroupV2Experiment22.d.g;
            if (aVar22 != null) {
            }
            if (str == null) {
            }
            String Y2 = d6z.Y(familyGroupV2Experiment22, str);
            kap kapVar2 = this.this$0.a;
            String str22 = this.$experiment.e;
            if (actionButton == null) {
            }
            if (str3 != null) {
            }
            kapVar2.getClass();
            String a2 = kap.a(str22, str4, true);
            kdc i22 = ((ufu) this.this$0.d).i(actionButton == null ? actionButton.d : null);
            kdc e2 = ((ufu) this.this$0.d).e(actionButton != null ? actionButton.c : null);
            if (actionButton != null) {
            }
            ActionButton.ButtonActionType buttonActionType2 = ActionButton.ButtonActionType.UNKNOWN;
            return new sap(z3, charSequence, charSequence32, z2, Y2, a2, i22, e2, buttonActionType2, this.$experiment.e);
        }
        return coroutineSingletons;
    }
}
