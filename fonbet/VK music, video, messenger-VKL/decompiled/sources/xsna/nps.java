package xsna;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.widget.Toast;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.catalog2.common.ui.holders.friend.FriendsItemListVh;
import com.vkontakte.android.R;
import xsna.wih0;
import xsna.yt0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class nps implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ nps(Context context, wih0.d.a aVar, evk0 evk0Var, String str) {
        this.b = 2;
        this.c = context;
        this.d = aVar;
        this.e = evk0Var;
        this.f = str;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ((FriendsItemListVh) this.d).b(this.c, (UIBlockProfile) this.e, (CatalogViewType) this.f);
                break;
            case 1:
                String str = (String) this.d;
                gzs gzsVar = (gzs) this.e;
                gzs gzsVar2 = (gzs) this.f;
                new io.reactivex.rxjava3.internal.operators.single.r(new io.reactivex.rxjava3.internal.operators.observable.i0(dug0.a(com.vk.core.files.a.s(), str).r0(asu0.a.c()), new v34(new l140(6), 22)).K(), new x34(new o440(this.c, 11), 24)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new q440(new vxd(1, gzsVar), 10), new oo20(new fha0(0, gzsVar2), 11));
                break;
            default:
                wih0.d.a aVar = (wih0.d.a) this.d;
                evk0 evk0Var = (evk0) this.e;
                String str2 = (String) this.f;
                Context context = this.c;
                ClipboardManager clipboardManager = (ClipboardManager) context.getSystemService("clipboard");
                String str3 = aVar.g;
                clipboardManager.setPrimaryClip(ClipData.newPlainText(str3, str3));
                Toast.makeText(context, context.getString(R.string.ad_marker_copied), 0).show();
                evk0Var.d.invoke(new yt0.h.c(new zt0(str2, aVar.i)));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ nps(Object obj, Context context, Object obj2, Object obj3, int i) {
        this.b = i;
        this.d = obj;
        this.c = context;
        this.e = obj2;
        this.f = obj3;
    }
}
