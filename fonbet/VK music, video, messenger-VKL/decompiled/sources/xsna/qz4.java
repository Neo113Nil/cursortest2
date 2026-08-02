package xsna;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import com.vk.audiomsg.player.SpeakerType;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AudioTrackUtils.kt */
/* loaded from: classes15.dex */
public final class qz4 {
    public static AudioTrack a(SpeakerType speakerType, int i) {
        int i2;
        int i3;
        AudioTrack.Builder builder = new AudioTrack.Builder();
        AudioAttributes.Builder builder2 = new AudioAttributes.Builder();
        int[] iArr = iq4.$EnumSwitchMapping$0;
        int i4 = iArr[speakerType.ordinal()];
        if (i4 == 1) {
            i2 = 1;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i2 = 2;
        }
        AudioAttributes.Builder contentType = builder2.setContentType(i2);
        int i5 = iArr[speakerType.ordinal()];
        if (i5 == 1) {
            i3 = 2;
        } else {
            if (i5 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i3 = 1;
        }
        return builder.setAudioAttributes(contentType.setUsage(i3).build()).setAudioFormat(new AudioFormat.Builder().setSampleRate(48000).setEncoding(2).setChannelMask(4).build()).setBufferSizeInBytes(i).setTransferMode(1).build();
    }
}
