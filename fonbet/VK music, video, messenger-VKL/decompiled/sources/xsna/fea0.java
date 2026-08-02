package xsna;

import android.content.Context;
import android.graphics.RectF;
import com.vk.dto.tags.Tag;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: PhotoViewerProductsOverlayController.kt */
/* loaded from: classes18.dex */
public final class fea0 {
    public final Context a;
    public final q530 b;
    public boolean d;
    public final ProductsPhotoOverlayView g;
    public b9u0 h;
    public wlw i;
    public tbq j;
    public final ArrayList c = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final Stack<ctd0> f = new Stack<>();

    public fea0(Context context, q530 q530Var) {
        this.a = context;
        this.b = q530Var;
        ProductsPhotoOverlayView productsPhotoOverlayView = new ProductsPhotoOverlayView(context, null, 6);
        this.g = productsPhotoOverlayView;
        bwt0.p0(productsPhotoOverlayView, false);
        ProductsPhotoOverlayView.a(productsPhotoOverlayView, new in60(this, 7), new w4u(this, 29), null, 12);
    }

    public final void a() {
        RectF a;
        Stack<ctd0> stack;
        ProductsPhotoOverlayView productsPhotoOverlayView;
        b9u0 b9u0Var = this.h;
        if (b9u0Var == null || (a = b9u0Var.a.a()) == null) {
            return;
        }
        ArrayList arrayList = this.e;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            stack = this.f;
            productsPhotoOverlayView = this.g;
            if (!hasNext) {
                break;
            }
            ctd0 ctd0Var = (ctd0) it.next();
            ctd0Var.g(productsPhotoOverlayView);
            stack.push(ctd0Var);
        }
        arrayList.clear();
        if (productsPhotoOverlayView.getWidth() <= 0 || productsPhotoOverlayView.getHeight() <= 0) {
            return;
        }
        float centerX = a.centerX() - (productsPhotoOverlayView.getWidth() / 2);
        RectF rectF = new RectF(a.left - centerX, a.top, a.right - centerX, a.bottom);
        Iterator it2 = this.c.iterator();
        while (it2.hasNext()) {
            Tag tag = (Tag) it2.next();
            boolean z = this.d;
            ctd0 pop = !stack.isEmpty() ? stack.pop() : new ctd0(bwt0.v(this.a), this.b);
            pop.d(tag, z, productsPhotoOverlayView.getContext().getString(R.string.product_photo_pin_remove_accessibility));
            pop.e();
            pop.e = new oe5(14, this, tag);
            pop.f = new sk(20, this, tag);
            pop.h((float) ((tag.g * rectF.width()) + rectF.left), (float) ((tag.h * rectF.height()) + rectF.top), productsPhotoOverlayView, rectF);
            arrayList.add(pop);
        }
        productsPhotoOverlayView.setTranslationX(centerX);
    }
}
