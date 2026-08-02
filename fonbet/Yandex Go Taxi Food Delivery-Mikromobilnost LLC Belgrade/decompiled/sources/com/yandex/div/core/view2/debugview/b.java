package com.yandex.div.core.view2.debugview;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.widget.Toast;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.ParsingException;
import com.yandex.payment.sdk.ui.view.ChallengerInputView;
import defpackage.a231;
import defpackage.agz;
import defpackage.axg;
import defpackage.b96;
import defpackage.bxg;
import defpackage.c231;
import defpackage.c4x;
import defpackage.cxg;
import defpackage.dg90;
import defpackage.dxg;
import defpackage.edx;
import defpackage.eg90;
import defpackage.ehj;
import defpackage.fu11;
import defpackage.h3u0;
import defpackage.hi21;
import defpackage.jl40;
import defpackage.kvo;
import defpackage.l6o;
import defpackage.l7w;
import defpackage.ljo;
import defpackage.lvo;
import defpackage.m6o;
import defpackage.ngd0;
import defpackage.omk;
import defpackage.qqu0;
import defpackage.rhc;
import defpackage.rsu;
import defpackage.t131;
import defpackage.tls;
import defpackage.tn60;
import defpackage.tqs;
import defpackage.tsu;
import defpackage.u131;
import defpackage.usu;
import defpackage.uyg0;
import defpackage.v131;
import defpackage.v63;
import defpackage.vsu;
import defpackage.w131;
import defpackage.w511;
import defpackage.wfx;
import defpackage.wls;
import defpackage.wsu;
import defpackage.x131;
import defpackage.y131;
import defpackage.ywg;
import defpackage.z131;
import defpackage.zv5;
import defpackage.zvg;
import defpackage.zwg;
import defpackage.zy11;
import io.appmetrica.analytics.rtm.internal.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import org.json.JSONArray;
import org.json.JSONObject;
import ru.CryptoPro.reprov.x509.CRLReasonCodeExtension;

/* loaded from: classes.dex */
public final class b {
    public final m6o a;
    public final Div2View b;
    public final boolean c;
    public final boolean d;
    public final tsu e;
    public dxg f;
    public zv5 g;
    public dxg l;
    public final LinkedHashSet h = new LinkedHashSet();
    public final ArrayList i = new ArrayList();
    public final ArrayList j = new ArrayList();
    public final agz k = new agz();
    public final wls m = new DebugViewModelProvider$updateOnErrors$1(this);
    public h3u0 n = new h3u0(0);

    public b(m6o m6oVar, Div2View div2View, boolean z, boolean z2, tsu tsuVar) {
        this.a = m6oVar;
        this.b = div2View;
        this.c = z;
        this.d = z2;
        this.e = tsuVar;
    }

    public final String a(boolean z) {
        c4x q;
        JSONObject jSONObject = new JSONObject();
        if (!this.i.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                Throwable th = (Throwable) it.next();
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put(Constants.KEY_MESSAGE, c.b(th));
                jSONObject2.put("stacktrace", ljo.b(th));
                if (th instanceof ParsingException) {
                    ParsingException parsingException = (ParsingException) th;
                    jSONObject2.put(CRLReasonCodeExtension.REASON, parsingException.getReason());
                    edx source = parsingException.getSource();
                    jSONObject2.put("json_source", source != null ? source.a() : null);
                    jSONObject2.put("json_summary", parsingException.getJsonSummary());
                }
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("errors", jSONArray);
        }
        if (!this.j.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator it2 = this.j.iterator();
            while (it2.hasNext()) {
                Throwable th2 = (Throwable) it2.next();
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("warning_message", th2.getMessage());
                jSONObject3.put("stacktrace", ljo.b(th2));
                jSONArray2.put(jSONObject3);
            }
            jSONObject.put("warnings", jSONArray2);
        }
        if (z) {
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("templates", new JSONObject());
            omk omkVar = this.b.get_divData();
            jSONObject4.put("card", omkVar != null ? omkVar.r() : null);
            JSONArray jSONArray3 = new JSONArray();
            Iterator it3 = this.b.getDiv2Component().getDivVariableController().e().iterator();
            while (it3.hasNext()) {
                c231 c231Var = (c231) it3.next();
                dg90 dg90Var = eg90.a;
                if (c231Var instanceof t131) {
                    q = new v63(new kvo(((t131) c231Var).j()), c231Var.c());
                } else {
                    c231Var.getClass();
                    if (c231Var instanceof u131) {
                        u131 u131Var = (u131) c231Var;
                        q = new b96(new kvo(Boolean.valueOf(u131Var.c)), u131Var.b);
                    } else if (c231Var instanceof v131) {
                        v131 v131Var = (v131) c231Var;
                        q = new rhc(new kvo(Integer.valueOf(v131Var.c)), v131Var.b);
                    } else if (c231Var instanceof w131) {
                        w131 w131Var = (w131) c231Var;
                        q = new ehj(new kvo(w131Var.d), w131Var.b);
                    } else if (c231Var instanceof x131) {
                        x131 x131Var = (x131) c231Var;
                        q = new tn60(new kvo(Double.valueOf(x131Var.c)), x131Var.b);
                    } else if (c231Var instanceof y131) {
                        y131 y131Var = (y131) c231Var;
                        q = new l7w(new kvo(Long.valueOf(y131Var.c)), y131Var.b);
                    } else if (c231Var instanceof z131) {
                        z131 z131Var = (z131) c231Var;
                        String str = z131Var.b;
                        String str2 = z131Var.c;
                        q = new qqu0(str2 != null ? new lvo(dg90Var, str2) : new kvo(str2), str);
                    } else if (c231Var instanceof a231) {
                        a231 a231Var = (a231) c231Var;
                        q = new hi21(new kvo(a231Var.c), a231Var.b);
                    } else {
                        if (!(c231Var instanceof com.yandex.div.data.a)) {
                            w511.b();
                            return null;
                        }
                        q = ((com.yandex.div.data.a) c231Var).j().q();
                    }
                }
                jSONArray3.put(q.r());
            }
            jSONObject4.put("variables", jSONArray3);
            jSONObject.put("card", jSONObject4);
        }
        return jSONObject.toString(4);
    }

    public final dxg b(zv5 zv5Var) {
        dxg dxgVar;
        l6o a = this.a.a(zv5Var.b, zv5Var.a);
        wls wlsVar = this.m;
        synchronized (a.d) {
            a.e.a(wlsVar);
            a.h();
            DebugViewModelProvider$updateOnErrors$1 debugViewModelProvider$updateOnErrors$1 = (DebugViewModelProvider$updateOnErrors$1) wlsVar;
            debugViewModelProvider$updateOnErrors$1.invoke(a.i, a.h);
            dxgVar = new dxg(1, a, debugViewModelProvider$updateOnErrors$1);
        }
        return dxgVar;
    }

    public final Object c(String str) {
        Div2Context context = this.b.getContext();
        Object systemService = context.getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        zy11 zy11Var = zy11.a;
        if (clipboardManager == null) {
            return zy11Var;
        }
        try {
            clipboardManager.setPrimaryClip(new ClipData("Error report", new String[]{"text/plain"}, new ClipData.Item(str)));
            Toast.makeText(context, "Errors, DivData and Variables are dumped to clipboard!", 1).show();
            return zy11Var;
        } catch (Exception e) {
            return new Result.Failure(new RuntimeException("Failed paste report to clipboard!", e));
        }
    }

    public final void d(h3u0 h3u0Var) {
        boolean z = h3u0Var.b;
        this.n = h3u0Var;
        cxg e = e(h3u0Var);
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            ((tls) it.next()).invoke(e);
        }
        tsu tsuVar = this.e;
        if (tsuVar.h != z) {
            if (z) {
                tls tlsVar = new tls() { // from class: com.yandex.div.core.view2.debugview.DebugViewModelProvider$invalidateHotReloadObservation$1
                    {
                        super(1);
                    }

                    @Override // defpackage.tls
                    public final Object invoke(Object obj) {
                        wsu wsuVar = (wsu) obj;
                        ngd0 ngd0Var = ngd0.G;
                        b bVar = b.this;
                        ngd0Var.p();
                        fu11 fu11Var = fu11.a;
                        if (!fu11Var.a()) {
                            fu11Var.b(new tqs(5, bVar, wsuVar));
                        } else if (!jl40.l(bVar.n.c, wsuVar)) {
                            bVar.d(h3u0.a(bVar.n, false, false, wsuVar, null, null, 27));
                        }
                        b bVar2 = b.this;
                        bVar2.b.postDelayed(new zvg(1, bVar2, wsuVar), 5000L);
                        return zy11.a;
                    }
                };
                tsuVar.f.a(tlsVar);
                this.f = new dxg(2, tsuVar, tlsVar);
            } else {
                dxg dxgVar = this.f;
                if (dxgVar != null) {
                    dxgVar.close();
                }
                this.f = null;
            }
        }
        tsuVar.h = z;
        AtomicBoolean atomicBoolean = tsuVar.i;
        int i = 0;
        if (z) {
            if (atomicBoolean.compareAndSet(false, true)) {
                int i2 = wfx.a;
                ScheduledFuture scheduledFuture = tsuVar.k;
                if (scheduledFuture != null) {
                    scheduledFuture.cancel(false);
                }
                tsuVar.k = null;
                tsuVar.b.execute(tsuVar.l);
                return;
            }
            return;
        }
        if (atomicBoolean.compareAndSet(true, false)) {
            int i3 = wfx.a;
            ScheduledFuture scheduledFuture2 = tsuVar.k;
            if (scheduledFuture2 != null) {
                scheduledFuture2.cancel(false);
            }
            tsuVar.k = null;
            tsuVar.a.post(new rsu(tsuVar, i));
        }
    }

    public final cxg e(h3u0 h3u0Var) {
        bxg bxgVar;
        usu usuVar = usu.c;
        usu usuVar2 = usu.b;
        usu usuVar3 = usu.a;
        boolean z = h3u0Var.a;
        wsu wsuVar = h3u0Var.c;
        List list = h3u0Var.d;
        String str = "";
        bxg bxgVar2 = null;
        if (z) {
            StringBuilder sb = new StringBuilder();
            List list2 = h3u0Var.e;
            if (!list.isEmpty()) {
                sb.append(c.a(list));
            }
            if (!list2.isEmpty()) {
                sb.append(c.c(list2));
            }
            String sb2 = sb.toString();
            if (jl40.l(wsuVar, usuVar3)) {
                str = "Applied!";
            } else if (wsuVar instanceof vsu) {
                str = "Failure: " + ((vsu) wsuVar).a().getMessage();
            } else if (jl40.l(wsuVar, usuVar2)) {
                str = "Reloading...";
            } else if (jl40.l(wsuVar, usuVar)) {
                str = "Update Skipped.";
            } else if (wsuVar != null) {
                w511.b();
                return null;
            }
            String str2 = str;
            boolean z2 = h3u0Var.b;
            return new zwg(sb2, new ywg(str2, z2, new DebugViewModelProvider$renderDetailsViewModel$2(h3u0Var, this), z2 ? "View Documentation" : null, new DebugViewModelProvider$renderDetailsViewModel$3(this), this.e.c, new DebugViewModelProvider$renderDetailsViewModel$4(this)));
        }
        if (wsuVar != null) {
            if (wsuVar.equals(usuVar3)) {
                bxgVar = new bxg("✓", "Hot reload!", uyg0.neutral_counter_background);
            } else if (wsuVar instanceof vsu) {
                bxgVar = new bxg("!", "Hot reload failed!", uyg0.error_counter_background);
            } else if (wsuVar.equals(usuVar2)) {
                bxgVar = new bxg(ChallengerInputView.DEFAULT_SMS_HINT, "", uyg0.neutral_counter_background);
            } else {
                if (!wsuVar.equals(usuVar)) {
                    w511.b();
                    return null;
                }
                bxgVar = null;
            }
            if (bxgVar != null) {
                return bxgVar;
            }
        }
        boolean z3 = this.d || h3u0Var.b;
        if (z3 || this.c) {
            if (this.n.d.isEmpty() || this.n.e.isEmpty()) {
                boolean isEmpty = this.n.d.isEmpty();
                h3u0 h3u0Var2 = this.n;
                if (!isEmpty) {
                    bxgVar2 = new bxg(String.valueOf(h3u0Var2.d.size()), uyg0.error_counter_background);
                } else if (!h3u0Var2.e.isEmpty()) {
                    bxgVar2 = new bxg(String.valueOf(this.n.e.size()), uyg0.warning_counter_background);
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.n.d.size());
                sb3.append('/');
                sb3.append(this.n.e.size());
                bxgVar2 = new bxg(sb3.toString(), uyg0.warning_error_counter_background);
            }
            if (bxgVar2 != null) {
                return bxgVar2;
            }
        }
        return z3 ? new bxg(str, uyg0.neutral_counter_background) : axg.a;
    }
}
