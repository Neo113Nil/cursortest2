package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.semantics.f;
import androidx.core.view.ViewCompat$Api21Impl;
import com.google.android.material.tabs.TabLayout;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubFilterDtoV2;
import com.yandex.go.walking.navigation.impl.c;
import com.yandex.payment.sdk.ui.ViewBindingActivityImpl;
import com.yandex.runtime.Error;
import java.util.Objects;
import java.util.WeakHashMap;
import kotlin.collections.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.sdk.tracking.impl.vertical_timeline.ui.b;

/* loaded from: classes14.dex */
public final /* synthetic */ class ke31 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ ke31(int i) {
        this.a = i;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        boolean idsForNamelessViews$lambda$0;
        int i = this.a;
        int i2 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                return ((mi31) obj).a;
            case 1:
                return ((HubFilterDtoV2) obj).h;
            case 2:
                return new zh31((iej0) obj);
            case 3:
                return new uh31((u0s) obj);
            case 4:
                return new bi31((etz0) obj);
            case 5:
                return new ci31((kmq0) obj);
            case 6:
                return new sh31((v81) obj);
            case 7:
                return new ai31((lww0) obj);
            case 8:
                int i3 = b.b;
                return zy11Var;
            case 9:
                int i4 = b.b;
                return zy11Var;
            case 10:
                f.d((mnq0) obj);
                return zy11Var;
            case 11:
                za31 za31Var = (za31) obj;
                Object obj2 = (mi31) a.R(za31Var.b);
                if (obj2 == null) {
                    obj2 = a.X(za31Var.b, ",", null, null, new ke31(12), 30);
                }
                return za31Var.a.a + Extension.O_BRAKE + obj2 + Extension.C_BRAKE;
            case 12:
                return ((mi31) obj).a.b;
            case 13:
                return new gar0((View) obj, 1);
            case 14:
                czj0 czj0Var = (czj0) obj;
                if (czj0Var.d) {
                    Throwable th = czj0Var.c;
                    Objects.requireNonNull(th);
                    qwf0.a("VideoRecordEventListener.onEvent", th);
                }
                return null;
            case 15:
                idsForNamelessViews$lambda$0 = ViewBindingActivityImpl.setIdsForNamelessViews$lambda$0((View) obj);
                return Boolean.valueOf(idsForNamelessViews$lambda$0);
            case 16:
                WeakHashMap weakHashMap = androidx.core.view.b.a;
                ViewCompat$Api21Impl.o((View) obj, null);
                return zy11Var;
            case 17:
                return Boolean.TRUE;
            case 18:
                return ((ur31) obj).a;
            case 19:
                return Integer.valueOf(((ur31) obj).b);
            case 20:
                return Integer.valueOf(((ur31) obj).a().size());
            case 21:
                return (TextView) ((TabLayout.a) obj).e.findViewById(e9h0.switcher_tab_title);
            case 22:
                return zy11Var;
            case 23:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                nzs.s(listItemComponent, -1, -2);
                return listItemComponent;
            case 24:
                ((b2u0) ((iz31) obj)).a.r(new qu(9));
                return zy11Var;
            case 25:
                ((com.yandex.go.walking.navigation.impl.b) obj).n1();
                return zy11Var;
            case 26:
                ((x141) obj).a.r(new qu(9));
                return zy11Var;
            case 27:
                ((x141) obj).a.U(b341.a, false);
                return zy11Var;
            case 28:
                k541 k541Var = (k541) obj;
                c cVar = k541Var.a;
                cVar.I.c(k541Var.b, k541Var.c);
                cVar.C((m950) cVar.F.get(), new j541(cVar, i2));
                return zy11Var;
            default:
                return "Error " + ((Error) obj) + " during walking route uri resolving";
        }
    }

    public /* synthetic */ ke31(int i, Object obj) {
        this.a = i;
    }
}
