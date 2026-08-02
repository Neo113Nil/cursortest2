package com.apollographql.apollo3.api.http;

import defpackage.bfx;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbfx;", "Lzy11;", "invoke", "(Lbfx;)V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
/* loaded from: classes.dex */
final class DefaultHttpRequestComposer$Companion$apqExtensionsWriter$1 extends Lambda implements tls {
    final /* synthetic */ String $id;
    final /* synthetic */ boolean $sendApqExtensions;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultHttpRequestComposer$Companion$apqExtensionsWriter$1(boolean z, String str) {
        super(1);
        this.$sendApqExtensions = z;
        this.$id = str;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        bfx bfxVar = (bfx) obj;
        if (this.$sendApqExtensions) {
            bfxVar.A1("extensions");
            String str = this.$id;
            bfxVar.u();
            bfxVar.A1("persistedQuery");
            bfxVar.u();
            bfxVar.A1("version").Y0(1);
            bfxVar.A1("sha256Hash").r0(str);
            bfxVar.y();
            bfxVar.y();
        }
        return zy11.a;
    }
}
