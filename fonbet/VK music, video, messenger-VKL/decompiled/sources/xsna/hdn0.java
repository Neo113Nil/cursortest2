package xsna;

import com.vkontakte.android.R;
import xsna.a7n0;

/* compiled from: SuperAppWidgetSectionButtonV2Item.kt */
/* loaded from: classes6.dex */
public final class hdn0 extends b9n0 {
    public final a7n0.a c;

    public hdn0(a7n0.a aVar) {
        super(aVar);
        this.c = aVar;
    }

    @Override // xsna.zif0
    public final int b() {
        return R.layout.vk_super_app_showcase_section_button_v2;
    }

    @Override // xsna.b9n0
    public final a7n0 c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hdn0) && epx.f(this.c, ((hdn0) obj).c);
    }

    public final int hashCode() {
        return this.c.a.hashCode();
    }

    public final String toString() {
        return "SuperAppWidgetSectionButtonV2Item(action=" + this.c + ')';
    }
}
