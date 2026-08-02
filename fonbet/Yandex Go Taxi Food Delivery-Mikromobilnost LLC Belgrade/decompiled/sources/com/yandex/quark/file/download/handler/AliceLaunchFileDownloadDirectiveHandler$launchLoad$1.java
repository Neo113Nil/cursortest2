package com.yandex.quark.file.download.handler;

import android.app.DownloadManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Environment;
import defpackage.jl40;
import defpackage.jwu;
import defpackage.kwu;
import defpackage.loj;
import defpackage.mvg;
import defpackage.ns1;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.x4e;
import defpackage.zwf0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.quark.file.download.handler.AliceLaunchFileDownloadDirectiveHandler$launchLoad$1", f = "AliceLaunchFileDownloadDirectiveHandler.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class AliceLaunchFileDownloadDirectiveHandler$launchLoad$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $downloadUrl;
    final /* synthetic */ boolean $requiresAuth;
    Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AliceLaunchFileDownloadDirectiveHandler$launchLoad$1(String str, a aVar, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$downloadUrl = str;
        this.this$0 = aVar;
        this.$requiresAuth = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AliceLaunchFileDownloadDirectiveHandler$launchLoad$1(this.$downloadUrl, this.this$0, this.$requiresAuth, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AliceLaunchFileDownloadDirectiveHandler$launchLoad$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        kwu kwuVar;
        kwu kwuVar2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            String str = this.$downloadUrl;
            try {
                jwu jwuVar = new jwu();
                jwuVar.i(null, str);
                kwuVar = jwuVar.e();
            } catch (IllegalArgumentException unused) {
                kwuVar = null;
            }
            a aVar = this.this$0;
            if (kwuVar == null) {
                aVar.b.f("AliceLaunchFileDownloadDirectiveHandler", "Invalid download url=" + this.$downloadUrl);
                this.this$0.z.c("invalid_url", this.$downloadUrl, null);
                return zy11Var;
            }
            String str2 = this.$downloadUrl;
            boolean z = this.$requiresAuth;
            this.L$0 = kwuVar;
            this.label = 1;
            Object a = a.a(aVar, str2, kwuVar, z, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            kwuVar2 = kwuVar;
            obj = a;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kwuVar2 = (kwu) this.L$0;
            b.b(obj);
        }
        ns1 ns1Var = (ns1) obj;
        zwf0 zwf0Var = this.this$0.b;
        String str3 = ns1Var.b;
        String str4 = ns1Var.a;
        zwf0Var.c("AliceLaunchFileDownloadDirectiveHandler", "Prepared download url=" + kwuVar2 + " mimeType=" + str3 + " fileName=" + str4);
        a aVar2 = this.this$0;
        boolean z2 = this.$requiresAuth;
        Context context = aVar2.c;
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(kwuVar2.i));
        aVar2.x.a(kwuVar2, z2, "DownloadManager", new loj(23, request));
        String str5 = ns1Var.b;
        if (str5 != null) {
            request.setMimeType(str5);
        }
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i2 = applicationInfo.labelRes;
        if (i2 != 0) {
            request.setTitle(context.getString(i2));
        } else {
            request.setTitle(applicationInfo.nonLocalizedLabel);
        }
        request.setNotificationVisibility(1);
        zwf0 zwf0Var2 = this.this$0.b;
        if (jl40.l(Environment.getExternalStorageState(), "mounted")) {
            try {
                request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, str4);
                request.allowScanningByMediaScanner();
                request.setVisibleInDownloadsUi(true);
                a aVar3 = this.this$0;
                String str6 = this.$downloadUrl;
                com.yandex.quark.file.download.tracking.a aVar4 = aVar3.z;
                zwf0 zwf0Var3 = aVar3.b;
                DownloadManager downloadManager = (DownloadManager) aVar3.c.getSystemService(DownloadManager.class);
                if (downloadManager == null) {
                    zwf0Var3.f("AliceLaunchFileDownloadDirectiveHandler", "DownloadManager is unavailable for url=" + kwuVar2);
                    aVar4.c("download_manager_unavailable", str6, str4);
                } else {
                    long enqueue = downloadManager.enqueue(request);
                    if (enqueue == -1) {
                        aVar4.c("enqueue_failed", str6, str4);
                    } else {
                        aVar4.e(enqueue, str6, str4);
                        String str7 = Environment.DIRECTORY_DOWNLOADS;
                        StringBuilder k = x4e.k("Enqueued DownloadManager download id=", enqueue, " fileName=", str4);
                        k.append(" destination=");
                        k.append(str7);
                        zwf0Var3.info("AliceLaunchFileDownloadDirectiveHandler", k.toString());
                    }
                }
                return zy11Var;
            } catch (RuntimeException e) {
                zwf0Var2.a("AliceLaunchFileDownloadDirectiveHandler", "Failed to set download destination fileName=".concat(str4), e);
            }
        } else {
            zwf0Var2.f("AliceLaunchFileDownloadDirectiveHandler", "External storage is not mounted, fileName=".concat(str4));
        }
        this.this$0.z.c("enqueue_failed", this.$downloadUrl, str4);
        return zy11Var;
    }
}
