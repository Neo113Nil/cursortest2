package defpackage;

import com.squareup.moshi.Moshi;
import java.util.Iterator;
import ru.yandex.taxi.logistics.sdk.delivery_launch.dto.delivery_order_form_address_details.DeliveryOrderFormAddressDetailsDto;
import ru.yandex.taxi.logistics.sdk.dto.services.cargotoolbar.definitions.TypedConfigsDto;

/* loaded from: classes5.dex */
public final class is0 {
    public final o3s a;
    public final ms0 b;
    public final String c;
    public final Moshi d;

    public is0(o3s o3sVar, ms0 ms0Var, String str, Moshi moshi) {
        this.a = o3sVar;
        this.b = ms0Var;
        this.c = str;
        this.d = moshi;
    }

    public final gs0 a() {
        TypedConfigsDto.ItemsDto a = ((p3s) this.a).a("delivery_order_form_address_details");
        if (a != null) {
            return b(a);
        }
        return null;
    }

    public final gs0 b(TypedConfigsDto.ItemsDto itemsDto) {
        Object obj;
        Object obj2;
        if (itemsDto == null) {
            return null;
        }
        Moshi moshi = this.d;
        try {
            obj = moshi.adapter(DeliveryOrderFormAddressDetailsDto.class).fromJson(moshi.adapter(Object.class).toJson(itemsDto.getValue()));
        } catch (Exception unused) {
            obj = null;
        }
        DeliveryOrderFormAddressDetailsDto deliveryOrderFormAddressDetailsDto = (DeliveryOrderFormAddressDetailsDto) obj;
        if (deliveryOrderFormAddressDetailsDto == null) {
            return null;
        }
        this.b.getClass();
        Iterator it = ms0.a(deliveryOrderFormAddressDetailsDto).a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((p610) obj2).a.contains(this.c)) {
                break;
            }
        }
        p610 p610Var = (p610) obj2;
        if (p610Var != null) {
            return p610Var.b;
        }
        return null;
    }
}
