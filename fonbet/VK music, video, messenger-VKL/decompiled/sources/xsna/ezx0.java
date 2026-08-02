package xsna;

import com.vk.push.core.process.SeparateProcessRepository;
import com.vk.push.core.work.WorkModel;

/* compiled from: WorkersRepository.kt */
/* loaded from: classes5.dex */
public final class ezx0 {
    public final fzx0 a;
    public final z540 b;
    public final v260 c;
    public final SeparateProcessRepository d;

    public ezx0(fzx0 fzx0Var, z540 z540Var, v260 v260Var, SeparateProcessRepository separateProcessRepository) {
        this.a = fzx0Var;
        this.b = z540Var;
        this.c = v260Var;
        this.d = separateProcessRepository;
    }

    public final void a(String str) {
        SeparateProcessRepository separateProcessRepository = this.d;
        if (separateProcessRepository.isMultiProcessMode() && separateProcessRepository.isSeparateProcess()) {
            z540 z540Var = this.b;
            myc0.h(z540Var.b, null, null, new x540((cxx0) z540Var.a.c.getValue(), str, null), 3);
        } else {
            awx0 awx0Var = (awx0) this.a.d.getValue();
            if (awx0Var != null) {
                awx0Var.c(str);
            }
        }
    }

    public final void b(WorkModel workModel) {
        SeparateProcessRepository separateProcessRepository = this.d;
        if (!separateProcessRepository.isMultiProcessMode() || !separateProcessRepository.isSeparateProcess()) {
            this.a.a(workModel, false);
            return;
        }
        z540 z540Var = this.b;
        myc0.h(z540Var.b, null, null, new y540((cxx0) z540Var.a.c.getValue(), workModel, null), 3);
    }
}
