package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.music.LegalNotice;
import com.vkontakte.android.R;

/* compiled from: PodcastLegalNoticeHolder.kt */
/* loaded from: classes3.dex */
public final class uhb0 extends dib0<LegalNotice> {
    public final TextView n;
    public final TextView o;

    public uhb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.podcast_legal_notice, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.subtitle);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        LegalNotice legalNotice = (LegalNotice) obj;
        u1u0.i(this.n, legalNotice != null ? legalNotice.b : null, true);
        u1u0.i(this.o, legalNotice != null ? legalNotice.c : null, true);
    }
}
