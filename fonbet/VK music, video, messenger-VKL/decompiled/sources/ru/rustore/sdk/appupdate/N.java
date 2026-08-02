package ru.rustore.sdk.appupdate;

import android.content.Context;
import kotlin.jvm.internal.Lambda;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;
import xsna.a4z0;
import xsna.aiy0;
import xsna.gzs;
import xsna.pzy0;

/* loaded from: classes9.dex */
public final class N extends Lambda implements gzs<a4z0> {
    public final /* synthetic */ Context a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(Context context) {
        super(0);
        this.a = context;
    }

    @Override // xsna.gzs
    public final a4z0 invoke() {
        aiy0 aiy0Var = new aiy0();
        return new a4z0(this.a, new pzy0(new AppUpdateInfo.Factory(aiy0Var), aiy0Var));
    }
}
