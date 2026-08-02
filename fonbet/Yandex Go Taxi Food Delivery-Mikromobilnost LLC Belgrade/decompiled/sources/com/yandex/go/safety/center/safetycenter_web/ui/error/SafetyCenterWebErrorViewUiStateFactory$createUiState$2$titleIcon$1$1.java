package com.yandex.go.safety.center.safetycenter_web.ui.error;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lru/yandex/taxi/utils/UiStateDrawableWrapper;", "<anonymous>", "(Ltse;)Lru/yandex/taxi/utils/UiStateDrawableWrapper;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.safetycenter_web.ui.error.SafetyCenterWebErrorViewUiStateFactory$createUiState$2$titleIcon$1$1", f = "SafetyCenterWebErrorViewUiStateFactory.kt", l = {31}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SafetyCenterWebErrorViewUiStateFactory$createUiState$2$titleIcon$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $it;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyCenterWebErrorViewUiStateFactory$createUiState$2$titleIcon$1$1(a aVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$it = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SafetyCenterWebErrorViewUiStateFactory$createUiState$2$titleIcon$1$1(this.this$0, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SafetyCenterWebErrorViewUiStateFactory$createUiState$2$titleIcon$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.a;
            String str = this.$it;
            this.label = 1;
            obj = e.f(eVar, str, null, this, 6);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            return pkf.g(bitmapDrawable, this.$it, null);
        }
        return null;
    }
}
