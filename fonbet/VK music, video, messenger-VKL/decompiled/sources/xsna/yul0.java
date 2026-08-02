package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.stories.dto.StoriesGetArchiveExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetThumbUploadUrlResponseDto;
import com.vk.api.generated.video.dto.VideoSaveUploadedThumbResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetStickerPacksRecommendationBlocksResponseDto;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class yul0 implements b03, Optional.Action, io.reactivex.rxjava3.core.a0, io.reactivex.rxjava3.functions.m, com.mbridge.msdk.tracker.f {
    public final /* synthetic */ int b;

    public /* synthetic */ yul0(int i) {
        this.b = i;
    }

    @Override // com.mbridge.msdk.tracker.f
    public boolean a(com.mbridge.msdk.tracker.e eVar) {
        boolean a;
        a = com.mbridge.msdk.config.component.common.metrics.a.a(eVar);
        return a;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationListener) obj).onProgress(true);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (StoriesGetArchiveExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetArchiveExtendedResponseDto.class).getType())).a();
            case 1:
                return (BaseBoolIntDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 2:
            default:
                return (VmojiGetStickerPacksRecommendationBlocksResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VmojiGetStickerPacksRecommendationBlocksResponseDto.class).getType())).a();
            case 3:
                return (VideoSaveUploadedThumbResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoSaveUploadedThumbResponseDto.class).getType())).a();
            case 4:
                return (VideoGetThumbUploadUrlResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetThumbUploadUrlResponseDto.class).getType())).a();
        }
    }

    @Override // io.reactivex.rxjava3.core.a0
    public void subscribe(io.reactivex.rxjava3.core.y yVar) {
        ClipsDraftPersistentStore clipsDraftPersistentStore = ClipsDraftPersistentStore.b;
        sgs0 sgs0Var = new sgs0(yVar, 1);
        clipsDraftPersistentStore.getClass();
        ClipsDraftPersistentStore.o(sgs0Var);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }
}
