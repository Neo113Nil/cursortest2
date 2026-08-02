package defpackage;

import com.yandex.go.navigator.domain.balloon.LaneImageTag;
import com.yandex.go.navigator.domain.balloon.ResourceSize;
import com.yandex.mapkit.directions.driving.Lane;
import com.yandex.mapkit.directions.driving.LaneDirection;
import com.yandex.mapkit.directions.driving.LaneKind;
import com.yandex.mapkit.directions.driving.LaneSign;
import com.yandex.mapkit.styling.automotivenavigation.R;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.Pair;
import kotlin.collections.a;

/* loaded from: classes15.dex */
public abstract class lrx {
    public static final Set a = j73.f0(new String[]{"RU", "UA", "BY", "KZ"});

    public static final ArrayList a(LaneSign laneSign) {
        Pair pair;
        ResourceSize resourceSize;
        ArrayList arrayList = new ArrayList();
        Iterator<Lane> it = laneSign.getLanes().iterator();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (it.hasNext()) {
            List<LaneDirection> directions = it.next().getDirections();
            TreeMap treeMap = new TreeMap();
            if (directions.size() == 1) {
                treeMap.put(directions.get(0), ResourceSize.BIG);
            } else {
                boolean d = d(directions, LaneImageTag.BIG);
                boolean d2 = d(directions, LaneImageTag.TURN);
                for (LaneDirection laneDirection : directions) {
                    if (c(laneDirection, LaneImageTag.BIG)) {
                        resourceSize = ResourceSize.BIG;
                    } else if (c(laneDirection, LaneImageTag.SMALL)) {
                        resourceSize = ResourceSize.SMALL;
                    } else if (c(laneDirection, LaneImageTag.TURN)) {
                        resourceSize = d ? ResourceSize.SMALL : ResourceSize.BIG;
                    } else {
                        if (!c(laneDirection, LaneImageTag.POCKET)) {
                            ny61.r("Wrong directions processing");
                            return null;
                        }
                        resourceSize = (d || d2) ? ResourceSize.SMALL : ResourceSize.BIG;
                    }
                    treeMap.put(laneDirection, resourceSize);
                }
            }
            for (Map.Entry entry : treeMap.entrySet()) {
                LaneDirection laneDirection2 = (LaneDirection) entry.getKey();
                if (((ResourceSize) entry.getValue()) == ResourceSize.SMALL) {
                    z2 |= c(laneDirection2, LaneImageTag.TURN);
                    z3 |= c(laneDirection2, LaneImageTag.POCKET);
                }
            }
            arrayList.add(treeMap);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            SortedMap sortedMap = (SortedMap) it2.next();
            if (sortedMap.size() == 1) {
                LaneDirection laneDirection3 = (LaneDirection) sortedMap.firstKey();
                ResourceSize resourceSize2 = (ResourceSize) sortedMap.get(laneDirection3);
                if (z2 && c(laneDirection3, LaneImageTag.TURN)) {
                    resourceSize2 = ResourceSize.SMALL;
                }
                if (z3 && c(laneDirection3, LaneImageTag.POCKET)) {
                    resourceSize2 = ResourceSize.SMALL;
                }
                sortedMap.put(laneDirection3, resourceSize2);
            }
        }
        List<Lane> lanes = laneSign.getLanes();
        int size = lanes.size();
        ArrayList arrayList2 = new ArrayList(size);
        int i = 0;
        while (i < size) {
            irx irxVar = new irx();
            Lane lane = lanes.get(i);
            SortedMap sortedMap2 = (SortedMap) arrayList.get(i);
            Iterator<LaneDirection> it3 = lane.getDirections().iterator();
            while (true) {
                boolean hasNext = it3.hasNext();
                ArrayList arrayList3 = irxVar.a;
                if (hasNext) {
                    LaneDirection next = it3.next();
                    arrayList3.add(Integer.valueOf(b(next, (ResourceSize) sortedMap2.get(next))));
                } else {
                    LaneDirection highlightedDirection = lane.getHighlightedDirection();
                    if (highlightedDirection != null) {
                        irxVar.b = Integer.valueOf(b(highlightedDirection, (ResourceSize) sortedMap2.get(highlightedDirection)));
                    }
                    boolean z4 = i == 0 ? true : z;
                    int i2 = i + 1;
                    boolean z5 = i2 == size ? true : z;
                    irxVar.e = (z4 && d(lane.getDirections(), LaneImageTag.LEFT)) ? true : z;
                    irxVar.g = (z5 && d(lane.getDirections(), LaneImageTag.RIGHT)) ? true : z;
                    if (z4) {
                        irxVar.f = z;
                    } else {
                        Lane lane2 = lanes.get(i - 1);
                        List<LaneDirection> directions2 = lane2.getDirections();
                        LaneDirection laneDirection4 = LaneDirection.LEFT90;
                        boolean z6 = ((directions2.contains(laneDirection4) || lane2.getDirections().contains(LaneDirection.LEFT180)) && (lane.getDirections().contains(laneDirection4) || lane.getDirections().contains(LaneDirection.LEFT180))) ? true : z;
                        List<LaneDirection> directions3 = lane2.getDirections();
                        LaneDirection laneDirection5 = LaneDirection.RIGHT90;
                        irxVar.f = (z6 || ((directions3.contains(laneDirection5) || lane2.getDirections().contains(LaneDirection.RIGHT180)) && (lane.getDirections().contains(laneDirection5) || lane.getDirections().contains(LaneDirection.RIGHT180))) || ((lane2.getDirections().contains(laneDirection5) || lane2.getDirections().contains(LaneDirection.RIGHT180)) && lane.getDirections().contains(LaneDirection.STRAIGHT_AHEAD)) || (lane2.getDirections().contains(LaneDirection.STRAIGHT_AHEAD) && (lane.getDirections().contains(laneDirection4) || lane.getDirections().contains(LaneDirection.LEFT180)))) ? false : true;
                    }
                    LaneKind laneKind = lane.getLaneKind();
                    switch (krx.a[laneKind.ordinal()]) {
                        case 1:
                            pair = null;
                            break;
                        case 2:
                            if (a.contains(((Locale) a.P(qje.w())).getCountry())) {
                                pair = new Pair(Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_bus_ru), Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_bus_template_ru));
                                break;
                            } else {
                                pair = new Pair(Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_bus_en), Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_bus_template_en));
                                break;
                            }
                        case 3:
                            pair = new Pair(Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_tram), Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_tram_template));
                            break;
                        case 4:
                            pair = new Pair(Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_taxi), Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_taxi_template));
                            break;
                        case 5:
                            pair = new Pair(Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_bike), Integer.valueOf(R.drawable.mapkit_styling_automotive_context_lane_bike_template));
                            break;
                        case 6:
                            yci0.k(laneKind, "Unexpected value: ");
                            return null;
                        default:
                            w511.b();
                            return null;
                    }
                    if (pair != null) {
                        irxVar.c = Integer.valueOf(((Number) pair.c()).intValue());
                        irxVar.d = Integer.valueOf(((Number) pair.f()).intValue());
                    }
                    if (!arrayList3.isEmpty() || irxVar.b != null || irxVar.c != null) {
                        arrayList2.add(irxVar);
                    }
                    i = i2;
                    z = false;
                }
            }
        }
        return arrayList2;
    }

    public static int b(LaneDirection laneDirection, ResourceSize resourceSize) {
        if (resourceSize == ResourceSize.BIG) {
            switch (krx.b[laneDirection.ordinal()]) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                case 12:
                    break;
                case 13:
                    break;
                case 14:
                    yci0.k(laneDirection, "Unexpected value: ");
                    break;
                default:
                    w511.b();
                    break;
            }
            return 0;
        }
        switch (krx.b[laneDirection.ordinal()]) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
            case 14:
                yci0.k(laneDirection, "Unexpected value: ");
                break;
            default:
                w511.b();
                break;
        }
        return 0;
    }

    public static boolean c(LaneDirection laneDirection, LaneImageTag laneImageTag) {
        EnumSet of;
        switch (krx.b[laneDirection.ordinal()]) {
            case 1:
                of = EnumSet.of(LaneImageTag.LEFT, LaneImageTag.SMALL);
                break;
            case 2:
            case 3:
                of = EnumSet.of(LaneImageTag.LEFT, LaneImageTag.TURN);
                break;
            case 4:
            case 12:
                of = EnumSet.of(LaneImageTag.LEFT, LaneImageTag.BIG);
                break;
            case 5:
                of = EnumSet.of(LaneImageTag.BIG);
                break;
            case 6:
            case 13:
                of = EnumSet.of(LaneImageTag.RIGHT, LaneImageTag.BIG);
                break;
            case 7:
            case 8:
                of = EnumSet.of(LaneImageTag.RIGHT, LaneImageTag.TURN);
                break;
            case 9:
                of = EnumSet.of(LaneImageTag.RIGHT, LaneImageTag.SMALL);
                break;
            case 10:
                of = EnumSet.of(LaneImageTag.LEFT, LaneImageTag.POCKET);
                break;
            case 11:
                of = EnumSet.of(LaneImageTag.RIGHT, LaneImageTag.POCKET);
                break;
            case 14:
                yci0.k(laneDirection, "Unexpected value: ");
                return false;
            default:
                w511.b();
                return false;
        }
        return of.contains(laneImageTag);
    }

    public static boolean d(List list, LaneImageTag laneImageTag) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (c((LaneDirection) it.next(), laneImageTag)) {
                return true;
            }
        }
        return false;
    }
}
