package xsna;

import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.chapter.presentation.feature.AudioBookChapterMviState;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.te4;

/* compiled from: AudioBookChapterViewStateMapper.kt */
/* loaded from: classes3.dex */
public final class ue4 {

    /* compiled from: AudioBookChapterViewStateMapper.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AudioBookChapterBottomSheetLaunchPoint.RemoveDownload.Type.values().length];
            try {
                iArr[AudioBookChapterBottomSheetLaunchPoint.RemoveDownload.Type.CANCEL_DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AudioBookChapterBottomSheetLaunchPoint.RemoveDownload.Type.DELETE_FILE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final te4.a a(AudioBookChapterMviState audioBookChapterMviState) {
        AudioBookChapterBottomSheetLaunchPoint audioBookChapterBottomSheetLaunchPoint = audioBookChapterMviState.b;
        if (!(audioBookChapterBottomSheetLaunchPoint instanceof AudioBookChapterBottomSheetLaunchPoint.RemoveDownload)) {
            throw new NoWhenBranchMatchedException();
        }
        AudioBookChapterBottomSheetLaunchPoint.RemoveDownload removeDownload = (AudioBookChapterBottomSheetLaunchPoint.RemoveDownload) audioBookChapterBottomSheetLaunchPoint;
        int i = a.$EnumSwitchMapping$0[removeDownload.d.ordinal()];
        if (i == 1) {
            return new te4.a(removeDownload.c, removeDownload.b, R.string.music_action_cancel_download, R.string.music_talkback_cancel_chapter_download, null);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return new te4.a(removeDownload.c, removeDownload.b, R.string.music_action_remove_from_storage_description, R.string.music_talkback_remove_chapter_from_storage, Integer.valueOf(R.drawable.vk_icon_download_cancel_outline_28));
    }
}
