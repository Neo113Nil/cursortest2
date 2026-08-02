package xsna;

import android.app.UiModeManager;
import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.store.dto.StoreNewItemsDto;
import com.vk.api.generated.video.dto.VideoVideoAlbumFullDto;
import com.vk.api.generated.wall.dto.WallGetCommentsExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.Z7;
import java.io.InputStream;
import java.io.InputStreamReader;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wcl0 implements b03, f03, io.reactivex.rxjava3.core.s, FunctionWithThrowable, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ wcl0(int i) {
        this.b = i;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
    public Object apply(Object obj) {
        return Z7.a((UiModeManager) obj);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 1:
                return (StoreNewItemsDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoreNewItemsDto.class).getType())).a();
            default:
                return (VideoVideoAlbumFullDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoVideoAlbumFullDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.s83.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetCommentsExtendedResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        qbs0 qbs0Var = new qbs0(rVar);
        int i = ify.a;
        ify.a(qbs0Var);
        rVar.a(new wzl0(qbs0Var, 1));
    }
}
