package xsna;

import android.content.res.TypedArray;
import android.media.MediaMetadataRetriever;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetTopVideosResponseDto;
import com.vk.api.generated.stickers.dto.StickersSetPopupSettingsResponseDto;
import com.vk.api.generated.users.dto.UsersSearchResponseDto;
import com.vk.api.generated.uxpolls.dto.UxpollsGetResponseDto;
import com.vk.api.generated.video.dto.VideoGetSimilarResponseDto;
import com.vk.api.generated.wall.dto.WallGetCommentResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.ml.a;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;
import ru.mail.libverify.controls.VerificationListener;
import ru.mail.libverify.utils.Optional;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class jgj0 implements f03, io.reactivex.rxjava3.functions.l, Optional.Action, b03 {
    public final /* synthetic */ int b;

    public /* synthetic */ jgj0(int i) {
        this.b = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void a(a.InterfaceC1280a interfaceC1280a) {
        boolean isTerminated;
        if (interfaceC1280a instanceof AutoCloseable) {
            interfaceC1280a.close();
            return;
        }
        if (!(interfaceC1280a instanceof ExecutorService)) {
            if (interfaceC1280a instanceof TypedArray) {
                ((TypedArray) interfaceC1280a).recycle();
                return;
            } else {
                if (!(interfaceC1280a instanceof MediaMetadataRetriever)) {
                    throw new IllegalArgumentException();
                }
                ((MediaMetadataRetriever) interfaceC1280a).release();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) interfaceC1280a;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    @Override // ru.mail.libverify.utils.Optional.Action
    public void accept(Object obj) {
        ((VerificationListener) obj).onProgress(true);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (Integer) obj;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 8:
                return (VideoGetSimilarResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetSimilarResponseDto.class).getType())).a();
            default:
                return (WallGetCommentResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallGetCommentResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) com.vk.clips.sdk.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, ShortVideoGetTopVideosResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StickersSetPopupSettingsResponseDto.class).getType());
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
            case 4:
            default:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UxpollsGetResponseDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UsersSearchResponseDto.class).getType());
        }
    }
}
