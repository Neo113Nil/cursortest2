package xsna;

import android.os.Bundle;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.button.ButtonStyle;

/* compiled from: ClipsInterestsNavigatorProviderImpl.kt */
/* loaded from: classes16.dex */
public final class ihe implements hhe {
    @Override // xsna.hhe
    public final ClipsInterestsFragment.a f() {
        ClipsInterestsFragment.a aVar = new ClipsInterestsFragment.a();
        Bundle bundle = aVar.j;
        bundle.putBoolean("BACK_ARROW_KEY", true);
        bundle.putInt("NEXT_BUTTON_KEY", ButtonStyle.NEXT_ONLY.h());
        bundle.putBoolean("FINISH_ON_RESULT_KEY", true);
        bundle.putString("REQUEST_ARG_KEY", "negative_feedback_configure_interests_key");
        return aVar;
    }
}
