package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.libvideo.api.di.VideoPlaylistReversionComponent;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: PlaylistScreenRepository.kt */
/* loaded from: classes6.dex */
public final class sdb0 {
    public final xga a;
    public final uft0 b;
    public final o4a c;
    public final VideoPlaylistReversionComponent d;
    public final fks0 e;

    public sdb0(xga xgaVar, uft0 uft0Var, o4a o4aVar, VideoPlaylistReversionComponent videoPlaylistReversionComponent, fks0 fks0Var) {
        this.a = xgaVar;
        this.b = uft0Var;
        this.c = o4aVar;
        this.d = videoPlaylistReversionComponent;
        this.e = fks0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, UserId userId, String str, ContinuationImpl continuationImpl) {
        idb0 idb0Var;
        int i2;
        if (continuationImpl instanceof idb0) {
            idb0Var = (idb0) continuationImpl;
            int i3 = idb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                idb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = idb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = idb0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    jdb0 jdb0Var = new jdb0(this, userId, i, str, null);
                    idb0Var.L$0 = null;
                    idb0Var.L$1 = null;
                    idb0Var.I$0 = i;
                    idb0Var.label = 1;
                    obj = myc0.k(b, jdb0Var, idb0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        idb0Var = new idb0(this, continuationImpl);
        Object obj2 = idb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = idb0Var.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, UserId userId, ContinuationImpl continuationImpl) {
        kdb0 kdb0Var;
        int i2;
        if (continuationImpl instanceof kdb0) {
            kdb0Var = (kdb0) continuationImpl;
            int i3 = kdb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kdb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = kdb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = kdb0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ldb0 ldb0Var = new ldb0(this, i, userId, null);
                    kdb0Var.L$0 = null;
                    kdb0Var.I$0 = i;
                    kdb0Var.label = 1;
                    obj = myc0.k(b, ldb0Var, kdb0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        kdb0Var = new kdb0(this, continuationImpl);
        Object obj2 = kdb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = kdb0Var.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, UserId userId, int i2, String str, ContinuationImpl continuationImpl) {
        mdb0 mdb0Var;
        int i3;
        if (continuationImpl instanceof mdb0) {
            mdb0Var = (mdb0) continuationImpl;
            int i4 = mdb0Var.label;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                mdb0Var.label = i4 - Integer.MIN_VALUE;
                Object obj = mdb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i3 = mdb0Var.label;
                if (i3 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    ndb0 ndb0Var = new ndb0(this, userId, i, str, i2, null);
                    mdb0Var.L$0 = null;
                    mdb0Var.L$1 = null;
                    mdb0Var.I$0 = i;
                    mdb0Var.I$1 = i2;
                    mdb0Var.label = 1;
                    obj = myc0.k(b, ndb0Var, mdb0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        mdb0Var = new mdb0(this, continuationImpl);
        Object obj2 = mdb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i3 = mdb0Var.label;
        if (i3 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(int i, UserId userId, String str, ContinuationImpl continuationImpl) {
        odb0 odb0Var;
        int i2;
        if (continuationImpl instanceof odb0) {
            odb0Var = (odb0) continuationImpl;
            int i3 = odb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                odb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = odb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = odb0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    pdb0 pdb0Var = new pdb0(this, userId, i, str, null);
                    odb0Var.L$0 = null;
                    odb0Var.L$1 = null;
                    odb0Var.I$0 = i;
                    odb0Var.label = 1;
                    obj = myc0.k(b, pdb0Var, odb0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        odb0Var = new odb0(this, continuationImpl);
        Object obj2 = odb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = odb0Var.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).d();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(int i, UserId userId, String str, ContinuationImpl continuationImpl) {
        qdb0 qdb0Var;
        int i2;
        if (continuationImpl instanceof qdb0) {
            qdb0Var = (qdb0) continuationImpl;
            int i3 = qdb0Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qdb0Var.label = i3 - Integer.MIN_VALUE;
                Object obj = qdb0Var.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i2 = qdb0Var.label;
                if (i2 != 0) {
                    kotlin.a.a(obj);
                    ovj b = hqu0.b();
                    rdb0 rdb0Var = new rdb0(this, userId, i, str, null, null);
                    qdb0Var.L$0 = null;
                    qdb0Var.L$1 = null;
                    qdb0Var.L$2 = null;
                    qdb0Var.L$3 = null;
                    qdb0Var.I$0 = i;
                    qdb0Var.label = 1;
                    obj = myc0.k(b, rdb0Var, qdb0Var);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                return ((Result) obj).d();
            }
        }
        qdb0Var = new qdb0(this, continuationImpl);
        Object obj2 = qdb0Var.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i2 = qdb0Var.label;
        if (i2 != 0) {
        }
        return ((Result) obj2).d();
    }
}
