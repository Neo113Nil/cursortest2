package com.yandex.go.pickup_from_photo.data;

import com.yandex.go.pickup_from_photo.data.api.PickupPhotoRecognitionApi;
import com.yandex.go.pickup_from_photo.data.model.PickupFromPhotoUploadResponse;
import com.yandex.go.pickup_from_photo.domain.exception.UploadPhotosException;
import com.ybsdk.widgets.common.rangedatepicker.CalendarDayView;
import defpackage.brb1;
import defpackage.cmt;
import defpackage.m5j0;
import defpackage.mvg;
import defpackage.nhb0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.qje;
import defpackage.rol0;
import defpackage.tcc;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wg10;
import defpackage.wls;
import defpackage.wms;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeoutException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.Regex;
import kotlinx.coroutines.flow.e;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/pickup_from_photo/data/model/PhotoCoordinates;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.pickup_from_photo.data.PickupFromPhotoUploadRepository$uploadPhotos$2", f = "PickupFromPhotoUploadRepository.kt", l = {58, CalendarDayView.DISABLED_DAY_ALPHA}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PickupFromPhotoUploadRepository$uploadPhotos$2 extends SuspendLambda implements wls {
    final /* synthetic */ List<byte[]> $photosByteArrays;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.pickup_from_photo.data.PickupFromPhotoUploadRepository$uploadPhotos$2$1", f = "PickupFromPhotoUploadRepository.kt", l = {66}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.pickup_from_photo.data.PickupFromPhotoUploadRepository$uploadPhotos$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ PickupFromPhotoUploadResponse $response;
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, PickupFromPhotoUploadResponse pickupFromPhotoUploadResponse, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
            this.$response = pickupFromPhotoUploadResponse;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$response, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                c cVar = this.this$0;
                String str = this.$response.a;
                this.label = 1;
                if (c.a(cVar, str, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
            }
            return zy11.a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "", "Lcom/yandex/go/pickup_from_photo/data/model/PhotoCoordinates;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.pickup_from_photo.data.PickupFromPhotoUploadRepository$uploadPhotos$2$2", f = "PickupFromPhotoUploadRepository.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.pickup_from_photo.data.PickupFromPhotoUploadRepository$uploadPhotos$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ c this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(c cVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            ((AnonymousClass2) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            pzt0 pzt0Var = this.this$0.g;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            throw new TimeoutException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PickupFromPhotoUploadRepository$uploadPhotos$2(c cVar, List list, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
        this.$photosByteArrays = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PickupFromPhotoUploadRepository$uploadPhotos$2 pickupFromPhotoUploadRepository$uploadPhotos$2 = new PickupFromPhotoUploadRepository$uploadPhotos$2(this.this$0, this.$photosByteArrays, continuation);
        pickupFromPhotoUploadRepository$uploadPhotos$2.L$0 = obj;
        return pickupFromPhotoUploadRepository$uploadPhotos$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PickupFromPhotoUploadRepository$uploadPhotos$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object failure;
        wg10 wg10Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            pzt0 pzt0Var = this.this$0.g;
            if (pzt0Var != null) {
                pzt0Var.a(null);
            }
            List<byte[]> list = this.$photosByteArrays;
            c cVar = this.this$0;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            for (byte[] bArr : list) {
                cVar.getClass();
                int i2 = m5j0.a;
                Regex regex = wg10.e;
                try {
                    wg10Var = qje.o("image/jpeg");
                } catch (IllegalArgumentException unused) {
                    wg10Var = null;
                }
                arrayList.add(brb1.b("files", "file", wms.b(6, wg10Var, bArr)));
            }
            nhb0 nhb0Var = this.this$0.c.a;
            nhb0Var.getClass();
            nhb0Var.a.a("PhotoPickUp.Loading.Started", new HashMap(), 1, new HashMap());
            cmt<PickupFromPhotoUploadResponse> b = ((PickupPhotoRecognitionApi) this.this$0.e.getValue()).b(arrayList);
            this.L$0 = tseVar;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = ru.yandex.taxi.network.api.a.a(b, null, this);
            if (obj == coroutineSingletons) {
            }
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return obj;
            }
            kotlin.b.b(obj);
        }
        failure = (PickupFromPhotoUploadResponse) obj;
        if (Result.a(failure) != null) {
            throw new UploadPhotosException();
        }
        kotlin.b.b(failure);
        PickupFromPhotoUploadResponse pickupFromPhotoUploadResponse = (PickupFromPhotoUploadResponse) failure;
        this.this$0.d.b = pickupFromPhotoUploadResponse.a;
        c cVar2 = this.this$0;
        cVar2.g = com.yandex.go.coroutines.b.g(tseVar, null, null, new AnonymousClass1(cVar2, pickupFromPhotoUploadResponse, null), 3);
        rol0 k = com.yandex.go.coroutines.b.k(this.this$0.f, r11.b.b().j.b * 1000, new rol0(new AnonymousClass2(this.this$0, null)));
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 2;
        Object y = e.y(k, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
