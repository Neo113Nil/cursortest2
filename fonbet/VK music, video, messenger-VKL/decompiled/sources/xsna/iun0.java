package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.translations.dto.TranslationsTranslateResponseDto;
import com.vk.api.generated.users.dto.UsersGetUserInfoResponseDto;
import com.vk.api.generated.videoChannels.dto.VideoChannelsGetViewSettingsResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetAvatarStoryDataResponseDto;
import com.vk.api.generated.wall.dto.WallGetByIdExtendedResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class iun0 implements f03, io.reactivex.rxjava3.functions.l, b03, Optional.Action, yads.u21 {
    public final /* synthetic */ int b;

    public /* synthetic */ iun0(int i) {
        this.b = i;
    }

    @Override // yads.u21
    public boolean a(int i, int i2, int i3, int i4, int i5) {
        return yads.jw1.a(i, i2, i3, i4, i5);
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationListener) obj).onIvrTimeoutUpdated();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            default:
                return s3q0.a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (TranslationsTranslateResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, TranslationsTranslateResponseDto.class).getType())).a();
            case 6:
                return (VideoChannelsGetViewSettingsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, VideoChannelsGetViewSettingsResponseDto.class).getType())).a();
            default:
                return (WallGetByIdExtendedResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, WallGetByIdExtendedResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 4:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UsersGetUserInfoResponseDto.class).getType());
            case 7:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, Integer.class).getType()).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VmojiGetAvatarStoryDataResponseDto.class).getType());
        }
    }
}
