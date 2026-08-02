package xsna;

import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.newsfeed.entries.Photos;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoTag;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PhotoAttachment;
import xsna.ikv0;

/* compiled from: SuggestedTagConfirmationHolder.kt */
/* loaded from: classes4.dex */
public final class u5n0 extends qi6<Photos> implements View.OnClickListener {
    public final TextView C;
    public final TextView D;
    public final TextView E;
    public Runnable F;
    public PhotoTag G;

    public u5n0(ViewGroup viewGroup) {
        super(R.layout.post_item_confirm_suggested_tag, viewGroup);
        this.C = (TextView) this.itemView.findViewById(R.id.date);
        TextView textView = (TextView) this.itemView.findViewById(R.id.accept);
        this.D = textView;
        TextView textView2 = (TextView) this.itemView.findViewById(R.id.reject);
        this.E = textView2;
        textView.setOnClickListener(this);
        textView2.setOnClickListener(this);
        bwt0.X(R.drawable.vk_icon_stars_circle_fill_violet_48, this.itemView.findViewById(R.id.photo));
    }

    @Override // xsna.qi6
    public final void E6(Photos photos) {
        PhotoTag photoTag = this.G;
        long j = photoTag != null ? photoTag.e : 0L;
        TextView textView = this.C;
        if (j > 0) {
            textView.setText(pvo0.k((int) j, this.itemView.getResources(), false));
        }
        bwt0.p0(textView, j > 0);
    }

    public final void R6(Drawable drawable, String str) {
        ikv0.a aVar = new ikv0.a(this.itemView.getContext());
        aVar.u = new ikv0.d(str, (String) null, (ikv0.d.a) null, 6);
        if (drawable != null) {
            aVar.t = new ikv0.c.C3058c(new eko(drawable), (x7g) null, (Size) null, 14);
        }
        aVar.n();
    }

    @Override // xsna.qi6
    public final void a6(u1c0 u1c0Var) {
        Object obj = u1c0Var.g;
        this.G = obj instanceof PhotoTag ? (PhotoTag) obj : null;
        super.a6(u1c0Var);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Photos q6;
        PhotoAttachment Mb;
        Photo photo;
        PhotoTag photoTag;
        PhotoAttachment Mb2;
        Photo photo2;
        PhotoTag photoTag2;
        if (epx.f(view, this.D)) {
            Photos q62 = q6();
            if (q62 == null || (Mb2 = q62.Mb()) == null || (photo2 = Mb2.l) == null || (photoTag2 = this.G) == null) {
                return;
            }
            hg1.m(rsg0.y0(new oea0(photo2, photoTag2, photo2.r, 24), null, null, 3), this.itemView.getContext(), 0L, false, 62).subscribe(new j990(new sf4(this, photo2, photoTag2), 10), new cc20(new c3v(27), 26));
            return;
        }
        if (!epx.f(view, this.E) || (q6 = q6()) == null || (Mb = q6.Mb()) == null || (photo = Mb.l) == null || (photoTag = this.G) == null) {
            return;
        }
        hg1.m(rsg0.y0(new oss0(photo, photoTag, null, null), null, null, 3), this.itemView.getContext(), 0L, false, 62).subscribe(new tk40(new ll1(this, photo, photoTag, 26), 19), new t5n0(new rvq(28), 0));
    }
}
