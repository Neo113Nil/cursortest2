package xsna;

import android.content.Context;
import android.view.View;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import java.util.Collections;
import kotlin.NoWhenBranchMatchedException;
import xsna.z28;

/* compiled from: BotActionComponent.kt */
/* loaded from: classes2.dex */
public final class k28 extends j8i {
    public final Context i;
    public final iwv j;
    public final m28 k;
    public int l;

    public k28(View view, Context context, iwv iwvVar) {
        m28 m28Var = new m28(view);
        this.i = context;
        this.j = iwvVar;
        this.k = m28Var;
    }

    @Override // xsna.j8i
    public final void N0() {
        this.k.h.removeCallbacksAndMessages(null);
    }

    public final void X0(f280 f280Var) {
        String str;
        ProfilesInfo profilesInfo = f280Var.e;
        long j = f280Var.b;
        z28 z28Var = f280Var.d;
        if (z28Var instanceof z28.d) {
            long j2 = f280Var.c;
            final String str2 = ((z28.d) z28Var).a;
            final int i = this.l;
            this.l = i + 1;
            final boolean z = j2 != j;
            final qtd0 Cb = profilesInfo.Cb(Long.valueOf(j2));
            final m28 m28Var = this.k;
            if (m28Var.c) {
                j38 j38Var = m28Var.e;
                j38Var.getClass();
                j38Var.setItems(j5g.u0(j38Var.d, Collections.singletonList(new g8k0(i, str2, z, Cb))));
                j38Var.notifyItemInserted(0);
            } else {
                m28Var.a();
                View view = m28Var.d;
                (view != null ? view : null).post(new Runnable() { // from class: xsna.l28
                    @Override // java.lang.Runnable
                    public final void run() {
                        j38 j38Var2 = m28.this.e;
                        j38Var2.getClass();
                        j38Var2.setItems(j5g.u0(j38Var2.d, Collections.singletonList(new g8k0(i, str2, z, Cb))));
                        j38Var2.notifyItemInserted(0);
                    }
                });
            }
            m28Var.h.sendEmptyMessageDelayed(i, 10000L);
            return;
        }
        boolean z2 = z28Var instanceof z28.b;
        iwv iwvVar = this.j;
        Context context = this.i;
        if (z2) {
            z28.b bVar = (z28.b) z28Var;
            int i2 = bVar.a;
            String str3 = bVar.c;
            Peer peer = bVar.b;
            iwv.f(iwvVar, context, i2, str3, "bot_keyboard", peer != null ? Long.valueOf(peer.b).toString() : null, null, 32);
            return;
        }
        if (z28Var instanceof z28.a) {
            iwvVar.b(context, ((z28.a) z28Var).a);
            return;
        }
        if (!(z28Var instanceof z28.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!mbw.a.a()) {
            iwvVar.b(context, ((z28.c) z28Var).a);
            return;
        }
        qtd0 Cb2 = profilesInfo.Cb(Long.valueOf(j));
        if (Cb2 == null || (str = Cb2.name()) == null) {
            str = "";
        }
        new kix0(context, str, ((z28.c) z28Var).a).a();
    }
}
