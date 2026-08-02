package xsna;

import android.os.Parcelable;
import android.view.View;
import android.widget.FrameLayout;
import com.vk.dto.common.Attachment;
import com.vk.pending.PendingVideoAttachment;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;

/* compiled from: PostingHolders.kt */
/* loaded from: classes4.dex */
public final class ev90 extends lps0 implements zu90 {
    public final av90 p;

    public ev90(com.vk.newsfeed.common.recycler.holders.i iVar) {
        super(iVar, 7, true, false);
        av90 av90Var = new av90((FrameLayout) this.b.findViewById(R.id.video_wrap));
        av90Var.c(true);
        av90Var.b.setOnClickListener(new b6u(1, av90Var, new sg0(this, 14)));
        av90Var.a.setOnClickListener(new cnw(this, 4));
        this.p = av90Var;
    }

    @Override // xsna.zu90
    public final int S() {
        Parcelable parcelable = this.d;
        ju90 ju90Var = parcelable instanceof ju90 ? (ju90) parcelable : null;
        if (ju90Var != null) {
            return ju90Var.S();
        }
        return 0;
    }

    @Override // xsna.zu90
    public final void Y2(boolean z) {
        this.p.c(false);
    }

    @Override // xsna.lps0, xsna.de6
    public final void b(Attachment attachment) {
        com.vk.newsfeed.common.recycler.holders.i iVar = this.k;
        iVar.Y = false;
        if (attachment instanceof PendingVideoAttachment) {
            iVar.b7(attachment);
            iVar.s7(false);
        } else if (attachment instanceof VideoAttachment) {
            iVar.s7(true);
        }
    }

    @Override // xsna.lps0, xsna.de6
    /* renamed from: e */
    public final void c(vns0 vns0Var) {
        com.vk.newsfeed.common.recycler.holders.i iVar = this.k;
        iVar.Y = false;
        VideoAttachment videoAttachment = vns0Var.f;
        if (!(videoAttachment instanceof PendingVideoAttachment)) {
            iVar.s7(true);
        } else {
            iVar.b7(videoAttachment);
            iVar.s7(false);
        }
    }

    @Override // xsna.zu90
    public final void f3(int i, int i2) {
        this.p.b(i, i2);
    }

    @Override // xsna.zu90
    public final void i4(boolean z) {
        this.p.a(true);
    }

    @Override // xsna.lps0, xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.p.a.setOnClickListener(onClickListener);
    }
}
