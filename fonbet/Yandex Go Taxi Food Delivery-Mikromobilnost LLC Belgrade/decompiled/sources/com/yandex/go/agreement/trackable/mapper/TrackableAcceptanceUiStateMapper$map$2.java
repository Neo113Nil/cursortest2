package com.yandex.go.agreement.trackable.mapper;

import com.yandex.go.slot.dto.SlotButtonDto;
import com.yandex.go.slot.dto.SlotItemDto;
import com.yandex.go.slot.dto.e0;
import defpackage.cd;
import defpackage.mvg;
import defpackage.n101;
import defpackage.noh;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tcc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ln101;", "<anonymous>", "(Ltse;)Ln101;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.agreement.trackable.mapper.TrackableAcceptanceUiStateMapper$map$2", f = "TrackableAcceptanceUiStateMapper.kt", l = {37, 38, 39, 40}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class TrackableAcceptanceUiStateMapper$map$2 extends SuspendLambda implements wls {
    final /* synthetic */ cd $acceptance;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrackableAcceptanceUiStateMapper$map$2(cd cdVar, a aVar, Continuation continuation) {
        super(2, continuation);
        this.$acceptance = cdVar;
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TrackableAcceptanceUiStateMapper$map$2 trackableAcceptanceUiStateMapper$map$2 = new TrackableAcceptanceUiStateMapper$map$2(this.$acceptance, this.this$0, continuation);
        trackableAcceptanceUiStateMapper$map$2.L$0 = obj;
        return trackableAcceptanceUiStateMapper$map$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrackableAcceptanceUiStateMapper$map$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x013a  */
    /* JADX WARN: Type inference failed for: r1v21, types: [java.util.List] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        ArrayList arrayList;
        Object s;
        noh nohVar;
        UiStateDrawableWrapper uiStateDrawableWrapper;
        Object k;
        noh nohVar2;
        List list;
        Object k2;
        UiStateDrawableWrapper uiStateDrawableWrapper2;
        CharSequence charSequence;
        List list2;
        Object b;
        CharSequence charSequence2;
        CharSequence charSequence3;
        List list3;
        Iterator it;
        boolean z;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new TrackableAcceptanceUiStateMapper$map$2$imageWrapper$1(this.$acceptance, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new TrackableAcceptanceUiStateMapper$map$2$title$1(this.$acceptance, this.this$0, null), 3);
            qoh h3 = tje.h(tseVar, null, null, new TrackableAcceptanceUiStateMapper$map$2$content$1(this.$acceptance, this.this$0, null), 3);
            List list4 = this.$acceptance.f;
            a aVar = this.this$0;
            arrayList = new ArrayList(tcc.n(list4, 10));
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                arrayList.add(tje.h(tseVar, null, null, new TrackableAcceptanceUiStateMapper$map$2$buttons$1$1(aVar, (SlotButtonDto) it2.next(), null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h3;
            this.L$4 = arrayList;
            this.label = 1;
            s = h2.s(this);
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (s != coroutineSingletons) {
                nohVar = h3;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                uiStateDrawableWrapper = (UiStateDrawableWrapper) this.L$5;
                list = (List) this.L$4;
                noh nohVar3 = (noh) this.L$3;
                b.b(obj);
                nohVar2 = nohVar3;
                k = obj;
                CharSequence charSequence4 = (CharSequence) k;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = list;
                this.L$5 = uiStateDrawableWrapper;
                this.L$6 = charSequence4;
                this.label = 3;
                k2 = nohVar2.k(this);
                if (k2 != coroutineSingletons) {
                    List list5 = list;
                    uiStateDrawableWrapper2 = uiStateDrawableWrapper;
                    charSequence = charSequence4;
                    list2 = list5;
                    CharSequence charSequence5 = (CharSequence) k2;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = uiStateDrawableWrapper2;
                    this.L$6 = charSequence;
                    this.L$7 = charSequence5;
                    this.label = 4;
                    b = kotlinx.coroutines.a.b(list2, this);
                    if (b != coroutineSingletons) {
                    }
                }
                return coroutineSingletons;
            }
            if (i != 3) {
                if (i != 4) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                CharSequence charSequence6 = (CharSequence) this.L$7;
                CharSequence charSequence7 = (CharSequence) this.L$6;
                uiStateDrawableWrapper2 = (UiStateDrawableWrapper) this.L$5;
                b.b(obj);
                b = obj;
                charSequence3 = charSequence6;
                charSequence2 = charSequence7;
                UiStateDrawableWrapper uiStateDrawableWrapper3 = uiStateDrawableWrapper2;
                List M = kotlin.collections.a.M((Iterable) b);
                cd cdVar = this.$acceptance;
                boolean z2 = cdVar.g;
                list3 = cdVar.f;
                if ((list3 instanceof Collection) || !list3.isEmpty()) {
                    it = list3.iterator();
                    while (it.hasNext()) {
                        SlotItemDto slotItemDto = ((SlotButtonDto) it.next()).g;
                        if ((slotItemDto != null ? slotItemDto.a : null) instanceof e0) {
                            z = true;
                            break;
                        }
                    }
                }
                z = false;
                return new n101(uiStateDrawableWrapper3, charSequence2, charSequence3, M, z2, z);
            }
            charSequence = (CharSequence) this.L$6;
            uiStateDrawableWrapper2 = (UiStateDrawableWrapper) this.L$5;
            List list6 = (List) this.L$4;
            b.b(obj);
            list2 = list6;
            k2 = obj;
            CharSequence charSequence52 = (CharSequence) k2;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = uiStateDrawableWrapper2;
            this.L$6 = charSequence;
            this.L$7 = charSequence52;
            this.label = 4;
            b = kotlinx.coroutines.a.b(list2, this);
            if (b != coroutineSingletons) {
                charSequence2 = charSequence;
                charSequence3 = charSequence52;
                UiStateDrawableWrapper uiStateDrawableWrapper32 = uiStateDrawableWrapper2;
                List M2 = kotlin.collections.a.M((Iterable) b);
                cd cdVar2 = this.$acceptance;
                boolean z22 = cdVar2.g;
                list3 = cdVar2.f;
                if (list3 instanceof Collection) {
                }
                it = list3.iterator();
                while (it.hasNext()) {
                }
                z = false;
                return new n101(uiStateDrawableWrapper32, charSequence2, charSequence3, M2, z22, z);
            }
            return coroutineSingletons;
        }
        ?? r1 = (List) this.L$4;
        nohVar = (noh) this.L$3;
        h = (noh) this.L$2;
        b.b(obj);
        arrayList = r1;
        s = obj;
        uiStateDrawableWrapper = (UiStateDrawableWrapper) s;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = nohVar;
        this.L$4 = arrayList;
        this.L$5 = uiStateDrawableWrapper;
        this.label = 2;
        k = h.k(this);
        if (k != coroutineSingletons) {
            nohVar2 = nohVar;
            list = arrayList;
            CharSequence charSequence42 = (CharSequence) k;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = list;
            this.L$5 = uiStateDrawableWrapper;
            this.L$6 = charSequence42;
            this.label = 3;
            k2 = nohVar2.k(this);
            if (k2 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
