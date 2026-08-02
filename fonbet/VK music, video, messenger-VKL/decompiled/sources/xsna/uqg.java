package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.core.view.components.text.VkText;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: CommunityAddressInfoCell.kt */
/* loaded from: classes17.dex */
public final class uqg extends ConstraintLayout {
    public CharSequence A;
    public CharSequence B;
    public a C;
    public CharSequence D;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public CharSequence z;

    /* compiled from: CommunityAddressInfoCell.kt */
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
            StringBuilder sb = new StringBuilder("MetroStation(iconColor=");
            sb.append(this.a);
            sb.append(", title=");
            return ho8.a(sb, this.b, ')');
        }
    }

    public uqg(Context context) {
        super(context, null, 0);
        ozf ozfVar = new ozf(this, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.t = msy.a(lazyThreadSafetyMode, ozfVar);
        this.u = msy.a(lazyThreadSafetyMode, new u40(this, 27));
        this.v = msy.a(lazyThreadSafetyMode, new v40(this, 25));
        this.w = msy.a(lazyThreadSafetyMode, new w40(this, 25));
        this.x = msy.a(lazyThreadSafetyMode, new ca(this, 27));
        this.y = msy.a(lazyThreadSafetyMode, new px0(this, 26));
        this.z = "";
        this.B = "";
        LayoutInflater.from(context).inflate(R.layout.community_address_info_cell, this);
        int a2 = e3m.a(R.dimen.vk_ui_base_padding_horizontal, context);
        f4m.l(a2, a2, this);
        int a3 = e3m.a(R.dimen.vk_ui_spacing_size_s, context);
        f4m.B(a3, a3, this);
        int b0 = dhr0.b0(R.attr.selectableItemBackground);
        qcy<Object>[] qcyVarArr = bwt0.a;
        dhr0.h0(b0, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getAddressText() {
        return (VkText) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getDistanceText() {
        return (VkText) this.u.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkImageSimple getMetroIcon() {
        return (VkImageSimple) this.w.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getMetroText() {
        return (VkText) this.x.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getTitleText() {
        return (VkText) this.t.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkText getWorkStatusText() {
        return (VkText) this.y.getValue();
    }

    public final CharSequence getAddress() {
        return this.B;
    }

    public final CharSequence getDistance() {
        return this.A;
    }

    public final a getMetroStation() {
        return this.C;
    }

    public final CharSequence getTitle() {
        return this.z;
    }

    public final CharSequence getWorkStatus() {
        return this.D;
    }

    public final void setAddress(CharSequence charSequence) {
        this.B = charSequence;
        getAddressText().setText(charSequence);
    }

    public final void setDistance(CharSequence charSequence) {
        this.A = charSequence;
        if (charSequence == null) {
            getDistanceText().setVisibility(8);
        } else {
            getDistanceText().setVisibility(0);
            getDistanceText().setText(charSequence);
        }
    }

    public final void setMetroStation(a aVar) {
        this.C = aVar;
        if (aVar == null) {
            f4m.j(getMetroIcon());
            f4m.j(getMetroText());
        } else {
            getMetroIcon().setVisibility(0);
            bwt0.o0(getMetroIcon(), aVar.a);
            getMetroText().setVisibility(0);
            getMetroText().setText(aVar.b);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.z = charSequence;
        getTitleText().setText(charSequence);
    }

    public final void setWorkStatus(CharSequence charSequence) {
        this.D = charSequence;
        if (charSequence == null) {
            f4m.j(getWorkStatusText());
        } else {
            getWorkStatusText().setVisibility(0);
            getWorkStatusText().setText(charSequence);
        }
    }
}
