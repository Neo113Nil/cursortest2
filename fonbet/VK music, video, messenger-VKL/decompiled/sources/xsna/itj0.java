package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetPrivacyDictionaryResponseDto;
import com.vk.api.generated.voicerooms.dto.VoiceroomsRoomDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import kotlin.Result;
import xsna.ayv0;
import xsna.eda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class itj0 implements eda.a, b03, io.reactivex.rxjava3.functions.l, f03, yads.u21 {
    public final /* synthetic */ int b;

    public /* synthetic */ itj0(int i) {
        this.b = i;
    }

    public static String c(StringBuilder sb, zhf0 zhf0Var, char c) {
        sb.append(zhf0Var);
        sb.append(c);
        return sb.toString();
    }

    public static void d(String str, ArrayList arrayList) {
        arrayList.add(new ayv0.c(str));
    }

    @Override // yads.u21
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return yads.w21.b(i, i2, i3, i4, i5);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 3:
                return (Integer) obj;
            case 4:
                return new Result(new Result.Failure((Throwable) obj));
            default:
                return s3q0.a;
        }
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        return rsg0.y0(new bda(wbaVar, list, str, null, 24), null, null, 3);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            default:
                return (VoiceroomsRoomDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VoiceroomsRoomDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, Integer.class).getType());
            case 7:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetPrivacyDictionaryResponseDto.class).getType());
        }
    }
}
