package xsna;

import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetStaticsResponseDto;
import com.vk.api.generated.tabbar.dto.TabbarGetSettingsResponseDto;
import com.vk.api.generated.users.dto.UsersGetFollowersFieldsResponseDto;
import com.vk.api.generated.video.dto.VideoGetLongPollServerResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoDiscoverResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetCharacterByIdResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashMap;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class fbj0 implements io.reactivex.rxjava3.functions.l, f03, b03, io.reactivex.rxjava3.functions.c {
    public final /* synthetic */ int b;

    public /* synthetic */ fbj0(int i) {
        this.b = i;
    }

    public static void a(int i, HashMap hashMap, String str, int i2, String str2) {
        hashMap.put(str, Integer.valueOf(i));
        hashMap.put(str2, Integer.valueOf(i2));
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return obj;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 3:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
            case 5:
            case 7:
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 6:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 8:
                return (VideoGetLongPollServerResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetLongPollServerResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetStaticsResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, TabbarGetSettingsResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UsersGetFollowersFieldsResponseDto.class).getType());
            case 9:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetVideoDiscoverResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VmojiGetCharacterByIdResponseDto.class).getType());
        }
    }

    public /* synthetic */ fbj0(mz2 mz2Var) {
        this.b = 7;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        io.reactivex.rxjava3.core.q qVar = (io.reactivex.rxjava3.core.q) obj;
        qVar.getClass();
        return new io.reactivex.rxjava3.internal.operators.observable.y(qVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a);
    }
}
