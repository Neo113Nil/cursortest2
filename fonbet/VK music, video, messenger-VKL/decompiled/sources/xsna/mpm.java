package xsna;

import com.vk.dialogsfab.impl.Mode;
import com.vk.dto.common.Peer;
import com.vk.im.mvicomponent.MultiComponentFragment;
import com.vk.im.mvicomponent.MviComponentFragment;
import kotlin.NoWhenBranchMatchedException;
import xsna.lpm;

/* compiled from: DialogsFabRouter.kt */
/* loaded from: classes18.dex */
public final class mpm implements hm50<lpm> {
    public final MviComponentFragment a;
    public final o0w b;
    public final Peer c;
    public final Mode d;

    /* compiled from: DialogsFabRouter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.EXTENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.NEW_CHAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public mpm(MultiComponentFragment multiComponentFragment, o0w o0wVar, Peer peer, Mode mode) {
        this.a = multiComponentFragment;
        this.b = o0wVar;
        this.c = peer;
        this.d = mode;
    }

    @Override // xsna.hm50
    public final void a(lpm lpmVar) {
        lpm lpmVar2 = lpmVar;
        if (!(lpmVar2 instanceof lpm.a)) {
            throw new NoWhenBranchMatchedException();
        }
        int i = a.$EnumSwitchMapping$0[this.d.ordinal()];
        MviComponentFragment mviComponentFragment = this.a;
        if (i == 1) {
            this.b.m(new jbs(mviComponentFragment), false, ((lpm.a) lpmVar2).a);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            o0w.P(this.b, new jbs(mviComponentFragment), null, null, this.c, 14);
        }
    }
}
