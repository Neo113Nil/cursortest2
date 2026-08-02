package xsna;

import com.vk.api.generated.statEvents.dto.StatEventsBaseResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class lby implements b03 {
    public static StringBuilder a(String str, double d, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(d);
        sb.append(str2);
        return sb;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (StatEventsBaseResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StatEventsBaseResponseDto.class).getType())).a();
    }
}
