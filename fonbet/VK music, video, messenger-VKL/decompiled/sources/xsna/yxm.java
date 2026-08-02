package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.LinkButton;
import com.vk.dto.newsfeed.entries.Digest;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;

/* compiled from: DigestButtonFooterHolder.kt */
/* loaded from: classes4.dex */
public final class yxm extends qi6<Digest> implements View.OnClickListener {
    public final View C;
    public final TextView D;
    public final TextView E;

    public yxm(ViewGroup viewGroup) {
        super(R.layout.news_digest_button_footer, viewGroup);
        this.C = this.itemView.findViewById(R.id.separator);
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.D = textView;
        this.E = (TextView) this.itemView.findViewById(R.id.text);
        textView.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(Digest digest) {
        LinkButton linkButton;
        Digest.Footer footer = digest.l;
        String str = (footer == null || (linkButton = footer.d) == null) ? null : linkButton.b;
        TextView textView = this.D;
        textView.setText(str);
        bwt0.p0(textView, (footer != null ? footer.d : null) != null);
        String str2 = footer != null ? footer.c : null;
        TextView textView2 = this.E;
        textView2.setText(str2);
        String str3 = footer != null ? footer.c : null;
        bwt0.p0(textView2, !(str3 == null || str3.length() == 0));
        bwt0.p0(this.C, !epx.f(r7.i, "grid"));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Digest.Footer footer;
        LinkButton linkButton;
        if (jjc.b()) {
            return;
        }
        Digest q6 = q6();
        di60.w((q6 == null || (footer = q6.l) == null || (linkButton = footer.d) == null) ? null : linkButton.c, this.itemView.getContext(), null, null, null, null, 62);
        Digest q62 = q6();
        if (q62 != null) {
            b.d dVar = new b.d("digest_button_click");
            dVar.b(q62.o, "track_code");
            dVar.e();
        }
    }
}
