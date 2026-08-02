package com.yandex.go.taxi.order.bottom_modal.domain;

import android.graphics.drawable.BitmapDrawable;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.cd6;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.bottom_modal.domain.BottomModalUiStateMapper$addIcon$2", f = "BottomModalUiStateMapper.kt", l = {CalendarDayView.DISABLED_DAY_ALPHA, HProv.ALG_SID_SHA3_224}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class BottomModalUiStateMapper$addIcon$2 extends SuspendLambda implements wls {
    final /* synthetic */ n7v $icon;
    final /* synthetic */ List<Object> $this_addIcon;
    Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BottomModalUiStateMapper$addIcon$2(n7v n7vVar, b bVar, List list, Continuation continuation) {
        super(2, continuation);
        this.$icon = n7vVar;
        this.this$0 = bVar;
        this.$this_addIcon = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BottomModalUiStateMapper$addIcon$2(this.$icon, this.this$0, this.$this_addIcon, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BottomModalUiStateMapper$addIcon$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0083  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        BitmapDrawable bitmapDrawable;
        String str2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            n7v n7vVar = this.$icon;
            String str3 = n7vVar != null ? n7vVar.c : null;
            if (str3 == null || evu0.J(str3)) {
                n7v n7vVar2 = this.$icon;
                String str4 = n7vVar2 != null ? n7vVar2.b : null;
                if (str4 == null || evu0.J(str4)) {
                    return Boolean.FALSE;
                }
            }
            String a = this.this$0.c.a(this.$icon);
            if (a == null) {
                return Boolean.FALSE;
            }
            e eVar = this.this$0.d;
            this.L$0 = a;
            this.label = 1;
            Object o = e.o(eVar, a, null, this, 14);
            if (o != coroutineSingletons) {
                str = a;
                obj = o;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.L$0;
            kotlin.b.b(obj);
            bitmapDrawable = (BitmapDrawable) obj;
            if (bitmapDrawable != null) {
                return Boolean.FALSE;
            }
            str = str2;
            this.$this_addIcon.add(new cd6(pkf.g(bitmapDrawable, str, null)));
            return Boolean.TRUE;
        }
        str = (String) this.L$0;
        kotlin.b.b(obj);
        bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable == null) {
            e eVar2 = this.this$0.d;
            this.L$0 = str;
            this.label = 2;
            obj = e.k(eVar2, str, null, this, 14);
            if (obj != coroutineSingletons) {
                str2 = str;
                bitmapDrawable = (BitmapDrawable) obj;
                if (bitmapDrawable != null) {
                }
            }
            return coroutineSingletons;
        }
        this.$this_addIcon.add(new cd6(pkf.g(bitmapDrawable, str, null)));
        return Boolean.TRUE;
    }
}
