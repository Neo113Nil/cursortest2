package xsna;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.attachments.VmojiAttachInfo;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.PromoPost;
import com.vk.dto.photo.Photo;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: VmojiSnippetHolder.kt */
/* loaded from: classes4.dex */
public final class fbw0 extends m56<SnippetAttachment> implements View.OnClickListener, blc0 {
    public static final int J = cn70.b(160);
    public final VKImageView D;
    public final TextView E;
    public final TextViewEllipsizeEnd F;
    public final TextView G;
    public final ImageView H;
    public final ImageView I;

    public fbw0(ViewGroup viewGroup) {
        super(R.layout.attach_vmoji_character, viewGroup);
        this.D = (VKImageView) this.itemView.findViewById(R.id.vmoji_character_image);
        this.E = (TextView) this.itemView.findViewById(R.id.vmoji_snippet_title);
        this.F = (TextViewEllipsizeEnd) this.itemView.findViewById(R.id.vmoji_snippet_caption);
        TextView textView = (TextView) this.itemView.findViewById(R.id.open_vmoji_button);
        this.G = textView;
        ImageView imageView = (ImageView) this.itemView.findViewById(R.id.snippet_toggle_fave);
        this.H = imageView;
        this.I = (ImageView) this.itemView.findViewById(R.id.attach_snippet_remove_button);
        this.itemView.setOnClickListener(this);
        textView.setOnClickListener(this);
        if (imageView != null) {
            imageView.setOnClickListener(this);
        }
    }

    @Override // xsna.blc0
    public final void D1(boolean z) {
        ImageView imageView = this.I;
        if (imageView != null) {
            bwt0.p0(imageView, true);
        }
    }

    @Override // xsna.m56
    public final void T6(SnippetAttachment snippetAttachment) {
        Image image;
        ImageSize Cb;
        SnippetAttachment snippetAttachment2 = snippetAttachment;
        String str = snippetAttachment2.k;
        Photo photo = snippetAttachment2.p;
        String str2 = (photo == null || (image = photo.y) == null || (Cb = image.Cb(J, false, false)) == null) ? null : Cb.d.d;
        VKImageView vKImageView = this.D;
        vKImageView.load(str2);
        VmojiAttachInfo vmojiAttachInfo = snippetAttachment2.B;
        Integer num = vmojiAttachInfo != null ? vmojiAttachInfo.c : null;
        if (num != null) {
            vKImageView.setBackgroundColor(num.intValue());
        }
        vKImageView.setClipToOutline(true);
        vKImageView.setOutlineProvider(new t0w0(4, iah0.a(8), false, false));
        this.E.setText(snippetAttachment2.g);
        this.F.b(snippetAttachment2.i, "", false, false);
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = this.G;
        if (isEmpty) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(str);
        }
        X6();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0019, code lost:
    
        if (r2.dc() == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void X6() {
        boolean z;
        NewsEntry q6 = q6();
        NewsEntry t6 = t6();
        Post post = q6 instanceof Post ? (Post) q6 : null;
        if (post != null) {
            z = true;
        }
        z = false;
        boolean z2 = t6 instanceof FaveEntry;
        ImageView imageView = this.H;
        if (z2 || (q6 instanceof FaveEntry) || (q6 instanceof PromoPost) || z) {
            if (imageView != null) {
                imageView.setVisibility(8);
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setVisibility(0);
        }
        SnippetAttachment snippetAttachment = (SnippetAttachment) this.C;
        if (snippetAttachment != null) {
            if (imageView != null) {
                imageView.setActivated(snippetAttachment.w.booleanValue());
            }
            if (imageView != null) {
                imageView.setContentDescription(v6(snippetAttachment.w.booleanValue() ? R.string.fave_accessibility_remove_from_favorite : R.string.fave_accessibility_add_to_favorite));
            }
        }
    }

    @Override // xsna.blc0
    public final void j1(View.OnClickListener onClickListener) {
        ImageView imageView = this.I;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        SnippetAttachment snippetAttachment;
        if (jjc.b() || (snippetAttachment = (SnippetAttachment) this.C) == null) {
            return;
        }
        if (epx.f(view, this.H)) {
            NewsEntry q6 = q6();
            if (q6 != null) {
                c6z Q = di60.Q(q6);
                gd60.X0(hd60.a(), this.itemView.getContext(), snippetAttachment, new pqq(null, this.u, Q != null ? Q.r() : null, null, 9), new hq5(this, 19), new ukv0(this, 1), 32);
                return;
            }
            return;
        }
        if (epx.f(view, this.G)) {
            U6(view);
        } else if (epx.f(view, this.itemView)) {
            W6(view);
        }
    }

    @Override // xsna.blc0
    public final void p5() {
    }

    @Override // xsna.blc0
    public final void Z1(x64 x64Var) {
    }
}
