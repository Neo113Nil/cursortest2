package com.yandex.go.navigator.settings.language_settings;

import defpackage.dz31;
import defpackage.hzw;
import defpackage.mdh;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.zy11;
import java.util.HashMap;
import java.util.zip.ZipInputStream;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final tt2 a;
    public final com.yandex.go.navigator.settings.network.repository.a b;
    public final hzw c;
    public final dz31 d;
    public final HashMap e = new HashMap();

    public b(tt2 tt2Var, com.yandex.go.navigator.settings.network.repository.a aVar, hzw hzwVar, dz31 dz31Var) {
        this.a = tt2Var;
        this.b = aVar;
        this.c = hzwVar;
        this.d = dz31Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0065, code lost:
    
        if (r8.d(r9, r0) == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0085 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(b bVar, String str, String str2, ContinuationImpl continuationImpl) {
        VoiceDownloadManager$createVoiceDirectory$1 voiceDownloadManager$createVoiceDirectory$1;
        Object obj;
        int i;
        String str3;
        String str4;
        bVar.getClass();
        if (continuationImpl instanceof VoiceDownloadManager$createVoiceDirectory$1) {
            voiceDownloadManager$createVoiceDirectory$1 = (VoiceDownloadManager$createVoiceDirectory$1) continuationImpl;
            int i2 = voiceDownloadManager$createVoiceDirectory$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceDownloadManager$createVoiceDirectory$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = voiceDownloadManager$createVoiceDirectory$1.result;
                obj = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceDownloadManager$createVoiceDirectory$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    voiceDownloadManager$createVoiceDirectory$1.L$0 = str;
                    voiceDownloadManager$createVoiceDirectory$1.L$1 = str2;
                    voiceDownloadManager$createVoiceDirectory$1.label = 1;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kotlin.b.b(obj2);
                            return obj2;
                        }
                        str4 = (String) voiceDownloadManager$createVoiceDirectory$1.L$1;
                        str3 = (String) voiceDownloadManager$createVoiceDirectory$1.L$0;
                        kotlin.b.b(obj2);
                        voiceDownloadManager$createVoiceDirectory$1.L$0 = null;
                        voiceDownloadManager$createVoiceDirectory$1.L$1 = null;
                        voiceDownloadManager$createVoiceDirectory$1.label = 3;
                        Object f = bVar.f(str3, str4, voiceDownloadManager$createVoiceDirectory$1);
                        return f != obj ? obj : f;
                    }
                    str2 = (String) voiceDownloadManager$createVoiceDirectory$1.L$1;
                    str = (String) voiceDownloadManager$createVoiceDirectory$1.L$0;
                    kotlin.b.b(obj2);
                }
                voiceDownloadManager$createVoiceDirectory$1.L$0 = str;
                voiceDownloadManager$createVoiceDirectory$1.L$1 = str2;
                voiceDownloadManager$createVoiceDirectory$1.label = 2;
                if (bVar.e(str, str2, voiceDownloadManager$createVoiceDirectory$1) != obj) {
                    String str5 = str2;
                    str3 = str;
                    str4 = str5;
                    voiceDownloadManager$createVoiceDirectory$1.L$0 = null;
                    voiceDownloadManager$createVoiceDirectory$1.L$1 = null;
                    voiceDownloadManager$createVoiceDirectory$1.label = 3;
                    Object f2 = bVar.f(str3, str4, voiceDownloadManager$createVoiceDirectory$1);
                    if (f2 != obj) {
                    }
                }
            }
        }
        voiceDownloadManager$createVoiceDirectory$1 = new VoiceDownloadManager$createVoiceDirectory$1(bVar, continuationImpl);
        Object obj22 = voiceDownloadManager$createVoiceDirectory$1.result;
        obj = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceDownloadManager$createVoiceDirectory$1.label;
        if (i != 0) {
        }
        voiceDownloadManager$createVoiceDirectory$1.L$0 = str;
        voiceDownloadManager$createVoiceDirectory$1.L$1 = str2;
        voiceDownloadManager$createVoiceDirectory$1.label = 2;
        if (bVar.e(str, str2, voiceDownloadManager$createVoiceDirectory$1) != obj) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(b bVar, String str, ZipInputStream zipInputStream, ContinuationImpl continuationImpl) {
        VoiceDownloadManager$writeToFile$1 voiceDownloadManager$writeToFile$1;
        int i;
        bVar.getClass();
        if (continuationImpl instanceof VoiceDownloadManager$writeToFile$1) {
            voiceDownloadManager$writeToFile$1 = (VoiceDownloadManager$writeToFile$1) continuationImpl;
            int i2 = voiceDownloadManager$writeToFile$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceDownloadManager$writeToFile$1.label = i2 - Integer.MIN_VALUE;
                Object obj = voiceDownloadManager$writeToFile$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceDownloadManager$writeToFile$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    bVar.a.getClass();
                    sjh sjhVar = uyj.a;
                    mdh mdhVar = mdh.b;
                    VoiceDownloadManager$writeToFile$2 voiceDownloadManager$writeToFile$2 = new VoiceDownloadManager$writeToFile$2(str, zipInputStream, null);
                    voiceDownloadManager$writeToFile$1.L$0 = null;
                    voiceDownloadManager$writeToFile$1.L$1 = null;
                    voiceDownloadManager$writeToFile$1.label = 1;
                    obj = tje.k0(mdhVar, voiceDownloadManager$writeToFile$2, voiceDownloadManager$writeToFile$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return ((Result) obj).getValue();
            }
        }
        voiceDownloadManager$writeToFile$1 = new VoiceDownloadManager$writeToFile$1(bVar, continuationImpl);
        Object obj2 = voiceDownloadManager$writeToFile$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceDownloadManager$writeToFile$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }

    public final Object c(String str, ContinuationImpl continuationImpl) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new VoiceDownloadManager$createFolder$2(str, null), continuationImpl);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, ContinuationImpl continuationImpl) {
        VoiceDownloadManager$createLanguageFolder$1 voiceDownloadManager$createLanguageFolder$1;
        int i;
        if (continuationImpl instanceof VoiceDownloadManager$createLanguageFolder$1) {
            voiceDownloadManager$createLanguageFolder$1 = (VoiceDownloadManager$createLanguageFolder$1) continuationImpl;
            int i2 = voiceDownloadManager$createLanguageFolder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceDownloadManager$createLanguageFolder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = voiceDownloadManager$createLanguageFolder$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceDownloadManager$createLanguageFolder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String a = this.d.a(str);
                    voiceDownloadManager$createLanguageFolder$1.L$0 = null;
                    voiceDownloadManager$createLanguageFolder$1.label = 1;
                    if (c(a, voiceDownloadManager$createLanguageFolder$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        voiceDownloadManager$createLanguageFolder$1 = new VoiceDownloadManager$createLanguageFolder$1(this, continuationImpl);
        Object obj3 = voiceDownloadManager$createLanguageFolder$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceDownloadManager$createLanguageFolder$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, String str2, ContinuationImpl continuationImpl) {
        VoiceDownloadManager$createVoiceFolder$1 voiceDownloadManager$createVoiceFolder$1;
        int i;
        if (continuationImpl instanceof VoiceDownloadManager$createVoiceFolder$1) {
            voiceDownloadManager$createVoiceFolder$1 = (VoiceDownloadManager$createVoiceFolder$1) continuationImpl;
            int i2 = voiceDownloadManager$createVoiceFolder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceDownloadManager$createVoiceFolder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = voiceDownloadManager$createVoiceFolder$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceDownloadManager$createVoiceFolder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String b = this.d.b(str, str2);
                    voiceDownloadManager$createVoiceFolder$1.L$0 = null;
                    voiceDownloadManager$createVoiceFolder$1.L$1 = null;
                    voiceDownloadManager$createVoiceFolder$1.label = 1;
                    if (c(b, voiceDownloadManager$createVoiceFolder$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        voiceDownloadManager$createVoiceFolder$1 = new VoiceDownloadManager$createVoiceFolder$1(this, continuationImpl);
        Object obj3 = voiceDownloadManager$createVoiceFolder$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceDownloadManager$createVoiceFolder$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, String str2, ContinuationImpl continuationImpl) {
        VoiceDownloadManager$createVoiceNavigationFolder$1 voiceDownloadManager$createVoiceNavigationFolder$1;
        int i;
        if (continuationImpl instanceof VoiceDownloadManager$createVoiceNavigationFolder$1) {
            voiceDownloadManager$createVoiceNavigationFolder$1 = (VoiceDownloadManager$createVoiceNavigationFolder$1) continuationImpl;
            int i2 = voiceDownloadManager$createVoiceNavigationFolder$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                voiceDownloadManager$createVoiceNavigationFolder$1.label = i2 - Integer.MIN_VALUE;
                Object obj = voiceDownloadManager$createVoiceNavigationFolder$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = voiceDownloadManager$createVoiceNavigationFolder$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    String concat = this.d.b(str, str2).concat("/navigation");
                    voiceDownloadManager$createVoiceNavigationFolder$1.L$0 = null;
                    voiceDownloadManager$createVoiceNavigationFolder$1.L$1 = null;
                    voiceDownloadManager$createVoiceNavigationFolder$1.label = 1;
                    if (c(concat, voiceDownloadManager$createVoiceNavigationFolder$1) == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        voiceDownloadManager$createVoiceNavigationFolder$1 = new VoiceDownloadManager$createVoiceNavigationFolder$1(this, continuationImpl);
        Object obj3 = voiceDownloadManager$createVoiceNavigationFolder$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = voiceDownloadManager$createVoiceNavigationFolder$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }

    public final Object g(String str, String str2, String str3, Continuation continuation) {
        this.a.getClass();
        sjh sjhVar = uyj.a;
        return tje.k0(mdh.b, new VoiceDownloadManager$downloadVoicePack$2(this, str, str2, str3, null), continuation);
    }
}
