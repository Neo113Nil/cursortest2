package xsna;

import android.os.Bundle;
import com.vk.api.generated.audio.dto.AudioAdsDto;
import com.vk.api.generated.audioAds.dto.AudioAdsAcknowledgeViewPositionDto;
import com.vk.api.generated.audioAds.dto.AudioAdsUpdateUserStatisticResponseDto;
import com.vk.dto.common.account.AudioAdConfig;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: AudioAdRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final class kb4 {
    public final bpn0 a = new bpn0(new zq3(1));
    public final bpn0 b = new bpn0(new f84(1));

    /* compiled from: AudioAdRepositoryImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioAdConfig.Type.values().length];
            try {
                iArr[AudioAdConfig.Type.PREROLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioAdConfig.Type.MIDROLL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AudioAdConfig.Type.POSTROLL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final Object a(AudioAdConfig.Type type, String str, qb4 qb4Var) {
        AudioAdsAcknowledgeViewPositionDto audioAdsAcknowledgeViewPositionDto;
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            audioAdsAcknowledgeViewPositionDto = AudioAdsAcknowledgeViewPositionDto.PREROLL;
        } else if (i == 2) {
            audioAdsAcknowledgeViewPositionDto = AudioAdsAcknowledgeViewPositionDto.MIDROLL;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            audioAdsAcknowledgeViewPositionDto = AudioAdsAcknowledgeViewPositionDto.POSTROLL;
        }
        Object p = evj.p(yfb.A(((xb4) this.b.getValue()).a(audioAdsAcknowledgeViewPositionDto, str)), qb4Var);
        return p == CoroutineSingletons.COROUTINE_SUSPENDED ? p : s3q0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Bundle bundle, int i, int i2, String str, ContinuationImpl continuationImpl) {
        lb4 lb4Var;
        int i3;
        int i4;
        String string;
        AudioAdsDto.AccountAgeTypeDto accountAgeTypeDto;
        String i5;
        Integer m;
        String d;
        AudioAdConfig.Type a2;
        if (continuationImpl instanceof lb4) {
            lb4Var = (lb4) continuationImpl;
            int i6 = lb4Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                lb4Var.label = i6 - Integer.MIN_VALUE;
                Object obj = lb4Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = lb4Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    if (!((Boolean) this.a.getValue()).booleanValue()) {
                        return new j9q0(true, AudioAdConfig.Type.PREROLL);
                    }
                    if (bundle != null && (string = bundle.getString("accountAgeType")) != null) {
                        AudioAdsDto.AccountAgeTypeDto[] values = AudioAdsDto.AccountAgeTypeDto.values();
                        int length = values.length;
                        int i7 = 0;
                        while (true) {
                            if (i7 >= length) {
                                accountAgeTypeDto = null;
                                break;
                            }
                            accountAgeTypeDto = values[i7];
                            if (epx.f(accountAgeTypeDto.i(), string)) {
                                break;
                            }
                            i7++;
                        }
                        if (accountAgeTypeDto != null && (i5 = accountAgeTypeDto.i()) != null && (m = arm0.m(10, i5)) != null) {
                            i4 = m.intValue();
                            iz2 A = yfb.A(((xb4) this.b.getValue()).b(i4, i, i2, str));
                            lb4Var.L$0 = null;
                            lb4Var.L$1 = null;
                            lb4Var.I$0 = i;
                            lb4Var.I$1 = i2;
                            lb4Var.I$2 = i4;
                            lb4Var.label = 1;
                            obj = evj.p(A, lb4Var);
                            if (obj == coroutineSingletons) {
                                return coroutineSingletons;
                            }
                        }
                    }
                    i4 = 1;
                    iz2 A2 = yfb.A(((xb4) this.b.getValue()).b(i4, i, i2, str));
                    lb4Var.L$0 = null;
                    lb4Var.L$1 = null;
                    lb4Var.I$0 = i;
                    lb4Var.I$1 = i2;
                    lb4Var.I$2 = i4;
                    lb4Var.label = 1;
                    obj = evj.p(A2, lb4Var);
                    if (obj == coroutineSingletons) {
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                AudioAdsUpdateUserStatisticResponseDto audioAdsUpdateUserStatisticResponseDto = (AudioAdsUpdateUserStatisticResponseDto) obj;
                boolean e = audioAdsUpdateUserStatisticResponseDto.e();
                AudioAdConfig.Type.a aVar = AudioAdConfig.Type.Companion;
                d = audioAdsUpdateUserStatisticResponseDto.d();
                if (d == null) {
                    d = "";
                }
                aVar.getClass();
                a2 = AudioAdConfig.Type.a.a(d);
                if (a2 == null) {
                    a2 = AudioAdConfig.Type.PREROLL;
                }
                return new j9q0(e, a2);
            }
        }
        lb4Var = new lb4(this, continuationImpl);
        Object obj2 = lb4Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = lb4Var.label;
        if (i3 != 0) {
        }
        AudioAdsUpdateUserStatisticResponseDto audioAdsUpdateUserStatisticResponseDto2 = (AudioAdsUpdateUserStatisticResponseDto) obj2;
        boolean e2 = audioAdsUpdateUserStatisticResponseDto2.e();
        AudioAdConfig.Type.a aVar2 = AudioAdConfig.Type.Companion;
        d = audioAdsUpdateUserStatisticResponseDto2.d();
        if (d == null) {
        }
        aVar2.getClass();
        a2 = AudioAdConfig.Type.a.a(d);
        if (a2 == null) {
        }
        return new j9q0(e2, a2);
    }
}
