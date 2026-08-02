package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.yandex.mapkit.directions.driving.Flags;
import com.yandex.mapkit.directions.driving.Summary;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.navigation.automotive.layer.RouteSummaryBalloon;
import com.yandex.mapkit.styling.automotive.balloons.BalloonColors;
import com.yandex.mapkit.styling.automotive.balloons.SummaryBalloonColors;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;
import com.yandex.runtime.i18n.I18nManagerFactory;
import defpackage.b64;
import defpackage.g8e;
import defpackage.vuu0;
import defpackage.y5e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u001bH\u0002J\u0018\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\u001e\u0010$\u001a\b\u0012\u0004\u0012\u00020 0%2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#H\u0002J\u0010\u0010&\u001a\u00020#2\u0006\u0010!\u001a\u00020'H\u0002J\u0018\u0010(\u001a\u00020 2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0002J\u0018\u0010)\u001a\u00020\u00122\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0014J\u001a\u0010*\u001a\u0004\u0018\u00010\u00142\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0014J\u0018\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0014J\u0018\u0010,\u001a\u00020 2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0014J\u0018\u0010-\u001a\u00020\t2\u0006\u0010!\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001c\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006/"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/RouteSummaryBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/SingleViewBalloonTextureFactory;", "context", "Landroid/content/Context;", "colors", "Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;", "<init>", "(Landroid/content/Context;Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;)V", "view", "Landroid/view/View;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "plusSign", "", "minusSign", "sameTimeText1", "sameTimeText2", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "shadowParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "selectedBackgroundColor", "Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", "unselectedBackgroundColor", "textStyle", "getTimeDiffText", "summaryBalloon", "Lcom/yandex/mapkit/navigation/automotive/layer/RouteSummaryBalloon;", "tollIconResource", "getTollIconResource", "()Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", "getAlternativeStyleIdentifier", "", "balloon", "isNightMode", "", "getIconIdentifiers", "", "isSelected", "Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;", "getBackgroundColor", "getBalloonParams", "getShadowParams", "getDayBackgroundColor", "getNightBackgroundColor", "createView", "Companion", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class RouteSummaryBalloonTextureFactory extends SingleViewBalloonTextureFactory {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int ICONS_COUNT_MAX = 2;
    private static final float NEGLECTABLE_TIME_DIFFERENCE = 60.0f;
    private final BalloonParams balloonParams;
    private final Context context;
    private final String minusSign;
    private final String plusSign;
    private final String sameTimeText1;
    private final String sameTimeText2;
    private final DayNightRes selectedBackgroundColor;
    private final ShadowParams shadowParams;
    private final DayNightRes textStyle;
    private final DayNightRes unselectedBackgroundColor;
    private final View view;

    public RouteSummaryBalloonTextureFactory(Context context, BalloonColors balloonColors) {
        SummaryBalloonColors summary;
        Integer unselectedBackgroundNight;
        SummaryBalloonColors summary2;
        Integer unselectedBackgroundDay;
        SummaryBalloonColors summary3;
        Integer selectedBackgroundNight;
        SummaryBalloonColors summary4;
        Integer selectedBackgroundDay;
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_route_summary_balloon, (ViewGroup) null);
        this.plusSign = context.getString(R.string.mapkit_styling_automotive_alternative_plus_sign);
        this.minusSign = context.getString(R.string.mapkit_styling_automotive_alternative_minus_sign);
        this.sameTimeText1 = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text1);
        this.sameTimeText2 = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text2);
        this.selectedBackgroundColor = new DayNightRes((balloonColors == null || (summary4 = balloonColors.getSummary()) == null || (selectedBackgroundDay = summary4.getSelectedBackgroundDay()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_day) : selectedBackgroundDay.intValue(), (balloonColors == null || (summary3 = balloonColors.getSummary()) == null || (selectedBackgroundNight = summary3.getSelectedBackgroundNight()) == null) ? context.getColor(R.color.mapkit_styling_automotive_balloon_background_night) : selectedBackgroundNight.intValue());
        this.unselectedBackgroundColor = new DayNightRes((balloonColors == null || (summary2 = balloonColors.getSummary()) == null || (unselectedBackgroundDay = summary2.getUnselectedBackgroundDay()) == null) ? context.getColor(R.color.mapkit_styling_automotive_overview_balloon_unselected_background_day) : unselectedBackgroundDay.intValue(), (balloonColors == null || (summary = balloonColors.getSummary()) == null || (unselectedBackgroundNight = summary.getUnselectedBackgroundNight()) == null) ? context.getColor(R.color.mapkit_styling_automotive_overview_balloon_unselected_background_night) : unselectedBackgroundNight.intValue());
        this.textStyle = new DayNightRes(R.style.MapkitCarOverviewBalloonLargeSelectedTextDay, R.style.MapkitCarOverviewBalloonLargeSelectedTextNight);
        Resources resources = context.getResources();
        this.balloonParams = new BalloonParams(resources.getDimension(R.dimen.mapkit_styling_automotive_size_route_summary_balloon_corner_leg), resources.getDimension(R.dimen.mapkit_styling_automotive_size_route_summary_balloon_corner_leg_innerpart), resources.getDimension(R.dimen.mapkit_styling_automotive_width_route_summary_balloon_center_leg), resources.getDimension(R.dimen.mapkit_styling_automotive_height_route_summary_balloon_center_leg), resources.getDimension(R.dimen.mapkit_styling_automotive_offset_route_summary_balloon_leg), resources.getDimension(R.dimen.mapkit_styling_automotive_corner_radius_route_summary_balloon));
        this.shadowParams = new ShadowParams(context.getColor(R.color.mapkit_styling_automotive_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_automotive_radius_route_summary_balloon_shadow), new PointF(resources.getDimension(R.dimen.mapkit_styling_automotive_offset_x_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_automotive_offset_y_route_summary_balloon_shadow)));
    }

    private final int getAlternativeStyleIdentifier(RouteSummaryBalloon balloon, boolean isNightMode) {
        double value = balloon.getRelativeWeight().getTimeWithTraffic().getValue();
        return Math.abs(value) <= 60.0d ? isNightMode ? R.style.MapkitCarOverviewBalloonSmallSameTimeTextNight : R.style.MapkitCarOverviewBalloonSmallSameTimeTextDay : value > 0.0d ? isNightMode ? R.style.MapkitCarOverviewBalloonSmallSlowerTextNight : R.style.MapkitCarOverviewBalloonSmallSlowerTextDay : isNightMode ? R.style.MapkitCarOverviewBalloonSmallFasterTextNight : R.style.MapkitCarOverviewBalloonSmallFasterTextDay;
    }

    private final int getBackgroundColor(Balloon balloon, boolean isNightMode) {
        return (isSelected(balloon) ? this.selectedBackgroundColor : this.unselectedBackgroundColor).get(isNightMode);
    }

    private final List<Integer> getIconIdentifiers(RouteSummaryBalloon balloon, boolean isNightMode) {
        ArrayList arrayList = new ArrayList();
        Flags flags = balloon.getSummary().getFlags();
        Companion companion = INSTANCE;
        companion.pushIconIfNeeded(arrayList, flags.getBlocked() || flags.getFutureBlocked(), R.drawable.mapkit_styling_automotive_overview_route_flags_blocked);
        companion.pushIconIfNeeded(arrayList, flags.getHasCheckpoints(), R.drawable.mapkit_styling_automotive_overview_route_flags_has_checkpoints);
        companion.pushIconIfNeeded(arrayList, flags.getHasFerries(), R.drawable.mapkit_styling_automotive_overview_route_flags_ferry);
        companion.pushIconIfNeeded(arrayList, flags.getHasTolls(), getTollIconResource().get(isNightMode));
        companion.pushIconIfNeeded(arrayList, flags.getHasRuggedRoads(), R.drawable.mapkit_styling_automotive_overview_route_flags_badroad);
        companion.pushIconIfNeeded(arrayList, flags.getDeadJam(), R.drawable.mapkit_styling_automotive_overview_route_flags_badtraffic);
        companion.pushIconIfNeeded(arrayList, balloon.getTags().contains("green"), R.drawable.mapkit_styling_automotive_overview_route_flags_greenlong);
        companion.pushIconIfNeeded(arrayList, flags.getForParking(), R.drawable.mapkit_styling_automotive_overview_route_flags_parking);
        return arrayList;
    }

    private final String getTimeDiffText(RouteSummaryBalloon summaryBalloon) {
        double value = summaryBalloon.getRelativeWeight().getTimeWithTraffic().getValue();
        if (Math.abs(value) <= 60.0d) {
            return g8e.p(this.sameTimeText1, "\n", this.sameTimeText2);
        }
        return b64.j(value < 0.0d ? this.minusSign : this.plusSign, INSTANCE.timeToString(value));
    }

    private final DayNightRes getTollIconResource() {
        String country = y5e.q(this.context.getResources().getConfiguration()).b(0).getCountry();
        if (country != null) {
            int hashCode = country.hashCode();
            if (hashCode != 2252) {
                if (hashCode != 2339) {
                    if (hashCode != 2627) {
                        if (hashCode != 2686) {
                            if (hashCode != 2700) {
                                if (hashCode == 2718 && country.equals("US")) {
                                    return new DayNightRes(R.drawable.mapkit_styling_automotive_overview_route_flags_usd_day, R.drawable.mapkit_styling_automotive_overview_route_flags_usd_night);
                                }
                            } else if (country.equals("UA")) {
                                return new DayNightRes(R.drawable.mapkit_styling_automotive_overview_route_flags_grivna_day, R.drawable.mapkit_styling_automotive_overview_route_flags_grivna_night);
                            }
                        } else if (country.equals("TR")) {
                            return new DayNightRes(R.drawable.mapkit_styling_automotive_overview_route_flags_lira_day, R.drawable.mapkit_styling_automotive_overview_route_flags_lira_night);
                        }
                    } else if (country.equals("RU")) {
                        return new DayNightRes(R.drawable.mapkit_styling_automotive_overview_route_flags_rub_day, R.drawable.mapkit_styling_automotive_overview_route_flags_rub_night);
                    }
                } else if (country.equals("IL")) {
                    return new DayNightRes(R.drawable.mapkit_styling_automotive_overview_route_flags_shekel_day, R.drawable.mapkit_styling_automotive_overview_route_flags_shekel_night);
                }
            } else if (country.equals("FR")) {
                return new DayNightRes(R.drawable.mapkit_styling_automotive_overview_route_flags_eur_day, R.drawable.mapkit_styling_automotive_overview_route_flags_eur_night);
            }
        }
        return new DayNightRes(R.drawable.mapkit_styling_automotive_overview_route_flags_fallback_day, R.drawable.mapkit_styling_automotive_overview_route_flags_fallback_night);
    }

    private final boolean isSelected(Balloon balloon) {
        return balloon.getRouteSummary().getRelativeWeight() == null;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        RouteSummaryBalloon routeSummary = balloon.getRouteSummary();
        LinearLayout linearLayout = (LinearLayout) this.view.findViewById(R.id.verticalFlags);
        LinearLayout linearLayout2 = (LinearLayout) this.view.findViewById(R.id.horizontalFlags);
        linearLayout.setVisibility(8);
        linearLayout2.setVisibility(8);
        double value = isSelected(balloon) ? 0.0d : routeSummary.getRelativeWeight().getTimeWithTraffic().getValue();
        if (!isSelected(balloon) && Math.abs(value) > 60.0d) {
            linearLayout = linearLayout2;
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) this.view.findViewById(R.id.textview);
        List<Integer> iconIdentifiers = getIconIdentifiers(routeSummary, isNightMode);
        if (iconIdentifiers.isEmpty()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) appCompatTextView.getLayoutParams();
            marginLayoutParams.setMarginEnd((int) this.context.getResources().getDimension(R.dimen.mapkit_styling_automotive_indent_overview_text_sides));
            appCompatTextView.setLayoutParams(marginLayoutParams);
        } else {
            linearLayout.setVisibility(0);
            linearLayout.removeAllViews();
            Iterator<Integer> it = iconIdentifiers.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                AppCompatImageView appCompatImageView = new AppCompatImageView(this.context);
                int dimension = (int) this.context.getResources().getDimension(R.dimen.mapkit_styling_automotive_route_summary_balloon_flag_icon_size);
                appCompatImageView.setLayoutParams(new ViewGroup.LayoutParams(dimension, dimension));
                appCompatImageView.setImageResource(intValue);
                linearLayout.addView(appCompatImageView);
            }
        }
        if (isSelected(balloon)) {
            Companion companion = INSTANCE;
            appCompatTextView.setText(vuu0.c("\n                " + companion.getEtaText(routeSummary) + "\n                " + companion.getDistanceText(routeSummary) + "\n                "));
            appCompatTextView.setTextAppearance(this.textStyle.get(isNightMode));
        } else {
            appCompatTextView.setText(getTimeDiffText(routeSummary));
            appCompatTextView.setTextAppearance(getAlternativeStyleIdentifier(routeSummary, isNightMode));
        }
        return this.view;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public BalloonParams getBalloonParams(Balloon balloon, boolean isNightMode) {
        return this.balloonParams;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public int getDayBackgroundColor(Balloon balloon, boolean isNightMode) {
        return getBackgroundColor(balloon, isNightMode);
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public int getNightBackgroundColor(Balloon balloon, boolean isNightMode) {
        return getBackgroundColor(balloon, isNightMode);
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public ShadowParams getShadowParams(Balloon balloon, boolean isNightMode) {
        return this.shadowParams;
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ-\u0010\u0017\u001a\u00020\u00162\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00118\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/RouteSummaryBalloonTextureFactory$Companion;", "", "<init>", "()V", "", RemoteBioParameters.TIME, "", "timeToString", "(D)Ljava/lang/String;", "distance", "distanceToString", "Lcom/yandex/mapkit/navigation/automotive/layer/RouteSummaryBalloon;", "summaryBalloon", "getEtaText", "(Lcom/yandex/mapkit/navigation/automotive/layer/RouteSummaryBalloon;)Ljava/lang/String;", "getDistanceText", "", "", "identifiers", "", "needed", "identifier", "Lzy11;", "pushIconIfNeeded", "(Ljava/util/List;ZI)V", "", "NEGLECTABLE_TIME_DIFFERENCE", "F", "ICONS_COUNT_MAX", CA20Status.STATUS_USER_I, "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String distanceToString(double distance) {
            return I18nManagerFactory.getI18nManagerInstance().localizeDistance(Math.abs((int) distance));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getDistanceText(RouteSummaryBalloon summaryBalloon) {
            return distanceToString(summaryBalloon.getSummary().getWeight().getDistance().getValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getEtaText(RouteSummaryBalloon summaryBalloon) {
            Summary summary = summaryBalloon.getSummary();
            String timeToString = timeToString(summary.getWeight().getTimeWithTraffic().getValue());
            return summary.getFlags().getDeadJam() ? g8e.o("~", timeToString) : timeToString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void pushIconIfNeeded(List<Integer> identifiers, boolean needed, int identifier) {
            if (!needed || identifiers.size() >= 2) {
                return;
            }
            identifiers.add(Integer.valueOf(identifier));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String timeToString(double time) {
            return I18nManagerFactory.getI18nManagerInstance().localizeDuration(Math.abs((int) time));
        }

        private Companion() {
        }
    }
}
