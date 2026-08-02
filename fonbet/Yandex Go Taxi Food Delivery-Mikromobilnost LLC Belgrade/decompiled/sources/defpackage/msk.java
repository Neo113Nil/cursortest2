package defpackage;

/* loaded from: classes.dex */
public interface msk extends ugk, ax01, uvo {
    aw5 getBindingContext();

    m3k getDiv();

    default void release() {
        closeAllSubscription();
        setDiv(null);
        setBindingContext(null);
        releaseBorderDrawer();
    }

    void setBindingContext(aw5 aw5Var);

    void setDiv(m3k m3kVar);
}
