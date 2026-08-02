package xsna;

import android.view.ViewGroup;
import android.widget.ProgressBar;
import com.vk.dto.polls.PhotoPoll;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.taa0;
import xsna.ymb0;

/* compiled from: PollCustomBackgroundViewHolder.kt */
/* loaded from: classes4.dex */
public final class knb0 extends wif0<inb0> {
    public final ProgressBar r;
    public final VKImageView s;

    public knb0(ViewGroup viewGroup, ymb0.f fVar) {
        super(R.layout.poll_custom_background_item_view, viewGroup, fVar);
        this.r = (ProgressBar) this.itemView.findViewById(R.id.poll_upload_progress);
        this.s = (VKImageView) this.itemView.findViewById(R.id.poll_background_iv);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        inb0 inb0Var = (inb0) obj;
        PhotoPoll photoPoll = inb0Var.b;
        VKImageView vKImageView = this.s;
        ProgressBar progressBar = this.r;
        if (photoPoll == null) {
            vKImageView.clear();
            vKImageView.setOverlayImage(null);
            progressBar.setVisibility(0);
            if (progressBar.getProgressDrawable() == null) {
                pdc pdcVar = new pdc(true);
                pdcVar.e = false;
                pdcVar.b();
                progressBar.setProgressDrawable(pdcVar);
                progressBar.setIndeterminate(false);
            }
            progressBar.setProgress(inb0Var.c);
            progressBar.setMax(inb0Var.d);
        } else {
            progressBar.setVisibility(8);
            int a = iah0.a(84);
            int a2 = iah0.a(48);
            int i = taa0.o;
            vKImageView.setDrawableFactory(new saa0(photoPoll.c, a, a2, iah0.a(4)));
            vKImageView.load(taa0.a.a(photoPoll, a, a2).d.d);
            vKImageView.setOverlayImage(m33.a(R.drawable.bg_poll_bg_thumb, this.itemView.getContext()));
        }
        mcy<Object> mcyVar = this.n;
        q6(epx.f(mcyVar != null ? mcyVar.get() : null, inb0Var));
    }
}
