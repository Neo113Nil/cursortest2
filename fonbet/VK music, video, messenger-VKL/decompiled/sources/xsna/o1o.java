package xsna;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;

/* compiled from: DonutPostOverlayPlaceholder.kt */
/* loaded from: classes17.dex */
public final class o1o extends ConstraintLayout {
    public final Object t;
    public String u;
    public a v;

    /* compiled from: DonutPostOverlayPlaceholder.kt */
    public static final class a {
        public final CharSequence a;
        public final gzs<s3q0> b;

        public a(CharSequence charSequence, gzs<s3q0> gzsVar) {
            this.a = charSequence;
            this.b = gzsVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Button(title=");
            sb.append((Object) this.a);
            sb.append(", onClick=");
            return uf3.d(sb, this.b, ')');
        }
    }

    public o1o(Context context) {
        super(context, null, 0);
        this.t = msy.a(LazyThreadSafetyMode.NONE, new mxj(this, 5));
        View.inflate(context, R.layout.pds_donut_post_overlay, this);
        setBackground(new ColorDrawable(krv0.l(R.attr.vk_ui_overlay_primary)));
        getContext();
        getPlaceholder().setMode(VkPlaceholder.Mode.Overlay);
        bwt0.f0(getPlaceholder(), e3m.a(R.dimen.vk_ui_spacing_size_m, getContext()), 0, e3m.a(R.dimen.vk_ui_spacing_size_m, getContext()), e3m.a(R.dimen.vk_ui_spacing_size_s, getContext()), 2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final VkPlaceholder getPlaceholder() {
        return (VkPlaceholder) this.t.getValue();
    }

    public final a getButton() {
        return this.v;
    }

    public final String getDescription() {
        return this.u;
    }

    public final void setButton(a aVar) {
        this.v = aVar;
        getContext();
        getPlaceholder().setBottom(aVar != null ? new VkPlaceholder.a.b(new VkPlaceholder.a.C0857a((tlo0) u11.f(tlo0.Companion, aVar.a), (gzs) aVar.b, new VkPlaceholder.a.C0857a.C0858a(new gko(R.drawable.vk_icon_donut_color_16), Integer.valueOf(iah0.a(16)), new x7g(0)), (VkPlaceholder.a.C0857a.C0858a) null, VkButton.Size.Small, VkButton.Mode.Primary, VkButton.Appearance.Overlay, false, 280), null, null, null, 8) : null);
    }

    public final void setDescription(String str) {
        this.u = str;
        getContext();
        VkPlaceholder placeholder = getPlaceholder();
        VkPlaceholder.b bVar = null;
        if (str != null) {
            bVar = new VkPlaceholder.b(new VkPlaceholder.b.c(2, (tlo0) null), new VkPlaceholder.b.C0859b(14, oq.d(tlo0.Companion, str)));
        }
        placeholder.setMiddle(bVar);
    }
}
