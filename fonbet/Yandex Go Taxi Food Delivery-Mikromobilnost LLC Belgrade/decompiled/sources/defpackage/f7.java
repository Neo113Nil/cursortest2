package defpackage;

/* loaded from: classes9.dex */
public interface f7 extends prg {
    @Override // defpackage.prg
    default void b(String str) {
        j().a(new u6e(str));
    }

    default od7 build() {
        return new od7(j().a);
    }

    oz2 j();

    f7 o();
}
