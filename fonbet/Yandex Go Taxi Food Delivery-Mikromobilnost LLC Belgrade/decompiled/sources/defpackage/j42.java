package defpackage;

import androidx.media3.common.PlaybackException;
import androidx.media3.common.a;
import java.io.IOException;
import java.util.List;

/* loaded from: classes10.dex */
public interface j42 {
    default void onAudioAttributesChanged(h42 h42Var, ue3 ue3Var) {
    }

    default void onAudioCodecError(h42 h42Var, Exception exc) {
    }

    default void onAudioDecoderInitialized(h42 h42Var, String str, long j) {
    }

    default void onAudioDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    default void onAudioDecoderReleased(h42 h42Var, String str) {
    }

    default void onAudioDisabled(h42 h42Var, kyg kygVar) {
    }

    default void onAudioEnabled(h42 h42Var, kyg kygVar) {
    }

    default void onAudioInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
    }

    default void onAudioPositionAdvancing(h42 h42Var, long j) {
    }

    default void onAudioSessionIdChanged(h42 h42Var, int i) {
    }

    default void onAudioSinkError(h42 h42Var, Exception exc) {
    }

    default void onAudioTrackInitialized(h42 h42Var, ah3 ah3Var) {
    }

    default void onAudioTrackReleased(h42 h42Var, ah3 ah3Var) {
    }

    default void onAudioUnderrun(h42 h42Var, int i, long j, long j2) {
    }

    default void onAvailableCommandsChanged(h42 h42Var, vxc0 vxc0Var) {
    }

    default void onBandwidthEstimate(h42 h42Var, int i, long j, long j2) {
    }

    default void onCues(h42 h42Var, List list) {
    }

    default void onCues(h42 h42Var, rdf rdfVar) {
    }

    default void onDeviceInfoChanged(h42 h42Var, xaj xajVar) {
    }

    default void onDeviceVolumeChanged(h42 h42Var, int i, boolean z) {
    }

    default void onDownstreamFormatChanged(h42 h42Var, he10 he10Var) {
    }

    default void onDrmKeysLoaded(h42 h42Var) {
    }

    default void onDrmKeysRemoved(h42 h42Var) {
    }

    default void onDrmKeysRestored(h42 h42Var) {
    }

    default void onDrmSessionAcquired(h42 h42Var) {
    }

    default void onDrmSessionAcquired(h42 h42Var, int i) {
    }

    default void onDrmSessionManagerError(h42 h42Var, Exception exc) {
    }

    default void onDrmSessionReleased(h42 h42Var) {
    }

    default void onDroppedVideoFrames(h42 h42Var, int i, long j) {
    }

    default void onEvents(zxc0 zxc0Var, i42 i42Var) {
    }

    default void onIsLoadingChanged(h42 h42Var, boolean z) {
    }

    default void onIsPlayingChanged(h42 h42Var, boolean z) {
    }

    default void onLoadCanceled(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    default void onLoadCompleted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    default void onLoadError(h42 h42Var, uwy uwyVar, he10 he10Var, IOException iOException, boolean z) {
    }

    default void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var) {
    }

    default void onLoadStarted(h42 h42Var, uwy uwyVar, he10 he10Var, int i) {
    }

    default void onLoadingChanged(h42 h42Var, boolean z) {
    }

    default void onMediaItemTransition(h42 h42Var, fe10 fe10Var, int i) {
    }

    default void onMediaMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    default void onMetadata(h42 h42Var, w820 w820Var) {
    }

    default void onPlayWhenReadyChanged(h42 h42Var, boolean z, int i) {
    }

    default void onPlaybackParametersChanged(h42 h42Var, lxc0 lxc0Var) {
    }

    default void onPlaybackStateChanged(h42 h42Var, int i) {
    }

    default void onPlaybackSuppressionReasonChanged(h42 h42Var, int i) {
    }

    void onPlayerError(h42 h42Var, PlaybackException playbackException);

    default void onPlayerErrorChanged(h42 h42Var, PlaybackException playbackException) {
    }

    default void onPlayerReleased(h42 h42Var) {
    }

    default void onPlayerStateChanged(h42 h42Var, boolean z, int i) {
    }

    default void onPlaylistMetadataChanged(h42 h42Var, re10 re10Var) {
    }

    default void onPositionDiscontinuity(h42 h42Var, int i) {
    }

    default void onPositionDiscontinuity(h42 h42Var, yxc0 yxc0Var, yxc0 yxc0Var2, int i) {
    }

    default void onRenderedFirstFrame(h42 h42Var, Object obj, long j) {
    }

    default void onRendererReadyChanged(h42 h42Var, int i, int i2, boolean z) {
    }

    default void onRepeatModeChanged(h42 h42Var, int i) {
    }

    default void onSeekStarted(h42 h42Var) {
    }

    default void onShuffleModeChanged(h42 h42Var, boolean z) {
    }

    default void onSkipSilenceEnabledChanged(h42 h42Var, boolean z) {
    }

    default void onSurfaceSizeChanged(h42 h42Var, int i, int i2) {
    }

    default void onTimelineChanged(h42 h42Var, int i) {
    }

    default void onTrackSelectionParametersChanged(h42 h42Var, r001 r001Var) {
    }

    default void onTracksChanged(h42 h42Var, r801 r801Var) {
    }

    default void onUpstreamDiscarded(h42 h42Var, he10 he10Var) {
    }

    default void onVideoCodecError(h42 h42Var, Exception exc) {
    }

    default void onVideoDecoderInitialized(h42 h42Var, String str, long j) {
    }

    default void onVideoDecoderInitialized(h42 h42Var, String str, long j, long j2) {
    }

    default void onVideoDecoderReleased(h42 h42Var, String str) {
    }

    default void onVideoDisabled(h42 h42Var, kyg kygVar) {
    }

    default void onVideoEnabled(h42 h42Var, kyg kygVar) {
    }

    default void onVideoFrameProcessingOffset(h42 h42Var, long j, int i) {
    }

    default void onVideoInputFormatChanged(h42 h42Var, a aVar, qyg qygVar) {
    }

    default void onVideoSizeChanged(h42 h42Var, int i, int i2, int i3, float f) {
    }

    default void onVideoSizeChanged(h42 h42Var, do31 do31Var) {
    }

    default void onVolumeChanged(h42 h42Var, float f) {
    }
}
