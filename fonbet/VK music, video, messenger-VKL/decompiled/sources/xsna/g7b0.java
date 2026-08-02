package xsna;

import com.vk.libvideo.bottomsheet.VideoPlaylistBottomSheet;
import com.vk.libvideo.bottomsheet.videoplaylist.VideoPlaylistBottomSheetRedesign;

/* compiled from: PlaylistBottomSheetActionTracker.kt */
/* loaded from: classes6.dex */
public final class g7b0 {
    public final s0a a;

    /* compiled from: PlaylistBottomSheetActionTracker.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[VideoPlaylistBottomSheet.Action.values().length];
            try {
                iArr[VideoPlaylistBottomSheet.Action.ShowAuthor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[VideoPlaylistBottomSheet.Action.CopyLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[VideoPlaylistBottomSheet.Action.Share.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[VideoPlaylistBottomSheetRedesign.Action.values().length];
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.ShowAuthor.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.CopyLink.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[VideoPlaylistBottomSheetRedesign.Action.Share.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public g7b0(s0a s0aVar) {
        this.a = s0aVar;
    }
}
