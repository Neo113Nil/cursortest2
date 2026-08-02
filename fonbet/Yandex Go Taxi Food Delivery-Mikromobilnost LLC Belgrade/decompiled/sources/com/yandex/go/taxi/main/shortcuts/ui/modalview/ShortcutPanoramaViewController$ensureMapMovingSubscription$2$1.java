package com.yandex.go.taxi.main.shortcuts.ui.modalview;

import android.widget.FrameLayout;
import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import com.yandex.go.address.models.Address;
import defpackage.e8y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vb90;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutPanoramaViewController$ensureMapMovingSubscription$2$1", f = "ShortcutPanoramaViewController.kt", l = {184, SubsamplingScaleImageView.ORIENTATION_180}, m = "invokeSuspend", v = 2)
/* loaded from: classes14.dex */
final class ShortcutPanoramaViewController$ensureMapMovingSubscription$2$1 extends SuspendLambda implements wls {
    final /* synthetic */ vb90 $snapshot;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutPanoramaViewController$ensureMapMovingSubscription$2$1(d dVar, vb90 vb90Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
        this.$snapshot = vb90Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutPanoramaViewController$ensureMapMovingSubscription$2$1(this.this$0, this.$snapshot, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutPanoramaViewController$ensureMapMovingSubscription$2$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (com.yandex.go.taxi.main.shortcuts.ui.modalview.d.a(r5, r6, r7, r8, (ru.yandex.taxi.panorama.d) r12, r11) == r0) goto L16;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        FloatButtonHolderLayout floatButtonHolderLayout;
        d dVar;
        FrameLayout frameLayout;
        Address address;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar2 = this.this$0;
            vb90 vb90Var = this.$snapshot;
            FloatButtonHolderLayout floatButtonHolderLayout2 = vb90Var.a;
            Address address2 = vb90Var.b;
            FrameLayout frameLayout2 = vb90Var.c;
            e8y0 e8y0Var = dVar2.e;
            this.L$0 = dVar2;
            this.L$1 = floatButtonHolderLayout2;
            this.L$2 = address2;
            this.L$3 = frameLayout2;
            this.label = 1;
            Object b = e8y0Var.a.b(this);
            if (b != coroutineSingletons) {
                floatButtonHolderLayout = floatButtonHolderLayout2;
                dVar = dVar2;
                frameLayout = frameLayout2;
                address = address2;
                obj = b;
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i == 2) {
                kotlin.b.b(obj);
                return zy11.a;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        FrameLayout frameLayout3 = (FrameLayout) this.L$3;
        Address address3 = (Address) this.L$2;
        FloatButtonHolderLayout floatButtonHolderLayout3 = (FloatButtonHolderLayout) this.L$1;
        d dVar3 = (d) this.L$0;
        kotlin.b.b(obj);
        floatButtonHolderLayout = floatButtonHolderLayout3;
        dVar = dVar3;
        frameLayout = frameLayout3;
        address = address3;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
