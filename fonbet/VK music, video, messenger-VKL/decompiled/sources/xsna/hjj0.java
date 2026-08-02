package xsna;

import com.vkontakte.android.R;

/* compiled from: ShowScrollAnimationOnboarding.kt */
/* loaded from: classes17.dex */
public final class hjj0 {
    public final boolean equals(Object obj) {
        Object valueOf = Integer.valueOf(R.string.im_chat_clips_scroll_onboarding);
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjj0)) {
            return false;
        }
        ((hjj0) obj).getClass();
        return valueOf.equals(valueOf);
    }

    public final int hashCode() {
        return Integer.valueOf(R.string.im_chat_clips_scroll_onboarding).hashCode() + (Long.hashCode(2000L) * 31);
    }

    public final String toString() {
        return "ShowScrollAnimationOnboarding(durationMs=2000, title=" + Integer.valueOf(R.string.im_chat_clips_scroll_onboarding) + ')';
    }
}
