package xsna;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class o30 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ o30(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        switch (this.b) {
            case 0:
                v30 v30Var = (v30) this.c;
                x60 x60Var = (x60) this.d;
                v30Var.b().a.delete("actions_with_offline_support", "_id = ?", new String[]{String.valueOf(x60Var.c())});
                break;
            default:
                muv muvVar = (muv) this.c;
                muvVar.c.add((String) this.d);
                break;
        }
    }
}
