package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.libvideo.ui.video2.ScreenState;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippableSection;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;

/* compiled from: VideoSkippablePartDelegate.kt */
/* loaded from: classes3.dex */
public final class aht0 {
    public final VideoSkippablePartView a;
    public final VkButton b;
    public final VkButton c;
    public final Object d;
    public final Object e;

    /* compiled from: VideoSkippablePartDelegate.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ScreenState.values().length];
            try {
                iArr[ScreenState.FULLSCREEN_HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ScreenState.FULLSCREEN_VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoSkippableSection.values().length];
            try {
                iArr2[VideoSkippableSection.OPENING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoSkippableSection.ENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public aht0(VideoSkippablePartView videoSkippablePartView, VkButton vkButton, VkButton vkButton2) {
        this.a = videoSkippablePartView;
        this.b = vkButton;
        this.c = vkButton2;
        ajd0 ajd0Var = new ajd0(this, 22);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, ajd0Var);
        this.e = msy.a(lazyThreadSafetyMode, new la0(25));
    }

    public static void a(VideoSkippablePartView videoSkippablePartView, int i) {
        ViewGroup.LayoutParams layoutParams = videoSkippablePartView.getLayoutParams();
        FrameLayout.LayoutParams layoutParams2 = layoutParams instanceof FrameLayout.LayoutParams ? (FrameLayout.LayoutParams) layoutParams : null;
        if (layoutParams2 == null) {
            return;
        }
        layoutParams2.setMargins(0, 0, iah0.a(12), i);
        layoutParams2.gravity = 8388693;
        videoSkippablePartView.setLayoutParams(layoutParams2);
    }

    public static int b(int i, int i2, boolean z) {
        if (!z) {
            i = i2;
        }
        return iah0.a(i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean c() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final void d(VideoSkippableSection videoSkippableSection, boolean z) {
        Pair pair;
        int i = a.$EnumSwitchMapping$1[videoSkippableSection.ordinal()];
        if (i == 1) {
            pair = new Pair(Integer.valueOf(R.string.skippable_watch_opening), Integer.valueOf(R.string.skippable_skip_opening));
        } else if (i != 2) {
            return;
        } else {
            pair = new Pair(Integer.valueOf(R.string.skippable_watch_ending), Integer.valueOf(z ? R.string.skippable_next_series : R.string.skippable_next_video));
        }
        int intValue = ((Number) pair.d()).intValue();
        int intValue2 = ((Number) pair.g()).intValue();
        this.b.setText(intValue);
        this.c.setText(intValue2);
    }
}
