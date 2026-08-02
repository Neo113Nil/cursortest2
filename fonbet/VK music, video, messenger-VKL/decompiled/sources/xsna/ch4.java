package xsna;

import android.app.Activity;
import com.vk.dto.music.audiobook.AudioBook;
import com.vk.dto.music.audiobook.AudioBookPerson;
import com.vk.music.bottomsheets.audiobook.AudioBookPersonBottomSheetLaunchPoint;
import com.vk.music.common.MusicPlaybackLaunchContext;
import java.util.List;

/* compiled from: AudioBookInteractor.kt */
/* loaded from: classes3.dex */
public interface ch4 {
    io.reactivex.rxjava3.internal.operators.single.s a(int i, String str, boolean z);

    io.reactivex.rxjava3.core.x<AudioBook> b(int i, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    io.reactivex.rxjava3.internal.operators.single.s c(int i, String str, boolean z);

    void d(Activity activity, List<AudioBookPerson> list, AudioBookPersonBottomSheetLaunchPoint audioBookPersonBottomSheetLaunchPoint, MusicPlaybackLaunchContext musicPlaybackLaunchContext);

    io.reactivex.rxjava3.core.a e(int i);
}
