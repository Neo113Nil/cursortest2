package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.vk.search.params.api.domain.model.SearchLocation;
import xsna.ttf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class j6a implements io.reactivex.rxjava3.functions.l, pcs {
    public final /* synthetic */ int b;
    public final /* synthetic */ izs c;

    public /* synthetic */ j6a(izs izsVar, int i) {
        this.b = i;
        this.c = izsVar;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 0:
                return (hda) this.c.invoke(obj);
            case 1:
                return (ttf.i.a) this.c.invoke(obj);
            default:
                return (vbu0) this.c.invoke(obj);
        }
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        Parcelable parcelable;
        Object parcelable2;
        qcy<Object>[] qcyVarArr = ph.n1;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("database_result", SearchLocation.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("database_result");
            if (!(parcelable3 instanceof SearchLocation)) {
                parcelable3 = null;
            }
            parcelable = (SearchLocation) parcelable3;
        }
        this.c.invoke(parcelable);
    }
}
