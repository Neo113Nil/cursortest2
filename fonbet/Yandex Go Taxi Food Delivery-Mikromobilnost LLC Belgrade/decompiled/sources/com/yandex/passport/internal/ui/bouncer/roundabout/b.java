package com.yandex.passport.internal.ui.bouncer.roundabout;

import android.app.Activity;
import android.widget.ImageView;
import com.yandex.passport.api.AccountListBranding;
import com.yandex.passport.common.resources.DrawableResource;
import defpackage.nns0;
import defpackage.rs11;
import defpackage.zy11;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b extends com.lightside.slab.a {
    public final nns0 E;

    public b(Activity activity) {
        this.E = new nns0(activity, 2);
    }

    @Override // defpackage.nt11
    public final rs11 l() {
        return this.E;
    }

    @Override // com.lightside.slab.a
    public final Object m(Object obj, Continuation continuation) {
        ((ImageView) this.E.getRoot()).setImageDrawable(DrawableResource.m270getDrawableimpl(((AccountListBranding.Custom) obj).m230getResourcelwcMDYM()));
        return zy11.a;
    }
}
