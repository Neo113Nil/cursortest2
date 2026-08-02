package xsna;

import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import com.vk.mediastore.system.AlbumEntry;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;

/* compiled from: MediaPickerRepositoryImpl.kt */
@b6l(c = "com.vk.mediapicker.impl.data.MediaPickerRepositoryImpl$observeAlbums$1", f = "MediaPickerRepositoryImpl.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class lu10 extends SuspendLambda implements wzs<zhd0<? super List<? extends AlbumEntry>>, spj<? super s3q0>, Object> {
    final /* synthetic */ int $mediaType;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ nu10 this$0;

    /* compiled from: MediaPickerRepositoryImpl.kt */
    public static final class a extends ContentObserver {
        public final /* synthetic */ zhd0<List<AlbumEntry>> a;
        public final /* synthetic */ nu10 b;
        public final /* synthetic */ int c;

        /* compiled from: MediaPickerRepositoryImpl.kt */
        @b6l(c = "com.vk.mediapicker.impl.data.MediaPickerRepositoryImpl$observeAlbums$1$contentObserver$1$onChange$1", f = "MediaPickerRepositoryImpl.kt", l = {30}, m = "invokeSuspend")
        /* renamed from: xsna.lu10$a$a, reason: collision with other inner class name */
        public static final class C3300a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ zhd0<List<AlbumEntry>> $$this$callbackFlow;
            final /* synthetic */ int $mediaType;
            int label;
            final /* synthetic */ nu10 this$0;

            /* compiled from: MediaPickerRepositoryImpl.kt */
            /* renamed from: xsna.lu10$a$a$a, reason: collision with other inner class name */
            public static final class C3301a<T> implements lsr {
                public final /* synthetic */ zhd0<List<AlbumEntry>> b;

                /* JADX WARN: Multi-variable type inference failed */
                public C3301a(zhd0<? super List<AlbumEntry>> zhd0Var) {
                    this.b = zhd0Var;
                }

                @Override // xsna.lsr
                public final Object emit(Object obj, spj spjVar) {
                    Object t = this.b.t((List) obj, spjVar);
                    return t == CoroutineSingletons.COROUTINE_SUSPENDED ? t : s3q0.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C3300a(nu10 nu10Var, int i, zhd0<? super List<AlbumEntry>> zhd0Var, spj<? super C3300a> spjVar) {
                super(2, spjVar);
                this.this$0 = nu10Var;
                this.$mediaType = i;
                this.$$this$callbackFlow = zhd0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C3300a(this.this$0, this.$mediaType, this.$$this$callbackFlow, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C3300a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                if (i == 0) {
                    kotlin.a.a(obj);
                    nu10 nu10Var = this.this$0;
                    int i2 = this.$mediaType;
                    zz10 zz10Var = nu10Var.a;
                    ksr q = rsr.q(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(rsr.i(new tz10(zz10Var, i2, nu10Var.b.getString(i2 != 222 ? i2 != 333 ? R.string.picker_all_photos_videos : R.string.picker_all_videos : R.string.picker_all_photos), null)), new uz10(zz10Var, i2, null)), hqu0.b());
                    C3301a c3301a = new C3301a(this.$$this$callbackFlow);
                    this.label = 1;
                    if (q.collect(c3301a, this) == coroutineSingletons) {
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(zhd0<? super List<AlbumEntry>> zhd0Var, nu10 nu10Var, int i, Handler handler) {
            super(handler);
            this.a = zhd0Var;
            this.b = nu10Var;
            this.c = i;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            nu10 nu10Var = this.b;
            int i = this.c;
            zhd0<List<AlbumEntry>> zhd0Var = this.a;
            myc0.h(zhd0Var, null, null, new C3300a(nu10Var, i, zhd0Var, null), 3);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu10(nu10 nu10Var, int i, spj<? super lu10> spjVar) {
        super(2, spjVar);
        this.this$0 = nu10Var;
        this.$mediaType = i;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        lu10 lu10Var = new lu10(this.this$0, this.$mediaType, spjVar);
        lu10Var.L$0 = obj;
        return lu10Var;
    }

    @Override // xsna.wzs
    public final Object invoke(zhd0<? super List<? extends AlbumEntry>> zhd0Var, spj<? super s3q0> spjVar) {
        return ((lu10) create(zhd0Var, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        zhd0 zhd0Var = (zhd0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            a aVar = new a(zhd0Var, this.this$0, this.$mediaType, new Handler(Looper.getMainLooper()));
            nu10 nu10Var = this.this$0;
            int i2 = this.$mediaType;
            nu10Var.getClass();
            Iterable iterable = i2 != 111 ? i2 != 222 ? i2 != 333 ? h020.c : h020.b : h020.a : h020.c;
            nu10 nu10Var2 = this.this$0;
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                nu10Var2.b.getContentResolver().registerContentObserver((Uri) it.next(), true, aVar);
            }
            y4 y4Var = new y4(15, this.this$0, aVar);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (phd0.a(zhd0Var, y4Var, this) == coroutineSingletons) {
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
