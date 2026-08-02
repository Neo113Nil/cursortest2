package xsna;

import android.content.Context;
import android.os.Bundle;
import com.vk.clips.interests.impl.ui.ClipsInterestsFragment;
import com.vk.clips.interests.impl.ui.button.ButtonStyle;

/* compiled from: ClipsNestedInterestsOnboardingLauncherImpl.kt */
/* loaded from: classes16.dex */
public final class rme implements qme {
    public final pme a;

    public rme(pme pmeVar) {
        this.a = pmeVar;
    }

    @Override // xsna.qme
    public final void a(Context context) {
        this.a.getClass();
        ClipsInterestsFragment.a aVar = new ClipsInterestsFragment.a();
        int h = ButtonStyle.NEXT_ONLY.h();
        Bundle bundle = aVar.j;
        bundle.putInt("NEXT_BUTTON_KEY", h);
        bundle.putBoolean("BACK_ARROW_KEY", true);
        aVar.k(context);
    }
}
