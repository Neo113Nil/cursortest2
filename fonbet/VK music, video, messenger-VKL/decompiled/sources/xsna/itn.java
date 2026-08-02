package xsna;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.vk.dto.attaches.Attach;
import com.vk.dto.attaches.AttachDoc;
import com.vk.dto.common.im.Image;
import com.vk.im.engine.models.attaches.AttachChannelStub;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.views.image_zhukov.ZhukovLayout;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: DocGridAdapter.java */
/* loaded from: classes2.dex */
public final class itn extends b6y0<wr6> {
    public List<Attach> b;
    public Msg c;
    public NestedMsg d;
    public pk30 e;
    public final zuj f = new zuj();

    @Override // xsna.b6y0
    public final int a() {
        List<Attach> list = this.b;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // xsna.b6y0
    public final void b(int i, e6y0 e6y0Var) {
        Attach attach = this.b.get(i);
        if (attach instanceof AttachDoc) {
            AttachDoc attachDoc = (AttachDoc) attach;
            if (attachDoc.p.Jb()) {
                Image Ab = attachDoc.p.Ab();
                e6y0Var.a = Ab.b;
                e6y0Var.b = Ab.c;
            } else if (attachDoc.n.Jb()) {
                Image Ab2 = attachDoc.n.Ab();
                e6y0Var.a = Ab2.b;
                e6y0Var.b = Ab2.c;
            } else {
                e6y0Var.a = 0;
                e6y0Var.b = 0;
            }
        }
        if (attach instanceof AttachChannelStub) {
            AttachChannelStub attachChannelStub = (AttachChannelStub) attach;
            e6y0Var.a = attachChannelStub.d;
            e6y0Var.b = attachChannelStub.c;
        }
    }

    @Override // xsna.b6y0
    public final int c(int i) {
        if (a() <= i) {
            return 0;
        }
        return this.b.get(i) instanceof AttachChannelStub ? 6 : 3;
    }

    @Override // xsna.b6y0
    public final void d(wr6 wr6Var, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f.a(wr6Var, z, z2, z3, z4);
    }

    @Override // xsna.b6y0
    public final void e(wr6 wr6Var, int i) {
        wr6Var.b(this.c, this.d, this.b.get(i), this.e);
    }

    @Override // xsna.b6y0
    public final g6y0 f(ZhukovLayout zhukovLayout, int i) {
        return i == 6 ? new mtn(LayoutInflater.from(zhukovLayout.getContext()).inflate(R.layout.vkim_msg_part_box_doc_item, (ViewGroup) zhukovLayout, false)) : new stn(LayoutInflater.from(zhukovLayout.getContext()).inflate(R.layout.vkim_msg_part_box_doc_item, (ViewGroup) zhukovLayout, false));
    }

    public final int g(int i) {
        for (int i2 = 0; i2 < this.b.size(); i2++) {
            if (this.b.get(i2).xb() == i) {
                return i2;
            }
        }
        return -1;
    }
}
