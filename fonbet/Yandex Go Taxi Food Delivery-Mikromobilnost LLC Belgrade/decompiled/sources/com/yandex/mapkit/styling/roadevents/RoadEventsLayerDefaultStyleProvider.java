package com.yandex.mapkit.styling.roadevents;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.yandex.mapkit.road_events.EventTag;
import com.yandex.mapkit.road_events_layer.RoadEventSignificance;
import com.yandex.mapkit.road_events_layer.RoadEventStyle;
import com.yandex.mapkit.road_events_layer.RoadEventStylingProperties;
import com.yandex.mapkit.road_events_layer.StyleProvider;
import com.yandex.mapkit.road_events_layer.TextStyle;
import com.yandex.mapkit.styling.roadevents.internal.DrawableUtils;
import com.yandex.mapkit.styling.roadevents.internal.RoadEventsTagUtilsKt;
import com.yandex.mapkit.styling.roadevents.internal.ScaledImageProvider;
import com.yandex.mapkit.styling.roadevents.internal.TagStyle;
import com.yandex.runtime.image.ImageProvider;
import defpackage.ny61;
import defpackage.scc;
import defpackage.unr0;
import java.lang.ref.WeakReference;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J(\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J2\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u001c\u001a\u00020\u0013H\u0002R\u001c\u0010\u0006\u001a\u0010\u0012\f\u0012\n \b*\u0004\u0018\u00010\u00030\u00030\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lcom/yandex/mapkit/styling/roadevents/RoadEventsLayerDefaultStyleProvider;", "Lcom/yandex/mapkit/road_events_layer/StyleProvider;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "contextWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "tagToStyle", "", "Lcom/yandex/mapkit/road_events/EventTag;", "Lcom/yandex/mapkit/styling/roadevents/internal/TagStyle;", "provideStyle", "", "roadEventStylingProperties", "Lcom/yandex/mapkit/road_events_layer/RoadEventStylingProperties;", "isNightMode", "scaleFactor", "", "style", "Lcom/yandex/mapkit/road_events_layer/RoadEventStyle;", "bestImage", "Lcom/yandex/runtime/image/ImageProvider;", "imageId", "", "isSelected", "isInFuture", "pixelsPerPoint", "Companion", "com.yandex.mapkit.styling.roadevents_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class RoadEventsLayerDefaultStyleProvider implements StyleProvider {
    private static final int BLACK_COLOR = -16777216;
    private static final float EVENT_ON_ROUTE_SCALE_FACTOR = 1.5f;
    private static final int WHITE_COLOR = -1;
    private final WeakReference<Context> contextWeakReference;
    private final Map<EventTag, TagStyle> tagToStyle = RoadEventsTagUtilsKt.createRoadEventsTagToStyle();
    private static final List<PointF> ZOOM_SCALE_FUNCTION = scc.g(new PointF(14.0f, 0.85f), new PointF(15.0f, 0.9f), new PointF(16.0f, 1.0f));
    private static final List<PointF> ZOOM_SCALE_FUNCTION_SELECTED = Collections.singletonList(new PointF(1.0f, 1.0f));
    private static final PointF ROAD_EVENT_IMAGE_ANCHOR = new PointF(0.5f, 1.0f);

    public RoadEventsLayerDefaultStyleProvider(Context context) {
        this.contextWeakReference = new WeakReference<>(context);
    }

    private final ImageProvider bestImage(String imageId, boolean isNightMode, boolean isSelected, boolean isInFuture, float scaleFactor) {
        int drawableResByName;
        String o = unr0.o(isSelected ? "event_pin_" : "event_poi_", imageId, isInFuture ? "_future" : "", isNightMode ? "_night" : "");
        Context context = this.contextWeakReference.get();
        if (context == null || (drawableResByName = DrawableUtils.INSTANCE.getDrawableResByName(context, o)) == 0) {
            return null;
        }
        return new ScaledImageProvider(this.contextWeakReference, drawableResByName, new BigDecimal(String.valueOf(scaleFactor)).setScale(2, RoundingMode.DOWN).floatValue());
    }

    private final float pixelsPerPoint() {
        Context context = this.contextWeakReference.get();
        if (context == null) {
            return 1.0f;
        }
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.density;
    }

    @Override // com.yandex.mapkit.road_events_layer.StyleProvider
    public boolean provideStyle(RoadEventStylingProperties roadEventStylingProperties, boolean isNightMode, float scaleFactor, RoadEventStyle style) {
        Object next;
        int i;
        float pixelsPerPoint = scaleFactor / pixelsPerPoint();
        if (roadEventStylingProperties.isOnRoute()) {
            pixelsPerPoint *= 1.5f;
        }
        float f = pixelsPerPoint;
        List<EventTag> tags = roadEventStylingProperties.getTags();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = tags.iterator();
        while (it.hasNext()) {
            TagStyle tagStyle = this.tagToStyle.get((EventTag) it.next());
            if (tagStyle != null) {
                arrayList.add(tagStyle);
            }
        }
        Iterator it2 = arrayList.iterator();
        if (it2.hasNext()) {
            next = it2.next();
            if (it2.hasNext()) {
                int priority = ((TagStyle) next).getPriority();
                do {
                    Object next2 = it2.next();
                    int priority2 = ((TagStyle) next2).getPriority();
                    if (priority < priority2) {
                        next = next2;
                        priority = priority2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next = null;
        }
        TagStyle tagStyle2 = (TagStyle) next;
        if (tagStyle2 == null) {
            return false;
        }
        Map<RoadEventSignificance, Integer> significanceToZoomMin = tagStyle2.getSignificanceToZoomMin();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<RoadEventSignificance, Integer> entry : significanceToZoomMin.entrySet()) {
            if (roadEventStylingProperties.hasSignificanceGreaterOrEqual(entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = linkedHashMap.isEmpty() ? null : linkedHashMap;
        if (linkedHashMap2 != null) {
            Iterator it3 = linkedHashMap2.entrySet().iterator();
            if (it3.hasNext()) {
                int intValue = ((Number) ((Map.Entry) it3.next()).getValue()).intValue();
                loop2: while (true) {
                    i = intValue;
                    while (it3.hasNext()) {
                        intValue = ((Number) ((Map.Entry) it3.next()).getValue()).intValue();
                        if (i > intValue) {
                            break;
                        }
                    }
                }
                ImageProvider bestImage = bestImage(tagStyle2.getImageId(), isNightMode, roadEventStylingProperties.isSelected(), roadEventStylingProperties.isInFuture(), f);
                if (bestImage == null) {
                    return false;
                }
                style.setZoomMin(i);
                style.setIconImage(bestImage);
                style.setIconAnchor(ROAD_EVENT_IMAGE_ANCHOR);
                style.setZoomScaleFunction(roadEventStylingProperties.isSelected() ? ZOOM_SCALE_FUNCTION_SELECTED : ZOOM_SCALE_FUNCTION);
                style.setCaptionStyle(new TextStyle(10.0f, isNightMode ? -1 : -16777216, Integer.valueOf(isNightMode ? -16777216 : -1)));
                return true;
            }
            ny61.p();
        }
        return false;
    }
}
