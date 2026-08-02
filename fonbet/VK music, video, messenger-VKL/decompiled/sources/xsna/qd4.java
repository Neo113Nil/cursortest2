package xsna;

import android.app.Activity;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.dto.music.audiobook.AudioBookPersonRole;
import com.vk.music.bottomsheets.audiobook.AudioBookBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookChapterBottomSheetLaunchPoint;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;

/* compiled from: AudioBookBottomSheetLauncher.kt */
/* loaded from: classes.dex */
public interface qd4 {
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void t(ic40 ic40Var, Activity activity, AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint, List list, AudioBookPerson audioBookPerson, MusicPlaybackLaunchContext musicPlaybackLaunchContext, int i) {
        if ((i & 4) != 0) {
            list = null;
        }
        if ((i & 8) != 0) {
            audioBookPerson = null;
        }
        ic40Var.p(activity, audioBookPersonBottomSheetLaunchPoint, list, audioBookPerson, musicPlaybackLaunchContext);
    }

    default void u(Activity activity, AudioBookChapterBottomSheetLaunchPoint.RemoveDownload removeDownload) {
    }

    default void d(Activity activity, String str, String str2, AudioBookPersonRole audioBookPersonRole, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
    }

    default void o(Activity activity, AudioBook audioBook, AudioBookBottomSheetLaunchPoint audioBookBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext, boolean z) {
    }

    default void p(Activity activity, AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint, List<AudioBookPerson> list, AudioBookPerson audioBookPerson, MusicPlaybackLaunchContext musicPlaybackLaunchContext) {
    }
}
