package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.PaintDrawable;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.mapkit.navigation.transport.ArrivalTime;
import com.yandex.mapkit.navigation.transport.BoardingTransportInfo;
import com.yandex.mapkit.navigation.transport.layer.balloons.MasstransitGetOffBalloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.MasstransitGetOnBalloon;
import com.yandex.runtime.i18n.I18nManagerFactory;
import defpackage.evu0;
import defpackage.ny61;
import defpackage.scc;
import defpackage.w511;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000Z\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001f\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u001f\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001a\u001a/\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a/\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\"\u0010#\u001a/\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$2\u0006\u0010!\u001a\u00020 2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b&\u0010'\u001a/\u0010(\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\f\u001a\u00020\u0007H\u0000¢\u0006\u0004\b(\u0010\u001d\"\u0014\u0010)\u001a\u00020\u00008\u0002X\u0082T¢\u0006\u0006\n\u0004\b)\u0010*\"\u0018\u0010-\u001a\u00020\r*\u00020 8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"", RemoteBioParameters.TIME, "", "durationToString", "(I)Ljava/lang/String;", "Landroidx/appcompat/widget/AppCompatTextView;", "timeView", "Landroid/view/View;", "dotView", "Landroid/content/Context;", "context", "Lcom/yandex/mapkit/navigation/transport/BoardingTransportInfo;", "info", "", "isNightMode", "Lzy11;", "setGetOnArrivalTime", "(Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Landroid/content/Context;Lcom/yandex/mapkit/navigation/transport/BoardingTransportInfo;Z)V", "Lcom/yandex/mapkit/navigation/transport/ArrivalTime$Type;", "type", "arrivalTimeTextColor", "(ZLcom/yandex/mapkit/navigation/transport/ArrivalTime$Type;)I", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/MasstransitGetOffBalloon;", "balloon", "view", "setGetOffArrivalTime", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/MasstransitGetOffBalloon;Landroid/view/View;)V", "setGetOffStopName", "setGetOffExitName", "(Landroid/content/Context;ZLcom/yandex/mapkit/navigation/transport/layer/balloons/MasstransitGetOffBalloon;Landroid/view/View;)V", "Landroid/widget/LinearLayout;", "table", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/MasstransitGetOnBalloon;", "getOn", "setupGetOnTable", "(Landroid/widget/LinearLayout;Lcom/yandex/mapkit/navigation/transport/layer/balloons/MasstransitGetOnBalloon;Landroid/content/Context;Z)V", "Lcom/yandex/mapkit/styling/transportnavigation/StrokeTextView;", "textView", "setUpPointName", "(Lcom/yandex/mapkit/styling/transportnavigation/StrokeTextView;Lcom/yandex/mapkit/navigation/transport/layer/balloons/MasstransitGetOnBalloon;Landroid/content/Context;Z)V", "setupGetOffInfo", "MAX_SHORT_LINE_NAME_LENGTH", CA20Status.STATUS_USER_I, "getVerticalOrientation", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/MasstransitGetOnBalloon;)Z", "verticalOrientation", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class MasstransitManoeuvreKt {
    private static final int MAX_SHORT_LINE_NAME_LENGTH = 15;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ArrivalTime.Type.values().length];
            try {
                iArr[ArrivalTime.Type.ESTIMATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ArrivalTime.Type.SCHEDULED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ArrivalTime.Type.PERIODICAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final int arrivalTimeTextColor(boolean z, ArrivalTime.Type type) {
        return type == ArrivalTime.Type.ESTIMATED ? R.color.mapkit_styling_transport_balloon_estimated_time_color : z ? R.color.mapkit_styling_transport_balloon_text_primary_night_color : R.color.mapkit_styling_transport_balloon_text_primary_day_color;
    }

    private static final String durationToString(int i) {
        return I18nManagerFactory.getI18nManagerInstance().localizeDuration(Math.max(1, i));
    }

    private static final boolean getVerticalOrientation(MasstransitGetOnBalloon masstransitGetOnBalloon) {
        boolean z;
        boolean z2;
        List<BoardingTransportInfo> transports = masstransitGetOnBalloon.getTransports();
        if (!(transports instanceof Collection) || !transports.isEmpty()) {
            Iterator<T> it = transports.iterator();
            while (it.hasNext()) {
                if (((BoardingTransportInfo) it.next()).getArrivalTime() != null) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        List<BoardingTransportInfo> transports2 = masstransitGetOnBalloon.getTransports();
        if (!(transports2 instanceof Collection) || !transports2.isEmpty()) {
            Iterator<T> it2 = transports2.iterator();
            while (it2.hasNext()) {
                if (((BoardingTransportInfo) it2.next()).getLineName().length() >= 15) {
                    z2 = true;
                    break;
                }
            }
        }
        z2 = false;
        return z || z2;
    }

    private static final void setGetOffArrivalTime(MasstransitGetOffBalloon masstransitGetOffBalloon, View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_time);
        if (masstransitGetOffBalloon.getArrivalTime() == null) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setText(durationToString((int) ((masstransitGetOffBalloon.getArrivalTime().longValue() - System.currentTimeMillis()) / 1000)));
            appCompatTextView.setVisibility(0);
        }
    }

    private static final void setGetOffExitName(Context context, boolean z, MasstransitGetOffBalloon masstransitGetOffBalloon, View view) {
        View findViewById = view.findViewById(R.id.text_exit_frame);
        String exitName = masstransitGetOffBalloon.getExitName();
        if (exitName == null || evu0.J(exitName)) {
            findViewById.setVisibility(8);
            return;
        }
        findViewById.setVisibility(0);
        View findViewById2 = findViewById.findViewById(R.id.text_exit_outline);
        AppCompatTextView appCompatTextView = (AppCompatTextView) findViewById2.findViewById(R.id.text_exit);
        PaintDrawable paintDrawable = new PaintDrawable(context.getColor(z ? R.color.mapkit_styling_transport_masstransit_exit_name_outline_night_color : R.color.mapkit_styling_transport_masstransit_exit_name_outline_day_color));
        paintDrawable.setCornerRadius(context.getResources().getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_exit_name_corner_radius));
        findViewById2.setBackground(paintDrawable);
        PaintDrawable paintDrawable2 = new PaintDrawable(context.getColor(z ? R.color.mapkit_styling_transport_masstransit_exit_name_background_night_color : R.color.mapkit_styling_transport_masstransit_exit_name_background_day_color));
        paintDrawable2.setCornerRadius(context.getResources().getDimension(R.dimen.mapkit_styling_transport_masstransit_manoeuvre_exit_name_corner_radius));
        appCompatTextView.setBackground(paintDrawable2);
        appCompatTextView.setTextColor(context.getColor(z ? R.color.mapkit_styling_transport_masstransit_exit_name_night_color : R.color.mapkit_styling_transport_masstransit_exit_name_day_color));
        appCompatTextView.setText(masstransitGetOffBalloon.getExitName());
    }

    private static final void setGetOffStopName(MasstransitGetOffBalloon masstransitGetOffBalloon, View view) {
        AppCompatTextView appCompatTextView = (AppCompatTextView) view.findViewById(R.id.text_stop);
        if (evu0.J(masstransitGetOffBalloon.getStopName())) {
            appCompatTextView.setVisibility(8);
        } else {
            appCompatTextView.setText(masstransitGetOffBalloon.getStopName());
            appCompatTextView.setVisibility(0);
        }
    }

    private static final void setGetOnArrivalTime(AppCompatTextView appCompatTextView, View view, Context context, BoardingTransportInfo boardingTransportInfo, boolean z) {
        ArrivalTime arrivalTime = boardingTransportInfo.getArrivalTime();
        if (arrivalTime == null) {
            appCompatTextView.setVisibility(8);
            view.setVisibility(8);
            return;
        }
        appCompatTextView.setTextColor(context.getColor(arrivalTimeTextColor(z, arrivalTime.getType())));
        view.setVisibility(arrivalTime.getType() == ArrivalTime.Type.ESTIMATED ? 0 : 8);
        int i = WhenMappings.$EnumSwitchMapping$0[arrivalTime.getType().ordinal()];
        if (i == 1 || i == 2) {
            appCompatTextView.setText(durationToString((int) (arrivalTime.getTime().getValue() - (System.currentTimeMillis() / 1000))));
            appCompatTextView.setVisibility(0);
        } else if (i != 3) {
            w511.b();
        } else {
            appCompatTextView.setText(ViewUtilsKt.localizeLabel(context, R.string.mapkit_styling_transport_masstransit_periodical, durationToString((int) arrivalTime.getTime().getValue())));
            appCompatTextView.setVisibility(0);
        }
    }

    public static final void setUpPointName(StrokeTextView strokeTextView, MasstransitGetOnBalloon masstransitGetOnBalloon, Context context, boolean z) {
        strokeTextView.setTextColor(context.getColor(z ? R.color.mapkit_styling_transport_balloon_text_primary_night_color : R.color.mapkit_styling_transport_balloon_text_primary_day_color));
        strokeTextView.setStrokeColor(context.getColor(z ? R.color.mapkit_styling_transport_balloon_floating_night_color : R.color.mapkit_styling_transport_balloon_floating_day_color));
        strokeTextView.setText(masstransitGetOnBalloon.getStopName());
    }

    public static final void setupGetOffInfo(Context context, boolean z, MasstransitGetOffBalloon masstransitGetOffBalloon, View view) {
        setGetOffArrivalTime(masstransitGetOffBalloon, view);
        setGetOffStopName(masstransitGetOffBalloon, view);
        setGetOffExitName(context, z, masstransitGetOffBalloon, view);
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f6, code lost:
    
        if (r2 < r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        r16.addView(android.view.LayoutInflater.from(r18).inflate(com.yandex.mapkit.styling.transportnavigation.R.layout.mapkit_styling_transport_layout_masstransit_get_on_row, (android.view.ViewGroup) r16, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0109, code lost:
    
        if (r2 < 0) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x010b, code lost:
    
        r5 = 0;
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0111, code lost:
    
        if (r6 >= r16.getChildCount()) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0113, code lost:
    
        r7 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0116, code lost:
    
        if (r7 == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        r7 = r6 + 1;
        r6 = r16.getChildAt(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011e, code lost:
    
        if (r6 == null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0120, code lost:
    
        r8 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0122, code lost:
    
        if (r2 != r5) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0168, code lost:
    
        r6 = r7;
        r5 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0124, code lost:
    
        r6.setVisibility(0);
        com.yandex.mapkit.styling.transportnavigation.MasstransitLineImageKt.setMasstransitLineImageWithOutline(r18, r6.findViewById(com.yandex.mapkit.styling.transportnavigation.R.id.line_image_with_outline), r15.getLineName(), r15.getShortLineName(), r15.getThreadDescription(), r15.getLineStyle(), r15.getTransportSystemId(), r15.getTransportContours(), r15.getTransportTypes(), r19);
        setGetOnArrivalTime((androidx.appcompat.widget.AppCompatTextView) r6.findViewById(com.yandex.mapkit.styling.transportnavigation.R.id.masstransit_time), r6.findViewById(com.yandex.mapkit.styling.transportnavigation.R.id.masstransit_schedule_dot), r18, r15, r19);
        r2 = r14;
        r11 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x016d, code lost:
    
        defpackage.ny61.s();
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0170, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0171, code lost:
    
        defpackage.ny61.m(defpackage.oyr.e('.', r2, "Sequence doesn't contain element at index "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0178, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0115, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0179, code lost:
    
        defpackage.ny61.m(defpackage.oyr.e('.', r2, "Sequence doesn't contain element at index "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0180, code lost:
    
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void setupGetOnTable(LinearLayout linearLayout, MasstransitGetOnBalloon masstransitGetOnBalloon, Context context, boolean z) {
        boolean verticalOrientation = getVerticalOrientation(masstransitGetOnBalloon);
        linearLayout.setOrientation(verticalOrientation ? 1 : 0);
        int size = masstransitGetOnBalloon.getTransports().size();
        boolean z2 = true;
        Pair pair = (size == 1 && verticalOrientation) ? new Pair(Integer.valueOf(R.drawable.mapkit_styling_transport_schedule_background_medium), Integer.valueOf(R.dimen.mapkit_styling_transport_indent_half)) : size == 1 ? new Pair(Integer.valueOf(R.drawable.mapkit_styling_transport_schedule_background_small), Integer.valueOf(R.dimen.mapkit_styling_transport_indent_quarter)) : verticalOrientation ? new Pair(Integer.valueOf(R.drawable.mapkit_styling_transport_schedule_background_big), Integer.valueOf(R.dimen.mapkit_styling_transport_indent_three_quarters)) : new Pair(Integer.valueOf(R.drawable.mapkit_styling_transport_schedule_background_medium), Integer.valueOf(R.dimen.mapkit_styling_transport_indent_half));
        int intValue = ((Number) pair.getFirst()).intValue();
        int intValue2 = ((Number) pair.getSecond()).intValue();
        linearLayout.setBackgroundResource(intValue);
        linearLayout.setBackgroundTintList(ColorStateList.valueOf(context.getColor(z ? R.color.mapkit_styling_transport_balloon_floating_night_color : R.color.mapkit_styling_transport_balloon_floating_day_color)));
        int dimension = (int) context.getResources().getDimension(intValue2);
        linearLayout.setPadding(dimension, dimension, dimension, dimension);
        int i = 0;
        while (true) {
            if ((i < linearLayout.getChildCount()) != true) {
                int i2 = 0;
                for (BoardingTransportInfo boardingTransportInfo : masstransitGetOnBalloon.getTransports()) {
                    int i3 = i2 + 1;
                    int i4 = 0;
                    int i5 = 0;
                    while (true) {
                        if (!(i5 < linearLayout.getChildCount() ? z2 : false)) {
                            break;
                        }
                        int i6 = i5 + 1;
                        if (linearLayout.getChildAt(i5) == null) {
                            ny61.s();
                            return;
                        }
                        i4++;
                        if (i4 < 0) {
                            scc.l();
                            throw null;
                        }
                        i5 = i6;
                    }
                }
                return;
            }
            int i7 = i + 1;
            View childAt = linearLayout.getChildAt(i);
            if (childAt == null) {
                ny61.s();
                return;
            } else {
                childAt.setVisibility(8);
                i = i7;
            }
        }
    }
}
