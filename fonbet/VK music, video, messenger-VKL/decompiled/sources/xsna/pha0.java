package xsna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.view.ViewConfiguration;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.tool.view.feed.ProductsPhotoOverlayView;
import com.vk.feed.tool.view.posting.zoomimage.ZoomImageView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Stack;
import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: PickedProductsOverlayController.kt */
@SuppressLint({"ClickableViewAccessibility"})
/* loaded from: classes4.dex */
public final class pha0 implements w8i {
    public final ProductsPhotoOverlayView b;
    public ZoomImageView c;
    public final bpn0 d;
    public final ArrayList e;
    public boolean f;
    public final ArrayList g;
    public final Stack<dtd0> h;
    public o0o0 i;
    public final int j;
    public final float k;
    public via0 l;
    public Float m;
    public Float n;
    public Photo o;
    public m1o p;

    public pha0(Context context) {
        ProductsPhotoOverlayView productsPhotoOverlayView = new ProductsPhotoOverlayView(context, null, 6);
        this.b = productsPhotoOverlayView;
        this.d = new bpn0(new tu80(this, 5));
        this.e = new ArrayList();
        this.g = new ArrayList();
        this.h = new Stack<>();
        this.j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.k = iah0.b(20.0f) + ViewConfiguration.get(context).getScaledTouchSlop();
        ProductsPhotoOverlayView.a(productsPhotoOverlayView, new dj60(this, 8), new aq0(10), new fv90(this, 3), 4);
        productsPhotoOverlayView.setOnTouchListener(new m43(this, 1));
    }

    public final void a(via0 via0Var, float f, float f2) {
        RectF rectF;
        o0o0 o0o0Var;
        m1o m1oVar = this.p;
        if (m1oVar == null || (rectF = (RectF) m1oVar.invoke()) == null) {
            return;
        }
        double e = swe0.e((f - rectF.left) / rectF.width(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d);
        double e2 = swe0.e((f2 - rectF.top) / rectF.height(), ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 1.0d);
        Photo photo = this.o;
        if (photo == null || (o0o0Var = this.i) == null) {
            return;
        }
        o0o0Var.a(photo, via0Var, e, e2);
    }

    public final void b() {
        RectF rectF;
        Stack<dtd0> stack;
        ProductsPhotoOverlayView productsPhotoOverlayView;
        m1o m1oVar = this.p;
        if (m1oVar == null || (rectF = (RectF) m1oVar.invoke()) == null) {
            return;
        }
        ArrayList arrayList = this.g;
        Iterator it = arrayList.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            stack = this.h;
            productsPhotoOverlayView = this.b;
            if (!hasNext) {
                break;
            }
            dtd0 dtd0Var = (dtd0) it.next();
            dtd0Var.g(productsPhotoOverlayView);
            stack.push(dtd0Var);
        }
        arrayList.clear();
        if (productsPhotoOverlayView.getMeasuredWidth() <= 0 || productsPhotoOverlayView.getMeasuredHeight() <= 0) {
            return;
        }
        Iterator it2 = this.e.iterator();
        int i = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            via0 via0Var = (via0) next;
            boolean z = this.f;
            dtd0 pop = !stack.isEmpty() ? stack.pop() : ((e390) this.d.getValue()).b(productsPhotoOverlayView.getContext());
            pop.d(via0Var.getTag(), z, productsPhotoOverlayView.getContext().getString(R.string.product_photo_pin_remove_accessibility));
            pop.e();
            pop.f(new xk(24, this, via0Var));
            pop.a(new kg(19, this, via0Var));
            pop.h((float) ((via0Var.getTag().g * rectF.width()) + rectF.left), (float) ((via0Var.getTag().h * rectF.height()) + rectF.top), productsPhotoOverlayView, rectF);
            arrayList.add(pop);
            it2 = it2;
            i = i2;
        }
    }
}
