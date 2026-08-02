package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.PermissionRequest;
import com.vk.catalog2.common.ui.holders.SwitchCatalogVh;
import java.util.ArrayList;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class zx90 implements gzs {
    public final /* synthetic */ int b = 1;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ zx90(SwitchCatalogVh switchCatalogVh, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c = switchCatalogVh;
        this.d = layoutInflater;
        this.e = viewGroup;
        this.f = bundle;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                ay90 ay90Var = (ay90) this.c;
                ArrayList arrayList = (ArrayList) this.d;
                ((PermissionRequest) this.f).grant((String[]) rli0.A(rli0.v(new ulp0(rli0.j(new i5g(ay90Var.f.entrySet()), new lxz((ArrayList) this.e, 15)), new kl60(5)), arrayList)).toArray(new String[0]));
                return s3q0.a;
            default:
                SwitchCatalogVh switchCatalogVh = (SwitchCatalogVh) this.c;
                LayoutInflater layoutInflater = (LayoutInflater) this.d;
                ViewGroup viewGroup = (ViewGroup) this.e;
                View k5 = switchCatalogVh.d.k5(layoutInflater, viewGroup, (Bundle) this.f);
                viewGroup.addView(k5);
                return k5;
        }
    }

    public /* synthetic */ zx90(ay90 ay90Var, ArrayList arrayList, PermissionRequest permissionRequest, ArrayList arrayList2) {
        this.c = ay90Var;
        this.d = arrayList;
        this.f = permissionRequest;
        this.e = arrayList2;
    }
}
