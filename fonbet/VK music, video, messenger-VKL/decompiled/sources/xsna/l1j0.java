package xsna;

import com.vk.im.engine.internal.storage.structure.DbException;
import java.util.LinkedHashMap;
import xsna.b2l;

/* compiled from: SettingsDbMigration.kt */
/* loaded from: classes.dex */
public final class l1j0 implements b2l {
    public static final l1j0 a = new l1j0();
    public static final LinkedHashMap<Integer, izs<b2l.a, Boolean>> b = new LinkedHashMap<>();

    @Override // xsna.b2l
    public final void a(b2l.a aVar) throws DbException {
        sa30.l(aVar.a(), new e9i0(aVar, 3));
    }
}
