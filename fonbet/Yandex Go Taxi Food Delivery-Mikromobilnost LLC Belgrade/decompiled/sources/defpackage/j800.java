package defpackage;

import com.yandex.go.shortcuts.analytic.MainScreenAnalytics$Action;
import com.yandex.go.shortcuts.analytic.MainScreenAnalytics$MainScreenState;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.common.clid.ClidProvider;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.analytics.i;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.experiments.mainscreen.MainScreenBehavior;
import ru.yandex.taxi.perf.Milestone;

/* loaded from: classes.dex */
public final class j800 implements sa00 {
    public final MainScreenBehavior a;
    public final bc00 b;
    public final lx4 c;
    public final ma1 d;
    public final as21 e;
    public final ms2 f;
    public final t4s0 g;
    public final pa00 h;
    public final e400 i;
    public MainScreenAnalytics$MainScreenState j = MainScreenAnalytics$MainScreenState.COLLAPSED;
    public String k;

    public j800(MainScreenBehavior mainScreenBehavior, bc00 bc00Var, lx4 lx4Var, ma1 ma1Var, as21 as21Var, ms2 ms2Var, t4s0 t4s0Var, pa00 pa00Var, e400 e400Var) {
        this.a = mainScreenBehavior;
        this.b = bc00Var;
        this.c = lx4Var;
        this.d = ma1Var;
        this.e = as21Var;
        this.f = ms2Var;
        this.g = t4s0Var;
        this.h = pa00Var;
        this.i = e400Var;
    }

    public final i a(String str, MainScreenAnalytics$MainScreenState mainScreenAnalytics$MainScreenState) {
        i d = ((j) this.c).d(str);
        ArrayList a = ((u4s0) this.g).a();
        LinkedHashMap linkedHashMap = d.a;
        linkedHashMap.put("shortcuts_list", a);
        linkedHashMap.put(ClidProvider.STATE, mainScreenAnalytics$MainScreenState.getValue());
        return d;
    }

    public final void b(MainScreenAnalytics$Action mainScreenAnalytics$Action, SourcePicker sourcePicker) {
        MainScreenAnalytics$MainScreenState mainScreenAnalytics$MainScreenState = MainScreenAnalytics$MainScreenState.EXPANDED;
        this.j = mainScreenAnalytics$MainScreenState;
        i a = a("Main.SuggestCard.Opened", mainScreenAnalytics$MainScreenState);
        MainScreenBehavior mainScreenBehavior = this.a;
        String str = mainScreenBehavior.version;
        LinkedHashMap linkedHashMap = a.a;
        linkedHashMap.put("MainScreenVersion", str);
        linkedHashMap.put("action", mainScreenAnalytics$Action.getKey());
        String str2 = this.k;
        if (str2 != null && !evu0.J(str2)) {
            a.d("GridID", this.k);
        }
        if (sourcePicker != null) {
            a.d("address_search", sourcePicker.getSource());
        }
        a.d(MetaDataField.SCREEN_FIELD, this.h.c());
        a.m();
        if (MainScreenBehavior.SHORTCUTS == mainScreenBehavior) {
            ((na1) this.d).getClass();
            ((j) this.c).v(as6.z());
        }
    }

    public final void c() {
        bc00 bc00Var = this.b;
        if (bc00Var.a) {
            return;
        }
        ((j) this.c).s("Main.MainScreenShown");
        if (!bc00Var.b) {
            this.e.f((int) this.f.a(Milestone.MainScreen), "FIELD_MAIN_SCREEN_LOADING_TIME");
            bc00Var.b = true;
        }
        this.i.a(this.a.version);
        bc00Var.a = true;
    }
}
