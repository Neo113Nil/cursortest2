package com.yandex.go.taxi.order.bubble;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectTapListener;
import defpackage.bbc;
import defpackage.bpo;
import defpackage.cds0;
import defpackage.cma1;
import defpackage.cwa1;
import defpackage.f4c0;
import defpackage.fi70;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.p8h0;
import defpackage.qje;
import defpackage.sls;
import defpackage.w511;
import defpackage.xm00;
import defpackage.xng0;
import defpackage.xw31;
import defpackage.zkh0;
import ru.yandex.taxi.design.bubble.BubbleComponent;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.RobotoTextView;

/* loaded from: classes14.dex */
public final class f extends fi70 {
    public final Context a;
    public final cds0 b;
    public final float c;
    public final i3y w;
    public final i3y x;
    public SimpleOrderBubbleViewHolder$State y = SimpleOrderBubbleViewHolder$State.EXPANDED;
    public final boolean z = true;

    public f(Context context, cds0 cds0Var, float f) {
        this.a = context;
        this.b = cds0Var;
        this.c = f;
        final int i = 0;
        this.w = kotlin.a.a(new sls(this) { // from class: com.yandex.go.taxi.order.bubble.c
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                f fVar = this.b;
                switch (i2) {
                    case 0:
                        return fVar.d(SimpleOrderBubbleViewHolder$State.EXPANDED);
                    default:
                        return fVar.d(SimpleOrderBubbleViewHolder$State.COLLAPSED);
                }
            }
        });
        final int i2 = 1;
        this.x = kotlin.a.a(new sls(this) { // from class: com.yandex.go.taxi.order.bubble.c
            public final /* synthetic */ f b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                f fVar = this.b;
                switch (i22) {
                    case 0:
                        return fVar.d(SimpleOrderBubbleViewHolder$State.EXPANDED);
                    default:
                        return fVar.d(SimpleOrderBubbleViewHolder$State.COLLAPSED);
                }
            }
        });
    }

    @Override // defpackage.nwy0
    public final void applyTheme(ThemeType themeType) {
        ((f4c0) this.w.getValue()).x(c(SimpleOrderBubbleViewHolder$State.EXPANDED));
        ((f4c0) this.x.getValue()).x(c(SimpleOrderBubbleViewHolder$State.COLLAPSED));
    }

    public final void b(xm00 xm00Var, boolean z) {
        SimpleOrderBubbleViewHolder$State simpleOrderBubbleViewHolder$State;
        if (z) {
            simpleOrderBubbleViewHolder$State = SimpleOrderBubbleViewHolder$State.EXPANDED;
        } else {
            if (z) {
                w511.b();
                return;
            }
            simpleOrderBubbleViewHolder$State = SimpleOrderBubbleViewHolder$State.COLLAPSED;
        }
        e(simpleOrderBubbleViewHolder$State);
        f4c0 f4c0Var = (f4c0) this.w.getValue();
        xm00Var.getClass();
        f4c0Var.b(xm00Var);
        ((f4c0) this.x.getValue()).b(xm00Var);
    }

    /* JADX WARN: Type inference failed for: r3v8, types: [android.view.View, com.yandex.go.taxi.order.bubble.SimpleOrderBubbleViewHolder$CollapsedOrderBubbleView] */
    /* JADX WARN: Type inference failed for: r4v3, types: [com.yandex.go.taxi.order.bubble.SimpleOrderBubbleViewHolder$ExpandedOrderBubbleView] */
    public final Bitmap c(SimpleOrderBubbleViewHolder$State simpleOrderBubbleViewHolder$State) {
        View view;
        int i = e.a[simpleOrderBubbleViewHolder$State.ordinal()];
        final Context context = this.a;
        if (i == 1) {
            ?? r4 = new FrameLayout(context) { // from class: com.yandex.go.taxi.order.bubble.SimpleOrderBubbleViewHolder$ExpandedOrderBubbleView
                private final bpo binding;
                private final RobotoTextView title;

                {
                    super(context);
                    LayoutInflater.from(context).inflate(zkh0.expanded_order_bubble_view, this);
                    int i2 = p8h0.bubble;
                    if (((BubbleComponent) cma1.O(i2, this)) != null) {
                        i2 = p8h0.title;
                        RobotoTextView robotoTextView = (RobotoTextView) cma1.O(i2, this);
                        if (robotoTextView != null) {
                            this.binding = new bpo(this, robotoTextView);
                            this.title = robotoTextView;
                            return;
                        }
                    }
                    ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
                    throw null;
                }

                public final RobotoTextView getTitle() {
                    return this.title;
                }
            };
            r4.getTitle().setText(this.b.c);
            view = r4;
        } else {
            if (i != 2) {
                w511.b();
                return null;
            }
            ?? r3 = new FrameLayout(context) { // from class: com.yandex.go.taxi.order.bubble.SimpleOrderBubbleViewHolder$CollapsedOrderBubbleView
                private final bbc binding;
                private final ImageView image;

                {
                    super(context);
                    LayoutInflater.from(context).inflate(zkh0.collapsed_order_bubble_view, this);
                    int i2 = p8h0.image;
                    ImageView imageView = (ImageView) cma1.O(i2, this);
                    if (imageView == null) {
                        ny61.t("Missing required view with ID: ".concat(getResources().getResourceName(i2)));
                        throw null;
                    }
                    this.binding = new bbc(imageView, this);
                    this.image = imageView;
                }

                public final ImageView getImage() {
                    return this.image;
                }
            };
            r3.getImage().setColorFilter(new PorterDuffColorFilter(qje.t(xng0.textMain, r3.getContext()), PorterDuff.Mode.SRC_IN));
            view = r3;
        }
        xw31.r(view);
        return xw31.t(view);
    }

    public final f4c0 d(SimpleOrderBubbleViewHolder$State simpleOrderBubbleViewHolder$State) {
        Bitmap c = c(simpleOrderBubbleViewHolder$State);
        f4c0 f4c0Var = new f4c0(cwa1.d(this.b.a), null, 6);
        f4c0Var.x(c);
        f4c0Var.D(new IconStyle().setAnchor(new PointF(0.5f, 1.2f)));
        f4c0Var.k(this.c);
        f4c0Var.g(new MapObjectTapListener() { // from class: com.yandex.go.taxi.order.bubble.d
            @Override // com.yandex.mapkit.map.MapObjectTapListener
            public final boolean onMapObjectTap(MapObject mapObject, Point point) {
                SimpleOrderBubbleViewHolder$State simpleOrderBubbleViewHolder$State2;
                f fVar = f.this;
                int i = e.a[fVar.y.ordinal()];
                if (i == 1) {
                    simpleOrderBubbleViewHolder$State2 = SimpleOrderBubbleViewHolder$State.COLLAPSED;
                } else {
                    if (i != 2) {
                        w511.b();
                        return false;
                    }
                    simpleOrderBubbleViewHolder$State2 = SimpleOrderBubbleViewHolder$State.EXPANDED;
                }
                fVar.e(simpleOrderBubbleViewHolder$State2);
                return false;
            }
        });
        return f4c0Var;
    }

    public final void e(SimpleOrderBubbleViewHolder$State simpleOrderBubbleViewHolder$State) {
        this.y = simpleOrderBubbleViewHolder$State;
        f4c0 f4c0Var = (f4c0) this.w.getValue();
        boolean z = false;
        boolean z2 = this.z;
        f4c0Var.i(z2 && this.y == SimpleOrderBubbleViewHolder$State.EXPANDED);
        f4c0 f4c0Var2 = (f4c0) this.x.getValue();
        if (z2 && this.y == SimpleOrderBubbleViewHolder$State.COLLAPSED) {
            z = true;
        }
        f4c0Var2.i(z);
    }
}
