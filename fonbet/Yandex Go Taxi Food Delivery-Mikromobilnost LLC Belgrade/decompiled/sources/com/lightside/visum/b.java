package com.lightside.visum;

import android.view.View;
import defpackage.tje;
import defpackage.tka1;
import defpackage.tls;

/* loaded from: classes11.dex */
public final /* synthetic */ class b implements View.OnLongClickListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ tls b;

    public /* synthetic */ b(View view, tls tlsVar) {
        this.a = view;
        this.b = tlsVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        tje.N(tka1.h(tka1.g(this.a)), null, null, new ViewHelpersKt$onLongClick$1$1(this.b, null), 3);
        return true;
    }
}
