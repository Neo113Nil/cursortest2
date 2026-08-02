package xsna;

import android.content.Context;
import com.vk.core.ui.modal.VkModal;
import com.vkontakte.android.R;
import java.util.List;

/* compiled from: VotesServicesModalCard.kt */
/* loaded from: classes6.dex */
public final class k7x0 {
    public static final List<a> a = e43.l(new a(new com.vk.movika.tools.controls.seekbar.o(10), R.drawable.vk_icon_services_menu_gifts_56, R.string.votes_services_modal_gifts), new a(new i60(15), R.drawable.vk_icon_services_menu_stickers_56, R.string.votes_services_modal_stickers), new a(new noi(0, 7), R.drawable.vk_icon_services_menu_games_56, R.string.votes_services_modal_games));

    /* compiled from: VotesServicesModalCard.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final wzs<VkModal, Context, s3q0> c;

        public a(wzs wzsVar, int i, int i2) {
            this.a = i;
            this.b = i2;
            this.c = wzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c.equals(aVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return "ServiceItem(iconRes=" + this.a + ", labelRes=" + this.b + ", onClick=" + this.c + ')';
        }
    }
}
