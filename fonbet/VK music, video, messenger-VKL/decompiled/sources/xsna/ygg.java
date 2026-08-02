package xsna;

/* compiled from: CommonApiErrorHandler.kt */
/* loaded from: classes.dex */
public abstract class ygg {
    public abstract ehg a();

    public final vgg b(Throwable th, g1x g1xVar) {
        ehg a = a();
        if (a != null) {
            return new jd00(th, a, g1xVar, a.a(th));
        }
        par0.a.getClass();
        par0.b("Error " + th + " is not handled properly because apiErrorViewDelegateProvider is not provided");
        return new xjq(th);
    }
}
