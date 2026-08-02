package xsna;

import androidx.compose.ui.input.pointer.PointerEventPass;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import xsna.ckp0;

/* compiled from: Transformable.kt */
@b6l(c = "androidx.compose.foundation.gestures.TransformableKt$detectNonTouchGestures$2", f = "Transformable.kt", l = {288, Sdk.SDKError.Reason.JSON_PARAMS_ENCODE_ERROR_VALUE, 331, 349}, m = "invokeSuspend", v = 1)
/* loaded from: classes11.dex */
public final class ukp0 extends RestrictedSuspendLambda implements wzs<eu5, spj<? super s3q0>, Object> {
    final /* synthetic */ qta<ckp0> $channel;
    final /* synthetic */ kotlin.coroutines.d $currentContext;
    final /* synthetic */ afh0 $scrollConfig;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ukp0(kotlin.coroutines.d dVar, afh0 afh0Var, qta<ckp0> qtaVar, spj<? super ukp0> spjVar) {
        super(2, spjVar);
        this.$currentContext = dVar;
        this.$scrollConfig = afh0Var;
        this.$channel = qtaVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final spj<s3q0> create(Object obj, spj<?> spjVar) {
        ukp0 ukp0Var = new ukp0(this.$currentContext, this.$scrollConfig, this.$channel, spjVar);
        ukp0Var.L$0 = obj;
        return ukp0Var;
    }

    @Override // xsna.wzs
    public final Object invoke(eu5 eu5Var, spj<? super s3q0> spjVar) {
        return ((ukp0) create(eu5Var, spjVar)).invokeSuspend(s3q0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x01ce, code lost:
    
        if (r5 != r0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0197 A[Catch: all -> 0x0023, LOOP:0: B:15:0x0195->B:16:0x0197, LOOP_END, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b0 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x007e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0086 A[Catch: all -> 0x0023, TRY_ENTER, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8 A[Catch: all -> 0x0023, LOOP:1: B:39:0x00b6->B:40:0x00b8, LOOP_END, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0104 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d6 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012c A[Catch: all -> 0x0023, LOOP:2: B:55:0x012a->B:56:0x012c, LOOP_END, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016f A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0145 A[Catch: all -> 0x0023, TryCatch #0 {all -> 0x0023, blocks: (B:9:0x001a, B:11:0x01d1, B:13:0x01da, B:14:0x0184, B:16:0x0197, B:20:0x01b7, B:24:0x01b0, B:28:0x005e, B:31:0x006c, B:37:0x0086, B:38:0x008d, B:40:0x00b8, B:44:0x00dd, B:47:0x00f9, B:49:0x0104, B:51:0x00d6, B:53:0x0110, B:54:0x0119, B:56:0x012c, B:60:0x014c, B:63:0x0166, B:65:0x016f, B:67:0x0145, B:70:0x0179, B:71:0x01e9, B:72:0x01f0, B:79:0x0032, B:82:0x003e, B:85:0x0049), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01f7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x01ce -> B:11:0x01d1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0080 -> B:27:0x005e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0104 -> B:37:0x008d). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x010a -> B:24:0x01df). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x016f -> B:52:0x0119). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x0174 -> B:24:0x01df). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        eu5 eu5Var;
        char c;
        Object obj2;
        plb0 plb0Var;
        ov70 b;
        Object obj3;
        ov70 a;
        Object obj4;
        ov70 a2;
        float f;
        int size;
        int i;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i2 = this.label;
        ckp0.c cVar = ckp0.c.a;
        int i3 = 1;
        try {
            if (i2 == 0) {
                kotlin.a.a(obj);
                eu5Var = (eu5) this.L$0;
                if (!iyx.h(this.$currentContext)) {
                }
                this.L$0 = eu5Var;
                this.label = i3;
                obj4 = eu5Var.I1(PointerEventPass.Main, this);
                if (obj4 == coroutineSingletons) {
                }
                plb0Var = (plb0) obj4;
                a2 = wkp0.a(eu5Var, plb0Var, this.$scrollConfig);
                ov70 b2 = wkp0.b(plb0Var);
                Float c2 = wkp0.c(plb0Var);
                if (a2 == null) {
                }
                ckp0.b bVar = ckp0.b.a;
                if (a2 != null) {
                }
            } else if (i2 == 1) {
                eu5Var = (eu5) this.L$0;
                kotlin.a.a(obj);
                obj4 = obj;
                plb0Var = (plb0) obj4;
                a2 = wkp0.a(eu5Var, plb0Var, this.$scrollConfig);
                ov70 b22 = wkp0.b(plb0Var);
                Float c22 = wkp0.c(plb0Var);
                if (a2 == null) {
                }
                ckp0.b bVar2 = ckp0.b.a;
                if (a2 != null) {
                }
            } else if (i2 == 2) {
                eu5Var = (eu5) this.L$0;
                kotlin.a.a(obj);
                obj3 = obj;
                plb0Var = (plb0) obj3;
                a = wkp0.a(eu5Var, plb0Var, this.$scrollConfig);
                if (a != null) {
                }
            } else if (i2 == 3) {
                eu5Var = (eu5) this.L$0;
                kotlin.a.a(obj);
                obj2 = obj;
                c = 3;
                plb0Var = (plb0) obj2;
                b = wkp0.b(plb0Var);
                if (b != null) {
                }
            } else {
                if (i2 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eu5Var = (eu5) this.L$0;
                kotlin.a.a(obj);
                Object I1 = obj;
                char c3 = 4;
                c = 3;
                plb0Var = (plb0) I1;
                Float c4 = wkp0.c(plb0Var);
                if (c4 != null) {
                    f = c4.floatValue();
                    qta<ckp0> qtaVar = this.$channel;
                    List<xlb0> list = plb0Var.a;
                    size = list.size();
                    int i4 = 0;
                    long j = 0;
                    for (i = 0; i < size; i++) {
                        j = ov70.f(j, list.get(i).c);
                        i4++;
                    }
                    qtaVar.f(new ckp0.a(i4 != 0 ? 9205357640488583168L : ov70.b(i4, j), 0L, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                    this.L$0 = eu5Var;
                    c3 = 4;
                    this.label = 4;
                    I1 = eu5Var.I1(PointerEventPass.Main, this);
                }
                this.$channel.f(cVar);
                i3 = 1;
                if (!iyx.h(this.$currentContext)) {
                    return s3q0.a;
                }
                this.L$0 = eu5Var;
                this.label = i3;
                obj4 = eu5Var.I1(PointerEventPass.Main, this);
                if (obj4 == coroutineSingletons) {
                    return coroutineSingletons;
                }
                plb0Var = (plb0) obj4;
                a2 = wkp0.a(eu5Var, plb0Var, this.$scrollConfig);
                ov70 b222 = wkp0.b(plb0Var);
                Float c222 = wkp0.c(plb0Var);
                if (a2 == null || b222 != null || c222 != null) {
                    ckp0.b bVar22 = ckp0.b.a;
                    if (a2 != null) {
                        long j2 = a2.a;
                        this.$channel.f(bVar22);
                        float pow = (float) Math.pow(2.0f, Float.intBitsToFloat((int) (4294967295L & j2)) / 545.0f);
                        qta<ckp0> qtaVar2 = this.$channel;
                        List<xlb0> list2 = plb0Var.a;
                        int size2 = list2.size();
                        int i5 = 0;
                        long j3 = 0;
                        for (int i6 = 0; i6 < size2; i6++) {
                            j3 = ov70.f(j3, list2.get(i6).c);
                            i5++;
                        }
                        qtaVar2.f(new ckp0.a(i5 != 0 ? 9205357640488583168L : ov70.b(i5, j3), 0L, pow, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        this.L$0 = eu5Var;
                        this.label = 2;
                        obj3 = eu5Var.I1(PointerEventPass.Main, this);
                        if (obj3 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plb0Var = (plb0) obj3;
                        a = wkp0.a(eu5Var, plb0Var, this.$scrollConfig);
                        if (a != null) {
                            j2 = a.a;
                            float pow2 = (float) Math.pow(2.0f, Float.intBitsToFloat((int) (4294967295L & j2)) / 545.0f);
                            qta<ckp0> qtaVar22 = this.$channel;
                            List<xlb0> list22 = plb0Var.a;
                            int size22 = list22.size();
                            int i52 = 0;
                            long j32 = 0;
                            while (i6 < size22) {
                            }
                            qtaVar22.f(new ckp0.a(i52 != 0 ? 9205357640488583168L : ov70.b(i52, j32), 0L, pow2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            this.L$0 = eu5Var;
                            this.label = 2;
                            obj3 = eu5Var.I1(PointerEventPass.Main, this);
                            if (obj3 == coroutineSingletons) {
                            }
                            plb0Var = (plb0) obj3;
                            a = wkp0.a(eu5Var, plb0Var, this.$scrollConfig);
                            if (a != null) {
                                c3 = 4;
                                c = 3;
                                this.$channel.f(cVar);
                                i3 = 1;
                                if (!iyx.h(this.$currentContext)) {
                                }
                            }
                        }
                    } else if (b222 != null) {
                        long j4 = b222.a;
                        this.$channel.f(bVar22);
                        long j5 = j4;
                        qta<ckp0> qtaVar3 = this.$channel;
                        List<xlb0> list3 = plb0Var.a;
                        int size3 = list3.size();
                        int i7 = 0;
                        long j6 = 0;
                        for (int i8 = 0; i8 < size3; i8++) {
                            j6 = ov70.f(j6, list3.get(i8).c);
                            i7++;
                        }
                        qtaVar3.f(new ckp0.a(i7 != 0 ? 9205357640488583168L : ov70.b(i7, j6), j5, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        this.L$0 = eu5Var;
                        c = 3;
                        this.label = 3;
                        obj2 = eu5Var.I1(PointerEventPass.Main, this);
                        if (obj2 == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        plb0Var = (plb0) obj2;
                        b = wkp0.b(plb0Var);
                        if (b != null) {
                            j5 = b.a;
                            qta<ckp0> qtaVar32 = this.$channel;
                            List<xlb0> list32 = plb0Var.a;
                            int size32 = list32.size();
                            int i72 = 0;
                            long j62 = 0;
                            while (i8 < size32) {
                            }
                            qtaVar32.f(new ckp0.a(i72 != 0 ? 9205357640488583168L : ov70.b(i72, j62), j5, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                            this.L$0 = eu5Var;
                            c = 3;
                            this.label = 3;
                            obj2 = eu5Var.I1(PointerEventPass.Main, this);
                            if (obj2 == coroutineSingletons) {
                            }
                            plb0Var = (plb0) obj2;
                            b = wkp0.b(plb0Var);
                            if (b != null) {
                                c3 = 4;
                                this.$channel.f(cVar);
                                i3 = 1;
                                if (!iyx.h(this.$currentContext)) {
                                }
                            }
                        }
                    } else {
                        c = 3;
                        if (c222 == null) {
                            throw new IllegalStateException("One of zoomOffset, panOffset and scaleDelta must be non-null");
                        }
                        float floatValue = c222.floatValue();
                        this.$channel.f(bVar22);
                        f = floatValue;
                        qta<ckp0> qtaVar4 = this.$channel;
                        List<xlb0> list4 = plb0Var.a;
                        size = list4.size();
                        int i42 = 0;
                        long j7 = 0;
                        while (i < size) {
                        }
                        qtaVar4.f(new ckp0.a(i42 != 0 ? 9205357640488583168L : ov70.b(i42, j7), 0L, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                        this.L$0 = eu5Var;
                        c3 = 4;
                        this.label = 4;
                        I1 = eu5Var.I1(PointerEventPass.Main, this);
                    }
                }
                this.L$0 = eu5Var;
                this.label = i3;
                obj4 = eu5Var.I1(PointerEventPass.Main, this);
                if (obj4 == coroutineSingletons) {
                }
                plb0Var = (plb0) obj4;
                a2 = wkp0.a(eu5Var, plb0Var, this.$scrollConfig);
                ov70 b2222 = wkp0.b(plb0Var);
                Float c2222 = wkp0.c(plb0Var);
                if (a2 == null) {
                }
                ckp0.b bVar222 = ckp0.b.a;
                if (a2 != null) {
                }
            }
        } catch (Throwable th) {
            this.$channel.f(cVar);
            throw th;
        }
    }
}
