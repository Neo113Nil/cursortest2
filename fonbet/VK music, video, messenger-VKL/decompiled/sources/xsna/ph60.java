package xsna;

/* compiled from: NewsfeedDtoTransformerFactory.kt */
/* loaded from: classes.dex */
public final class ph60 implements hno, jyg0 {
    public final Object b;

    public /* synthetic */ ph60(Object obj) {
        this.b = obj;
    }

    @Override // xsna.hno
    public gn60 a() {
        return new tn3((a2o) this.b);
    }

    @Override // xsna.hno
    public gn60 b() {
        return new s101();
    }

    @Override // xsna.hno
    public gn60 d() {
        return new sa30();
    }

    @Override // xsna.jyg0
    public hyg0 open(String str) {
        return new qin0(((tin0) this.b).getWritableDatabase());
    }
}
