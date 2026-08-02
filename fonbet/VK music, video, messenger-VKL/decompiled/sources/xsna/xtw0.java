package xsna;

import android.content.Context;
import android.util.Size;
import android.view.Window;
import com.vk.core.ui.floating_view.FloatingViewGesturesHelper;
import com.vkontakte.android.R;
import xsna.ikv0;

/* compiled from: VoipParticipantSettingsNotificationManager.kt */
/* loaded from: classes7.dex */
public final class xtw0 {
    public final Context a;
    public final Window b;

    /* compiled from: VoipParticipantSettingsNotificationManager.kt */
    public static final class a {
        public final int a;
        public final String b;

        public a(int i, String str) {
            this.a = i;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TopNotificationSettings(iconRes=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public xtw0(Context context, Window window) {
        this.a = context;
        this.b = window;
    }

    public final void a(a aVar) {
        ikv0.a aVar2 = new ikv0.a(this.a);
        aVar2.b = true;
        aVar2.i = FloatingViewGesturesHelper.SwipeDirection.VerticalUp;
        aVar2.s = new ikv0.e.b(new gko(R.drawable.vk_icon_cancel_outline_24), new x7g(R.attr.vk_ui_icon_secondary), (Size) null, new yaq0(9), 12);
        aVar2.t = new ikv0.c.C3058c(new gko(aVar.a), new x7g(R.attr.vk_ui_icon_secondary), (Size) null, 12);
        aVar2.u = new ikv0.d(new ikv0.d.c(aVar.b), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        Window window = this.b;
        if (window == null) {
            aVar2.n();
        } else {
            aVar2.p(window);
        }
    }
}
