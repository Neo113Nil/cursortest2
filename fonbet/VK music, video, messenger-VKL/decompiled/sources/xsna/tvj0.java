package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.im.Image;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.Photo;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.AlbumAttachment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import xsna.gd60;
import xsna.qi6;

/* compiled from: SingleRestrictedBlurredAlbumHolder.kt */
@ozl
/* loaded from: classes4.dex */
public final class tvj0 extends m56<AlbumAttachment> implements View.OnClickListener {
    public final ad1 D;
    public final kcg0 E;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public tvj0(ViewGroup viewGroup) {
        super(r0);
        wk10 wk10Var = new wk10(viewGroup.getContext());
        wk10Var.setId(R.id.attachment_album_restricted_container);
        f4m.y(cn70.b(6), wk10Var);
        ad1 ad1Var = new ad1(viewGroup.getContext());
        ad1Var.setId(R.id.attach);
        int b = cn70.b(16);
        ad1Var.setPadding(b, b, b, b);
        kcg0 kcg0Var = new kcg0(viewGroup.getContext());
        kcg0Var.setId(R.id.image_view);
        kcg0Var.setHorizontal(true);
        kcg0Var.setTextMaxLines(2);
        int b2 = cn70.b(32);
        kcg0Var.setPadding(b2, b2, b2, b2);
        kcg0Var.setTextTopMargin(cn70.b(8));
        kcg0Var.setButtonTopMargin(cn70.b(20));
        ad1Var.setContentView(kcg0Var);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 1;
        s3q0 s3q0Var = s3q0.a;
        wk10Var.addView(ad1Var, layoutParams);
        this.D = (ad1) this.itemView.findViewById(R.id.attach);
        kcg0 kcg0Var2 = (kcg0) this.itemView.findViewById(R.id.image_view);
        this.E = kcg0Var2;
        kcg0Var2.setOnClickListener(this);
    }

    @Override // xsna.m56
    public final void T6(AlbumAttachment albumAttachment) {
        boolean z;
        boolean z2;
        AlbumAttachment albumAttachment2 = albumAttachment;
        int i = albumAttachment2.y;
        String s6 = s6(R.plurals.photos_count, i, Integer.valueOf(i));
        ad1 ad1Var = this.D;
        ad1Var.setSubtitle(s6);
        ad1Var.setLabel(String.format("%,d", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
        int a = qi6.a.a(this.itemView.getContext());
        Photo photo = albumAttachment2.l;
        ArrayList arrayList = photo.y.b;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (ImageSize.j.contains(Character.valueOf(((ImageSize) next).b))) {
                arrayList2.add(next);
            }
        }
        if (arrayList2.isEmpty()) {
            arrayList2 = photo.y.b;
        }
        ImageSize y = nr2.y(a, arrayList2);
        boolean z3 = albumAttachment2.b;
        kcg0 kcg0Var = this.E;
        kcg0Var.setWrapContent(z3);
        VKImageView vKImageView = kcg0Var.v;
        if (y != null) {
            Image image = y.d;
            int i2 = image.b;
            int i3 = image.c;
            if (kcg0Var.f != i2) {
                kcg0Var.f = i2;
                z2 = true;
            } else {
                z2 = false;
            }
            if (kcg0Var.g != i3) {
                kcg0Var.g = i3;
                z2 = true;
            }
            if (z2) {
                kcg0Var.requestLayout();
            }
        } else {
            if (kcg0Var.f != 135) {
                kcg0Var.f = 135;
                z = true;
            } else {
                z = false;
            }
            if (kcg0Var.g != 100) {
                kcg0Var.g = 100;
                z = true;
            }
            if (z) {
                kcg0Var.requestLayout();
            }
        }
        if (!photo.Ib()) {
            ad1Var.setTitle(albumAttachment2.m);
            if (kcg0Var.p) {
                kcg0Var.p = false;
                kcg0Var.requestLayout();
                kcg0Var.invalidate();
            }
            kcg0Var.setText(null);
            kcg0Var.setButtonText(null);
            vKImageView.setOverlayImage(null);
            vKImageView.setPostprocessor(null);
            vKImageView.o0(y != null ? y.d.d : null, null);
            return;
        }
        ad1Var.setTitle(null);
        boolean Hb = photo.Hb();
        jwx jwxVar = edg0.a;
        baf0 a2 = edg0.a(photo.L, null);
        String Ib = Hb ? albumAttachment2.Ib() : null;
        int c = Hb ? -1 : dhr0.t.c(R.attr.vk_ui_text_secondary);
        if (!kcg0Var.p) {
            kcg0Var.p = true;
            kcg0Var.requestLayout();
            kcg0Var.invalidate();
        }
        vKImageView.setOverlayImage(kcg0Var.w);
        vKImageView.setPostprocessor(edg0.a);
        PhotoRestriction photoRestriction = photo.L;
        kcg0Var.setText(photoRestriction != null ? photoRestriction.b : null);
        SparseArray<Drawable> sparseArray = kcg0Var.d;
        sparseArray.clear();
        kcg0Var.e = null;
        if (a2 != null) {
            Drawable mutate = a2.mutate();
            mutate.setTintList(null);
            sparseArray.append(qcg0.u, mutate);
        }
        kcg0Var.p = sparseArray.size() != 0;
        kcg0Var.requestLayout();
        kcg0Var.invalidate();
        kcg0Var.setTextColor(c);
        vKImageView.o0(Ib, null);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        AlbumAttachment albumAttachment = (AlbumAttachment) this.C;
        if (albumAttachment == null) {
            return;
        }
        tfa0.a.getClass();
        PhotoAlbum b = tfa0.b(albumAttachment);
        gd60 a = hd60.a();
        Context context = this.itemView.getContext();
        gd60.a aVar = gd60.a;
        a.z0(context, b, null);
    }
}
