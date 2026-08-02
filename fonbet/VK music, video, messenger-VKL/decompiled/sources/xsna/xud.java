package xsna;

import android.content.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.vk.ads.easypromote.api.domain.model.EasyPromoteSettings;
import com.vk.dto.common.id.UserId;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import xsna.ulf;

/* compiled from: ClipsEasyPromoteFeatureHandler.kt */
@b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.handlers.ClipsEasyPromoteFeatureHandler$waitForIdAndOpenEasyPromote$1", f = "ClipsEasyPromoteFeatureHandler.kt", l = {TokenParametersOuterClass$TokenParameters.ADSERVICESVERSION_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes17.dex */
public final class xud extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ Integer $uploadId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ yud this$0;

    /* compiled from: ClipsEasyPromoteFeatureHandler.kt */
    public static final class a<T> implements lsr {
        public final /* synthetic */ yvj b;
        public final /* synthetic */ yud c;

        /* compiled from: ClipsEasyPromoteFeatureHandler.kt */
        @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.handlers.ClipsEasyPromoteFeatureHandler$waitForIdAndOpenEasyPromote$1$1$1", f = "ClipsEasyPromoteFeatureHandler.kt", l = {}, m = "invokeSuspend")
        /* renamed from: xsna.xud$a$a, reason: collision with other inner class name */
        public static final class C4048a extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
            final /* synthetic */ ulf.a $it;
            int label;
            final /* synthetic */ yud this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4048a(yud yudVar, ulf.a aVar, spj<? super C4048a> spjVar) {
                super(2, spjVar);
                this.this$0 = yudVar;
                this.$it = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final spj<s3q0> create(Object obj, spj<?> spjVar) {
                return new C4048a(this.this$0, this.$it, spjVar);
            }

            @Override // xsna.wzs
            public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
                return ((C4048a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
            }

            /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, kotlin.Lazy] */
            /* JADX WARN: Type inference failed for: r7v5, types: [java.lang.Object, kotlin.Lazy] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                yud yudVar = this.this$0;
                ulf.a aVar = this.$it;
                int i = aVar.a;
                UserId userId = aVar.b;
                EasyPromoteSettings b = ((kwo) yudVar.f.getValue()).b();
                String b2 = r11.b(new StringBuilder(), userId.b, '_', i);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
                simpleDateFormat.setLenient(false);
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.add(6, b.b);
                try {
                    String format = simpleDateFormat.format(calendar.getTime());
                    pkd pkdVar = (pkd) yudVar.g.getValue();
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    pkdVar.l(context, b2, String.valueOf(b.c), format);
                } catch (Throwable th) {
                    com.vk.metrics.eventtracking.b.a.a(th);
                }
                return s3q0.a;
            }
        }

        /* compiled from: ClipsEasyPromoteFeatureHandler.kt */
        @b6l(c = "com.vk.clips.upload.vk.ui.impl.fragment.handlers.ClipsEasyPromoteFeatureHandler$waitForIdAndOpenEasyPromote$1$1", f = "ClipsEasyPromoteFeatureHandler.kt", l = {TokenParametersOuterClass$TokenParameters.PUBEXTRADATA_FIELD_NUMBER}, m = "emit")
        public static final class b extends ContinuationImpl {
            Object L$0;
            int label;
            /* synthetic */ Object result;
            final /* synthetic */ a<T> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, spj<? super b> spjVar) {
                super(spjVar);
                this.this$0 = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return this.this$0.emit(null, this);
            }
        }

        public a(yvj yvjVar, yud yudVar) {
            this.b = yvjVar;
            this.c = yudVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        @Override // xsna.lsr
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(ulf.a aVar, spj<? super s3q0> spjVar) {
            b bVar;
            int i;
            if (spjVar instanceof b) {
                bVar = (b) spjVar;
                int i2 = bVar.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.label = i2 - Integer.MIN_VALUE;
                    Object obj = bVar.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = bVar.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        bdn bdnVar = bdn.a;
                        ge00 ge00Var = ie00.a;
                        C4048a c4048a = new C4048a(this.c, aVar, null);
                        bVar.L$0 = null;
                        bVar.label = 1;
                        if (myc0.k(ge00Var, c4048a, bVar) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.a.a(obj);
                    }
                    zvj.c(this.b, null);
                    return s3q0.a;
                }
            }
            bVar = new b(this, spjVar);
            Object obj2 = bVar.result;
            CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
            i = bVar.label;
            if (i != 0) {
            }
            zvj.c(this.b, null);
            return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xud(yud yudVar, Integer num, spj<? super xud> spjVar) {
        super(2, spjVar);
        this.this$0 = yudVar;
        this.$uploadId = num;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        xud xudVar = new xud(this.this$0, this.$uploadId, spjVar);
        xudVar.L$0 = obj;
        return xudVar;
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((xud) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        yvj yvjVar = (yvj) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.a.a(obj);
            izg0 e = this.this$0.c.e(this.$uploadId.intValue());
            a aVar = new a(yvjVar, this.this$0);
            this.L$0 = null;
            this.label = 1;
            if (e.collect(aVar, this) == coroutineSingletons) {
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
