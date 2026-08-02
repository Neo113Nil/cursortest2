package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.NotificationImage;
import com.vk.dto.masks.Mask;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.masks.MasksController;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bi10;
import xsna.xg10;

/* compiled from: MasksHolder.kt */
/* loaded from: classes3.dex */
public final class yh10 extends vmg0<bi10.c> {
    public static final MasksController B = MasksController.f();
    public final List<View> A;
    public final VKImageView q;
    public final View r;
    public final View s;
    public final View t;
    public final View u;
    public final View v;
    public final View w;
    public final View x;
    public final View y;
    public Mask z;

    public yh10(ViewGroup viewGroup, xg10.a aVar, zzz zzzVar) {
        super(tf3.b(viewGroup, R.layout.layout_mask, viewGroup, false), zzzVar);
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.iv_image);
        this.q = vKImageView;
        this.r = this.itemView.findViewById(R.id.view_unsupported);
        this.s = this.itemView.findViewById(R.id.view_background);
        this.t = this.itemView.findViewById(R.id.view_selected_foreground);
        this.u = this.itemView.findViewById(R.id.view_intrigue);
        this.v = this.itemView.findViewById(R.id.view_new);
        this.w = this.itemView.findViewById(R.id.view_3d);
        View findViewById = this.itemView.findViewById(R.id.mask_delete);
        this.x = findViewById;
        View findViewById2 = this.itemView.findViewById(R.id.mask_favorite);
        this.y = findViewById2;
        this.A = e43.l(vKImageView, findViewById);
        vKImageView.setHasOverlappingRendering(false);
        bwt0.i0(vKImageView, new qd1(19, this, aVar));
        bwt0.i0(findViewById, new mu1(17, aVar, this));
        bwt0.d(findViewById2, iah0.a(8), true, true);
    }

    @Override // xsna.vmg0, xsna.tmg0
    public final List<View> getAnimatedViewsToRotate() {
        return this.A;
    }

    @Override // xsna.vmg0, xsna.vif0
    public final void i6(Object obj) {
        bi10.c cVar = (bi10.c) obj;
        bi10.d dVar = cVar.a;
        this.z = dVar.a;
        boolean z = cVar.b;
        int i = z ? R.string.mask_view_holder_content_description_selected_mask : R.string.mask_view_holder_content_description_not_selected_mask;
        StringBuilder sb = new StringBuilder();
        sb.append(g6(i));
        sb.append(' ');
        Mask mask = this.z;
        if (mask == null) {
            mask = null;
        }
        String str = mask.g;
        if (str == null) {
            str = "";
        }
        sb.append(str);
        String sb2 = sb.toString();
        VKImageView vKImageView = this.q;
        vKImageView.setContentDescription(sb2);
        Mask mask2 = this.z;
        if (mask2 == null) {
            mask2 = null;
        }
        NotificationImage notificationImage = mask2.l;
        if (notificationImage != null) {
            ImageScreenSize imageScreenSize = ImageScreenSize.SIZE_56DP;
            vKImageView.O0(NotificationImage.Db(notificationImage, imageScreenSize.h()), imageScreenSize);
        }
        this.s.setBackgroundResource(R.drawable.bg_stories_replied_card);
        this.t.setVisibility(z ? 0 : 8);
        View view = this.v;
        View view2 = this.u;
        View view3 = this.r;
        if (z) {
            view3.setVisibility(4);
            view2.setVisibility(4);
            view.setVisibility(4);
        } else {
            Mask mask3 = this.z;
            if (mask3 == null) {
                mask3 = null;
            }
            view.setVisibility(mask3.m ? 0 : 8);
            Mask mask4 = this.z;
            if (mask4 == null) {
                mask4 = null;
            }
            boolean z2 = MasksController.f().g >= mask4.Cb();
            MasksController masksController = B;
            if (z2) {
                Mask mask5 = this.z;
                if ((mask5 == null ? null : mask5).p == null) {
                    if (mask5 == null) {
                        mask5 = null;
                    }
                    if (masksController.h(mask5)) {
                        vKImageView.setAlpha(1.0f);
                        this.itemView.setEnabled(true);
                        view3.setVisibility(4);
                        view2.setVisibility(4);
                    }
                }
            }
            if (z2) {
                Mask mask6 = this.z;
                if (mask6 == null) {
                    mask6 = null;
                }
                if (mask6.p != null) {
                    vKImageView.setAlpha(0.3f);
                    this.itemView.setEnabled(true);
                    view3.setVisibility(4);
                    view2.setVisibility(0);
                }
            }
            if (z2) {
                Mask mask7 = this.z;
                if (mask7 == null) {
                    mask7 = null;
                }
                if (mask7.Fb()) {
                    Mask mask8 = this.z;
                    if (mask8 == null) {
                        mask8 = null;
                    }
                    if (!masksController.h(mask8)) {
                        vKImageView.setAlpha(0.3f);
                        this.itemView.setEnabled(true);
                        view3.setVisibility(4);
                        view2.setVisibility(0);
                    }
                }
            }
            vKImageView.setAlpha(0.3f);
            this.itemView.setEnabled(false);
            view3.setVisibility(0);
            view2.setVisibility(4);
        }
        this.w.setVisibility(dVar.c ? 0 : 8);
        Mask mask9 = this.z;
        if (mask9 == null) {
            mask9 = null;
        }
        this.x.setVisibility((mask9.v && z) ? 0 : 8);
        Mask mask10 = this.z;
        this.y.setVisibility((mask10 != null ? mask10 : null).w ? 0 : 8);
    }
}
