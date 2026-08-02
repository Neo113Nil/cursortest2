package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.dto.discover.carousel.Carousel;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;

/* compiled from: BaseShowAllFooterHolder.kt */
/* loaded from: classes4.dex */
public abstract class nn6<T extends NewsEntry> extends qi6<T> implements View.OnClickListener {
    public final View C;
    public final TextView D;

    public nn6(ViewGroup viewGroup) {
        super(R.layout.news_groups_recommendations_footer, viewGroup);
        View findViewById = this.itemView.findViewById(R.id.btn_show_all);
        this.C = findViewById;
        TextView textView = (TextView) this.itemView.findViewById(R.id.text);
        this.D = textView;
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, dhr0.t.b(R.drawable.vk_icon_chevron_16, R.attr.vk_ui_icon_accent_themed), (Drawable) null);
        findViewById.setOnClickListener(this);
    }

    @Override // xsna.qi6
    public final void E6(T t) {
        String v6;
        tu9 tu9Var = (tu9) this;
        LinkButton linkButton = ((Carousel) t).i;
        if (linkButton == null || (v6 = linkButton.b) == null) {
            v6 = tu9Var.v6(R.string.show_all);
        }
        tu9Var.D.setText(v6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        LinkButton linkButton;
        Action action;
        if (!jjc.b() && epx.f(view, this.C)) {
            tu9 tu9Var = (tu9) this;
            Carousel carousel = (Carousel) tu9Var.q6();
            if (carousel != null && (linkButton = carousel.i) != null && (action = linkButton.c) != null) {
                hd60.a().v(action, tu9Var.itemView.getContext(), (r20 & 4) != 0 ? null : null, (r20 & 8) != 0 ? null : null, (r20 & 16) != 0 ? null : null, (r20 & 32) != 0 ? null : null, null, (r20 & 128) != 0 ? null : 423);
            }
            Carousel carousel2 = (Carousel) tu9Var.q6();
            if (carousel2 != null) {
                int i = carousel2.m;
                if (i == 26) {
                    Carousel carousel3 = (Carousel) tu9Var.q6();
                    if (carousel3 != null) {
                        b.d dVar = new b.d("feed_carousel_click_more_button");
                        dVar.b(carousel3.l, "track_code");
                        dVar.e();
                        return;
                    }
                    return;
                }
                switch (i) {
                    case 36:
                    case 37:
                    case 38:
                        Carousel carousel4 = (Carousel) tu9Var.q6();
                        if (carousel4 != null) {
                            b.d dVar2 = new b.d("feed_carousel_click_more_button");
                            dVar2.b(carousel4.l, "track_code");
                            dVar2.b(MusicPlaybackLaunchContext.p.t(), "ref");
                            dVar2.e();
                            break;
                        }
                        break;
                }
            }
        }
    }
}
