package xsna;

import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.photos.root.albumdetails.presentation.views.AlbumDetailsDescriptionView;
import com.vkontakte.android.R;

/* compiled from: AlbumDetailsHeader.kt */
/* loaded from: classes4.dex */
public final class ywu extends vif0<k.b> {
    public final df1 n;
    public final TextView o;
    public final AlbumDetailsDescriptionView p;
    public final InsetDrawable q;
    public boolean r;

    public ywu(View view, AlbumDetailsFragment albumDetailsFragment) {
        super(view);
        InsetDrawable insetDrawable;
        this.n = albumDetailsFragment;
        this.o = (TextView) view.findViewById(R.id.tv_album_name);
        AlbumDetailsDescriptionView albumDetailsDescriptionView = (AlbumDetailsDescriptionView) view.findViewById(R.id.tv_album_description);
        this.p = albumDetailsDescriptionView;
        Drawable a = m33.a(R.drawable.vk_icon_lock_16, this.itemView.getContext());
        if (a == null) {
            insetDrawable = null;
        } else {
            a.setBounds(0, 0, a.getIntrinsicWidth(), a.getIntrinsicHeight());
            sjo.b(a, e3m.f(R.attr.vk_ui_icon_tertiary, this.itemView.getContext()), PorterDuff.Mode.SRC_IN);
            int b = cn70.b(6);
            int b2 = cn70.b(2);
            int i = -cn70.b(2);
            InsetDrawable insetDrawable2 = new InsetDrawable(a, i, 0, b2, b);
            insetDrawable2.setBounds(0, 0, a.getIntrinsicWidth() + b2 + i, a.getIntrinsicHeight() + b);
            insetDrawable = insetDrawable2;
        }
        this.q = insetDrawable;
        albumDetailsDescriptionView.setMaxLines(2);
        jjc.g(albumDetailsDescriptionView, new k0j(this, 20));
        albumDetailsDescriptionView.setShowMoreClickListener(new vwu(this));
    }

    @Override // xsna.vif0
    public final void i6(k.b bVar) {
        InsetDrawable insetDrawable;
        k.b bVar2 = bVar;
        String str = bVar2.b;
        AlbumDetailsDescriptionView albumDetailsDescriptionView = this.p;
        albumDetailsDescriptionView.setDescription(str);
        albumDetailsDescriptionView.setImportantForAccessibility(drm0.N(str) ? 2 : 1);
        albumDetailsDescriptionView.setVisibility(drm0.N(str) ? 8 : 0);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) bVar2.a);
        int b = cn70.b(12);
        if (bVar2.c && (insetDrawable = this.q) != null) {
            b = cn70.b(13);
            spannableStringBuilder.append((CharSequence) " ");
            ImageSpan imageSpan = new ImageSpan(insetDrawable, 0);
            int length = spannableStringBuilder.length();
            String string = this.itemView.getContext().getString(R.string.album_details_privacy_icon_accessibility);
            spannableStringBuilder.append((CharSequence) string);
            spannableStringBuilder.setSpan(imageSpan, length, string.length() + length, 17);
        }
        TextView textView = this.o;
        textView.setText(spannableStringBuilder);
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            marginLayoutParams.leftMargin = b;
        }
        textView.setLayoutParams(layoutParams);
        if (this.r) {
            return;
        }
        this.r = true;
        textView.addOnLayoutChangeListener(new wwu(this));
    }
}
