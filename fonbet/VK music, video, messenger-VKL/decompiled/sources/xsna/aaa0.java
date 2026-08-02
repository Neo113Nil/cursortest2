package xsna;

import android.graphics.Rect;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import com.vk.imageloader.view.VKImageView;
import com.vk.photos.root.albumdetails.presentation.AlbumDetailsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: AlbumDetailsPhoto.kt */
/* loaded from: classes4.dex */
public final class aaa0 extends vif0<k.c.C1491c> implements otx0 {
    public final View n;
    public final df1 o;
    public final kdg0 p;
    public final eha0 q;
    public final VKImageView r;
    public final AppCompatCheckBox s;
    public final r8a0 t;
    public final h630 u;

    public aaa0(View view, AlbumDetailsFragment albumDetailsFragment, kdg0 kdg0Var, eha0 eha0Var) {
        super(view);
        this.n = view;
        this.o = albumDetailsFragment;
        this.p = kdg0Var;
        this.q = eha0Var;
        VKImageView vKImageView = (VKImageView) view.findViewById(R.id.iv_photo);
        this.r = vKImageView;
        this.s = (AppCompatCheckBox) view.findViewById(R.id.checkbox_photo);
        this.t = new r8a0(this, 1);
        this.u = new h630(this, 15);
        vKImageView.setPlaceholderColor(dhr0.t.c(R.attr.vk_ui_image_placeholder));
    }

    @Override // xsna.jsx0
    public final boolean H4() {
        return true;
    }

    @Override // xsna.otx0
    public final Rect X1(Rect rect) {
        this.n.getGlobalVisibleRect(rect);
        return rect;
    }

    @Override // xsna.vif0
    public final void i6(k.c.C1491c c1491c) {
        j6(c1491c, rh1.a);
    }

    @Override // xsna.vif0
    /* renamed from: q6, reason: merged with bridge method [inline-methods] */
    public final void j6(k.c.C1491c c1491c, Object obj) {
        Boolean bool = c1491c.b;
        VKImageView vKImageView = this.r;
        ym.a(vKImageView, bool, false);
        List list = obj instanceof List ? (List) obj : null;
        Object obj2 = list != null ? list.get(0) : null;
        List<baa0> list2 = obj2 instanceof List ? (List) obj2 : null;
        if (list2 == null) {
            list2 = rh1.a;
        }
        if (list2.contains(baa0.IMAGE)) {
            this.p.i(vKImageView, c1491c.a, false, new tcm(1));
        }
        if (list2.contains(baa0.SELECTED)) {
            AppCompatCheckBox appCompatCheckBox = this.s;
            if (bool == null) {
                appCompatCheckBox.setVisibility(8);
                appCompatCheckBox.setChecked(false);
                appCompatCheckBox.jumpDrawablesToCurrentState();
            } else {
                appCompatCheckBox.setVisibility(0);
                appCompatCheckBox.setChecked(bool.booleanValue());
            }
        }
        if (list2.contains(baa0.CLICK_LISTENER)) {
            if (c1491c.c) {
                vKImageView.setOnLongClickListener(new n4w(this.t, 1));
                this.itemView.setHapticFeedbackEnabled(true);
            } else {
                vKImageView.setOnLongClickListener(null);
                this.itemView.setHapticFeedbackEnabled(false);
            }
        }
        if (bool == null) {
            vKImageView.setOnClickListener(new gi8(this.u, 10));
        } else {
            vKImageView.setOnClickListener(null);
        }
        vKImageView.setClickable(bool == null);
    }
}
