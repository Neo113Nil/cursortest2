package com.yandex.go.scooters.ignition.panel;

import com.yandex.go.scooters.ignition.data.model.ScootersIgnitionExperiment;
import defpackage.avj0;
import defpackage.c6z;
import defpackage.kyh0;
import defpackage.mvg;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.wrn0;
import defpackage.xrn0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lxrn0;", "<anonymous>", "(Ltse;)Lxrn0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.ignition.panel.ScootersIgnitionPanelUiStateMapper$mapToUiState$2", f = "ScootersIgnitionPanelUiStateMapper.kt", l = {70, 71, 72, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersIgnitionPanelUiStateMapper$mapToUiState$2 extends SuspendLambda implements wls {
    final /* synthetic */ ScootersIgnitionExperiment.Ui.ControlPanel $controlPanel;
    final /* synthetic */ c6z $localizedExperiment;
    final /* synthetic */ Set<String> $shownBannersIds;
    final /* synthetic */ boolean $startAllowed;
    final /* synthetic */ boolean $startEnabled;
    final /* synthetic */ String $startPromotionId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersIgnitionPanelUiStateMapper$mapToUiState$2(ScootersIgnitionExperiment.Ui.ControlPanel controlPanel, e eVar, c6z c6zVar, boolean z, Set set, boolean z2, String str, Continuation continuation) {
        super(2, continuation);
        this.$controlPanel = controlPanel;
        this.this$0 = eVar;
        this.$localizedExperiment = c6zVar;
        this.$startAllowed = z;
        this.$shownBannersIds = set;
        this.$startEnabled = z2;
        this.$startPromotionId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersIgnitionPanelUiStateMapper$mapToUiState$2 scootersIgnitionPanelUiStateMapper$mapToUiState$2 = new ScootersIgnitionPanelUiStateMapper$mapToUiState$2(this.$controlPanel, this.this$0, this.$localizedExperiment, this.$startAllowed, this.$shownBannersIds, this.$startEnabled, this.$startPromotionId, continuation);
        scootersIgnitionPanelUiStateMapper$mapToUiState$2.L$0 = obj;
        return scootersIgnitionPanelUiStateMapper$mapToUiState$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersIgnitionPanelUiStateMapper$mapToUiState$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012f  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Collection collection;
        noh nohVar;
        Object s;
        noh nohVar2;
        Object k;
        noh nohVar3;
        CharSequence charSequence;
        Collection collection2;
        Object b;
        CharSequence charSequence2;
        CharSequence charSequence3;
        noh nohVar4;
        CharSequence charSequence4;
        List list;
        Object k2;
        CharSequence charSequence5;
        List list2;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        wrn0 wrn0Var = null;
        if (i == 0) {
            kotlin.b.b(obj);
            qoh h = tje.h(tseVar, null, null, new ScootersIgnitionPanelUiStateMapper$mapToUiState$2$titleAsync$1(this.this$0, this.$controlPanel, this.$localizedExperiment, null), 3);
            qoh h2 = tje.h(tseVar, null, null, new ScootersIgnitionPanelUiStateMapper$mapToUiState$2$subtitleAsync$1(this.this$0, this.$controlPanel, this.$localizedExperiment, null), 3);
            List list3 = this.$controlPanel.c;
            e eVar = this.this$0;
            c6z c6zVar = this.$localizedExperiment;
            boolean z = this.$startAllowed;
            Set<String> set = this.$shownBannersIds;
            ArrayList arrayList = new ArrayList(tcc.n(list3, 10));
            Iterator it = list3.iterator();
            while (it.hasNext()) {
                Set<String> set2 = set;
                ArrayList arrayList2 = arrayList;
                arrayList2.add(tje.h(tseVar, null, null, new ScootersIgnitionPanelUiStateMapper$mapToUiState$2$bannersAsync$1$1(eVar, (ScootersIgnitionExperiment.Ui.ControlPanel.Banner) it.next(), c6zVar, z, set2, null), 3));
                arrayList = arrayList2;
                set = set2;
            }
            collection = arrayList;
            ScootersIgnitionExperiment.Ui.ControlPanel.StartEntryPoint startEntryPoint = this.$controlPanel.d;
            if (startEntryPoint != null) {
                boolean z2 = this.$startAllowed;
                e eVar2 = this.this$0;
                c6z c6zVar2 = this.$localizedExperiment;
                boolean z3 = this.$startEnabled;
                String str = this.$startPromotionId;
                if (z2) {
                    nohVar = tje.h(tseVar, null, null, new ScootersIgnitionPanelUiStateMapper$mapToUiState$2$startEntryPointAsync$1$1(eVar2, startEntryPoint, c6zVar2, z3, str, null), 3);
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = h2;
                    this.L$3 = collection;
                    this.L$4 = nohVar;
                    this.label = 1;
                    s = h.s(this);
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    if (s != coroutineSingletons) {
                        nohVar2 = h2;
                    }
                    return coroutineSingletons;
                }
            }
            nohVar = null;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h2;
            this.L$3 = collection;
            this.L$4 = nohVar;
            this.label = 1;
            s = h.s(this);
            CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                charSequence = (CharSequence) this.L$5;
                nohVar3 = (noh) this.L$4;
                collection2 = (List) this.L$3;
                kotlin.b.b(obj);
                k = obj;
                CharSequence charSequence6 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = nohVar3;
                this.L$5 = charSequence;
                this.L$6 = charSequence6;
                this.label = 3;
                b = kotlinx.coroutines.a.b(collection2, this);
                if (b != coroutineSingletons) {
                    noh nohVar5 = nohVar3;
                    charSequence2 = charSequence;
                    charSequence3 = charSequence6;
                    nohVar4 = nohVar5;
                    List M = kotlin.collections.a.M((Iterable) b);
                    if (nohVar4 != null) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                list2 = (List) this.L$7;
                charSequence5 = (CharSequence) this.L$6;
                charSequence2 = (CharSequence) this.L$5;
                kotlin.b.b(obj);
                k2 = obj;
                wrn0Var = (wrn0) k2;
                list = list2;
                charSequence4 = charSequence5;
                return new xrn0(charSequence2, charSequence4, list, wrn0Var, ((avj0) this.this$0.a).h(kyh0.common_close));
            }
            charSequence3 = (CharSequence) this.L$6;
            charSequence2 = (CharSequence) this.L$5;
            noh nohVar6 = (noh) this.L$4;
            kotlin.b.b(obj);
            nohVar4 = nohVar6;
            b = obj;
            List M2 = kotlin.collections.a.M((Iterable) b);
            if (nohVar4 != null) {
                charSequence4 = charSequence3;
                list = M2;
                return new xrn0(charSequence2, charSequence4, list, wrn0Var, ((avj0) this.this$0.a).h(kyh0.common_close));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = charSequence2;
            this.L$6 = charSequence3;
            this.L$7 = M2;
            this.label = 4;
            k2 = nohVar4.k(this);
            if (k2 != coroutineSingletons) {
                charSequence5 = charSequence3;
                list2 = M2;
                wrn0Var = (wrn0) k2;
                list = list2;
                charSequence4 = charSequence5;
                return new xrn0(charSequence2, charSequence4, list, wrn0Var, ((avj0) this.this$0.a).h(kyh0.common_close));
            }
            return coroutineSingletons;
        }
        nohVar = (noh) this.L$4;
        Collection collection3 = (List) this.L$3;
        nohVar2 = (noh) this.L$2;
        kotlin.b.b(obj);
        collection = collection3;
        s = obj;
        CharSequence charSequence7 = (CharSequence) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = collection;
        this.L$4 = nohVar;
        this.L$5 = charSequence7;
        this.label = 2;
        k = nohVar2.k(this);
        if (k != coroutineSingletons) {
            nohVar3 = nohVar;
            charSequence = charSequence7;
            collection2 = collection;
            CharSequence charSequence62 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = nohVar3;
            this.L$5 = charSequence;
            this.L$6 = charSequence62;
            this.label = 3;
            b = kotlinx.coroutines.a.b(collection2, this);
            if (b != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
