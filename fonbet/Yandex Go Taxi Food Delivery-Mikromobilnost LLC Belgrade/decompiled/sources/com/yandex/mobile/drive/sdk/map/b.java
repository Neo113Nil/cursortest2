package com.yandex.mobile.drive.sdk.map;

import android.graphics.Rect;
import android.graphics.RectF;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import com.yandex.mapkit.map.Map;
import com.yandex.mapkit.map.MapWindow;
import defpackage.bvf0;
import defpackage.fs7;
import defpackage.i4n;
import defpackage.l0b1;
import defpackage.ox0;
import defpackage.sls;
import defpackage.wp7;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes15.dex */
public final class b {
    public static final Rect i = new Rect();
    public final i4n a;
    public final MapWindow b;
    public final Map c;
    public final r0 d;
    public final r0 e;
    public final RectF f;
    public final ox0 g;
    public final wp7 h;

    public b(i4n i4nVar) {
        this.a = i4nVar;
        MapWindow mapWindow = (MapWindow) i4nVar.c;
        this.b = mapWindow;
        Map map = mapWindow.getMap();
        this.c = map;
        this.d = bvf0.c(Boolean.FALSE);
        this.e = bvf0.c(new fs7(map.getCameraPosition(), CameraUpdateReason.APPLICATION, false));
        this.f = new RectF();
        this.g = new ox0(1, this);
        this.h = new wp7(0, this);
    }

    public final Object a(Continuation continuation) {
        Object x = e.x(this.d, new CameraController$awaitFocusAnimationEnd$2(2, null), continuation);
        return x == CoroutineSingletons.COROUTINE_SUSPENDED ? x : zy11.a;
    }

    public final void b(boolean z) {
        Rect rect;
        i4n i4nVar = this.a;
        int i2 = i4nVar.b;
        int i3 = i4nVar.a;
        sls slsVar = (sls) i4nVar.e;
        if (slsVar == null || (rect = (Rect) slsVar.invoke()) == null) {
            rect = i;
        }
        if (i3 < 0 || i2 < 0) {
            l0b1.h(new AssertionError("map_focus negative size", null));
            return;
        }
        RectF rectF = this.f;
        ScreenPoint screenPoint = new ScreenPoint(rectF.left, rectF.top);
        float f = i3;
        float f2 = i2;
        ScreenPoint screenPoint2 = new ScreenPoint(f - rectF.right, f2 - rectF.bottom);
        if (i2 == 0 || i3 == 0 || screenPoint.getY() >= screenPoint2.getY() || screenPoint.getX() >= screenPoint2.getX()) {
            return;
        }
        if (screenPoint.getX() < 0.0f || screenPoint.getY() < 0.0f) {
            l0b1.h(new AssertionError("map_focus negative topLeft", null));
            return;
        }
        if (screenPoint2.getX() < 0.0f || screenPoint2.getY() < 0.0f) {
            l0b1.h(new AssertionError("map_focus negative topLeft", null));
            return;
        }
        if (screenPoint2.getX() < screenPoint.getX() || screenPoint2.getY() < screenPoint.getY()) {
            l0b1.h(new AssertionError("map_focus negative sized rect", null));
            return;
        }
        if (screenPoint.getX() + f < screenPoint2.getX()) {
            l0b1.h(new AssertionError("map_focus focus rect too large (width)", null));
            return;
        }
        if (screenPoint.getY() + f2 < screenPoint2.getY()) {
            l0b1.h(new AssertionError("map_focus focus rect too large (height)", null));
            return;
        }
        ScreenRect screenRect = new ScreenRect(screenPoint, screenPoint2);
        ScreenPoint screenPoint3 = new ScreenPoint((screenRect.getBottomRight().getX() + screenRect.getTopLeft().getX()) / 2.0f, (screenRect.getBottomRight().getY() + screenRect.getTopLeft().getY()) / 2.0f);
        Map map = this.c;
        CameraPosition cameraPosition = map.getCameraPosition();
        ScreenPoint screenPoint4 = new ScreenPoint(screenPoint3.getX() - rect.left, screenPoint3.getY() - rect.top);
        MapWindow mapWindow = this.b;
        Point screenToWorld = mapWindow.screenToWorld(screenPoint4);
        try {
            mapWindow.setGestureFocusPoint(null);
            mapWindow.setFocusRect(new ScreenRect(new ScreenPoint(screenRect.getTopLeft().getX() - rect.left, screenRect.getTopLeft().getY() - rect.top), new ScreenPoint(screenRect.getBottomRight().getX() - rect.right, screenRect.getBottomRight().getY() - rect.bottom)));
            r0 r0Var = this.d;
            if (screenToWorld == null) {
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
            } else {
                Boolean bool2 = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool2);
                if (z) {
                    map.move(new CameraPosition(screenToWorld, cameraPosition.getZoom(), cameraPosition.getAzimuth(), cameraPosition.getTilt()));
                }
            }
        } catch (Exception unused) {
            l0b1.h(new AssertionError("map_focus focus rect out of screen", null));
        }
    }
}
