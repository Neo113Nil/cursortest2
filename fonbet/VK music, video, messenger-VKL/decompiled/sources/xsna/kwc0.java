package xsna;

/* compiled from: PostsFromNotificationsPagingReducer.kt */
/* loaded from: classes4.dex */
public final class kwc0 implements bm50<uvc0, qvc0> {
    public final pr60 a;

    public kwc0(s1v s1vVar, rr60 rr60Var) {
        this.a = new pr60(s1vVar, rr60Var);
    }

    @Override // xsna.bm50
    public final uvc0 a(uvc0 uvc0Var, qvc0 qvc0Var) {
        uvc0 uvc0Var2 = uvc0Var;
        return new uvc0(uvc0Var2.c, this.a.a(uvc0Var2.b, qvc0Var.a));
    }

    @Override // xsna.bm50
    public final /* bridge */ /* synthetic */ boolean b(qvc0 qvc0Var) {
        return true;
    }
}
