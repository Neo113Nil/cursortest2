package com.yandex.mapkit.styling.automotivenavigation;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.mapkit.directions.driving.Flags;
import com.yandex.mapkit.navigation.JamType;
import com.yandex.mapkit.navigation.JamTypeColor;
import com.yandex.mapkit.navigation.automotive.layer.NavigationLayerMode;
import com.yandex.mapkit.navigation.automotive.layer.styling.JamStyle;
import com.yandex.mapkit.navigation.automotive.layer.styling.RouteStyle;
import com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider;
import com.yandex.mapkit.styling.ArrowStyle;
import com.yandex.mapkit.styling.LinearTiltFunctionPoints;
import com.yandex.mapkit.styling.LinearZoomFunctionPoints;
import com.yandex.mapkit.styling.PolylineStyle;
import com.yandex.mapkit.styling.ProportionFunction;
import defpackage.scc;
import defpackage.w511;
import java.util.List;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 U2\u00020\u0001:\u0001UB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000f\u001a\u00020\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u0019\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001b\u001a\u00020\t2\b\b\u0002\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ7\u0010\"\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J7\u0010&\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J%\u0010)\u001a\u00020(2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u0013¢\u0006\u0004\b)\u0010*J7\u0010-\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b-\u0010.J7\u00101\u001a\u00020!2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106R\u0014\u00108\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00106R\u0014\u00109\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010:\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u0014\u0010;\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00106R\u0014\u0010<\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00106R\u0014\u0010=\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00106R\u0014\u0010>\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00106R\u0014\u0010?\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u00106R\u0014\u0010@\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00106R\u0014\u0010A\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00106R\u0014\u0010B\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00106R\u0014\u0010C\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u00106R\u0014\u0010D\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u00106R\u0014\u0010E\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00106R\u0014\u0010F\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u00106R\u0014\u0010G\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u00106R\u0014\u0010H\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u00106R\u0014\u0010I\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u00106R\u0014\u0010J\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u00106R\u0014\u0010K\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u00106R\u0014\u0010L\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u00106R\u0014\u0010M\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u00106R\u0014\u0010N\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u00106R\u0014\u0010O\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u00106R\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010RR\u001a\u0010T\u001a\b\u0012\u0004\u0012\u00020P0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010R¨\u0006V"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/DefaultRouteStyleProvider;", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/RouteViewStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "", "y1", "y2", "Lcom/yandex/mapkit/styling/ProportionFunction;", "createLerpTiltFunction", "(FF)Lcom/yandex/mapkit/styling/ProportionFunction;", "", "Landroid/graphics/PointF;", "list", "createLerpZoomFunction", "(Ljava/util/List;)Lcom/yandex/mapkit/styling/ProportionFunction;", "Lcom/yandex/mapkit/directions/driving/Flags;", "flags", "", "isSelected", "minRouteWidth", "(Lcom/yandex/mapkit/directions/driving/Flags;Z)F", "maxRouteWidth", "scale", "selectedRouteWidth", "(F)Lcom/yandex/mapkit/styling/ProportionFunction;", "unselectedRouteWidth", "isNightMode", "Lcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;", "navigationLayerMode", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/JamStyle;", "jamStyle", "Lzy11;", "provideJamStyle", "(Lcom/yandex/mapkit/directions/driving/Flags;ZZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/navigation/automotive/layer/styling/JamStyle;)V", "Lcom/yandex/mapkit/navigation/automotive/layer/styling/RouteStyle;", "routeStyle", "provideRouteStyle", "(Lcom/yandex/mapkit/directions/driving/Flags;ZZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/navigation/automotive/layer/styling/RouteStyle;)V", "", "strokeColor", "(Lcom/yandex/mapkit/directions/driving/Flags;ZZ)I", "Lcom/yandex/mapkit/styling/PolylineStyle;", "polylineStyle", "providePolylineStyle", "(Lcom/yandex/mapkit/directions/driving/Flags;ZZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/styling/PolylineStyle;)V", "Lcom/yandex/mapkit/styling/ArrowStyle;", "arrowStyle", "provideManoeuvreStyle", "(Lcom/yandex/mapkit/directions/driving/Flags;ZZLcom/yandex/mapkit/navigation/automotive/layer/NavigationLayerMode;Lcom/yandex/mapkit/styling/ArrowStyle;)V", "context", "Landroid/content/Context;", "jamBlockedColor", CA20Status.STATUS_USER_I, "jamFreeColor", "jamHardColor", "jamLightColor", "jamUnknownColor", "jamVeryHardColor", "jamOfflineColor", "unselectedJamOfflineColor", "unselectedJamBlockedColorDay", "unselectedJamFreeColorDay", "unselectedJamHardColorDay", "unselectedJamLightColorDay", "unselectedJamUnknownColorDay", "unselectedJamVeryHardColorDay", "unselectedJamBlockedColorNight", "unselectedJamFreeColorNight", "unselectedJamHardColorNight", "unselectedJamLightColorNight", "unselectedJamUnknownColorNight", "unselectedJamVeryHardColorNight", "arrowColor", "arrowOutlineColor", "selectedRouteOutlineColorDay", "unselectedRouteOutlineColorDay", "selectedRouteOutlineColorNight", "unselectedRouteOutlineColorNight", "Lcom/yandex/mapkit/navigation/JamTypeColor;", "enabledJamColors", "Ljava/util/List;", "unselectedJamColorsDay", "unselectedJamColorsNight", "Companion", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultRouteStyleProvider implements RouteViewStyleProvider {
    private static final float ARROW_MAX_LENGTH = 90.0f;
    private static final float ARROW_MIN_LENGTH = 50.0f;
    private static final float ARROW_MIN_ZOOM_MANOEUVRES_VISIBLE = 13.0f;
    private static final float ARROW_OUTLINE_MAX_WIDTH = 1.9f;
    private static final float ARROW_OUTLINE_MIN_WIDTH = 0.8f;
    private static final float ARROW_TRIANGLE_HEIGHT_SCALE = 1.5f;
    private static final float DEFAULT_ARC_APPROXIMATION_STEP = 25.714285f;
    private static final float DEFAULT_GRADIENT_LENGTH = 8.0f;
    private static final float DEFAULT_TURN_RADIUS = 6.0f;
    private static final float PREDICTED_ROUTE_WIDTH = 2.4f;
    private static final float SELECTED_ROUTE_WIDTH = 8.0f;
    private static final float UNSELECTED_ROUTE_WIDTH = 5.6f;
    private final int arrowColor;
    private final int arrowOutlineColor;
    private final Context context;
    private final List<JamTypeColor> enabledJamColors;
    private final int jamBlockedColor;
    private final int jamFreeColor;
    private final int jamHardColor;
    private final int jamLightColor;
    private final int jamOfflineColor;
    private final int jamUnknownColor;
    private final int jamVeryHardColor;
    private final int selectedRouteOutlineColorDay;
    private final int selectedRouteOutlineColorNight;
    private final int unselectedJamBlockedColorDay;
    private final int unselectedJamBlockedColorNight;
    private final List<JamTypeColor> unselectedJamColorsDay;
    private final List<JamTypeColor> unselectedJamColorsNight;
    private final int unselectedJamFreeColorDay;
    private final int unselectedJamFreeColorNight;
    private final int unselectedJamHardColorDay;
    private final int unselectedJamHardColorNight;
    private final int unselectedJamLightColorDay;
    private final int unselectedJamLightColorNight;
    private final int unselectedJamOfflineColor;
    private final int unselectedJamUnknownColorDay;
    private final int unselectedJamUnknownColorNight;
    private final int unselectedJamVeryHardColorDay;
    private final int unselectedJamVeryHardColorNight;
    private final int unselectedRouteOutlineColorDay;
    private final int unselectedRouteOutlineColorNight;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NavigationLayerMode.values().length];
            try {
                iArr[NavigationLayerMode.ROUTE_SELECTION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NavigationLayerMode.GUIDANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public DefaultRouteStyleProvider(Context context) {
        Context localizedContext = LocalizedContextKt.localizedContext(context);
        this.context = localizedContext;
        int color = localizedContext.getColor(R.color.mapkit_styling_automotive_jam_blocked);
        this.jamBlockedColor = color;
        int color2 = localizedContext.getColor(R.color.mapkit_styling_automotive_jam_free);
        this.jamFreeColor = color2;
        int color3 = localizedContext.getColor(R.color.mapkit_styling_automotive_jam_hard);
        this.jamHardColor = color3;
        int color4 = localizedContext.getColor(R.color.mapkit_styling_automotive_jam_light);
        this.jamLightColor = color4;
        int color5 = localizedContext.getColor(R.color.mapkit_styling_automotive_jam_unknown);
        this.jamUnknownColor = color5;
        int color6 = localizedContext.getColor(R.color.mapkit_styling_automotive_jam_very_hard);
        this.jamVeryHardColor = color6;
        this.jamOfflineColor = localizedContext.getColor(R.color.mapkit_styling_automotive_jam_offline);
        this.unselectedJamOfflineColor = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_offline);
        int color7 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_blocked_day);
        this.unselectedJamBlockedColorDay = color7;
        int color8 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_free_day);
        this.unselectedJamFreeColorDay = color8;
        int color9 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_hard_day);
        this.unselectedJamHardColorDay = color9;
        int color10 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_light_day);
        this.unselectedJamLightColorDay = color10;
        int color11 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_unknown_day);
        this.unselectedJamUnknownColorDay = color11;
        int color12 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_very_hard_day);
        this.unselectedJamVeryHardColorDay = color12;
        int color13 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_blocked_night);
        this.unselectedJamBlockedColorNight = color13;
        int color14 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_free_night);
        this.unselectedJamFreeColorNight = color14;
        int color15 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_hard_night);
        this.unselectedJamHardColorNight = color15;
        int color16 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_light_night);
        this.unselectedJamLightColorNight = color16;
        int color17 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_unknown_night);
        this.unselectedJamUnknownColorNight = color17;
        int color18 = localizedContext.getColor(R.color.mapkit_styling_automotive_unselected_jam_very_hard_night);
        this.unselectedJamVeryHardColorNight = color18;
        this.arrowColor = localizedContext.getColor(R.color.mapkit_styling_automotive_route_style_arrow_color);
        this.arrowOutlineColor = localizedContext.getColor(R.color.mapkit_styling_automotive_route_style_arrow_outline_color);
        this.selectedRouteOutlineColorDay = localizedContext.getColor(R.color.mapkit_styling_automotive_route_style_selected_route_outline_color_day);
        this.unselectedRouteOutlineColorDay = localizedContext.getColor(R.color.mapkit_styling_automotive_route_style_unselected_route_outline_color_day);
        this.selectedRouteOutlineColorNight = localizedContext.getColor(R.color.mapkit_styling_automotive_route_style_selected_route_outline_color_night);
        this.unselectedRouteOutlineColorNight = localizedContext.getColor(R.color.mapkit_styling_automotive_route_style_unselected_route_outline_color_night);
        JamType jamType = JamType.BLOCKED;
        JamTypeColor jamTypeColor = new JamTypeColor(jamType, color);
        JamType jamType2 = JamType.FREE;
        JamTypeColor jamTypeColor2 = new JamTypeColor(jamType2, color2);
        JamType jamType3 = JamType.HARD;
        JamTypeColor jamTypeColor3 = new JamTypeColor(jamType3, color3);
        JamType jamType4 = JamType.LIGHT;
        JamTypeColor jamTypeColor4 = new JamTypeColor(jamType4, color4);
        JamType jamType5 = JamType.UNKNOWN;
        JamTypeColor jamTypeColor5 = new JamTypeColor(jamType5, color5);
        JamType jamType6 = JamType.VERY_HARD;
        this.enabledJamColors = scc.g(jamTypeColor, jamTypeColor2, jamTypeColor3, jamTypeColor4, jamTypeColor5, new JamTypeColor(jamType6, color6));
        this.unselectedJamColorsDay = scc.g(new JamTypeColor(jamType, color7), new JamTypeColor(jamType2, color8), new JamTypeColor(jamType3, color9), new JamTypeColor(jamType4, color10), new JamTypeColor(jamType5, color11), new JamTypeColor(jamType6, color12));
        this.unselectedJamColorsNight = scc.g(new JamTypeColor(jamType, color13), new JamTypeColor(jamType2, color14), new JamTypeColor(jamType3, color15), new JamTypeColor(jamType4, color16), new JamTypeColor(jamType5, color17), new JamTypeColor(jamType6, color18));
    }

    private final ProportionFunction createLerpTiltFunction(float y1, float y2) {
        return ProportionFunction.fromTiltFunction(new LinearTiltFunctionPoints((List<PointF>) scc.g(new PointF(0.0f, y1), new PointF(90.0f, y2))));
    }

    private final ProportionFunction createLerpZoomFunction(List<? extends PointF> list) {
        return ProportionFunction.fromZoomFunction(new LinearZoomFunctionPoints((List<PointF>) list));
    }

    private final float maxRouteWidth(Flags flags, boolean isSelected) {
        return minRouteWidth(flags, isSelected) * 2.0f;
    }

    private final float minRouteWidth(Flags flags, boolean isSelected) {
        if (flags.getPredicted()) {
            return PREDICTED_ROUTE_WIDTH;
        }
        if (isSelected) {
            return 8.0f;
        }
        return UNSELECTED_ROUTE_WIDTH;
    }

    private final ProportionFunction selectedRouteWidth(float scale) {
        float f = 9.6f * scale;
        float f2 = 10.8f * scale;
        return createLerpZoomFunction(scc.g(new PointF(1.0f, 8.4f * scale), new PointF(ARROW_MIN_ZOOM_MANOEUVRES_VISIBLE, f), new PointF(14.0f, f), new PointF(15.0f, f2), new PointF(16.0f, f2), new PointF(17.0f, 12.0f * scale), new PointF(18.0f, 14.4f * scale), new PointF(19.0f, 18.0f * scale), new PointF(20.0f, 19.2f * scale), new PointF(21.0f, scale * 20.4f)));
    }

    public static /* synthetic */ ProportionFunction selectedRouteWidth$default(DefaultRouteStyleProvider defaultRouteStyleProvider, float f, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: selectedRouteWidth");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return defaultRouteStyleProvider.selectedRouteWidth(f);
    }

    private final ProportionFunction unselectedRouteWidth(float scale) {
        float f = 8.4f * scale;
        return createLerpZoomFunction(scc.g(new PointF(1.0f, 7.2f * scale), new PointF(ARROW_MIN_ZOOM_MANOEUVRES_VISIBLE, f), new PointF(14.0f, f), new PointF(15.0f, 9.6f * scale), new PointF(16.0f, 10.8f * scale), new PointF(17.0f, 12.0f * scale), new PointF(18.0f, 13.2f * scale), new PointF(19.0f, 16.8f * scale), new PointF(20.0f, 18.0f * scale), new PointF(21.0f, scale * 19.2f)));
    }

    public static /* synthetic */ ProportionFunction unselectedRouteWidth$default(DefaultRouteStyleProvider defaultRouteStyleProvider, float f, int i, Object obj) {
        if (obj != null) {
            w511.x("Super calls with default arguments not supported in this target, function: unselectedRouteWidth");
            return null;
        }
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        return defaultRouteStyleProvider.unselectedRouteWidth(f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public void provideJamStyle(Flags flags, boolean isSelected, boolean isNightMode, NavigationLayerMode navigationLayerMode, JamStyle jamStyle) {
        if (isSelected) {
            jamStyle.setColors(this.enabledJamColors);
        } else if (isNightMode) {
            jamStyle.setColors(this.unselectedJamColorsNight);
        } else {
            jamStyle.setColors(this.unselectedJamColorsDay);
        }
        jamStyle.setGradientLength(8.0f);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public void provideManoeuvreStyle(Flags flags, boolean isSelected, boolean isNightMode, NavigationLayerMode navigationLayerMode, ArrowStyle arrowStyle) {
        arrowStyle.setFillColor(this.arrowColor);
        arrowStyle.setOutlineColor(this.arrowOutlineColor);
        arrowStyle.setOutlineWidth(createLerpTiltFunction(0.8f, ARROW_OUTLINE_MAX_WIDTH));
        arrowStyle.setLength(createLerpTiltFunction(ARROW_MIN_LENGTH, 90.0f));
        arrowStyle.setTriangleHeight(isSelected ? selectedRouteWidth(1.5f) : unselectedRouteWidth(1.5f));
        arrowStyle.setMinZoomVisible(Float.valueOf(ARROW_MIN_ZOOM_MANOEUVRES_VISIBLE));
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public void providePolylineStyle(Flags flags, boolean isSelected, boolean isNightMode, NavigationLayerMode navigationLayerMode, PolylineStyle polylineStyle) {
        polylineStyle.setStrokeColor(strokeColor(flags, isSelected, isNightMode));
        polylineStyle.setStrokeWidth(isSelected ? selectedRouteWidth$default(this, 0.0f, 1, null) : unselectedRouteWidth$default(this, 0.0f, 1, null));
        polylineStyle.setOutlineWidth(isSelected ? createLerpZoomFunction(scc.g(new PointF(1.0f, 0.5f), new PointF(21.0f, 2.0f))) : createLerpZoomFunction(scc.g(new PointF(1.0f, 0.5f), new PointF(21.0f, 1.5f))));
        if (isNightMode) {
            polylineStyle.setOutlineColor((isSelected || flags.getPredicted()) ? this.selectedRouteOutlineColorNight : this.unselectedRouteOutlineColorNight);
        } else {
            polylineStyle.setOutlineColor((isSelected || flags.getPredicted()) ? this.selectedRouteOutlineColorDay : this.unselectedRouteOutlineColorDay);
        }
        polylineStyle.setTurnRadius(6.0f);
        polylineStyle.setArcApproximationStep(DEFAULT_ARC_APPROXIMATION_STEP);
        polylineStyle.setInnerOutlineEnabled(false);
    }

    @Override // com.yandex.mapkit.navigation.automotive.layer.styling.RouteViewStyleProvider
    public void provideRouteStyle(Flags flags, boolean isSelected, boolean isNightMode, NavigationLayerMode navigationLayerMode, RouteStyle routeStyle) {
        boolean z;
        boolean predicted = flags.getPredicted();
        boolean z2 = !predicted;
        routeStyle.setShowRoute(z2);
        routeStyle.setShowBalloons(z2);
        boolean z3 = false;
        routeStyle.setShowRoadEvents(!predicted && isSelected);
        routeStyle.setShowTrafficLights(!predicted && isSelected);
        int i = WhenMappings.$EnumSwitchMapping$0[navigationLayerMode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                w511.b();
                return;
            }
            if (!predicted && isSelected) {
                z = true;
                routeStyle.setShowManoeuvres(z);
                if (!predicted && isSelected) {
                    z3 = true;
                }
                routeStyle.setShowTollRoads(z3);
            }
        }
        z = false;
        routeStyle.setShowManoeuvres(z);
        if (!predicted) {
            z3 = true;
        }
        routeStyle.setShowTollRoads(z3);
    }

    public final int strokeColor(Flags flags, boolean isSelected, boolean isNightMode) {
        return flags.getBuiltOffline() ? isSelected ? this.jamOfflineColor : this.unselectedJamOfflineColor : isSelected ? this.jamUnknownColor : isNightMode ? this.unselectedJamUnknownColorNight : this.unselectedJamUnknownColorDay;
    }
}
