package com.yandex.div.core.view2.divs;

import android.view.View;
import com.yandex.div.core.view2.divs.widgets.DivStateLayout;
import defpackage.aw5;
import defpackage.hgk;
import defpackage.tls;
import defpackage.u2k;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "currentView", "Landroid/view/View;", "invoke", "(Landroid/view/View;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindStates$1 extends Lambda implements tls {
    final /* synthetic */ hgk $binder;
    final /* synthetic */ aw5 $bindingContext;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseDivViewExtensionsKt__BaseDivViewExtensionsKt$bindStates$1(hgk hgkVar, aw5 aw5Var) {
        super(1);
        this.$binder = hgkVar;
        this.$bindingContext = aw5Var;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        com.yandex.div.core.state.b path;
        View view = (View) obj;
        if (!(view instanceof DivStateLayout)) {
            return Boolean.TRUE;
        }
        DivStateLayout divStateLayout = (DivStateLayout) view;
        u2k div = divStateLayout.getDiv();
        if (div != null && (path = divStateLayout.getPath()) != null) {
            this.$binder.b(this.$bindingContext, view, div, path.f());
            return Boolean.FALSE;
        }
        return Boolean.FALSE;
    }
}
