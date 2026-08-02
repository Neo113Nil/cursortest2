package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.qvg;

/* compiled from: CommunityPartnerBannerViewHolder.kt */
/* loaded from: classes18.dex */
public final class ich extends vfz<dch> {
    public final izs<qvg, s3q0> l;
    public dch m;
    public final TextView n;
    public final TextView o;
    public final VKImageView p;

    /* JADX WARN: Multi-variable type inference failed */
    public ich(ViewGroup viewGroup, izs<? super String, s3q0> izsVar, izs<? super qvg, s3q0> izsVar2) {
        super(R.layout.community_check_list_partner_banner_item, viewGroup);
        this.l = izsVar2;
        this.n = (TextView) this.itemView.findViewById(R.id.header);
        this.o = (TextView) this.itemView.findViewById(R.id.text);
        this.p = (VKImageView) this.itemView.findViewById(R.id.image);
        jjc.g(this.itemView, new ll1(5, (Object) this, (izs) izsVar));
    }

    @Override // xsna.vfz
    public final void W5(dch dchVar) {
        ImageSize Cb;
        String str;
        dch dchVar2 = dchVar;
        this.m = dchVar2;
        ey2.i(this.n, dchVar2.b);
        ey2.i(this.o, dchVar2.c);
        VKImageView vKImageView = this.p;
        if (!vKImageView.isLaidOut() || vKImageView.isLayoutRequested()) {
            vKImageView.addOnLayoutChangeListener(new hch(dchVar2, this));
        } else if (vKImageView.getWidth() > 0 && vKImageView.getHeight() > 0 && (Cb = dchVar2.d.Cb(vKImageView.getWidth(), true, false)) != null && (str = Cb.d.d) != null) {
            vKImageView.load(str);
        }
        dch dchVar3 = this.m;
        this.l.invoke(new qvg.b(dchVar3 != null ? dchVar3.f : null));
    }
}
