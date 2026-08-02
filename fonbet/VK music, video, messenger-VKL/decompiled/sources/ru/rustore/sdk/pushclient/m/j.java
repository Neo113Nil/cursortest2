package ru.rustore.sdk.pushclient.m;

import com.vk.push.common.AppInfo;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.gzs;
import xsna.s101;

/* loaded from: classes9.dex */
public final class j extends Lambda implements gzs<List<? extends AppInfo>> {
    public static final j i = new j();

    public j() {
        super(0);
    }

    @Override // xsna.gzs
    public final List<? extends AppInfo> invoke() {
        aaz0 aaz0Var = s101.f;
        if (aaz0Var != null) {
            return aaz0Var.i;
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
