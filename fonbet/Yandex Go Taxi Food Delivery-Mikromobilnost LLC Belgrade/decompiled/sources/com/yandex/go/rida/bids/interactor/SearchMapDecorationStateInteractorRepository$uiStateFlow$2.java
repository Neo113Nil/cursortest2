package com.yandex.go.rida.bids.interactor;

import android.graphics.Rect;
import com.yandex.go.rida.bids.state.MapDecorationUiState$PulsarType;
import defpackage.bms;
import defpackage.f1h0;
import defpackage.ih00;
import defpackage.j1c0;
import defpackage.jh00;
import defpackage.k1c0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sup0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "isVisible", "Lcom/yandex/go/rida/bids/state/MapDecorationUiState$PulsarType;", "pulsarType", "Landroid/graphics/Rect;", "pinRect", "Ljh00;", "<anonymous>", "(ZLcom/yandex/go/rida/bids/state/MapDecorationUiState$PulsarType;Landroid/graphics/Rect;)Ljh00;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.rida.bids.interactor.SearchMapDecorationStateInteractorRepository$uiStateFlow$2", f = "SearchMapDecorationStateInteractorRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SearchMapDecorationStateInteractorRepository$uiStateFlow$2 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ sup0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SearchMapDecorationStateInteractorRepository$uiStateFlow$2(sup0 sup0Var, Continuation continuation) {
        super(4, continuation);
        this.this$0 = sup0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        SearchMapDecorationStateInteractorRepository$uiStateFlow$2 searchMapDecorationStateInteractorRepository$uiStateFlow$2 = new SearchMapDecorationStateInteractorRepository$uiStateFlow$2(this.this$0, (Continuation) obj4);
        searchMapDecorationStateInteractorRepository$uiStateFlow$2.Z$0 = booleanValue;
        searchMapDecorationStateInteractorRepository$uiStateFlow$2.L$0 = (MapDecorationUiState$PulsarType) obj2;
        searchMapDecorationStateInteractorRepository$uiStateFlow$2.L$1 = (Rect) obj3;
        return searchMapDecorationStateInteractorRepository$uiStateFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.Z$0;
        MapDecorationUiState$PulsarType mapDecorationUiState$PulsarType = (MapDecorationUiState$PulsarType) this.L$0;
        Rect rect = (Rect) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        if (!z) {
            return null;
        }
        ih00 ih00Var = new ih00((rect.width() / 2.0f) + rect.left, rect.bottom);
        this.this$0.getClass();
        return new jh00(mapDecorationUiState$PulsarType, new k1c0(new j1c0(f1h0.ic_source_pin_24)), ih00Var);
    }
}
