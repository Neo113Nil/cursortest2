package xsna;

import com.vk.core.preference.Preference;

/* compiled from: InAppReviewVmojiController.kt */
/* loaded from: classes11.dex */
public final class trw {
    public static final bpn0 a = new bpn0(new aq0(4));
    public static io.reactivex.rxjava3.disposables.c b;

    /* compiled from: InAppReviewVmojiController.kt */
    /* loaded from: classes7.dex */
    public static final class a {
        public long a = Preference.m(0, "vk_in_app_review_trigger_controller", "vmoji_add_5_changes");

        public final void a() {
            long j = this.a + 1;
            this.a = j;
            Preference.F(j, "vk_in_app_review_trigger_controller", "vmoji_add_5_changes");
        }

        public final long b() {
            return this.a;
        }
    }
}
