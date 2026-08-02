package defpackage;

import java.util.List;
import ru.yandex.taxi.map_common.map.intersection.Participant;
import ru.yandex.taxi.map_common.map.intersection.a;

/* loaded from: classes14.dex */
public final /* synthetic */ class mp00 implements sls {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ a b;
    public final /* synthetic */ np00 c;
    public final /* synthetic */ Participant w;
    public final /* synthetic */ List x;
    public final /* synthetic */ ro00 y;

    public /* synthetic */ mp00(a aVar, np00 np00Var, Participant participant, ro00 ro00Var, List list) {
        this.b = aVar;
        this.c = np00Var;
        this.w = participant;
        this.y = ro00Var;
        this.x = list;
    }

    @Override // defpackage.sls
    public final Object invoke() {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        ro00 ro00Var = this.y;
        List list = this.x;
        Participant participant = this.w;
        np00 np00Var = this.c;
        a aVar = this.b;
        switch (i) {
            case 0:
                aVar.e(ro00Var, np00Var, list, participant);
                break;
            default:
                aVar.d(ro00Var, np00Var, list, participant);
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ mp00(a aVar, np00 np00Var, Participant participant, List list, ro00 ro00Var) {
        this.b = aVar;
        this.c = np00Var;
        this.w = participant;
        this.x = list;
        this.y = ro00Var;
    }
}
