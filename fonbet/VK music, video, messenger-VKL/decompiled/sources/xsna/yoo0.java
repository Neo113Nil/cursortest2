package xsna;

import android.content.res.ColorStateList;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.im.ui.components.theme_chooser.c;
import com.vkontakte.android.R;
import xsna.jpo0;

/* compiled from: ThemeActionViewHolder.kt */
/* loaded from: classes2.dex */
public final class yoo0 extends fp6<jpo0.a<?>> {
    public final bpn0 s;

    public yoo0(View view, c.a aVar) {
        super(view, aVar);
        this.s = new bpn0(new akd0(this, 13));
        bwt0.p0(this.o, false);
        W5(e3m.f(R.attr.vk_legacy_button_muted_background, this.itemView.getContext()));
    }

    @Override // xsna.fp6
    public final void V5(jpo0.a<?> aVar) {
        jpo0.a<?> aVar2 = aVar;
        int i = aVar2.c;
        TextView textView = this.p;
        textView.setText(i);
        ColorStateList valueOf = ColorStateList.valueOf(e3m.f(aVar2.e, this.itemView.getContext()));
        textView.setTextColor(valueOf);
        ImageView imageView = (ImageView) this.s.getValue();
        imageView.setImageResource(aVar2.d);
        imageView.setImageTintList(valueOf);
    }
}
