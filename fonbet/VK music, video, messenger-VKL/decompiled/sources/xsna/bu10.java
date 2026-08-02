package xsna;

import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: MediaPickerInteractorImpl.kt */
/* loaded from: classes3.dex */
public final class bu10 {
    public final nu10 a;

    public bu10(nu10 nu10Var) {
        this.a = nu10Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, int i2, int i3, int i4, List list, ContinuationImpl continuationImpl) {
        au10 au10Var;
        int i5;
        Object a;
        boolean z;
        if (continuationImpl instanceof au10) {
            au10Var = (au10) continuationImpl;
            int i6 = au10Var.label;
            if ((i6 & Integer.MIN_VALUE) != 0) {
                au10Var.label = i6 - Integer.MIN_VALUE;
                au10 au10Var2 = au10Var;
                Object obj = au10Var2.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i5 = au10Var2.label;
                if (i5 != 0) {
                    kotlin.a.a(obj);
                    au10Var2.L$0 = list;
                    au10Var2.I$0 = i;
                    au10Var2.I$1 = i2;
                    au10Var2.I$2 = i3;
                    au10Var2.I$3 = i4;
                    au10Var2.label = 1;
                    a = this.a.a(i, i2, i3, i4, au10Var2);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    list = (List) au10Var2.L$0;
                    kotlin.a.a(obj);
                    a = ((Result) obj).d();
                }
                if (!(a instanceof Result.Failure)) {
                    return a;
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                for (MediaStoreEntry mediaStoreEntry : (List) a) {
                    List<tt10> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (tt10 tt10Var : list2) {
                            if (!(tt10Var instanceof ut10 ? mediaStoreEntry instanceof MediaStoreVideoEntry ? tt10Var.a(mediaStoreEntry) : true : tt10Var.a(mediaStoreEntry))) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    if (z) {
                        linkedHashSet.add(mediaStoreEntry);
                    } else {
                        linkedHashSet2.add(mediaStoreEntry);
                    }
                }
                return new rv10(j5g.O0(linkedHashSet), j5g.O0(linkedHashSet2));
            }
        }
        au10Var = new au10(this, continuationImpl);
        au10 au10Var22 = au10Var;
        Object obj2 = au10Var22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i5 = au10Var22.label;
        if (i5 != 0) {
        }
        if (!(a instanceof Result.Failure)) {
        }
    }
}
