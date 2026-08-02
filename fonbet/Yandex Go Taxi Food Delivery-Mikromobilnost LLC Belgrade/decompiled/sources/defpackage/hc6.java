package defpackage;

import android.widget.ImageView;
import kotlin.LazyThreadSafetyMode;
import ru.yandex.taxi.design.utils.a;
import ru.yandex.taxi.widget.scroll.NestedScrollViewAdvanced;

/* loaded from: classes13.dex */
public final class hc6 {
    public final NestedScrollViewAdvanced a;
    public final ImageView b;
    public final a c;
    public boolean d;
    public final i3y e;
    public final i3y f;

    public hc6(NestedScrollViewAdvanced nestedScrollViewAdvanced, ImageView imageView, a aVar) {
        this.a = nestedScrollViewAdvanced;
        this.b = imageView;
        this.c = aVar;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: gc6
            public final /* synthetic */ hc6 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int u;
                int i2 = i;
                hc6 hc6Var = this.b;
                switch (i2) {
                    case 0:
                        u = tje.u(4, hc6Var.a.getContext());
                        break;
                    default:
                        u = tje.r(mtg0.bottom_container_top_corners_radius, hc6Var.a.getContext());
                        break;
                }
                return Integer.valueOf(u);
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = kotlin.a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.f = kotlin.a.b(lazyThreadSafetyMode, new sls(this) { // from class: gc6
            public final /* synthetic */ hc6 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int u;
                int i22 = i2;
                hc6 hc6Var = this.b;
                switch (i22) {
                    case 0:
                        u = tje.u(4, hc6Var.a.getContext());
                        break;
                    default:
                        u = tje.r(mtg0.bottom_container_top_corners_radius, hc6Var.a.getContext());
                        break;
                }
                return Integer.valueOf(u);
            }
        });
    }
}
