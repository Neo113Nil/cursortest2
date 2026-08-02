package xsna;

import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: DialogsListModels.kt */
/* loaded from: classes2.dex */
public final class qsm {
    public static final qsm i = new qsm(null, null, null, 0, false, 0, null, false, 255);
    public final List<ogm> a;
    public final ProfilesSimpleInfo b;
    public final DialogsFilter c;
    public final int d;
    public final boolean e;
    public final int f;
    public final tkv g;
    public final boolean h;

    public qsm() {
        this(null, null, null, 0, false, 0, null, false, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qsm)) {
            return false;
        }
        qsm qsmVar = (qsm) obj;
        return epx.f(this.a, qsmVar.a) && epx.f(this.b, qsmVar.b) && this.c == qsmVar.c && this.d == qsmVar.d && this.e == qsmVar.e && this.f == qsmVar.f && epx.f(this.g, qsmVar.g) && this.h == qsmVar.h;
    }

    public final int hashCode() {
        int a = shy.a(this.f, qoy.b(shy.a(this.d, (this.c.hashCode() + io.reactivex.rxjava3.subjects.c.a(this.b, this.a.hashCode() * 31, 31)) * 31, 31), 31, this.e), 31);
        tkv tkvVar = this.g;
        return Boolean.hashCode(this.h) + ((a + (tkvVar == null ? 0 : tkvVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsListInfo(list=");
        sb.append(this.a);
        sb.append(", profiles=");
        sb.append(this.b);
        sb.append(", filter=");
        sb.append(this.c);
        sb.append(", requestsCount=");
        sb.append(this.d);
        sb.append(", businessNotifyEnabled=");
        sb.append(this.e);
        sb.append(", businessNotifyCount=");
        sb.append(this.f);
        sb.append(", sharedDialogsMode=");
        sb.append(this.g);
        sb.append(", isEduOnboardingEnabled=");
        return defpackage.q0.a(sb, this.h, ')');
    }

    public qsm(List list, ProfilesSimpleInfo profilesSimpleInfo, DialogsFilter dialogsFilter, int i2, boolean z, int i3, tkv tkvVar, boolean z2, int i4) {
        list = (i4 & 1) != 0 ? EmptyList.b : list;
        profilesSimpleInfo = (i4 & 2) != 0 ? new ProfilesSimpleInfo() : profilesSimpleInfo;
        dialogsFilter = (i4 & 4) != 0 ? DialogsFilter.MAIN : dialogsFilter;
        i2 = (i4 & 8) != 0 ? 0 : i2;
        z = (i4 & 16) != 0 ? false : z;
        i3 = (i4 & 32) != 0 ? 0 : i3;
        tkvVar = (i4 & 64) != 0 ? null : tkvVar;
        z2 = (i4 & 128) != 0 ? false : z2;
        this.a = list;
        this.b = profilesSimpleInfo;
        this.c = dialogsFilter;
        this.d = i2;
        this.e = z;
        this.f = i3;
        this.g = tkvVar;
        this.h = z2;
    }
}
