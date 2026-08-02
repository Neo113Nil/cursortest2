package xsna;

import com.vk.clips.viewer.edit.presentation.feature.state.ClipEditSdkMviState;
import com.vk.clips.viewer.edit.presentation.feature.state.ImmutableClipState;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;

/* compiled from: ClipPrivacyHelper.kt */
/* loaded from: classes17.dex */
public final class oad {
    public static ClipsEditCoauthorsState.Enabled.InactiveReason a(ClipEditSdkMviState clipEditSdkMviState) {
        boolean z = clipEditSdkMviState.l;
        ImmutableClipState immutableClipState = clipEditSdkMviState.i;
        ClipsEditCoauthorsState.Enabled enabled = (ClipsEditCoauthorsState.Enabled) clipEditSdkMviState.f;
        if (!enabled.b.isEmpty() && fkq0.d(immutableClipState.c) && z) {
            return ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedProfileWithCoauthors;
        }
        if (!enabled.b.isEmpty() && fkq0.b(immutableClipState.c) && z) {
            return ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedGroupWithCoauthors;
        }
        if (fkq0.d(immutableClipState.c) && z) {
            return ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedProfileWithoutCoauthors;
        }
        if (fkq0.b(immutableClipState.c) && z) {
            return ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedGroupWithoutCoauthors;
        }
        if (clipEditSdkMviState.m) {
            return ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedClip;
        }
        return null;
    }
}
