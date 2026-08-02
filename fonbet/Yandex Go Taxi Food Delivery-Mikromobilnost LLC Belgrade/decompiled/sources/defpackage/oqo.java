package defpackage;

import com.yandex.alicekit.core.experiments.ExperimentFlag$Type;

/* loaded from: classes.dex */
public abstract class oqo {
    public final String a;
    public final Object b;

    public oqo(String str, Object obj) {
        this.a = str;
        this.b = obj;
    }

    public abstract ExperimentFlag$Type a();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.a.equals(((oqo) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }
}
