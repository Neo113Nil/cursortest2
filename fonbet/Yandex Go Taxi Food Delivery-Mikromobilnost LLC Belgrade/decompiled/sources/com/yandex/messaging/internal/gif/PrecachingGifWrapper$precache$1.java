package com.yandex.messaging.internal.gif;

import android.graphics.Bitmap;
import defpackage.che0;
import defpackage.hjt;
import defpackage.ie60;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.rgt;
import defpackage.szt0;
import defpackage.tje;
import defpackage.tse;
import defpackage.vgt;
import defpackage.vqc;
import defpackage.wls;
import defpackage.ydz;
import defpackage.zy11;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.internal.gif.PrecachingGifWrapper$precache$1", f = "PrecachingGifWrapper.kt", l = {139}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class PrecachingGifWrapper$precache$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrecachingGifWrapper$precache$1(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PrecachingGifWrapper$precache$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PrecachingGifWrapper$precache$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0094 A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0070, B:16:0x0076, B:19:0x0087, B:23:0x008e, B:25:0x0094, B:26:0x009a, B:28:0x00ab, B:29:0x00b7, B:32:0x00c0, B:34:0x00c4, B:74:0x00cc, B:76:0x00d0, B:78:0x00e2, B:80:0x00e6, B:81:0x00ea, B:83:0x00bc, B:85:0x00f0, B:87:0x007e), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ab A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0070, B:16:0x0076, B:19:0x0087, B:23:0x008e, B:25:0x0094, B:26:0x009a, B:28:0x00ab, B:29:0x00b7, B:32:0x00c0, B:34:0x00c4, B:74:0x00cc, B:76:0x00d0, B:78:0x00e2, B:80:0x00e6, B:81:0x00ea, B:83:0x00bc, B:85:0x00f0, B:87:0x007e), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4 A[Catch: all -> 0x007b, TRY_LEAVE, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0070, B:16:0x0076, B:19:0x0087, B:23:0x008e, B:25:0x0094, B:26:0x009a, B:28:0x00ab, B:29:0x00b7, B:32:0x00c0, B:34:0x00c4, B:74:0x00cc, B:76:0x00d0, B:78:0x00e2, B:80:0x00e6, B:81:0x00ea, B:83:0x00bc, B:85:0x00f0, B:87:0x007e), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0070, B:16:0x0076, B:19:0x0087, B:23:0x008e, B:25:0x0094, B:26:0x009a, B:28:0x00ab, B:29:0x00b7, B:32:0x00c0, B:34:0x00c4, B:74:0x00cc, B:76:0x00d0, B:78:0x00e2, B:80:0x00e6, B:81:0x00ea, B:83:0x00bc, B:85:0x00f0, B:87:0x007e), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00bc A[Catch: all -> 0x007b, TryCatch #0 {all -> 0x007b, blocks: (B:14:0x0070, B:16:0x0076, B:19:0x0087, B:23:0x008e, B:25:0x0094, B:26:0x009a, B:28:0x00ab, B:29:0x00b7, B:32:0x00c0, B:34:0x00c4, B:74:0x00cc, B:76:0x00d0, B:78:0x00e2, B:80:0x00e6, B:81:0x00ea, B:83:0x00bc, B:85:0x00f0, B:87:0x007e), top: B:13:0x0070 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00b6  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, che0] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        int i;
        Bitmap bitmap;
        Bitmap bitmap2;
        int i2;
        int[] iArr;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        che0 che0Var = null;
        if (i3 == 0) {
            kotlin.b.b(obj);
            b bVar = this.this$0;
            ?? r1 = bVar.i;
            if (r1 != 0) {
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                ref$ObjectRef.element = r1;
                tje.N(hjt.a, ie60.a, null, new PrecachingGifWrapper$recycleBitmaps$1(ref$ObjectRef, bVar, null), 2);
                this.this$0.i = null;
            }
            b bVar2 = this.this$0;
            bVar2.f.j = -1;
            this.label = 1;
            if (b.a(bVar2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        b bVar3 = this.this$0;
        if (ydz.a.a()) {
            int i4 = bVar3.c.c;
            ydz.a();
        }
        int i5 = this.this$0.c.c;
        if (i5 >= 0) {
            int i6 = 0;
            che0 che0Var2 = null;
            while (true) {
                szt0 szt0Var = this.this$0.f;
                szt0Var.j = (szt0Var.j + 1) % szt0Var.k.c;
                synchronized (szt0Var) {
                    try {
                        if (szt0Var.k.c > 0) {
                            if (szt0Var.j < 0) {
                            }
                            i = szt0Var.o;
                            if (i != 1 && i != 2) {
                                szt0Var.o = 0;
                                if (szt0Var.d == null) {
                                    szt0Var.d = new byte[255];
                                }
                                rgt rgtVar = (rgt) szt0Var.k.e.get(szt0Var.j);
                                int i7 = szt0Var.j - 1;
                                rgt rgtVar2 = i7 < 0 ? (rgt) szt0Var.k.e.get(i7) : null;
                                iArr = rgtVar.k;
                                if (iArr != null) {
                                    iArr = szt0Var.k.a;
                                }
                                szt0Var.a = iArr;
                                if (iArr != null) {
                                    ydz.a();
                                    szt0Var.o = 1;
                                    bitmap = null;
                                } else {
                                    if (rgtVar.f) {
                                        System.arraycopy(iArr, 0, szt0Var.b, 0, iArr.length);
                                        int[] iArr2 = szt0Var.b;
                                        szt0Var.a = iArr2;
                                        iArr2[rgtVar.h] = 0;
                                        if (rgtVar.g == 2 && szt0Var.j == 0) {
                                            szt0Var.s = Boolean.TRUE;
                                        }
                                    }
                                    bitmap = szt0Var.a(rgtVar, rgtVar2);
                                }
                            }
                            ydz.a();
                            bitmap = null;
                        }
                        int i8 = szt0Var.k.c;
                        ydz.a();
                        szt0Var.o = 1;
                        i = szt0Var.o;
                        if (i != 1) {
                            szt0Var.o = 0;
                            if (szt0Var.d == null) {
                            }
                            rgt rgtVar3 = (rgt) szt0Var.k.e.get(szt0Var.j);
                            int i72 = szt0Var.j - 1;
                            if (i72 < 0) {
                            }
                            iArr = rgtVar3.k;
                            if (iArr != null) {
                            }
                            szt0Var.a = iArr;
                            if (iArr != null) {
                            }
                        }
                        ydz.a();
                        bitmap = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (bitmap != null) {
                    bitmap2 = bitmap.copy(this.this$0.h ? Bitmap.Config.HARDWARE : Bitmap.Config.RGB_565, false);
                } else {
                    bitmap2 = null;
                }
                szt0 szt0Var2 = this.this$0.f;
                vgt vgtVar = szt0Var2.k;
                int i9 = vgtVar.c;
                che0 che0Var3 = new che0(vqc.a(0, 0, (i9 <= 0 || (i2 = szt0Var2.j) < 0) ? 0 : (i2 < 0 || i2 >= i9) ? -1 : ((rgt) vgtVar.e.get(i2)).i, 7), bitmap2);
                b bVar4 = this.this$0;
                if (ydz.a.a()) {
                    if (bitmap2 != null) {
                        new Integer(bitmap2.getByteCount());
                    }
                    Objects.toString(bVar4);
                    ydz.d();
                }
                if (che0Var2 != null) {
                    che0Var2.c = che0Var3;
                }
                b bVar5 = this.this$0;
                if (bVar5.i == null) {
                    bVar5.i = che0Var3;
                    bVar5.j = bitmap2;
                }
                if (!kotlinx.coroutines.a.p(get_context())) {
                    return zy11.a;
                }
                if (i6 == i5) {
                    che0Var = che0Var3;
                    break;
                }
                i6++;
                che0Var2 = che0Var3;
            }
        }
        if (che0Var != null) {
            che0Var.c = this.this$0.i;
        }
        return zy11.a;
    }
}
