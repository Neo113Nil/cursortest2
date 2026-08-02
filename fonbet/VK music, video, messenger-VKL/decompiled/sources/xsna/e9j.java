package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VerifyInfo;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vkontakte.android.R;

/* compiled from: ContactModel.kt */
/* loaded from: classes2.dex */
public final class e9j {
    public final Peer a;
    public final Context b;
    public final gp80 c;
    public final g3a0 d;
    public final b25 e;
    public final io.reactivex.rxjava3.subjects.d<nlq0> f;
    public final io.reactivex.rxjava3.subjects.d<Boolean> g = io.reactivex.rxjava3.subjects.d.O0(Boolean.TRUE);
    public DialogExt h;

    /* compiled from: ContactModel.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public e9j(Peer peer, Context context, gp80 gp80Var, g3a0 g3a0Var, b25 b25Var) {
        this.a = peer;
        this.b = context;
        this.c = gp80Var;
        this.d = g3a0Var;
        this.e = b25Var;
        this.f = io.reactivex.rxjava3.subjects.d.O0(new nlq0(peer.b, null, null, null, null, null, false, false, false, false, false, false, null, false, 28670));
        this.h = new DialogExt(peer.b, (ProfilesInfo) null, 2, (zcl) null);
    }

    public final void a(DialogExt dialogExt) {
        boolean z;
        boolean z2;
        this.h = dialogExt;
        ProfilesInfo profilesInfo = dialogExt.b;
        Peer peer = this.a;
        qtd0 Bb = profilesInfo.Bb(peer);
        ypp<Dialog> yppVar = dialogExt.d;
        if (yppVar.c() || Bb == null) {
            if (!yppVar.c()) {
                d(dialogExt.Cb());
            }
            if (Bb != null) {
                b(Bb);
            }
        } else {
            qtd0 Bb2 = profilesInfo.Bb(peer);
            Dialog Cb = dialogExt.Cb();
            if (Cb != null) {
                if (Cb.Gb() && !Cb.sc()) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    if (!epx.f(Cb.Zb(), new Peer.User(100L))) {
                        z2 = true;
                        z = z2;
                    }
                }
                z2 = false;
                z = z2;
            } else {
                z = false;
            }
            long longValue = Bb2.getId().longValue();
            String name = Bb2.name();
            String string = Bb2.t8() == Peer.Type.CONTACT ? this.b.getString(R.string.vkim_contact_header_subtitle) : imj0.d(this.c, Bb2);
            VerifyInfo q9 = Bb2.q9();
            String c = c(Bb2);
            String m2 = Bb2.m2();
            Dialog Cb2 = dialogExt.Cb();
            boolean z3 = Cb2 != null && Cb2.Gb();
            boolean ib = Bb2.ib();
            Dialog Cb3 = dialogExt.Cb();
            this.f.onNext(new nlq0(longValue, name, string, q9, c, m2, z3, ib, Cb3 != null && Cb3.notificationsDisabledUntil >= 0, Bb2.r5(), Bb2.C6(), Bb2.ka(), Bb2, z, 16384));
        }
        this.g.onNext(Boolean.FALSE);
    }

    public final void b(qtd0 qtd0Var) {
        this.h.b.Jb(qtd0Var);
        io.reactivex.rxjava3.subjects.d<nlq0> dVar = this.f;
        if (dVar.Q0()) {
            dVar.onNext(nlq0.a(dVar.P0(), qtd0Var.getId().longValue(), qtd0Var.name(), qtd0Var.t8() == Peer.Type.CONTACT ? this.b.getString(R.string.vkim_contact_header_subtitle) : imj0.d(this.c, qtd0Var), qtd0Var.q9(), c(qtd0Var), qtd0Var.m2(), qtd0Var.ib(), false, qtd0Var.C6(), qtd0Var.ka(), qtd0Var, 25408));
        }
    }

    public final String c(qtd0 qtd0Var) {
        return a.$EnumSwitchMapping$0[qtd0Var.t8().ordinal()] == 1 ? this.d.a(qtd0Var.c5()).toString() : qtd0Var.c5();
    }

    public final void d(Dialog dialog) {
        boolean z = !(dialog.notificationsDisabledUntil < 0);
        io.reactivex.rxjava3.subjects.d<nlq0> dVar = this.f;
        if (dVar.Q0()) {
            dVar.onNext(nlq0.a(dVar.P0(), 0L, null, null, null, null, null, false, z, false, false, null, 32511));
        }
    }
}
