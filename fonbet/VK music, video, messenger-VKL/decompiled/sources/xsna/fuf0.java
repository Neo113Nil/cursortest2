package xsna;

import android.content.Context;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.ok.android.api.json.JsonToken;

/* compiled from: rememberLottieComposition.kt */
@b6l(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {JsonToken.END_ARRAY, 95}, m = "invokeSuspend")
/* loaded from: classes12.dex */
public final class fuf0 extends SuspendLambda implements wzs<yvj, spj<? super s3q0>, Object> {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ yzs<Integer, Throwable, spj<? super Boolean>, Object> $onRetry;
    final /* synthetic */ wh50<t700> $result$delegate;
    final /* synthetic */ u700 $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public fuf0(yzs<? super Integer, ? super Throwable, ? super spj<? super Boolean>, ? extends Object> yzsVar, Context context, u700 u700Var, String str, String str2, String str3, String str4, wh50<t700> wh50Var, spj<? super fuf0> spjVar) {
        super(2, spjVar);
        this.$onRetry = yzsVar;
        this.$context = context;
        this.$spec = u700Var;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = wh50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        return new fuf0(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, spjVar);
    }

    @Override // xsna.wzs
    public final Object invoke(yvj yvjVar, spj<? super s3q0> spjVar) {
        return ((fuf0) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0063, code lost:
    
        if (r7 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d2, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d0, code lost:
    
        if (r7 != r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0014, B:9:0x00d3, B:10:0x00dd, B:14:0x00ec, B:26:0x0072, B:28:0x007c, B:31:0x0083, B:34:0x0092, B:36:0x0096, B:39:0x009d, B:42:0x00ad, B:45:0x00c3, B:47:0x00b8, B:50:0x00bf, B:51:0x00a5, B:53:0x008a, B:73:0x00fa, B:77:0x0102, B:12:0x00de, B:72:0x00ee), top: B:6:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a5 A[Catch: all -> 0x001b, TryCatch #2 {all -> 0x001b, blocks: (B:7:0x0014, B:9:0x00d3, B:10:0x00dd, B:14:0x00ec, B:26:0x0072, B:28:0x007c, B:31:0x0083, B:34:0x0092, B:36:0x0096, B:39:0x009d, B:42:0x00ad, B:45:0x00c3, B:47:0x00b8, B:50:0x00bf, B:51:0x00a5, B:53:0x008a, B:73:0x00fa, B:77:0x0102, B:12:0x00de, B:72:0x00ee), top: B:6:0x0014, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0128 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00d0 -> B:9:0x00d3). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Throwable th;
        t700 value;
        String str;
        String str2;
        String str3;
        Object a;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.a.a(obj);
            i = 0;
            th = null;
            if (!((Boolean) this.$result$delegate.getValue().f.getValue()).booleanValue()) {
            }
            if (!((Boolean) this.$result$delegate.getValue().e.getValue()).booleanValue()) {
                value = this.$result$delegate.getValue();
                synchronized (value) {
                }
            }
            return s3q0.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            int i3 = this.I$0;
            Throwable th2 = (Throwable) this.L$0;
            try {
                kotlin.a.a(obj);
                a = obj;
            } catch (Throwable th3) {
                int i4 = i3;
                th = th3;
                i = i4 + 1;
            }
            i700 i700Var = (i700) a;
            t700 value2 = this.$result$delegate.getValue();
            synchronized (value2) {
            }
            if (!((Boolean) value2.e.getValue()).booleanValue()) {
                ((zak0) value2.c).setValue(i700Var);
                value2.b.i0(i700Var);
            }
            int i5 = i3;
            th = th2;
            i = i5;
            if (!((Boolean) this.$result$delegate.getValue().f.getValue()).booleanValue()) {
                if (i != 0) {
                    yzs<Integer, Throwable, spj<? super Boolean>, Object> yzsVar = this.$onRetry;
                    Integer num = new Integer(i);
                    this.L$0 = th;
                    this.I$0 = i;
                    this.label = 1;
                    obj2 = yzsVar.invoke(num, th, this);
                }
                Throwable th4 = th;
                i3 = i;
                th2 = th4;
                Context context = this.$context;
                u700 u700Var = this.$spec;
                String str4 = this.$imageAssetsFolder;
                if (str4 != null && !drm0.N(str4)) {
                    if (!drm0.G(str4, '/')) {
                        str4 = str4.concat(DomExceptionUtils.SEPARATOR);
                    }
                    str = this.$fontAssetsFolder;
                    if (str != null && !drm0.N(str)) {
                        if (!drm0.G(str, '/')) {
                            str = str.concat(DomExceptionUtils.SEPARATOR);
                        }
                        str2 = str;
                        str3 = this.$fontFileExtension;
                        if (!drm0.N(str3) && !brm0.B(str3, ".", false)) {
                            str3 = ".".concat(str3);
                        }
                        String str5 = this.$cacheKey;
                        this.L$0 = th2;
                        this.I$0 = i3;
                        this.label = 2;
                        a = guf0.a(context, u700Var, str4, str2, str3, str5, this);
                    }
                    str2 = null;
                    str3 = this.$fontFileExtension;
                    if (!drm0.N(str3)) {
                        str3 = ".".concat(str3);
                    }
                    String str52 = this.$cacheKey;
                    this.L$0 = th2;
                    this.I$0 = i3;
                    this.label = 2;
                    a = guf0.a(context, u700Var, str4, str2, str3, str52, this);
                }
                str4 = null;
                str = this.$fontAssetsFolder;
                if (str != null) {
                    if (!drm0.G(str, '/')) {
                    }
                    str2 = str;
                    str3 = this.$fontFileExtension;
                    if (!drm0.N(str3)) {
                    }
                    String str522 = this.$cacheKey;
                    this.L$0 = th2;
                    this.I$0 = i3;
                    this.label = 2;
                    a = guf0.a(context, u700Var, str4, str2, str3, str522, this);
                }
                str2 = null;
                str3 = this.$fontFileExtension;
                if (!drm0.N(str3)) {
                }
                String str5222 = this.$cacheKey;
                this.L$0 = th2;
                this.I$0 = i3;
                this.label = 2;
                a = guf0.a(context, u700Var, str4, str2, str3, str5222, this);
            }
            if (!((Boolean) this.$result$delegate.getValue().e.getValue()).booleanValue() && th != null) {
                value = this.$result$delegate.getValue();
                synchronized (value) {
                    if (!((Boolean) value.e.getValue()).booleanValue()) {
                        ((zak0) value.d).setValue(th);
                        value.b.A(th);
                    }
                }
            }
            return s3q0.a;
        }
        i = this.I$0;
        th = (Throwable) this.L$0;
        kotlin.a.a(obj);
        obj2 = obj;
    }
}
