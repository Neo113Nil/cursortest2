package com.yandex.go.scooters.photocontrol.camera_ui.take_photo;

import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import defpackage.fjo0;
import defpackage.gjo0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;
import ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.CameraControlRepository$listenToCameraStreamState$$inlined$flatMapLatest$1;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.photocontrol.camera_ui.take_photo.ScootersPhotocontrolTakePhotoPresenter$attachView$1", f = "ScootersPhotocontrolTakePhotoPresenter.kt", l = {36, 37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolTakePhotoPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ fjo0 $mvpView;
    int label;
    final /* synthetic */ gjo0 this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "isRunning"}, k = 3, mv = {2, 4, 0}, xi = 48)
    @mvg(c = "com.yandex.go.scooters.photocontrol.camera_ui.take_photo.ScootersPhotocontrolTakePhotoPresenter$attachView$1$1", f = "ScootersPhotocontrolTakePhotoPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.scooters.photocontrol.camera_ui.take_photo.ScootersPhotocontrolTakePhotoPresenter$attachView$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        /* synthetic */ boolean Z$0;
        int label;

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, continuation);
            anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
            return anonymousClass1;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            Boolean bool = (Boolean) obj;
            bool.booleanValue();
            return ((AnonymousClass1) create(bool, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            boolean z = this.Z$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return Boolean.valueOf(z);
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolTakePhotoPresenter$attachView$1(gjo0 gjo0Var, fjo0 fjo0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gjo0Var;
        this.$mvpView = fjo0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersPhotocontrolTakePhotoPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPhotocontrolTakePhotoPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
    
        if (r7 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0049, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0038, code lost:
    
        if (kotlinx.coroutines.flow.e.x(r7, r1, r6) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            ru.yandex.taxi.scooters.presentation.common.ui.camera.screens.image_stream.a aVar = this.this$0.A;
            g X = e.X(aVar.b, new CameraControlRepository$listenToCameraStreamState$$inlined$flatMapLatest$1(null, aVar));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(2, null);
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                if (((Boolean) obj).booleanValue()) {
                    gjo0 gjo0Var = this.this$0;
                    tje.N(gjo0Var.Jg(), null, null, new ScootersPhotocontrolTakePhotoPresenter$listenPoints$$inlined$safeCollectIn$1(gjo0Var.C.a(), null, (fjo0) gjo0Var.Dg(), gjo0Var.B), 3);
                    this.$mvpView.De(true);
                } else {
                    this.$mvpView.De(false);
                }
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        gjo0 gjo0Var2 = this.this$0;
        com.yandex.go.scooters.photocontrol.data.a aVar2 = gjo0Var2.y;
        ScootersExamType scootersExamType = gjo0Var2.z;
        this.label = 2;
        obj = aVar2.d(scootersExamType, this);
    }
}
