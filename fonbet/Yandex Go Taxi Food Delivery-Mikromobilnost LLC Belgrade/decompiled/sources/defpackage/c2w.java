package defpackage;

import androidx.compose.ui.node.TraversableNode$Companion$TraverseDescendantsAction;

/* loaded from: classes10.dex */
public final /* synthetic */ class c2w implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ d2w b;

    public /* synthetic */ c2w(d2w d2wVar, int i) {
        this.a = i;
        this.b = d2wVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        d2w d2wVar = this.b;
        dd11 dd11Var = (dd11) obj;
        switch (i) {
            case 0:
                d2w d2wVar2 = (d2w) dd11Var;
                p651 p651Var = d2wVar.b;
                if (!jl40.l(d2wVar2.a, p651Var)) {
                    d2wVar2.a = p651Var;
                    d2wVar2.F0();
                }
                return TraversableNode$Companion$TraverseDescendantsAction.SkipSubtreeAndContinueTraversal;
            default:
                d2wVar.a = ((d2w) dd11Var).b;
                return Boolean.FALSE;
        }
    }
}
