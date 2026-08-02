package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.mapkit.transport.masstransit.Line;
import com.yandex.mapkit.transport.masstransit.TransportContour;
import com.yandex.mapkit.transport.masstransit.TransportType;
import defpackage.evu0;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

@Metadata(d1 = {"\u0000R\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\f\u001a\u0004\u0018\u00010\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a!\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\u001ai\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\u0006\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 \u001aG\u0010#\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020!2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b#\u0010$\u001a{\u0010'\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010&\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020\u0002H\u0000¢\u0006\u0004\b'\u0010(\u001as\u0010*\u001a\u00020\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010)\u001a\u00020%2\u0006\u0010\u0019\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u00002\b\u0010\u001b\u001a\u0004\u0018\u00010\u00002\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b*\u0010+¨\u0006,"}, d2 = {"", "transportSystemId", "", "isNightMode", "", "subwayBalloonImage", "(Ljava/lang/String;Z)I", "", "Lcom/yandex/mapkit/transport/masstransit/TransportType;", "transportTypes", "balloonImage", "(Ljava/util/List;Ljava/lang/String;Z)I", "transportType", "getImageForTransportType", "(Lcom/yandex/mapkit/transport/masstransit/TransportType;Ljava/lang/String;Z)Ljava/lang/Integer;", "name", DRMInfoProvider.MediaDRMKeys.PLUGIN_DESCRIPTION, "addDescription", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroidx/appcompat/widget/AppCompatTextView;", "view", "Lcom/yandex/mapkit/transport/masstransit/TransportContour;", "transportContours", "lineName", "shortLineName", "threadDescription", "Lcom/yandex/mapkit/transport/masstransit/Line$Style;", "lineStyle", "Lzy11;", "setTextView", "(Landroid/content/Context;Landroidx/appcompat/widget/AppCompatTextView;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/mapkit/transport/masstransit/Line$Style;Z)V", "Landroidx/appcompat/widget/AppCompatImageView;", "isGuidanceBalloon", "setImageView", "(Landroid/content/Context;Landroidx/appcompat/widget/AppCompatImageView;Ljava/util/List;Ljava/lang/String;ZZ)V", "Landroid/view/View;", "lineImageView", "setMasstransitLineImage", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/mapkit/transport/masstransit/Line$Style;Ljava/lang/String;Ljava/util/List;Ljava/util/List;ZZ)V", "lineImageWithOutlineView", "setMasstransitLineImageWithOutline", "(Landroid/content/Context;Landroid/view/View;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/yandex/mapkit/transport/masstransit/Line$Style;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Z)V", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitLineImageKt {

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
                iArr[TransportType.RAILWAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TransportType.SUBURBAN_EXPRESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TransportType.SUBURBAN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[TransportType.S_BAHN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[TransportType.TRAMWAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[TransportType.RAPID_TRAM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[TransportType.BUS.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[TransportType.METROBUS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[TransportType.MINIBUS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[TransportType.DOLMUS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[TransportType.TROLLEYBUS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[TransportType.WATER.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[TransportType.FERRY.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final String addDescription(String str, String str2) {
        return (str2 == null || evu0.J(str2)) ? str : unr0.o(str, Extension.O_BRAKE_SPACE, str2, Extension.C_BRAKE);
    }

    private static final int balloonImage(List<? extends TransportType> list, String str, boolean z) {
        Integer imageForTransportType = getImageForTransportType((TransportType) a.R(list), str, z);
        if (imageForTransportType != null) {
            return imageForTransportType.intValue();
        }
        Integer imageForTransportType2 = getImageForTransportType((TransportType) a.b0(list), str, z);
        return imageForTransportType2 != null ? imageForTransportType2.intValue() : R.drawable.mapkit_styling_transport_masstransit_bus;
    }

    private static final Integer getImageForTransportType(TransportType transportType, String str, boolean z) {
        switch (transportType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[transportType.ordinal()]) {
            case 1:
                return Integer.valueOf(subwayBalloonImage(str, z));
            case 2:
            case 3:
            case 4:
            case 5:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_masstransit_railway);
            case 6:
            case 7:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_masstransit_tram);
            case 8:
            case 9:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_masstransit_bus);
            case 10:
            case 11:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_masstransit_minibus);
            case 12:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_masstransit_trolleybus);
            case 13:
            case 14:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_masstransit_water);
            default:
                return null;
        }
    }

    private static final void setImageView(Context context, AppCompatImageView appCompatImageView, List<? extends TransportType> list, String str, boolean z, boolean z2) {
        if (z2 && !list.contains(TransportType.UNDERGROUND)) {
            appCompatImageView.setVisibility(8);
            return;
        }
        appCompatImageView.setVisibility(0);
        appCompatImageView.setImageResource(balloonImage(list, str, z));
        appCompatImageView.setPaddingRelative(appCompatImageView.getPaddingStart(), appCompatImageView.getPaddingTop(), (int) context.getResources().getDimension(list.contains(TransportType.UNDERGROUND) ? R.dimen.mapkit_styling_transport_masstransit_line_image_icon_padding_end_subway : R.dimen.mapkit_styling_transport_masstransit_line_image_icon_padding_end), appCompatImageView.getPaddingBottom());
    }

    public static final void setMasstransitLineImage(Context context, View view, String str, String str2, String str3, Line.Style style, String str4, List<? extends TransportContour> list, List<? extends TransportType> list2, boolean z, boolean z2) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.textview);
        AppCompatImageView appCompatImageView = (AppCompatImageView) view.findViewById(R.id.image);
        setTextView(context, appCompatTextView, list2, list, str, str2, str3, style, z);
        setImageView(context, appCompatImageView, list2, str4, z, z2);
        if (list2.contains(TransportType.UNDERGROUND)) {
            view.setBackground(null);
            return;
        }
        PaintDrawable paintDrawable = new PaintDrawable(LineColorKt.lineColor(context, list2, list, style, z));
        paintDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.mapkit_styling_transport_masstransit_line_image_corner_radius));
        view.setBackground(paintDrawable);
    }

    public static final void setMasstransitLineImageWithOutline(Context context, View view, String str, String str2, String str3, Line.Style style, String str4, List<? extends TransportContour> list, List<? extends TransportType> list2, boolean z) {
        setMasstransitLineImage(context, view.findViewById(R.id.line_image), str, str2, str3, style, str4, list, list2, z, true);
        PaintDrawable paintDrawable = new PaintDrawable(context.getColor(z ? R.color.mapkit_styling_transport_masstransit_line_image_outline_manoeuvre_night_color : R.color.mapkit_styling_transport_masstransit_line_image_outline_manoeuvre_day_color));
        paintDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.mapkit_styling_transport_masstransit_line_image_corner_radius));
        view.setBackground(paintDrawable);
    }

    private static final void setTextView(Context context, AppCompatTextView appCompatTextView, List<? extends TransportType> list, List<? extends TransportContour> list2, String str, String str2, String str3, Line.Style style, boolean z) {
        if (!list.contains(TransportType.UNDERGROUND)) {
            appCompatTextView.setText(addDescription(str, str3));
            appCompatTextView.setBackground(null);
            return;
        }
        PaintDrawable paintDrawable = new PaintDrawable(LineColorKt.lineColor(context, list, list2, style, z));
        paintDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.mapkit_styling_transport_masstransit_line_image_corner_radius));
        if (str2 != null) {
            str = str2;
        }
        appCompatTextView.setText(addDescription(str, null));
        appCompatTextView.setBackground(paintDrawable);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    private static final int subwayBalloonImage(String str, boolean z) {
        if (str != null) {
            switch (str.hashCode()) {
                case -988414867:
                    if (str.equals("novosibirsk_metro")) {
                        return z ? R.drawable.mapkit_styling_transport_masstransit_subway_novosibirsk_night : R.drawable.mapkit_styling_transport_masstransit_subway_novosibirsk_day;
                    }
                    break;
                case -175606408:
                    if (str.equals("nizhnynovgorod_metro")) {
                        return z ? R.drawable.mapkit_styling_transport_masstransit_subway_nizhny_novgorod_night : R.drawable.mapkit_styling_transport_masstransit_subway_nizhny_novgorod_day;
                    }
                    break;
                case -172999169:
                    if (str.equals("spb_metro")) {
                        return z ? R.drawable.mapkit_styling_transport_masstransit_subway_saint_petersburg_night : R.drawable.mapkit_styling_transport_masstransit_subway_saint_petersburg_day;
                    }
                    break;
                case 108445035:
                    if (str.equals("samara_metro")) {
                        return z ? R.drawable.mapkit_styling_transport_masstransit_subway_samara_night : R.drawable.mapkit_styling_transport_masstransit_subway_samara_day;
                    }
                    break;
                case 859158900:
                    if (str.equals("moscow_metro")) {
                        return z ? R.drawable.mapkit_styling_transport_masstransit_subway_moscow_night : R.drawable.mapkit_styling_transport_masstransit_subway_moscow_day;
                    }
                    break;
                case 1674721165:
                    if (str.equals("ekaterinburg_metro")) {
                        return z ? R.drawable.mapkit_styling_transport_masstransit_subway_yekaterinburg_night : R.drawable.mapkit_styling_transport_masstransit_subway_yekaterinburg_day;
                    }
                    break;
            }
        }
        return z ? R.drawable.mapkit_styling_transport_masstransit_subway_fallback_night : R.drawable.mapkit_styling_transport_masstransit_subway_fallback_day;
    }
}
