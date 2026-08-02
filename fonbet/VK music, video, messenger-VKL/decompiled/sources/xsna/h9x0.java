package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.newsfeed.api.data.CommentThread;
import com.vk.newsfeed.api.data.NewsComment;
import com.vkontakte.android.R;

/* compiled from: WallCommentsNegativeRepliesThreadShowMoreHolder.kt */
/* loaded from: classes4.dex */
public final class h9x0 extends aa implements View.OnClickListener {
    public final afg o;
    public final View p;
    public final ImageView q;
    public final TextView r;
    public final ProgressBar s;
    public final VkImage t;
    public boolean u;
    public final StringBuilder v;

    public h9x0(int i, ViewGroup viewGroup, afg afgVar) {
        super(viewGroup, i, 0);
        this.o = afgVar;
        this.p = this.itemView.findViewById(R.id.comments_thread_show_more_container);
        this.q = (ImageView) this.itemView.findViewById(R.id.arrow);
        this.r = (TextView) this.itemView.findViewById(R.id.loadmore_text);
        this.s = (ProgressBar) this.itemView.findViewById(R.id.loadmore_progress);
        this.t = (VkImage) this.itemView.findViewById(R.id.comments_thread_show_more_author_photo);
        this.v = new StringBuilder();
        this.itemView.setOnClickListener(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003e, code lost:
    
        if (r0 == null) goto L23;
     */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(iag iagVar) {
        String g6;
        PostAuthor postAuthor;
        PostAuthor postAuthor2;
        CommentThread commentThread;
        CommentThread commentThread2;
        bbg bbgVar;
        iag iagVar2 = iagVar;
        boolean z = this.u;
        ProgressBar progressBar = this.s;
        View view = this.p;
        if (z) {
            view.setVisibility(4);
            progressBar.setVisibility(0);
        } else {
            view.setVisibility(0);
            progressBar.setVisibility(4);
        }
        cbg cbgVar = this.n;
        boolean z2 = (cbgVar == null || (bbgVar = cbgVar.e) == null || !bbgVar.a) ? false : true;
        if (cbgVar instanceof s060) {
            g6 = ((s060) cbgVar).f.b;
            if (g6 != null) {
                if (!myc0.f(g6)) {
                    g6 = null;
                }
            }
            g6 = g6(R.string.comments_thread_show_more_hidden);
        } else if (z2) {
            g6 = g6(R.string.comments_thread_show_more);
        } else {
            int g = swe0.g(iagVar2.f4() - iagVar2.K4(), 0, 10);
            g6 = a6(R.plurals.post_comments_thread_show_more, g, Integer.valueOf(g));
        }
        StringBuilder sb = this.v;
        sb.setLength(0);
        sb.append(g6);
        boolean z3 = iagVar2 instanceof NewsComment;
        if (!z3 || (commentThread2 = ((NewsComment) iagVar2).L) == null || !commentThread2.i || (postAuthor = commentThread2.j) == null) {
            postAuthor = null;
        }
        if (postAuthor != null) {
            sb.append(" · ");
        }
        TextView textView = this.r;
        textView.setText(sb);
        boolean z4 = this.n instanceof s060;
        ImageView imageView = this.q;
        if (z4) {
            jno0.c(textView, R.attr.vk_ui_text_secondary);
            omw.d(imageView, R.drawable.vk_icon_minus_16, R.attr.vk_ui_icon_secondary);
        } else {
            jno0.c(textView, R.attr.vk_ui_icon_accent);
            omw.d(imageView, R.drawable.vk_icon_minus_16, R.attr.vk_ui_text_link);
        }
        if (!z3 || (commentThread = ((NewsComment) iagVar2).L) == null || !commentThread.i || (postAuthor2 = commentThread.j) == null) {
            postAuthor2 = null;
        }
        String a = postAuthor2 != null ? postAuthor2.a(cn70.b(14)) : null;
        VkImage vkImage = this.t;
        if (a == null || a.length() == 0) {
            bwt0.p0(vkImage, false);
        } else {
            vkImage.o0(a, null);
            bwt0.p0(vkImage, true);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onClick(View view) {
        iag iagVar;
        boolean z;
        bbg bbgVar;
        bbg bbgVar2;
        if (jjc.b() || (iagVar = (iag) this.m) == null) {
            return;
        }
        cbg cbgVar = this.n;
        if ((cbgVar == null || (bbgVar2 = cbgVar.e) == null) ? true : bbgVar2.a) {
            if (Math.max(0, iagVar.f4() - iagVar.K4()) > 0 && iagVar.f4() > 7) {
                z = true;
                afg afgVar = this.o;
                if (!z) {
                    afgVar.bi(iagVar.getId(), this.l.getContext());
                    return;
                }
                cbg cbgVar2 = this.n;
                int max = (cbgVar2 == null || (bbgVar = cbgVar2.e) == null) ? true : bbgVar.a ? Math.max(1, 7 - iagVar.K4()) : 10;
                this.u = true;
                this.p.setVisibility(4);
                this.s.setVisibility(0);
                afgVar.wb(max, iagVar);
                return;
            }
        }
        z = false;
        afg afgVar2 = this.o;
        if (!z) {
        }
    }

    @Override // xsna.aa
    public final void q6(cbg cbgVar) {
        this.u = epx.f(cbgVar.d, Boolean.TRUE);
        super.q6(cbgVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.aa
    public final void t6() {
        boolean a4 = this.o.a4(this.n);
        View view = this.itemView;
        view.setAlpha(a4 ? 1.0f : 0.4f);
        if (view instanceof c0n) {
            ((c0n) view).setTouchEnabled(a4);
        }
    }
}
