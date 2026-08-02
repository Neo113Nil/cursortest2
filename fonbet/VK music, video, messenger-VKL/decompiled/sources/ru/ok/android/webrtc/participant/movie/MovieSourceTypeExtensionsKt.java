package ru.ok.android.webrtc.participant.movie;

import kotlin.NoWhenBranchMatchedException;
import ru.ok.android.webrtc.videotracks.VideoTrackType;

/* loaded from: classes9.dex */
public final class MovieSourceTypeExtensionsKt {

    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MovieSourceType.values().length];
            try {
                iArr[MovieSourceType.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MovieSourceType.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoTrackType.values().length];
            try {
                iArr2[VideoTrackType.MOVIE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[VideoTrackType.STREAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final MovieSourceType toMovieSourceType(VideoTrackType videoTrackType) {
        int i = WhenMappings.$EnumSwitchMapping$1[videoTrackType.ordinal()];
        if (i == 1) {
            return MovieSourceType.MOVIE;
        }
        if (i != 2) {
            return null;
        }
        return MovieSourceType.STREAM;
    }

    public static final VideoTrackType toVideoTrackType(MovieSourceType movieSourceType) {
        int i = WhenMappings.$EnumSwitchMapping$0[movieSourceType.ordinal()];
        if (i == 1) {
            return VideoTrackType.MOVIE;
        }
        if (i == 2) {
            return VideoTrackType.STREAM;
        }
        throw new NoWhenBranchMatchedException();
    }
}
