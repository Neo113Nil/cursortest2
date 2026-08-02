package xsna;

import android.app.Activity;
import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.photos.dto.PhotosVerticalizeCheckStatusResponseDto;
import com.vk.api.generated.questions.dto.QuestionsGetByIdExtendedResponseDto;
import com.vk.api.generated.recomSettings.dto.RecomSettingsGetAvailableRecomThemesResponseDto;
import com.vk.api.generated.wall.dto.WallGetSuggestedHashtagsResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.impl.C5127qn;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vga0 implements b03, io.reactivex.rxjava3.functions.l, f03, io.reactivex.rxjava3.functions.m, yads.sq0, yads.wq, FunctionWithThrowable {
    public final /* synthetic */ int b;

    public /* synthetic */ vga0(int i) {
        this.b = i;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return ((WallGetSuggestedHashtagsResponseDto) obj).d();
            case 5:
                return (List) obj;
            default:
                return C5127qn.b((Activity) obj);
        }
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.ak1.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (PhotosVerticalizeCheckStatusResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, PhotosVerticalizeCheckStatusResponseDto.class).getType())).a();
            default:
                return (RecomSettingsGetAvailableRecomThemesResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, RecomSettingsGetAvailableRecomThemesResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.i73.b(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, QuestionsGetByIdExtendedResponseDto.class).getType());
            case 3:
            case 5:
            case 7:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 4:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 6:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = VideoDialog.P0;
        return false;
    }
}
