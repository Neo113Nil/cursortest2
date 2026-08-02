package defpackage;

import com.yandex.go.scooters.photocontrol.api.ScootersExamStatus;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class ajo0 {
    public final List a;

    public ajo0(List list) {
        this.a = list;
    }

    public final boolean a() {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((rkn0) it.next()).b == ScootersExamStatus.IMPOSSIBLE) {
                return true;
            }
        }
        return false;
    }

    public final boolean b() {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((rkn0) it.next()).b == ScootersExamStatus.FAILED) {
                return true;
            }
        }
        return false;
    }

    public final boolean c() {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((rkn0) it.next()).b == ScootersExamStatus.IN_PROGRESS) {
                return true;
            }
        }
        return false;
    }

    public final boolean d() {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ScootersExamStatus scootersExamStatus = ((rkn0) it.next()).b;
            if (scootersExamStatus != ScootersExamStatus.SUCCESS && scootersExamStatus != ScootersExamStatus.NOT_REQUIRED) {
                return false;
            }
        }
        return true;
    }

    public final boolean e() {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((rkn0) it.next()).b == ScootersExamStatus.IN_PROGRESS) {
                return false;
            }
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajo0) && this.a.equals(((ajo0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tse0.k("ScootersPhotocontrolState(exams=", Extension.C_BRAKE, this.a);
    }
}
