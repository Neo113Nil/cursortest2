package xsna;

import android.graphics.PointF;
import com.vk.newsfeed.posting.crop_editor.domain.model.ImageLink;
import com.vk.newsfeed.posting.crop_editor.presentation.domain.model.RectPoints;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ofk;

/* compiled from: CropEditorScreen.kt */
@b6l(c = "com.vk.newsfeed.posting.crop_editor.presentation.base.view.CropEditorScreenKt$CropEditorScreen$4$1", f = "CropEditorScreen.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class pgk extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ ygk $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgk(ygk ygkVar, spj<? super pgk> spjVar) {
        super(2, spjVar);
        this.$state = ygkVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new pgk(this.$state, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((pgk) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        ygk ygkVar = this.$state;
        zhf0 zhf0Var = (zhf0) ((zak0) ygkVar.p).getValue();
        if (zhf0Var != null) {
            zhf0 zhf0Var2 = (zhf0) ((zak0) ygkVar.q).getValue();
            long j = ((ov70) ((zak0) ygkVar.v).getValue()).a;
            float d = ygkVar.d();
            ImageLink imageLink = ygkVar.d;
            long j2 = ygkVar.y;
            float width = imageLink.getWidth();
            zhf0 e = jcr.e(zhf0Var, j2, d);
            float i = jcr.i(width, e.c - e.a);
            long d2 = zhf0Var2.d();
            long e2 = ov70.e(ov70.e(e.c(), e.e()), j);
            int i2 = (int) (e2 >> 32);
            int i3 = (int) (d2 >> 32);
            float intBitsToFloat = (Float.intBitsToFloat(i2) - (Float.intBitsToFloat(i3) / 2.0f)) * i;
            float intBitsToFloat2 = ((Float.intBitsToFloat(i3) / 2.0f) + Float.intBitsToFloat(i2)) * i;
            int i4 = (int) (e2 & 4294967295L);
            int i5 = (int) (d2 & 4294967295L);
            float intBitsToFloat3 = (Float.intBitsToFloat(i4) - (Float.intBitsToFloat(i5) / 2.0f)) * i;
            float intBitsToFloat4 = ((Float.intBitsToFloat(i5) / 2.0f) + Float.intBitsToFloat(i4)) * i;
            ygkVar.e.invoke(new ofk.h(new RectPoints(new PointF(intBitsToFloat, intBitsToFloat3), new PointF(intBitsToFloat2, intBitsToFloat3), new PointF(intBitsToFloat2, intBitsToFloat4), new PointF(intBitsToFloat, intBitsToFloat4))));
        }
        return s3q0.a;
    }
}
