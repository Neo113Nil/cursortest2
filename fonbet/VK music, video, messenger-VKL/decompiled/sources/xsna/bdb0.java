package xsna;

import com.vk.dto.common.id.UserId;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlaylistScreenInteractor.kt */
/* loaded from: classes6.dex */
public final class bdb0 {
    public final sdb0 a;

    public bdb0(sdb0 sdb0Var) {
        this.a = sdb0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, UserId userId, String str, ContinuationImpl continuationImpl) {
        wcb0 wcb0Var;
        int i2;
        if (continuationImpl instanceof wcb0) {
            wcb0Var = (wcb0) continuationImpl;
            int i3 = wcb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                wcb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = wcb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = wcb0Var.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                wcb0Var.L$0 = null;
                wcb0Var.L$1 = null;
                wcb0Var.I$0 = i;
                wcb0Var.label = 1;
                Object a = this.a.a(i, userId, str, wcb0Var);
                return a == coroutineSingletons ? coroutineSingletons : a;
            }
        }
        wcb0Var = new wcb0(this, continuationImpl);
        Object obj2 = wcb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = wcb0Var.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, UserId userId, ContinuationImpl continuationImpl) {
        xcb0 xcb0Var;
        int i2;
        if (continuationImpl instanceof xcb0) {
            xcb0Var = (xcb0) continuationImpl;
            int i3 = xcb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                xcb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = xcb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = xcb0Var.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                xcb0Var.L$0 = null;
                xcb0Var.I$0 = i;
                xcb0Var.label = 1;
                Object b = this.a.b(i, userId, xcb0Var);
                return b == coroutineSingletons ? coroutineSingletons : b;
            }
        }
        xcb0Var = new xcb0(this, continuationImpl);
        Object obj2 = xcb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = xcb0Var.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, UserId userId, int i2, String str, ContinuationImpl continuationImpl) {
        ycb0 ycb0Var;
        int i3;
        if (continuationImpl instanceof ycb0) {
            ycb0Var = (ycb0) continuationImpl;
            int i4 = ycb0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ycb0Var.label = i4 - Integer.MIN_VALUE;
                ycb0 ycb0Var2 = ycb0Var;
                Object obj = ycb0Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = ycb0Var2.label;
                if (i3 == 0) {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                ycb0Var2.L$0 = null;
                ycb0Var2.L$1 = null;
                ycb0Var2.I$0 = i;
                ycb0Var2.I$1 = i2;
                ycb0Var2.label = 1;
                Object c = this.a.c(i, userId, i2, str, ycb0Var2);
                return c == coroutineSingletons ? coroutineSingletons : c;
            }
        }
        ycb0Var = new ycb0(this, continuationImpl);
        ycb0 ycb0Var22 = ycb0Var;
        Object obj2 = ycb0Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = ycb0Var22.label;
        if (i3 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, UserId userId, String str, ContinuationImpl continuationImpl) {
        zcb0 zcb0Var;
        int i2;
        if (continuationImpl instanceof zcb0) {
            zcb0Var = (zcb0) continuationImpl;
            int i3 = zcb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                zcb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = zcb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = zcb0Var.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                zcb0Var.L$0 = null;
                zcb0Var.L$1 = null;
                zcb0Var.I$0 = i;
                zcb0Var.label = 1;
                Object d = this.a.d(i, userId, str, zcb0Var);
                return d == coroutineSingletons ? coroutineSingletons : d;
            }
        }
        zcb0Var = new zcb0(this, continuationImpl);
        Object obj2 = zcb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = zcb0Var.label;
        if (i2 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, UserId userId, String str, ContinuationImpl continuationImpl) {
        adb0 adb0Var;
        int i2;
        if (continuationImpl instanceof adb0) {
            adb0Var = (adb0) continuationImpl;
            int i3 = adb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                adb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = adb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = adb0Var.label;
                if (i2 == 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return ((Result) obj).d();
                }
                kotlin.a.a(obj);
                adb0Var.L$0 = null;
                adb0Var.L$1 = null;
                adb0Var.L$2 = null;
                adb0Var.L$3 = null;
                adb0Var.I$0 = i;
                adb0Var.label = 1;
                Object e = this.a.e(i, userId, str, adb0Var);
                return e == coroutineSingletons ? coroutineSingletons : e;
            }
        }
        adb0Var = new adb0(this, continuationImpl);
        Object obj2 = adb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = adb0Var.label;
        if (i2 == 0) {
        }
    }
}
