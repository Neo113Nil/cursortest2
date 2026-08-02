package defpackage;

import android.view.View;
import androidx.compose.ui.semantics.f;
import com.fluttercandies.photo_manager.core.utils.b;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView;
import com.yandex.xplat.common.YSError;
import java.util.LinkedHashMap;
import java.util.Set;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.favorites.edit.presenter.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class jiu implements tls {
    public final /* synthetic */ int a;

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 onFilterSelected$lambda$0;
        int i = this.a;
        int i2 = 9;
        int i3 = 3;
        int i4 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                f.d((mnq0) obj);
                break;
            case 1:
                break;
            case 4:
                zsa zsaVar = ((sfp) obj).a;
                zsaVar.r(new qu(i2));
                ((c) zsaVar.F).invoke();
                break;
            case 5:
                zsa zsaVar2 = ((sfp) obj).a;
                zsaVar2.r(new qu(i2));
                ((c1o) zsaVar2.G).invoke();
                break;
            case 6:
                Set set = rtu.a;
                break;
            case 7:
                onFilterSelected$lambda$0 = HubFooterView.onFilterSelected$lambda$0((yxu) obj);
                break;
            case 9:
                v2v v2vVar = b.a;
                break;
            case 12:
                YSError ySError = (YSError) obj;
                LinkedHashMap linkedHashMap = zdz.a;
                ogb1.b("Check status polling failed: " + ySError.getMessage());
                break;
            case 13:
                ((Boolean) obj).getClass();
                break;
            case 14:
                wj00 b = ((y3x) obj).b();
                break;
            case 15:
                break;
            case 17:
                yn50 yn50Var = (yn50) ((g9v) obj);
                yn50Var.b.g = true;
                break;
            case 18:
                ((yjv) obj).Z(true);
                break;
            case 19:
                ((yjv) obj).u();
                break;
            case 20:
                ((yjv) obj).a();
                break;
            case 21:
                ((yjv) obj).u();
                break;
            case 22:
                ((skv) obj).u0();
                break;
            case 23:
                ((skv) obj).u0();
                break;
            case 24:
                ((skv) obj).u0();
                break;
            case 25:
                f6v f6vVar = (f6v) obj;
                h6v h6vVar = f6vVar.a;
                Boolean valueOf = h6vVar != null ? Boolean.valueOf(h6vVar.b) : null;
                if (!jl40.l(valueOf, Boolean.TRUE)) {
                    if (valueOf != null && !valueOf.equals(Boolean.FALSE)) {
                        w511.b();
                        break;
                    } else {
                        h6v h6vVar2 = f6vVar.a;
                        Object obj2 = h6vVar2 != null ? h6vVar2.a : null;
                        Object obj3 = f6vVar.b;
                        break;
                    }
                }
                break;
            case 26:
                ca1 ca1Var = new ca1((ListItemComponent) obj, 18);
                nzs.s((ListItemComponent) ((View) ca1Var.R), -1, -2);
                break;
        }
        return Integer.valueOf(-((Integer) obj).intValue());
    }

    public /* synthetic */ jiu(int i) {
        this.a = i;
    }
}
