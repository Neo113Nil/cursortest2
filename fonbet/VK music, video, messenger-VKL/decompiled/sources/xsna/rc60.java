package xsna;

import androidx.recyclerview.widget.m;
import com.vk.dto.group.Group;
import com.vk.dto.group.GroupSuggestion;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class rc60 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ rc60(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                sc60 sc60Var = (sc60) this.c;
                List<? extends ol60> list = (List) this.d;
                c9x c9xVar = (c9x) this.e;
                m.d dVar = (m.d) this.f;
                sc60Var.c = list;
                sc60Var.d = c9xVar;
                dVar.b(sc60Var.a);
                break;
            default:
                ((q3n0) this.c).c((GroupSuggestion) this.d, (Group) this.e, (String) this.f, true, null);
                break;
        }
        return s3q0.a;
    }
}
