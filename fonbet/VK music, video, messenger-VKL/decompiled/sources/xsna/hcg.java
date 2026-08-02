package xsna;

import com.vk.api.generated.video.dto.VideoCreateCommentScreenModeDto;
import com.vk.newsfeed.impl.helpers.CommentScreenMode;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: CommentScreenModeProviderImpl.kt */
/* loaded from: classes4.dex */
public final class hcg {

    /* compiled from: CommentScreenModeProviderImpl.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommentScreenMode.values().length];
            try {
                iArr[CommentScreenMode.DISCOVERY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommentScreenMode.FULLSCREEN_LANDSCAPE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CommentScreenMode.FULLSCREEN_PORTRAIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final VideoCreateCommentScreenModeDto a(CommentScreenMode commentScreenMode) {
        if (commentScreenMode == null) {
            return null;
        }
        int i = a.$EnumSwitchMapping$0[commentScreenMode.ordinal()];
        if (i == 1) {
            return VideoCreateCommentScreenModeDto.DISCOVERY;
        }
        if (i == 2) {
            return VideoCreateCommentScreenModeDto.FULLSCREEN_LANDSCAPE;
        }
        if (i == 3) {
            return VideoCreateCommentScreenModeDto.FULLSCREEN_PORTRAIT;
        }
        throw new NoWhenBranchMatchedException();
    }
}
