package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.search.params.api.City;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class nfc implements pcs, io.reactivex.rxjava3.functions.l {
    public final /* synthetic */ izs b;

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        return (j35) this.b.invoke(obj);
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
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
        this.b.invoke(parcelable);
    }
}
