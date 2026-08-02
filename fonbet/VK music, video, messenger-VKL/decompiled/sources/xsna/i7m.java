package xsna;

import com.vk.di.component.DiUnscopedComponent;
import com.vk.di.component.DiUnscopedWithParamsComponent;

/* compiled from: DiContextConfiguration.kt */
/* loaded from: classes.dex */
public abstract class i7m {
    public abstract y7m a(String str);

    public abstract <C extends DiUnscopedComponent> void b(String str, gzs<? extends b7m<C>> gzsVar);

    public abstract <C extends DiUnscopedComponent> void c(String str, gzs<? extends b7m<C>> gzsVar);

    public abstract <C extends DiUnscopedWithParamsComponent<P>, P extends l9i> void d(String str, gzs<? extends q8m<C, P>> gzsVar);
}
