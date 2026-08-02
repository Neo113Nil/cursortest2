package xsna;

import android.net.Uri;
import android.view.ViewGroup;
import com.huawei.hms.framework.common.BundleUtil;
import com.vk.core.preference.Preference;
import com.vk.dto.common.id.UserId;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.GraffitiAttachment;

/* compiled from: GraffitiHolder.kt */
/* loaded from: classes4.dex */
public final class ncu extends m56<GraffitiAttachment> {
    public static final /* synthetic */ int E = 0;
    public final VKImageView D;

    public ncu(ViewGroup viewGroup) {
        super(R.layout.attach_graffiti, viewGroup);
        this.D = (VKImageView) this.itemView.findViewById(R.id.image);
        this.itemView.setOnClickListener(null);
    }

    @Override // xsna.qi6
    public final void Q6(s6o s6oVar) {
        super.Q6(s6oVar);
        if (Preference.j().getBoolean("doubleTapPostLike", true)) {
            this.itemView.setOnClickListener(s6oVar.a(new mcu(), s6oVar.e));
        } else {
            this.itemView.setOnClickListener(null);
        }
    }

    @Override // xsna.m56
    public final void T6(GraffitiAttachment graffitiAttachment) {
        GraffitiAttachment graffitiAttachment2 = graffitiAttachment;
        int i = graffitiAttachment2.i;
        int i2 = graffitiAttachment2.j;
        int i3 = GraffitiAttachment.m;
        if (i < i3 && i2 < i3) {
            i3 = (int) (Math.min(1.7f, i3 / Math.max(i, i2)) * Math.max(i, i2));
        }
        if (i == 0 || i2 == 0) {
            i = i3;
            i2 = i;
        }
        int i4 = dek0.a;
        VKImageView vKImageView = this.D;
        dek0.b(vKImageView, null, null, 14);
        float f = i;
        vKImageView.setAspectRatio(f / i2);
        if (i > i2) {
            i3 = (int) ((i3 * i2) / f);
        }
        vKImageView.setMaxHeight(i3);
        String str = graffitiAttachment2.h;
        int i5 = graffitiAttachment2.f;
        UserId userId = graffitiAttachment2.g;
        String str2 = GraffitiAttachment.l.get(i5 + BundleUtil.UNDERLINE_TAG + userId);
        if (str2 == null) {
            vKImageView.O0(str, ImageScreenSize.MID);
            return;
        }
        Uri parse = Uri.parse(str2);
        ImageScreenSize imageScreenSize = ImageScreenSize.MID;
        vKImageView.N0(parse, imageScreenSize, Uri.parse(str), imageScreenSize);
    }
}
