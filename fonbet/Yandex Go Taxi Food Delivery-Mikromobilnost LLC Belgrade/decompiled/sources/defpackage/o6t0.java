package defpackage;

import com.yandex.go.requirements.comment.api.summary.data.models.CommentViewSource;
import ru.yandex.taxi.preorder.summary.solid.l;

/* loaded from: classes6.dex */
public final /* synthetic */ class o6t0 implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ l b;

    public /* synthetic */ o6t0(l lVar, int i) {
        this.a = i;
        this.b = lVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        l lVar = this.b;
        switch (i) {
            case 0:
                lVar.Og(CommentViewSource.DEEPLINK);
                break;
            default:
                lVar.B2.a((String) obj);
                break;
        }
        return zy11Var;
    }
}
