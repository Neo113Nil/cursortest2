package com.yandex.go.scooters.qr.data.mapper;

import com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse;
import com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok;
import com.yandex.go.scooters.qr.data.model.ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable;
import com.yandex.go.scooters.qr.data.model.f;
import com.yandex.go.scooters.qr.data.model.g;
import defpackage.avj0;
import defpackage.ita1;
import defpackage.jl40;
import defpackage.krl0;
import defpackage.kyh0;
import defpackage.m7p0;
import defpackage.n7p0;
import defpackage.ny61;
import defpackage.q7p0;
import defpackage.t7s;
import defpackage.w511;
import defpackage.y0o0;
import defpackage.z531;
import defpackage.zuj0;
import defpackage.zzs;
import java.util.Arrays;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes13.dex */
public final class a {
    public final zuj0 a;
    public final e b;

    public a(zuj0 zuj0Var, e eVar) {
        this.a = zuj0Var;
        this.b = eVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ScootersVehicleAvailabilityResponse scootersVehicleAvailabilityResponse, ContinuationImpl continuationImpl) {
        ScootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1 scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1;
        Object obj;
        int i;
        String str;
        krl0 krl0Var;
        ScootersVehicleAvailabilityResponse scootersVehicleAvailabilityResponse2;
        String str2;
        ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.Content content;
        z531 z531Var;
        z531 z531Var2;
        z531 z531Var3;
        z531 z531Var4;
        z531 z531Var5;
        Object b;
        String str3;
        CharSequence charSequence;
        ScootersVehicleAvailabilityResponse scootersVehicleAvailabilityResponse3;
        if (continuationImpl instanceof ScootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1) {
            scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1 = (ScootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1) continuationImpl;
            int i2 = scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.label;
                zuj0 zuj0Var = this.a;
                if (i != 0) {
                    b.b(obj2);
                    g gVar = scootersVehicleAvailabilityResponse.a;
                    if (gVar instanceof ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok) {
                        ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok.Scooter scooter = ((ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok) gVar).a;
                        zzs zzsVar = scooter != null ? scooter.a : null;
                        int i3 = 0;
                        int i4 = (scooter == null || (z531Var5 = scooter.b) == null) ? 0 : z531Var5.a;
                        avj0 avj0Var = (avj0) zuj0Var;
                        String h = avj0Var.h(kyh0.scooters_distance_template);
                        ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok scootersVehicleAvailabilityResponse$AvailabilityResult$Ok = (ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok) gVar;
                        ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok.Scooter scooter2 = scootersVehicleAvailabilityResponse$AvailabilityResult$Ok.a;
                        if (scooter2 != null && (z531Var4 = scooter2.b) != null) {
                            i3 = (int) z531Var4.b;
                        }
                        String.format(h, Arrays.copyOf(new Object[]{new Integer(i3)}, 1));
                        ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok.Scooter scooter3 = scootersVehicleAvailabilityResponse$AvailabilityResult$Ok.a;
                        long j = 0;
                        t7s.d((scooter3 == null || (z531Var3 = scooter3.b) == null) ? 0L : z531Var3.c, avj0Var.h(kyh0.scooters_remain_time_minutes_template), avj0Var.h(kyh0.scooters_remain_time_hours_template));
                        ScootersVehicleAvailabilityResponse$AvailabilityResult$Ok.Scooter scooter4 = scootersVehicleAvailabilityResponse$AvailabilityResult$Ok.a;
                        if (scooter4 != null && (z531Var2 = scooter4.b) != null) {
                            j = z531Var2.c;
                        }
                        return new m7p0(zzsVar, new q7p0((scooter4 == null || (z531Var = scooter4.b) == null) ? 0.0f : z531Var.b, j, i4));
                    }
                    if (!(gVar instanceof ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable)) {
                        if (jl40.l(gVar, f.INSTANCE)) {
                            return null;
                        }
                        w511.b();
                        return null;
                    }
                    ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable scootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable = (ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable) gVar;
                    str = scootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.a;
                    ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.Content content2 = scootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.c;
                    if (content2 == null) {
                        krl0Var = null;
                        ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.NearestScooter nearestScooter = ((ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable) scootersVehicleAvailabilityResponse.a).b;
                        return new n7p0(str, krl0Var, nearestScooter != null ? new y0o0(nearestScooter.b, nearestScooter.c, nearestScooter.a, ita1.c(zuj0Var, nearestScooter.d, kyh0.scooters_remaining_distance_in_km, kyh0.scooters_remaining_distance_in_metres)) : null);
                    }
                    FormattedText formattedText = content2.a;
                    int i5 = kyh0.scooters_preview_error_title;
                    scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$0 = scootersVehicleAvailabilityResponse;
                    scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$1 = content2;
                    scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$2 = str;
                    scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.label = 1;
                    Object b2 = b(formattedText, i5, scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1);
                    if (b2 != obj) {
                        scootersVehicleAvailabilityResponse2 = scootersVehicleAvailabilityResponse;
                        str2 = str;
                        content = content2;
                        obj2 = b2;
                    }
                    return obj;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$3;
                    charSequence = (CharSequence) scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$2;
                    scootersVehicleAvailabilityResponse3 = (ScootersVehicleAvailabilityResponse) scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$0;
                    b.b(obj2);
                    krl0Var = new krl0(charSequence, (CharSequence) obj2);
                    str = str3;
                    scootersVehicleAvailabilityResponse = scootersVehicleAvailabilityResponse3;
                    ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.NearestScooter nearestScooter2 = ((ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable) scootersVehicleAvailabilityResponse.a).b;
                    return new n7p0(str, krl0Var, nearestScooter2 != null ? new y0o0(nearestScooter2.b, nearestScooter2.c, nearestScooter2.a, ita1.c(zuj0Var, nearestScooter2.d, kyh0.scooters_remaining_distance_in_km, kyh0.scooters_remaining_distance_in_metres)) : null);
                }
                str2 = (String) scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$2;
                content = (ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.Content) scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$1;
                scootersVehicleAvailabilityResponse2 = (ScootersVehicleAvailabilityResponse) scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$0;
                b.b(obj2);
                CharSequence charSequence2 = (CharSequence) obj2;
                FormattedText formattedText2 = content.b;
                int i6 = kyh0.scooters_preview_error_unknown;
                scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$0 = scootersVehicleAvailabilityResponse2;
                scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$1 = null;
                scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$2 = charSequence2;
                scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$3 = str2;
                scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.label = 2;
                b = b(formattedText2, i6, scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1);
                if (b != obj) {
                    obj2 = b;
                    str3 = str2;
                    charSequence = charSequence2;
                    scootersVehicleAvailabilityResponse3 = scootersVehicleAvailabilityResponse2;
                    krl0Var = new krl0(charSequence, (CharSequence) obj2);
                    str = str3;
                    scootersVehicleAvailabilityResponse = scootersVehicleAvailabilityResponse3;
                    ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable.NearestScooter nearestScooter22 = ((ScootersVehicleAvailabilityResponse$AvailabilityResult$Unavailable) scootersVehicleAvailabilityResponse.a).b;
                    return new n7p0(str, krl0Var, nearestScooter22 != null ? new y0o0(nearestScooter22.b, nearestScooter22.c, nearestScooter22.a, ita1.c(zuj0Var, nearestScooter22.d, kyh0.scooters_remaining_distance_in_km, kyh0.scooters_remaining_distance_in_metres)) : null);
                }
                return obj;
            }
        }
        scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1 = new ScootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1(this, continuationImpl);
        Object obj22 = scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.label;
        zuj0 zuj0Var2 = this.a;
        if (i != 0) {
        }
        CharSequence charSequence22 = (CharSequence) obj22;
        FormattedText formattedText22 = content.b;
        int i62 = kyh0.scooters_preview_error_unknown;
        scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$0 = scootersVehicleAvailabilityResponse2;
        scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$1 = null;
        scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$2 = charSequence22;
        scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.L$3 = str2;
        scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1.label = 2;
        b = b(formattedText22, i62, scootersVehicleAvailabilityStateMapper$mapToScootersVehicleAvailabilityState$1);
        if (b != obj) {
        }
        return obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0051 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(FormattedText formattedText, int i, ContinuationImpl continuationImpl) {
        ScootersVehicleAvailabilityStateMapper$prepareText$1 scootersVehicleAvailabilityStateMapper$prepareText$1;
        int i2;
        if (continuationImpl instanceof ScootersVehicleAvailabilityStateMapper$prepareText$1) {
            scootersVehicleAvailabilityStateMapper$prepareText$1 = (ScootersVehicleAvailabilityStateMapper$prepareText$1) continuationImpl;
            int i3 = scootersVehicleAvailabilityStateMapper$prepareText$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                scootersVehicleAvailabilityStateMapper$prepareText$1.label = i3 - Integer.MIN_VALUE;
                Object obj = scootersVehicleAvailabilityStateMapper$prepareText$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = scootersVehicleAvailabilityStateMapper$prepareText$1.label;
                e eVar = this.b;
                if (i2 != 0) {
                    b.b(obj);
                    scootersVehicleAvailabilityStateMapper$prepareText$1.L$0 = null;
                    scootersVehicleAvailabilityStateMapper$prepareText$1.I$0 = i;
                    scootersVehicleAvailabilityStateMapper$prepareText$1.label = 1;
                    obj = eVar.x(formattedText, scootersVehicleAvailabilityStateMapper$prepareText$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i = scootersVehicleAvailabilityStateMapper$prepareText$1.I$0;
                    b.b(obj);
                }
                CharSequence charSequence = (CharSequence) obj;
                return charSequence != null ? eVar.a.getString(i) : charSequence;
            }
        }
        scootersVehicleAvailabilityStateMapper$prepareText$1 = new ScootersVehicleAvailabilityStateMapper$prepareText$1(this, continuationImpl);
        Object obj2 = scootersVehicleAvailabilityStateMapper$prepareText$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = scootersVehicleAvailabilityStateMapper$prepareText$1.label;
        e eVar2 = this.b;
        if (i2 != 0) {
        }
        CharSequence charSequence2 = (CharSequence) obj2;
        if (charSequence2 != null) {
        }
    }
}
