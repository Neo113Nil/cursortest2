package xsna;

import android.view.ViewGroup;
import com.vk.dto.music.MusicTrack;
import com.vk.music.player.PlayerTrack;
import com.vk.music.ui.bottomsheet.MusicPlayerPersistentBottomSheet;
import xsna.ec40;

/* compiled from: MusicPlayerPersistentBottomSheet.kt */
/* loaded from: classes3.dex */
public final class ey40 implements ec40.a<PlayerTrack> {
    public final /* synthetic */ MusicPlayerPersistentBottomSheet b;
    public final /* synthetic */ ViewGroup c;

    public ey40(MusicPlayerPersistentBottomSheet musicPlayerPersistentBottomSheet, ViewGroup viewGroup) {
        this.b = musicPlayerPersistentBottomSheet;
        this.c = viewGroup;
    }

    @Override // xsna.ec40.a
    public final boolean a(PlayerTrack playerTrack) {
        PlayerTrack playerTrack2 = playerTrack;
        ec40.a<MusicTrack> musicBottomSheetActionListener = this.b.getMusicBottomSheetActionListener();
        return musicBottomSheetActionListener != null && musicBottomSheetActionListener.a(playerTrack2.b);
    }

    @Override // xsna.ec40.a
    public final boolean b(ec40<PlayerTrack> ec40Var) {
        ec40.a<MusicTrack> musicBottomSheetActionListener = this.b.getMusicBottomSheetActionListener();
        if (musicBottomSheetActionListener != null) {
            int i = ec40Var.a;
            MusicTrack musicTrack = ec40Var.b.b;
            ViewGroup viewGroup = this.c;
            if (musicBottomSheetActionListener.b(new ec40<>(i, musicTrack, ec40Var.b(viewGroup.getContext()), ec40Var.a(viewGroup.getContext()), ec40Var.e, ec40Var.f, ec40Var.g, ec40Var.h, ec40Var.i, ec40Var.j))) {
                return true;
            }
        }
        return false;
    }
}
