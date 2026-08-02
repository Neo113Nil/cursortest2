package xsna;

import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;

/* compiled from: coauthorViewStateBuilder.kt */
/* loaded from: classes17.dex */
public final /* synthetic */ class ryf {
    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

    static {
        int[] iArr = new int[ClipsEditCoauthorsState.Enabled.InactiveReason.values().length];
        try {
            iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedProfileWithoutCoauthors.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedProfileWithCoauthors.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedGroupWithoutCoauthors.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedGroupWithCoauthors.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.ClosedClip.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[ClipsEditCoauthorsState.Enabled.InactiveReason.LoadingInfo.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        $EnumSwitchMapping$0 = iArr;
    }
}
