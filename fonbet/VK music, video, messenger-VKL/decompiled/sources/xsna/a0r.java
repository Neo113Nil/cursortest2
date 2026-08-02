package xsna;

import android.graphics.RectF;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

/* compiled from: FeedGoodsController.kt */
/* loaded from: classes4.dex */
public final class a0r implements w8i {
    public final ProductsPhotoOverlayView b;
    public q530 c;
    public avj0 d;
    public hk70 e;
    public exi0 f;
    public final ArrayList g = new ArrayList();
    public final Stack<dtd0> h = new Stack<>();
    public final double i = 80.0d;
    public final bpn0 j = new bpn0(new yqf(this, 17));

    public a0r(ProductsPhotoOverlayView productsPhotoOverlayView) {
        this.b = productsPhotoOverlayView;
    }

    public final void a() {
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            dtd0 dtd0Var = (dtd0) it.next();
            dtd0Var.g(this.b);
            this.h.push(dtd0Var);
        }
        arrayList.clear();
    }

    public final void b() {
        hk70 hk70Var;
        List<Tag> list;
        avj0 avj0Var = this.d;
        if (avj0Var != null) {
            RectF rectF = (RectF) avj0Var.invoke();
            a();
            ProductsPhotoOverlayView productsPhotoOverlayView = this.b;
            if (productsPhotoOverlayView.getWidth() <= 0 || productsPhotoOverlayView.getHeight() <= 0 || (hk70Var = this.e) == null || (list = (List) hk70Var.invoke()) == null) {
                return;
            }
            for (Tag tag : list) {
                Stack<dtd0> stack = this.h;
                dtd0 pop = !stack.isEmpty() ? stack.pop() : ((e390) this.j.getValue()).c(productsPhotoOverlayView.getContext(), this.c);
                dtd0.b(pop, tag, false, 6);
                int i = tag.b;
                pop.e();
                pop.f(new cg1(12, this, tag));
                double width = (tag.g * rectF.width()) + rectF.left;
                double d = this.i;
                if (width < d) {
                    width = d;
                }
                pop.h((float) width, (float) ((tag.h * rectF.height()) + rectF.top), productsPhotoOverlayView, rectF);
                this.g.add(pop);
            }
        }
    }
}
