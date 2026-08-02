package xsna;

import androidx.lifecycle.Lifecycle;
import com.vk.core.fragments.FragmentImpl;

/* compiled from: ClipsWrapperChildLifecycleObserver.kt */
/* loaded from: classes17.dex */
public final class tpf implements androidx.lifecycle.l {

    /* compiled from: ClipsWrapperChildLifecycleObserver.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            f5zVar.getLifecycle().removeObserver(this);
        } else {
            FragmentImpl fragmentImpl = f5zVar instanceof FragmentImpl ? (FragmentImpl) f5zVar : null;
            if (fragmentImpl != null) {
                fragmentImpl.o = false;
            }
        }
    }
}
