package xsna;

import com.vk.voip.ui.groupcalls.GroupCallViewModel;

/* compiled from: GroupCallModeSelector.kt */
/* loaded from: classes7.dex */
public final class ciu {
    public final GroupCallViewModel a;
    public a b = new a(0, false, false);

    /* compiled from: GroupCallModeSelector.kt */
    public static final class a {
        public final int a;
        public final boolean b;
        public final boolean c;

        public a(int i, boolean z, boolean z2) {
            this.a = i;
            this.b = z;
            this.c = z2;
        }
    }

    public ciu(GroupCallViewModel groupCallViewModel) {
        this.a = groupCallViewModel;
    }
}
