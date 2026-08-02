package com.yandex.fintechsdk.adapters.flex.sdk.impl.flex.contentcontroller;

import android.net.Uri;
import defpackage.b3k;
import defpackage.ftl;
import defpackage.gfe;
import defpackage.kr;
import defpackage.l1o;
import defpackage.lfe;
import defpackage.lhj;
import defpackage.n530;
import defpackage.o530;
import defpackage.see;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/yandex/fintechsdk/adapters/flex/sdk/impl/flex/contentcontroller/DivkitContentControllerFactory;", "Llfe;", "Lb3k;", "div2ContextProvider", "<init>", "(Lb3k;)V", "Ll1o;", "context", "Lsee;", "content", "Lgfe;", "get", "(Ll1o;Lsee;)Lgfe;", "Lb3k;", "impl-18-1-0_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes.dex */
public final class DivkitContentControllerFactory implements lfe {
    private final b3k div2ContextProvider;

    public DivkitContentControllerFactory(b3k b3kVar) {
        this.div2ContextProvider = b3kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kr get$lambda$0(Uri uri) {
        return null;
    }

    @Override // defpackage.lfe
    public /* bridge */ /* synthetic */ void dispose(l1o l1oVar, see seeVar) {
    }

    @Override // defpackage.lfe
    public gfe get(l1o context, see content) {
        n530 n530Var = context.a;
        o530 o530Var = context.e;
        return new ftl(context.d, this.div2ContextProvider, context.c, new lhj(28), n530Var, o530Var);
    }
}
