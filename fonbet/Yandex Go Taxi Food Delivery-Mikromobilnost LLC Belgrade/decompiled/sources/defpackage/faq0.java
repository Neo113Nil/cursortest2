package defpackage;

import java.util.HashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$ActionV2;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$PointTypeV2;
import ru.yandex.taxi.analytics.EditPointOnMapAnalytics$ScreenV2;

/* loaded from: classes6.dex */
public final class faq0 {
    public final pj a;

    public faq0(pj pjVar) {
        this.a = pjVar;
    }

    public static EditPointOnMapAnalytics$PointTypeV2 a(SourcePicker sourcePicker) {
        if (sourcePicker == SourcePicker.FROM_ROUTE_SELECTOR || sourcePicker == SourcePicker.FROM_TRANSPORT_DISCOVERY || sourcePicker == SourcePicker.FROM_TRANSPORT_SUMMARY || sourcePicker == SourcePicker.NONE) {
            return EditPointOnMapAnalytics$PointTypeV2.Unknown;
        }
        if (sourcePicker == SourcePicker.A_FROM_HOME || sourcePicker == SourcePicker.A_FROM_ORDER || sourcePicker == SourcePicker.A_FROM_SUMMARY || sourcePicker == SourcePicker.SHORTCUT_REQUESTED_FROM_HOME) {
            return EditPointOnMapAnalytics$PointTypeV2.Source;
        }
        if (sourcePicker == SourcePicker.B_FROM_HOME || sourcePicker == SourcePicker.B_FROM_ORDER || sourcePicker == SourcePicker.B_FROM_SUMMARY || sourcePicker == SourcePicker.ADDITIONAL_FROM_SUMMARY || sourcePicker == SourcePicker.DESTINATION_FROM_ROUTE_SELECTOR || sourcePicker == SourcePicker.DEST_FROM_SHORTCUTS_SCREEN) {
            return EditPointOnMapAnalytics$PointTypeV2.Destination;
        }
        if (sourcePicker == SourcePicker.SOURCE_FROM_DELIVERY) {
            return EditPointOnMapAnalytics$PointTypeV2.DeliverySource;
        }
        if (sourcePicker == SourcePicker.DEST_FROM_DELIVERY || sourcePicker == SourcePicker.DEST_FROM_DELIVERY_DASHBOARD) {
            return EditPointOnMapAnalytics$PointTypeV2.DeliveryDestination;
        }
        if (sourcePicker == SourcePicker.DEST_FROM_PVZ) {
            return EditPointOnMapAnalytics$PointTypeV2.DeliveryTransit;
        }
        w511.b();
        return null;
    }

    public static EditPointOnMapAnalytics$ScreenV2 b(SourcePicker sourcePicker) {
        if (sourcePicker == SourcePicker.A_FROM_HOME || sourcePicker == SourcePicker.B_FROM_HOME || sourcePicker == SourcePicker.SHORTCUT_REQUESTED_FROM_HOME || sourcePicker == SourcePicker.DEST_FROM_SHORTCUTS_SCREEN) {
            return EditPointOnMapAnalytics$ScreenV2.Main;
        }
        if (sourcePicker == SourcePicker.A_FROM_ORDER || sourcePicker == SourcePicker.B_FROM_ORDER) {
            return EditPointOnMapAnalytics$ScreenV2.Order;
        }
        if (sourcePicker == SourcePicker.A_FROM_SUMMARY || sourcePicker == SourcePicker.B_FROM_SUMMARY || sourcePicker == SourcePicker.ADDITIONAL_FROM_SUMMARY) {
            return EditPointOnMapAnalytics$ScreenV2.Summary;
        }
        if (sourcePicker == SourcePicker.FROM_ROUTE_SELECTOR || sourcePicker == SourcePicker.DESTINATION_FROM_ROUTE_SELECTOR) {
            return EditPointOnMapAnalytics$ScreenV2.RouteSelector;
        }
        if (sourcePicker == SourcePicker.NONE || sourcePicker == SourcePicker.FROM_TRANSPORT_DISCOVERY || sourcePicker == SourcePicker.FROM_TRANSPORT_SUMMARY || sourcePicker == SourcePicker.SOURCE_FROM_DELIVERY || sourcePicker == SourcePicker.DEST_FROM_DELIVERY || sourcePicker == SourcePicker.DEST_FROM_PVZ || sourcePicker == SourcePicker.DEST_FROM_DELIVERY_DASHBOARD) {
            return null;
        }
        w511.b();
        return null;
    }

    public final void c(EditPointOnMapAnalytics$ActionV2 editPointOnMapAnalytics$ActionV2, double d, double d2, EditPointOnMapAnalytics$PointTypeV2 editPointOnMapAnalytics$PointTypeV2, EditPointOnMapAnalytics$ScreenV2 editPointOnMapAnalytics$ScreenV2, String str) {
        Double valueOf = Double.valueOf(d);
        Double valueOf2 = Double.valueOf(d2);
        pj pjVar = this.a;
        pjVar.getClass();
        HashMap hashMap = new HashMap();
        if (editPointOnMapAnalytics$ActionV2 != null) {
            hashMap.put("action", editPointOnMapAnalytics$ActionV2.getEventValue());
        }
        hashMap.put("lat", valueOf);
        hashMap.put("lon", valueOf2);
        if (str != null) {
            hashMap.put("pickup_point_id", str);
        }
        if (editPointOnMapAnalytics$ScreenV2 != null) {
            hashMap.put(MetaDataField.SCREEN_FIELD, editPointOnMapAnalytics$ScreenV2.getEventValue());
        }
        if (editPointOnMapAnalytics$PointTypeV2 != null) {
            hashMap.put("type", editPointOnMapAnalytics$PointTypeV2.getEventValue());
        }
        pjVar.a.a("EditPointOnMap", hashMap, 2, new HashMap());
    }
}
