package defpackage;

import android.app.Application;
import android.content.Context;
import android.view.ContextThemeWrapper;
import com.yandex.div.core.Div2Context;
import com.yandex.div.core.experiments.Experiment;
import com.yandex.div.core.expression.variables.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes7.dex */
public final class cf21 implements b3k {
    public final a a;
    public final ag21 b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();

    public cf21(a aVar, ag21 ag21Var) {
        this.a = aVar;
        this.b = ag21Var;
    }

    @Override // defpackage.b3k
    public final Div2Context a(Context context, pey peyVar) {
        LinkedHashMap linkedHashMap = this.c;
        Div2Context div2Context = (Div2Context) linkedHashMap.get(context);
        if (div2Context != null) {
            return div2Context;
        }
        uht uhtVar = new uht(kotlin.a.a(new n5(context, 16)));
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        boolean defaultValue = Experiment.TAP_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue2 = Experiment.VISIBILITY_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue3 = Experiment.SWIPE_OUT_BEACONS_ENABLED.getDefaultValue();
        boolean defaultValue4 = Experiment.LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED.getDefaultValue();
        boolean defaultValue5 = Experiment.IGNORE_ACTION_MENU_ITEMS_ENABLED.getDefaultValue();
        boolean defaultValue6 = Experiment.HYPHENATION_SUPPORT_ENABLED.getDefaultValue();
        Experiment.VISUAL_ERRORS_ENABLED.getClass();
        boolean defaultValue7 = Experiment.ACCESSIBILITY_ENABLED.getDefaultValue();
        boolean defaultValue8 = Experiment.VIEW_POOL_ENABLED.getDefaultValue();
        boolean defaultValue9 = Experiment.VIEW_POOL_PROFILING_ENABLED.getDefaultValue();
        boolean defaultValue10 = Experiment.VIEW_POOL_OPTIMIZATION_DEBUG.getDefaultValue();
        boolean defaultValue11 = Experiment.RESOURCE_CACHE_ENABLED.getDefaultValue();
        boolean defaultValue12 = Experiment.MULTIPLE_STATE_CHANGE_ENABLED.getDefaultValue();
        boolean defaultValue13 = Experiment.COMPLEX_REBIND_ENABLED.getDefaultValue();
        boolean defaultValue14 = Experiment.PAGER_PAGE_CLIP_ENABLED.getDefaultValue();
        boolean defaultValue15 = Experiment.PERMANENT_DEBUG_PANEL_ENABLED.getDefaultValue();
        boolean defaultValue16 = Experiment.RENDER_EFFECT_ENABLED.getDefaultValue();
        List<plk> singletonList = Collections.singletonList(new bzs0(context, uhtVar));
        int i = 1;
        List g = scc.g(new vhp0(), new jvo(), new com.yandex.div.shimmer.a(0), new e76((Application) context.getApplicationContext()));
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, m0i0.Div_Theme);
        r10 = null;
        for (plk plkVar : singletonList) {
        }
        Iterator it = g.iterator();
        while (it.hasNext()) {
            arrayList2.add((dpk) it.next());
        }
        ag21 ag21Var = this.b;
        u4l df21Var = ag21Var != null ? new df21(ag21Var) : null;
        if (df21Var == null) {
            df21Var = u4l.a;
        }
        kl40 kl40Var = kl40.x;
        y6k y6kVar = new y6k();
        com.yandex.div.state.a aVar = new com.yandex.div.state.a();
        if (plkVar == null) {
            plkVar = plk.a;
        }
        Div2Context div2Context2 = new Div2Context(contextThemeWrapper, new ujk(uhtVar, y6kVar, aVar, arrayList, plkVar, df21Var, kl40Var, arrayList2, ynk.P1, lml.a, new HashMap(), new yt31(), this.a, defaultValue, defaultValue2, defaultValue3, defaultValue4, defaultValue5, false, defaultValue6, defaultValue7, defaultValue8, defaultValue9, defaultValue10, defaultValue11, defaultValue12, false, defaultValue13, defaultValue14, defaultValue15, defaultValue16), 0, null, 12, null);
        linkedHashMap.put(context, div2Context2);
        Iterator it2 = this.d.iterator();
        while (it2.hasNext()) {
            peyVar.getLifecycle().a(new fjh(i, new core.divkit.state.a(((awl) it2.next()).a.a, div2Context2.getDivVariableController())));
        }
        peyVar.getLifecycle().a(new ur1(i, this, context));
        return div2Context2;
    }
}
