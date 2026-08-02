package xsna;

import androidx.core.app.NotificationCompat;
import com.vk.core.preference.Preference;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* compiled from: GesturesFeedbackPreference.kt */
/* loaded from: classes7.dex */
public final class cpt {
    public static final /* synthetic */ qcy<Object>[] b;
    public final f18 a;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(cpt.class, "showFeedbackByGestures", "getShowFeedbackByGestures()Z", 0);
        fpf0.a.getClass();
        b = new qcy[]{mutablePropertyReference1Impl};
    }

    public cpt(boolean z) {
        String concat = NotificationCompat.CATEGORY_CALL.concat("_gestures_feedback");
        if (Preference.v("voip_prefs_shared", "gestures_feedback")) {
            z = Preference.d("voip_prefs_shared", "gestures_feedback", false);
            Preference.C("voip_prefs_shared", "gestures_feedback");
        }
        this.a = new f18("voip_prefs_shared", concat, z);
    }

    public final io.reactivex.rxjava3.core.q<Boolean> a() {
        return new io.reactivex.rxjava3.internal.operators.observable.q(new r41(this, 26)).o0(new io.reactivex.rxjava3.internal.operators.single.v(new u0n(this, 1)));
    }
}
