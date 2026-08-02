package xsna;

import android.content.Context;
import androidx.lifecycle.Lifecycle;
import com.vk.newsfeed.impl.controllers.stories.StoriesBlockController$receiver$1;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: StoriesBlockController.kt */
/* loaded from: classes4.dex */
public final class pql0 implements androidx.lifecycle.l {
    public final /* synthetic */ qql0 b;

    /* compiled from: StoriesBlockController.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public pql0(qql0 qql0Var) {
        this.b = qql0Var;
    }

    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        qql0 qql0Var = this.b;
        StoriesBlockController$receiver$1 storiesBlockController$receiver$1 = qql0Var.l;
        oql0 oql0Var = qql0Var.j;
        nql0 nql0Var = qql0Var.i;
        mql0 mql0Var = qql0Var.h;
        lql0 lql0Var = qql0Var.g;
        bpn0 bpn0Var = qql0Var.f;
        p870 p870Var = qql0Var.a;
        int i = a.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            ((dtl0) bpn0Var.getValue()).onCreate();
            p870Var.b(102, lql0Var);
            return;
        }
        if (i == 2) {
            qql0Var.e = (erl0) qql0Var.d.getValue();
            return;
        }
        if (i == 3) {
            erl0 erl0Var = qql0Var.e;
            if (erl0Var != null) {
                erl0Var.onResume();
            }
            p870Var.b(Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE, mql0Var);
            p870Var.b(Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE, nql0Var);
            p870Var.b(100, oql0Var);
            Context context = e43.a;
            anj.d(context != null ? context : null, storiesBlockController$receiver$1, qql0Var.k, hf8.a, 4);
            return;
        }
        if (i != 4) {
            if (i != 5) {
                return;
            }
            ((dtl0) bpn0Var.getValue()).onDestroy();
            p870Var.g(lql0Var);
            qql0Var.e = null;
            return;
        }
        erl0 erl0Var2 = qql0Var.e;
        if (erl0Var2 != null) {
            erl0Var2.onPause();
        }
        p870Var.g(mql0Var);
        p870Var.g(nql0Var);
        p870Var.g(oql0Var);
        Context context2 = e43.a;
        enj.s(context2 != null ? context2 : null, storiesBlockController$receiver$1);
    }
}
