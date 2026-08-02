package xsna;

import com.vk.catalog.mvi.legacy.core.CatalogLegacyBlockImpl;
import com.vk.catalog.mvi.register.CatalogBlockVariant;
import com.vk.catalog2.common.ui.holders.CatalogMviVh;

/* compiled from: CatalogLegacyBlockRegisterImpl.kt */
/* loaded from: classes.dex */
public final class is3 implements h8a {
    public final /* synthetic */ CatalogBlockVariant a;
    public final /* synthetic */ o8a b;
    public final /* synthetic */ zr3 c;
    public final /* synthetic */ as3 d;
    public final /* synthetic */ fs3 e;
    public final /* synthetic */ g8a f;

    public is3(CatalogBlockVariant catalogBlockVariant, o8a o8aVar, zr3 zr3Var, as3 as3Var, fs3 fs3Var, g8a g8aVar) {
        this.a = catalogBlockVariant;
        this.b = o8aVar;
        this.c = zr3Var;
        this.d = as3Var;
        this.e = fs3Var;
        this.f = g8aVar;
    }

    @Override // xsna.h8a
    public final CatalogLegacyBlockImpl a(CatalogMviVh.a aVar) {
        return new CatalogLegacyBlockImpl(this.a, aVar, this.b, new hs3(this.c), this.d, this.e, this.f);
    }
}
