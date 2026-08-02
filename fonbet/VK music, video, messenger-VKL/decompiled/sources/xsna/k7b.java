package xsna;

import android.content.SharedPreferences;
import com.vk.core.preference.Preference;

/* compiled from: ChannelOnboardingConfig.kt */
/* loaded from: classes5.dex */
public interface k7b {
    public static final a a = a.b;

    /* compiled from: ChannelOnboardingConfig.kt */
    public static final class a implements k7b {
        public static final /* synthetic */ a b = new a();
        public static final SharedPreferences c = Preference.f("channel_onboarding");
        public static final String d = "show_count_key";

        @Override // xsna.k7b
        public final SharedPreferences a() {
            return c;
        }

        @Override // xsna.k7b
        public final String b() {
            return d;
        }
    }

    SharedPreferences a();

    String b();
}
