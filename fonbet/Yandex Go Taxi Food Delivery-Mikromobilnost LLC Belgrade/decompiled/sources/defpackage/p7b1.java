package defpackage;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.view.View;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.core.view2.divs.a;
import com.yandex.div.internal.view.DivImageView;
import com.yandex.div2.DivImageScale;
import com.yandex.go.address.models.Address;
import com.yandex.go.suggest.DestinationSuggest;
import defpackage.p7b1;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class p7b1 {
    public static final Bitmap a(Bitmap bitmap, DivImageScale divImageScale, View view) {
        float min;
        float u = a.u(view);
        float t = a.t(view);
        int[] iArr = g06.a;
        int i = iArr[divImageScale.ordinal()];
        if (i == 1) {
            return bitmap;
        }
        if (i == 2) {
            min = Math.min(u / bitmap.getWidth(), t / bitmap.getHeight());
        } else if (i == 3) {
            min = Math.max(u / bitmap.getWidth(), t / bitmap.getHeight());
        } else {
            if (i != 4) {
                w511.b();
                return null;
            }
            min = u / bitmap.getWidth();
        }
        return Bitmap.createScaledBitmap(bitmap, (int) (min * bitmap.getWidth()), (int) ((iArr[divImageScale.ordinal()] == 4 ? t / bitmap.getHeight() : min) * bitmap.getHeight()), false);
    }

    public static final Bitmap b(Bitmap bitmap, Div2View div2View, List list, View view) {
        e06 m = div2View.getDiv2Component().m();
        Iterator it = list.iterator();
        Bitmap bitmap2 = bitmap;
        while (it.hasNext()) {
            u06 u06Var = (u06) it.next();
            if (u06Var instanceof s06) {
                bitmap2 = m.a(a.p(Integer.valueOf(((s06) u06Var).a), view.getResources().getDisplayMetrics()), bitmap2);
            } else if ((u06Var instanceof t06) && ffx.W(view)) {
                m.getClass();
                Matrix matrix = new Matrix();
                matrix.preScale(-1.0f, 1.0f);
                bitmap2 = Bitmap.createBitmap(bitmap2, 0, 0, bitmap2.getWidth(), bitmap2.getHeight(), matrix, false);
            }
        }
        return bitmap2;
    }

    public static final void c(final Bitmap bitmap, final DivImageScale divImageScale, final View view, final Div2View div2View, final List list, final tls tlsVar) {
        bitmap.setDensity(160);
        if (divImageScale != DivImageScale.NO_SCALE) {
            DivImageView divImageView = view instanceof DivImageView ? (DivImageView) view : null;
            if (divImageView == null || !a.P(divImageView)) {
                if (!ffx.V(view) || view.isLayoutRequested()) {
                    view.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.yandex.div.core.util.bitmap.BitmapExtensionsKt$applyScaleAndFilters$$inlined$doOnActualLayout$1
                        @Override // android.view.View.OnLayoutChangeListener
                        public void onLayoutChange(View view2, int left, int top, int right, int bottom, int oldLeft, int oldTop, int oldRight, int oldBottom) {
                            view2.removeOnLayoutChangeListener(this);
                            tlsVar.invoke(p7b1.b(p7b1.a(bitmap, divImageScale, view), div2View, list, view));
                        }
                    });
                    return;
                } else {
                    tlsVar.invoke(b(a(bitmap, divImageScale, view), div2View, list, view));
                    return;
                }
            }
        }
        float f = view.getResources().getDisplayMetrics().density;
        tlsVar.invoke(b(Bitmap.createScaledBitmap(bitmap, m810.b(bitmap.getWidth() * f), m810.b(bitmap.getHeight() * f), false), div2View, list, view));
    }

    public static final x3 d(u0j u0jVar, w4l0 w4l0Var) {
        if (u0jVar instanceof tyi) {
            return new fgq0(w4l0Var);
        }
        if (u0jVar instanceof dzi) {
            return new fgq0(w4l0Var, ((dzi) u0jVar).a);
        }
        if (u0jVar instanceof ezi) {
            return new fgq0(w4l0Var, ((ezi) u0jVar).a);
        }
        if ((u0jVar instanceof kzi) || (u0jVar instanceof y111)) {
            return new ggq0(w4l0Var);
        }
        if (!(u0jVar instanceof lzi)) {
            if (u0jVar instanceof e0j) {
                ny61.r("Ride DestinationsEditMode not supported");
                return null;
            }
            w511.b();
            return null;
        }
        DestinationSuggest destinationSuggest = ((lzi) u0jVar).a;
        if (!(destinationSuggest instanceof Address)) {
            ny61.r(oyr.p("Suggest of type ", destinationSuggest.getClass().getSimpleName(), " is not expected"));
            return null;
        }
        Address address = (Address) destinationSuggest;
        String favoriteId = address.getFavoriteId();
        if (favoriteId == null || evu0.J(favoriteId)) {
            return new hgq0(w4l0Var, address.getName(), address.getPlaceType());
        }
        ny61.r("new favorite suggest cannot be an already saved favorite");
        return null;
    }

    public static final u1w e(n751 n751Var) {
        return n751Var.a.g(8);
    }

    public static final u1w f(n751 n751Var) {
        return n751Var.a.h(519);
    }
}
