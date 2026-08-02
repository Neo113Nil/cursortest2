package defpackage;

import com.yandex.div.state.db.StateEntry;
import flex.logger.FlexLogLevel;
import flex.logger.view.LoggerOverlayView;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes4.dex */
public final class by31 implements wjr {
    public final LinkedHashSet b = new LinkedHashSet();
    public final CopyOnWriteArrayList c = new CopyOnWriteArrayList();
    public final List d = scc.g(FlexLogLevel.FAULT, FlexLogLevel.ERROR, FlexLogLevel.WARNING);

    @Override // defpackage.wjr
    public final rjr createLogConfiguration() {
        return rjr.b;
    }

    @Override // defpackage.wjr
    public final void log(ujr ujrVar) {
        FlexLogLevel flexLogLevel = ujrVar.a;
        i3y i3yVar = ujrVar.c;
        if (this.d.contains(flexLogLevel)) {
            zx31 zx31Var = new zx31(((Map) i3yVar.getValue()).get(StateEntry.COLUMN_PATH) + "\n" + ((Map) i3yVar.getValue()).get("locator") + "\n" + ujrVar.b, ujrVar.a);
            CopyOnWriteArrayList copyOnWriteArrayList = this.c;
            copyOnWriteArrayList.add(zx31Var);
            Iterator it = this.b.iterator();
            while (it.hasNext()) {
                LoggerOverlayView.onAttachedToWindow$lambda$10(((vgz) it.next()).a, copyOnWriteArrayList);
            }
        }
    }
}
