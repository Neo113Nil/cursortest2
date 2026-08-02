package com.yandex.go.scooters.photocontrol.camera_ui.photo_result;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tio0;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.utils.e;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.photocontrol.camera_ui.photo_result.ScootersPhotocontrolPhotoResultPresenter$attachView$1", f = "ScootersPhotocontrolPhotoResultPresenter.kt", l = {45, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersPhotocontrolPhotoResultPresenter$attachView$1 extends SuspendLambda implements wls {
    final /* synthetic */ tio0 $mvpView;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersPhotocontrolPhotoResultPresenter$attachView$1(d dVar, tio0 tio0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$mvpView = tio0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersPhotocontrolPhotoResultPresenter$attachView$1 scootersPhotocontrolPhotoResultPresenter$attachView$1 = new ScootersPhotocontrolPhotoResultPresenter$attachView$1(this.this$0, this.$mvpView, continuation);
        scootersPhotocontrolPhotoResultPresenter$attachView$1.L$0 = obj;
        return scootersPhotocontrolPhotoResultPresenter$attachView$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersPhotocontrolPhotoResultPresenter$attachView$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r9 == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r9 == r1) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        tio0 tio0Var;
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.x.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            ScootersPhotocontrolPhotoResultPresenter$attachView$1$photoPath$1 scootersPhotocontrolPhotoResultPresenter$attachView$1$photoPath$1 = new ScootersPhotocontrolPhotoResultPresenter$attachView$1$photoPath$1(this.this$0, null);
            this.L$0 = tseVar;
            this.label = 1;
            obj = tje.k0(mdhVar, scootersPhotocontrolPhotoResultPresenter$attachView$1$photoPath$1, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                tio0Var = (tio0) this.L$2;
                kotlin.b.b(obj);
                tio0Var.N((Drawable) obj);
                this.$mvpView.B();
                return zy11Var;
            }
            kotlin.b.b(obj);
        }
        Uri uri = (Uri) obj;
        tio0Var = this.$mvpView;
        if (uri == null) {
            tio0Var.If();
            return zy11Var;
        }
        e eVar = this.this$0.z;
        String uri2 = uri.toString();
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = tio0Var;
        this.label = 2;
        obj = e.k(eVar, uri2, null, this, 14);
    }
}
