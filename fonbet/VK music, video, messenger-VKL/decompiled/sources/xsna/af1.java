package xsna;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: AlbumDetailsControls.kt */
/* loaded from: classes4.dex */
public final class af1 extends vif0<k.c.a> {
    public final df1 n;
    public final TextView o;
    public final ImageView p;

    public af1(View view, AlbumDetailsFragment albumDetailsFragment) {
        super(view);
        this.n = albumDetailsFragment;
        TextView textView = (TextView) view.findViewById(R.id.tv_action_button);
        this.o = textView;
        ImageView imageView = (ImageView) view.findViewById(R.id.iv_settings);
        this.p = imageView;
        bwt0.d(view, cn70.a() * 20.0f, (r4 & 2) != 0, (r4 & 4) != 0);
        jjc.g(textView, new com.vk.movika.sdk.base.hooks.p(this, 4));
        jjc.g(imageView, new r6(this, 3));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    @Override // xsna.vif0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i6(k.c.a aVar) {
        Integer valueOf;
        int i;
        Drawable drawable;
        Drawable drawable2;
        k.c.a aVar2 = aVar;
        boolean z = aVar2 instanceof k.c.a.C1488a;
        if (z) {
            valueOf = Integer.valueOf(R.string.album_details_add_photo_button);
        } else if (aVar2 instanceof k.c.a.C1489c) {
            valueOf = Integer.valueOf(R.string.album_details_multiselect_exit);
        } else if (aVar2 instanceof k.c.a.d) {
            valueOf = null;
        } else {
            if (!aVar2.equals(k.c.a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
            valueOf = Integer.valueOf(R.string.album_details_edit_album);
        }
        TextView textView = this.o;
        if (valueOf != null) {
            textView.setText(valueOf.intValue());
        }
        boolean z2 = false;
        if (!aVar2.equals(k.c.a.C1488a.a) && !(aVar2 instanceof k.c.a.C1489c)) {
            if (aVar2 instanceof k.c.a.d) {
                i = 8;
                textView.setVisibility(i);
                if (!z) {
                    drawable = this.itemView.getContext().getDrawable(R.drawable.vk_icon_picture_outline_24);
                } else {
                    if ((aVar2 instanceof k.c.a.C1489c) || (aVar2 instanceof k.c.a.d)) {
                        drawable2 = null;
                        textView.setCompoundDrawablesWithIntrinsicBounds(drawable2 != null ? new InsetDrawable(drawable2, 0, 0, 0, cn70.b(2)) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                        if (aVar2 instanceof k.c.a.C1489c) {
                            z2 = ((k.c.a.C1489c) aVar2).a;
                        } else if (z || (aVar2 instanceof k.c.a.d)) {
                            z2 = true;
                        } else if (!aVar2.equals(k.c.a.b.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bwt0.p0(this.p, z2);
                    }
                    if (!aVar2.equals(k.c.a.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    drawable = this.itemView.getContext().getDrawable(R.drawable.vk_icon_pen_outline_24);
                }
                drawable2 = drawable;
                textView.setCompoundDrawablesWithIntrinsicBounds(drawable2 != null ? new InsetDrawable(drawable2, 0, 0, 0, cn70.b(2)) : null, (Drawable) null, (Drawable) null, (Drawable) null);
                if (aVar2 instanceof k.c.a.C1489c) {
                }
                bwt0.p0(this.p, z2);
            }
            if (!aVar2.equals(k.c.a.b.a)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        i = 0;
        textView.setVisibility(i);
        if (!z) {
        }
        drawable2 = drawable;
        textView.setCompoundDrawablesWithIntrinsicBounds(drawable2 != null ? new InsetDrawable(drawable2, 0, 0, 0, cn70.b(2)) : null, (Drawable) null, (Drawable) null, (Drawable) null);
        if (aVar2 instanceof k.c.a.C1489c) {
        }
        bwt0.p0(this.p, z2);
    }
}
