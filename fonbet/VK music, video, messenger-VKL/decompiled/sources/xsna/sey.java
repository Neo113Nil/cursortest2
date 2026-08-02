package xsna;

/* compiled from: KeyboardActionRunner.kt */
/* loaded from: classes11.dex */
public final class sey implements tey {
    public final nek0 a;
    public uey b;
    public vvr c;

    public sey(nek0 nek0Var) {
        this.a = nek0Var;
    }

    public final boolean a(int i) {
        izs<tey, s3q0> izsVar;
        nek0 nek0Var;
        if (i == 7) {
            uey ueyVar = this.b;
            if (ueyVar == null) {
                ueyVar = null;
            }
            izsVar = ueyVar.a;
        } else {
            if (i == 2) {
                uey ueyVar2 = this.b;
                if (ueyVar2 == null) {
                    ueyVar2 = null;
                }
                ueyVar2.getClass();
            } else if (i == 6) {
                uey ueyVar3 = this.b;
                if (ueyVar3 == null) {
                    ueyVar3 = null;
                }
                izsVar = ueyVar3.b;
            } else if (i == 5) {
                uey ueyVar4 = this.b;
                if (ueyVar4 == null) {
                    ueyVar4 = null;
                }
                ueyVar4.getClass();
            } else if (i == 3) {
                uey ueyVar5 = this.b;
                if (ueyVar5 == null) {
                    ueyVar5 = null;
                }
                izsVar = ueyVar5.c;
            } else if (i == 4) {
                uey ueyVar6 = this.b;
                if (ueyVar6 == null) {
                    ueyVar6 = null;
                }
                ueyVar6.getClass();
            } else if (i != 1 && i != 0) {
                throw new IllegalStateException("invalid ImeAction");
            }
            izsVar = null;
        }
        if (izsVar != null) {
            izsVar.invoke(this);
            return true;
        }
        if (i == 6) {
            vvr vvrVar = this.c;
            (vvrVar != null ? vvrVar : null).h(1);
            return true;
        }
        if (i == 5) {
            vvr vvrVar2 = this.c;
            (vvrVar2 != null ? vvrVar2 : null).h(2);
            return true;
        }
        if (i != 7 || (nek0Var = this.a) == null) {
            return false;
        }
        nek0Var.hide();
        return true;
    }
}
