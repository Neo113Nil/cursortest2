package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.util.Size;
import android.view.View;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.BaseMapObjectCollection;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.MapObject;
import com.yandex.mapkit.map.MapObjectCollection;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.mapview.MapView;
import com.yandex.runtime.image.AnimatedImageProvider;
import com.yandex.runtime.image.ImageProvider;
import java.util.List;
import ru.yandex.taxi.map.utils.a;
import ru.yandex.taxi.map_common.map.wrap.MapObjectAccessibilityPlaceMarkView;

/* loaded from: classes6.dex */
public final class f4c0 extends u15 {
    public float i;
    public float j;
    public ImageProvider k;
    public PlacemarkAnimation l;
    public IconStyle m;
    public t26 n;
    public boolean o;
    public List p;
    public final a75 q;
    public MapObjectAccessibilityPlaceMarkView r;
    public final PlacemarkMapObject s;
    public final boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4c0(Point point, PlacemarkMapObject placemarkMapObject, int i) {
        super(PlacemarkMapObject.class, point);
        placemarkMapObject = (i & 2) != 0 ? null : placemarkMapObject;
        int i2 = 0;
        boolean z = (i & 4) != 0;
        this.j = 1.0f;
        this.q = new a75(this, i2);
        this.s = placemarkMapObject;
        this.t = z;
    }

    public static void w(PlacemarkMapObject placemarkMapObject, Point point) {
        if (placemarkMapObject.isValid()) {
            if (a.J("for placemark map object", point)) {
                placemarkMapObject.setGeometry(point);
            }
        } else {
            hst hstVar = jst.e;
            hstVar.m("PlacemarkMapObject:setGeometryOnInvalidObject").h(null, "Try to set geometry on invalid map object", new IllegalArgumentException());
        }
    }

    public final void A(float f) {
        this.j = f;
        ((PlacemarkMapObject) this.g).setOpacity(f);
    }

    public final void B(AnimatedImageProvider animatedImageProvider) {
        this.k = null;
        this.o = false;
        PlacemarkAnimation useAnimation = ((PlacemarkMapObject) this.g).useAnimation();
        if (useAnimation == null) {
            jst.e.r("setPlacemarkAnimation called on detached mapObject", new NullPointerException("placemarkAnimation is null"));
            return;
        }
        this.l = useAnimation;
        IconStyle iconStyle = this.m;
        a75 a75Var = this.q;
        if (iconStyle != null) {
            useAnimation.setIcon(animatedImageProvider, iconStyle, a75Var);
        } else {
            useAnimation.setIcon(animatedImageProvider, new IconStyle(), a75Var);
        }
    }

    public final void C(List list) {
        this.p = list;
        if (list != null) {
            ((PlacemarkMapObject) this.g).setScaleFunction(list);
        }
    }

    public final void D(IconStyle iconStyle) {
        this.m = iconStyle;
        PlacemarkAnimation placemarkAnimation = this.l;
        boolean z = false;
        if (placemarkAnimation != null && placemarkAnimation.isValid()) {
            z = true;
        }
        if (iconStyle != null) {
            if (this.k != null || z) {
                ((PlacemarkMapObject) this.g).setIconStyle(iconStyle);
            }
        }
    }

    public final void E(Context context, MapView mapView, Size size, Runnable runnable) {
        mapView.removeView(this.r);
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView = new MapObjectAccessibilityPlaceMarkView(context);
        mapObjectAccessibilityPlaceMarkView.setId(View.generateViewId());
        mapObjectAccessibilityPlaceMarkView.setSize(size);
        mapObjectAccessibilityPlaceMarkView.setOnClickListener(new tf(17, runnable));
        this.r = mapObjectAccessibilityPlaceMarkView;
        mapView.addView(mapObjectAccessibilityPlaceMarkView);
    }

    public final void F(ScreenPoint screenPoint) {
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView = this.r;
        IconStyle iconStyle = this.m;
        PointF anchor = iconStyle != null ? iconStyle.getAnchor() : null;
        if (mapObjectAccessibilityPlaceMarkView == null || screenPoint == null || anchor == null) {
            return;
        }
        ScreenPoint screenPoint2 = new ScreenPoint(screenPoint.getX() - (mapObjectAccessibilityPlaceMarkView.getWidth() * anchor.x), screenPoint.getY() - (mapObjectAccessibilityPlaceMarkView.getHeight() * anchor.y));
        mapObjectAccessibilityPlaceMarkView.setX(screenPoint2.getX());
        mapObjectAccessibilityPlaceMarkView.setY(screenPoint2.getY());
    }

    @Override // defpackage.u15, defpackage.ap00
    public final void f() {
        super.f();
        PlacemarkMapObject placemarkMapObject = (PlacemarkMapObject) this.g;
        placemarkMapObject.setDirection(this.i);
        placemarkMapObject.setOpacity(this.j);
        ImageProvider imageProvider = this.k;
        if (imageProvider != null) {
            IconStyle iconStyle = this.m;
            a75 a75Var = this.q;
            if (iconStyle == null) {
                placemarkMapObject.setIcon(imageProvider, a75Var);
            } else {
                placemarkMapObject.setIcon(imageProvider, iconStyle, a75Var);
            }
        }
        List<PointF> list = this.p;
        if (list != null) {
            placemarkMapObject.setScaleFunction(list);
        }
    }

    @Override // defpackage.u15
    public final MapObject l(BaseMapObjectCollection baseMapObjectCollection, Object obj) {
        MapObjectCollection mapObjectCollection = (MapObjectCollection) baseMapObjectCollection;
        Point point = (Point) obj;
        PlacemarkMapObject placemarkMapObject = this.s;
        if (placemarkMapObject == null) {
            placemarkMapObject = mapObjectCollection.addPlacemark();
        }
        w(placemarkMapObject, point);
        return placemarkMapObject;
    }

    @Override // defpackage.u15
    public final /* bridge */ /* synthetic */ void n(MapObject mapObject, Object obj) {
        w((PlacemarkMapObject) mapObject, (Point) obj);
    }

    public final boolean p() {
        return this.t;
    }

    public final float q() {
        Bitmap image;
        ImageProvider imageProvider = this.k;
        return (imageProvider == null || (image = imageProvider.getImage()) == null) ? 0 : image.getHeight();
    }

    public final ImageProvider r() {
        return this.k;
    }

    public final float s() {
        return this.j;
    }

    public final IconStyle t() {
        return this.m;
    }

    public final void u(MapView mapView) {
        MapObjectAccessibilityPlaceMarkView mapObjectAccessibilityPlaceMarkView = this.r;
        if (mapObjectAccessibilityPlaceMarkView != null) {
            mapView.removeView(mapObjectAccessibilityPlaceMarkView);
            int childCount = mapView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = mapView.getChildAt(i);
                if (childAt instanceof MapObjectAccessibilityPlaceMarkView) {
                    mapView.removeView(childAt);
                }
            }
            this.r = null;
        }
    }

    public final void v(float f) {
        this.i = f;
        ((PlacemarkMapObject) this.g).setDirection(f);
    }

    public final void x(Bitmap bitmap) {
        y(ImageProvider.fromBitmap(bitmap));
    }

    public final void y(ImageProvider imageProvider) {
        z(imageProvider, this.m);
    }

    public final boolean z(ImageProvider imageProvider, IconStyle iconStyle) {
        if (this.k == imageProvider) {
            return false;
        }
        this.k = imageProvider;
        PlacemarkAnimation placemarkAnimation = this.l;
        if (placemarkAnimation != null) {
            placemarkAnimation.stop();
        }
        this.l = null;
        this.o = false;
        this.m = iconStyle;
        MapObject mapObject = this.g;
        a75 a75Var = this.q;
        if (iconStyle == null) {
            ((PlacemarkMapObject) mapObject).setIcon(imageProvider, a75Var);
            return true;
        }
        ((PlacemarkMapObject) mapObject).setIcon(imageProvider, iconStyle, a75Var);
        return true;
    }
}
