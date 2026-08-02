package defpackage;

import com.yandex.go.navigator.driving.GuidanceCompletionReason;

/* loaded from: classes12.dex */
public final /* synthetic */ class lkm implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ GuidanceCompletionReason b;

    public /* synthetic */ lkm(GuidanceCompletionReason guidanceCompletionReason, int i) {
        this.a = i;
        this.b = guidanceCompletionReason;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        GuidanceCompletionReason guidanceCompletionReason = this.b;
        switch (i) {
            case 0:
                ((glm) obj).a.r(new lkm(guidanceCompletionReason, 1));
                break;
            default:
                ((xe50) obj).n1(guidanceCompletionReason);
                break;
        }
        return zy11Var;
    }
}
