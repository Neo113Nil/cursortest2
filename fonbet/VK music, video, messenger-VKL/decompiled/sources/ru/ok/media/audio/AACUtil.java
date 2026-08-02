package ru.ok.media.audio;

import ru.ok.android.webrtc.rtp.RtpSenderHelper;
import ru.ok.media.utils.ParsableBitArray;

/* loaded from: classes9.dex */
public class AACUtil {
    private static int[] sampleRates = {96000, 88200, RtpSenderHelper.AUDIO_BITRATE_MAX, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 0, 0, 0};

    public static class StreamInfo {
        private int channelCount;
        private int samplerate;

        public StreamInfo(int i, int i2) {
            this.samplerate = i;
            this.channelCount = i2;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public int getSamplerate() {
            return this.samplerate;
        }
    }

    public static StreamInfo parseStreamInfo(byte[] bArr) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits(5);
        int readBits = parsableBitArray.readBits(4);
        int readBits2 = readBits == 15 ? parsableBitArray.readBits(24) : sampleRates[readBits];
        int readBits3 = parsableBitArray.readBits(4);
        if (readBits2 < 1 || readBits3 < 1) {
            return null;
        }
        return new StreamInfo(readBits2, readBits3);
    }
}
