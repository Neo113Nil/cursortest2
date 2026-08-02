package xsna;

import com.vk.api.generated.likes.dto.LikesGetListExtendedResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: ClipsSortPaginationDelegate.kt */
/* loaded from: classes4.dex */
public final /* synthetic */ class r4f extends FunctionReferenceImpl implements wzs<VideoGetCommentsExtendedResponseDto, LikesGetListExtendedResponseDto, Pair<? extends VideoGetCommentsExtendedResponseDto, ? extends LikesGetListExtendedResponseDto>> {
    public static final r4f b = new r4f(2, Pair.class, "<init>", "<init>(Ljava/lang/Object;Ljava/lang/Object;)V", 0);

    @Override // xsna.wzs
    public final Pair<? extends VideoGetCommentsExtendedResponseDto, ? extends LikesGetListExtendedResponseDto> invoke(VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto, LikesGetListExtendedResponseDto likesGetListExtendedResponseDto) {
        return new Pair<>(videoGetCommentsExtendedResponseDto, likesGetListExtendedResponseDto);
    }
}
