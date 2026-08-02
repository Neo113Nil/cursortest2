package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.autofill.AutofillManager;
import android.view.inputmethod.InputMethodManager;
import androidx.camera.camera2.internal.u;
import com.yandex.go.suggest.impl.view.FullscreenSuperappSuggestModalView;
import com.yandex.go.summary.analytics.SummaryAnalytics$LegacySummaryCardCloseMethod;
import com.yandex.go.summary.analytics.SummaryAnalytics$SummaryCollapseReasonV2;
import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactDto;
import com.yandex.go.trusted_contacts.domain.entities.ShareSettingsMode;
import com.yandex.messaging.base.flow.a;
import io.appmetrica.analytics.rtm.internal.Constants;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.systemchannels.TextInputChannel$TextInputType;
import io.flutter.plugin.editing.c;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.e;
import ru.yandex.taxi.preorder.summary.tariffpage.router.TariffPageCloseReason;
import ru.yandex.taxi.widget.ModalView;

/* loaded from: classes10.dex */
public final class c1x0 implements iqs, mey0, ca20, hsz0, ca01, mjt0, jg5, fa60, rdq0, ag21 {
    public final Object a;

    public c1x0() {
        this.a = new a(null);
    }

    @Override // defpackage.rdq0
    public void B0() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x004f, code lost:
    
        if (defpackage.evu0.J(r1) != false) goto L12;
     */
    @Override // defpackage.rdq0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void I(bgq0 bgq0Var) {
        glr0 glr0Var = (glr0) this.a;
        u45 e = glr0Var.H.e();
        ModalView modalView = e instanceof ModalView ? (ModalView) e : null;
        if (modalView != null) {
            int i = 1;
            modalView.animate().translationX(-ofp0.b).setDuration(300L).withStartAction(new d82(i)).withEndAction(new bh11(i, modalView)).start();
        }
        sh11 sh11Var = (sh11) glr0Var.N;
        String str = bgq0Var.d;
        String str2 = bgq0Var.a;
        String str3 = bgq0Var.b;
        if (str2 != null) {
            sh11Var.getClass();
        }
        str2 = ((avj0) sh11Var.A).h(kyh0.trusted_contacts_new_contact_placeholder_name);
        if (str3 == null) {
            str3 = "";
        }
        sh11Var.x.a(new TrustedContactDto(str, str2, str3, 24), ShareSettingsMode.ADD);
    }

    public MapBuilder a(Map map) {
        MapBuilder mapBuilder = new MapBuilder();
        cjw0 cjw0Var = (cjw0) this.a;
        c301 u = cjw0Var.u((x701) ((e) cjw0Var.a).e.a.getValue());
        if (u != null) {
            MapBuilder mapBuilder2 = new MapBuilder();
            Object obj = u.c;
            LinkedHashMap linkedHashMap = null;
            Map map2 = obj instanceof Map ? (Map) obj : null;
            if (map2 != null) {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map2.entrySet()) {
                    if (entry.getValue() != null) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                linkedHashMap = new LinkedHashMap(gw00.d(linkedHashMap2.size()));
                for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (linkedHashMap != null) {
                mapBuilder2.putAll(linkedHashMap);
            }
            mapBuilder2.put("order_key", u.a);
            mapBuilder2.put("order_status", u.b);
            mapBuilder2.put("button_list", u.d);
            mapBuilder2.put("content_items_buttons", u.e);
            mapBuilder.put("DeliveryMetrics", mapBuilder2.j());
        }
        if (map != null) {
            mapBuilder.putAll(map);
        }
        return mapBuilder.j();
    }

    public void b(TariffPageCloseReason tariffPageCloseReason) {
        e6t0 e6t0Var = (e6t0) this.a;
        int i = sbx0.a[tariffPageCloseReason.ordinal()];
        if (i == 1) {
            e6t0Var.getClass();
            e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.Pull);
            e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.Pull);
            return;
        }
        if (i == 2) {
            e6t0Var.getClass();
            e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.Tap);
            e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.ChevronDownTap);
        } else if (i == 3) {
            e6t0Var.getClass();
            e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.BackButton);
            e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.SystemBack);
        } else if (i == 4) {
            e6t0Var.getClass();
            e6t0Var.a(SummaryAnalytics$LegacySummaryCardCloseMethod.OutCard);
            e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.OutCardTap);
        } else if (i == 5) {
            e6t0Var.b(SummaryAnalytics$SummaryCollapseReasonV2.Automatic);
        } else {
            w511.b();
        }
    }

    @Override // defpackage.ca01
    public void h(String str) {
        boolean J = evu0.J(str);
        FullscreenSuperappSuggestModalView fullscreenSuperappSuggestModalView = (FullscreenSuperappSuggestModalView) this.a;
        if (J) {
            fullscreenSuperappSuggestModalView.setFloatingInputTrailVisibility(8);
        } else {
            fullscreenSuperappSuggestModalView.setFloatingInputTrailVisibility(0);
        }
    }

    @Override // defpackage.iqs
    public void onFailure(Throwable th) {
        b1x0 b1x0Var;
        d1x0 d1x0Var = (d1x0) this.a;
        e1x0 e1x0Var = (e1x0) d1x0Var;
        synchronized (e1x0Var.a) {
            try {
                List list = e1x0Var.j;
                if (list != null) {
                    androidx.camera.core.impl.a.a(list);
                    e1x0Var.j = null;
                }
            } finally {
            }
        }
        e1x0Var.t.c();
        u uVar = d1x0Var.b;
        Iterator it = uVar.b().iterator();
        while (it.hasNext() && (b1x0Var = (b1x0) it.next()) != d1x0Var) {
            e1x0 e1x0Var2 = (e1x0) b1x0Var;
            synchronized (e1x0Var2.a) {
                try {
                    List list2 = e1x0Var2.j;
                    if (list2 != null) {
                        androidx.camera.core.impl.a.a(list2);
                        e1x0Var2.j = null;
                    }
                } finally {
                }
            }
            e1x0Var2.t.c();
        }
        synchronized (uVar.b) {
            uVar.e.remove(d1x0Var);
        }
    }

    @Override // defpackage.ca20
    public void onMethodCall(x920 x920Var, da20 da20Var) {
        Object obj;
        int i;
        Bundle bundle;
        epy0 epy0Var = (epy0) this.a;
        if (epy0Var.b == null) {
            return;
        }
        String str = x920Var.a;
        obj = x920Var.b;
        str.getClass();
        switch (str) {
            case "TextInput.setPlatformViewClient":
                try {
                    JSONObject jSONObject = (JSONObject) obj;
                    epy0Var.b.f(jSONObject.getInt("platformViewId"), jSONObject.optBoolean("usesVirtualDisplay", false));
                    ((ba20) da20Var).success(null);
                    break;
                } catch (JSONException e) {
                    ((ba20) da20Var).error("error", e.getMessage(), null);
                    return;
                }
            case "TextInput.setEditingState":
                try {
                    epy0Var.b.e(dpy0.a((JSONObject) obj));
                    ((ba20) da20Var).success(null);
                    break;
                } catch (JSONException e2) {
                    ((ba20) da20Var).error("error", e2.getMessage(), null);
                    return;
                }
            case "TextInput.setClient":
                try {
                    JSONArray jSONArray = (JSONArray) obj;
                    epy0Var.b.c(jSONArray.getInt(0), cpy0.a(jSONArray.getJSONObject(1)));
                    ((ba20) da20Var).success(null);
                    break;
                } catch (NoSuchFieldException | JSONException e3) {
                    ((ba20) da20Var).error("error", e3.getMessage(), null);
                    return;
                }
            case "TextInput.hide":
                epy0Var.b.b();
                ((ba20) da20Var).success(null);
                break;
            case "TextInput.show":
                c cVar = epy0Var.b.a;
                InputMethodManager inputMethodManager = cVar.b;
                FlutterView flutterView = cVar.a;
                cpy0 cpy0Var = cVar.g;
                if (cpy0Var == null || ((TextInputChannel$TextInputType) cpy0Var.g.c) != TextInputChannel$TextInputType.NONE) {
                    flutterView.requestFocus();
                    inputMethodManager.showSoftInput(flutterView, 0);
                } else {
                    cVar.f();
                    inputMethodManager.hideSoftInputFromWindow(flutterView.getApplicationWindowToken(), 0);
                }
                ((ba20) da20Var).success(null);
                break;
            case "TextInput.sendAppPrivateCommand":
                try {
                    JSONObject jSONObject2 = (JSONObject) obj;
                    String string = jSONObject2.getString("action");
                    String string2 = jSONObject2.getString(Constants.KEY_DATA);
                    if (string2 == null || string2.isEmpty()) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString(Constants.KEY_DATA, string2);
                    }
                    c cVar2 = epy0Var.b.a;
                    cVar2.b.sendAppPrivateCommand(cVar2.a, string, bundle);
                    ((ba20) da20Var).success(null);
                    break;
                } catch (JSONException e4) {
                    ((ba20) da20Var).error("error", e4.getMessage(), null);
                    return;
                }
                break;
            case "TextInput.setEditableSizeAndTransform":
                try {
                    JSONObject jSONObject3 = (JSONObject) obj;
                    double d = jSONObject3.getDouble("width");
                    double d2 = jSONObject3.getDouble("height");
                    JSONArray jSONArray2 = jSONObject3.getJSONArray("transform");
                    double[] dArr = new double[16];
                    for (i = 0; i < 16; i++) {
                        dArr[i] = jSONArray2.getDouble(i);
                    }
                    epy0Var.b.d(d, d2, dArr);
                    ((ba20) da20Var).success(null);
                    break;
                } catch (JSONException e5) {
                    ((ba20) da20Var).error("error", e5.getMessage(), null);
                    return;
                }
            case "TextInput.finishAutofillContext":
                io.flutter.plugin.editing.a aVar = epy0Var.b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                AutofillManager autofillManager = aVar.a.c;
                if (autofillManager != null) {
                    if (booleanValue) {
                        autofillManager.commit();
                    } else {
                        autofillManager.cancel();
                    }
                }
                ((ba20) da20Var).success(null);
                break;
            case "TextInput.clearClient":
                epy0Var.b.a();
                ((ba20) da20Var).success(null);
                break;
            case "TextInput.requestAutofill":
                c cVar3 = epy0Var.b.a;
                FlutterView flutterView2 = cVar3.a;
                AutofillManager autofillManager2 = cVar3.c;
                if (autofillManager2 != null && cVar3.h != null) {
                    String str2 = (String) cVar3.g.j.b;
                    int[] iArr = new int[2];
                    flutterView2.getLocationOnScreen(iArr);
                    Rect rect = new Rect(cVar3.n);
                    rect.offset(iArr[0], iArr[1]);
                    autofillManager2.notifyViewEntered(flutterView2, str2.hashCode(), rect);
                }
                ((ba20) da20Var).success(null);
                break;
            default:
                ((ba20) da20Var).notImplemented();
                break;
        }
    }

    @Override // defpackage.iqs
    public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
    }

    @Override // defpackage.jg5
    public void y(ig5 ig5Var, jh5 jh5Var) {
        com.yandex.fintechsdk.core.nfc.impl.internal.a a;
        if ((ig5Var instanceof p211 ? (p211) ig5Var : null) == null || (a = ((d860) this.a).a()) == null) {
            return;
        }
        a.b();
    }

    public c1x0(rs2 rs2Var, com.yandex.go.yb.data.u uVar, msb1 msb1Var) {
        this.a = rs2Var;
    }

    public c1x0(oz40 oz40Var, ztz0 ztz0Var) {
        this.a = ztz0Var;
    }

    public /* synthetic */ c1x0(Object obj) {
        this.a = obj;
    }

    public c1x0(nvd nvdVar, a7i0 a7i0Var) {
        this.a = nvdVar;
    }
}
