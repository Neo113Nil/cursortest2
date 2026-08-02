package xsna;

import com.google.firebase.analytics.connector.internal.AnalyticsConnectorRegistrar;

/* compiled from: DataCollectionDefaultChange.java */
/* loaded from: classes.dex */
public final class ytk implements b9i {
    public static final /* synthetic */ ytk b = new ytk();

    public static final Boolean a(Boolean... boolArr) {
        int length = boolArr.length;
        boolean z = true;
        boolean z2 = false;
        for (int i = 0; i < length; i++) {
            Boolean bool = boolArr[i];
            z = z && bool == null;
            z2 = z2 || (bool != null && bool.booleanValue());
            if (z2) {
                return Boolean.TRUE;
            }
        }
        if (z) {
            return null;
        }
        return Boolean.FALSE;
    }

    @Override // xsna.b9i
    public Object c(lcg0 lcg0Var) {
        return AnalyticsConnectorRegistrar.lambda$getComponents$0(lcg0Var);
    }
}
