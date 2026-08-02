package androidx.datastore.preferences.core;

import defpackage.tpg;
import defpackage.tpr;
import defpackage.wls;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class a implements tpg {
    public final tpg a;

    public a(tpg tpgVar) {
        this.a = tpgVar;
    }

    @Override // defpackage.tpg
    public final Object a(wls wlsVar, Continuation continuation) {
        return this.a.a(new PreferenceDataStore$updateData$2(wlsVar, null), continuation);
    }

    @Override // defpackage.tpg
    public final tpr getData() {
        return this.a.getData();
    }
}
