package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.dto.common.Attachment;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GeoAttachment;

/* compiled from: CheckInHolder.kt */
/* loaded from: classes4.dex */
public final class n0c extends ikg<GeoAttachment> {
    public n0c(ViewGroup viewGroup) {
        super(viewGroup);
        VKImageView vKImageView = this.D;
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.f0(R.drawable.white_oval, R.attr.vk_ui_background_secondary, vKImageView);
    }

    @Override // xsna.m56
    public final void T6(Attachment attachment) {
        GeoAttachment geoAttachment = (GeoAttachment) attachment;
        omw.d(this.D, R.drawable.vk_icon_place_24, R.attr.vk_ui_icon_medium);
        this.E.setText(geoAttachment.h);
        this.F.setText(geoAttachment.i);
    }

    @Override // xsna.m56, android.view.View.OnClickListener
    public final void onClick(View view) {
        if (view == null) {
            return;
        }
        W6(view);
    }
}
