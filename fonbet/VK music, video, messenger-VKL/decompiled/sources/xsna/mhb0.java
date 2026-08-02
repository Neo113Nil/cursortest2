package xsna;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import com.vkontakte.android.R;

/* compiled from: PodcastHelpHintHolder.kt */
/* loaded from: classes3.dex */
public final class mhb0 extends dib0<Hint> implements View.OnClickListener {
    public final TextView n;
    public final TextView o;

    public mhb0(ViewGroup viewGroup) {
        super(viewGroup, R.layout.music_podcast_catalog_help_hint, 0);
        this.n = (TextView) this.itemView.findViewById(R.id.title);
        this.o = (TextView) this.itemView.findViewById(R.id.description);
        this.itemView.setOnClickListener(this);
    }

    @Override // xsna.vif0
    public final void i6(Object obj) {
        Hint hint = (Hint) obj;
        this.n.setText(hint.c);
        String str = hint.d;
        TextView textView = this.o;
        textView.setText(str);
        bwt0.p0(textView, !(str == null || str.length() == 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Hint hint;
        Context context;
        if (jjc.b() || (hint = (Hint) this.m) == null) {
            return;
        }
        if (epx.f(hint.b, HintId.INFO_PODCASTS_CATALOG_HINT.getId()) && (context = this.l.getContext()) != null) {
            xwk.d().e().a(context, "https://" + a0a.d + "/podcasts");
        }
        pla.e().b().b(hint.b);
    }
}
