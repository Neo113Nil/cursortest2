package com.yandex.mapkit.styling.transportnavigation;

import android.content.Context;
import android.graphics.PointF;
import com.yandex.mapkit.navigation.transport.layer.ConstructionStyleProvider;
import com.yandex.mapkit.navigation.transport.layer.IndoorConnectorManoeuvre;
import com.yandex.mapkit.navigation.transport.layer.IndoorConnectorManoeuvreType;
import com.yandex.mapkit.styling.PlacemarkStyle;
import com.yandex.mapkit.styling.transportnavigation.DrawableUtils;
import com.yandex.mapkit.transport.masstransit.ConstructionMask;
import com.yandex.mapkit.transport.masstransit.Elevator;
import com.yandex.mapkit.transport.masstransit.Escalator;
import com.yandex.mapkit.transport.masstransit.Stairs;
import com.yandex.mapkit.transport.masstransit.StairsDirection;
import com.yandex.mapkit.transport.masstransit.Travolator;
import defpackage.w511;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000b\u0010\u0012J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u000b\u0010\u0015J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u000b\u0010\u0018J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u000b\u0010\u001bJ+\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010!\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b!\u0010\"J3\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b&\u0010'J9\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u001c2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/yandex/mapkit/styling/transportnavigation/DefaultConstructionStyleProvider;", "Lcom/yandex/mapkit/navigation/transport/layer/ConstructionStyleProvider;", "Landroid/content/Context;", "defaultContext", "<init>", "(Landroid/content/Context;)V", "Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;", "constructionMask", "Lcom/yandex/mapkit/navigation/transport/layer/IndoorConnectorManoeuvre;", "indoorConnectorManoeuvre", "Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "getImageResources", "(Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;Lcom/yandex/mapkit/navigation/transport/layer/IndoorConnectorManoeuvre;)Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "imageResources", "tryAddGetoffResources", "(Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;Lcom/yandex/mapkit/navigation/transport/layer/IndoorConnectorManoeuvre;)Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "Lcom/yandex/mapkit/transport/masstransit/Stairs;", "stairs", "(Lcom/yandex/mapkit/transport/masstransit/Stairs;)Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "Lcom/yandex/mapkit/transport/masstransit/Escalator;", "escalator", "(Lcom/yandex/mapkit/transport/masstransit/Escalator;)Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "Lcom/yandex/mapkit/transport/masstransit/Travolator;", "travolator", "(Lcom/yandex/mapkit/transport/masstransit/Travolator;)Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "Lcom/yandex/mapkit/transport/masstransit/Elevator;", "elevator", "(Lcom/yandex/mapkit/transport/masstransit/Elevator;)Lcom/yandex/mapkit/styling/transportnavigation/ImageResources;", "", "isNightMode", "", "getImageId", "(Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;ZLcom/yandex/mapkit/navigation/transport/layer/IndoorConnectorManoeuvre;)Ljava/lang/Integer;", "getLabelId", "(Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;Lcom/yandex/mapkit/navigation/transport/layer/IndoorConnectorManoeuvre;)Ljava/lang/Integer;", "", "scaleFactor", "Lcom/yandex/mapkit/styling/transportnavigation/DrawableUtils$ImageWithAnchor;", "getImageWithAnchor", "(Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;FZLcom/yandex/mapkit/navigation/transport/layer/IndoorConnectorManoeuvre;)Lcom/yandex/mapkit/styling/transportnavigation/DrawableUtils$ImageWithAnchor;", "Lcom/yandex/mapkit/styling/PlacemarkStyle;", "style", "Lzy11;", "provideStyle", "(Lcom/yandex/mapkit/transport/masstransit/ConstructionMask;FZLcom/yandex/mapkit/navigation/transport/layer/IndoorConnectorManoeuvre;Lcom/yandex/mapkit/styling/PlacemarkStyle;)V", "context", "Landroid/content/Context;", "com.yandex.mapkit.styling.transportnavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public class DefaultConstructionStyleProvider implements ConstructionStyleProvider {
    private final Context context;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;
        public static final /* synthetic */ int[] $EnumSwitchMapping$4;

        static {
            int[] iArr = new int[StairsDirection.values().length];
            try {
                iArr[StairsDirection.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[StairsDirection.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[StairsDirection.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Escalator.values().length];
            try {
                iArr2[Escalator.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Escalator.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Escalator.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[Travolator.values().length];
            try {
                iArr3[Travolator.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[Travolator.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[Travolator.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[Elevator.values().length];
            try {
                iArr4[Elevator.UP.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[Elevator.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
            int[] iArr5 = new int[IndoorConnectorManoeuvreType.values().length];
            try {
                iArr5[IndoorConnectorManoeuvreType.GET_OFF_FROM_CONNECTOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr5[IndoorConnectorManoeuvreType.BY_CONNECTOR_TO_LEVEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$4 = iArr5;
        }
    }

    public DefaultConstructionStyleProvider(Context context) {
        this.context = LocalizedContextKt.localizedContext(context);
    }

    private final Integer getImageId(ConstructionMask constructionMask, boolean isNightMode, IndoorConnectorManoeuvre indoorConnectorManoeuvre) {
        ImageResources imageResources = getImageResources(constructionMask, indoorConnectorManoeuvre);
        if (imageResources != null) {
            return Integer.valueOf(isNightMode ? imageResources.getNightIconId() : imageResources.getDayIconId());
        }
        return null;
    }

    private final ImageResources getImageResources(ConstructionMask constructionMask, IndoorConnectorManoeuvre indoorConnectorManoeuvre) {
        if (constructionMask.getStairs() != null) {
            return tryAddGetoffResources(getImageResources(constructionMask.getStairs()), indoorConnectorManoeuvre);
        }
        if (constructionMask.getTravolator() != null) {
            return tryAddGetoffResources(getImageResources(constructionMask.getTravolator()), indoorConnectorManoeuvre);
        }
        if (constructionMask.getEscalator() != null) {
            return tryAddGetoffResources(getImageResources(constructionMask.getEscalator()), indoorConnectorManoeuvre);
        }
        if (constructionMask.getElevator() != null) {
            return tryAddGetoffResources(getImageResources(constructionMask.getElevator()), indoorConnectorManoeuvre);
        }
        if ((indoorConnectorManoeuvre != null ? indoorConnectorManoeuvre.getType() : null) == IndoorConnectorManoeuvreType.EXIT) {
            return new ImageResources(R.drawable.mapkit_styling_transport_exit_day, R.drawable.mapkit_styling_transport_exit_night, null, null);
        }
        if ((indoorConnectorManoeuvre != null ? indoorConnectorManoeuvre.getType() : null) == IndoorConnectorManoeuvreType.ENTRANCE) {
            return new ImageResources(R.drawable.mapkit_styling_transport_entrance_day, R.drawable.mapkit_styling_transport_entrance_night, null, null);
        }
        return null;
    }

    private final DrawableUtils.ImageWithAnchor getImageWithAnchor(ConstructionMask constructionMask, float scaleFactor, boolean isNightMode, IndoorConnectorManoeuvre indoorConnectorManoeuvre) {
        String str;
        Integer imageId = getImageId(constructionMask, isNightMode, indoorConnectorManoeuvre);
        if (imageId == null) {
            return null;
        }
        int intValue = imageId.intValue();
        Integer labelId = getLabelId(constructionMask, indoorConnectorManoeuvre);
        Context context = this.context;
        if (labelId == null) {
            return new DrawableUtils.ImageWithAnchor(DrawableUtils.createImageProvider(context, intValue, true, scaleFactor), new PointF(0.5f, 1.0f));
        }
        String localizeLabel = ViewUtilsKt.localizeLabel(context, labelId.intValue(), indoorConnectorManoeuvre != null ? indoorConnectorManoeuvre.getUpcomingLevelName() : null);
        if (indoorConnectorManoeuvre == null || (str = indoorConnectorManoeuvre.getUpcomingLevelName()) == null) {
            str = "";
        }
        return DrawableUtils.INSTANCE.generateImageWithLabel(this.context, intValue, localizeLabel, scaleFactor, isNightMode, labelId + "_" + str);
    }

    private final Integer getLabelId(ConstructionMask constructionMask, IndoorConnectorManoeuvre indoorConnectorManoeuvre) {
        ImageResources imageResources;
        if (indoorConnectorManoeuvre == null || (imageResources = getImageResources(constructionMask, indoorConnectorManoeuvre)) == null) {
            return null;
        }
        int i = WhenMappings.$EnumSwitchMapping$4[indoorConnectorManoeuvre.getType().ordinal()];
        if (i == 1) {
            return imageResources.getGetOffLabelId();
        }
        if (i == 2 && indoorConnectorManoeuvre.getUpcomingLevelName() != null) {
            return imageResources.getByConnectorToLevelLabelId();
        }
        return null;
    }

    private final ImageResources tryAddGetoffResources(ImageResources imageResources, IndoorConnectorManoeuvre indoorConnectorManoeuvre) {
        return (indoorConnectorManoeuvre != null ? indoorConnectorManoeuvre.getType() : null) == IndoorConnectorManoeuvreType.GET_OFF_FROM_CONNECTOR ? new ImageResources(R.drawable.mapkit_styling_transport_getoff_day, R.drawable.mapkit_styling_transport_getoff_night, imageResources.getByConnectorToLevelLabelId(), imageResources.getGetOffLabelId()) : imageResources;
    }

    @Override // com.yandex.mapkit.navigation.transport.layer.ConstructionStyleProvider
    public void provideStyle(ConstructionMask constructionMask, float scaleFactor, boolean isNightMode, IndoorConnectorManoeuvre indoorConnectorManoeuvre, PlacemarkStyle style) {
        DrawableUtils.ImageWithAnchor imageWithAnchor = getImageWithAnchor(constructionMask, scaleFactor / 2.0f, isNightMode, indoorConnectorManoeuvre);
        if (imageWithAnchor == null) {
            return;
        }
        style.setImage(imageWithAnchor.getImageProvider());
        style.setIconAnchor(imageWithAnchor.getAnchor());
    }

    private final ImageResources getImageResources(Stairs stairs) {
        int i;
        int i2;
        int i3 = WhenMappings.$EnumSwitchMapping$0[stairs.getDirection().ordinal()];
        if (i3 == 1) {
            i = R.drawable.mapkit_styling_transport_event_stairs_up_day;
            i2 = R.drawable.mapkit_styling_transport_event_stairs_up_night;
        } else if (i3 == 2) {
            i = R.drawable.mapkit_styling_transport_event_stairs_down_day;
            i2 = R.drawable.mapkit_styling_transport_event_stairs_down_night;
        } else if (i3 == 3) {
            i = R.drawable.mapkit_styling_transport_event_stairs_unknown_day;
            i2 = R.drawable.mapkit_styling_transport_event_stairs_unknown_night;
        } else {
            w511.b();
            return null;
        }
        return new ImageResources(i, i2, Integer.valueOf(R.string.mapkit_styling_transport_stairs_construction_text), Integer.valueOf(R.string.mapkit_styling_transport_get_off_stairs_construction_text));
    }

    private final ImageResources getImageResources(Escalator escalator) {
        int i;
        int i2;
        int i3 = WhenMappings.$EnumSwitchMapping$1[escalator.ordinal()];
        if (i3 == 1) {
            i = R.drawable.mapkit_styling_transport_escalator_up_day;
            i2 = R.drawable.mapkit_styling_transport_escalator_up_night;
        } else if (i3 == 2) {
            i = R.drawable.mapkit_styling_transport_escalator_down_day;
            i2 = R.drawable.mapkit_styling_transport_escalator_down_night;
        } else if (i3 == 3) {
            i = R.drawable.mapkit_styling_transport_escalator_up_day;
            i2 = R.drawable.mapkit_styling_transport_escalator_up_night;
        } else {
            w511.b();
            return null;
        }
        return new ImageResources(i, i2, Integer.valueOf(R.string.mapkit_styling_transport_escalator_construction_text), Integer.valueOf(R.string.mapkit_styling_transport_get_off_escalator_construction_text));
    }

    private final ImageResources getImageResources(Travolator travolator) {
        int i;
        int i2;
        int i3 = WhenMappings.$EnumSwitchMapping$2[travolator.ordinal()];
        if (i3 == 1) {
            i = R.drawable.mapkit_styling_transport_travolator_up_day;
            i2 = R.drawable.mapkit_styling_transport_travolator_up_night;
        } else if (i3 == 2) {
            i = R.drawable.mapkit_styling_transport_travolator_down_day;
            i2 = R.drawable.mapkit_styling_transport_travolator_down_night;
        } else if (i3 == 3) {
            i = R.drawable.mapkit_styling_transport_travolator_up_day;
            i2 = R.drawable.mapkit_styling_transport_travolator_up_night;
        } else {
            w511.b();
            return null;
        }
        return new ImageResources(i, i2, Integer.valueOf(R.string.mapkit_styling_transport_travolator_construction_text), Integer.valueOf(R.string.mapkit_styling_transport_get_off_travolator_construction_text));
    }

    private final ImageResources getImageResources(Elevator elevator) {
        int i;
        int i2;
        int i3 = WhenMappings.$EnumSwitchMapping$3[elevator.ordinal()];
        if (i3 == 1) {
            i = R.drawable.mapkit_styling_transport_elevator_up_day;
            i2 = R.drawable.mapkit_styling_transport_elevator_up_night;
        } else if (i3 == 2) {
            i = R.drawable.mapkit_styling_transport_elevator_down_day;
            i2 = R.drawable.mapkit_styling_transport_elevator_down_night;
        } else {
            w511.b();
            return null;
        }
        return new ImageResources(i, i2, Integer.valueOf(R.string.mapkit_styling_transport_elevator_construction_text), Integer.valueOf(R.string.mapkit_styling_transport_get_off_elevator_construction_text));
    }
}
