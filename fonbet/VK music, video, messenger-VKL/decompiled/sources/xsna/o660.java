package xsna;

import com.vk.im.ui.components.account.main.vc.AccountAvatarAction;
import xsna.w9b;

/* compiled from: NewChannelProfileEventProcessor.kt */
/* loaded from: classes2.dex */
public final class o660 {
    public final bzb0 a;
    public final w9b.b b;
    public final w9b.c c;
    public final w9b d;
    public final rxb e;
    public final com.vk.im.engine.models.c f;

    /* compiled from: NewChannelProfileEventProcessor.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountAvatarAction.values().length];
            try {
                iArr[AccountAvatarAction.OPEN_STORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountAvatarAction.OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o660(bzb0 bzb0Var, w9b.b bVar, w9b.c cVar, w9b w9bVar, rxb rxbVar, com.vk.im.engine.models.c cVar2) {
        this.a = bzb0Var;
        this.b = bVar;
        this.c = cVar;
        this.d = w9bVar;
        this.e = rxbVar;
        this.f = cVar2;
    }
}
