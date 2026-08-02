package com.yandex.go.safety.center.lost_item.modal.mapper;

import android.graphics.drawable.Drawable;
import defpackage.frz;
import defpackage.mvg;
import defpackage.noh;
import defpackage.nrz;
import defpackage.ny61;
import defpackage.qoh;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.Map;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lfrz;", "<anonymous>", "(Ltse;)Lfrz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.mapper.LostItemsUiMapper$mapButtonToUi$2", f = "LostItemsUiMapper.kt", l = {72, HProv.ALG_SID_GR3410_12_256}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiMapper$mapButtonToUi$2 extends SuspendLambda implements wls {
    final /* synthetic */ nrz $button;
    final /* synthetic */ Map<String, String> $templates;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiMapper$mapButtonToUi$2(nrz nrzVar, a aVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.$button = nrzVar;
        this.this$0 = aVar;
        this.$templates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LostItemsUiMapper$mapButtonToUi$2 lostItemsUiMapper$mapButtonToUi$2 = new LostItemsUiMapper$mapButtonToUi$2(this.$button, this.this$0, this.$templates, continuation);
        lostItemsUiMapper$mapButtonToUi$2.L$0 = obj;
        return lostItemsUiMapper$mapButtonToUi$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiMapper$mapButtonToUi$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x005f, code lost:
    
        if (r12 == r1) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        Drawable drawable;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h2 = tje.h(tseVar, null, null, new LostItemsUiMapper$mapButtonToUi$2$iconDeferred$1(this.$button, this.this$0, null), 3);
            h = tje.h(tseVar, null, null, new LostItemsUiMapper$mapButtonToUi$2$titleDeferred$1(this.$button, this.this$0, this.$templates, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.label = 1;
            obj = h2.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                drawable = (Drawable) this.L$3;
                b.b(obj);
                return new frz(drawable, (CharSequence) obj, this.$button.c);
            }
            h = (noh) this.L$2;
            b.b(obj);
        }
        Drawable drawable2 = (Drawable) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = drawable2;
        this.label = 2;
        Object k = h.k(this);
        if (k != coroutineSingletons) {
            drawable = drawable2;
            obj = k;
            return new frz(drawable, (CharSequence) obj, this.$button.c);
        }
        return coroutineSingletons;
    }
}
