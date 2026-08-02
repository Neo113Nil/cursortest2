package com.yandex.quark.file.download.handler;

import android.content.Context;
import android.webkit.URLUtil;
import com.squareup.wire.ProtoAdapter;
import defpackage.au50;
import defpackage.b64;
import defpackage.bnj;
import defpackage.dnj;
import defpackage.enj;
import defpackage.evu0;
import defpackage.fnj;
import defpackage.gnj;
import defpackage.ike;
import defpackage.j73;
import defpackage.jaa1;
import defpackage.jyj0;
import defpackage.kwu;
import defpackage.lyj0;
import defpackage.ns1;
import defpackage.ny61;
import defpackage.os1;
import defpackage.ps1;
import defpackage.qoi0;
import defpackage.smj;
import defpackage.syj0;
import defpackage.t830;
import defpackage.tje;
import defpackage.txg;
import defpackage.w511;
import defpackage.zwf0;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.alice.protos.endpoint.capabilities.quark.file.download.TAliceFileDownloadCapability;

/* loaded from: classes8.dex */
public final class a implements bnj {
    public static final Set B = j73.f0(new String[]{"FileGuid", "file_guid"});
    public final Set A = Collections.singleton(new dnj("launch_file_download"));
    public final t830 a;
    public final zwf0 b;
    public final Context c;
    public final ike w;
    public final au50 x;
    public final com.yandex.quark.file.download.request.a y;
    public final com.yandex.quark.file.download.tracking.a z;

    public a(t830 t830Var, zwf0 zwf0Var, Context context, ike ikeVar, au50 au50Var, com.yandex.quark.file.download.request.a aVar, com.yandex.quark.file.download.tracking.a aVar2) {
        this.a = t830Var;
        this.b = zwf0Var;
        this.c = context;
        this.w = ikeVar;
        this.x = au50Var;
        this.y = aVar;
        this.z = aVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(a aVar, String str, kwu kwuVar, boolean z, ContinuationImpl continuationImpl) {
        AliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1 aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1;
        int i;
        String str2;
        String str3;
        String str4;
        aVar.getClass();
        if (continuationImpl instanceof AliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1) {
            aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1 = (AliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1) continuationImpl;
            int i2 = aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.label = i2 - Integer.MIN_VALUE;
                Object obj = aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.label;
                if (i != 0) {
                    b.b(obj);
                    Iterator it = B.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            str2 = null;
                            break;
                        }
                        str2 = kwuVar.i((String) it.next());
                        if (str2 != null) {
                            if (evu0.J(str2)) {
                                str2 = null;
                            }
                            if (str2 != null) {
                                break;
                            }
                        }
                    }
                    if (str2 != null) {
                        str4 = "image/jpeg";
                        return new ns1(b64.k("[\\\\/:*?\"<>|]", str2 != null ? str2.concat(".jpg") : URLUtil.guessFileName(str, null, str4), "_"), str4);
                    }
                    com.yandex.quark.file.download.request.a aVar2 = aVar.y;
                    aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.L$0 = str;
                    aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.L$1 = str2;
                    aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.label = 1;
                    obj = aVar2.a(kwuVar, z, aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str2;
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = (String) aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.L$1;
                    str = (String) aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.L$0;
                    b.b(obj);
                }
                str2 = str3;
                str4 = (String) obj;
                return new ns1(b64.k("[\\\\/:*?\"<>|]", str2 != null ? str2.concat(".jpg") : URLUtil.guessFileName(str, null, str4), "_"), str4);
            }
        }
        aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1 = new AliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1(aVar, continuationImpl);
        Object obj2 = aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = aliceLaunchFileDownloadDirectiveHandler$resolveDownloadFileInfo$1.label;
        if (i != 0) {
        }
        str2 = str3;
        str4 = (String) obj2;
        return new ns1(b64.k("[\\\\/:*?\"<>|]", str2 != null ? str2.concat(".jpg") : URLUtil.guessFileName(str, null, str4), "_"), str4);
    }

    @Override // defpackage.bnj
    public final void h(smj smjVar) {
        syj0 a;
        if ("launch_file_download".equals(smjVar.b())) {
            gnj c = smjVar.c();
            ProtoAdapter<TAliceFileDownloadCapability.TLaunchFileDownloadDirective> protoAdapter = TAliceFileDownloadCapability.TLaunchFileDownloadDirective.ADAPTER;
            if (c instanceof fnj) {
                a = this.a.a(TAliceFileDownloadCapability.TLaunchFileDownloadDirective.class, ((fnj) c).a()).a(os1.a);
            } else {
                if (!(c instanceof enj)) {
                    w511.b();
                    return;
                }
                a = jaa1.a(protoAdapter, ((enj) c).a()).a(ps1.a);
            }
            boolean z = a instanceof lyj0;
            zwf0 zwf0Var = this.b;
            if (!z) {
                if (!(a instanceof jyj0)) {
                    w511.b();
                    return;
                } else {
                    zwf0Var.f("AliceLaunchFileDownloadDirectiveHandler", b64.l("Fail to deserialize ", qoi0.a(c.getClass()).d(), " file download directive ", ((txg) ((jyj0) a).a).a()));
                    return;
                }
            }
            TAliceFileDownloadCapability.TLaunchFileDownloadDirective tLaunchFileDownloadDirective = (TAliceFileDownloadCapability.TLaunchFileDownloadDirective) ((lyj0) a).a;
            String url = tLaunchFileDownloadDirective.getUrl();
            boolean requiresAuth = tLaunchFileDownloadDirective.getRequiresAuth();
            zwf0Var.c("AliceLaunchFileDownloadDirectiveHandler", "Received launch_file_download for url=" + url + " requiresAuth=" + requiresAuth);
            tje.N(this.w, null, null, new AliceLaunchFileDownloadDirectiveHandler$launchLoad$1(url, this, requiresAuth, null), 3);
        }
    }

    @Override // defpackage.bnj
    public final Set m() {
        return this.A;
    }
}
