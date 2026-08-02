package xsna;

import android.graphics.Bitmap;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.photo.editor.chronicle.ChronicleLowMemoryException;
import com.vk.photo.editor.domain.LowMemoryException;
import com.vk.photoeditor.engine.PhotoEditorEngine;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FilterPreviewRepository.kt */
@b6l(c = "com.vk.photo.editor.repository.filter.FilterPreviewRepository$createPreview$jobForAwait$1$deferred$1", f = "FilterPreviewRepository.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes4.dex */
public final class gdr extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
    final /* synthetic */ ota0 $filterPreview;
    final /* synthetic */ aa00 $lutWrapper;
    int label;
    final /* synthetic */ hdr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gdr(hdr hdrVar, aa00 aa00Var, ota0 ota0Var, spj<? super gdr> spjVar) {
        super(2, spjVar);
        this.this$0 = hdrVar;
        this.$lutWrapper = aa00Var;
        this.$filterPreview = ota0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new gdr(this.this$0, this.$lutWrapper, this.$filterPreview, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
        return ((gdr) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Bitmap bitmap;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            return obj;
        }
        kotlin.a.a(obj);
        hdr hdrVar = this.this$0;
        aa00 aa00Var = this.$lutWrapper;
        Object obj2 = this.$filterPreview;
        this.label = 1;
        hdrVar.getClass();
        List<ota0> list = aa00Var.c;
        if (list == null) {
            bitmap = ((ld7) obj2).a;
        } else {
            for (ota0 ota0Var : list) {
                try {
                    if (!(obj2 instanceof ld7)) {
                        throw new IllegalArgumentException("image is not BitmapWrapper");
                    }
                    if (!(ota0Var instanceof ld7)) {
                        throw new IllegalArgumentException("lut is not BitmapWrapper");
                    }
                    Bitmap a = zbc.a(((ld7) obj2).a);
                    PhotoEditorEngine.i(a, zbc.a(((ld7) ota0Var).a), 1.0f);
                    obj2 = new ld7(a);
                } catch (ChronicleLowMemoryException e) {
                    throw new LowMemoryException(e.getMessage(), 2);
                }
            }
            bitmap = ((ld7) obj2).a;
        }
        return bitmap == coroutineSingletons ? coroutineSingletons : bitmap;
    }
}
