package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.video.dto.VideoGetLongPollServerResponseDto;
import com.vk.api.generated.video.dto.VideoGetUserInfoResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import xsna.eda;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x6t0 implements eda.a, f03, b03, io.reactivex.rxjava3.functions.m, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ x6t0(int i) {
        this.b = i;
    }

    @Override // xsna.eda.a
    public io.reactivex.rxjava3.core.q b(wba wbaVar, List list, String str) {
        return rsg0.y0(new bda(wbaVar, list, str, null, 8), null, null, 3);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (VideoGetUserInfoResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetUserInfoResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.zm1.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetLongPollServerResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return (obj instanceof fjw0) || (obj instanceof h3x0);
    }
}
