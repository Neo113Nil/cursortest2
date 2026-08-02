package xsna;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.utils.VerifyInfoHelper;
import com.vk.core.view.PhotoStripView;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.user.VisibleStatus;
import com.vk.fave.entities.FavePage;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.EventAttachment;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* compiled from: EventHolder.kt */
/* loaded from: classes4.dex */
public final class gzp extends m56<EventAttachment> implements View.OnClickListener, blc0, w8i {
    public final VKImageView D;
    public final TextView E;
    public final View F;
    public final TextView G;
    public final View H;
    public final TextView I;
    public final PhotoStripView J;
    public final TextView K;
    public final View L;
    public final View M;
    public final TextView N;
    public final View O;
    public final View P;
    public final View Q;
    public final ImageView R;
    public final View S;
    public final Object T;
    public View.OnClickListener U;
    public e6o V;
    public e6o W;

    public gzp(ViewGroup viewGroup) {
        super(R.layout.attach_event, viewGroup);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.photo);
        this.D = vKImageView;
        this.E = (TextView) this.itemView.findViewById(R.id.date);
        this.F = this.itemView.findViewById(R.id.lock);
        this.G = (TextView) this.itemView.findViewById(R.id.name);
        this.H = this.itemView.findViewById(R.id.verified);
        this.I = (TextView) this.itemView.findViewById(R.id.description);
        PhotoStripView photoStripView = (PhotoStripView) this.itemView.findViewById(R.id.photos);
        this.J = photoStripView;
        this.K = (TextView) this.itemView.findViewById(R.id.text);
        this.L = this.itemView.findViewById(R.id.footer_wrapper);
        this.M = this.itemView.findViewById(R.id.footer);
        this.N = (TextView) this.itemView.findViewById(R.id.button);
        this.O = this.itemView.findViewById(R.id.done_button);
        this.P = this.itemView.findViewById(R.id.attach_snippet_bg_remove_button);
        this.Q = this.itemView.findViewById(R.id.toggle_fave);
        this.R = (ImageView) this.itemView.findViewById(R.id.actions);
        this.S = this.itemView.findViewById(R.id.privacy_message);
        this.T = msy.a(LazyThreadSafetyMode.NONE, new s1m(this, 7));
        vKImageView.setPlaceholderImage(new ColorDrawable(dhr0.t.c(R.attr.vk_ui_image_placeholder)));
        photoStripView.setPadding(iah0.a(2.0f));
        photoStripView.setOverlapOffset(0.6666667f);
        b7();
    }

    public static ol60 Y6(NewsEntry newsEntry, EventAttachment eventAttachment) {
        return (ol60) j5g.a0(new zq70().L(0, new Pair(eventAttachment, newsEntry), null));
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        bwt0.p0(this.P, z);
        boolean z2 = !z;
        bwt0.p0(this.Q, z2);
        bwt0.p0(this.R, z2);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        ba baVar = s6oVar.e;
        this.V = s6oVar.a(this, baVar);
        View.OnClickListener onClickListener = this.U;
        if (onClickListener != null) {
            this.W = s6oVar.a(onClickListener, baVar);
        }
        b7();
    }

    @Override // xsna.m56
    public final void T6(EventAttachment eventAttachment) {
        u1c0 J0 = J0();
        ol60 ol60Var = J0 != null ? J0.h : null;
        if (ol60Var instanceof xxp) {
            xxp xxpVar = (xxp) ol60Var;
            Uri uri = xxpVar.h;
            List<Uri> list = xxpVar.y;
            boolean z = xxpVar.p;
            this.D.L0(uri, null);
            String i = xxpVar.i ? pvo0.i(false, xxpVar.j, false, false) : xxpVar.k;
            TextView textView = this.E;
            textView.setText(i);
            jno0.c(textView, xxpVar.l);
            bwt0.p0(textView, xxpVar.m);
            this.G.setText(xxpVar.n);
            Drawable h = z ? VerifyInfoHelper.h(VerifyInfoHelper.a, xxpVar.o, this.itemView.getContext(), null, 28) : null;
            View view = this.H;
            view.setBackground(h);
            bwt0.p0(view, z);
            String str = xxpVar.q;
            TextView textView2 = this.I;
            textView2.setText(str);
            bwt0.p0(textView2, xxpVar.r);
            int size = list.size();
            PhotoStripView photoStripView = this.J;
            photoStripView.setCount(size);
            int size2 = list.size();
            for (int i2 = 0; i2 < size2; i2++) {
                photoStripView.g(i2, list.get(i2));
            }
            bwt0.p0(photoStripView, xxpVar.z);
            this.K.setText(xxpVar.s);
            String str2 = xxpVar.t;
            TextView textView3 = this.N;
            textView3.setText(str2);
            bwt0.p0(textView3, xxpVar.u);
            bwt0.p0(this.O, xxpVar.v);
            bwt0.p0(this.L, xxpVar.w);
            bwt0.p0(this.M, xxpVar.x);
            bwt0.p0(this.F, xxpVar.A);
            bwt0.p0(this.S, xxpVar.B);
            X6(xxpVar);
            bwt0.p0(this.R, xxpVar.G);
        }
    }

    public final void X6(xxp xxpVar) {
        baf0 baf0Var;
        if (xxpVar.F) {
            baf0Var = dhr0.t.b(xxpVar.C, xxpVar.D);
        } else {
            baf0Var = null;
        }
        View view = this.Q;
        view.setBackground(baf0Var);
        view.setContentDescription(xxpVar.E);
        bwt0.p0(view, xxpVar.F);
    }

    public final void b7() {
        View.OnClickListener onClickListener = this.V;
        if (onClickListener == null) {
            onClickListener = this;
        }
        this.itemView.setOnClickListener(onClickListener);
        this.N.setOnClickListener(onClickListener);
        this.O.setOnClickListener(onClickListener);
        this.Q.setOnClickListener(onClickListener);
        this.R.setOnClickListener(onClickListener);
        View.OnClickListener onClickListener2 = this.U;
        if (onClickListener2 != null) {
            e6o e6oVar = this.W;
            if (e6oVar != null) {
                onClickListener2 = e6oVar;
            }
            this.P.setOnClickListener(onClickListener2);
        }
    }

    public final void c7(UserId userId, u1c0 u1c0Var, EventAttachment eventAttachment) {
        Owner owner = eventAttachment.f;
        NewsEntry q6 = q6();
        ol60 Y6 = q6 != null ? Y6(q6, eventAttachment) : null;
        u1c0Var.h = Y6;
        if (epx.f(userId, owner.b) && (Y6 instanceof xxp)) {
            xxp xxpVar = (xxp) Y6;
            X6(xxpVar);
            bwt0.p0(this.R, xxpVar.G);
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        this.U = onClickListener;
        s6o s6oVar = this.q;
        this.W = s6oVar != null ? s6oVar.a(onClickListener, s6oVar.e) : null;
        b7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        final EventAttachment eventAttachment;
        if (jjc.b() || (eventAttachment = (EventAttachment) this.C) == null) {
            return;
        }
        final Owner owner = eventAttachment.f;
        if (view.equals(this.N) || view.equals(this.O)) {
            final NewsEntry q6 = q6();
            if (q6 == 0) {
                return;
            }
            c6z c6zVar = q6 instanceof c6z ? (c6z) q6 : null;
            final String r = c6zVar != null ? c6zVar.r() : null;
            final int i = eventAttachment.i;
            final u1c0 J0 = J0();
            gd60 a = hd60.a();
            UserId userId = owner.b;
            xuo0.a.getClass();
            a.c(this.O, userId, i, xuo0.c() > ((long) eventAttachment.g), this.u, r, new izs() { // from class: xsna.dzp
                /* JADX WARN: Code restructure failed: missing block: B:4:0x000e, code lost:
                
                    if (r6 != 2) goto L8;
                 */
                /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object, kotlin.Lazy] */
                @Override // xsna.izs
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object invoke(Object obj) {
                    int i2;
                    Owner.this.g(4, true);
                    int i3 = i;
                    if (i3 != 0) {
                        i2 = 2;
                    }
                    i2 = 1;
                    EventAttachment eventAttachment2 = eventAttachment;
                    eventAttachment2.i = i2;
                    u1c0 u1c0Var = J0;
                    NewsEntry newsEntry = q6;
                    if (u1c0Var != null) {
                        u1c0Var.h = gzp.Y6(newsEntry, eventAttachment2);
                    }
                    if (i3 != 0) {
                        cvk.u(R.string.event_decision_changed, false);
                    }
                    ((p870) this.T.getValue()).e(120, eventAttachment2);
                    if (newsEntry instanceof Post) {
                        String str = com.vk.newsfeed.common.util.k.a;
                        Post post = (Post) newsEntry;
                        com.vk.newsfeed.common.util.k.l(post.n, post.m, r, "attach", true);
                    }
                    return s3q0.a;
                }
            }, new ezp(owner, eventAttachment, J0, this, q6, r, 0));
            return;
        }
        if (!view.equals(this.Q)) {
            ImageView imageView = this.R;
            if (view.equals(imageView)) {
                G6(imageView);
                return;
            } else {
                W6(view);
                return;
            }
        }
        Parcelable q62 = q6();
        c6z c6zVar2 = q62 instanceof c6z ? (c6z) q62 : null;
        String r2 = c6zVar2 != null ? c6zVar2.r() : null;
        u1c0 J02 = J0();
        boolean z = eventAttachment.j;
        xuo0.a.getClass();
        FavePage favePage = new FavePage("group", null, xuo0.c(), owner, owner.c, VisibleStatus.f, z, EmptyList.b);
        eventAttachment.j = !z;
        if (J02 != null) {
            c7(owner.b, J02, eventAttachment);
        }
        gd60.T0(hd60.a(), this.itemView.getContext(), favePage, new pqq(this.u, r2, null, null, 12), new nnc(owner, this, eventAttachment, 1), new fzp(eventAttachment, z, J02, this), 32);
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
