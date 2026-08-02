package xsna;

import android.app.Activity;
import android.view.Window;
import com.vk.metrics.performance.scroll.ScrollScreenType;

/* compiled from: FrameFreezeChecker.kt */
/* loaded from: classes3.dex */
public interface efs {
    void b(Activity activity, mbs mbsVar, ScrollScreenType scrollScreenType, long j);

    default void a(Window window, mbs mbsVar, ScrollScreenType scrollScreenType, long j) {
    }
}
