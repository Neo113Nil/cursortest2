package xsna;

import com.vk.dto.common.Direction;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.messages.PinnedMsg;
import java.util.Collections;

/* compiled from: MsgListStateProcessor.kt */
/* loaded from: classes2.dex */
public final class zl30 {
    public final il30 a;
    public final yh1 b;
    public final nz c;
    public final tk30 d;
    public volatile int e;

    /* compiled from: MsgListStateProcessor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.BEFORE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.AFTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zl30(il30 il30Var, yh1 yh1Var, nz nzVar, v1o v1oVar) {
        this.a = il30Var;
        this.b = yh1Var;
        this.c = nzVar;
        b1y b1yVar = new b1y(Collections.singletonList(new ebx(this, 8)), 6);
        u90 u90Var = il30Var.b;
        this.d = new tk30(new com.vk.movika.sdk.android.defaultplayer.layout.a(u90Var.B().getApplicationContext()), null, new tz30(u90Var.B().getApplicationContext()), new com.vk.im.ui.formatters.a(u90Var.B().getApplicationContext()), b1yVar, v1oVar, null, 902);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Dialog dialog) {
        boolean z;
        a1w a1wVar = this.a.c;
        boolean tc = dialog.tc();
        tk30 tk30Var = this.d;
        tk30Var.A(tc);
        tk30Var.B(dialog.uc());
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, dialog.Hb(), false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -2049, 1073741823));
        tk30Var.z(dialog.sc());
        tk30Var.t(jgm.a(dialog));
        tk30Var.H(Integer.valueOf(dialog.gc()));
        if (dialog.T8()) {
            zdw zdwVar = i7o0.b;
            if (zdwVar == null) {
                zdwVar = null;
            }
            if (zdwVar.e() != null) {
                z = true;
                tk30Var.G(z);
                a1wVar.q().getClass();
                Peer.Type type = Peer.Type.GROUP;
                tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, !r2.Ab(type), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, 1073741823));
                a1wVar.q().getClass();
                tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, !r1.Ab(type), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, 1073741823));
                tk30Var.w(dialog.Zb());
                tk30Var.y(dialog.Jb());
                tk30Var.J(dialog.mc());
                tk30Var.u(dialog.Gb());
                tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, dialog.Ib(), false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435457, 1073741823));
                tk30Var.D(dialog.Xb().k());
                PinnedMsg dc = dialog.dc();
                tk30Var.E(dc != null ? Integer.valueOf(dc.c) : null);
            }
        }
        z = false;
        tk30Var.G(z);
        a1wVar.q().getClass();
        Peer.Type type2 = Peer.Type.GROUP;
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, !r2.Ab(type2), false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1073741825, 1073741823));
        a1wVar.q().getClass();
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, !r1.Ab(type2), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, Integer.MAX_VALUE, 1073741823));
        tk30Var.w(dialog.Zb());
        tk30Var.y(dialog.Jb());
        tk30Var.J(dialog.mc());
        tk30Var.u(dialog.Gb());
        tk30Var.s(uk30.d(tk30Var.d, null, null, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, dialog.Ib(), false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -268435457, 1073741823));
        tk30Var.D(dialog.Xb().k());
        PinnedMsg dc2 = dialog.dc();
        tk30Var.E(dc2 != null ? Integer.valueOf(dc2.c) : null);
    }
}
