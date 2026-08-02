package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.List;
import xsna.f5h0;
import xsna.q8a0;

/* compiled from: PhotoFlowSettingsHolder.kt */
/* loaded from: classes4.dex */
public abstract class p8a0 extends vif0<q8a0> {

    /* compiled from: PhotoFlowSettingsHolder.kt */
    public static final class a extends p8a0 {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(q8a0 q8a0Var) {
        }
    }

    /* compiled from: PhotoFlowSettingsHolder.kt */
    public static final class b extends p8a0 {
        public final kdg0 n;
        public final VKImageView o;
        public final TextView p;
        public final TextView q;
        public final AppCompatCheckBox r;
        public final FrameLayout s;
        public final ImageView t;
        public final Drawable u;

        public b(View view, d0w d0wVar, qw30 qw30Var, kdg0 kdg0Var) {
            super(view);
            this.n = kdg0Var;
            VKImageView vKImageView = (VKImageView) view.findViewById(R.id.photo);
            this.o = vKImageView;
            this.p = (TextView) view.findViewById(R.id.title);
            this.q = (TextView) view.findViewById(R.id.privacy);
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(R.id.checkbox_photo);
            this.r = appCompatCheckBox;
            this.s = (FrameLayout) view.findViewById(R.id.checkbox_area);
            this.t = (ImageView) view.findViewById(R.id.chevron);
            Drawable e = enj.e(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_secondary, this.itemView.getContext());
            this.u = e;
            appCompatCheckBox.setSupportButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{dhr0.Y(R.attr.vk_ui_icon_tertiary, this.itemView.getContext()), dhr0.Y(R.attr.vk_ui_icon_accent, this.itemView.getContext())}));
            vKImageView.Q0(e, f5h0.e.a);
            bwt0.i0(view, new eaa(27, d0wVar, this));
            vKImageView.getHierarchy().u(RoundingParams.b(cn70.b(6)));
            bwt0.i0(view.findViewById(R.id.checkbox_area), new g6(23, qw30Var, this));
        }

        @Override // xsna.vif0
        public final void i6(q8a0 q8a0Var) {
            q8a0 q8a0Var2 = q8a0Var;
            j6(q8a0Var2, s3q0.a);
            q6((q8a0.a.C3553a) q8a0Var2);
        }

        public final void q6(q8a0.a.C3553a c3553a) {
            PhotoAlbum photoAlbum = c3553a.c;
            PhotoRestriction photoRestriction = photoAlbum.s;
            kdg0 kdg0Var = this.n;
            VKImageView vKImageView = this.o;
            if (photoRestriction != null) {
                kdg0Var.d(vKImageView, photoAlbum.s, true, false, new jhg(myc0.f(photoAlbum.l) ? photoAlbum.l : photoAlbum.k, 2));
            } else {
                kdg0Var.f(vKImageView);
                bwt0.S(vKImageView, new z5a(22, photoAlbum, this));
            }
        }

        @Override // xsna.vif0
        /* renamed from: s6, reason: merged with bridge method [inline-methods] */
        public final void j6(q8a0 q8a0Var, Object obj) {
            q8a0.a.C3553a c3553a = (q8a0.a.C3553a) q8a0Var;
            PhotoAlbum photoAlbum = c3553a.c;
            this.p.setText(photoAlbum.g);
            this.q.setText(c3553a.e);
            if ((obj instanceof List) && ((List) obj).contains(zq70.d)) {
                q6(c3553a);
            }
            boolean z = photoAlbum.x;
            ImageView imageView = this.t;
            FrameLayout frameLayout = this.s;
            if (!z) {
                bwt0.p0(frameLayout, false);
                bwt0.p0(imageView, true);
            } else {
                bwt0.p0(frameLayout, true);
                this.r.setChecked(c3553a.d);
                bwt0.p0(imageView, false);
            }
        }
    }

    /* compiled from: PhotoFlowSettingsHolder.kt */
    public static final class c extends p8a0 {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(q8a0 q8a0Var) {
        }
    }

    /* compiled from: PhotoFlowSettingsHolder.kt */
    public static final class d extends p8a0 {
        public final kdg0 n;
        public final VKImageView o;
        public final TextView p;
        public final TextView q;
        public final AppCompatCheckBox r;
        public final Drawable s;

        public d(View view, d0w d0wVar, qw30 qw30Var, kdg0 kdg0Var) {
            super(view);
            this.n = kdg0Var;
            VKImageView vKImageView = (VKImageView) view.findViewById(R.id.photo);
            this.o = vKImageView;
            this.p = (TextView) view.findViewById(R.id.title);
            this.q = (TextView) view.findViewById(R.id.count);
            AppCompatCheckBox appCompatCheckBox = (AppCompatCheckBox) view.findViewById(R.id.checkbox_photo);
            this.r = appCompatCheckBox;
            Drawable e = enj.e(R.drawable.vk_icon_picture_outline_28, R.attr.vk_ui_icon_secondary, this.itemView.getContext());
            this.s = e;
            vKImageView.Q0(e, f5h0.e.a);
            appCompatCheckBox.setSupportButtonTintList(new ColorStateList(new int[][]{new int[]{-16842912}, new int[]{android.R.attr.state_checked}}, new int[]{dhr0.Y(R.attr.vk_ui_icon_tertiary, this.itemView.getContext()), dhr0.Y(R.attr.vk_ui_icon_accent, this.itemView.getContext())}));
            bwt0.i0(view, new fo6(19, d0wVar, this));
            bwt0.i0(view.findViewById(R.id.checkbox_area), new d05(29, qw30Var, this));
            vKImageView.getHierarchy().u(RoundingParams.b(cn70.b(6)));
        }

        @Override // xsna.vif0
        public final void i6(q8a0 q8a0Var) {
            q8a0 q8a0Var2 = q8a0Var;
            j6(q8a0Var2, s3q0.a);
            q6((q8a0.a.b) q8a0Var2);
        }

        public final void q6(q8a0.a.b bVar) {
            PhotoAlbum photoAlbum = bVar.c;
            PhotoRestriction photoRestriction = photoAlbum.s;
            kdg0 kdg0Var = this.n;
            VKImageView vKImageView = this.o;
            if (photoRestriction != null) {
                kdg0Var.d(vKImageView, photoAlbum.s, true, false, new jhg(myc0.f(photoAlbum.l) ? photoAlbum.l : photoAlbum.k, 2));
            } else {
                kdg0Var.f(vKImageView);
                bwt0.S(vKImageView, new u9(24, photoAlbum, this));
            }
        }

        @Override // xsna.vif0
        /* renamed from: s6, reason: merged with bridge method [inline-methods] */
        public final void j6(q8a0 q8a0Var, Object obj) {
            q8a0.a.b bVar = (q8a0.a.b) q8a0Var;
            this.r.setChecked(bVar.d);
            this.p.setText(bVar.c.g);
            int i = bVar.c.f;
            TextView textView = this.q;
            if (i > 0) {
                textView.setText(this.itemView.getContext().getString(R.string.photos_count_text, Integer.valueOf(bVar.c.f)));
            } else {
                textView.setText(R.string.no_photos_in_album);
            }
            if ((obj instanceof List) && ((List) obj).contains(zq70.d)) {
                q6(bVar);
            }
        }
    }

    /* compiled from: PhotoFlowSettingsHolder.kt */
    public static final class e extends p8a0 {
        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(q8a0 q8a0Var) {
        }
    }
}
