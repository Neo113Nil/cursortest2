package xsna;

import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import xsna.mwv;
import xsna.mwv.a;

/* compiled from: ImBaseViewReporter.kt */
/* loaded from: classes5.dex */
public abstract class dxv<T extends mwv.a> implements mwv<T> {
    public final vk6<SchemeStat$TypeView> a;
    public final SchemeStat$EventItem b = new SchemeStat$EventItem(SchemeStat$EventItem.Type.EVENT, null, null, null, null, null, 62, null);

    public dxv(vk6<SchemeStat$TypeView> vk6Var) {
        this.a = vk6Var;
    }
}
