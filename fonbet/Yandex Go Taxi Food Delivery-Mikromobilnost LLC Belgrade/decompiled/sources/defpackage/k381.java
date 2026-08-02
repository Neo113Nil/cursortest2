package defpackage;

/* loaded from: classes7.dex */
public abstract class k381 implements ag71 {
    public abstract boolean a(char c);

    @Override // defpackage.ag71
    public final boolean apply(Object obj) {
        return a(((Character) obj).charValue());
    }
}
