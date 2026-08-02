package defpackage;

import com.yandex.go.superapp.print_animation_text.PrintAnimationTextView;

/* loaded from: classes14.dex */
public final /* synthetic */ class a3f0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ PrintAnimationTextView b;
    public final /* synthetic */ sls c;

    public /* synthetic */ a3f0(PrintAnimationTextView printAnimationTextView, sls slsVar, int i) {
        this.a = i;
        this.b = printAnimationTextView;
        this.c = slsVar;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        zy11 animateShow$lambda$0;
        zy11 animateHide$lambda$0;
        int i = this.a;
        sls slsVar = this.c;
        PrintAnimationTextView printAnimationTextView = this.b;
        switch (i) {
            case 0:
                animateShow$lambda$0 = PrintAnimationTextView.animateShow$lambda$0(printAnimationTextView, slsVar);
                return animateShow$lambda$0;
            default:
                animateHide$lambda$0 = PrintAnimationTextView.animateHide$lambda$0(printAnimationTextView, slsVar);
                return animateHide$lambda$0;
        }
    }
}
