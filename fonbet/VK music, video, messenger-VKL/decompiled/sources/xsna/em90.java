package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.auth.passport.VkPassportView;
import com.vkontakte.android.R;

/* compiled from: PassportUserInformationDelegate.kt */
/* loaded from: classes15.dex */
public final class em90 {
    public final VkPassportView a;
    public final com.vk.core.ui.image.a<View> b;
    public final TextView c;
    public final TextView d;

    /* JADX WARN: Multi-variable type inference failed */
    public em90(VkPassportView vkPassportView, com.vk.core.ui.image.a<? extends View> aVar) {
        this.a = vkPassportView;
        this.b = aVar;
        this.c = (TextView) vkPassportView.findViewById(R.id.vk_passport_title);
        this.d = (TextView) vkPassportView.findViewById(R.id.vk_passport_subtitle);
    }
}
