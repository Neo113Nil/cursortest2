package xsna;

import com.vk.mediastore.system.AlbumEntry;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: MediaStoreLoaderImpl.kt */
@b6l(c = "com.vk.mediastore.system.coroutines.MediaStoreLoaderImpl$loadAlbums$2", f = "MediaStoreLoaderImpl.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class uz10 extends SuspendLambda implements wzs<List<? extends AlbumEntry>, spj<? super s3q0>, Object> {
    final /* synthetic */ int $mediaType;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zz10 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uz10(zz10 zz10Var, int i, spj<? super uz10> spjVar) {
        super(2, spjVar);
        this.this$0 = zz10Var;
        this.$mediaType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        uz10 uz10Var = new uz10(this.this$0, this.$mediaType, spjVar);
        uz10Var.L$0 = obj;
        return uz10Var;
    }

    @Override // xsna.wzs
    public final Object invoke(List<? extends AlbumEntry> list, spj<? super s3q0> spjVar) {
        return ((uz10) create(list, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.a(obj);
        zy10 zy10Var = this.this$0.b;
        int i = this.$mediaType;
        zy10Var.getClass();
        ArrayList a = i7o0.a(list);
        if (i == 111) {
            zy10Var.a = a;
        }
        return s3q0.a;
    }
}
