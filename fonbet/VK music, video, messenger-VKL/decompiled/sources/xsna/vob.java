package xsna;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.vk.audio.AudioMsgTrackByRecord;
import com.vk.dto.common.Attachment;
import com.vk.im.ui.components.dialog_header.DialogHeaderController;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.writebar.WriteBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: ChatClipsOnboardingFactory.kt */
/* loaded from: classes2.dex */
public final class vob implements x8l, ppf, s0y0, del0, mlo {
    public final Object b;

    public /* synthetic */ vob(Object obj) {
        this.b = obj;
    }

    @Override // xsna.del0
    public ydl0 a(Context context, gel0 gel0Var, df0 df0Var) {
        Object obj;
        Iterator it = ((ArrayList) this.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((iel0) obj).b(gel0Var)) {
                break;
            }
        }
        iel0 iel0Var = (iel0) obj;
        if (iel0Var != null) {
            return iel0Var.a(context, gel0Var, df0Var);
        }
        return null;
    }

    @Override // xsna.mlo
    public void b(izs izsVar) {
        ((pb7) this.b).c(izsVar);
    }

    @Override // xsna.s0y0
    public void f() {
        WriteBar writeBar = ((kz30) this.b).t;
        if (writeBar == null) {
            writeBar = null;
        }
        writeBar.I();
    }

    @Override // xsna.s0y0
    public void g() {
        kz30 kz30Var = (kz30) this.b;
        kz30Var.E();
        xq4 xq4Var = xq4.C;
        AudioMsgTrackByRecord audioMsgTrackByRecord = xq4Var != null ? (AudioMsgTrackByRecord) xq4Var.c.get(Long.valueOf(kz30Var.e)) : null;
        ChatFragment.k kVar = kz30Var.K;
        if (kVar == null) {
            kVar = null;
        }
        boolean z = audioMsgTrackByRecord != null;
        ChatFragment chatFragment = ChatFragment.this;
        DialogHeaderController dialogHeaderController = chatFragment.K0;
        if (dialogHeaderController == null) {
            dialogHeaderController = null;
        }
        boolean z2 = !z;
        mem memVar = dialogHeaderController.h;
        memVar.r.i = z2;
        memVar.b1();
        DialogHeaderController dialogHeaderController2 = chatFragment.K0;
        if (dialogHeaderController2 == null) {
            dialogHeaderController2 = null;
        }
        mem memVar2 = dialogHeaderController2.h;
        memVar2.r.g = z2;
        memVar2.b1();
        DialogHeaderController dialogHeaderController3 = chatFragment.K0;
        if (dialogHeaderController3 == null) {
            dialogHeaderController3 = null;
        }
        mem memVar3 = dialogHeaderController3.h;
        memVar3.r.h = z2;
        memVar3.b1();
        com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
        (aVar == null ? null : aVar).r = z2;
        (aVar != null ? aVar : null).q = z2;
    }

    @Override // xsna.ppf
    public npf h() {
        return (npf) this.b;
    }

    @Override // xsna.s0y0
    public boolean i(Attachment attachment) {
        kz30 kz30Var = (kz30) this.b;
        return !kz30Var.r && kz30Var.V(attachment, ly30.f);
    }

    @Override // xsna.x8l
    public w8l j() {
        return new eob((wob) this.b);
    }

    public void k(gzs gzsVar) {
        Looper myLooper = Looper.myLooper();
        Handler handler = (Handler) this.b;
        if (epx.f(myLooper, handler.getLooper())) {
            gzsVar.invoke();
        } else {
            handler.post(new b04(gzsVar, 14));
        }
    }

    public vob(Looper looper) {
        if (looper == null && (looper = Looper.myLooper()) == null) {
            looper = Looper.getMainLooper();
        }
        this.b = new Handler(looper);
    }

    public vob() {
        new pb7();
        this.b = new pb7();
    }

    public vob(zs50 zs50Var) {
        this.b = e43.o(zs50Var);
    }

    @Override // xsna.s0y0
    public void e() {
    }

    @Override // xsna.s0y0
    public void c(List list, List list2) {
    }
}
