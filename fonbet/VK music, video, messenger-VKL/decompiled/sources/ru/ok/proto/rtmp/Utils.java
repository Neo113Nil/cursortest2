package ru.ok.proto.rtmp;

import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import ru.ok.media.audio.AACUtil;
import ru.ok.media.video.H264Util;
import xsna.dez0;
import xsna.ne7;

/* loaded from: classes9.dex */
public final class Utils {
    public static final String TAG = "RTMP.Utils";

    public static void closeSocket(Socket socket) {
        if (socket != null) {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Map<String, Object> createMetadata(byte[] bArr, byte[] bArr2, int i) {
        HashMap a = dez0.a("videocodecid", VisualSampleEntry.TYPE3);
        H264Util.VideoHeadersInfo videoSizeFromMP4Config = H264Util.getVideoSizeFromMP4Config(bArr);
        if (videoSizeFromMP4Config != null) {
            ne7.t(TAG, "createMetadata() - video size " + videoSizeFromMP4Config.getFrameWidth() + "x" + videoSizeFromMP4Config.getFrameHeight());
            a.put("width", Double.valueOf((double) videoSizeFromMP4Config.getFrameWidth()));
            a.put("height", Double.valueOf((double) videoSizeFromMP4Config.getFrameHeight()));
        } else {
            ne7.J(TAG, "createMetadata() - failed to parse h264Config");
        }
        a.put("audiocodecid", AudioSampleEntry.TYPE3);
        if (bArr2 != null) {
            AACUtil.StreamInfo parseStreamInfo = AACUtil.parseStreamInfo(bArr2);
            if (parseStreamInfo != null) {
                int channelCount = parseStreamInfo.getChannelCount();
                int samplerate = parseStreamInfo.getSamplerate();
                ne7.t(TAG, "createMetadata() - audio rate= " + samplerate + ", channels= " + channelCount);
                a.put("audiosamplesize", Double.valueOf(16.0d));
                a.put("audiosamplerate", Double.valueOf((double) samplerate));
                a.put("audiochannels", Double.valueOf((double) channelCount));
            } else {
                ne7.J(TAG, "createMetadata() - failed to parse aacConfig");
            }
        } else {
            ne7.J(TAG, "createMetadata() - aacConfig is not set");
        }
        if (i >= 0) {
            ne7.t(TAG, "createMetadata() - rotation=" + i);
            a.put("rotation", Double.valueOf((double) i));
            return a;
        }
        ne7.J(TAG, "createMetadata() - rotation=" + i + " (not set, skip sending)");
        return a;
    }

    public static Socket createRtmpSocket(InetAddress inetAddress, int i) throws IOException {
        Socket socket = new Socket();
        socket.setSoTimeout(5000);
        socket.connect(new InetSocketAddress(inetAddress, i), 10000);
        socket.setSoTimeout(20000);
        return socket;
    }
}
