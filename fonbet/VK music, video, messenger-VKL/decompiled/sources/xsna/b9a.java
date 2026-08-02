package xsna;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Good;
import com.vk.dto.common.data.CallProducerButton;
import com.vk.ecomm.market.api.ctabutton.ProductTileCtaButtonType;
import java.util.HashMap;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class b9a implements izs {
    public final /* synthetic */ d9a b;
    public final /* synthetic */ long c;
    public final /* synthetic */ ProductTileCtaButtonType d;

    public /* synthetic */ b9a(d9a d9aVar, long j, ProductTileCtaButtonType productTileCtaButtonType) {
        this.b = d9aVar;
        this.c = j;
        this.d = productTileCtaButtonType;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        Good good = (Good) obj;
        this.b.getClass();
        if (good.b != this.c) {
            return good;
        }
        Parcel obtain = Parcel.obtain();
        try {
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            Serializer.g gVar = new Serializer.g(obtain);
            gVar.i0(good);
            obtain.setDataPosition(0);
            Serializer.StreamParcelable G = gVar.G(Good.class.getClassLoader());
            obtain.recycle();
            Good good2 = (Good) G;
            List<CallProducerButton> list = good2.n0;
            CallProducerButton callProducerButton = list != null ? (CallProducerButton) j5g.a0(list) : null;
            if (callProducerButton != null) {
                list.set(0, CallProducerButton.a(callProducerButton, this.d.h(), null, 4094));
                good2.n0 = list;
            }
            return good2;
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }
}
