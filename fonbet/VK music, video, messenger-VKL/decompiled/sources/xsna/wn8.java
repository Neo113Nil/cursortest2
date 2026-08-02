package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class wn8 implements wb0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wn8(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.b;
        return invoke((sj50) obj);
    }

    @Override // xsna.wb0
    /* renamed from: j */
    public final qj50 invoke(sj50 sj50Var) {
        switch (this.b) {
            case 0:
                izs izsVar = (izs) this.c;
                pzw pzwVar = new pzw();
                izsVar.invoke(pzwVar);
                izs<? super el50<State, Action, TaskId, TaskExecution, TaskExecutionScope, Event>, s3q0> izsVar2 = pzwVar.a;
                wzs<? super el50<State, Action, TaskId, TaskExecution, TaskExecutionScope, Event>, ? super Action, s3q0> wzsVar = pzwVar.c;
                if (wzsVar != 0) {
                    return new cjl(izsVar2, pzwVar.b, wzsVar, sj50Var);
                }
                throw new IllegalArgumentException("You have forgotten to configure [accept] block in actor DSL");
            default:
                return new com.vk.profile.community.members.impl.ui.e(sj50Var, (a220) this.c);
        }
    }
}
