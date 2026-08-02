package com.yandex.mapkit.map;

import com.yandex.mapkit.GraphLevel;
import com.yandex.mapkit.ScreenPoint;
import com.yandex.mapkit.ScreenRect;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.ui.Overlay;
import com.yandex.runtime.view.RenderCountMonitor;
import com.yandex.runtime.view.Surface;
import java.util.List;

/* loaded from: classes7.dex */
public interface MapWindow {
    Overlay addRasterScreenOverlay();

    void addSizeChangedListener(SizeChangedListener sizeChangedListener);

    void addSurface(Surface surface);

    double getFieldOfViewY();

    ScreenPoint getFocusPoint();

    ScreenRect getFocusRect();

    VisibleRegion getFocusRegion();

    ScreenPoint getGestureFocusPoint();

    GestureFocusPointMode getGestureFocusPointMode();

    Map getMap();

    List<ScreenRect> getObjectExclusionRects();

    PointOfView getPointOfView();

    float getScaleFactor();

    int height();

    boolean isValid();

    void removeSizeChangedListener(SizeChangedListener sizeChangedListener);

    void removeSurface(Surface surface);

    Point screenToWorld(ScreenPoint screenPoint);

    void setFieldOfViewY(double d);

    void setFocusPoint(ScreenPoint screenPoint);

    void setFocusRect(ScreenRect screenRect);

    void setGestureFocusPoint(ScreenPoint screenPoint);

    void setGestureFocusPointMode(GestureFocusPointMode gestureFocusPointMode);

    void setMaxFps(int i);

    void setObjectExclusionRects(List<ScreenRect> list);

    void setPointOfView(PointOfView pointOfView);

    void setScaleFactor(float f);

    void startMemoryMetricsCapture();

    void startPerformanceLogging();

    void startPerformanceMetricsCapture();

    RenderCountMonitor startRenderCountMetricsCapture();

    String stopMemoryMetricsCapture();

    String stopPerformanceMetricsCapture();

    int width();

    ScreenPoint worldToScreen(Point point);

    ScreenPoint worldToScreen(Point point, GraphLevel graphLevel);
}
