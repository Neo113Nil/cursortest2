package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.vkStart.dto.VkStartGetStatsActivityTypeDto;
import com.vk.api.generated.vkStart.dto.VkStartGetStatsAggregationTypeDto;
import com.vk.api.generated.vkStart.dto.VkStartInputActivityDto;
import com.vk.api.generated.vkStart.dto.VkStartInputActivityProgressDto;
import com.vk.superapp.api.dto.vkworkout.WorkoutData;
import com.vk.superapp.api.generated.GsonHolder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.h2w0;

/* compiled from: GeneratedSuperappApi.kt */
/* loaded from: classes6.dex */
public final class hjt implements bgn0 {
    public final bpn0 a = new bpn0(new sk4(15));

    @Override // xsna.bgn0
    public final io.reactivex.rxjava3.internal.operators.observable.i2 a(List list, VkStartGetStatsAggregationTypeDto vkStartGetStatsAggregationTypeDto, VkStartGetStatsActivityTypeDto vkStartGetStatsActivityTypeDto) {
        ufx ufxVar = new ufx("vkStart.getStats", new hub0(9), new zy60(17));
        ufxVar.h("range", list);
        if (vkStartGetStatsAggregationTypeDto != null) {
            ufx.n(ufxVar, "aggregation_type", vkStartGetStatsAggregationTypeDto.i(), 0, 12);
        }
        if (vkStartGetStatsActivityTypeDto != null) {
            ufx.n(ufxVar, "activity_type", vkStartGetStatsActivityTypeDto.i(), 0, 12);
        }
        return rdx0.p(e370.e(ufxVar));
    }

    @Override // xsna.bgn0
    public final io.reactivex.rxjava3.internal.operators.single.y b(List list) {
        VkStartInputActivityDto.TypeDto typeDto;
        ((h2w0) this.a.getValue()).getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WorkoutData workoutData = (WorkoutData) it.next();
            String str = workoutData.a;
            Long l = workoutData.d;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long j = workoutData.c;
            int seconds = (int) timeUnit.toSeconds(j);
            String str2 = workoutData.b;
            if (str2 == null) {
                str2 = "";
            }
            String str3 = str2;
            String str4 = workoutData.g;
            String str5 = workoutData.f;
            String str6 = workoutData.h;
            int i = h2w0.a.$EnumSwitchMapping$0[workoutData.e.ordinal()];
            if (i == 1) {
                typeDto = VkStartInputActivityDto.TypeDto.RUNNING;
            } else if (i == 2) {
                typeDto = VkStartInputActivityDto.TypeDto.SWIMMING;
            } else if (i == 3) {
                typeDto = VkStartInputActivityDto.TypeDto.CYCLING;
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                typeDto = VkStartInputActivityDto.TypeDto.OTHER;
            }
            Iterator it2 = it;
            Integer valueOf = Integer.valueOf((int) timeUnit.toSeconds(l.longValue()));
            WorkoutData.a aVar = workoutData.j;
            int i2 = aVar.a;
            int i3 = aVar.d;
            int i4 = aVar.b;
            long j2 = aVar.c;
            String str7 = null;
            VkStartInputActivityDto.TypeDto typeDto2 = typeDto;
            arrayList.add(new VkStartInputActivityDto(str, str6, new VkStartInputActivityProgressDto(i2, i3, Integer.valueOf(i4), Long.valueOf(j2), aVar.e, 0, null, aVar.f), Integer.valueOf(seconds), valueOf, Long.valueOf(j), l, str3, str4, str7, typeDto2, workoutData.i, str5, null, null, null, 57856, null));
            it = it2;
        }
        int i5 = 0;
        try {
            Parcel obtain = Parcel.obtain();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                ((Parcelable) it3.next()).writeToParcel(obtain, i5);
                i5 = 0;
            }
            xgx0 xgx0Var = xgx0.a;
            String str8 = "VkWorkoutMapper workoutDataNativeSize -> " + obtain.dataSize();
            xgx0Var.getClass();
            xgx0.a(str8);
            obtain.recycle();
        } catch (Throwable th) {
            xgx0.a.getClass();
            xgx0.b("VkWorkoutMapper workoutDataNativeSize -> " + th);
        }
        ufx ufxVar = new ufx("vkStart.importActivities", new wd10(18), new nyh0(7));
        ufx.n(ufxVar, "activities_list", GsonHolder.a().toJson(arrayList), 0, 12);
        return rdx0.B(e370.e(ufxVar)).l(new ox0(new b4r(3), 18));
    }
}
