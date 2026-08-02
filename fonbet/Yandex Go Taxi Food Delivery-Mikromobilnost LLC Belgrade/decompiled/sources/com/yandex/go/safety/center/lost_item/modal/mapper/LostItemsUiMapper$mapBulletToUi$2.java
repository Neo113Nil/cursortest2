package com.yandex.go.safety.center.lost_item.modal.mapper;

import android.graphics.drawable.Drawable;
import defpackage.erz;
import defpackage.mrz;
import defpackage.mvg;
import defpackage.noh;
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

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lerz;", "<anonymous>", "(Ltse;)Lerz;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.safety.center.lost_item.modal.mapper.LostItemsUiMapper$mapBulletToUi$2", f = "LostItemsUiMapper.kt", l = {58, 59, 60}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LostItemsUiMapper$mapBulletToUi$2 extends SuspendLambda implements wls {
    final /* synthetic */ mrz $bullet;
    final /* synthetic */ Map<String, String> $templates;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LostItemsUiMapper$mapBulletToUi$2(a aVar, mrz mrzVar, Map map, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$bullet = mrzVar;
        this.$templates = map;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LostItemsUiMapper$mapBulletToUi$2 lostItemsUiMapper$mapBulletToUi$2 = new LostItemsUiMapper$mapBulletToUi$2(this.this$0, this.$bullet, this.$templates, continuation);
        lostItemsUiMapper$mapBulletToUi$2.L$0 = obj;
        return lostItemsUiMapper$mapBulletToUi$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((LostItemsUiMapper$mapBulletToUi$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0093, code lost:
    
        if (r12 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c6  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        noh h;
        noh h2;
        CharSequence charSequence;
        noh nohVar;
        Object k;
        CharSequence charSequence2;
        CharSequence charSequence3;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            qoh h3 = tje.h(tseVar, null, null, new LostItemsUiMapper$mapBulletToUi$2$titleDeferred$1(this.this$0, this.$bullet, this.$templates, null), 3);
            h = tje.h(tseVar, null, null, new LostItemsUiMapper$mapBulletToUi$2$subtitleDeferred$1(this.this$0, this.$bullet, this.$templates, null), 3);
            h2 = tje.h(tseVar, null, null, new LostItemsUiMapper$mapBulletToUi$2$iconDeferred$1(this.$bullet, this.this$0, null), 3);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = h;
            this.L$3 = h2;
            this.label = 1;
            obj = h3.s(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    charSequence3 = (CharSequence) this.L$5;
                    charSequence2 = (CharSequence) this.L$4;
                    b.b(obj);
                    return new erz(charSequence2, charSequence3, (Drawable) obj);
                }
                charSequence = (CharSequence) this.L$4;
                nohVar = (noh) this.L$3;
                b.b(obj);
                CharSequence charSequence4 = (CharSequence) obj;
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = charSequence;
                this.L$5 = charSequence4;
                this.label = 3;
                k = nohVar.k(this);
                if (k != coroutineSingletons) {
                    charSequence2 = charSequence;
                    charSequence3 = charSequence4;
                    obj = k;
                    return new erz(charSequence2, charSequence3, (Drawable) obj);
                }
                return coroutineSingletons;
            }
            h2 = (noh) this.L$3;
            h = (noh) this.L$2;
            b.b(obj);
        }
        CharSequence charSequence5 = (CharSequence) obj;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = h2;
        this.L$4 = charSequence5;
        this.label = 2;
        Object k2 = h.k(this);
        if (k2 != coroutineSingletons) {
            noh nohVar2 = h2;
            charSequence = charSequence5;
            obj = k2;
            nohVar = nohVar2;
            CharSequence charSequence42 = (CharSequence) obj;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.L$4 = charSequence;
            this.L$5 = charSequence42;
            this.label = 3;
            k = nohVar.k(this);
            if (k != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
