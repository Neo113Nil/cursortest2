package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import android.graphics.PointF;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.yandex.mapkit.LocalizedValue;
import com.yandex.mapkit.directions.driving.Flags;
import com.yandex.mapkit.navigation.automotive.layer.AlternativeBalloon;
import com.yandex.mapkit.navigation.automotive.layer.Balloon;
import com.yandex.mapkit.styling.automotive.balloons.AlternativeBalloonColors;
import com.yandex.mapkit.styling.automotive.balloons.BalloonColors;
import com.yandex.mapkit.styling.automotivenavigation.DayNightRes;
import com.yandex.mapkit.styling.automotivenavigation.R;
import com.yandex.runtime.i18n.I18nManagerFactory;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.b64;
import defpackage.g8e;
import defpackage.sa90;
import defpackage.scc;
import defpackage.y5e;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000 92\u00020\u0001:\u00019B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\u001f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010!\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b!\u0010 J\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\u00182\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*R\u0014\u0010,\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u0014\u0010-\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u0014\u0010.\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u00100\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R,\u00107\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n06058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108¨\u0006:"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/AlternativeBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/SingleViewBalloonTextureFactory;", "Landroid/content/Context;", "context", "Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;", "colors", "<init>", "(Landroid/content/Context;Lcom/yandex/mapkit/styling/automotive/balloons/BalloonColors;)V", "", "isNightMode", "", "getTollIconIdentifier", "(Z)I", "Lcom/yandex/mapkit/navigation/automotive/layer/AlternativeBalloon;", "balloon", "getAlternativeIconIdentifier", "(Lcom/yandex/mapkit/navigation/automotive/layer/AlternativeBalloon;Z)Ljava/lang/Integer;", "Lcom/yandex/mapkit/LocalizedValue;", "localizedTimeDiff", "getTextColor", "(Lcom/yandex/mapkit/LocalizedValue;Z)I", "", "getSingleLineText", "(Lcom/yandex/mapkit/LocalizedValue;)Ljava/lang/String;", "Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "getBalloonParams", "(Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;Z)Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "getShadowParams", "(Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;Z)Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "getDayBackgroundColor", "(Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;Z)I", "getNightBackgroundColor", "Landroid/view/View;", "createView", "(Lcom/yandex/mapkit/navigation/automotive/layer/Balloon;Z)Landroid/view/View;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "view", "Landroid/view/View;", "plusSign", "Ljava/lang/String;", "minusSign", "sameTimeText1", "sameTimeText2", "balloonParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/BalloonParams;", "shadowParams", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ShadowParams;", "Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, "Lcom/yandex/mapkit/styling/automotivenavigation/DayNightRes;", "Lsa90;", "", "textColors", "Lsa90;", "Companion", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AlternativeBalloonTextureFactory extends SingleViewBalloonTextureFactory {
    private static final double NEGLECTABLE_TIME_DIFFERENCE = 120.0d;
    private final DayNightRes backgroundColor;
    private final BalloonParams balloonParams;
    private final Context context;
    private final String minusSign;
    private final String plusSign;
    private final String sameTimeText1;
    private final String sameTimeText2;
    private final ShadowParams shadowParams;
    private final sa90 textColors;
    private final View view;

    public AlternativeBalloonTextureFactory(Context context, BalloonColors balloonColors) {
        AlternativeBalloonColors alternative;
        Integer backgroundNight;
        AlternativeBalloonColors alternative2;
        Integer backgroundDay;
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_automotive_layout_alternativeballoon, (ViewGroup) null);
        this.plusSign = context.getString(R.string.mapkit_styling_automotive_alternative_plus_sign);
        this.minusSign = context.getString(R.string.mapkit_styling_automotive_alternative_minus_sign);
        this.sameTimeText1 = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text1);
        this.sameTimeText2 = context.getString(R.string.mapkit_styling_automotive_alternative_same_time_text2);
        this.balloonParams = new BalloonParams(context.getResources().getDimension(R.dimen.mapkit_styling_automotive_size_alternative_balloon_corner_leg), context.getResources().getDimension(R.dimen.mapkit_styling_automotive_size_alternative_balloon_corner_leg_innerpart), context.getResources().getDimension(R.dimen.mapkit_styling_automotive_width_alternative_balloon_center_leg), context.getResources().getDimension(R.dimen.mapkit_styling_automotive_height_alternative_balloon_center_leg), context.getResources().getDimension(R.dimen.mapkit_styling_automotive_offset_alternative_balloon_leg), context.getResources().getDimension(R.dimen.mapkit_styling_automotive_corner_radius_alternative_balloon));
        this.shadowParams = new ShadowParams(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_shadow), context.getResources().getDimension(R.dimen.mapkit_styling_automotive_radius_alternative_balloon_shadow), new PointF());
        this.backgroundColor = new DayNightRes((balloonColors == null || (alternative2 = balloonColors.getAlternative()) == null || (backgroundDay = alternative2.getBackgroundDay()) == null) ? context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_background_day) : backgroundDay.intValue(), (balloonColors == null || (alternative = balloonColors.getAlternative()) == null || (backgroundNight = alternative.getBackgroundNight()) == null) ? context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_background_night) : backgroundNight.intValue());
        this.textColors = new sa90(scc.g(Integer.valueOf(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_text_worse_day)), Integer.valueOf(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_text_same_day)), Integer.valueOf(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_text_better_day))), scc.g(Integer.valueOf(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_text_worse_night)), Integer.valueOf(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_text_same_night)), Integer.valueOf(context.getColor(R.color.mapkit_styling_automotive_alternative_balloon_text_better_night))));
    }

    private final Integer getAlternativeIconIdentifier(AlternativeBalloon balloon, boolean isNightMode) {
        Flags flags = balloon.getSummary().getFlags();
        if (flags.getHasCheckpoints()) {
            return Integer.valueOf(R.drawable.mapkit_styling_automotive_alternativeballoon_checkpoint);
        }
        if (flags.getHasTolls()) {
            return Integer.valueOf(getTollIconIdentifier(isNightMode));
        }
        if (flags.getHasRuggedRoads()) {
            return Integer.valueOf(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_bad_road);
        }
        return null;
    }

    private final String getSingleLineText(LocalizedValue localizedTimeDiff) {
        double value = localizedTimeDiff.getValue();
        if (Math.abs(value) <= NEGLECTABLE_TIME_DIFFERENCE) {
            return g8e.p(this.sameTimeText1, " ", this.sameTimeText2);
        }
        return b64.j(value < 0.0d ? this.minusSign : this.plusSign, I18nManagerFactory.getI18nManagerInstance().localizeDuration(Math.abs((int) value)));
    }

    private final int getTextColor(LocalizedValue localizedTimeDiff, boolean isNightMode) {
        double value = localizedTimeDiff.getValue();
        sa90 sa90Var = this.textColors;
        List list = (List) (isNightMode ? sa90Var.b : sa90Var.a);
        return value >= NEGLECTABLE_TIME_DIFFERENCE ? ((Number) list.get(0)).intValue() : value <= -120.0d ? ((Number) list.get(2)).intValue() : ((Number) list.get(1)).intValue();
    }

    private final int getTollIconIdentifier(boolean isNightMode) {
        DayNightRes dayNightRes;
        String country = y5e.q(this.context.getResources().getConfiguration()).b(0).getCountry();
        if (country != null) {
            int hashCode = country.hashCode();
            if (hashCode != 2252) {
                if (hashCode != 2627) {
                    if (hashCode != 2686) {
                        if (hashCode != 2700) {
                            if (hashCode == 2718 && country.equals("US")) {
                                dayNightRes = new DayNightRes(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_usd_day, R.drawable.mapkit_styling_automotive_alternativeballoon_icon_usd_night);
                            }
                        } else if (country.equals("UA")) {
                            dayNightRes = new DayNightRes(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_gr_day, R.drawable.mapkit_styling_automotive_alternativeballoon_icon_gr_night);
                        }
                    } else if (country.equals("TR")) {
                        dayNightRes = new DayNightRes(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_lr_day, R.drawable.mapkit_styling_automotive_alternativeballoon_icon_lr_night);
                    }
                } else if (country.equals("RU")) {
                    dayNightRes = new DayNightRes(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_rub_day, R.drawable.mapkit_styling_automotive_alternativeballoon_icon_rub_night);
                }
            } else if (country.equals("FR")) {
                dayNightRes = new DayNightRes(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_eur_day, R.drawable.mapkit_styling_automotive_alternativeballoon_icon_eur_night);
            }
            return dayNightRes.get(isNightMode);
        }
        dayNightRes = new DayNightRes(R.drawable.mapkit_styling_automotive_alternativeballoon_icon_fallback_day, R.drawable.mapkit_styling_automotive_alternativeballoon_icon_fallback_night);
        return dayNightRes.get(isNightMode);
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        AlternativeBalloon alternative = balloon.getAlternative();
        TextView textView = (TextView) this.view.findViewById(R.id.text_alternativeballoon_time_diff);
        LocalizedValue timeWithTraffic = alternative.getRelativeWeight().getTimeWithTraffic();
        textView.setTextColor(getTextColor(timeWithTraffic, isNightMode));
        double abs = Math.abs(timeWithTraffic.getValue());
        Context context = this.context;
        textView.setTextSize(0, abs < NEGLECTABLE_TIME_DIFFERENCE ? context.getResources().getDimension(R.dimen.mapkit_styling_automotive_text_size_alternativeballoon_text_same_time) : context.getResources().getDimension(R.dimen.mapkit_styling_automotive_text_size_alternative_balloon_text));
        textView.setText(getSingleLineText(timeWithTraffic));
        AppCompatImageView appCompatImageView = (AppCompatImageView) this.view.findViewById(R.id.image_alternativeballoon_icon);
        Integer alternativeIconIdentifier = getAlternativeIconIdentifier(alternative, isNightMode);
        if (alternativeIconIdentifier != null) {
            appCompatImageView.setVisibility(0);
            appCompatImageView.setImageResource(alternativeIconIdentifier.intValue());
        } else {
            appCompatImageView.setVisibility(8);
        }
        return this.view;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public BalloonParams getBalloonParams(Balloon balloon, boolean isNightMode) {
        return this.balloonParams;
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public int getDayBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor.getDayId();
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public int getNightBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor.getNightId();
    }

    @Override // com.yandex.mapkit.styling.automotivenavigation.balloons.SingleViewBalloonTextureFactory
    public ShadowParams getShadowParams(Balloon balloon, boolean isNightMode) {
        return this.shadowParams;
    }
}
