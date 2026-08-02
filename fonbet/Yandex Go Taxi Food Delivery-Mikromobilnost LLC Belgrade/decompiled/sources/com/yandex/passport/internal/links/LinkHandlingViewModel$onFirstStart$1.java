package com.yandex.passport.internal.links;

import android.net.Uri;
import com.yandex.passport.common.core.Uid;
import com.yandex.passport.internal.ModernAccount;
import com.yandex.passport.internal.flags.q;
import com.yandex.passport.internal.properties.LoginProperties;
import com.yandex.passport.internal.report.fa;
import com.yandex.passport.internal.report.jd;
import com.yandex.passport.internal.report.reporters.e0;
import defpackage.ds31;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.unr0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.links.LinkHandlingViewModel$onFirstStart$1", f = "LinkHandlingViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class LinkHandlingViewModel$onFirstStart$1 extends SuspendLambda implements wls {
    final /* synthetic */ LoginProperties $loginProperties;
    int label;
    final /* synthetic */ g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkHandlingViewModel$onFirstStart$1(g gVar, LoginProperties loginProperties, Continuation continuation) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$loginProperties = loginProperties;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LinkHandlingViewModel$onFirstStart$1(this.this$0, this.$loginProperties, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LinkHandlingViewModel$onFirstStart$1 linkHandlingViewModel$onFirstStart$1 = (LinkHandlingViewModel$onFirstStart$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        linkHandlingViewModel$onFirstStart$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        com.yandex.passport.internal.b bVar;
        Object obj2;
        Uri uri;
        int i;
        Uid uid;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        try {
            bVar = this.this$0.B.a();
        } catch (SecurityException unused) {
            bVar = new com.yandex.passport.internal.b(EmptyList.a, this.this$0.B.a.h);
        }
        g gVar = this.this$0;
        LoginProperties loginProperties = this.$loginProperties;
        com.yandex.passport.internal.ui.util.l lVar = gVar.J;
        Uri uri2 = gVar.D;
        ModernAccount a = gVar.A.a();
        ModernAccount e = (a == null || (uid = a.getUid()) == null) ? null : bVar.e(uid);
        Iterator<E> it = LinkMode.a().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (jl40.l(((LinkMode) obj2).getPath(), uri2.getPath())) {
                break;
            }
        }
        LinkMode linkMode = (LinkMode) obj2;
        if (linkMode == null) {
            w511.x(unr0.n(uri2, "Unknown deeplink "));
            return null;
        }
        int[] iArr = f.a;
        int i2 = iArr[linkMode.ordinal()];
        if (i2 != 1) {
            if (i2 == 2) {
                String queryParameter = uri2.getQueryParameter("url");
                if (queryParameter == null) {
                    queryParameter = "";
                }
                uri = Uri.parse(queryParameter);
                String queryParameter2 = uri2.getQueryParameter("BrowserName");
                String queryParameter3 = uri2.getQueryParameter("machine_readable_login");
                ModernAccount c = queryParameter3 == null ? bVar.c(queryParameter3) : null;
                ModernAccount modernAccount = c != null ? e : c;
                i = iArr[linkMode.ordinal()];
                if (i != 1) {
                    lVar.m(new a(uri, modernAccount, queryParameter2));
                } else if (i == 2) {
                    Uri uri3 = uri;
                    String queryParameter4 = uri2.getQueryParameter("process_uuid");
                    if (queryParameter4 == null) {
                        queryParameter4 = "";
                    }
                    String queryParameter5 = uri3.getQueryParameter("origin");
                    String str = queryParameter5 != null ? queryParameter5 : "";
                    com.yandex.passport.internal.report.g gVar2 = gVar.H;
                    gVar2.getClass();
                    gVar2.e = new com.yandex.passport.internal.report.f("process_uuid", queryParameter4);
                    e0 e0Var = gVar.C;
                    e0Var.getClass();
                    e0Var.f(fa.w, new jd(uri3), new com.yandex.passport.internal.report.f("origin", str));
                    if (((Boolean) gVar.G.b(q.C)).booleanValue()) {
                        tje.N(ds31.a(gVar), null, null, new LinkHandlingViewModel$launchQrWithoutQr$1(gVar, e, c, loginProperties, uri3, queryParameter2, null), 3);
                    } else {
                        lVar.m(new c(uri3, c, queryParameter2));
                    }
                } else {
                    if (i != 3) {
                        w511.b();
                        return null;
                    }
                    tje.N(ds31.a(gVar), null, null, new LinkHandlingViewModel$launchPayUrl$1(gVar, uri, modernAccount, loginProperties, queryParameter2, null), 3);
                }
                return zy11.a;
            }
            if (i2 != 3) {
                w511.b();
                return null;
            }
        }
        uri = uri2;
        String queryParameter22 = uri2.getQueryParameter("BrowserName");
        String queryParameter32 = uri2.getQueryParameter("machine_readable_login");
        if (queryParameter32 == null) {
        }
        if (c != null) {
        }
        i = iArr[linkMode.ordinal()];
        if (i != 1) {
        }
        return zy11.a;
    }
}
