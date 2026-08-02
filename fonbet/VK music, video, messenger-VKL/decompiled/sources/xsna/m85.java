package xsna;

import com.vk.newsfeed.posting.impl.presentation.base.view.steps.PollEditorUiConfig;
import com.vk.newsfeed.posting.impl.presentation.model.PostingPollDto;
import com.vk.newsfeed.posting.poll_editor.presentation.model.PollEditorMode;
import xsna.pnb0;
import xsna.tra0;
import xsna.xpb0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class m85 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;

    public /* synthetic */ m85(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.g = obj5;
        this.h = obj6;
        this.i = obj7;
        this.j = obj8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                lja0 lja0Var = (lja0) this.c;
                o6j o6jVar = (o6j) this.d;
                tra0 tra0Var = (tra0) this.e;
                tra0 tra0Var2 = (tra0) this.f;
                tra0 tra0Var3 = (tra0) this.g;
                tra0 tra0Var4 = (tra0) this.h;
                tra0 tra0Var5 = (tra0) this.i;
                m95 m95Var = (m95) this.j;
                tra0.a aVar = (tra0.a) obj;
                long j = o6jVar.a;
                int i = m95Var.f;
                int i2 = m95Var.g;
                int h = (o6j.h(j) - tra0Var2.c) - i;
                tra0.a.x(aVar, tra0Var, 0, 0);
                if (tra0Var3 != null) {
                    tra0.a.x(aVar, tra0Var3, 0, o6j.h(j) - tra0Var3.c);
                }
                tra0.a.x(aVar, tra0Var2, i2, h);
                if (tra0Var4 != null) {
                    tra0.a.x(aVar, tra0Var4, o6j.i(j) - tra0Var4.b, lja0Var.a);
                }
                if (tra0Var5 != null) {
                    tra0.a.x(aVar, tra0Var5, 0, 0);
                }
                break;
            default:
                xpb0 xpb0Var = (xpb0) this.c;
                izs izsVar = (izs) this.d;
                wh50 wh50Var = (wh50) this.e;
                wh50 wh50Var2 = (wh50) this.f;
                wh50 wh50Var3 = (wh50) this.g;
                wh50 wh50Var4 = (wh50) this.h;
                wh50 wh50Var5 = (wh50) this.i;
                wh50 wh50Var6 = (wh50) this.j;
                PostingPollDto u = p490.u((yrb0) wh50Var.getValue(), ((wow) wh50Var2.getValue()).b, ((wow) wh50Var3.getValue()).b, ((bpw) wh50Var4.getValue()).b, Integer.valueOf(((PostingPollDto) wh50Var5.getValue()).b), ((PostingPollDto) wh50Var5.getValue()).k);
                xpb0.a aVar2 = (xpb0.a) xpb0Var;
                PollEditorMode pollEditorMode = aVar2.f;
                PollEditorUiConfig pollEditorUiConfig = aVar2.e;
                if (epx.f(pollEditorMode, PollEditorMode.Edit.b)) {
                    izsVar.invoke(new pnb0.a.b(u, pollEditorUiConfig, (gob0) wh50Var6.getValue()));
                } else {
                    izsVar.invoke(new pnb0.a.e(u, pollEditorUiConfig));
                }
                break;
        }
        return s3q0.a;
    }
}
