package ru.ok.android.webrtc.stat.rtc;

import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;
import ru.ok.android.webrtc.stat.rtc.Ssrc;

/* loaded from: classes9.dex */
public final class SsrcUtils {
    @NonNull
    public static List<Ssrc.AudioRecv> incomingAudio(@NonNull List<Ssrc> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Ssrc ssrc : list) {
            if (ssrc.direction == Ssrc.Direction.RECV && ssrc.mediaType == Ssrc.MediaType.AUDIO) {
                arrayList.add((Ssrc.AudioRecv) ssrc);
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<Ssrc.VideoRecv> incomingVideo(@NonNull List<Ssrc> list) {
        ArrayList arrayList = new ArrayList(list.size() / 2);
        for (Ssrc ssrc : list) {
            if (ssrc.direction == Ssrc.Direction.RECV && ssrc.mediaType == Ssrc.MediaType.VIDEO) {
                arrayList.add((Ssrc.VideoRecv) ssrc);
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<Ssrc.AudioSend> outgoingAudio(@NonNull List<Ssrc> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Ssrc ssrc : list) {
            if (ssrc.direction == Ssrc.Direction.SEND && ssrc.mediaType == Ssrc.MediaType.AUDIO) {
                arrayList.add((Ssrc.AudioSend) ssrc);
            }
        }
        return arrayList;
    }

    @NonNull
    public static List<Ssrc.VideoSend> outgoingVideo(@NonNull List<Ssrc> list) {
        ArrayList arrayList = new ArrayList(list.size() / 2);
        for (Ssrc ssrc : list) {
            if (ssrc.direction == Ssrc.Direction.SEND && ssrc.mediaType == Ssrc.MediaType.VIDEO) {
                arrayList.add((Ssrc.VideoSend) ssrc);
            }
        }
        return arrayList;
    }

    @NonNull
    public static Ssrc.Pack split(@NonNull List<Ssrc> list) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size() / 2);
        ArrayList arrayList4 = new ArrayList(list.size() / 2);
        for (Ssrc ssrc : list) {
            Ssrc.MediaType mediaType = ssrc.mediaType;
            if (mediaType == Ssrc.MediaType.AUDIO) {
                Ssrc.Direction direction = ssrc.direction;
                if (direction == Ssrc.Direction.RECV) {
                    arrayList.add((Ssrc.AudioRecv) ssrc);
                } else {
                    if (direction != Ssrc.Direction.SEND) {
                        throw new AssertionError("unreachable: " + ssrc);
                    }
                    arrayList2.add((Ssrc.AudioSend) ssrc);
                }
            } else {
                if (mediaType != Ssrc.MediaType.VIDEO) {
                    throw new AssertionError("unreachable: " + ssrc);
                }
                Ssrc.Direction direction2 = ssrc.direction;
                if (direction2 == Ssrc.Direction.RECV) {
                    arrayList3.add((Ssrc.VideoRecv) ssrc);
                } else {
                    if (direction2 != Ssrc.Direction.SEND) {
                        throw new AssertionError("unreachable: " + ssrc);
                    }
                    arrayList4.add((Ssrc.VideoSend) ssrc);
                }
            }
        }
        return new Ssrc.Pack(arrayList, arrayList3, arrayList2, arrayList4);
    }

    @NonNull
    public static <T extends Ssrc> List<T> ssrcForConnection(@NonNull List<T> list, @NonNull CandidatePair candidatePair) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T t : list) {
            if (candidatePair.channelId.equals(t.transportId)) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }
}
