package xsna;

import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.vk.dto.polls.PollBackground;
import com.vk.dto.polls.PollGradient;
import com.vk.dto.polls.PollTile;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import xsna.vrb0;
import xsna.ymb0;

/* compiled from: PollBackgroundViewHolder.kt */
/* loaded from: classes4.dex */
public final class cnb0 extends wif0<PollBackground> {
    public final VKImageView r;
    public final FrameLayout s;

    public cnb0(ViewGroup viewGroup, ymb0.e eVar) {
        super(R.layout.poll_background_item_view, viewGroup, eVar);
        this.r = (VKImageView) this.itemView.findViewById(R.id.poll_background_iv);
        this.s = (FrameLayout) this.itemView.findViewById(R.id.poll_background_overlay_container);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        PollBackground pollBackground = (PollBackground) obj;
        FrameLayout frameLayout = this.s;
        frameLayout.setForeground(null);
        VKImageView vKImageView = this.r;
        vKImageView.setOverlayImage(null);
        if (pollBackground instanceof PollGradient) {
            PollGradient pollGradient = (PollGradient) pollBackground;
            vKImageView.setImageDrawable(new dqb0(pollGradient, iah0.a(4)));
            frameLayout.setForeground(m33.a(R.drawable.bg_poll_bg_thumb, this.itemView.getContext()));
            String str = pollGradient.f;
            if (str != null) {
                frameLayout.setContentDescription(str);
            }
        } else if (pollBackground instanceof PollTile) {
            int i = vrb0.d;
            vKImageView.setDrawableFactory(new urb0(iah0.a(4)));
            vKImageView.load(vrb0.a.a((PollTile) pollBackground, iah0.a(84)).d.d);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(b6(), BitmapFactory.decodeResource(b6(), R.drawable.bg_poll_bg_thumb));
            bitmapDrawable.setColorFilter(-3682860, PorterDuff.Mode.SRC_IN);
            vKImageView.setOverlayImage(bitmapDrawable);
        }
        mcy<Object> mcyVar = this.n;
        q6(epx.f(mcyVar != null ? mcyVar.get() : null, pollBackground));
    }
}
