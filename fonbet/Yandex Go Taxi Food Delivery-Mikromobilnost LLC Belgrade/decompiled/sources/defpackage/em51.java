package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import ru.yandextaxi.flutter_yandex_mapkit.jni.JniBinaryMessenger;

/* loaded from: classes7.dex */
public final class em51 implements tsr, r30 {
    public final ini0 a = new ini0();
    public final ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public final ArrayList w = new ArrayList();
    public final ArrayList x = new ArrayList();
    public final e40 y = new e40();

    @Override // defpackage.r30
    public final void onAttachedToActivity(l40 l40Var) {
        this.y.onAttachedToActivity(l40Var);
    }

    @Override // defpackage.tsr
    public final void onAttachedToEngine(ssr ssrVar) {
        eu00 eu00Var = new eu00();
        y801 y801Var = new y801();
        fmj fmjVar = new fmj();
        gmj gmjVar = new gmj();
        f311 f311Var = new f311();
        h311 h311Var = new h311();
        f4u f4uVar = new f4u();
        osk0 osk0Var = new osk0();
        mup0 mup0Var = new mup0();
        nd1 nd1Var = new nd1();
        qsk0 qsk0Var = new qsk0();
        v9z v9zVar = new v9z();
        aot0 aot0Var = new aot0();
        qz8 qz8Var = new qz8();
        z08 z08Var = new z08();
        z08Var.a = new y08(eu00Var);
        this.b.addAll(scc.g(eu00Var, y801Var, fmjVar, gmjVar, f311Var, h311Var, f4uVar, osk0Var, mup0Var, nd1Var, qsk0Var, v9zVar, qz8Var, z08Var));
        jr7 jr7Var = new jr7(ssrVar, eu00Var);
        ini0 ini0Var = this.a;
        rmj rmjVar = new rmj(ssrVar, ini0Var);
        hdu hduVar = new hdu(ssrVar);
        z801 z801Var = new z801(ssrVar, y801Var, eu00Var);
        h4c0 h4c0Var = new h4c0(ssrVar, ini0Var, eu00Var, hduVar);
        wub wubVar = new wub(ssrVar, ini0Var);
        t7c t7cVar = new t7c(0);
        new afo(ssrVar.c, "flutter_yandex_mapkit/cluster_listener_events").a(new io9(t7cVar));
        wk00 wk00Var = new wk00(ssrVar, ini0Var);
        cm00 cm00Var = new cm00(ssrVar, eu00Var, jr7Var, z08Var, this.a);
        emj emjVar = new emj(ssrVar, ini0Var, 5);
        q8c q8cVar = new q8c(ssrVar, eu00Var, Collections.singletonList(z801Var));
        gi6 gi6Var = new gi6(ssrVar, "bounding_box_helper", 0);
        mra0 mra0Var = new mra0(ssrVar, "pedestrian_router");
        wo5 wo5Var = new wo5(ssrVar, "bicycle_router");
        ryx ryxVar = new ryx(ssrVar, eu00Var);
        fp00 fp00Var = new fp00(ssrVar, this.a, eu00Var, hduVar, scc.g(h4c0Var, wubVar), t7cVar);
        q8c q8cVar2 = new q8c(ssrVar, ini0Var, hduVar, scc.g(h4c0Var, wubVar));
        qd1 qd1Var = new qd1(ssrVar, ini0Var, rmjVar);
        emj emjVar2 = new emj(ssrVar, ini0Var, 6);
        emj emjVar3 = new emj(ssrVar, ini0Var, 7);
        q8c q8cVar3 = new q8c(ssrVar, ini0Var, fmjVar);
        emj emjVar4 = new emj(ssrVar, ini0Var, 1);
        emj emjVar5 = new emj(ssrVar, ini0Var, 3);
        h4u h4uVar = new h4u(ssrVar, f4uVar);
        qd1 qd1Var2 = new qd1(ssrVar, ini0Var, fmjVar);
        emj emjVar6 = new emj(ssrVar, ini0Var, 0);
        bmj bmjVar = new bmj(ssrVar, fmjVar, 1);
        bmj bmjVar2 = new bmj(ssrVar, fmjVar, 0);
        qup0 qup0Var = new qup0(ssrVar, mup0Var, ini0Var);
        xlm xlmVar = new xlm(ssrVar, ini0Var);
        qd1 qd1Var3 = new qd1(ssrVar, nd1Var, eu00Var);
        ps4 ps4Var = new ps4(ssrVar, "banner_image_downloader");
        ps4Var.w = ssrVar.a;
        wva0 wva0Var = new wva0(ssrVar, eu00Var, 1);
        vsk0 vsk0Var = new vsk0(ssrVar, qsk0Var);
        e40 e40Var = this.y;
        this.c.addAll(scc.g(wk00Var, cm00Var, z801Var, emjVar, q8cVar, gi6Var, mra0Var, wo5Var, ryxVar, fp00Var, q8cVar2, h4c0Var, wubVar, qd1Var, emjVar2, emjVar3, q8cVar3, emjVar4, emjVar5, h4uVar, qd1Var2, emjVar6, bmjVar, bmjVar2, qup0Var, xlmVar, qd1Var3, ps4Var, wva0Var, vsk0Var, new q8c(ssrVar, e40Var, eu00Var), new q8c(ssrVar, ini0Var, f311Var), new emj(ssrVar, ini0Var, 10), new m311(ssrVar, this.a, f311Var, h311Var, eu00Var, f4uVar), new emj(ssrVar, ini0Var, 11), new emj(ssrVar, ini0Var, 9), new qd1(ssrVar, ini0Var, f311Var), new h4u(ssrVar, f311Var), new h4u(ssrVar, aot0Var), new qd1(ssrVar, qz8Var, eu00Var), new emj(ssrVar, ini0Var, 4), new gi6(ssrVar, "event_logging", 1), new emj(ssrVar, ini0Var, 2), new emj(ssrVar, ini0Var, 8), new wva0(ssrVar, eu00Var, 0), new gi6(ssrVar, "i18n_manager_controller", 3), new zs11(ssrVar, "ui_experiments_provider"), new gi6(ssrVar, "external_experiments_manager", 2)));
        this.w.addAll(Collections.singletonList(new i8x(ssrVar, eu00Var)));
        this.x.addAll(scc.g(new msv(ssrVar, eu00Var, ini0Var), jr7Var, new kmj(ssrVar, f4uVar), new mmj(ssrVar, eu00Var), rmjVar, new k901(ssrVar, y801Var), new kmj(ssrVar, fmjVar), new imj(ssrVar, gmjVar), new omj(ssrVar, ini0Var, gmjVar), new pzs(ssrVar, ini0Var, gmjVar), new pmj(ssrVar, "directions_annotator_speaker", new qnh(fmjVar), aot0Var), new imj(ssrVar, ini0Var), new rmj(ssrVar, fmjVar), new y511(ssrVar, osk0Var), new mmj(ssrVar, gmjVar), new omj(ssrVar, nd1Var, ini0Var), new o311(ssrVar, v9zVar), new o311(ssrVar, f311Var), new msv(ssrVar, ini0Var, h311Var), new y511(ssrVar, h311Var), new r811(ssrVar, ini0Var, h311Var), new v211(ssrVar, f311Var), new pmj(ssrVar, "transport_annotator_speaker", new wpy0(14, f311Var), aot0Var), new pzs(ssrVar, eu00Var, ini0Var), new k901(ssrVar, eu00Var), new tc20(ssrVar, "metrics_event_listener")));
        ((aq80) ssrVar.e).E("flutter_yandex_mapkit/MapView", new ot00(eu00Var, e40Var));
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivity() {
        this.y.onDetachedFromActivity();
    }

    @Override // defpackage.r30
    public final void onDetachedFromActivityForConfigChanges() {
        this.y.onDetachedFromActivity();
    }

    @Override // defpackage.tsr
    public final void onDetachedFromEngine(ssr ssrVar) {
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((k45) it.next()).a();
        }
        arrayList.clear();
        ArrayList arrayList2 = this.w;
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            q501 q501Var = ((i8x) it2.next()).a;
            JniBinaryMessenger.Companion.getClass();
            JniBinaryMessenger.instance.setMessageHandler(1, null);
        }
        arrayList2.clear();
        ArrayList arrayList3 = this.x;
        Iterator it3 = arrayList3.iterator();
        while (it3.hasNext()) {
            q35 q35Var = (q35) it3.next();
            q35Var.a.a(null);
            q35Var.b = null;
        }
        arrayList3.clear();
        this.b.clear();
        ini0 ini0Var = this.a;
        ini0Var.a.clear();
        ini0Var.b.clear();
    }

    @Override // defpackage.r30
    public final void onReattachedToActivityForConfigChanges(l40 l40Var) {
        this.y.onAttachedToActivity(l40Var);
    }
}
