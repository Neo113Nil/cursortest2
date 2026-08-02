package defpackage;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.c;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class c53 extends c {
    public final /* synthetic */ int b;
    public final EvaluableType c;
    public final List d;

    public c53(EvaluableType evaluableType, int i) {
        this.b = i;
        switch (i) {
            case 1:
                this.c = evaluableType;
                this.d = scc.g(new kms(EvaluableType.ARRAY, false), new kms(EvaluableType.INTEGER, false), new kms(evaluableType, false));
                break;
            default:
                this.c = evaluableType;
                this.d = scc.g(new kms(EvaluableType.ARRAY, false), new kms(EvaluableType.INTEGER, false));
                break;
        }
    }

    @Override // com.yandex.div.evaluable.c
    public List b() {
        switch (this.b) {
        }
        return this.d;
    }

    @Override // com.yandex.div.evaluable.c
    public final EvaluableType d() {
        switch (this.b) {
        }
        return this.c;
    }

    @Override // com.yandex.div.evaluable.c
    public final boolean f() {
        switch (this.b) {
        }
        return false;
    }

    public boolean j() {
        return false;
    }
}
