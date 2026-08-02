package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetByIdObjectResponseDto;
import com.vk.api.generated.video.dto.VideoGetWatchTogetherVideosResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class mft0 implements f03, b03, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m {
    public /* synthetic */ mft0() {
    }

    public static void a(StringBuilder sb, xgx0 xgx0Var) {
        sb.append(Thread.currentThread().getName());
        String sb2 = sb.toString();
        xgx0Var.getClass();
        xgx0.a(sb2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return ((GroupsGetByIdObjectResponseDto) obj).d();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetWatchTogetherVideosResponseDto.class).getType());
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }

    public /* synthetic */ mft0(izs izsVar) {
    }
}
