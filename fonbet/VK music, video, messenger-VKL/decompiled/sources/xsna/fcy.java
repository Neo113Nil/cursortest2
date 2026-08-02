package xsna;

/* compiled from: KFunction.kt */
/* loaded from: classes11.dex */
public interface fcy<R> extends ccy<R>, xzs<R> {
    boolean isExternal();

    boolean isInfix();

    boolean isInline();

    boolean isOperator();

    @Override // xsna.ccy
    boolean isSuspend();
}
