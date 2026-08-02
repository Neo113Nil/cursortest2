package xsna;

import android.os.SystemClock;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import xsna.lgj0;

/* compiled from: ClipsBottomSheetRepository.kt */
/* loaded from: classes17.dex */
public final class mkd {
    public static io.reactivex.rxjava3.disposables.c a(final VideoFile videoFile, final int i, final gzs gzsVar) {
        return rsg0.Z(yfb.x(lgj0.a.b(new ngj0(), videoFile.I0(), videoFile.o0(), null, null, null, null, Integer.valueOf(i), null, null, null, 32700))).o(asu0.a.d()).subscribe(new io.reactivex.rxjava3.functions.a() { // from class: xsna.lkd
            @Override // io.reactivex.rxjava3.functions.a
            public final void run() {
                VideoFile videoFile2 = VideoFile.this;
                VideoFileOld copy = videoFile2.copy();
                copy.A0 = SystemClock.elapsedRealtime();
                int i2 = i;
                copy.r = i2;
                gpt0 gpt0Var = gpt0.a;
                copy.q = gpt0.b(i2, videoFile2);
                wjs0.a(new fyr0(copy));
                if (i2 == 0) {
                    wjs0.a(uxr0.a);
                }
                gzsVar.invoke();
            }
        }, new el6(new ci7(11), 9));
    }
}
