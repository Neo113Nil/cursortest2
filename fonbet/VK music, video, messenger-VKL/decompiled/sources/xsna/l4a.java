package xsna;

import android.R;
import android.view.View;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import xsna.av20;

/* compiled from: CatalogDialogs.kt */
/* loaded from: classes16.dex */
public final class l4a implements av20.b<CatalogFilterData> {
    public final /* synthetic */ izs<String, s3q0> a;

    /* JADX WARN: Multi-variable type inference failed */
    public l4a(izs<? super String, s3q0> izsVar) {
        this.a = izsVar;
    }

    @Override // xsna.av20.b
    public final void a(View view, Object obj, int i, wmg wmgVar) {
        this.a.invoke(((CatalogFilterData) obj).b);
        view.postDelayed(new qn2(1), view.getContext().getResources().getInteger(R.integer.config_shortAnimTime));
    }
}
