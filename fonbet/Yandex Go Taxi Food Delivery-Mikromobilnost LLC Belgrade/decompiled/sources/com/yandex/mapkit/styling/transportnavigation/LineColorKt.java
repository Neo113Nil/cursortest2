package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.mapkit.transport.masstransit.TransportType;
import com.yandex.plus.home.feature.webviews.internal.container.ModalContentViewContainer;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\"\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a>\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001a>\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0002\u001aF\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a>\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¨\u0006\u0011"}, d2 = {"lineColorSubway", "", "context", "Landroid/content/Context;", "style", "Lcom/yandex/mapkit/transport/masstransit/Line$Style;", "isNightMode", "", "lineColorOverview", "transportTypes", "", "Lcom/yandex/mapkit/transport/masstransit/TransportType;", "transportContours", "Lcom/yandex/mapkit/transport/masstransit/TransportContour;", "lineColorGuidance", "lineColor", "isGuidanceMode", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LineColorKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransportType.values().length];
            try {
                iArr[TransportType.UNDERGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransportType.BUS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransportType.METROBUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransportType.MINIBUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransportType.DOLMUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransportType.RAILWAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransportType.AEROEXPRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransportType.SUBURBAN_EXPRESS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransportType.TRAMWAY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransportType.RAPID_TRAM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransportType.TROLLEYBUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TransportType.WATER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TransportType.FERRY.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int lineColor(Context context, List<? extends TransportType> list, List<? extends TransportContour> list2, Line.Style style, boolean z, boolean z2) {
        return z ? lineColorGuidance(context, list, list2, style, z2) : lineColorOverview(context, list, list2, style, z2);
    }

    private static final int lineColorGuidance(Context context, List<? extends TransportType> list, List<? extends TransportContour> list2, Line.Style style, boolean z) {
        TransportContour.Style style2;
        TransportContour transportContour = (TransportContour) a.R(list2);
        if (transportContour != null && (style2 = transportContour.getStyle()) != null) {
            Integer mainColorNight = z ? style2.getMainColorNight() : style2.getMainColor();
            if (mainColorNight != null) {
                return (-16777216) | mainColorNight.intValue();
            }
        }
        if (list.contains(TransportType.UNDERGROUND)) {
            return lineColorSubway(context, style, z);
        }
        return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_guidance_mode_night_color : R.color.mapkit_styling_transport_masstransit_guidance_mode_day_color);
    }

    private static final int lineColorOverview(Context context, List<? extends TransportType> list, List<? extends TransportContour> list2, Line.Style style, boolean z) {
        TransportContour.Style style2;
        TransportContour transportContour = (TransportContour) a.R(list2);
        if (transportContour != null && (style2 = transportContour.getStyle()) != null) {
            Integer mainColorNight = z ? style2.getMainColorNight() : style2.getMainColor();
            if (mainColorNight != null) {
                return (-16777216) | mainColorNight.intValue();
            }
        }
        TransportType transportType = (TransportType) a.R(list);
        switch (transportType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transportType.ordinal()]) {
            case 1:
                return lineColorSubway(context, style, z);
            case 2:
            case 3:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_bus_night_color : R.color.mapkit_styling_transport_masstransit_bus_day_color);
            case 4:
            case 5:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_minibus_night_color : R.color.mapkit_styling_transport_masstransit_minibus_day_color);
            case 6:
            case 7:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_train_night_color : R.color.mapkit_styling_transport_masstransit_train_day_color);
            case 8:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_suburban_express_night_color : R.color.mapkit_styling_transport_masstransit_suburban_express_day_color);
            case 9:
            case 10:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_tram_night_color : R.color.mapkit_styling_transport_masstransit_tram_day_color);
            case 11:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_trolley_night_color : R.color.mapkit_styling_transport_masstransit_trolley_day_color);
            case 12:
            case 13:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_water_night_color : R.color.mapkit_styling_transport_masstransit_water_day_color);
            default:
                return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_fallback_night_color : R.color.mapkit_styling_transport_masstransit_fallback_day_color);
        }
    }

    private static final int lineColorSubway(Context context, Line.Style style, boolean z) {
        if ((style != null ? style.getColor() : null) != null) {
            return style.getColor().intValue() | ModalContentViewContainer.BASE_SHADOW_COLOR;
        }
        return context.getColor(z ? R.color.mapkit_styling_transport_masstransit_fallback_night_color : R.color.mapkit_styling_transport_masstransit_fallback_day_color);
    }

    public static final int lineColor(Context context, List<? extends TransportType> list, List<? extends TransportContour> list2, Line.Style style, boolean z) {
        return lineColorOverview(context, list, list2, style, z);
    }
}
