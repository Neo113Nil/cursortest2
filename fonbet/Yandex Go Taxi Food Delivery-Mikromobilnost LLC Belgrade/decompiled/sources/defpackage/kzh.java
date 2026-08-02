package defpackage;

/* loaded from: classes5.dex */
public final class kzh implements rvi {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kzh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final void n1() {
    }

    @Override // defpackage.rvi
    public final void D() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ghg) obj).b.invoke();
                break;
            default:
                zsa zsaVar = (zsa) obj;
                zsaVar.r(new qu(9));
                ((jc0) zsaVar.G).invoke();
                break;
        }
    }

    @Override // defpackage.rvi
    public final void Z0(String str) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ghg) obj).b.invoke();
                break;
            default:
                zsa zsaVar = (zsa) obj;
                zsaVar.r(new qu(9));
                ((dv9) zsaVar.F).invoke(str);
                break;
        }
    }

    @Override // defpackage.sy60
    public final void a() {
        switch (this.a) {
            case 0:
                break;
            default:
                ((zsa) this.b).r(new qu(9));
                break;
        }
    }
}
