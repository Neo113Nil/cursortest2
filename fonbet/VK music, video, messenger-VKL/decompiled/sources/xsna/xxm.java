package xsna;

import android.view.View;
import android.view.ViewGroup;
import com.vk.core.tool.view.RatioFrameLayout;
import com.vk.core.view.fresco.FrescoImageView;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.feed.tool.view.newsfeed.digest.DigestLayout;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.VideoAttachment;
import xsna.tps0;

/* compiled from: DigestAutoPlayMediaItem.kt */
/* loaded from: classes4.dex */
public final class xxm extends mym implements ent0 {
    public final u3s0 i;
    public final View j;
    public final View k;
    public final View l;

    public xxm(DigestLayout digestLayout) {
        super(digestLayout);
        u3s0 u3s0Var = new u3s0(this.e, new tps0.a(-1, -1, Float.valueOf(1.0f), 1, cn70.b(4), null, 480), null, 12);
        this.i = u3s0Var;
        View view = u3s0Var.itemView;
        this.e.addView(view, new ViewGroup.LayoutParams(-1, -1));
        this.j = view.findViewById(R.id.attach_title);
        this.k = view.findViewById(R.id.attach_subtitle);
        RatioFrameLayout ratioFrameLayout = (RatioFrameLayout) view.findViewById(R.id.video_wrap);
        this.l = view.findViewById(R.id.space);
        yn3 yn3Var = new yn3(this, 8);
        view.setOnClickListener(yn3Var);
        if (ratioFrameLayout != null) {
            ratioFrameLayout.setOnClickListener(yn3Var);
        }
    }

    @Override // xsna.mym
    public final void b(VideoAttachment videoAttachment) {
        FrescoImageView frescoImageView = this.f;
        frescoImageView.setLocalImage((fxj0) null);
        frescoImageView.setRemoteImage((fxj0) null);
        bwt0.p0(this.g, false);
        bwt0.p0(this.h, false);
        u3s0 u3s0Var = this.i;
        u3s0Var.b7(videoAttachment);
        u3s0Var.i7(1.0f);
        View view = this.j;
        if (view != null) {
            bwt0.p0(view, false);
        }
        View view2 = this.k;
        if (view2 != null) {
            bwt0.p0(view2, false);
        }
        View view3 = this.l;
        if (view3 != null) {
            bwt0.p0(view3, false);
        }
    }

    @Override // xsna.mym, com.vk.feed.tool.view.newsfeed.digest.DigestLayout.d
    /* renamed from: c */
    public final void a(DigestItem digestItem) {
        bwt0.p0(this.i.itemView, digestItem.d() instanceof VideoAttachment);
        super.a(digestItem);
    }

    @Override // xsna.ent0
    public final dnt0 q3() {
        return this.i.L;
    }
}
