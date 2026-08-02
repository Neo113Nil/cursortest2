package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.due_timetable.presentation.widget.day_selector.DaySelectorView;
import com.yandex.payment.divkit.bind.view.DKCardInputViewImpl;
import com.yandex.payment.sdk.ui.CardInput$State;
import defpackage.bts;
import defpackage.did;
import defpackage.e0i0;
import defpackage.eg01;
import defpackage.et41;
import defpackage.f5z;
import defpackage.fid;
import defpackage.j2m0;
import defpackage.kr41;
import defpackage.ku41;
import defpackage.kv8;
import defpackage.lr41;
import defpackage.ny61;
import defpackage.o430;
import defpackage.o501;
import defpackage.ooc;
import defpackage.q7u;
import defpackage.qoi0;
import defpackage.rol0;
import defpackage.rs31;
import defpackage.rzh0;
import defpackage.s421;
import defpackage.sl41;
import defpackage.tls;
import defpackage.tm41;
import defpackage.v0h0;
import defpackage.w8f;
import defpackage.wm41;
import defpackage.x9o;
import defpackage.xjg;
import defpackage.xvi;
import defpackage.yt0;
import defpackage.yuj0;
import defpackage.zpn;
import defpackage.zvi;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.digits_input.c;
import ru.yandex.taxi.delivery.contacts.DeliveryContactsModalView;
import ru.yandex.taxi.design.AnimatedListItemInputComponent;
import ru.yandex.taxi.design.AutoDividerComponentList;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.sdk.cost_details.ui.a;

/* loaded from: classes11.dex */
public final /* synthetic */ class mjf implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mjf(f530 f530Var, qor qorVar, int i) {
        this.a = 21;
        this.c = f530Var;
        this.b = qorVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0371, code lost:
    
        if (r8 == r7) goto L94;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        zy11 onStateChangeListener$lambda$0;
        zy11 daySelectorAdapter$lambda$0;
        boolean initViews$lambda$1$2;
        float f;
        c530 c530Var;
        sls slsVar;
        bts btsVar;
        float f2;
        o430 o430Var;
        boolean z;
        int i = this.a;
        g43 g43Var = lr20.c;
        o430 o430Var2 = did.a;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                qub1.a((irl) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                onStateChangeListener$lambda$0 = DKCardInputViewImpl.setOnStateChangeListener$lambda$0((DKCardInputViewImpl) obj4, (tls) obj3, (CardInput$State) obj, (CardInput$State) obj2);
                return onStateChangeListener$lambda$0;
            case 2:
                tgg tggVar = (tgg) obj4;
                g3q0 g3q0Var = (g3q0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar;
                if (btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    tggVar.c(g3q0Var.a, null, btsVar2, 0, 2);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 3:
                daySelectorAdapter$lambda$0 = DaySelectorView.daySelectorAdapter$lambda$0((DaySelectorView) obj4, (Context) obj3, ((Integer) obj).intValue(), (nsg) obj2);
                return daySelectorAdapter$lambda$0;
            case 4:
                ((Integer) obj2).getClass();
                ((x6h) obj4).a((m2v) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 5:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) ((zgf) obj3).b;
                String str = (String) obj2;
                Set set = ((nj51) obj).a;
                nj51 nj51Var = (nj51) ((LinkedHashMap) obj4).get(str);
                if (nj51Var == null) {
                    nj51Var = new nj51(0);
                }
                ArrayList arrayList = new ArrayList(set);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (nj51Var.a.contains(next)) {
                        arrayList2.add(next);
                    }
                }
                Set<String> set2 = new nj51(arrayList2).a;
                if (set2.size() == 0) {
                    editor.remove(str);
                } else if (set2.size() < set.size()) {
                    editor.putStringSet(str, set2);
                }
                return zy11Var;
            case 6:
                ((Integer) obj2).getClass();
                cmh.a((lly0) obj4, (zky0) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 7:
                mai maiVar = (mai) obj4;
                qnh qnhVar = (qnh) obj3;
                View inflate = ((LayoutInflater) obj).inflate(hqh0.item_delivery_block_buttons, (ViewGroup) obj2, false);
                int i2 = deh0.delivery_add_address_button;
                ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i2, inflate);
                if (listItemComponent != null) {
                    i2 = deh0.delivery_change_order_button;
                    ListItemComponent listItemComponent2 = (ListItemComponent) cma1.O(i2, inflate);
                    if (listItemComponent2 != null) {
                        AutoDividerComponentList autoDividerComponentList = (AutoDividerComponentList) inflate;
                        return new y57(new e1x(autoDividerComponentList, autoDividerComponentList, listItemComponent, listItemComponent2), maiVar, qnhVar);
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
                return null;
            case 8:
                ((Integer) obj2).getClass();
                c991.l((gxh) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                initViews$lambda$1$2 = DeliveryContactsModalView.initViews$lambda$1$2((AnimatedListItemInputComponent) obj4, (DeliveryContactsModalView) obj3, ((Integer) obj).intValue(), (KeyEvent) obj2);
                return Boolean.valueOf(initViews$lambda$1$2);
            case 10:
                l2i l2iVar = (l2i) obj4;
                sls slsVar2 = (sls) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar2;
                if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    sic a = qic.a(g43Var, x4c.G, btsVar3, 0);
                    int hashCode = Long.hashCode(btsVar3.T);
                    r1b0 o = btsVar3.o();
                    f530 d = b.d(btsVar3, c530.a);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (btsVar3.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar3.i0();
                    if (btsVar3.S) {
                        btsVar3.n(slsVar3);
                    } else {
                        btsVar3.r0();
                    }
                    qje.W(btsVar3, d.f, a);
                    qje.W(btsVar3, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar3.S || !jl40.l(btsVar3.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar3, hashCode, wlsVar);
                    }
                    qje.W(btsVar3, d.d, d);
                    a.f(l2iVar.c, btsVar3, 0);
                    a.a(l2iVar.d, slsVar2, btsVar3, 0);
                    btsVar3.t(true);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 11:
                ((lhg) ((w3i) obj4).w).c("Shown", (String) obj, obj2, (String) obj3);
                return zy11Var;
            case 12:
                ((Integer) obj2).getClass();
                qti.a((hwy0) obj4, (androidx.compose.runtime.internal.a) obj3, (fid) obj, vng.O(57));
                return zy11Var;
            case 13:
                final xjg xjgVar = (xjg) obj4;
                final ComposeView composeView = (ComposeView) obj3;
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar3;
                if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    xi91.a(wwg.S(-606031973, true, new wls() { // from class: ru.yandex.logistics.sdk.webview.impl.ui.a
                        @Override // defpackage.wls
                        public final Object invoke(Object obj5, Object obj6) {
                            fid fidVar4 = (fid) obj5;
                            int intValue4 = ((Integer) obj6).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            boolean V = btsVar5.V(intValue4 & 1, (intValue4 & 3) != 2);
                            zy11 zy11Var2 = zy11.a;
                            if (!V) {
                                btsVar5.Y();
                                return zy11Var2;
                            }
                            yt0 yt0Var = new yt0((j2m0) btsVar5.m(AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner()), (b) xjg.this.c, 9);
                            rs31 a2 = f5z.a(btsVar5);
                            if (a2 == null) {
                                ny61.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                return null;
                            }
                            b bVar = (b) ooc.G(qoi0.a(b.class), a2, null, yt0Var, a2 instanceof q7u ? ((q7u) a2).getDefaultViewModelCreationExtras() : w8f.b, btsVar5);
                            Object Q = btsVar5.Q();
                            o430 o430Var3 = did.a;
                            if (Q == o430Var3) {
                                Context context = composeView.getContext();
                                et41 et41Var = bVar.A;
                                eg01 eg01Var = bVar.w;
                                ku41 ku41Var = bVar.x;
                                o501 o501Var = new o501(19);
                                lr41.a.getClass();
                                s421 s421Var = new s421(eg01Var, ku41Var, kr41.b, o501Var, 10);
                                rol0 rol0Var = new rol0(new DeliveryWebViewViewModel$createConfig$args$1(bVar, null));
                                yuj0 yuj0Var = bVar.B;
                                x9o x9oVar = new x9o(yuj0Var.a(e0i0.webview_error_title, new Object[0]), yuj0Var.a(e0i0.webview_error_description, new Object[0]), yuj0Var.a(rzh0.common_close, new Object[0]), yuj0Var.a(e0i0.webview_error_reload, new Object[0]));
                                ru.yandex.logistics.sdk.webview.impl.impl.a aVar = new ru.yandex.logistics.sdk.webview.impl.impl.a(new DeliveryWebViewViewModel$createConfig$args$2(1, bVar.c, xvi.class, "onRequestHideWebView", "onRequestHideWebView(Ljava/lang/String;)V", 0));
                                Integer valueOf = Integer.valueOf(v0h0.ic_webview_loading_spinner);
                                bVar.b.getClass();
                                tm41 tm41Var = new tm41(new sl41(rol0Var, x9oVar, aVar, null, valueOf, HProv.PP_LCD_QUERY), s421Var, new kv8(5, bVar));
                                et41Var.a.getClass();
                                Q = new ru.yandex.taxi.logistics.sdk.webview.impl.ui.a(context, tm41Var);
                                btsVar5.o0(Q);
                            }
                            wm41 wm41Var = (wm41) Q;
                            boolean e = btsVar5.e(wm41Var);
                            Object Q2 = btsVar5.Q();
                            if (e || Q2 == o430Var3) {
                                Q2 = new zvi(0, wm41Var);
                                btsVar5.o0(Q2);
                            }
                            zpn.a(zy11Var2, (tls) Q2, btsVar5);
                            ((ru.yandex.taxi.logistics.sdk.webview.impl.ui.a) wm41Var).a(btsVar5, 0);
                            return zy11Var2;
                        }
                    }, btsVar4), btsVar4, 6);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 14:
                ((Integer) obj2).getClass();
                re91.c((l1q0) obj4, (f530) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 15:
                ((Integer) obj2).getClass();
                y891.b((o1q0) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 16:
                tls tlsVar = (tls) obj4;
                gv90 gv90Var = (gv90) obj3;
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    cuj0 cuj0Var = new cuj0(vzg0.ic_tracking_copy, ohb1.e(btsVar5, uzh0.delivery_copy_text_button), Boolean.TRUE, null, 24);
                    boolean k = btsVar5.k(tlsVar) | btsVar5.e(gv90Var);
                    Object Q = btsVar5.Q();
                    if (k || Q == o430Var2) {
                        Q = new k9j(tlsVar, gv90Var, 0);
                        btsVar5.o0(Q);
                    }
                    s3b1.c(cuj0Var, null, false, null, false, null, (sls) Q, btsVar5, 0, 62);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 17:
                mej mejVar = (mej) obj4;
                tls tlsVar2 = (tls) obj3;
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar5;
                boolean V = btsVar6.V(intValue5 & 1, (intValue5 & 3) != 2);
                dmw0 dmw0Var = btsVar6.a;
                if (V) {
                    c530 c530Var2 = c530.a;
                    f530 o2 = an91.o(c530Var2, 0.0f, 20.0f, 0.0f, 8.0f, 5);
                    sic a2 = qic.a(g43Var, x4c.G, btsVar6, 0);
                    int hashCode2 = Long.hashCode(btsVar6.T);
                    r1b0 o3 = btsVar6.o();
                    f530 d2 = b.d(btsVar6, o2);
                    ohd.G1.getClass();
                    sls slsVar4 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar4);
                    } else {
                        btsVar6.r0();
                    }
                    wls wlsVar2 = d.f;
                    qje.W(btsVar6, wlsVar2, a2);
                    wls wlsVar3 = d.e;
                    qje.W(btsVar6, wlsVar3, o3);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    wls wlsVar4 = d.g;
                    qje.W(btsVar6, wlsVar4, valueOf);
                    tls tlsVar3 = d.h;
                    qje.M(btsVar6, tlsVar3);
                    wls wlsVar5 = d.d;
                    qje.W(btsVar6, wlsVar5, d2);
                    String str2 = mejVar.a;
                    if (str2 == null) {
                        btsVar6.e0(-840694903);
                        btsVar6.t(false);
                        btsVar = btsVar6;
                        c530Var = c530Var2;
                        slsVar = slsVar4;
                        f = 8.0f;
                    } else {
                        btsVar6.e0(-840694902);
                        f530 o4 = an91.o(an91.m(c530Var2, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                        ety0 ety0Var = xya1.d(btsVar6).e.e;
                        f = 8.0f;
                        c530Var = c530Var2;
                        slsVar = slsVar4;
                        jeb1.f(str2, o4, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar6, 48, 0, 16380);
                        btsVar = btsVar6;
                        btsVar.t(false);
                    }
                    String str3 = mejVar.b;
                    if (str3 == null) {
                        btsVar.e0(-840458776);
                        btsVar.t(false);
                        f2 = f;
                    } else {
                        btsVar.e0(-840458775);
                        jeb1.f(str3, an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 16.0f, 7), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 48, 0, 16380);
                        btsVar.t(false);
                        f2 = 8.0f;
                    }
                    f530 m = an91.m(c530Var, f2, 0.0f, 2);
                    lhl0 a3 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
                    int hashCode3 = Long.hashCode(btsVar.T);
                    r1b0 o5 = btsVar.o();
                    f530 d3 = b.d(btsVar, m);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar2, a3);
                    qje.W(btsVar, wlsVar3, o5);
                    vfc.v(hashCode3, btsVar, wlsVar4, btsVar, tlsVar3);
                    qje.W(btsVar, wlsVar5, d3);
                    String str4 = mejVar.c;
                    if (str4 == null) {
                        btsVar.e0(-1368558818);
                        btsVar.t(false);
                        o430Var = o430Var2;
                    } else {
                        btsVar.e0(-1368558817);
                        if (1.0f <= 0.0d) {
                            gxv.a("invalid weight; must be greater than zero");
                        }
                        x2y x2yVar = new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                        ButtonStyle buttonStyle = ButtonStyle.Minor;
                        ButtonSize buttonSize = ButtonSize.M;
                        boolean k2 = btsVar.k(tlsVar2);
                        Object Q2 = btsVar.Q();
                        if (!k2) {
                            o430Var = o430Var2;
                            break;
                        } else {
                            o430Var = o430Var2;
                        }
                        Q2 = new azd(7, tlsVar2);
                        btsVar.o0(Q2);
                        d17.c(x2yVar, false, buttonSize, buttonStyle, null, (sls) Q2, wwg.S(-1128801270, true, new le(str4, 20), btsVar), btsVar, 1576320, 18);
                        btsVar.t(false);
                    }
                    String str5 = mejVar.d;
                    if (str5 == null) {
                        btsVar.e0(-1368180897);
                        btsVar.t(false);
                        z = true;
                    } else {
                        btsVar.e0(-1368180896);
                        if (1.0f <= 0.0d) {
                            gxv.a("invalid weight; must be greater than zero");
                        }
                        x2y x2yVar2 = new x2y(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true);
                        ButtonStyle buttonStyle2 = ButtonStyle.Main;
                        ButtonSize buttonSize2 = ButtonSize.M;
                        boolean k3 = btsVar.k(tlsVar2);
                        Object Q3 = btsVar.Q();
                        if (k3 || Q3 == o430Var) {
                            Q3 = new azd(8, tlsVar2);
                            btsVar.o0(Q3);
                        }
                        z = true;
                        d17.c(x2yVar2, false, buttonSize2, buttonStyle2, null, (sls) Q3, wwg.S(-352066367, true, new le(str5, 21), btsVar), btsVar, 1576320, 18);
                        btsVar.t(false);
                    }
                    btsVar.t(z);
                    btsVar.t(z);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 18:
                oz40 oz40Var = (oz40) obj3;
                hwo0.c(((c) obj4).c, (String) obj, (tky0) obj2, ((Boolean) oz40Var.getValue()).booleanValue(), null, 8);
                oz40Var.setValue(Boolean.TRUE);
                return zy11Var;
            case 19:
                ((Integer) obj2).getClass();
                ph91.a((hlj) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 20:
                ((Integer) obj2).getClass();
                vh91.b((wtj) obj4, (sls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 21:
                ((Integer) obj2).getClass();
                uj91.c(vng.O(1), (fid) obj, (qor) obj4, (f530) obj3);
                return zy11Var;
            case 22:
                tls tlsVar4 = (tls) obj4;
                f31 f31Var = (f31) obj3;
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar6;
                if (btsVar7.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    boolean k4 = btsVar7.k(tlsVar4);
                    Object Q4 = btsVar7.Q();
                    if (k4 || Q4 == o430Var2) {
                        Q4 = new azd(12, tlsVar4);
                        btsVar7.o0(Q4);
                    }
                    ohb1.b(null, false, null, (sls) Q4, wwg.S(-989029976, true, new ota(18, f31Var), btsVar7), btsVar7, HProv.ALG_CLASS_DATA_ENCRYPT, 7);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 23:
                ((Integer) obj2).getClass();
                pnm.a((c31) obj4, (sls) obj3, (fid) obj, vng.O(9));
                return zy11Var;
            case 24:
                ((Integer) obj2).getClass();
                mrm.g((rqm) obj4, (String) obj3, (fid) obj, vng.O(7));
                return zy11Var;
            case 25:
                MapBuilder mapBuilder = (MapBuilder) obj3;
                String str6 = (String) obj;
                Object c = ((mum) ((wjm) obj4).x).c((sum) obj2);
                if (c != null) {
                    mapBuilder.put(str6, c);
                }
                return zy11Var;
            case 26:
                wum wumVar = wum.a;
                ((MapBuilder) obj4).put((String) obj, wum.a((kotlinx.serialization.json.b) obj2, (ncx) obj3));
                return zy11Var;
            case 27:
                ((Integer) obj2).getClass();
                k0a1.a((String) obj4, (v4v) obj3, (fid) obj, vng.O(1));
                return zy11Var;
            case 28:
                n351 n351Var = (n351) obj4;
                ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.c cVar = (ru.yandex.taxi.logistics.sdk.tracking.impl.ui.dynamic_content.widget.c) obj3;
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar7;
                if (btsVar8.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    q5n q5nVar = (q5n) n351Var;
                    boolean e = btsVar8.e(cVar) | btsVar8.k(n351Var);
                    Object Q5 = btsVar8.Q();
                    if (e || Q5 == o430Var2) {
                        Q5 = new ymj(16, cVar, n351Var);
                        btsVar8.o0(Q5);
                    }
                    u0a1.a(q5nVar, null, (sls) Q5, btsVar8, 0);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            default:
                ((Integer) obj2).getClass();
                f1a1.d((mu90) obj4, (tls) obj3, (fid) obj, vng.O(1));
                return zy11Var;
        }
    }

    public /* synthetic */ mjf(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ mjf(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
    }
}
