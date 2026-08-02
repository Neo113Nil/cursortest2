package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.RouteSummaryBalloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.RouteSummaryDifference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a?\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001b\u001aG\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001c\u0010\u001d\"\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "balloon", "", "isSelected", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;)Z", "isNightMode", "", "backgroundColorIdentifier", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;Z)I", "", "difference", "differenceTextColorIdentifier", "(ZD)I", "defaultTextColorIdentifier", "(Z)I", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/RouteSummaryBalloon;", "Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;", "summaryConvertors", "Landroidx/appcompat/widget/AppCompatTextView;", "textView1", "textView2", "Landroid/view/View;", "space", "Landroid/content/Context;", "context", "Lzy11;", "setSelectedText", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/RouteSummaryBalloon;Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Landroid/content/Context;)V", "setAlternativeText", "(ZLcom/yandex/mapkit/navigation/transport/layer/balloons/RouteSummaryBalloon;Lcom/yandex/mapkit/styling/transportnavigation/SummaryConvertors;Landroidx/appcompat/widget/AppCompatTextView;Landroidx/appcompat/widget/AppCompatTextView;Landroid/view/View;Landroid/content/Context;)V", "", "NEGLECTABLE_TIME_DIFFERENCE", "F", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RouteSummaryBalloonTextureFactoryKt {
    private static final float NEGLECTABLE_TIME_DIFFERENCE = 60.0f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final int backgroundColorIdentifier(Balloon balloon, boolean z) {
        return isSelected(balloon) ? z ? R.color.mapkit_styling_transport_route_summary_balloon_selected_background_night : R.color.mapkit_styling_transport_route_summary_balloon_selected_background_day : z ? R.color.mapkit_styling_transport_route_summary_balloon_unselected_background_night : R.color.mapkit_styling_transport_route_summary_balloon_unselected_background_day;
    }

    private static final int defaultTextColorIdentifier(boolean z) {
        return z ? R.color.mapkit_styling_transport_route_summary_balloon_text_night : R.color.mapkit_styling_transport_route_summary_balloon_text_day;
    }

    private static final int differenceTextColorIdentifier(boolean z, double d) {
        return d > 0.0d ? z ? R.color.mapkit_styling_transport_route_summary_balloon_slower_text_night : R.color.mapkit_styling_transport_route_summary_balloon_slower_text_day : z ? R.color.mapkit_styling_transport_route_summary_balloon_faster_text_night : R.color.mapkit_styling_transport_route_summary_balloon_faster_text_day;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSelected(Balloon balloon) {
        return balloon.getRouteSummary().getDifference() == null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setAlternativeText(boolean z, RouteSummaryBalloon routeSummaryBalloon, SummaryConvertors summaryConvertors, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view, Context context) {
        RouteSummaryDifference.Pair time = routeSummaryBalloon.getDifference().getTime();
        view.setVisibility(8);
        appCompatTextView2.setAlpha(1.0f);
        if (!summaryConvertors.neglectableTimeDifference(time)) {
            appCompatTextView.setVisibility(8);
            appCompatTextView2.setText(summaryConvertors.timeDifferenceToString(time));
            appCompatTextView2.setTextColor(context.getColor(differenceTextColorIdentifier(z, time.getBallonValue() - time.getSelectedRouteValue())));
            appCompatTextView2.setVisibility(0);
            return;
        }
        int color = context.getColor(defaultTextColorIdentifier(z));
        appCompatTextView.setText(context.getString(R.string.mapkit_styling_transport_alternative_same_time_text));
        appCompatTextView.setTextColor(color);
        appCompatTextView.setVisibility(0);
        appCompatTextView2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setSelectedText(RouteSummaryBalloon routeSummaryBalloon, SummaryConvertors summaryConvertors, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, View view, Context context) {
        appCompatTextView.setText(summaryConvertors.timeToString(routeSummaryBalloon.getSummary().getWeight().getTime().getValue()));
        appCompatTextView.setTextColor(context.getColor(R.color.mapkit_styling_transport_route_summary_balloon_selected_text));
        appCompatTextView.setVisibility(0);
        appCompatTextView2.setText(summaryConvertors.distanceToString(routeSummaryBalloon.getSummary().getWeight().getWalkingDistance().getValue()));
        appCompatTextView2.setVisibility(0);
        appCompatTextView2.setTextColor(context.getColor(R.color.mapkit_styling_transport_route_summary_balloon_selected_text));
        appCompatTextView2.setAlpha(0.7f);
        view.setVisibility(0);
    }
}
