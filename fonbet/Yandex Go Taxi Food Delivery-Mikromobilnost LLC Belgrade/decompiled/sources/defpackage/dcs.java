package defpackage;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ybsdk.core.navigation.ScreenParams;
import com.ybsdk.feature.divkit.api.ui.screen.BaseDivContextMvvmFragment;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;

/* loaded from: classes11.dex */
public abstract class dcs {
    public static final ScreenParams a(Fragment fragment) {
        Bundle arguments = fragment.getArguments();
        ScreenParams screenParams = arguments != null ? (ScreenParams) arguments.getParcelable(fragment.getClass().getName()) : null;
        if (screenParams != null) {
            return screenParams;
        }
        ny61.r("ScreenParams shouldn't be null");
        return null;
    }

    public static final boolean b(BaseDivContextMvvmFragment baseDivContextMvvmFragment) {
        return baseDivContextMvvmFragment.getParentFragmentManager().K() == 0;
    }

    public static final i3y c(Fragment fragment) {
        return a.b(LazyThreadSafetyMode.NONE, new dnr(1, fragment));
    }
}
