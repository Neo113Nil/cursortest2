package xsna;

import com.vk.mediastore.system.AlbumEntry;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: MediaPickerRepositoryImpl.kt */
@b6l(c = "com.vk.mediapicker.impl.data.MediaPickerRepositoryImpl$observeAlbums$2", f = "MediaPickerRepositoryImpl.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class mu10 extends SuspendLambda implements wzs<lsr<? super List<? extends AlbumEntry>>, spj<? super s3q0>, Object> {
    final /* synthetic */ int $mediaType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ nu10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu10(nu10 nu10Var, int i, spj<? super mu10> spjVar) {
        super(2, spjVar);
        this.this$0 = nu10Var;
        this.$mediaType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        mu10 mu10Var = new mu10(this.this$0, this.$mediaType, spjVar);
        mu10Var.L$0 = obj;
        return mu10Var;
    }

    @Override // xsna.wzs
    public final Object invoke(lsr<? super List<? extends AlbumEntry>> lsrVar, spj<? super s3q0> spjVar) {
        return ((mu10) create(lsrVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        lsr lsrVar = (lsr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            nu10 nu10Var = this.this$0;
            int i2 = this.$mediaType;
            zz10 zz10Var = nu10Var.a;
            ksr q = rsr.q(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.i(new tz10(zz10Var, i2, nu10Var.b.getString(i2 != 222 ? i2 != 333 ? R.string.picker_all_photos_videos : R.string.picker_all_videos : R.string.picker_all_photos), null)), new uz10(zz10Var, i2, null)), hqu0.b());
            this.L$0 = null;
            this.label = 1;
            if (rsr.m(lsrVar, q, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
        }
        return s3q0.a;
    }
}
