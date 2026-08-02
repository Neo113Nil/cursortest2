package xsna;

import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockApp;
import com.vk.dto.common.data.ApiApplication;
import com.vk.stat.scheme.SchemeStat$EventItem;
import java.util.Collections;
import java.util.List;
import xsna.hzp0;
import xsna.vha;

/* compiled from: GamesCatalogUiViewTracker.kt */
/* loaded from: classes16.dex */
public final class vet extends z160 {
    public final onh0 f;

    public vet(onh0 onh0Var, dha dhaVar) {
        super(onh0Var, dhaVar, 4);
        this.f = onh0Var;
    }

    @Override // xsna.vha, xsna.d680
    public final List<hzp0> j(Object obj) {
        SchemeStat$EventItem.Type type;
        vha.b bVar = obj instanceof vha.b ? (vha.b) obj : null;
        UIBlock uIBlock = bVar != null ? bVar.a : null;
        UIBlockApp uIBlockApp = uIBlock instanceof UIBlockApp ? (UIBlockApp) uIBlock : null;
        if (uIBlockApp == null) {
            return super.j(obj);
        }
        ApiApplication apiApplication = uIBlockApp.y;
        if (apiApplication.zb().booleanValue()) {
            type = SchemeStat$EventItem.Type.GAME;
        } else {
            if (!"mini_app".equals(apiApplication.C)) {
                return super.j(obj);
            }
            type = SchemeStat$EventItem.Type.MINI_APP;
        }
        SchemeStat$EventItem schemeStat$EventItem = new SchemeStat$EventItem(type, null, null, s1v.f(uIBlockApp), this.f.e(uIBlockApp), null, 38, null);
        int i = ((vha.b) obj).b;
        dha dhaVar = this.c;
        return Collections.singletonList(hzp0.m.a(schemeStat$EventItem, i, dhaVar != null ? dhaVar.a() : null));
    }
}
