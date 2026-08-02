package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: VideoHolder.kt */
/* loaded from: classes4.dex */
public class lps0 extends de6<vns0> implements blc0 {
    public final com.vk.newsfeed.common.recycler.holders.i k;
    public final boolean l;
    public final boolean m;
    public final nwf0 n;
    public x64 o;

    /* compiled from: VideoHolder.kt */
    public static final class a {
        public static lps0 a(ViewGroup viewGroup, boolean z) {
            return new lps0(new com.vk.newsfeed.common.recycler.holders.i(viewGroup, z), 1, false, true);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public lps0(com.vk.newsfeed.common.recycler.holders.i iVar, int i, boolean z, boolean z2) {
        super(r0, i);
        View view = iVar.itemView;
        this.k = iVar;
        this.l = z;
        this.m = z2;
        this.n = new nwf0((ViewGroup) view.findViewById(R.id.video_wrap), new cnw(this, 9));
        s6o s6oVar = this.g;
        if (s6oVar != null) {
            iVar.Q6(s6oVar);
        }
        if (z || z2) {
            iVar.a0 = this;
            s6o s6oVar2 = iVar.q;
            if (s6oVar2 != null) {
                iVar.b0 = s6oVar2.a(this, s6oVar2.e);
            }
            iVar.o7();
        }
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        this.n.a(z);
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
        this.o = x64Var;
    }

    @Override // xsna.de6
    public void b(Attachment attachment) {
        if (attachment instanceof VideoAttachment) {
            com.vk.newsfeed.common.recycler.holders.i iVar = this.k;
            iVar.Y = false;
            iVar.b7(attachment);
        }
    }

    @Override // xsna.de6
    public final void d(s6o s6oVar) {
        super.d(s6oVar);
        s6o s6oVar2 = this.g;
        com.vk.newsfeed.common.recycler.holders.i iVar = this.k;
        if (s6oVar2 != null) {
            iVar.Q6(s6oVar2);
        }
        if (this.l || this.m) {
            iVar.a0 = this;
            s6o s6oVar3 = iVar.q;
            if (s6oVar3 != null) {
                iVar.b0 = s6oVar3.a(this, s6oVar3.e);
            }
            iVar.o7();
        }
    }

    @Override // xsna.de6
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void c(vns0 vns0Var) {
        com.vk.newsfeed.common.recycler.holders.i iVar = this.k;
        iVar.Y = false;
        iVar.V5(vns0Var.e);
    }

    @Override // xsna.de6, android.view.View.OnClickListener
    public final void onClick(View view) {
        x64 x64Var = this.o;
        if (x64Var != null) {
            x64Var.a(this.d);
            return;
        }
        if (this.m) {
            this.k.onClick(view);
        }
        super.onClick(view);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    public void j1(View.OnClickListener onClickListener) {
    }
}
