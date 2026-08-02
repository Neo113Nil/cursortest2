package xsna;

import com.vk.topics.impl.fragments.BoardTopicsFragment;
import xsna.li7;

/* compiled from: BoardTopicsFragment.kt */
/* loaded from: classes6.dex */
public final class kj7 extends beg0 {
    public final /* synthetic */ BoardTopicsFragment d;
    public final /* synthetic */ ii7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kj7(BoardTopicsFragment boardTopicsFragment, ii7 ii7Var) {
        super(boardTopicsFragment);
        this.d = boardTopicsFragment;
        this.e = ii7Var;
    }

    @Override // xsna.beg0
    public final void r() {
        int i = BoardTopicsFragment.S0;
        BoardTopicsFragment boardTopicsFragment = this.d;
        ((ysg0) boardTopicsFragment.P0.getValue()).a(new li7.b(boardTopicsFragment.No()));
        boardTopicsFragment.v0.remove(this.e);
        boardTopicsFragment.q();
    }
}
