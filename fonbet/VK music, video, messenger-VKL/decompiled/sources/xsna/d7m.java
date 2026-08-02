package xsna;

import com.vk.di.component.DiUnscopedComponent;

/* compiled from: DiComponentFactoryWrapper.kt */
/* loaded from: classes.dex */
public final class d7m<C extends DiUnscopedComponent> implements c7m {
    public final lcn a;

    public d7m(lcn lcnVar) {
        this.a = lcnVar;
    }

    @Override // xsna.c7m
    public final a7m a(e7m e7mVar, l9i l9iVar) {
        return ((b7m) ((gzs) this.a.a).invoke()).a(e7mVar);
    }
}
