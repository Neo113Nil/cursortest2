package com.yandex.go.navigator.settings.language_settings;

import defpackage.jst;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.tse;
import defpackage.wls;
import defpackage.xby;
import defpackage.zy11;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.language_settings.VoiceDownloadManager$unpackZip$2", f = "VoiceDownloadManager.kt", l = {HProv.PP_DHOID}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class VoiceDownloadManager$unpackZip$2 extends SuspendLambda implements wls {
    final /* synthetic */ InputStream $inputStream;
    final /* synthetic */ String $language;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDownloadManager$unpackZip$2(InputStream inputStream, b bVar, String str, Continuation continuation) {
        super(2, continuation);
        this.$inputStream = inputStream;
        this.this$0 = bVar;
        this.$language = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new VoiceDownloadManager$unpackZip$2(this.$inputStream, this.this$0, this.$language, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceDownloadManager$unpackZip$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a0, code lost:
    
        r13 = r8.d.a(r7) + "/" + ((java.util.zip.ZipEntry) r1.element).getName();
        r12.L$0 = r8;
        r12.L$1 = r7;
        r12.L$2 = r6;
        r12.L$3 = r5;
        r12.L$4 = r1;
        r12.L$5 = null;
        r12.label = 1;
        r6 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d2, code lost:
    
        if (com.yandex.go.navigator.settings.language_settings.b.b(r8, r13, r5, r12) != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d4, code lost:
    
        return r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005b A[Catch: all -> 0x002d, TRY_LEAVE, TryCatch #2 {all -> 0x002d, blocks: (B:6:0x0023, B:7:0x00d5, B:9:0x0053, B:11:0x005b, B:14:0x0063, B:16:0x00a0, B:38:0x004a), top: B:2:0x0007, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00da A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010b  */
    /* JADX WARN: Type inference failed for: r13v6, types: [T, java.util.zip.ZipEntry] */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.io.Closeable] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x00d2 -> B:7:0x00d5). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object failure;
        Throwable a;
        b bVar;
        String str;
        ZipInputStream zipInputStream;
        Ref$ObjectRef ref$ObjectRef;
        ZipInputStream zipInputStream2;
        ?? nextEntry;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            try {
            } finally {
            }
        } catch (Throwable th) {
            failure = new Result.Failure(th);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            InputStream inputStream = this.$inputStream;
            b bVar2 = this.this$0;
            String str2 = this.$language;
            ZipInputStream zipInputStream3 = new ZipInputStream(new BufferedInputStream(inputStream));
            bVar = bVar2;
            str = str2;
            zipInputStream = zipInputStream3;
            ref$ObjectRef = new Ref$ObjectRef();
            zipInputStream2 = zipInputStream3;
            while (true) {
                nextEntry = zipInputStream.getNextEntry();
                ref$ObjectRef.element = nextEntry;
                if (nextEntry != 0) {
                }
                String substring = ((ZipEntry) ref$ObjectRef.element).getName().substring(0, ((ZipEntry) ref$ObjectRef.element).getName().length() - 1);
                new File(bVar.d.a(str) + "/" + substring).mkdir();
                zipInputStream.closeEntry();
            }
            a = Result.a(failure);
            if (a != null) {
            }
            Boolean bool = (Boolean) (failure instanceof Result.Failure ? null : failure);
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
        if (i != 1) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        ref$ObjectRef = (Ref$ObjectRef) this.L$4;
        zipInputStream = (ZipInputStream) this.L$3;
        ?? r6 = (Closeable) this.L$2;
        str = (String) this.L$1;
        bVar = (b) this.L$0;
        kotlin.b.b(obj);
        ((Result) obj).getClass();
        ZipInputStream zipInputStream4 = r6;
        zipInputStream.closeEntry();
        zipInputStream2 = zipInputStream4;
        while (true) {
            nextEntry = zipInputStream.getNextEntry();
            ref$ObjectRef.element = nextEntry;
            if (nextEntry != 0) {
                if (!nextEntry.isDirectory()) {
                    break;
                }
                String substring2 = ((ZipEntry) ref$ObjectRef.element).getName().substring(0, ((ZipEntry) ref$ObjectRef.element).getName().length() - 1);
                new File(bVar.d.a(str) + "/" + substring2).mkdir();
                zipInputStream.closeEntry();
            } else {
                ooc.g(zipInputStream2, null);
                failure = Boolean.TRUE;
                break;
            }
        }
        a = Result.a(failure);
        if (a != null) {
            xby.l(jst.e, "NAVIGATOR", null, a, "failed to unzip file", 2);
        }
        Boolean bool2 = (Boolean) (failure instanceof Result.Failure ? null : failure);
        return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
    }
}
