package xsna;

import androidx.lifecycle.Lifecycle;

/* compiled from: AppsCatalogBadgesQueueProvider.kt */
/* loaded from: classes6.dex */
public final class tz5 implements androidx.lifecycle.l {
    public final /* synthetic */ com.vk.superapp.miniapps.impl.d b;

    /* compiled from: AppsCatalogBadgesQueueProvider.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public tz5(com.vk.superapp.miniapps.impl.d dVar) {
        this.b = dVar;
    }

    @Override // androidx.lifecycle.l
    public final void onStateChanged(f5z f5zVar, Lifecycle.Event event) {
        if (a.$EnumSwitchMapping$0[event.ordinal()] == 1) {
            com.vk.superapp.miniapps.impl.d dVar = this.b;
            com.vk.superapp.miniapps.impl.c cVar = dVar.a;
            if (cVar != null) {
                cVar.dismiss();
            }
            dVar.a = null;
        }
    }
}
