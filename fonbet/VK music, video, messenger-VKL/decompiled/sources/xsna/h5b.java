package xsna;

import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.ui.components.msg_view.header.MsgViewHeaderComponent;
import com.vk.im.ui.fragments.chat.ChatFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class h5b implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h5b(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        ChatSettings Hb;
        switch (this.b) {
            case 0:
                i5b i5bVar = (i5b) this.d;
                i5bVar.r.e = true;
                if (this.c) {
                    i5bVar.Y0().c();
                }
                break;
            case 1:
                ChatFragment.k kVar = ((kz30) this.d).K;
                if (kVar == null) {
                    kVar = null;
                }
                kVar.h(this.c);
                break;
            default:
                MsgViewHeaderComponent msgViewHeaderComponent = (MsgViewHeaderComponent) this.d;
                Dialog Cb = msgViewHeaderComponent.j.Cb();
                boolean z = this.c;
                if (Cb != null) {
                    Cb.pd(z);
                }
                m140 m140Var = msgViewHeaderComponent.m;
                if (m140Var == null) {
                    m140Var = null;
                }
                boolean z2 = (Cb == null || (Hb = Cb.Hb()) == null) ? false : Hb.q;
                m140Var.e = z;
                m140Var.f = z2;
                break;
        }
        return s3q0.a;
    }
}
