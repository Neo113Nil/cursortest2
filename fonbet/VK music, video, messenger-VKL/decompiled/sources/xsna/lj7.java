package xsna;

import com.vk.topics.impl.fragments.BoardTopicsFragment;
import com.vkontakte.android.R;
import xsna.li7;

/* compiled from: BoardTopicsFragment.kt */
/* loaded from: classes6.dex */
public final class lj7 extends beg0 {
    public final /* synthetic */ BoardTopicsFragment d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ ii7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lj7(BoardTopicsFragment boardTopicsFragment, ii7 ii7Var, boolean z) {
        super(boardTopicsFragment);
        this.d = boardTopicsFragment;
        this.e = z;
        this.f = ii7Var;
    }

    @Override // xsna.beg0
    public final void r() {
        boolean z = this.e;
        cvk.u(z ? R.string.topic_opened : R.string.topic_closed, false);
        ii7 ii7Var = this.f;
        if (z) {
            ii7Var.g &= -2;
        } else {
            ii7Var.g |= 1;
        }
        int i = BoardTopicsFragment.S0;
        BoardTopicsFragment boardTopicsFragment = this.d;
        ((ysg0) boardTopicsFragment.P0.getValue()).a(new li7.c(boardTopicsFragment.No()));
        boardTopicsFragment.q();
    }
}
