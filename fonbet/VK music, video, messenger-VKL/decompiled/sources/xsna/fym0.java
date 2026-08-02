package xsna;

import android.view.ViewGroup;
import android.widget.TextView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.data.Subscription;
import com.vkontakte.android.R;

/* compiled from: MusicSubscriptionDetailsAdapter.kt */
/* loaded from: classes3.dex */
public final class fym0 extends se50<a> {
    public final obh n;
    public final TextView o;
    public final TextView p;
    public final TextView q;

    /* compiled from: MusicSubscriptionDetailsAdapter.kt */
    public static final class a {
        public final Subscription a;
        public final VKApiExecutionException b;
        public final boolean c;

        public a(Subscription subscription, VKApiExecutionException vKApiExecutionException, boolean z) {
            this.a = subscription;
            this.b = vKApiExecutionException;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && this.c == aVar.c;
        }

        public final int hashCode() {
            Subscription subscription = this.a;
            int hashCode = (subscription == null ? 0 : subscription.hashCode()) * 31;
            VKApiExecutionException vKApiExecutionException = this.b;
            return Boolean.hashCode(this.c) + qoy.b((hashCode + (vKApiExecutionException == null ? 0 : vKApiExecutionException.hashCode())) * 31, 31, false);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Error(subscription=");
            sb.append(this.a);
            sb.append(", exeption=");
            sb.append(this.b);
            sb.append(", isInAppAvailable=false, requiredSignIn=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }

    public fym0(ViewGroup viewGroup, obh obhVar) {
        super(R.layout.music_subscription_part_error, viewGroup);
        this.n = obhVar;
        this.o = (TextView) this.itemView.findViewById(R.id.music_subscription_error_title);
        this.p = (TextView) this.itemView.findViewById(R.id.music_subscription_error_description);
        TextView textView = (TextView) this.itemView.findViewById(R.id.music_subscription_error_more);
        textView.setOnClickListener(new vr6(this, 8));
        this.q = textView;
    }

    @Override // xsna.se50
    public final void b6(a aVar) {
        a aVar2 = aVar;
        VKApiExecutionException vKApiExecutionException = aVar2.b;
        boolean z = aVar2.c;
        TextView textView = this.q;
        TextView textView2 = this.p;
        if (z) {
            textView2.setText(BuildInfo.k() ? R.string.music_subscription_unavailable_sign_in_required_huawei : BuildInfo.n() ? R.string.music_subscription_unavailable_sign_in_required_rustroe : R.string.music_subscription_unavailable_sign_in_required);
            bwt0.p0(textView, false);
        } else {
            textView2.setText(R.string.music_subscription_screen_error_description);
            bwt0.p0(textView, true);
        }
        bwt0.p0(this.o, false);
    }
}
