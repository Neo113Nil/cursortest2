package com.yandex.go.slot.mapper;

import android.graphics.drawable.BitmapDrawable;
import com.yandex.go.slot.dto.SlotItemLeadDto$Type;
import com.yandex.go.slot.dto.k2;
import defpackage.ess0;
import defpackage.fss0;
import defpackage.mvg;
import defpackage.n7v;
import defpackage.ny61;
import defpackage.pkf;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/graphics/drawable/BitmapDrawable;", "drawable", "Lgss0;", "<anonymous>", "(Landroid/graphics/drawable/BitmapDrawable;)Lgss0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.slot.mapper.SlotItemMapperImpl$leadFlow$1", f = "SlotItemMapperImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SlotItemMapperImpl$leadFlow$1 extends SuspendLambda implements wls {
    final /* synthetic */ n7v $image;
    final /* synthetic */ k2 $lead;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlotItemMapperImpl$leadFlow$1(a aVar, n7v n7vVar, k2 k2Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$image = n7vVar;
        this.$lead = k2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SlotItemMapperImpl$leadFlow$1 slotItemMapperImpl$leadFlow$1 = new SlotItemMapperImpl$leadFlow$1(this.this$0, this.$image, this.$lead, continuation);
        slotItemMapperImpl$leadFlow$1.L$0 = obj;
        return slotItemMapperImpl$leadFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SlotItemMapperImpl$leadFlow$1) create((BitmapDrawable) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        BitmapDrawable bitmapDrawable = (BitmapDrawable) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        if (bitmapDrawable == null || bitmapDrawable.getBitmap() == null) {
            return ess0.a;
        }
        a aVar = this.this$0;
        n7v n7vVar = this.$image;
        SlotItemLeadDto$Type b = this.$lead.b();
        aVar.getClass();
        return new fss0(pkf.g(bitmapDrawable, a.w(n7vVar, b), this.this$0.d.getThemeType()), true);
    }
}
