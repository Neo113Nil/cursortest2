package xsna;

import androidx.lifecycle.Lifecycle;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.xdx;

/* compiled from: InterestingStoriesBlockController.kt */
/* loaded from: classes4.dex */
public final class xdx {
    public final f5z a;
    public final p870 b;
    public final ArrayList c = new ArrayList();
    public final vdx d = new vdx(this, 0);
    public final wdx e;

    /* compiled from: InterestingStoriesBlockController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [xsna.e5z, xsna.wdx] */
    public xdx(f5z f5zVar, p870 p870Var) {
        this.a = f5zVar;
        this.b = p870Var;
        ?? r3 = new androidx.lifecycle.l() { // from class: xsna.wdx
            @Override // androidx.lifecycle.l
            public final void onStateChanged(f5z f5zVar2, Lifecycle.Event event) {
                xdx xdxVar = xdx.this;
                vdx vdxVar = xdxVar.d;
                p870 p870Var2 = xdxVar.b;
                int i = xdx.a.$EnumSwitchMapping$0[event.ordinal()];
                if (i == 1) {
                    p870Var2.b(Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, vdxVar);
                    p870Var2.b(125, vdxVar);
                } else if (i == 2) {
                    p870Var2.g(vdxVar);
                } else {
                    if (i != 3) {
                        return;
                    }
                    Iterator it = xdxVar.c.iterator();
                    while (it.hasNext()) {
                        ((WeakReference) it.next()).clear();
                    }
                    xdxVar.a.getLifecycle().removeObserver(xdxVar.e);
                }
            }
        };
        this.e = r3;
        f5zVar.getLifecycle().addObserver(r3);
    }
}
