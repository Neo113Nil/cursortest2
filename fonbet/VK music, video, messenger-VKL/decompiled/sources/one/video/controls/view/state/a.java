package one.video.controls.view.state;

import one.video.controls.view.state.PlayPauseButtonViewState;

/* compiled from: PlayPauseButtonViewStateExtensions.kt */
/* loaded from: classes8.dex */
public final class a {
    public static PlayPauseButtonViewState a(PlayPauseButtonViewState playPauseButtonViewState, boolean z, boolean z2, PlayPauseButtonViewState.ImageType imageType, int i) {
        if ((i & 1) != 0) {
            z = playPauseButtonViewState.a;
        }
        if ((i & 2) != 0) {
            z2 = playPauseButtonViewState.b;
        }
        if ((i & 4) != 0) {
            imageType = playPauseButtonViewState.c;
        }
        return (z == playPauseButtonViewState.a && z2 == playPauseButtonViewState.b && imageType == playPauseButtonViewState.c) ? playPauseButtonViewState : new PlayPauseButtonViewState(z, z2, imageType);
    }
}
