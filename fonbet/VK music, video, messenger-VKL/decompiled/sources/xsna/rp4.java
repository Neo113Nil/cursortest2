package xsna;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.music.MusicTrack;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AudioAttachment;
import com.vkontakte.android.data.PostInteract;

/* compiled from: AudioHolder.kt */
/* loaded from: classes4.dex */
public final class rp4 extends m56<AudioAttachment> implements pt4 {
    public final hc4 D;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public rp4(ViewGroup viewGroup) {
        super(r0);
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext());
        frameLayout.setId(R.id.attach);
        FrameLayout frameLayout2 = (FrameLayout) this.itemView.findViewById(R.id.attach);
        hc4 hc4Var = new hc4(viewGroup.getContext());
        this.D = hc4Var;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        int dimensionPixelOffset = this.itemView.getResources().getDimensionPixelOffset(R.dimen.post_side_padding);
        frameLayout2.addView(hc4Var, layoutParams);
        frameLayout2.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
        hc4Var.setPlayClickListener(new qp4(this, 0));
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        hc4 hc4Var = this.D;
        hc4Var.getClass();
        e6o a = s6oVar.a(hc4Var, s6oVar.e);
        hc4Var.u = a;
        hc4Var.setOnClickListener(a);
        hc4Var.i.setOnClickListener(a);
        hc4Var.j.setOnClickListener(a);
    }

    @Override // xsna.pt4
    public final void T4(q2r q2rVar) {
        hc4 hc4Var = this.D;
        hc4Var.setPostingMode(true);
        hc4Var.setRemoveButtonVisible(true);
        hc4Var.setRemoveClickListener(q2rVar);
        hc4Var.setOnLongClickListener(null);
    }

    @Override // xsna.m56
    public final void T6(AudioAttachment audioAttachment) {
        AudioAttachment audioAttachment2 = audioAttachment;
        MusicTrack musicTrack = audioAttachment2.f;
        hc4 hc4Var = this.D;
        hc4Var.setData(musicTrack);
        hc4Var.d = audioAttachment2.g;
        String str = audioAttachment2.h;
        PostInteract postInteract = audioAttachment2.i;
        hc4Var.k = str;
        hc4Var.l = postInteract;
        hc4Var.setPlayClickListener(new yg1(this, 1));
    }
}
