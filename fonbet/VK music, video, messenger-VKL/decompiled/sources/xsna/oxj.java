package xsna;

import com.vk.clips.viewer.impl.grid.toolbar.profile.swap.models.CounterType;

/* compiled from: CounterControllerNoViews.kt */
/* loaded from: classes17.dex */
public final class oxj extends nxj {

    /* compiled from: CounterControllerNoViews.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CounterType.values().length];
            try {
                iArr[CounterType.Reacts.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CounterType.Views.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CounterType.Following.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CounterType.Followers.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }
}
