package defpackage;

import com.yandex.go.ai_widget.data.model.AiWidgetEvaluationSwipeDirection;
import com.yandex.go.ai_widget.ui.component.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class mo1 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ f530 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ mo1(b bVar, AiWidgetEvaluationSwipeDirection aiWidgetEvaluationSwipeDirection, pa90 pa90Var, String str, long j, String str2, f530 f530Var, int i, int i2) {
        this.y = bVar;
        this.z = aiWidgetEvaluationSwipeDirection;
        this.A = pa90Var;
        this.B = str;
        this.c = j;
        this.C = str2;
        this.b = f530Var;
        this.w = i;
        this.x = i2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        Object obj3 = this.C;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        Object obj7 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int O = vng.O(i2 | 1);
                xqa1.b((b) obj7, (AiWidgetEvaluationSwipeDirection) obj6, (pa90) obj5, (String) obj4, this.c, (String) obj3, this.b, (fid) obj, O, this.x);
                break;
            default:
                ((Integer) obj2).getClass();
                int O2 = vng.O(i2 | 1);
                yx91.a(null, this.b, this.c, (sls) obj7, (rtm) obj6, (rtm) obj5, (rtm) obj4, (rtm) obj3, (fid) obj, O2, this.x);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mo1(kx91 kx91Var, f530 f530Var, long j, sls slsVar, rtm rtmVar, rtm rtmVar2, rtm rtmVar3, rtm rtmVar4, int i, int i2) {
        this.b = f530Var;
        this.c = j;
        this.y = slsVar;
        this.z = rtmVar;
        this.A = rtmVar2;
        this.B = rtmVar3;
        this.C = rtmVar4;
        this.w = i;
        this.x = i2;
    }
}
