package xsna;

import androidx.car.app.hardware.common.CarZone;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.mediastore.system.AlbumEntry;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.PropertyReference0Impl;

/* compiled from: MediaStoreLoaderImpl.kt */
@b6l(c = "com.vk.mediastore.system.coroutines.MediaStoreLoaderImpl$loadAlbums$1", f = "MediaStoreLoaderImpl.kt", l = {CarZone.CAR_ZONE_COLUMN_PASSENGER}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class tz10 extends SuspendLambda implements wzs<zhd0<? super List<? extends AlbumEntry>>, spj<? super s3q0>, Object> {
    final /* synthetic */ String $allPhotosAlbumName;
    final /* synthetic */ int $mediaType;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ zz10 this$0;

    /* compiled from: MediaStoreLoaderImpl.kt */
    public static final /* synthetic */ class a extends PropertyReference0Impl {
        @Override // kotlin.jvm.internal.PropertyReference0Impl, xsna.rcy
        public final Object get() {
            return Boolean.valueOf(!zvj.f((yvj) this.receiver));
        }
    }

    /* compiled from: MediaStoreLoaderImpl.kt */
    public static final /* synthetic */ class b extends AdaptedFunctionReference implements izs<List<? extends AlbumEntry>, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(List<? extends AlbumEntry> list) {
            zfb.a(list, (zhd0) this.receiver);
            return s3q0.a;
        }
    }

    /* compiled from: MediaStoreLoaderImpl.kt */
    public static final /* synthetic */ class c extends AdaptedFunctionReference implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((zhd0) this.receiver).B(null);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tz10(zz10 zz10Var, int i, String str, spj<? super tz10> spjVar) {
        super(2, spjVar);
        this.this$0 = zz10Var;
        this.$mediaType = i;
        this.$allPhotosAlbumName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        tz10 tz10Var = new tz10(this.this$0, this.$mediaType, this.$allPhotosAlbumName, spjVar);
        tz10Var.L$0 = obj;
        return tz10Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super List<? extends AlbumEntry>> zhd0Var, spj<? super s3q0> spjVar) {
        return ((tz10) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var = (zhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            rq10 rq10Var = this.this$0.a;
            int i2 = this.$mediaType;
            String str = this.$allPhotosAlbumName;
            a aVar = new a(zhd0Var, a020.class, "isNotActive", "isNotActive(Lkotlinx/coroutines/CoroutineScope;)Z", 1);
            b bVar = new b(1, zhd0Var, yfb.class, "trySendBlocking", "trySendBlocking(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Ljava/lang/Object;", 9);
            c cVar = new c(0, zhd0Var, zhd0.class, CampaignEx.JSON_NATIVE_VIDEO_CLOSE, "close(Ljava/lang/Throwable;)Z", 8);
            String[] strArr = rq10.e;
            rq10Var.g(i2, str, true, aVar, bVar, cVar);
            this.L$0 = null;
            this.label = 1;
            if (phd0.a(zhd0Var, new ob0(25), this) == coroutineSingletons) {
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
