package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.search.params.api.City;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class qnh0 implements pcs, yads.ng1 {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qnh0(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.af) obj).getClass();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        City city;
        Parcelable parcelable;
        Object parcelable2;
        izs izsVar = (izs) this.b;
        if (((Boolean) ((rnh0) this.c).a.getValue()).booleanValue()) {
            qcy<Object>[] qcyVarArr = ph.n1;
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = bundle.getParcelable("database_result", City.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = bundle.getParcelable("database_result");
                if (!(parcelable3 instanceof City)) {
                    parcelable3 = null;
                }
                parcelable = (City) parcelable3;
            }
            city = (City) parcelable;
        } else {
            int i = rec.j1;
            city = (City) bundle.getParcelable("city_result");
        }
        izsVar.invoke(city);
    }
}
