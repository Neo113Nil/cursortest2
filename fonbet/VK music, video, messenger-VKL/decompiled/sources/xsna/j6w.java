package xsna;

import android.view.MotionEvent;
import com.vk.channels.api.Channel;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.stories.ImStoryState;
import com.vk.im.ui.components.dialogs_list.InfoModalBottomSheet;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import xsna.i6w;
import xsna.l6w;
import xsna.u8m;
import xsna.v6w;

/* compiled from: ImItemListMviActor.kt */
/* loaded from: classes2.dex */
public final class j6w extends al50<o6w, i6w, on50, v6w, m6w, l6w> {

    /* compiled from: ImItemListMviActor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfoBar.Style.values().length];
            try {
                iArr[InfoBar.Style.OUTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBar.Style.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoBar.ButtonType.values().length];
            try {
                iArr2[InfoBar.ButtonType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InfoBar.ButtonType.GIFTS_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InfoBar.ButtonType.CALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InfoBar.ButtonType.OPEN_MSG_PUSH_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InfoBar.ButtonType.SYNC_CONTACTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InfoBar.ButtonType.CALLS_PRIVACY.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InfoBar.ButtonType.POPUP.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public j6w() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v75 */
    /* JADX WARN: Type inference failed for: r0v76 */
    /* JADX WARN: Type inference failed for: r0v79, types: [java.lang.Object] */
    @Override // xsna.qj50
    public final void p(lj50 lj50Var) {
        int i;
        Channel channel;
        i6w i6wVar = (i6w) lj50Var;
        if (i6wVar.equals(i6w.a.b)) {
            a(v6w.e.b);
            return;
        }
        boolean z = i6wVar instanceof i6w.i;
        sj50 sj50Var = this.b;
        if (z) {
            i6w.i iVar = (i6w.i) i6wVar;
            Peer peer = iVar.b;
            L l = L.a;
            l.getClass();
            LoggerOutputTarget loggerOutputTarget = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget)) {
                L.u(l, L.LogType.d, new Object[]{yq.b(peer, "ImItemList.Debug Actor: OnDialogClick received, peer=")});
            }
            Dialog c = ((o6w) sj50Var.getCurrentState()).c(peer);
            if (c == null) {
                L.F(new xk(17, iVar, this));
                return;
            }
            com.vk.im.engine.models.dialogs.c ic = c.ic();
            l6w.a.g gVar = new l6w.a.g(c.Zb(), ic, c.Jb(), FolderType.DEFAULT);
            a(new v6w.b.a(ic));
            c(l6w.b.C3237b.a);
            c(gVar);
            if (L.m(loggerOutputTarget)) {
                return;
            }
            L.u(l, L.LogType.d, new Object[]{yq.b(peer, "ImItemList.Debug Actor: Navigation.OpenDialog sent, peer=")});
            return;
        }
        if (i6wVar instanceof i6w.j) {
            Dialog c2 = ((o6w) sj50Var.getCurrentState()).c(((i6w.j) i6wVar).b);
            if (c2 == null) {
                return;
            }
            c(new l6w.b.d(new DialogExt(c2, ((o6w) sj50Var.getCurrentState()).c.c)));
            return;
        }
        if (i6wVar instanceof i6w.c) {
            long j = ((i6w.c) i6wVar).b;
            L l2 = L.a;
            l2.getClass();
            LoggerOutputTarget loggerOutputTarget2 = LoggerOutputTarget.NONE;
            if (!L.m(loggerOutputTarget2)) {
                L.u(l2, L.LogType.d, new Object[]{defpackage.k0.a(j, "ImItemList.Debug Actor: OnChannelClick received, channelId=")});
            }
            c(new l6w.a.b(j));
            if (L.m(loggerOutputTarget2)) {
                return;
            }
            L.u(l2, L.LogType.d, new Object[]{"ImItemList.Debug Actor: Navigation.OpenChannel sent"});
            return;
        }
        if (i6wVar instanceof i6w.d) {
            o6w o6wVar = (o6w) sj50Var.getCurrentState();
            long j2 = ((i6w.d) i6wVar).b;
            Iterator it = o6wVar.c.b.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    channel = 0;
                    break;
                }
                channel = it.next();
                a5w a5wVar = (a5w) channel;
                if ((a5wVar instanceof Channel) && ((Channel) a5wVar).b == j2) {
                    break;
                }
            }
            Channel channel2 = channel instanceof Channel ? channel : null;
            if (channel2 == null || channel2.n) {
                return;
            }
            ImFeatures imFeatures = ImFeatures.ALL_FOLDER_HIDE_CHANNELS;
            imFeatures.getClass();
            c(new l6w.b.c(channel2.b, agb.a(channel2, true, true, com.vk.toggle.b.A.a(imFeatures))));
            return;
        }
        if (i6wVar instanceof i6w.u) {
            c(l6w.a.f.a);
            return;
        }
        if (i6wVar instanceof i6w.b0) {
            c(l6w.b.f.a);
            return;
        }
        if (i6wVar instanceof i6w.m) {
            c(l6w.b.n.a);
            return;
        }
        if (i6wVar instanceof i6w.b) {
            i6w.b bVar = (i6w.b) i6wVar;
            u8m u8mVar = bVar.c;
            long j3 = bVar.b;
            if (u8mVar.equals(u8m.c.b)) {
                a(new v6w.a.C3870a(j3));
                return;
            }
            if (u8mVar.equals(u8m.f0.b)) {
                a(new v6w.a.f(j3));
                return;
            }
            if (u8mVar.equals(u8m.g0.b)) {
                a(new v6w.a.g(j3));
                return;
            }
            if (u8mVar.equals(u8m.c0.b)) {
                c(new l6w.b.m(j3));
                return;
            }
            if (u8mVar.equals(u8m.o.b)) {
                c(new l6w.a.d(j3));
                return;
            }
            if (u8mVar.equals(u8m.s.b)) {
                c(new l6w.b.j(j3));
                return;
            }
            if (u8mVar.equals(u8m.d0.b)) {
                a(new v6w.a.e(j3));
                return;
            }
            if (u8mVar.equals(u8m.m0.b)) {
                a(new v6w.a.h(j3));
                return;
            } else if (u8mVar.equals(u8m.u0.b)) {
                a(new v6w.a.k(j3));
                return;
            } else {
                if (u8mVar.equals(u8m.z.b)) {
                    a(new v6w.a.c(j3));
                    return;
                }
                return;
            }
        }
        if (i6wVar instanceof i6w.h) {
            a(new v6w.a.b(((i6w.h) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.t) {
            a(new v6w.a.d(((i6w.t) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.w) {
            a(new v6w.a.i(((i6w.w) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.a0) {
            a(new v6w.a.j(((i6w.a0) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.o) {
            i6w.o oVar = (i6w.o) i6wVar;
            InfoBar.Button button = oVar.c;
            InfoBar infoBar = oVar.b;
            InfoBar.ButtonType buttonType = button.d;
            boolean z2 = button.h;
            switch (a.$EnumSwitchMapping$1[buttonType.ordinal()]) {
                case 1:
                case 2:
                    c(new l6w.a.k(button.f));
                    if (z2) {
                        a(new v6w.c.C3871c(infoBar.b));
                        return;
                    }
                    return;
                case 3:
                    a(new v6w.c.a(infoBar.b, button.g, z2));
                    return;
                case 4:
                    c(l6w.a.l.a);
                    a(new v6w.c.C3871c(infoBar.b));
                    return;
                case 5:
                    c(l6w.b.e.a);
                    return;
                case 6:
                    c(l6w.a.C3236a.a);
                    a(new v6w.c.C3871c(infoBar.b));
                    return;
                case 7:
                    InfoBar.PopUp popUp = button.i;
                    if (popUp == null) {
                        return;
                    }
                    int i2 = a.$EnumSwitchMapping$0[popUp.b.ordinal()];
                    if (i2 == 1) {
                        i = R.drawable.vk_icon_illustration_exceeding_limit_120h;
                    } else {
                        if (i2 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i = R.drawable.vk_icon_illustration_comments_120h;
                    }
                    c(new l6w.a.j(new InfoModalBottomSheet.Params(i, popUp.c, popUp.d, popUp.e)));
                    return;
                default:
                    return;
            }
        }
        if (i6wVar instanceof i6w.n) {
            c(new l6w.a.k(((i6w.n) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.p) {
            c(new l6w.a.i(((i6w.p) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.q) {
            a(new v6w.c.b(((i6w.q) i6wVar).b.b));
            return;
        }
        if (i6wVar instanceof i6w.r) {
            c(new l6w.a.h(((i6w.r) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.f) {
            a(v6w.f.b);
            return;
        }
        if (i6wVar instanceof i6w.l) {
            i6w.l lVar = (i6w.l) i6wVar;
            Dialog c3 = ((o6w) sj50Var.getCurrentState()).c(lVar.b);
            if (c3 == null) {
                return;
            }
            DialogExt dialogExt = new DialogExt(c3, ((o6w) sj50Var.getCurrentState()).c.c);
            io.reactivex.rxjava3.core.q<MotionEvent> qVar = lVar.c;
            e4t e4tVar = new e4t(new qm0(26), 3);
            qVar.getClass();
            c(new l6w.b.k(dialogExt, new io.reactivex.rxjava3.internal.operators.observable.i0(qVar, e4tVar)));
            return;
        }
        if (i6wVar instanceof i6w.k) {
            c(l6w.b.C3237b.a);
            return;
        }
        if (i6wVar instanceof i6w.v) {
            i6w.v vVar = (i6w.v) i6wVar;
            u8m b = ajm.b(vVar.c);
            if (b == null) {
                return;
            }
            c(new l6w.b.a(vVar.b, b));
            return;
        }
        if (i6wVar instanceof i6w.x) {
            i6w.x xVar = (i6w.x) i6wVar;
            qtd0 Bb = ((o6w) sj50Var.getCurrentState()).c.c.Bb(xVar.b);
            if (Bb == null) {
                return;
            }
            c(new l6w.a.m(Bb, xVar.c == ImStoryState.NEW, xVar.d));
            return;
        }
        if (i6wVar instanceof i6w.e) {
            i6w.e eVar = (i6w.e) i6wVar;
            qtd0 Cb = ((o6w) sj50Var.getCurrentState()).c.c.Cb(Long.valueOf(eVar.b));
            if (Cb == null) {
                return;
            }
            c(new l6w.a.m(Cb, eVar.c == ImStoryState.NEW, eVar.d));
            return;
        }
        if (i6wVar instanceof i6w.c0) {
            a(new v6w.h(((i6w.c0) i6wVar).b));
            return;
        }
        if (i6wVar instanceof i6w.g) {
            c(new l6w.a.c(((o6w) sj50Var.getCurrentState()).b));
        } else if (i6wVar instanceof i6w.y) {
            c(l6w.b.e.a);
        } else if (i6wVar instanceof i6w.z) {
            c(l6w.a.e.a);
        }
    }
}
