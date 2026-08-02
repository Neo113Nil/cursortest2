package com.yandex.go.taxi.order.details.v2.state.elements.photo;

import android.graphics.drawable.BitmapDrawable;
import defpackage.mfv;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ofp0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Landroid/graphics/drawable/BitmapDrawable;", "<anonymous>", "(Ltse;)Landroid/graphics/drawable/BitmapDrawable;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.order.details.v2.state.elements.photo.RideCardPhotoDataSource$loadCompanionImageByUrl$2", f = "RideCardPhotoDataSource.kt", l = {HProv.ALG_SID_NO_HASH, HProv.ALG_SID_NO_HASH}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class RideCardPhotoDataSource$loadCompanionImageByUrl$2 extends SuspendLambda implements wls {
    final /* synthetic */ int $height;
    final /* synthetic */ String $imageUrl;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RideCardPhotoDataSource$loadCompanionImageByUrl$2(a aVar, String str, int i, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$imageUrl = str;
        this.$height = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RideCardPhotoDataSource$loadCompanionImageByUrl$2(this.this$0, this.$imageUrl, this.$height, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RideCardPhotoDataSource$loadCompanionImageByUrl$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0046, code lost:
    
        if (r11 == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x002c, code lost:
    
        if (r11 == r0) goto L17;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            e eVar = this.this$0.b;
            String str = this.$imageUrl;
            this.label = 1;
            obj = e.o(eVar, str, null, this, 14);
        } else {
            if (i != 1) {
                if (i == 2) {
                    b.b(obj);
                    return (BitmapDrawable) obj;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) obj;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        e eVar2 = this.this$0.b;
        String str2 = this.$imageUrl;
        int i2 = ofp0.b;
        int i3 = this.$height;
        this.label = 2;
        obj = eVar2.j(str2, i2, i3, mfv.a, this);
    }
}
