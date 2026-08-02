package com.yandex.mapkit.styling.automotivenavigation.balloons;

import android.content.Context;
import com.yandex.mapkit.directions.driving.Lane;
import com.yandex.mapkit.directions.driving.LaneDirection;
import com.yandex.mapkit.directions.driving.LaneKind;
import com.yandex.mapkit.directions.driving.LaneSign;
import com.yandex.mapkit.styling.automotivenavigation.R;
import defpackage.j73;
import defpackage.ny61;
import defpackage.sa90;
import defpackage.w511;
import defpackage.y5e;
import defpackage.yci0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001b\u001a\u00020\u001a2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001d2\u0006\u0010\u0019\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001b\u0010\u001fJ%\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$JO\u0010(\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"0\u001d2\u001a\u0010%\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"0\u001d2\u0006\u0010&\u001a\u00020\u001a2\u0006\u0010'\u001a\u00020\u001aH\u0002¢\u0006\u0004\b(\u0010)J+\u0010,\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\u00110\"0\u001d2\u0006\u0010+\u001a\u00020*H\u0002¢\u0006\u0004\b,\u0010-J%\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\u001d2\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b/\u00100R\u001a\u00103\u001a\b\u0012\u0004\u0012\u000202018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneUtils;", "", "<init>", "()V", "Lcom/yandex/mapkit/directions/driving/LaneKind;", "laneKind", "Landroid/content/Context;", "context", "Lsa90;", "", "getLaneKindResources", "(Lcom/yandex/mapkit/directions/driving/LaneKind;Landroid/content/Context;)Lsa90;", "Lcom/yandex/mapkit/directions/driving/LaneDirection;", "direction", "getSmallResourceForLaneDirection", "(Lcom/yandex/mapkit/directions/driving/LaneDirection;)I", "getLargeResourceForLaneDirection", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ResourceSize;", "size", "getResourceForLaneDirection", "(Lcom/yandex/mapkit/directions/driving/LaneDirection;Lcom/yandex/mapkit/styling/automotivenavigation/balloons/ResourceSize;)I", "Ljava/util/EnumSet;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneImageTag;", "getLaneMetadata", "(Lcom/yandex/mapkit/directions/driving/LaneDirection;)Ljava/util/EnumSet;", "property", "", "hasProperty", "(Lcom/yandex/mapkit/directions/driving/LaneDirection;Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneImageTag;)Z", "", "directions", "(Ljava/util/List;Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneImageTag;)Z", "Lcom/yandex/mapkit/directions/driving/Lane;", "lane", "Ljava/util/SortedMap;", "arrowsSizesInLane", "(Lcom/yandex/mapkit/directions/driving/Lane;)Ljava/util/SortedMap;", "lanesArrowsSizes", "hasSmallTurn", "hasSmallTurnFromPocket", "transformArrows", "(Ljava/util/List;ZZ)Ljava/util/List;", "Lcom/yandex/mapkit/directions/driving/LaneSign;", "laneSign", "arrowsSizes", "(Lcom/yandex/mapkit/directions/driving/LaneSign;)Ljava/util/List;", "Lcom/yandex/mapkit/styling/automotivenavigation/balloons/LaneItem;", "createLaneItems", "(Lcom/yandex/mapkit/directions/driving/LaneSign;Landroid/content/Context;)Ljava/util/List;", "", "", "CYRILLIC_COUNTRIES", "Ljava/util/Set;", "com.yandex.mapkit.styling.automotivenavigation_internalRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class LaneUtils {
    public static final LaneUtils INSTANCE = new LaneUtils();
    private static final Set<String> CYRILLIC_COUNTRIES = j73.f0(new String[]{"RU", "UA", "BY", "KZ"});

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[LaneKind.values().length];
            try {
                iArr[LaneKind.PLAIN_LANE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LaneKind.BUS_LANE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LaneKind.TRAM_LANE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LaneKind.TAXI_LANE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LaneKind.BIKE_LANE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LaneKind.UNKNOWN_KIND.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LaneDirection.values().length];
            try {
                iArr2[LaneDirection.LEFT180.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[LaneDirection.LEFT135.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[LaneDirection.LEFT90.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[LaneDirection.LEFT45.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[LaneDirection.STRAIGHT_AHEAD.ordinal()] = 5;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[LaneDirection.RIGHT45.ordinal()] = 6;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[LaneDirection.RIGHT90.ordinal()] = 7;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[LaneDirection.RIGHT135.ordinal()] = 8;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr2[LaneDirection.RIGHT180.ordinal()] = 9;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr2[LaneDirection.LEFT_FROM_RIGHT.ordinal()] = 10;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr2[LaneDirection.RIGHT_FROM_LEFT.ordinal()] = 11;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[LaneDirection.LEFT_SHIFT.ordinal()] = 12;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr2[LaneDirection.RIGHT_SHIFT.ordinal()] = 13;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr2[LaneDirection.UNKNOWN_DIRECTION.ordinal()] = 14;
            } catch (NoSuchFieldError unused20) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private LaneUtils() {
    }

    private final List<SortedMap<LaneDirection, ResourceSize>> arrowsSizes(LaneSign laneSign) {
        ArrayList arrayList = new ArrayList();
        Iterator<Lane> it = laneSign.getLanes().iterator();
        boolean z = false;
        boolean z2 = false;
        while (it.hasNext()) {
            SortedMap<LaneDirection, ResourceSize> arrowsSizesInLane = arrowsSizesInLane(it.next());
            for (Map.Entry<LaneDirection, ResourceSize> entry : arrowsSizesInLane.entrySet()) {
                LaneDirection key = entry.getKey();
                if (entry.getValue() == ResourceSize.SMALL) {
                    z |= hasProperty(key, LaneImageTag.TURN);
                    z2 |= hasProperty(key, LaneImageTag.POCKET);
                }
            }
            arrayList.add(arrowsSizesInLane);
        }
        return transformArrows(arrayList, z, z2);
    }

    private final SortedMap<LaneDirection, ResourceSize> arrowsSizesInLane(Lane lane) {
        ResourceSize resourceSize;
        List<LaneDirection> directions = lane.getDirections();
        TreeMap treeMap = new TreeMap();
        if (directions.size() == 1) {
            treeMap.put(directions.get(0), ResourceSize.BIG);
            return treeMap;
        }
        boolean hasProperty = hasProperty(directions, LaneImageTag.BIG);
        boolean hasProperty2 = hasProperty(directions, LaneImageTag.TURN);
        for (LaneDirection laneDirection : directions) {
            if (hasProperty(laneDirection, LaneImageTag.BIG)) {
                resourceSize = ResourceSize.BIG;
            } else if (hasProperty(laneDirection, LaneImageTag.SMALL)) {
                resourceSize = ResourceSize.SMALL;
            } else if (hasProperty(laneDirection, LaneImageTag.TURN)) {
                resourceSize = hasProperty ? ResourceSize.SMALL : ResourceSize.BIG;
            } else {
                if (!hasProperty(laneDirection, LaneImageTag.POCKET)) {
                    ny61.r("Wrong directions processing");
                    return null;
                }
                resourceSize = (hasProperty || hasProperty2) ? ResourceSize.SMALL : ResourceSize.BIG;
            }
            treeMap.put(laneDirection, resourceSize);
        }
        return treeMap;
    }

    public static final List<LaneItem> createLaneItems(LaneSign laneSign, Context context) {
        List<SortedMap<LaneDirection, ResourceSize>> arrowsSizes = INSTANCE.arrowsSizes(laneSign);
        List<Lane> lanes = laneSign.getLanes();
        int size = lanes.size();
        ArrayList arrayList = new ArrayList(size);
        int i = 0;
        while (i < size) {
            LaneItem laneItem = new LaneItem();
            Lane lane = lanes.get(i);
            SortedMap<LaneDirection, ResourceSize> sortedMap = arrowsSizes.get(i);
            for (LaneDirection laneDirection : lane.getDirections()) {
                laneItem.getSecondaryLanesImages().add(Integer.valueOf(INSTANCE.getResourceForLaneDirection(laneDirection, sortedMap.get(laneDirection))));
            }
            LaneDirection highlightedDirection = lane.getHighlightedDirection();
            if (highlightedDirection != null) {
                laneItem.setHighlightedLaneImage(INSTANCE.getResourceForLaneDirection(highlightedDirection, sortedMap.get(highlightedDirection)));
            }
            boolean z = i == 0;
            int i2 = i + 1;
            boolean z2 = i2 == size;
            laneItem.setHasLeftOffset(z && INSTANCE.hasProperty(lane.getDirections(), LaneImageTag.LEFT));
            laneItem.setHasRightOffset(z2 && INSTANCE.hasProperty(lane.getDirections(), LaneImageTag.RIGHT));
            if (z) {
                laneItem.setHasLargeOverlap(false);
            } else {
                Lane lane2 = lanes.get(i - 1);
                List<LaneDirection> directions = lane2.getDirections();
                LaneDirection laneDirection2 = LaneDirection.LEFT90;
                boolean z3 = (directions.contains(laneDirection2) || lane2.getDirections().contains(LaneDirection.LEFT180)) && (lane.getDirections().contains(laneDirection2) || lane.getDirections().contains(LaneDirection.LEFT180));
                List<LaneDirection> directions2 = lane2.getDirections();
                LaneDirection laneDirection3 = LaneDirection.RIGHT90;
                laneItem.setHasLargeOverlap((z3 || ((directions2.contains(laneDirection3) || lane2.getDirections().contains(LaneDirection.RIGHT180)) && (lane.getDirections().contains(laneDirection3) || lane.getDirections().contains(LaneDirection.RIGHT180))) || ((lane2.getDirections().contains(laneDirection3) || lane2.getDirections().contains(LaneDirection.RIGHT180)) && lane.getDirections().contains(LaneDirection.STRAIGHT_AHEAD)) || (lane2.getDirections().contains(LaneDirection.STRAIGHT_AHEAD) && (lane.getDirections().contains(laneDirection2) || lane.getDirections().contains(LaneDirection.LEFT180)))) ? false : true);
            }
            sa90 laneKindResources = INSTANCE.getLaneKindResources(lane.getLaneKind(), context);
            if (laneKindResources != null) {
                laneItem.setLaneKindImage(((Number) laneKindResources.a).intValue());
                laneItem.setLaneKindCropImage(((Number) laneKindResources.b).intValue());
            }
            if (!laneItem.getSecondaryLanesImages().isEmpty() || laneItem.getHighlightedLaneImage() != null || laneItem.getLaneKindImage() != null) {
                arrayList.add(laneItem);
            }
            i = i2;
        }
        return arrayList;
    }

    private final sa90 getLaneKindResources(LaneKind laneKind, Context context) {
        switch (WhenMappings.$EnumSwitchMapping$0[laneKind.ordinal()]) {
            case 1:
                break;
            case 2:
                if (!CYRILLIC_COUNTRIES.contains(y5e.q(context.getResources().getConfiguration()).b(0).getCountry())) {
                    break;
                } else {
                    break;
                }
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                yci0.k(laneKind, "Unexpected value: ");
                break;
            default:
                w511.b();
                break;
        }
        return null;
    }

    private final EnumSet<LaneImageTag> getLaneMetadata(LaneDirection direction) {
        switch (WhenMappings.$EnumSwitchMapping$1[direction.ordinal()]) {
            case 1:
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 12:
                break;
            case 5:
                break;
            case 6:
            case 13:
                break;
            case 7:
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 14:
                yci0.k(direction, "Unexpected value: ");
                break;
            default:
                w511.b();
                break;
        }
        return null;
    }

    private final int getLargeResourceForLaneDirection(LaneDirection direction) {
        switch (WhenMappings.$EnumSwitchMapping$1[direction.ordinal()]) {
            case 1:
                return R.drawable.mapkit_styling_automotive_context_lane_left180_large;
            case 2:
                return R.drawable.mapkit_styling_automotive_context_lane_left135_large;
            case 3:
                return R.drawable.mapkit_styling_automotive_context_lane_left90_large;
            case 4:
                return R.drawable.mapkit_styling_automotive_context_lane_left45_large;
            case 5:
                return R.drawable.mapkit_styling_automotive_context_lane_straightahead_large;
            case 6:
                return R.drawable.mapkit_styling_automotive_context_lane_right45_large;
            case 7:
                return R.drawable.mapkit_styling_automotive_context_lane_right90_large;
            case 8:
                return R.drawable.mapkit_styling_automotive_context_lane_right135_large;
            case 9:
                return R.drawable.mapkit_styling_automotive_context_lane_right180_large;
            case 10:
                return R.drawable.mapkit_styling_automotive_context_lane_leftfromright_large;
            case 11:
                return R.drawable.mapkit_styling_automotive_context_lane_rightfromleft_large;
            case 12:
                return R.drawable.mapkit_styling_automotive_context_lane_leftshift_large;
            case 13:
                return R.drawable.mapkit_styling_automotive_context_lane_rightshift_large;
            case 14:
                yci0.k(direction, "Unexpected value: ");
                return 0;
            default:
                w511.b();
                return 0;
        }
    }

    private final int getResourceForLaneDirection(LaneDirection direction, ResourceSize size) {
        return size == ResourceSize.BIG ? getLargeResourceForLaneDirection(direction) : getSmallResourceForLaneDirection(direction);
    }

    private final int getSmallResourceForLaneDirection(LaneDirection direction) {
        switch (WhenMappings.$EnumSwitchMapping$1[direction.ordinal()]) {
            case 1:
                return R.drawable.mapkit_styling_automotive_context_lane_left180_small;
            case 2:
                return R.drawable.mapkit_styling_automotive_context_lane_left135_small;
            case 3:
                return R.drawable.mapkit_styling_automotive_context_lane_left90_small;
            case 4:
                return R.drawable.mapkit_styling_automotive_context_lane_left45_small;
            case 5:
                return R.drawable.mapkit_styling_automotive_context_lane_straightahead_small;
            case 6:
                return R.drawable.mapkit_styling_automotive_context_lane_right45_small;
            case 7:
                return R.drawable.mapkit_styling_automotive_context_lane_right90_small;
            case 8:
                return R.drawable.mapkit_styling_automotive_context_lane_right135_small;
            case 9:
                return R.drawable.mapkit_styling_automotive_context_lane_right180_small;
            case 10:
                return R.drawable.mapkit_styling_automotive_context_lane_leftfromright_small;
            case 11:
                return R.drawable.mapkit_styling_automotive_context_lane_rightfromleft_small;
            case 12:
                return R.drawable.mapkit_styling_automotive_context_lane_leftshift_small;
            case 13:
                return R.drawable.mapkit_styling_automotive_context_lane_rightshift_small;
            case 14:
                yci0.k(direction, "Unexpected value: ");
                return 0;
            default:
                w511.b();
                return 0;
        }
    }

    private final boolean hasProperty(List<? extends LaneDirection> directions, LaneImageTag property) {
        Iterator<? extends LaneDirection> it = directions.iterator();
        while (it.hasNext()) {
            if (hasProperty(it.next(), property)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<SortedMap<LaneDirection, ResourceSize>> transformArrows(List<? extends SortedMap<LaneDirection, ResourceSize>> lanesArrowsSizes, boolean hasSmallTurn, boolean hasSmallTurnFromPocket) {
        Iterator it = lanesArrowsSizes.iterator();
        while (it.hasNext()) {
            SortedMap sortedMap = (SortedMap) it.next();
            if (sortedMap.size() == 1) {
                LaneDirection laneDirection = (LaneDirection) sortedMap.firstKey();
                ResourceSize resourceSize = (ResourceSize) sortedMap.get(laneDirection);
                if (hasSmallTurn && hasProperty(laneDirection, LaneImageTag.TURN)) {
                    resourceSize = ResourceSize.SMALL;
                }
                if (hasSmallTurnFromPocket && hasProperty(laneDirection, LaneImageTag.POCKET)) {
                    resourceSize = ResourceSize.SMALL;
                }
                sortedMap.put(laneDirection, resourceSize);
            }
        }
        return lanesArrowsSizes;
    }

    private final boolean hasProperty(LaneDirection direction, LaneImageTag property) {
        return getLaneMetadata(direction).contains(property);
    }
}
