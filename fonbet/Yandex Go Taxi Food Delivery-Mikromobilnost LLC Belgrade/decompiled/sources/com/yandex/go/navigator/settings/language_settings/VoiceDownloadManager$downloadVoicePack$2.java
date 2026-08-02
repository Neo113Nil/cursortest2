package com.yandex.go.navigator.settings.language_settings;

import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.ooc;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.io.Closeable;
import java.io.InputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Z"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.settings.language_settings.VoiceDownloadManager$downloadVoicePack$2", f = "VoiceDownloadManager.kt", l = {46, 48, 50}, m = "invokeSuspend", v = 2)
/* loaded from: classes12.dex */
final class VoiceDownloadManager$downloadVoicePack$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $language;
    final /* synthetic */ String $selectedVoiceId;
    final /* synthetic */ String $url;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VoiceDownloadManager$downloadVoicePack$2(b bVar, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$language = str;
        this.$selectedVoiceId = str2;
        this.$url = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        VoiceDownloadManager$downloadVoicePack$2 voiceDownloadManager$downloadVoicePack$2 = new VoiceDownloadManager$downloadVoicePack$2(this.this$0, this.$language, this.$selectedVoiceId, this.$url, continuation);
        voiceDownloadManager$downloadVoicePack$2.L$0 = obj;
        return voiceDownloadManager$downloadVoicePack$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((VoiceDownloadManager$downloadVoicePack$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x011a  */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String str;
        Object failure;
        b bVar;
        String str2;
        String str3;
        String str4;
        InputStream inputStream;
        String str5;
        b bVar2;
        String str6;
        Closeable closeable;
        Throwable th;
        Object k0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        ?? r3 = 3;
        boolean z = true;
        try {
            try {
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            th = th3;
            str = r3;
            failure = new Result.Failure(th);
            b bVar3 = this.this$0;
            if (Result.a(failure) != null) {
            }
            Boolean bool = (Boolean) (failure instanceof Result.Failure ? null : failure);
            return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
        }
        if (i == 0) {
            kotlin.b.b(obj);
            b bVar4 = this.this$0;
            String str7 = this.$language;
            String str8 = this.$selectedVoiceId;
            bVar4.getClass();
            str = str7 + "/" + str8;
            b bVar5 = this.this$0;
            String str9 = this.$language;
            String str10 = this.$selectedVoiceId;
            String str11 = this.$url;
            if (bVar5.c.a(str9, str10)) {
                failure = Boolean.valueOf(z);
                b bVar32 = this.this$0;
                if (Result.a(failure) != null) {
                }
                Boolean bool2 = (Boolean) (failure instanceof Result.Failure ? null : failure);
                return Boolean.valueOf(bool2 != null ? bool2.booleanValue() : false);
            }
            if (str11 != null) {
                com.yandex.go.navigator.settings.network.repository.a aVar = bVar5.b;
                this.L$0 = null;
                this.L$1 = str;
                this.L$2 = bVar5;
                this.L$3 = str9;
                this.L$4 = str10;
                this.L$5 = null;
                this.L$6 = null;
                this.label = 1;
                Object a = aVar.a(str11, this);
                if (a != coroutineSingletons) {
                    bVar = bVar5;
                    obj = a;
                    str2 = str;
                    str3 = str9;
                    str4 = str10;
                }
                return coroutineSingletons;
            }
            z = false;
            failure = Boolean.valueOf(z);
            b bVar322 = this.this$0;
            if (Result.a(failure) != null) {
            }
            Boolean bool22 = (Boolean) (failure instanceof Result.Failure ? null : failure);
            return Boolean.valueOf(bool22 != null ? bool22.booleanValue() : false);
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                closeable = (Closeable) this.L$5;
                bVar2 = (b) this.L$2;
                r3 = (String) this.L$1;
                try {
                    kotlin.b.b(obj);
                    r3 = r3;
                    ((Boolean) obj).getClass();
                    ooc.g(closeable, null);
                    bVar2.e.put(r3, Boolean.FALSE);
                    str = r3;
                    failure = Boolean.valueOf(z);
                    b bVar3222 = this.this$0;
                    if (Result.a(failure) != null) {
                        bVar3222.e.put(str, Boolean.FALSE);
                    }
                    Boolean bool222 = (Boolean) (failure instanceof Result.Failure ? null : failure);
                    return Boolean.valueOf(bool222 != null ? bool222.booleanValue() : false);
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        throw th;
                    } catch (Throwable th5) {
                        ooc.g(closeable, th);
                        throw th5;
                    }
                }
            }
            InputStream inputStream2 = (InputStream) this.L$5;
            str5 = (String) this.L$3;
            b bVar6 = (b) this.L$2;
            str6 = (String) this.L$1;
            kotlin.b.b(obj);
            inputStream = inputStream2;
            bVar2 = bVar6;
            try {
                this.L$0 = null;
                this.L$1 = str6;
                this.L$2 = bVar2;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = inputStream;
                this.L$6 = null;
                this.label = 3;
                bVar2.a.getClass();
                sjh sjhVar = uyj.a;
                k0 = tje.k0(mdh.b, new VoiceDownloadManager$unpackZip$2(inputStream, bVar2, str5, null), this);
                if (k0 != coroutineSingletons) {
                    closeable = inputStream;
                    obj = k0;
                    r3 = str6;
                    ((Boolean) obj).getClass();
                    ooc.g(closeable, null);
                    bVar2.e.put(r3, Boolean.FALSE);
                    str = r3;
                    failure = Boolean.valueOf(z);
                    b bVar32222 = this.this$0;
                    if (Result.a(failure) != null) {
                    }
                    Boolean bool2222 = (Boolean) (failure instanceof Result.Failure ? null : failure);
                    return Boolean.valueOf(bool2222 != null ? bool2222.booleanValue() : false);
                }
                return coroutineSingletons;
            } catch (Throwable th6) {
                closeable = inputStream;
                th = th6;
                r3 = str6;
                throw th;
            }
        }
        str4 = (String) this.L$4;
        str3 = (String) this.L$3;
        bVar = (b) this.L$2;
        str2 = (String) this.L$1;
        try {
            kotlin.b.b(obj);
        } catch (Throwable th7) {
            th = th7;
            str = str2;
            failure = new Result.Failure(th);
            b bVar322222 = this.this$0;
            if (Result.a(failure) != null) {
            }
            Boolean bool22222 = (Boolean) (failure instanceof Result.Failure ? null : failure);
            return Boolean.valueOf(bool22222 != null ? bool22222.booleanValue() : false);
        }
        inputStream = (InputStream) obj;
        if (inputStream == null) {
            str = str2;
            z = false;
            failure = Boolean.valueOf(z);
            b bVar3222222 = this.this$0;
            if (Result.a(failure) != null) {
            }
            Boolean bool222222 = (Boolean) (failure instanceof Result.Failure ? null : failure);
            return Boolean.valueOf(bool222222 != null ? bool222222.booleanValue() : false);
        }
        bVar.e.put(str2, Boolean.TRUE);
        this.L$0 = null;
        this.L$1 = str2;
        this.L$2 = bVar;
        this.L$3 = str3;
        this.L$4 = null;
        this.L$5 = inputStream;
        this.L$6 = null;
        this.label = 2;
        if (b.a(bVar, str3, str4, this) != coroutineSingletons) {
            str5 = str3;
            bVar2 = bVar;
            str6 = str2;
            this.L$0 = null;
            this.L$1 = str6;
            this.L$2 = bVar2;
            this.L$3 = null;
            this.L$4 = null;
            this.L$5 = inputStream;
            this.L$6 = null;
            this.label = 3;
            bVar2.a.getClass();
            sjh sjhVar2 = uyj.a;
            k0 = tje.k0(mdh.b, new VoiceDownloadManager$unpackZip$2(inputStream, bVar2, str5, null), this);
            if (k0 != coroutineSingletons) {
            }
        }
        return coroutineSingletons;
    }
}
