package xsna;

import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.vkontakte.android.R;
import java.util.Locale;

/* compiled from: ModalAddPhotoActionView.kt */
/* loaded from: classes3.dex */
public final class dv20 extends vif0<Object> {
    @Override // xsna.vif0
    public final void i6(Object obj) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ylw ylwVar = new ylw(R.drawable.vk_icon_add_24);
        ylwVar.e = -1.0f;
        ylwVar.d = true;
        ylwVar.c = 3;
        ylwVar.f = iah0.a(2);
        ((TextView) this.itemView).setText(spannableStringBuilder.append((CharSequence) ylwVar.b(this.itemView.getContext())).append((CharSequence) rik0.b(8.0f)).append((CharSequence) this.itemView.getContext().getString(R.string.photos_view_add_album).toUpperCase(Locale.ROOT)));
    }
}
