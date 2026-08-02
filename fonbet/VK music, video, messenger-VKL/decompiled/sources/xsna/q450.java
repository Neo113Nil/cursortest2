package xsna;

import com.vk.music.player.PlayState;
import com.vk.music.player.e;

/* compiled from: MusicRestrictionModelImpl.kt */
/* loaded from: classes.dex */
public final class q450 extends e.a {

    /* compiled from: MusicRestrictionModelImpl.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PlayState.values().length];
            try {
                iArr[PlayState.PLAYING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PlayState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.vk.music.player.e.a, com.vk.music.player.e
    public final void N3(PlayState playState, com.vk.music.player.f fVar) {
        int i = playState == null ? -1 : a.$EnumSwitchMapping$0[playState.ordinal()];
        if (i == 1) {
            com.vk.music.notifications.inapp.b.b();
            return;
        }
        if (i != 2) {
            return;
        }
        pn40 pn40Var = k840.a;
        pn40Var.getClass();
        bn40.f("MusicMessageQueue", "unsubscribe()");
        io.reactivex.rxjava3.disposables.c cVar = pn40Var.a;
        if (cVar != null) {
            cVar.dispose();
        }
        pn40Var.a = null;
        pn40Var.b.c();
    }
}
