package xsna;

import com.vk.di.component.DiScopedComponent;
import com.vk.di.component.DiScopedWithParamsComponent;
import com.vk.di.component.DiWithScopeComponent;
import xsna.pwj0;

/* compiled from: DiScopedContextImpl.kt */
/* loaded from: classes.dex */
public interface n8m<SK extends pwj0> {
    DiScopedComponent a(rfc rfcVar);

    DiScopedWithParamsComponent b(rfc rfcVar, l9i l9iVar);

    j9i c(k9i<? extends DiWithScopeComponent<? extends pwj0>> k9iVar);

    void clear();

    a8m d();
}
