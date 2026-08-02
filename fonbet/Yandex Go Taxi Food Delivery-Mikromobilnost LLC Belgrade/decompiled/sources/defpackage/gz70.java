package defpackage;

import android.content.Context;
import com.yandex.go.taxi.order.map_objects.OrderMapBubbleView;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.design.bubble.BubbleComponent;

/* loaded from: classes14.dex */
public final class gz70 {
    public final Context a;
    public final pdc b;
    public final i3y c;
    public final i3y d;
    public final i3y e;

    public gz70(pdc pdcVar, Context context) {
        this.a = context;
        this.b = pdcVar;
        final int i = 0;
        sls slsVar = new sls(this) { // from class: ez70
            public final /* synthetic */ gz70 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                gz70 gz70Var = this.b;
                switch (i2) {
                    case 0:
                        return new OrderMapBubbleView(gz70Var.a, null, 0, 6, null);
                    case 1:
                        return new BubbleComponent(gz70Var.a, null, 0, 6, null);
                    default:
                        return new g7h(gz70Var.a);
                }
            }
        };
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = a.b(lazyThreadSafetyMode, slsVar);
        final int i2 = 1;
        this.d = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ez70
            public final /* synthetic */ gz70 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                gz70 gz70Var = this.b;
                switch (i22) {
                    case 0:
                        return new OrderMapBubbleView(gz70Var.a, null, 0, 6, null);
                    case 1:
                        return new BubbleComponent(gz70Var.a, null, 0, 6, null);
                    default:
                        return new g7h(gz70Var.a);
                }
            }
        });
        final int i3 = 2;
        this.e = a.b(lazyThreadSafetyMode, new sls(this) { // from class: ez70
            public final /* synthetic */ gz70 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i3;
                gz70 gz70Var = this.b;
                switch (i22) {
                    case 0:
                        return new OrderMapBubbleView(gz70Var.a, null, 0, 6, null);
                    case 1:
                        return new BubbleComponent(gz70Var.a, null, 0, 6, null);
                    default:
                        return new g7h(gz70Var.a);
                }
            }
        });
    }

    public final OrderMapBubbleView a() {
        return (OrderMapBubbleView) this.c.getValue();
    }
}
