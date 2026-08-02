package com.airbnb.lottie.compose;

import android.content.Context;
import defpackage.btz;
import defpackage.cvu0;
import defpackage.evu0;
import defpackage.mvg;
import defpackage.nsz;
import defpackage.ny61;
import defpackage.oz40;
import defpackage.tse;
import defpackage.wls;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {1, 9, 0})
@mvg(c = "com.airbnb.lottie.compose.RememberLottieCompositionKt$rememberLottieComposition$3", f = "rememberLottieComposition.kt", l = {HProv.PP_CIPHEROID, HProv.PP_DHOID}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class RememberLottieCompositionKt$rememberLottieComposition$3 extends SuspendLambda implements wls {
    final /* synthetic */ String $cacheKey;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $fontAssetsFolder;
    final /* synthetic */ String $fontFileExtension;
    final /* synthetic */ String $imageAssetsFolder;
    final /* synthetic */ zls $onRetry;
    final /* synthetic */ oz40 $result$delegate;
    final /* synthetic */ btz $spec;
    int I$0;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RememberLottieCompositionKt$rememberLottieComposition$3(zls zlsVar, Context context, btz btzVar, String str, String str2, String str3, String str4, oz40 oz40Var, Continuation continuation) {
        super(2, continuation);
        this.$onRetry = zlsVar;
        this.$context = context;
        this.$spec = btzVar;
        this.$imageAssetsFolder = str;
        this.$fontAssetsFolder = str2;
        this.$fontFileExtension = str3;
        this.$cacheKey = str4;
        this.$result$delegate = oz40Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RememberLottieCompositionKt$rememberLottieComposition$3(this.$onRetry, this.$context, this.$spec, this.$imageAssetsFolder, this.$fontAssetsFolder, this.$fontFileExtension, this.$cacheKey, this.$result$delegate, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RememberLottieCompositionKt$rememberLottieComposition$3) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r7 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006b, code lost:
    
        if (((java.lang.Boolean) r7).booleanValue() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00d0, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
    
        if (r7 != r1) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b6 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0014, B:9:0x00d1, B:10:0x00db, B:14:0x00ea, B:26:0x0070, B:28:0x007a, B:31:0x0081, B:34:0x0090, B:36:0x0094, B:39:0x009b, B:42:0x00ab, B:45:0x00c1, B:47:0x00b6, B:50:0x00bd, B:51:0x00a3, B:53:0x0088, B:73:0x00f6, B:77:0x00fe, B:12:0x00dc, B:72:0x00ec), top: B:6:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3 A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:7:0x0014, B:9:0x00d1, B:10:0x00db, B:14:0x00ea, B:26:0x0070, B:28:0x007a, B:31:0x0081, B:34:0x0090, B:36:0x0094, B:39:0x009b, B:42:0x00ab, B:45:0x00c1, B:47:0x00b6, B:50:0x00bd, B:51:0x00a3, B:53:0x0088, B:73:0x00f6, B:77:0x00fe, B:12:0x00dc, B:72:0x00ec), top: B:6:0x0014, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ce -> B:9:0x00d1). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Throwable th;
        LottieCompositionResultImpl lottieCompositionResultImpl;
        String str;
        String str2;
        String str3;
        Object d;
        Object obj2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        if (i2 == 0) {
            kotlin.b.b(obj);
            i = 0;
            th = null;
            if (!((Boolean) ((LottieCompositionResultImpl) this.$result$delegate.getValue()).x.getValue()).booleanValue()) {
            }
            if (!((Boolean) ((LottieCompositionResultImpl) this.$result$delegate.getValue()).w.getValue()).booleanValue()) {
                lottieCompositionResultImpl = (LottieCompositionResultImpl) this.$result$delegate.getValue();
                synchronized (lottieCompositionResultImpl) {
                }
            }
            return zy11.a;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            Throwable th2 = (Throwable) this.L$0;
            try {
                kotlin.b.b(obj);
                d = obj;
            } catch (Throwable th3) {
                int i4 = i3;
                th = th3;
                i = i4 + 1;
            }
            nsz nszVar = (nsz) d;
            LottieCompositionResultImpl lottieCompositionResultImpl2 = (LottieCompositionResultImpl) this.$result$delegate.getValue();
            synchronized (lottieCompositionResultImpl2) {
            }
            if (!((Boolean) lottieCompositionResultImpl2.w.getValue()).booleanValue()) {
                lottieCompositionResultImpl2.b.setValue(nszVar);
                lottieCompositionResultImpl2.a.T(nszVar);
            }
            int i5 = i3;
            th = th2;
            i = i5;
            if (!((Boolean) ((LottieCompositionResultImpl) this.$result$delegate.getValue()).x.getValue()).booleanValue()) {
                if (i != 0) {
                    zls zlsVar = this.$onRetry;
                    Integer num = new Integer(i);
                    this.L$0 = th;
                    this.I$0 = i;
                    this.label = 1;
                    obj2 = zlsVar.invoke(num, th, this);
                }
                Throwable th4 = th;
                i3 = i;
                th2 = th4;
                Context context = this.$context;
                btz btzVar = this.$spec;
                String str4 = this.$imageAssetsFolder;
                if (str4 != null && !evu0.J(str4)) {
                    if (!evu0.B(str4, '/')) {
                        str4 = str4.concat("/");
                    }
                    str = this.$fontAssetsFolder;
                    if (str != null && !evu0.J(str)) {
                        if (!evu0.B(str, '/')) {
                            str = str.concat("/");
                        }
                        str2 = str;
                        str3 = this.$fontFileExtension;
                        if (!evu0.J(str3) && !cvu0.x(str3, Extension.DOT_CHAR, false)) {
                            str3 = Extension.DOT_CHAR.concat(str3);
                        }
                        String str5 = this.$cacheKey;
                        this.L$0 = th2;
                        this.I$0 = i3;
                        this.label = 2;
                        d = a.d(context, btzVar, str4, str2, str3, str5, this);
                    }
                    str2 = null;
                    str3 = this.$fontFileExtension;
                    if (!evu0.J(str3)) {
                        str3 = Extension.DOT_CHAR.concat(str3);
                    }
                    String str52 = this.$cacheKey;
                    this.L$0 = th2;
                    this.I$0 = i3;
                    this.label = 2;
                    d = a.d(context, btzVar, str4, str2, str3, str52, this);
                }
                str4 = null;
                str = this.$fontAssetsFolder;
                if (str != null) {
                    if (!evu0.B(str, '/')) {
                    }
                    str2 = str;
                    str3 = this.$fontFileExtension;
                    if (!evu0.J(str3)) {
                    }
                    String str522 = this.$cacheKey;
                    this.L$0 = th2;
                    this.I$0 = i3;
                    this.label = 2;
                    d = a.d(context, btzVar, str4, str2, str3, str522, this);
                }
                str2 = null;
                str3 = this.$fontFileExtension;
                if (!evu0.J(str3)) {
                }
                String str5222 = this.$cacheKey;
                this.L$0 = th2;
                this.I$0 = i3;
                this.label = 2;
                d = a.d(context, btzVar, str4, str2, str3, str5222, this);
            }
            if (!((Boolean) ((LottieCompositionResultImpl) this.$result$delegate.getValue()).w.getValue()).booleanValue() && th != null) {
                lottieCompositionResultImpl = (LottieCompositionResultImpl) this.$result$delegate.getValue();
                synchronized (lottieCompositionResultImpl) {
                    if (!((Boolean) lottieCompositionResultImpl.w.getValue()).booleanValue()) {
                        lottieCompositionResultImpl.c.setValue(th);
                        lottieCompositionResultImpl.a.j0(th);
                    }
                }
            }
            return zy11.a;
        }
        i = this.I$0;
        th = (Throwable) this.L$0;
        kotlin.b.b(obj);
        obj2 = obj;
    }
}
