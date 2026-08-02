package xsna;

import android.content.Context;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.im.ui.fragments.chat.ChatFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: MsgRequestHandler.kt */
/* loaded from: classes7.dex */
public final class wv30 {
    public final a1w a;
    public final DisplayNameFormatter b = new DisplayNameFormatter(null, 3, null);
    public final io.reactivex.rxjava3.disposables.b c = new io.reactivex.rxjava3.disposables.b();

    /* compiled from: MsgRequestHandler.kt */
    public static final class a {
        public final Dialog a;
        public final ProfilesInfo b;

        public a(Dialog dialog, ProfilesInfo profilesInfo) {
            this.a = dialog;
            this.b = profilesInfo;
        }
    }

    public wv30(a1w a1wVar) {
        this.a = a1wVar;
    }

    public final String a(a aVar) {
        Dialog dialog = aVar.a;
        if (dialog == null) {
            return "…";
        }
        qtd0 Bb = aVar.b.Bb(dialog.Wb());
        DisplayNameFormatter displayNameFormatter = this.b;
        displayNameFormatter.getClass();
        return displayNameFormatter.e(Bb, UserNameCase.NOM);
    }

    public final void b(Context context, long j, boolean z) {
        io.reactivex.rxjava3.internal.operators.single.y c = c(j);
        asu0.a.getClass();
        io.reactivex.rxjava3.internal.operators.single.b0 m = c.m(asu0.t());
        lz lzVar = new lz(new kdg(this, context, z, 1), 24);
        int i = kwg0.a;
        this.c.b(m.subscribe(lzVar, new jwg0("[Push]")));
    }

    public final io.reactivex.rxjava3.internal.operators.single.y c(long j) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        return this.a.E(this, new uqm(new sqm(Peer.a.b(j), Source.ACTUAL, true, (Object) null, 24))).l(new nz(new yj2(j, 1), 28));
    }

    public final boolean d(long j) {
        boolean z;
        ChatFragment.w1.getClass();
        boolean z2 = ChatFragment.y1 == j;
        Set<String> set = ule0.c;
        if (!(set instanceof Collection) || !set.isEmpty()) {
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                if (z4g.d().w(com.vk.dto.common.a.b(this.a.q()), (String) it.next())) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        return z2 || z || !com.vk.core.apps.a.b();
    }
}
