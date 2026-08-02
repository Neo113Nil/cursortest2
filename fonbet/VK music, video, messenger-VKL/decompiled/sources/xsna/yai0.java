package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.drawee.generic.RoundingParams;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.restrictions.VideoRestriction;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.f5h0;
import xsna.zai0;

/* compiled from: SelectedMediaPreviewHolder.kt */
/* loaded from: classes4.dex */
public final class yai0 extends vif0<zai0> {
    public static final jwx s = new jwx(3, 20);
    public final kdg0 n;
    public final VKImageView o;
    public final View p;
    public final gk q;
    public final StringBuilder r;

    public yai0(ViewGroup viewGroup, kdg0 kdg0Var, bjk bjkVar, el30 el30Var) {
        super(tf3.b(viewGroup, R.layout.media_picker_selected_media_preview_item, viewGroup, false));
        this.n = kdg0Var;
        VKImageView vKImageView = (VKImageView) this.itemView.findViewById(R.id.preview_image);
        this.o = vKImageView;
        View findViewById = this.itemView.findViewById(R.id.remove_from_selected_button);
        this.p = findViewById;
        this.q = new gk(this.itemView.getContext());
        this.r = new StringBuilder();
        findViewById.setOnClickListener(new mfb0(1, bjkVar, this));
        njt hierarchy = vKImageView.getHierarchy();
        RoundingParams roundingParams = new RoundingParams();
        roundingParams.f(cn70.a() * 10.0f);
        abg0 abg0Var = dhr0.t;
        roundingParams.f = abg0Var.c(R.attr.vk_ui_image_border_alpha);
        roundingParams.d(cn70.a() * 1.0f);
        roundingParams.i = true;
        hierarchy.u(roundingParams);
        vKImageView.setPlaceholderColor(abg0Var.c(R.attr.vk_ui_image_placeholder_alpha));
        vKImageView.setActualScaleType(f5h0.f.a);
        vKImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        vKImageView.setOutlineProvider(new s0w0(cn70.a() * 10.0f, 6));
        vKImageView.setClipToOutline(true);
        vKImageView.setOnClickListener(new gsg(2, el30Var, this));
    }

    @Override // xsna.vif0
    public final void i6(zai0 zai0Var) {
        String sb;
        VideoRestriction O;
        zai0 zai0Var2 = zai0Var;
        MediaPickerSelectedItem mediaPickerSelectedItem = zai0Var2.a;
        boolean z = mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkVideo;
        jwx jwxVar = (z && (O = ((MediaPickerSelectedItem.VkVideo) mediaPickerSelectedItem).b.b.O()) != null && O.f) ? s : null;
        VKImageView vKImageView = this.o;
        vKImageView.setPostprocessor(jwxVar);
        boolean z2 = mediaPickerSelectedItem instanceof MediaPickerSelectedItem.VkPhoto;
        if (z2) {
            this.n.i(vKImageView, ((MediaPickerSelectedItem.VkPhoto) mediaPickerSelectedItem).b.b, true, new gt7(zai0Var2, 4));
        } else {
            zai0.a aVar = zai0Var2.b;
            if (aVar instanceof zai0.a.C4170a) {
                vKImageView.L0(((zai0.a.C4170a) aVar).a, ImageScreenSize.SIZE_48DP);
            } else {
                if (!(aVar instanceof zai0.a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                vKImageView.O0(((zai0.a.b) aVar).a, ImageScreenSize.SIZE_48DP);
            }
        }
        boolean z3 = mediaPickerSelectedItem instanceof MediaPickerSelectedItem.LocalMedia;
        gk gkVar = this.q;
        StringBuilder sb2 = this.r;
        if (z3) {
            sb = bis.b(this.itemView.getContext(), ((MediaPickerSelectedItem.LocalMedia) mediaPickerSelectedItem).b, gkVar, sb2);
        } else if (z2) {
            sb = bis.c(this.itemView.getContext(), ((MediaPickerSelectedItem.VkPhoto) mediaPickerSelectedItem).b.b, null, sb2, gkVar);
        } else {
            if (!z) {
                throw new NoWhenBranchMatchedException();
            }
            Context context = this.itemView.getContext();
            VideoFile videoFile = ((MediaPickerSelectedItem.VkVideo) mediaPickerSelectedItem).b.b;
            sb2.setLength(0);
            sb2.append(context.getString(R.string.accessibility_video));
            sb2.append(", ");
            sb2.append(videoFile.getTitle());
            sb = sb2.toString();
        }
        vKImageView.setContentDescription(sb);
    }
}
