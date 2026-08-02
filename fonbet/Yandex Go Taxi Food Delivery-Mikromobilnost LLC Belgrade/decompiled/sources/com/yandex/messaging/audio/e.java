package com.yandex.messaging.audio;

import com.squareup.moshi.Moshi;
import com.yandex.messaging.ExistingChatRequest;
import com.yandex.messaging.internal.ServerMessageRef;
import defpackage.alb1;
import defpackage.g6u;
import defpackage.k020;
import defpackage.m8g;
import defpackage.nd60;
import defpackage.ny61;
import defpackage.o400;
import defpackage.ooc;
import defpackage.rh3;
import defpackage.s020;
import defpackage.sjh;
import defpackage.uyj;
import defpackage.v5;
import defpackage.vcz0;
import defpackage.yab;
import defpackage.ydz;
import java.io.Closeable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes15.dex */
public final class e {
    public final com.yandex.messaging.internal.authorized.chat.b a;
    public final ExistingChatRequest b;
    public final v5 c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public e(com.yandex.messaging.internal.authorized.chat.b bVar, ExistingChatRequest existingChatRequest, v5 v5Var) {
        this.a = bVar;
        this.b = existingChatRequest;
        this.c = v5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ServerMessageRef serverMessageRef, ContinuationImpl continuationImpl) {
        AudioTracksRepository$getOrRead$1 audioTracksRepository$getOrRead$1;
        int i;
        if (continuationImpl instanceof AudioTracksRepository$getOrRead$1) {
            audioTracksRepository$getOrRead$1 = (AudioTracksRepository$getOrRead$1) continuationImpl;
            int i2 = audioTracksRepository$getOrRead$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                audioTracksRepository$getOrRead$1.label = i2 - Integer.MIN_VALUE;
                Object obj = audioTracksRepository$getOrRead$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = audioTracksRepository$getOrRead$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    rh3 rh3Var = (rh3) this.d.get(serverMessageRef);
                    if (rh3Var != null) {
                        if (rh3Var.equals(nd60.f)) {
                            return null;
                        }
                        return rh3Var;
                    }
                    audioTracksRepository$getOrRead$1.L$0 = this;
                    audioTracksRepository$getOrRead$1.L$1 = serverMessageRef;
                    audioTracksRepository$getOrRead$1.label = 1;
                    obj = b(serverMessageRef, audioTracksRepository$getOrRead$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    serverMessageRef = (ServerMessageRef) audioTracksRepository$getOrRead$1.L$1;
                    this = (e) audioTracksRepository$getOrRead$1.L$0;
                    kotlin.b.b(obj);
                }
                rh3 rh3Var2 = (rh3) obj;
                this.d.put(serverMessageRef, rh3Var2 != null ? nd60.f : rh3Var2);
                return rh3Var2;
            }
        }
        audioTracksRepository$getOrRead$1 = new AudioTracksRepository$getOrRead$1(this, continuationImpl);
        Object obj2 = audioTracksRepository$getOrRead$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = audioTracksRepository$getOrRead$1.label;
        if (i != 0) {
        }
        rh3 rh3Var22 = (rh3) obj2;
        this.d.put(serverMessageRef, rh3Var22 != null ? nd60.f : rh3Var22);
        return rh3Var22;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b9, code lost:
    
        if (defpackage.tje.k0(r14, r2, r0) == r1) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00bb, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006a, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009c A[Catch: all -> 0x0034, TRY_ENTER, TryCatch #1 {all -> 0x0034, blocks: (B:12:0x002f, B:24:0x009c, B:26:0x00a6), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r13v0, types: [com.yandex.messaging.internal.ServerMessageRef, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.io.Closeable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ServerMessageRef serverMessageRef, ContinuationImpl continuationImpl) {
        AudioTracksRepository$readTrackFromCursor$1 audioTracksRepository$readTrackFromCursor$1;
        int i;
        ServerMessageRef serverMessageRef2;
        boolean moveToFirst;
        yab yabVar;
        rh3 rh3Var;
        try {
            if (continuationImpl instanceof AudioTracksRepository$readTrackFromCursor$1) {
                audioTracksRepository$readTrackFromCursor$1 = (AudioTracksRepository$readTrackFromCursor$1) continuationImpl;
                int i2 = audioTracksRepository$readTrackFromCursor$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    audioTracksRepository$readTrackFromCursor$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = audioTracksRepository$readTrackFromCursor$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = audioTracksRepository$readTrackFromCursor$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        if (ydz.a.a()) {
                            Objects.toString(serverMessageRef);
                            ydz.d();
                        }
                        audioTracksRepository$readTrackFromCursor$1.L$0 = this;
                        audioTracksRepository$readTrackFromCursor$1.L$1 = serverMessageRef;
                        audioTracksRepository$readTrackFromCursor$1.label = 1;
                        obj = this.a.a(this.b, audioTracksRepository$readTrackFromCursor$1);
                        serverMessageRef2 = serverMessageRef;
                    } else {
                        if (i != 1) {
                            if (i != 2) {
                                ny61.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            rh3Var = (rh3) audioTracksRepository$readTrackFromCursor$1.L$1;
                            Closeable closeable = (Closeable) audioTracksRepository$readTrackFromCursor$1.L$0;
                            kotlin.b.b(obj);
                            serverMessageRef = closeable;
                            ooc.g(serverMessageRef, null);
                            return rh3Var;
                        }
                        ServerMessageRef serverMessageRef3 = (ServerMessageRef) audioTracksRepository$readTrackFromCursor$1.L$1;
                        this = (e) audioTracksRepository$readTrackFromCursor$1.L$0;
                        kotlin.b.b(obj);
                        serverMessageRef2 = serverMessageRef3;
                    }
                    vcz0 h = ((m8g) ((s020) obj)).h();
                    k020 k020Var = h.b;
                    yab i3 = alb1.i(k020Var.b.B(), (Moshi) k020Var.h.get(), h.a.a, serverMessageRef2.getTimestamp());
                    moveToFirst = i3.moveToFirst();
                    yabVar = i3;
                    if (!moveToFirst) {
                        yabVar = null;
                    }
                    if (yabVar != null) {
                        return null;
                    }
                    rh3Var = (rh3) this.c.invoke(yabVar);
                    if (rh3Var != null) {
                        sjh sjhVar = uyj.a;
                        g6u g6uVar = o400.a;
                        AudioTracksRepository$readTrackFromCursor$3$1$1 audioTracksRepository$readTrackFromCursor$3$1$1 = new AudioTracksRepository$readTrackFromCursor$3$1$1(rh3Var, null);
                        audioTracksRepository$readTrackFromCursor$1.L$0 = yabVar;
                        audioTracksRepository$readTrackFromCursor$1.L$1 = rh3Var;
                        audioTracksRepository$readTrackFromCursor$1.label = 2;
                        serverMessageRef = yabVar;
                    } else {
                        rh3Var = null;
                        serverMessageRef = yabVar;
                    }
                    ooc.g(serverMessageRef, null);
                    return rh3Var;
                }
            }
            if (i != 0) {
            }
            vcz0 h2 = ((m8g) ((s020) obj)).h();
            k020 k020Var2 = h2.b;
            yab i32 = alb1.i(k020Var2.b.B(), (Moshi) k020Var2.h.get(), h2.a.a, serverMessageRef2.getTimestamp());
            moveToFirst = i32.moveToFirst();
            yabVar = i32;
            if (!moveToFirst) {
            }
            if (yabVar != null) {
            }
        } finally {
        }
        audioTracksRepository$readTrackFromCursor$1 = new AudioTracksRepository$readTrackFromCursor$1(this, continuationImpl);
        Object obj2 = audioTracksRepository$readTrackFromCursor$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = audioTracksRepository$readTrackFromCursor$1.label;
    }
}
