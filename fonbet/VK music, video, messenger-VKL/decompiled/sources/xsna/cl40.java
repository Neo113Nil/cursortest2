package xsna;

import android.view.View;
import com.vk.music.haptic.MusicHapticEvent;

/* compiled from: MusicHapticEvent.kt */
/* loaded from: classes3.dex */
public final class cl40 {

    /* compiled from: MusicHapticEvent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MusicHapticEvent.values().length];
            try {
                iArr[MusicHapticEvent.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MusicHapticEvent.SOFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final void a(View view, MusicHapticEvent musicHapticEvent) {
        if (gz80.a(34)) {
            view.performHapticFeedback(musicHapticEvent.h());
            return;
        }
        int i = a.$EnumSwitchMapping$0[musicHapticEvent.ordinal()];
        if (i == 1 || i == 2) {
            musicHapticEvent = MusicHapticEvent.RIGID;
        }
        view.performHapticFeedback(musicHapticEvent.h());
    }
}
