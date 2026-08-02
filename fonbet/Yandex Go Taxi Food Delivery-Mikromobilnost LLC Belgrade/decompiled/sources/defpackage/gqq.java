package defpackage;

import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.lifecycle.Lifecycle;
import com.yandex.div.core.Div2Context;
import com.yandex.fintechsdk.adapters.flex.sdk.impl.divkit.DivkitThemeChangeListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.collections.a;

/* loaded from: classes.dex */
public final class gqq implements b3k {
    public final ctl a;
    public final List b;
    public final LinkedHashMap c = new LinkedHashMap();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();

    public gqq(ctl ctlVar, List list) {
        this.a = ctlVar;
        this.b = list;
    }

    @Override // defpackage.b3k
    public final Div2Context a(Context context, pey peyVar) {
        LinkedHashMap linkedHashMap = this.c;
        Div2Context div2Context = (Div2Context) linkedHashMap.get(context);
        if (div2Context != null) {
            return div2Context;
        }
        peyVar.getLifecycle();
        ysl g = this.a.g(context);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, g.a);
        tjk tjkVar = (tjk) g.b;
        plk plkVar = tjkVar.a().e;
        List singletonList = plkVar != null ? Collections.singletonList(plkVar) : null;
        EmptyList emptyList = EmptyList.a;
        if (singletonList == null) {
            singletonList = emptyList;
        }
        tjkVar.e = new xjd(a.m0(singletonList, emptyList));
        tjkVar.p = true;
        Iterator it = this.b.iterator();
        while (it.hasNext()) {
            tjkVar.b((dpk) it.next());
        }
        Div2Context div2Context2 = new Div2Context(contextThemeWrapper, tjkVar.a(), g.a, null);
        div2Context2.warmUp();
        linkedHashMap.put(context, div2Context2);
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            ((tls) it2.next()).invoke(div2Context2.getDivVariableController());
        }
        Iterator it3 = this.d.iterator();
        while (it3.hasNext()) {
            bwl bwlVar = (bwl) it3.next();
            Lifecycle lifecycle = peyVar.getLifecycle();
            int i = bwlVar.a;
            int i2 = 0;
            Object obj = bwlVar.b;
            switch (i) {
                case 0:
                    lifecycle.a(new cwl(i2, new core.divkit.state.a((k6x) ((vit) obj).b, div2Context2.getDivVariableController())));
                    break;
                default:
                    hwl hwlVar = (hwl) obj;
                    if (!div2Context2.getDivVariableController().h(DivkitThemeChangeListener.THEME_VARIABLE_NAME)) {
                        div2Context2.getDivVariableController().i(hwlVar.b);
                        break;
                    } else {
                        break;
                    }
            }
        }
        peyVar.getLifecycle().a(new fqq(this, context));
        return div2Context2;
    }
}
