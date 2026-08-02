package xsna;

import com.vk.api.generated.serverEffects.dto.ServerEffectsGeneratedVideoInfoDto;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import xsna.mik;

/* compiled from: SmartCropRepositoryImpl.kt */
/* loaded from: classes7.dex */
public final class a5k0 implements z4k0 {
    public final SmartCropArguments a;

    /* compiled from: SmartCropRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ServerEffectsGeneratedVideoInfoDto.StatusDto.values().length];
            try {
                iArr[ServerEffectsGeneratedVideoInfoDto.StatusDto.WAITING_FOR_ORIGINAL_UPLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ServerEffectsGeneratedVideoInfoDto.StatusDto.TRANSFORMATION_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ServerEffectsGeneratedVideoInfoDto.StatusDto.WAITING_FOR_ORIGINAL_VALIDATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ServerEffectsGeneratedVideoInfoDto.StatusDto.READY_FOR_PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ServerEffectsGeneratedVideoInfoDto.StatusDto.ORIGINAL_VALIDATION_FAILED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ServerEffectsGeneratedVideoInfoDto.StatusDto.ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a5k0(SmartCropArguments smartCropArguments) {
        this.a = smartCropArguments;
    }

    public static final mik c(a5k0 a5k0Var, ServerEffectsGeneratedVideoInfoDto serverEffectsGeneratedVideoInfoDto) {
        a5k0Var.getClass();
        switch (a.$EnumSwitchMapping$0[serverEffectsGeneratedVideoInfoDto.f().ordinal()]) {
            case 1:
            case 2:
            case 3:
                return new mik.c(serverEffectsGeneratedVideoInfoDto.e(), serverEffectsGeneratedVideoInfoDto.g() != null ? Long.valueOf(r4.intValue()) : null);
            case 4:
                String d = serverEffectsGeneratedVideoInfoDto.d();
                return d != null ? new mik.b(d) : mik.a.a;
            case 5:
            case 6:
                return mik.a.a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.z4k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(long j, ContinuationImpl continuationImpl) {
        b5k0 b5k0Var;
        int i;
        if (continuationImpl instanceof b5k0) {
            b5k0Var = (b5k0) continuationImpl;
            int i2 = b5k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                b5k0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = b5k0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = b5k0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    c5k0 c5k0Var = new c5k0(this, j, null);
                    b5k0Var.J$0 = j;
                    b5k0Var.label = 1;
                    obj = myc0.k(b, c5k0Var, b5k0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        b5k0Var = new b5k0(this, continuationImpl);
        Object obj2 = b5k0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = b5k0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // xsna.z4k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(q500 q500Var, boolean z, ContinuationImpl continuationImpl) {
        d5k0 d5k0Var;
        int i;
        if (continuationImpl instanceof d5k0) {
            d5k0Var = (d5k0) continuationImpl;
            int i2 = d5k0Var.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d5k0Var.label = i2 - Integer.MIN_VALUE;
                Object obj = d5k0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = d5k0Var.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    e5k0 e5k0Var = new e5k0(this, q500Var, z, null);
                    d5k0Var.L$0 = null;
                    d5k0Var.Z$0 = z;
                    d5k0Var.label = 1;
                    obj = myc0.k(b, e5k0Var, d5k0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        d5k0Var = new d5k0(this, continuationImpl);
        Object obj2 = d5k0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = d5k0Var.label;
        if (i != 0) {
        }
        return ((Result) obj2).d();
    }
}
