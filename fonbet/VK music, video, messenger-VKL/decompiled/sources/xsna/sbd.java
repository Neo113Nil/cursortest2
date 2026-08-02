package xsna;

import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.clips.tool.view.newsfeed.overlay.ClipEndOverlayView;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.ClipVideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.feed.design.view.newsfeed.clips.ClipRepostView;
import com.vk.newsfeed.common.recycler.holders.clips.ClipActionButtonStateRepository;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.qi6;

/* compiled from: ClipRepostHolder.kt */
/* loaded from: classes4.dex */
public final class sbd extends rp6<tbd, Post> implements ent0, i7o, cui, qfd {
    public static final /* synthetic */ int I = 0;
    public final ClipRepostView E;
    public final cfd F;
    public ClipVideoFile G;
    public Post H;

    public sbd(ViewGroup viewGroup, h170 h170Var, zof zofVar, ClipActionButtonStateRepository clipActionButtonStateRepository) {
        super(R.layout.clip_repost_holder, viewGroup);
        FrameLayout frameLayout = (FrameLayout) this.itemView.findViewById(R.id.clip_repost_container);
        ClipRepostView clipRepostView = (ClipRepostView) this.itemView.findViewById(R.id.clip_repost_view);
        this.E = clipRepostView;
        cfd cfdVar = new cfd(frameLayout, new p8d(this.itemView.getContext(), g620.f().a(), zofVar, new rbd(this, sbd.class, "displayContext", "getDisplayContext()Lcom/vk/newsfeed/presentation/model/PostDisplayContext;", 0), clipActionButtonStateRepository, false), null, null, h170Var, 60);
        this.F = cfdVar;
        viewGroup.getContext();
        frameLayout.addView(cfdVar.itemView, 0);
        clipRepostView.setOnClickListener(new z00(this, 2));
        y6 y6Var = new y6(this, 17);
        ClipEndOverlayView clipEndOverlayView = cfdVar.L0;
        clipEndOverlayView.m.add(y6Var);
        clipEndOverlayView.n.add(new rj1(this, 20));
    }

    @Override // xsna.qfd
    public final View F1() {
        return this.F.X;
    }

    @Override // xsna.qfd
    public final boolean J5() {
        return this.F.K7();
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        this.F.Q6(s6oVar);
    }

    @Override // xsna.rp6
    public final /* bridge */ /* synthetic */ void R6(tbd tbdVar) {
    }

    @Override // xsna.rp6
    public final void U6(Post post) {
        super.U6(post);
        u1c0 J0 = J0();
        if (J0 == null) {
            return;
        }
        r74 r74Var = J0 instanceof r74 ? (r74) J0 : null;
        Attachment attachment = r74Var != null ? r74Var.q : null;
        VideoAttachment videoAttachment = attachment instanceof VideoAttachment ? (VideoAttachment) attachment : null;
        Parcelable parcelable = videoAttachment != null ? videoAttachment.k : null;
        this.G = parcelable instanceof ClipVideoFile ? (ClipVideoFile) parcelable : null;
        this.H = di60.R(J0.a);
        this.F.J7(J0, b7(), J0.l);
        ClipVideoFile clipVideoFile = this.G;
        if (clipVideoFile == null) {
            return;
        }
        boolean b7 = b7();
        ClipRepostView clipRepostView = this.E;
        if (!b7) {
            clipRepostView.setVisibility(8);
            return;
        }
        clipRepostView.setVisibility(0);
        clipRepostView.setOwnerName(clipVideoFile.p0);
        clipRepostView.setOwnerVerified(di60.A(clipVideoFile.o0));
    }

    @Override // xsna.qfd
    public final String W0() {
        return this.F.W0();
    }

    public final boolean b7() {
        Owner owner;
        Owner owner2;
        ClipVideoFile clipVideoFile = this.G;
        UserId userId = null;
        UserId userId2 = (clipVideoFile == null || (owner2 = clipVideoFile.v0) == null) ? null : owner2.b;
        Post post = this.H;
        if (post != null && (owner = post.o) != null) {
            userId = owner.b;
        }
        return !epx.f(userId2, userId);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.F.L;
    }

    @Override // xsna.cui
    public final void q5(s980 s980Var, qi6.b bVar) {
        cfd cfdVar = this.F;
        cfdVar.y = s980Var;
        if (s980Var != null) {
            cfdVar.D = s980Var;
        }
        cfdVar.A = bVar;
    }
}
