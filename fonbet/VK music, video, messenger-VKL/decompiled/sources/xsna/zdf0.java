package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class zdf0 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ hef0 b;
    public final /* synthetic */ tdf0 c;
    public final /* synthetic */ lef0 d;
    public final /* synthetic */ wdf0 e;
    public final /* synthetic */ g8a f;

    public zdf0(CatalogBlockVariant catalogBlockVariant, hef0 hef0Var, tdf0 tdf0Var, lef0 lef0Var, wdf0 wdf0Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = hef0Var;
        this.c = tdf0Var;
        this.d = lef0Var;
        this.e = wdf0Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new ydf0(this.c), this.d, this.e, this.f);
    }
}
