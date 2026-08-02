package xsna;

import android.content.Context;
import com.vk.music.onboarding.impl.di.MusicOnboardingComponentImpl;
import com.vk.music.onboarding.impl.phone.MusicRecommendationOnboardingFragment;
import java.util.HashSet;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class dr40 implements er40 {
    @Override // xsna.er40
    public final void a(Context context, String str, String str2) {
        qcy<Object>[] qcyVarArr = MusicOnboardingComponentImpl.b;
        HashSet hashSet = iah0.a;
        if (fnj.b(context)) {
            com.vk.music.notifications.inapp.b.f(new y250(str, str2), null, null, 14);
        } else {
            new MusicRecommendationOnboardingFragment.a(str, str2).k(context);
        }
    }
}
