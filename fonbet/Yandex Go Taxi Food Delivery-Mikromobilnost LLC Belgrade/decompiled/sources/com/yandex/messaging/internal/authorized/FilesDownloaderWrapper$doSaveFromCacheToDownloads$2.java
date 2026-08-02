package com.yandex.messaging.internal.authorized;

import android.os.Environment;
import defpackage.jln;
import defpackage.lyq;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.oyh0;
import defpackage.oyq;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.uxj;
import defpackage.wls;
import defpackage.zy11;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.authorized.FilesDownloaderWrapper$doSaveFromCacheToDownloads$2", f = "FilesDownloaderWrapper.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class FilesDownloaderWrapper$doSaveFromCacheToDownloads$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $fileId;
    final /* synthetic */ String $fileName;
    final /* synthetic */ boolean $shouldOpen;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FilesDownloaderWrapper$doSaveFromCacheToDownloads$2(f fVar, String str, String str2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$fileId = str;
        this.$fileName = str2;
        this.$shouldOpen = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FilesDownloaderWrapper$doSaveFromCacheToDownloads$2(this.this$0, this.$fileId, this.$fileName, this.$shouldOpen, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FilesDownloaderWrapper$doSaveFromCacheToDownloads$2 filesDownloaderWrapper$doSaveFromCacheToDownloads$2 = (FilesDownloaderWrapper$doSaveFromCacheToDownloads$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        filesDownloaderWrapper$doSaveFromCacheToDownloads$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        final lyq b = this.this$0.c.b(this.$fileId);
        zy11 zy11Var = zy11.a;
        if (b == null) {
            this.this$0.e.b(this.$fileId, null);
            f fVar = this.this$0;
            fVar.f(fVar.a.getString(oyh0.save_file_error_toast));
            return zy11Var;
        }
        final String str = this.$fileName;
        final f fVar2 = this.this$0;
        final String str2 = this.$fileId;
        final boolean z = this.$shouldOpen;
        tls tlsVar = new tls() { // from class: com.yandex.messaging.internal.authorized.e
            @Override // defpackage.tls
            public final Object invoke(Object obj2) {
                String str3 = str;
                f fVar3 = fVar2;
                String str4 = str2;
                InputStream inputStream = (InputStream) obj2;
                try {
                    File file = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str3);
                    jln jlnVar = fVar3.f;
                    jlnVar.getClass();
                    File file2 = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), str3);
                    lyq b2 = ((oyq) jlnVar.b).b(str4);
                    if (!file2.exists() || b2 == null || b2.a() != file2.length()) {
                        f.b(fVar3, inputStream, file);
                    }
                    if (z) {
                        tje.N(fVar3.j, null, null, new FilesDownloaderWrapper$doSaveFromCacheToDownloads$2$1$1(fVar3, file, null), 3);
                    }
                } catch (IOException unused) {
                    fVar3.e.b(str4, Long.valueOf(b.a()));
                    fVar3.f(fVar3.a.getString(oyh0.save_file_error_toast) + Extension.COLON_SPACE + str3);
                }
                return zy11.a;
            }
        };
        uxj b2 = b.b();
        if (b2 == null) {
            return zy11Var;
        }
        try {
            tlsVar.invoke(((InputStream[]) b2.b)[0]);
            b2.close();
            return zy11Var;
        } finally {
        }
    }
}
