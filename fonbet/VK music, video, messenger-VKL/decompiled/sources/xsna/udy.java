package xsna;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: KeyPath.java */
/* loaded from: classes12.dex */
public final class udy {
    public static final udy c = new udy("COMPOSITION");
    public final List<String> a;

    @Nullable
    public vdy b;

    public udy(String... strArr) {
        this.a = Arrays.asList(strArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x007e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(int i, String str) {
        List<String> list = this.a;
        if (i < list.size()) {
            boolean z = i == list.size() - 1;
            String str2 = list.get(i);
            if (!str2.equals("**")) {
                boolean z2 = str2.equals(str) || str2.equals("*");
                if ((z || (i == list.size() - 2 && ((String) ji.a(1, list)).equals("**"))) && z2) {
                    return true;
                }
            } else {
                if (z || !list.get(i + 1).equals(str)) {
                    if (!z) {
                        int i2 = i + 1;
                        if (i2 >= list.size() - 1) {
                            return list.get(i2).equals(str);
                        }
                    }
                    return true;
                }
                if (i == list.size() - 2 || (i == list.size() - 3 && ((String) ji.a(1, list)).equals("**"))) {
                }
            }
        }
        return false;
    }

    public final int b(int i, String str) {
        if ("__container".equals(str)) {
            return 0;
        }
        List<String> list = this.a;
        if (list.get(i).equals("**")) {
            return (i != list.size() - 1 && list.get(i + 1).equals(str)) ? 2 : 0;
        }
        return 1;
    }

    public final boolean c(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.a;
        if (i >= list.size()) {
            return false;
        }
        return list.get(i).equals(str) || list.get(i).equals("**") || list.get(i).equals("*");
    }

    public final boolean d(int i, String str) {
        if ("__container".equals(str)) {
            return true;
        }
        List<String> list = this.a;
        return i < list.size() - 1 || list.get(i).equals("**");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && udy.class == obj.getClass()) {
            udy udyVar = (udy) obj;
            if (!this.a.equals(udyVar.a)) {
                return false;
            }
            vdy vdyVar = this.b;
            vdy vdyVar2 = udyVar.b;
            if (vdyVar != null) {
                return vdyVar.equals(vdyVar2);
            }
            if (vdyVar2 == null) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        vdy vdyVar = this.b;
        return hashCode + (vdyVar != null ? vdyVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KeyPath{keys=");
        sb.append(this.a);
        sb.append(",resolved=");
        return defpackage.q0.a(sb, this.b != null, '}');
    }

    public udy(udy udyVar) {
        this.a = new ArrayList(udyVar.a);
        this.b = udyVar.b;
    }
}
