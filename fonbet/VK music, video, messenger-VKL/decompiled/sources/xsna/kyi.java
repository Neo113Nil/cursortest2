package xsna;

/* compiled from: ConfigurationConstants.java */
/* loaded from: classes13.dex */
public final class kyi extends czi {
    public static kyi c;

    public static synchronized kyi r() {
        kyi kyiVar;
        synchronized (kyi.class) {
            try {
                if (c == null) {
                    c = new kyi(0);
                }
                kyiVar = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kyiVar;
    }

    @Override // xsna.czi
    public final String g() {
        return "com.google.firebase.perf.ExperimentTTID";
    }

    @Override // xsna.czi
    public final String h() {
        return "experiment_app_start_ttid";
    }
}
