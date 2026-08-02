package defpackage;

import com.yandex.go.quark.ai_assistant.impl.ui.AiAssistantModalView;

/* loaded from: classes13.dex */
public final /* synthetic */ class ol1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wl1 b;

    public /* synthetic */ ol1(wl1 wl1Var, int i) {
        this.a = i;
        this.b = wl1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        wl1 wl1Var = this.b;
        switch (i) {
            case 0:
                AiAssistantModalView.onAttachedToWindow$close(wl1Var);
                break;
            default:
                AiAssistantModalView.lambda$0$reloadContent(wl1Var);
                break;
        }
    }
}
