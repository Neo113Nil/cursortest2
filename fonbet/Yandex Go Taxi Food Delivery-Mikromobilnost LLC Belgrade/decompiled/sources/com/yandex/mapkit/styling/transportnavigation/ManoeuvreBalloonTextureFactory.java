package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.b;
import com.yandex.mapkit.navigation.transport.FitnessAction;
import com.yandex.mapkit.navigation.transport.FitnessManoeuvre;
import com.yandex.mapkit.navigation.transport.Landmark;
import com.yandex.mapkit.navigation.transport.RouteAction;
import com.yandex.mapkit.navigation.transport.layer.balloons.Balloon;
import com.yandex.mapkit.navigation.transport.layer.balloons.ManoeuvreBalloon;
import com.yandex.urbanads.internal.navigation.UrbanAdsBottomSheetFragment;
import defpackage.wuj0;
import defpackage.yma1;
import java.util.WeakHashMap;
import kotlin.Metadata;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010 \u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010\"\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\"\u0010#J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b$\u0010#J\u001f\u0010&\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010(R\u001c\u0010\u0010\u001a\n )*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0014\u0010+\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010.R\u0014\u00100\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00062"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/ManoeuvreBalloonTextureFactory;", "Lcom/yandex/mapkit/styling/transportnavigation/SingleViewBalloonTextureFactory;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mapkit/navigation/transport/FitnessAction;", "action", "", "getFitnessActionImageResourceId", "(Lcom/yandex/mapkit/navigation/transport/FitnessAction;)Ljava/lang/Integer;", "Lcom/yandex/mapkit/navigation/transport/Landmark;", "landmark", "getFitnessLandmarkImageResourceId", "(Lcom/yandex/mapkit/navigation/transport/Landmark;)Ljava/lang/Integer;", "Landroidx/appcompat/widget/AppCompatImageView;", "view", "imageId", "Lzy11;", "setImage", "(Landroidx/appcompat/widget/AppCompatImageView;Ljava/lang/Integer;)V", "Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;", "balloon", "", "isNightMode", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "getBalloonParams", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;Z)Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "getShadowParams", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;Z)Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;", "getOutlineParams", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;Z)Lcom/yandex/mapkit/styling/transportnavigation/OutlineParams;", "getDayBackgroundColor", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;Z)I", "getNightBackgroundColor", "Landroid/view/View;", "createView", "(Lcom/yandex/mapkit/navigation/transport/layer/balloons/Balloon;Z)Landroid/view/View;", "Landroid/content/Context;", "kotlin.jvm.PlatformType", "Landroid/view/View;", "balloonParams", "Lcom/yandex/mapkit/styling/transportnavigation/BalloonParams;", "dayShadowParams", "Lcom/yandex/mapkit/styling/transportnavigation/ShadowParams;", "nightShadowParams", UrbanAdsBottomSheetFragment.BACKGROUND_COLOR, CA20Status.STATUS_USER_I, "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ManoeuvreBalloonTextureFactory extends SingleViewBalloonTextureFactory {
    private final int backgroundColor;
    private final BalloonParams balloonParams;
    private final Context context;
    private final ShadowParams dayShadowParams;
    private final ShadowParams nightShadowParams;
    private final View view;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[FitnessAction.values().length];
            try {
                iArr[FitnessAction.STRAIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FitnessAction.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FitnessAction.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[FitnessAction.DISMOUNT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[FitnessAction.BACK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Landmark.values().length];
            try {
                iArr2[Landmark.CROSSWALK.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Landmark.INTO_OVERPASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Landmark.INTO_UNDERPASS.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[Landmark.STAIRS_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[Landmark.STAIRS_DOWN.ordinal()] = 5;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[Landmark.STAIRS.ordinal()] = 6;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[RouteAction.values().length];
            try {
                iArr3[RouteAction.FINISH.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    public ManoeuvreBalloonTextureFactory(Context context) {
        this.context = context;
        this.view = LayoutInflater.from(context).inflate(R.layout.mapkit_styling_transport_layout_manoeuvre_balloon, (ViewGroup) null);
        Resources resources = context.getResources();
        this.balloonParams = new BalloonParams(resources.getDimension(R.dimen.mapkit_styling_transport_size_manoeuvre_balloon_cornerleg), resources.getDimension(R.dimen.mapkit_styling_transport_size_manoeuvre_balloon_cornerleg_innerpart), resources.getDimension(R.dimen.mapkit_styling_transport_width_manoeuvre_balloon_centerleg), resources.getDimension(R.dimen.mapkit_styling_transport_height_manoeuvre_balloon_centerleg), resources.getDimension(R.dimen.mapkit_styling_transport_offset_manoeuvre_balloon_leg), resources.getDimension(R.dimen.mapkit_styling_transport_corner_radius_manoeuvre_balloon), resources.getDimension(R.dimen.mapkit_styling_transport_tip_thickness_maneuver_balloon_leg));
        this.dayShadowParams = new ShadowParams(context.getColor(R.color.mapkit_styling_transport_manoeuvre_balloon_shadow_day), resources.getDimension(R.dimen.mapkit_styling_transport_radius_route_summary_balloon_shadow), new PointF(resources.getDimension(R.dimen.mapkit_styling_transport_offset_x_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_transport_offset_y_route_summary_balloon_shadow)));
        this.nightShadowParams = new ShadowParams(context.getColor(R.color.mapkit_styling_transport_manoeuvre_balloon_shadow_night), resources.getDimension(R.dimen.mapkit_styling_transport_radius_route_summary_balloon_shadow), new PointF(resources.getDimension(R.dimen.mapkit_styling_transport_offset_x_route_summary_balloon_shadow), resources.getDimension(R.dimen.mapkit_styling_transport_offset_y_route_summary_balloon_shadow)));
        this.backgroundColor = context.getColor(R.color.mapkit_styling_transport_balloon_new_blue);
    }

    private final Integer getFitnessActionImageResourceId(FitnessAction action) {
        int i = action == null ? -1 : WhenMappings.$EnumSwitchMapping$0[action.ordinal()];
        if (i == 1) {
            return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_forward);
        }
        if (i == 2) {
            return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_turn_left);
        }
        if (i == 3) {
            return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_turn_right);
        }
        if (i == 4 || i != 5) {
            return null;
        }
        return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_turn_back_left);
    }

    private final Integer getFitnessLandmarkImageResourceId(Landmark landmark) {
        switch (landmark == null ? -1 : WhenMappings.$EnumSwitchMapping$1[landmark.ordinal()]) {
            case 1:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_crosswalk);
            case 2:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_stairs_up);
            case 3:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_stairs_down);
            case 4:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_stairs_up);
            case 5:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_stairs_down);
            case 6:
                return Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_stairs_unknown);
            default:
                return null;
        }
    }

    private final void setImage(AppCompatImageView view, Integer imageId) {
        if (imageId == null) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            view.setImageResource(imageId.intValue());
        }
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public View createView(Balloon balloon, boolean isNightMode) {
        ManoeuvreBalloon manoeuvre = balloon.getManoeuvre();
        ViewUtilsKt.setupDistanceAndMetricsViews((AppCompatTextView) this.view.findViewById(R.id.text_manoeuvre_balloon_distance), (AppCompatTextView) this.view.findViewById(R.id.text_manoeuvre_balloon_metrics), manoeuvre.getDistance().getText());
        if (manoeuvre.getDetails().getFitness() != null) {
            FitnessManoeuvre fitness = manoeuvre.getDetails().getFitness();
            setImage((AppCompatImageView) this.view.findViewById(R.id.image_manoeuvre_balloon_action), getFitnessActionImageResourceId(fitness.getAction()));
            setImage((AppCompatImageView) this.view.findViewById(R.id.image_manoeuvre_balloon_landmark), getFitnessLandmarkImageResourceId(fitness.getLandmark()));
        } else if (manoeuvre.getDetails().getRoute() != null) {
            int i = WhenMappings.$EnumSwitchMapping$2[manoeuvre.getDetails().getRoute().getAction().ordinal()];
            View view = this.view;
            if (i == 1) {
                setImage((AppCompatImageView) view.findViewById(R.id.image_manoeuvre_balloon_action), Integer.valueOf(R.drawable.mapkit_styling_transport_context_ra_finish));
            } else {
                setImage((AppCompatImageView) view.findViewById(R.id.image_manoeuvre_balloon_action), null);
            }
            setImage((AppCompatImageView) this.view.findViewById(R.id.image_manoeuvre_balloon_landmark), null);
        } else {
            setImage((AppCompatImageView) this.view.findViewById(R.id.image_manoeuvre_balloon_action), null);
            setImage((AppCompatImageView) this.view.findViewById(R.id.image_manoeuvre_balloon_landmark), null);
        }
        int i2 = isNightMode ? R.drawable.mapkit_styling_transport_manoeuvre_balloon_background_night : R.drawable.mapkit_styling_transport_manoeuvre_balloon_background_day;
        View view2 = this.view;
        Resources resources = this.context.getResources();
        ThreadLocal threadLocal = wuj0.a;
        Drawable b = yma1.b(resources, i2, null);
        WeakHashMap weakHashMap = b.a;
        view2.setBackground(b);
        return this.view;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public BalloonParams getBalloonParams(Balloon balloon, boolean isNightMode) {
        return this.balloonParams;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public int getDayBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public int getNightBackgroundColor(Balloon balloon, boolean isNightMode) {
        return this.backgroundColor;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public OutlineParams getOutlineParams(Balloon balloon, boolean isNightMode) {
        return null;
    }

    @Override // com.yandex.mapkit.styling.transportnavigation.SingleViewBalloonTextureFactory
    public ShadowParams getShadowParams(Balloon balloon, boolean isNightMode) {
        return isNightMode ? this.nightShadowParams : this.dayShadowParams;
    }
}
