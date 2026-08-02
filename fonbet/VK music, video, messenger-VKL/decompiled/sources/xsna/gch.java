package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;

/* compiled from: CommunityPartnerBannerView.kt */
/* loaded from: classes17.dex */
public final class gch extends ConstraintLayout {
    public final VkText t;
    public final VkText u;
    public final VkText v;
    public final VKImageView w;
    public gzs<s3q0> x;

    /* compiled from: CommunityPartnerBannerView.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        public a(String str, String str2, String str3, String str4) {
            this.a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c) && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PartnerBannerData(header=");
            sb.append(this.a);
            sb.append(", subhead=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", imageUrl=");
            return ho8.a(sb, this.d, ')');
        }
    }

    public gch(Context context) {
        super(context, null, 0);
        View inflate = LayoutInflater.from(context).inflate(R.layout.community_partner_banner_item, (ViewGroup) this, true);
        this.t = (VkText) inflate.findViewById(R.id.header);
        this.u = (VkText) inflate.findViewById(R.id.subhead);
        this.v = (VkText) inflate.findViewById(R.id.text);
        this.w = (VKImageView) inflate.findViewById(R.id.image);
        bwt0.i0((ImageView) inflate.findViewById(R.id.close_button), new t1e(this, 8));
        setLayoutParams(new ConstraintLayout.b(-1, -2));
    }

    public final void setCloseButtonClickListener(gzs<s3q0> gzsVar) {
        this.x = gzsVar;
    }

    public final void setData(a aVar) {
        this.t.setText(aVar.a);
        this.u.setText(aVar.b);
        ey2.i(this.v, aVar.c);
        this.w.load(aVar.d);
    }
}
