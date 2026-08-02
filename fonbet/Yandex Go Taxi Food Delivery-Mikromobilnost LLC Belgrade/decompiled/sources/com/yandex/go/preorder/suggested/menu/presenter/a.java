package com.yandex.go.preorder.suggested.menu.presenter;

import com.yandex.go.address.models.Address;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.uyj;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ b a;

    public a(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0064, code lost:
    
        if (r10 != r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0059, code lost:
    
        if (com.yandex.go.preorder.suggested.menu.presenter.b.Kg(r8, r9, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    @Override // defpackage.vpr
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Address address, Continuation continuation) {
        SuggestMenuPresenter$requestFinalSuggest$4$emit$1 suggestMenuPresenter$requestFinalSuggest$4$emit$1;
        int i;
        if (continuation instanceof SuggestMenuPresenter$requestFinalSuggest$4$emit$1) {
            suggestMenuPresenter$requestFinalSuggest$4$emit$1 = (SuggestMenuPresenter$requestFinalSuggest$4$emit$1) continuation;
            int i2 = suggestMenuPresenter$requestFinalSuggest$4$emit$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                suggestMenuPresenter$requestFinalSuggest$4$emit$1.label = i2 - Integer.MIN_VALUE;
                Object obj = suggestMenuPresenter$requestFinalSuggest$4$emit$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = suggestMenuPresenter$requestFinalSuggest$4$emit$1.label;
                zy11 zy11Var = zy11.a;
                b bVar = this.a;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar.I = address;
                    suggestMenuPresenter$requestFinalSuggest$4$emit$1.L$0 = address;
                    suggestMenuPresenter$requestFinalSuggest$4$emit$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj);
                            return zy11Var;
                        }
                        address = (Address) suggestMenuPresenter$requestFinalSuggest$4$emit$1.L$0;
                        kotlin.b.b(obj);
                        if (((Boolean) obj).booleanValue()) {
                            bVar.E.getClass();
                            sjh sjhVar = uyj.a;
                            mdh mdhVar = mdh.b;
                            SuggestMenuPresenter$requestFinalSuggest$4$1 suggestMenuPresenter$requestFinalSuggest$4$1 = new SuggestMenuPresenter$requestFinalSuggest$4$1(bVar, address, null);
                            suggestMenuPresenter$requestFinalSuggest$4$emit$1.L$0 = null;
                            suggestMenuPresenter$requestFinalSuggest$4$emit$1.label = 3;
                            if (tje.k0(mdhVar, suggestMenuPresenter$requestFinalSuggest$4$1, suggestMenuPresenter$requestFinalSuggest$4$emit$1) == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                        return zy11Var;
                    }
                    address = (Address) suggestMenuPresenter$requestFinalSuggest$4$emit$1.L$0;
                    kotlin.b.b(obj);
                }
                suggestMenuPresenter$requestFinalSuggest$4$emit$1.L$0 = address;
                suggestMenuPresenter$requestFinalSuggest$4$emit$1.label = 2;
                obj = bVar.Sg(suggestMenuPresenter$requestFinalSuggest$4$emit$1);
            }
        }
        suggestMenuPresenter$requestFinalSuggest$4$emit$1 = new SuggestMenuPresenter$requestFinalSuggest$4$emit$1(this, continuation);
        Object obj2 = suggestMenuPresenter$requestFinalSuggest$4$emit$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = suggestMenuPresenter$requestFinalSuggest$4$emit$1.label;
        zy11 zy11Var2 = zy11.a;
        b bVar2 = this.a;
        if (i != 0) {
        }
        suggestMenuPresenter$requestFinalSuggest$4$emit$1.L$0 = address;
        suggestMenuPresenter$requestFinalSuggest$4$emit$1.label = 2;
        obj2 = bVar2.Sg(suggestMenuPresenter$requestFinalSuggest$4$emit$1);
    }
}
