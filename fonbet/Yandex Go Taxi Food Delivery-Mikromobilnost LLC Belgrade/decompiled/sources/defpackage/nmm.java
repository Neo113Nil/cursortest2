package defpackage;

/* loaded from: classes10.dex */
public interface nmm {
    void onDrmKeysLoaded(int i, sf10 sf10Var);

    void onDrmKeysRemoved(int i, sf10 sf10Var);

    void onDrmKeysRestored(int i, sf10 sf10Var);

    void onDrmSessionAcquired(int i, sf10 sf10Var, int i2);

    void onDrmSessionManagerError(int i, sf10 sf10Var, Exception exc);

    void onDrmSessionReleased(int i, sf10 sf10Var);
}
