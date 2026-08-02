package defpackage;

/* loaded from: classes12.dex */
public final class i1h implements da20 {
    public final /* synthetic */ j18 a;

    public i1h(j18 j18Var) {
        this.a = j18Var;
    }

    @Override // defpackage.da20
    public final void error(String str, String str2, Object obj) {
        this.a.resumeWith(Boolean.FALSE);
    }

    @Override // defpackage.da20
    public final void notImplemented() {
        this.a.resumeWith(Boolean.FALSE);
    }

    @Override // defpackage.da20
    public final void success(Object obj) {
        Boolean bool = (Boolean) obj;
        this.a.resumeWith(Boolean.valueOf(bool != null ? bool.booleanValue() : false));
    }
}
