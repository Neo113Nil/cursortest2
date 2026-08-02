package xsna;

import android.app.Activity;
import android.content.ContextWrapper;
import com.vk.music.player.api.BottomPlayerAppearance;
import com.vk.music.player.api.PlayerBottomSheetStateHolder;
import kotlin.NoWhenBranchMatchedException;
import xsna.k840;

/* compiled from: VkMusicGlobalEventManager.kt */
/* loaded from: classes.dex */
public final class w5v0 {
    public final PlayerBottomSheetStateHolder a;
    public final fat b;
    public final bpn0 c;
    public final bpn0 d;
    public final u750 e;

    /* compiled from: VkMusicGlobalEventManager.kt */
    /* loaded from: classes3.dex */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BottomPlayerAppearance.values().length];
            try {
                iArr[BottomPlayerAppearance.COMPACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BottomPlayerAppearance.LARGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public w5v0(PlayerBottomSheetStateHolder playerBottomSheetStateHolder, fat fatVar) {
        this.a = playerBottomSheetStateHolder;
        this.b = fatVar;
        io.reactivex.rxjava3.disposables.b bVar = new io.reactivex.rxjava3.disposables.b();
        this.c = new bpn0(new k03(21));
        this.d = new bpn0(new l03(18));
        s750 s750Var = k840.a.e;
        this.e = s750Var == null ? null : s750Var;
        r5v0 r5v0Var = k840.a.h;
        bVar.b((r5v0Var != null ? r5v0Var : null).a.a.a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new b2e(new v5v0(1, this, w5v0.class, "onMusicEvent", "onMusicEvent(Lcom/vk/music/events/MusicEvent;)V", 0), 1)));
    }

    public final int a() {
        float f;
        if (this.a.getState() == PlayerBottomSheetStateHolder.State.STATE_EXPANDED) {
            return 0;
        }
        int i = a.$EnumSwitchMapping$0[((BottomPlayerAppearance) this.b.invoke()).ordinal()];
        if (i == 1) {
            f = bw40.c;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = bw40.d;
        }
        return (int) (cn70.a() * f);
    }

    public final w7k0 b() {
        return (w7k0) this.c.getValue();
    }

    public final ContextWrapper c() {
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b != null) {
            return this.a.getState() == PlayerBottomSheetStateHolder.State.STATE_EXPANDED ? bwt0.u(b) : b;
        }
        return null;
    }
}
