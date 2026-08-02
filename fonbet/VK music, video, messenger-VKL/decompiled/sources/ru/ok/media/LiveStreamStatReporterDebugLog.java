package ru.ok.media;

import com.ironsource.X3;
import ru.ok.media.api.LiveStreamStatReporter;
import ru.ok.media.api.StreamerState;
import xsna.cgn;
import xsna.jax0;
import xsna.n6j;
import xsna.ne7;
import xsna.odj;
import xsna.tj0;
import xsna.zcl;

/* compiled from: LiveStreamStatReporterDebugLog.kt */
/* loaded from: classes9.dex */
public final class LiveStreamStatReporterDebugLog implements LiveStreamStatReporter {
    private static final Companion Companion = new Companion(null);
    private static final String TAG = "Publisher";

    /* compiled from: LiveStreamStatReporterDebugLog.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String dump(Integer[] numArr) {
            if (numArr == null) {
                return "null";
            }
            StringBuilder sb = new StringBuilder(X3.j.d);
            int length = numArr.length;
            String str = "";
            int i = 0;
            while (i < length) {
                int intValue = numArr[i].intValue();
                sb.append(str);
                sb.append(intValue);
                i++;
                str = ", ";
            }
            sb.append(X3.j.e);
            return sb.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String optInt32Str(Integer num) {
            String num2;
            return (num == null || (num2 = num.toString()) == null) ? "null" : num2;
        }

        private Companion() {
        }
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void setApplicationState(LiveStreamStatReporter.ApplicationState applicationState) {
        ne7.m(TAG, "stream stat: setApplicationState - " + applicationState.ordinal() + " " + applicationState);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamAudioFailed(String str, String str2) {
        ne7.m(TAG, "stream stat: streamAudioFailed - event: " + str + " error: " + str2);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamConnected(String str, String str2) {
        ne7.m(TAG, "stream stat: streamConnected - fromAddress= " + str + " interface= " + str2);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamConnecting(String str) {
        ne7.m(TAG, "stream stat: streamConnecting - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamCreateFailed(String str) {
        ne7.m(TAG, "stream stat: streamCreateFailed - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamCreated(LiveStreamStatReporter.PublisherType publisherType) {
        ne7.m(TAG, "stream stat: streamCreated - " + publisherType.ordinal() + " " + publisherType);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamDisconnected(String str) {
        ne7.m(TAG, "stream stat: streamDisconnected - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamEnded(String str) {
        ne7.m(TAG, "stream stat: streamEnded - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamLink(StreamerState streamerState, StreamerLinkStats streamerLinkStats) {
        ne7.m(TAG, "stream stat: streamLink - state: " + streamerState + " linkStats: " + streamerLinkStats);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamPauseFailed(String str) {
        ne7.m(TAG, "stream stat: streamPauseFailed - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamPaused(String str) {
        ne7.m(TAG, "stream stat: streamPaused - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamQuality(int i, StreamerState streamerState, Integer num, Integer num2, int i2, Integer num3, int i3, Integer num4, int i4, long j, long j2, long j3, int i5, int i6, int i7, long j4, Integer[] numArr, long j5, Integer[] numArr2) {
        Companion companion = Companion;
        String optInt32Str = companion.optInt32Str(num);
        String optInt32Str2 = companion.optInt32Str(num2);
        String optInt32Str3 = companion.optInt32Str(num3);
        String optInt32Str4 = companion.optInt32Str(num4);
        String dump = companion.dump(numArr);
        String dump2 = companion.dump(numArr2);
        StringBuilder sb = new StringBuilder("stream stat: streamQuality - ");
        sb.append(i);
        sb.append(" ms ");
        sb.append(streamerState);
        sb.append(" ");
        n6j.b(sb, optInt32Str, "x", optInt32Str2, "@");
        jax0.a(i2, " (@", optInt32Str3, ") bitrate: ", sb);
        jax0.a(i3, " altBitrate: ", optInt32Str4, " bandwidth: ", sb);
        sb.append(i4);
        sb.append(" bytes sent: ");
        sb.append(j);
        tj0.d(sb, " rcvd: ", j2, " vframes dropped: ");
        cgn.a(i5, i6, " lost packets v: ", " a: ", sb);
        sb.append(i7);
        sb.append(" bytes dropped: ");
        sb.append(j3);
        tj0.d(sb, " ticks: ", j4, " lastBlocksNative: ");
        sb.append(dump);
        sb.append(" ticks2: ");
        sb.append(j5);
        sb.append(" lastBlocks: ");
        sb.append(dump2);
        ne7.m(TAG, sb.toString());
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamQualitySwitched(int i, int i2, int i3, int i4) {
        StringBuilder a = odj.a(i, i2, "stream stat: streamQualitySwitched - ", "x", " video: ");
        a.append(i3);
        a.append(" audio: ");
        a.append(i4);
        ne7.m(TAG, a.toString());
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamResumeFailed(String str) {
        ne7.m(TAG, "stream stat: streamResumeFailed - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamResumed() {
        ne7.m(TAG, "stream stat: streamResumed");
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamStartFailed(String str) {
        ne7.m(TAG, "stream stat: streamStartFailed - ".concat(str));
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamStarted() {
        ne7.m(TAG, "stream stat: streamStarted");
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamStateChanged(StreamerState streamerState, StreamerState streamerState2, String str) {
        ne7.m(TAG, "stream stat: streamStateChanged - " + streamerState + " -> " + streamerState2 + " reason: " + str);
    }

    @Override // ru.ok.media.api.LiveStreamStatReporter
    public void streamVideoFailed(String str, String str2) {
        ne7.m(TAG, "stream stat: streamVideoFailed - event: " + str + " error: " + str2);
    }
}
