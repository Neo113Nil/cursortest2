package defpackage;

import com.yandex.go.due_timetable.experiment.e;

/* loaded from: classes12.dex */
public final class kpw implements v7p {
    public final /* synthetic */ int a;
    public final fzf b;

    public /* synthetic */ kpw(fzf fzfVar, int i) {
        this.a = i;
        this.b = fzfVar;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        fzf fzfVar = this.b;
        switch (i) {
            case 0:
                return new e((rqo) fzfVar.get());
            default:
                return new ote0((rqo) fzfVar.get());
        }
    }
}
