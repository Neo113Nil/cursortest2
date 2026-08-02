package xsna;

import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.feature.ReactionsFeedMviState;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o5c0 implements j18 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ o5c0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new s7n(new b410((s5c0) this.c, 14), new com.vk.movika.sdk.base.model.props.c(28), 1);
            default:
                h5f0 h5f0Var = (h5f0) this.c;
                ReactionsFeedMviState invoke = h5f0Var.l.invoke();
                return new s7n(new g4(18, invoke, h5f0Var), new ln20(invoke, 23), 1);
        }
    }
}
