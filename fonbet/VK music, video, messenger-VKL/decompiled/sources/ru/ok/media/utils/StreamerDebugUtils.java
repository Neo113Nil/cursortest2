package ru.ok.media.utils;

import com.ironsource.X3;
import java.util.Arrays;
import java.util.Locale;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;
import ru.ok.media.StreamerMediaLinkStats;
import ru.ok.media.StreamerPacketsInfo;
import ru.ok.media.StreamerStatistic;
import ru.ok.media.api.Streamer;
import xsna.jh;

/* compiled from: StreamerDebugUtils.kt */
/* loaded from: classes9.dex */
public final class StreamerDebugUtils {
    public static final StreamerDebugUtils INSTANCE = new StreamerDebugUtils();

    private StreamerDebugUtils() {
    }

    public static final String formatNumber(double d, String str) {
        return d < 1000.0d ? String.format(Locale.US, "%4d", Arrays.copyOf(new Object[]{Integer.valueOf((int) d)}, 1)).concat(str) : d < 1000000.0d ? String.format(Locale.US, "%3.1fK", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000.0d)}, 1)).concat(str) : d < 1.0E9d ? String.format(Locale.US, "%3.1fM", Arrays.copyOf(new Object[]{Double.valueOf(d / 1000000.0d)}, 1)).concat(str) : String.format(Locale.US, "%3.1fG", Arrays.copyOf(new Object[]{Double.valueOf(d / 1.0E9d)}, 1)).concat(str);
    }

    public static final String getAudioLinkString(StreamerStatistic streamerStatistic) {
        return mediaLinkString(streamerStatistic.getLinkStats().getAudio());
    }

    public static final String getBandwidthString(StreamerStatistic streamerStatistic) {
        return formatNumber(streamerStatistic.getBandwidth(), "bps");
    }

    public static final String getBitrateString(StreamerStatistic streamerStatistic) {
        StringBuilder sb = new StringBuilder(formatNumber(streamerStatistic.getBitrate(), "bps"));
        if (streamerStatistic.getAltBitrate() != null) {
            sb.append(" (");
            sb.append(formatNumber(r4.intValue(), "bps"));
            sb.append(")");
        }
        return sb.toString();
    }

    public static final String getBytesSentString(StreamerStatistic streamerStatistic) {
        return formatNumber(streamerStatistic.getPacketsInfo().getBytesSent(), "B");
    }

    public static final String getDebugString(Streamer streamer) {
        StringBuilder sb = new StringBuilder();
        if (streamer == null) {
            sb.append("No Streamer");
        } else {
            StreamerStatistic statistic = streamer.getStatistic();
            sb.append(statistic.getProto());
            sb.append("\n");
            sb.append(getVideoResolutionRotationFpsStringIfKnown(statistic));
            sb.append("Bitrate: ");
            sb.append(getBitrateString(statistic));
            String overheadPercentString = getOverheadPercentString(statistic);
            if (overheadPercentString.length() != 0) {
                jh.f(sb, " [ovh ", overheadPercentString, X3.j.e);
            }
            sb.append("\nTarget BW: ");
            sb.append(getBandwidthString(statistic));
            sb.append("\nBytes sent: ");
            sb.append(getBytesSentString(statistic));
            sb.append("\nLoss (drops) a/v: ");
            sb.append(getLossDropsString(statistic));
            sb.append("\nAudio: ");
            sb.append(getAudioLinkString(statistic));
            sb.append("\nVideo: ");
            sb.append(getVideoLinkString(statistic));
            sb.append("\n");
            String debugInfo = statistic.getDebugInfo();
            if (debugInfo != null && debugInfo.length() != 0) {
                sb.append(debugInfo);
            }
        }
        return sb.toString();
    }

    public static final String getFpsString(StreamerStatistic streamerStatistic) {
        double fps = streamerStatistic.getFps();
        Locale locale = Locale.US;
        StringBuilder sb = new StringBuilder(String.format(locale, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(fps)}, 1)));
        Double altFps = streamerStatistic.getAltFps();
        if (altFps != null && !altFps.equals(Double.valueOf(fps))) {
            sb.append(String.format(locale, " (%.1f)", Arrays.copyOf(new Object[]{altFps}, 1)));
        }
        return sb.toString();
    }

    public static final String getLossDropsString(StreamerStatistic streamerStatistic) {
        StreamerPacketsInfo packetsInfo = streamerStatistic.getPacketsInfo();
        return String.format(Locale.US, "%d/%d (%d)", Arrays.copyOf(new Object[]{Long.valueOf(packetsInfo.getAudioPacketsLost()), Long.valueOf(packetsInfo.getVideoPacketsLost()), Long.valueOf(streamerStatistic.getVideoFramesDropped())}, 3));
    }

    public static final String getOverheadPercentString(StreamerStatistic streamerStatistic) {
        StreamerPacketsInfo packetsInfo = streamerStatistic.getPacketsInfo();
        long payloadBytesSent = packetsInfo.getPayloadBytesSent();
        if (0 == payloadBytesSent) {
            return "";
        }
        long bytesSent = packetsInfo.getBytesSent();
        if (bytesSent <= 0) {
            return "0 %";
        }
        if (payloadBytesSent >= bytesSent) {
            return "100 %";
        }
        double bitrate = streamerStatistic.getBitrate();
        double averageOverheadBitrate = streamerStatistic.getAverageOverheadBitrate();
        Locale locale = Locale.US;
        double d = ConnectivityTracker.DEFAULT_UPLINK_BITRATE;
        if (bitrate > ConnectivityTracker.DEFAULT_UPLINK_BITRATE) {
            d = (averageOverheadBitrate * 100) / bitrate;
        }
        return String.format(locale, "%.1f %% / %.1f %%", Arrays.copyOf(new Object[]{Double.valueOf(d), Double.valueOf(((bytesSent - payloadBytesSent) * 100) / bytesSent)}, 2));
    }

    public static final String getResolutionString(StreamerStatistic streamerStatistic) {
        Integer width = streamerStatistic.getWidth();
        Integer height = streamerStatistic.getHeight();
        if (width == null || height == null) {
            return "";
        }
        return width + "x" + height;
    }

    public static final String getRotationString(StreamerStatistic streamerStatistic) {
        Integer rotationAngle = streamerStatistic.getRotationAngle();
        if (rotationAngle == null) {
            return "";
        }
        return rotationAngle + "°";
    }

    public static final String getVideoLinkString(StreamerStatistic streamerStatistic) {
        return mediaLinkString(streamerStatistic.getLinkStats().getVideo());
    }

    public static final String getVideoResolutionRotationFpsStringIfKnown(StreamerStatistic streamerStatistic) {
        String resolutionString = getResolutionString(streamerStatistic);
        String rotationString = getRotationString(streamerStatistic);
        String fpsString = getFpsString(streamerStatistic);
        StringBuilder sb = new StringBuilder();
        String str = "";
        String str2 = " ";
        if (resolutionString.length() != 0) {
            sb.append("");
            sb.append(resolutionString);
            str = " ";
        }
        if (rotationString.length() == 0) {
            str2 = str;
        } else {
            sb.append(str);
            sb.append(rotationString);
        }
        if (resolutionString.length() != 0 && fpsString.length() != 0) {
            jh.f(sb, str2, "Fps: ", fpsString);
        }
        String sb2 = sb.toString();
        return sb2.length() == 0 ? sb2 : sb2.concat("\n");
    }

    public static final String mediaLinkString(StreamerMediaLinkStats streamerMediaLinkStats) {
        double d = 1000;
        return String.format(Locale.US, "%s, %d(%.1f) | %d(%.1f) | %d(%.1f) | %d(%.1f)", Arrays.copyOf(new Object[]{streamerMediaLinkStats.getState().toString(), Long.valueOf(streamerMediaLinkStats.getStallsCount()), Double.valueOf(streamerMediaLinkStats.getStallDuration() / d), Long.valueOf(streamerMediaLinkStats.getUnstableCount()), Double.valueOf(streamerMediaLinkStats.getUnstableDuration() / d), Long.valueOf(streamerMediaLinkStats.getPauseCount()), Double.valueOf(streamerMediaLinkStats.getPauseDuration() / d), Long.valueOf(streamerMediaLinkStats.getDisconnectCount()), Double.valueOf(streamerMediaLinkStats.getDisconnectDuration() / d)}, 9));
    }
}
