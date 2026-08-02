package xsna;

import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: SessionConfigurationCompat.java */
/* loaded from: classes11.dex */
public final class zsi0 {
    public final a a;

    /* compiled from: SessionConfigurationCompat.java */
    public static final class a {
        public final SessionConfiguration a;
        public final List<m190> b;

        public a(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull won0 won0Var) {
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object obj = ((m190) it.next()).a.a;
                obr.b(obj instanceof OutputConfiguration);
                arrayList2.add((OutputConfiguration) obj);
            }
            SessionConfiguration sessionConfiguration = new SessionConfiguration(0, arrayList2, executor, won0Var);
            this.a = sessionConfiguration;
            List<OutputConfiguration> outputConfigurations = sessionConfiguration.getOutputConfigurations();
            ArrayList arrayList3 = new ArrayList(outputConfigurations.size());
            Iterator<OutputConfiguration> it2 = outputConfigurations.iterator();
            while (it2.hasNext()) {
                OutputConfiguration next = it2.next();
                arrayList3.add(next == null ? null : new m190(new n190(next)));
            }
            this.b = Collections.unmodifiableList(arrayList3);
        }

        public final boolean equals(@Nullable Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            return Objects.equals(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    public zsi0(@NonNull ArrayList arrayList, @NonNull Executor executor, @NonNull won0 won0Var) {
        this.a = new a(arrayList, executor, won0Var);
    }

    public final boolean equals(@Nullable Object obj) {
        if (!(obj instanceof zsi0)) {
            return false;
        }
        return this.a.equals(((zsi0) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
