package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.semantics.d;
import androidx.compose.ui.semantics.f;
import com.yandex.go.navigator.alt_select.AddressStateView;
import com.yandex.mobile.drive.view.AlertButtonView;
import java.util.ArrayList;
import kotlin.Pair;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.utils.c;

/* loaded from: classes13.dex */
public final /* synthetic */ class j01 implements tls {
    public final /* synthetic */ int a;

    public /* synthetic */ j01(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [ihv0, ijv0, k9s0] */
    /* JADX WARN: Type inference failed for: r8v1, types: [com.yandex.go.address.models.Address] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        pv0 pv0Var;
        CharSequence generateTitle$lambda$0;
        zy11 onTap$lambda$2;
        int i = this.a;
        int i2 = 63;
        int i3 = 9;
        int i4 = 1;
        ?? r8 = 0;
        r8 = 0;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                break;
            case 1:
                f.d((mnq0) obj);
                break;
            case 2:
                f.v((mnq0) obj);
                break;
            case 3:
                mnq0 mnq0Var = (mnq0) obj;
                f.v(mnq0Var);
                f.w(mnq0Var, 1.0f);
                break;
            case 4:
                mnq0 mnq0Var2 = (mnq0) obj;
                f.v(mnq0Var2);
                f.w(mnq0Var2, 0.0f);
                break;
            case 5:
                mnq0 mnq0Var3 = (mnq0) obj;
                f.v(mnq0Var3);
                f.w(mnq0Var3, 2.0f);
                break;
            case 6:
                ((y21) obj).a.r(new j01(i3));
                break;
            case 7:
                ((qz0) obj).a();
                break;
            case 8:
                break;
            case 9:
                e21 e21Var = ((d21) obj).a;
                f21 a = e21Var.I.a();
                if (a != null && (pv0Var = a.c) != null) {
                    r8 = pv0Var.a;
                }
                if (r8 == 0) {
                    e21Var.r(new j01(7));
                    break;
                } else {
                    e21Var.r(new yd0(r8, i4));
                    break;
                }
                break;
            case 10:
                generateTitle$lambda$0 = AddressStateView.generateTitle$lambda$0((ne50) obj);
                break;
            case 11:
                ((r71) obj).g();
                break;
            case 12:
                ((r71) obj).q();
                break;
            case 13:
                break;
            case 14:
                ca1 ca1Var = new ca1((ListItemComponent) obj, i4);
                View view = (View) ca1Var.R;
                ListItemComponent listItemComponent = (ListItemComponent) view;
                listItemComponent.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
                listItemComponent.setTitleTextSizePx(tje.r(mrg0.component_text_size_body, listItemComponent.getContext()));
                ((ListItemComponent) view).setLeadImage(c.l(q0h0.ic_scooters_agreement_point, view));
                break;
            case 15:
                qam qamVar = (qam) obj;
                float w0 = qamVar.w0(2.0f);
                Float valueOf = Float.valueOf(0.0f);
                long j = ldc.l;
                Pair pair = new Pair(valueOf, new ldc(j));
                Pair pair2 = new Pair(Float.valueOf(0.47f), new ldc(j));
                Float valueOf2 = Float.valueOf(0.51f);
                long j2 = ldc.f;
                Pair[] pairArr = {pair, pair2, new Pair(valueOf2, new ldc(ldc.b(j2, 0.05f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.55f), new ldc(ldc.b(j2, 0.3f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.59f), new ldc(ldc.b(j2, 0.4f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.625f), new ldc(ldc.b(j2, 0.4f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.66f), new ldc(ldc.b(j2, 0.4f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.7f), new ldc(ldc.b(j2, 0.3f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.74f), new ldc(ldc.b(j2, 0.05f, 0.0f, 0.0f, 0.0f, 14))), new Pair(Float.valueOf(0.78f), new ldc(j)), new Pair(Float.valueOf(1.0f), new ldc(j))};
                long P = qamVar.P();
                ArrayList arrayList = new ArrayList(11);
                for (int i5 = 0; i5 < 11; i5++) {
                    arrayList.add(new ldc(((ldc) pairArr[i5].f()).a));
                }
                ArrayList arrayList2 = new ArrayList(11);
                for (int i6 = 0; i6 < 11; i6++) {
                    arrayList2.add(Float.valueOf(((Number) pairArr[i6].c()).floatValue()));
                }
                qam.M(qamVar, new nxw0(P, arrayList, arrayList2), -180.0f, 90.0f, 0L, 0L, new jvu0(0, 0, 30, w0, 0.0f), 880);
                break;
            case 16:
                wkx wkxVar = (wkx) obj;
                wkxVar.a = 1000;
                Float valueOf3 = Float.valueOf(1.0f);
                wkxVar.a(0, valueOf3);
                wkxVar.a(499, valueOf3);
                Float valueOf4 = Float.valueOf(0.0f);
                wkxVar.a(500, valueOf4);
                wkxVar.a(999, valueOf4);
                break;
            case 17:
                f.d((mnq0) obj);
                break;
            case 18:
                kgx[] kgxVarArr = f.a;
                ((mnq0) obj).a(d.q, zy11Var);
                break;
            case 19:
                kgx[] kgxVarArr2 = f.a;
                ((mnq0) obj).a(d.q, zy11Var);
                break;
            case 20:
                f.d((mnq0) obj);
                break;
            case 21:
                break;
            case 22:
                onTap$lambda$2 = AlertButtonView.onTap$lambda$2((AlertButtonView) obj);
                break;
            case 23:
                ((lf00) obj).b().h();
                break;
            case 24:
                ((lht0) obj).a.Y(new xse0(r8, r8, r8, i2));
                break;
            case 25:
                ((lht0) obj).a.Y(new xse0(r8, r8, r8, i2));
                break;
            case 26:
                pw1 pw1Var = ((ow1) obj).a;
                pw1Var.r(new qu(i3));
                ((d4) pw1Var.F).invoke();
                break;
            case 27:
                break;
            case 28:
                ((lf00) obj).b().h();
                break;
            default:
                ((lf00) obj).b().h();
                break;
        }
        return zy11Var;
    }
}
