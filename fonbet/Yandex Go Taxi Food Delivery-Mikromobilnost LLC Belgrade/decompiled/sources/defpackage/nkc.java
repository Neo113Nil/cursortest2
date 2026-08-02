package defpackage;

/* loaded from: classes2.dex */
public final class nkc extends clc {
    public nkc(String str, png pngVar) {
        super("sendDirective", new mkc(str, pngVar));
    }

    @Override // defpackage.clc
    public final String d(zcx zcxVar) {
        return zcxVar.c(this.b, mkc.Companion.serializer());
    }
}
