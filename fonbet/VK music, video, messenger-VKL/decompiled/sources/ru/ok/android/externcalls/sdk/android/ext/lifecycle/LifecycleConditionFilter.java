package ru.ok.android.externcalls.sdk.android.ext.lifecycle;

import android.app.Activity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import java.util.Set;
import ru.ok.android.externcalls.sdk.video.DisplayLayoutSender;
import xsna.f5z;
import xsna.rl3;

/* compiled from: LifecycleConditionFilter.kt */
/* loaded from: classes9.dex */
public final class LifecycleConditionFilter implements DisplayLayoutSender.SendFilter {
    private final Set<Lifecycle.State> activeStates = rl3.y0(new Lifecycle.State[]{Lifecycle.State.STARTED, Lifecycle.State.RESUMED});
    private final f5z owner;

    public LifecycleConditionFilter(f5z f5zVar) {
        this.owner = f5zVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean isInPip(f5z f5zVar) {
        Activity activity = f5zVar instanceof Activity ? (Activity) f5zVar : f5zVar instanceof Fragment ? ((Fragment) f5zVar).getActivity() : f5zVar instanceof android.app.Fragment ? ((android.app.Fragment) f5zVar).getActivity() : null;
        return activity != null && activity.isInPictureInPictureMode();
    }

    @Override // ru.ok.android.externcalls.sdk.video.DisplayLayoutSender.SendFilter
    public boolean shouldSend() {
        return this.activeStates.contains(this.owner.getLifecycle().getCurrentState()) || isInPip(this.owner);
    }
}
