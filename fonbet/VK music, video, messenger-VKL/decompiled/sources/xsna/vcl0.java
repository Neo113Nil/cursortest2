package xsna;

import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stickers.dto.StickersGetUGCPacksResponseDto;
import com.vk.api.generated.stories.dto.StoriesGetUnseenStatusResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.api.generated.utils.dto.UtilsDomainResolvedDto;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.api.generated.video.dto.VideoGetAssistantVideosFromAlbumResponseDto;
import com.vk.api.generated.wall.dto.WallGetCommentOrderResponseDto;
import com.vk.dto.common.id.UserId;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import ru.mail.libverify.controls.VerificationController;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class vcl0 implements b03, f03, Optional.Action, io.reactivex.rxjava3.core.s, io.reactivex.rxjava3.functions.m, yads.sq0 {
    public final /* synthetic */ int b;

    public /* synthetic */ vcl0(int i) {
        this.b = i;
    }

    public static vpv a(androidx.compose.runtime.a aVar, int i, androidx.compose.runtime.a aVar2) {
        aVar.K(i);
        return wlb0.h(aVar2).getIcon();
    }

    public static c9e0 b(long j, pqo pqoVar) {
        return pqoVar.b(new l5g(j));
    }

    public static /* synthetic */ boolean c(AtomicReference atomicReference, Object obj, UserId userId) {
        while (!atomicReference.compareAndSet(obj, userId)) {
            if (atomicReference.get() != obj) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ boolean d(AtomicReference atomicReference, CountDownLatch countDownLatch) {
        while (!atomicReference.compareAndSet(null, countDownLatch)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        VerificationController.lambda$resetVerificationId$31((VerificationListener) obj);
    }

    @Override // yads.sq0
    public yads.nq0[] createExtractors() {
        return yads.i0.a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (StickersGetUGCPacksResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StickersGetUGCPacksResponseDto.class).getType())).a();
            case 1:
                return (StoriesGetUnseenStatusResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetUnseenStatusResponseDto.class).getType())).a();
            case 2:
            case 3:
            default:
                return (VideoGetAssistantVideosFromAlbumResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetAssistantVideosFromAlbumResponseDto.class).getType())).a();
            case 4:
                return (UtilsDomainResolvedDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, UtilsDomainResolvedDto.class).getType())).a();
            case 5:
                return (UxpollsGetResponseDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, UxpollsGetResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 3:
                return (RootResponseDto) com.vk.common.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, xtp0.getParameterized(List.class, UsersUserFullDto.class).getType()).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallGetCommentOrderResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(io.reactivex.rxjava3.core.r rVar) {
        int i = VideoLiveFragment.i0;
        pss0 pss0Var = new pss0(rVar);
        o25.a().b0(pss0Var);
        rVar.a(new dw8(pss0Var, 2));
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return obj instanceof gru0;
    }
}
