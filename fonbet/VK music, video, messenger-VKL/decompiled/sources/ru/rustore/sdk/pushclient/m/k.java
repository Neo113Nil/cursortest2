package ru.rustore.sdk.pushclient.m;

import com.vk.push.common.AppInfo;
import kotlin.jvm.internal.Lambda;
import xsna.aaz0;
import xsna.gzs;
import xsna.s101;

/* loaded from: classes9.dex */
public final class k extends Lambda implements gzs<AppInfo> {
    public static final k i = new k();

    public k() {
        super(0);
    }

    @Override // xsna.gzs
    public final AppInfo invoke() {
        aaz0 aaz0Var = s101.f;
        if (aaz0Var != null) {
            return aaz0Var.h;
        }
        throw new IllegalStateException("ConfigModule.init() must be called before accessing its members");
    }
}
