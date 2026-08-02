package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.ImageView;
import com.vk.core.view.components.picture.VkImage;
import com.vk.dto.newsfeed.PostAuthor;
import com.vk.newsfeed.api.data.NewsComment;
import com.vkontakte.android.R;
import java.util.Set;
import xsna.rdg;

/* compiled from: AuthorLikedViewHolder.kt */
/* loaded from: classes4.dex */
public final class xb5 implements View.OnClickListener {
    public final View b;
    public final ib6 c;
    public final afg d;
    public final VkImage e;
    public final View f;
    public final ImageView g;
    public iag h;

    public xb5(View view, ib6 ib6Var, afg afgVar) {
        this.b = view;
        this.c = ib6Var;
        this.d = afgVar;
        VkImage vkImage = (VkImage) view.findViewById(R.id.comment_author_liked_photo);
        this.e = vkImage;
        View findViewById = view.findViewById(R.id.comment_author_liked_cutout);
        this.f = findViewById;
        ImageView imageView = (ImageView) view.findViewById(R.id.comment_author_liked_icon);
        this.g = imageView;
        view.setOnClickListener(this);
        view.setImportantForAccessibility(1);
        findViewById.setClickable(false);
        imageView.setClickable(false);
        vkImage.setClickable(false);
        StateListDrawable stateListDrawable = new StateListDrawable();
        int[] iArr = {android.R.attr.state_selected};
        Drawable a = m33.a(R.drawable.vk_icon_like_16, imageView.getContext());
        abg0 abg0Var = dhr0.t;
        stateListDrawable.addState(iArr, new baf0(a, abg0Var.c(R.attr.vk_ui_text_negative)));
        stateListDrawable.addState(new int[0], new baf0(m33.a(R.drawable.vk_icon_like_outline_16, imageView.getContext()), abg0Var.c(R.attr.vk_ui_text_secondary)));
        imageView.setImageDrawable(stateListDrawable);
    }

    public final void a(iag iagVar) {
        this.h = iagVar;
        if (iagVar instanceof NewsComment) {
            boolean z = this.c.N;
            View view = this.b;
            VkImage vkImage = this.e;
            if (z) {
                vkImage.clear();
                bwt0.p0(view, false);
                return;
            }
            NewsComment newsComment = (NewsComment) iagVar;
            boolean z2 = newsComment.G;
            ImageView imageView = this.g;
            if (z2 || newsComment.C) {
                PostAuthor postAuthor = newsComment.F;
                String a = postAuthor != null ? postAuthor.a(cn70.b(16)) : null;
                if (a == null || a.length() == 0) {
                    vkImage.clear();
                    bwt0.p0(view, false);
                    return;
                } else {
                    vkImage.o0(a, null);
                    bwt0.p0(view, true);
                    imageView.setSelected(newsComment.C);
                    view.setContentDescription((z2 && newsComment.C) ? imageView.getContext().getString(R.string.accessibility_comments_reaction_delete_community) : z2 ? imageView.getContext().getString(R.string.accessibility_like_community) : imageView.getContext().getString(R.string.accessibility_liked_community));
                    return;
                }
            }
            if (!newsComment.B) {
                vkImage.clear();
                bwt0.p0(view, false);
                return;
            }
            PostAuthor postAuthor2 = newsComment.E;
            String a2 = postAuthor2 != null ? postAuthor2.a(cn70.b(16)) : null;
            if (a2 == null || a2.length() == 0) {
                vkImage.clear();
                bwt0.p0(view, false);
            } else {
                vkImage.o0(a2, null);
                bwt0.p0(view, true);
                imageView.setSelected(newsComment.B);
                view.setContentDescription(imageView.getContext().getString(R.string.accessibility_liked_author));
            }
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        iag iagVar;
        if (jjc.b() || (iagVar = this.h) == null || !(iagVar instanceof NewsComment)) {
            return;
        }
        NewsComment newsComment = (NewsComment) iagVar;
        boolean z = newsComment.G;
        VkImage vkImage = this.e;
        afg afgVar = this.d;
        if (!z) {
            if (newsComment.C) {
                afgVar.z(new rdg.f(vkImage));
                return;
            } else {
                if (newsComment.B) {
                    afgVar.z(new rdg.e(vkImage));
                    return;
                }
                return;
            }
        }
        boolean z2 = newsComment.C;
        ib6 ib6Var = this.c;
        if (!z2 ? afgVar.z(new rdg.a(vkImage, newsComment, ib6Var)) : afgVar.z(new rdg.b(newsComment, ib6Var))) {
            boolean z3 = newsComment.C;
            ImageView imageView = this.g;
            imageView.setSelected(z3);
            this.b.setContentDescription(newsComment.C ? imageView.getContext().getString(R.string.accessibility_comments_reaction_delete_community) : imageView.getContext().getString(R.string.accessibility_like_community));
            Set<View> set = g6z.a;
            g6z.c(imageView, imageView, newsComment.C, true, 48);
            View view2 = this.f;
            g6z.c(view2, view2, newsComment.C, true, 48);
        }
    }
}
