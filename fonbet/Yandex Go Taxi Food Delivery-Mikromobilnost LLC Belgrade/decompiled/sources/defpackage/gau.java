package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.ui.graphics.Path$Direction;
import androidx.compose.ui.semantics.f;
import com.yandex.delivery.utils.notificationmanager.impl.b;
import com.yandex.go.dto.response.Action$RouteInput;
import com.yandex.go.information.a;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.i0;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.m;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.ui.footer.HubFooterView;
import com.yandex.messaging.internal.view.custom.ProgressIndicator$Companion$State;
import com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.selectprovider.presentation.InternetPaymentSelectProviderFragment;
import com.ybsdk.screens.initial.InitialFragment;
import com.ybsdk.widgets.common.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.address.design.SourceDestinationComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.hiredriver.HireDriverModalView;
import ru.yandex.taxi.intercity.analytics.InfiniteTimeEventException;

/* loaded from: classes14.dex */
public final /* synthetic */ class gau implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gau(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        zy11 insetsType$lambda$0;
        zy11 filtersAdapter$lambda$0;
        zy11 render$lambda$5$lambda$4;
        long j;
        Object obj2;
        Object obj3;
        Object obj4;
        g render$lambda$12$lambda$10$lambda$9;
        int i = this.a;
        int i2 = 9;
        int i3 = 0;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.b;
        switch (i) {
            case 0:
                f.l((mnq0) obj, ((ize0) ((kze0) obj5)).d);
                return zy11Var;
            case 1:
                f.l((mnq0) obj, ((x0f0) ((a1f0) obj5)).e);
                return zy11Var;
            case 2:
                f.l((mnq0) obj, ((hgx0) obj5).c);
                return zy11Var;
            case 3:
                ListItemComponent listItemComponent = new ListItemComponent(((ViewGroup) obj).getContext(), null, 0, 6, null);
                listItemComponent.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
                listItemComponent.setTitleTextSizePx(tje.u(27, listItemComponent.getContext()));
                listItemComponent.getContext();
                listItemComponent.setTitleTypeface(((zmh) ((ip11) obj5)).d());
                return listItemComponent;
            case 4:
                qam.t((qam) obj, zoy0.E((Pair[]) Arrays.copyOf((Pair[]) obj5, 3), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r12.c() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(0.0f) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r12.c() >> 32)) / 2.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (r12.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD))) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), 8), 0L, 0L, 0.0f, null, 0, HProv.PP_DELETE_SAVED_PASSWD);
                return zy11Var;
            case 5:
                r531 r531Var = (r531) obj;
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.f fVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.header.f) ((fub) obj5).d;
                ((ClipboardManager) fVar.c.a.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("VehicleInfo", r531Var.a));
                bi60 bi60Var = fVar.d;
                vi60 vi60Var = new vi60(r531Var.b, 2750L);
                b bVar = (b) bi60Var;
                bVar.getClass();
                bVar.a.d(new di60(vi60Var, gwk0.b()));
                return zy11Var;
            case 6:
                insetsType$lambda$0 = HireDriverModalView.insetsType$lambda$0((HireDriverModalView) obj5, (t1w) obj);
                return insetsType$lambda$0;
            case 7:
                return (SourceDestinationComponent) obj5;
            case 8:
                filtersAdapter$lambda$0 = HubFooterView.filtersAdapter$lambda$0((HubFooterView) obj5, (yxu) obj);
                return filtersAdapter$lambda$0;
            case 9:
                f.l((mnq0) obj, ((a0v) obj5).n);
                return zy11Var;
            case 10:
                return ((kk31) obj5).asView();
            case 11:
                return (q7v) obj5;
            case 12:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj5;
                int i4 = ref$IntRef.element;
                ref$IntRef.element = i4 + 1;
                return i4 + ":" + ((mw01) obj).a();
            case 13:
                q4g q4gVar = (q4g) obj5;
                ai91.e((TextView) q4gVar.c, ((ProgressIndicator$Companion$State) obj) == ProgressIndicator$Companion$State.Error);
                ((TextView) q4gVar.c).setText(oyh0.messaging_image_viewer_error_load_yadisk_image);
                return zy11Var;
            case 14:
                androidx.compose.material3.g gVar = (androidx.compose.material3.g) obj5;
                androidx.compose.ui.draw.b bVar2 = (androidx.compose.ui.draw.b) obj;
                float density = bVar2.getDensity() * ((y7m) gVar.F.e()).a;
                jb2 a = nb2.a();
                ehr0 ehr0Var = gVar.E;
                if (ehr0Var == null) {
                    ehr0Var = zir0.a((wir0) npb1.c(gVar, zir0.a), z3r.d);
                }
                jd00.b(a, ehr0Var.a(bVar2.a.c(), bVar2.a.getLayoutDirection(), bVar2));
                jb2 a2 = nb2.a();
                a2.e(new zii0(0.0f, Float.intBitsToFloat((int) (bVar2.a.c() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) - density, Float.intBitsToFloat((int) (bVar2.a.c() >> 32)), Float.intBitsToFloat((int) (_Gost_CryptoPro_PrivateKeyValues.maxDWORD & bVar2.a.c()))), Path$Direction.CounterClockwise);
                jb2 a3 = nb2.a();
                a3.n(a2, a, 1);
                return bVar2.b(new mgu(6, a3, gVar));
            case 15:
                buv buvVar = (buv) obj5;
                yfd yfdVar = (yfd) obj;
                tpr a4 = buvVar.F.a((vuv) ((agd) yfdVar).d);
                agd agdVar = (agd) yfdVar;
                agdVar.c = a4;
                agdVar.e = new a(buvVar, new auv(buvVar), i3);
                w7d.a.getClass();
                agdVar.g = w7d.b;
                return zy11Var;
            case 16:
                render$lambda$5$lambda$4 = InitialFragment.render$lambda$5$lambda$4((InitialFragment) obj5, (String) obj);
                return render$lambda$5$lambda$4;
            case 17:
                xrr xrrVar = (xrr) obj5;
                if (((Boolean) obj).booleanValue()) {
                    j = ((hz60) xrrVar.c).c;
                } else {
                    o430 o430Var = e3n.b;
                    j = 0;
                }
                return new e3n(j);
            case 18:
                ((l2w) obj5).a((View) obj);
                return zy11Var;
            case 19:
                com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a aVar = (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.a) obj5;
                jlw jlwVar = (jlw) obj;
                if (!(jlwVar instanceof glw)) {
                    return jlwVar;
                }
                glw glwVar = (glw) jlwVar;
                xy40 xy40Var = (xy40) glwVar.c;
                Iterator it = xy40Var.i().iterator();
                while (true) {
                    ry40 ry40Var = (ry40) it;
                    if (ry40Var.hasNext()) {
                        obj2 = ry40Var.next();
                        if (((hjw) obj2) instanceof cjw) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                cjw cjwVar = obj2 instanceof cjw ? (cjw) obj2 : null;
                if (cjwVar == null) {
                    return jlwVar;
                }
                cjw cjwVar2 = new cjw(cjwVar.a, cjwVar.b, aVar.b.a().f);
                uy40 i5 = xy40Var.i();
                ArrayList arrayList = new ArrayList(tcc.n(i5, 10));
                Iterator it2 = i5.iterator();
                while (true) {
                    ry40 ry40Var2 = (ry40) it2;
                    if (!ry40Var2.hasNext()) {
                        xy40 xy40Var2 = new xy40(arrayList.size());
                        xy40Var2.h(arrayList);
                        return glw.a(glwVar, null, xy40Var2, false, HProv.PP_PASSWD_TERM);
                    }
                    hjw hjwVar = (hjw) ry40Var2.next();
                    if (hjwVar instanceof cjw) {
                        hjwVar = cjwVar2;
                    }
                    arrayList.add(hjwVar);
                }
            case 20:
                ((hcw) obj5).r(new qu(i2));
                return zy11Var;
            case 21:
                com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f fVar2 = (com.yandex.go.taxi.intercity.dashboard.impl.domain.interactor.f) obj5;
                jlw jlwVar2 = (jlw) obj;
                if (!(jlwVar2 instanceof glw)) {
                    return jlwVar2;
                }
                m mVar = fVar2.q;
                glw glwVar2 = (glw) jlwVar2;
                com.yandex.go.taxi.intercity.dashboard.impl.data.repository.a aVar2 = mVar.e;
                IntercityDashboardResponseDto intercityDashboardResponseDto = aVar2.a().c;
                if (intercityDashboardResponseDto == null) {
                    return glwVar2;
                }
                Iterator it3 = intercityDashboardResponseDto.d.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        obj3 = it3.next();
                        if (((i0) obj3) instanceof IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                if (!(obj3 instanceof IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity)) {
                    obj3 = null;
                }
                IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity intercityDashboardSectionDto$DueSelectorSectionDtoIntercity = (IntercityDashboardSectionDto$DueSelectorSectionDtoIntercity) obj3;
                if (intercityDashboardSectionDto$DueSelectorSectionDtoIntercity == null) {
                    return glwVar2;
                }
                yfw a5 = aVar2.a();
                djw h = mVar.b.h(intercityDashboardSectionDto$DueSelectorSectionDtoIntercity, intercityDashboardResponseDto.g, intercityDashboardResponseDto.e, a5.a, a5.e);
                uy40 i6 = ((xy40) glwVar2.c).i();
                ArrayList arrayList2 = new ArrayList();
                Iterator it4 = i6.iterator();
                while (true) {
                    ry40 ry40Var3 = (ry40) it4;
                    if (!ry40Var3.hasNext()) {
                        xy40 xy40Var3 = new xy40(arrayList2.size());
                        xy40Var3.h(arrayList2);
                        return glw.a(glwVar2, null, xy40Var3, false, HProv.PP_PASSWD_TERM);
                    }
                    hjw hjwVar2 = (hjw) ry40Var3.next();
                    if (hjwVar2 instanceof djw) {
                        hjwVar2 = h;
                    }
                    if (hjwVar2 != null) {
                        arrayList2.add(hjwVar2);
                    }
                }
            case 22:
                glw glwVar3 = (glw) obj5;
                jlw jlwVar3 = (jlw) obj;
                if (!(jlwVar3 instanceof glw)) {
                    return jlwVar3;
                }
                xy40 xy40Var4 = new xy40(glwVar3.c.b);
                mp60 mp60Var = glwVar3.c;
                Object[] objArr = mp60Var.a;
                int i7 = mp60Var.b;
                int i8 = 0;
                while (true) {
                    if (i8 < i7) {
                        obj4 = objArr[i8];
                        if (!(((hjw) obj4) instanceof gjw)) {
                            i8++;
                        }
                    } else {
                        obj4 = null;
                    }
                }
                if (!(obj4 instanceof gjw)) {
                    obj4 = null;
                }
                gjw gjwVar = (gjw) obj4;
                glw glwVar4 = (glw) jlwVar3;
                mp60 mp60Var2 = glwVar4.c;
                Object[] objArr2 = mp60Var2.a;
                int i9 = mp60Var2.b;
                for (int i10 = 0; i10 < i9; i10++) {
                    hjw hjwVar3 = (hjw) objArr2[i10];
                    if (!(hjwVar3 instanceof gjw) || gjwVar == null) {
                        xy40Var4.g(hjwVar3);
                    } else {
                        xy40Var4.g(gjwVar);
                    }
                }
                return glw.a(glwVar4, null, xy40Var4, false, HProv.PP_PASSWD_TERM);
            case 23:
                return new igw(i3, (jgw) obj5);
            case 24:
                pmw pmwVar = (pmw) obj5;
                Action$RouteInput action$RouteInput = (Action$RouteInput) obj;
                pmwVar.A((m950) pmwVar.E.get(), action$RouteInput.a, new omw(pmwVar, action$RouteInput.b));
                return zy11Var;
            case 25:
                Action$RouteInput action$RouteInput2 = (Action$RouteInput) obj;
                gau gauVar = ((qmw) obj5).d;
                if (gauVar != null) {
                    gauVar.invoke(action$RouteInput2);
                }
                return zy11Var;
            case 26:
                zsa zsaVar = ((hdw) obj).a;
                zsaVar.r(new qu(i2));
                ((lc0) zsaVar.F).invoke((ymw) obj5);
                return zy11Var;
            case 27:
                long longValue = ((Long) obj).longValue();
                return new InfiniteTimeEventException(((row) obj5).c + " not finished in " + longValue + " ms");
            case 28:
                return etw.a((etw) ((com.ybsdk.feature.transfer.version2.internal.screens.internetpayments.screens.forminput.presentation.b) obj5).X(), new t8j0(), null, null, false, 30);
            default:
                render$lambda$12$lambda$10$lambda$9 = InternetPaymentSelectProviderFragment.render$lambda$12$lambda$10$lambda$9((auw) obj5, (g) obj);
                return render$lambda$12$lambda$10$lambda$9;
        }
    }
}
