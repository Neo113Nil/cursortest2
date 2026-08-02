package xsna;

import com.vk.im.engine.models.dialogs.FolderType;
import com.vk.im.engine.models.education.EduScheduleOnDayModel;

/* compiled from: DialogsToolbarViewState.kt */
/* loaded from: classes18.dex */
public final class pwm implements ao50 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final ezo0 g;
    public final boolean h;
    public final int i;
    public final boolean j;
    public final String k;
    public final EduScheduleOnDayModel.ScheduleDayType l;
    public final sr5 m;
    public final FolderType n;
    public final boolean o;

    public pwm(boolean z, boolean z2, boolean z3, boolean z4, int i, boolean z5, ezo0 ezo0Var, boolean z6, int i2, boolean z7, String str, EduScheduleOnDayModel.ScheduleDayType scheduleDayType, sr5 sr5Var, FolderType folderType, boolean z8) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = z5;
        this.g = ezo0Var;
        this.h = z6;
        this.i = i2;
        this.j = z7;
        this.k = str;
        this.l = scheduleDayType;
        this.m = sr5Var;
        this.n = folderType;
        this.o = z8;
    }

    public static pwm a(pwm pwmVar, boolean z, int i, boolean z2, ezo0 ezo0Var, boolean z3, int i2, sr5 sr5Var, FolderType folderType, boolean z4, int i3) {
        boolean z5 = pwmVar.a;
        boolean z6 = pwmVar.b;
        boolean z7 = pwmVar.c;
        boolean z8 = (i3 & 8) != 0 ? pwmVar.d : z;
        int i4 = (i3 & 16) != 0 ? pwmVar.e : i;
        boolean z9 = (i3 & 32) != 0 ? pwmVar.f : z2;
        ezo0 ezo0Var2 = (i3 & 64) != 0 ? pwmVar.g : ezo0Var;
        boolean z10 = (i3 & 128) != 0 ? pwmVar.h : z3;
        int i5 = (i3 & 256) != 0 ? pwmVar.i : i2;
        boolean z11 = (i3 & 512) != 0 ? pwmVar.j : false;
        String str = (i3 & 1024) != 0 ? pwmVar.k : "";
        EduScheduleOnDayModel.ScheduleDayType scheduleDayType = (i3 & 2048) != 0 ? pwmVar.l : null;
        sr5 sr5Var2 = (i3 & 4096) != 0 ? pwmVar.m : sr5Var;
        FolderType folderType2 = (i3 & 8192) != 0 ? pwmVar.n : folderType;
        boolean z12 = (i3 & 16384) != 0 ? pwmVar.o : z4;
        pwmVar.getClass();
        return new pwm(z5, z6, z7, z8, i4, z9, ezo0Var2, z10, i5, z11, str, scheduleDayType, sr5Var2, folderType2, z12);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pwm)) {
            return false;
        }
        pwm pwmVar = (pwm) obj;
        return this.a == pwmVar.a && this.b == pwmVar.b && this.c == pwmVar.c && this.d == pwmVar.d && this.e == pwmVar.e && this.f == pwmVar.f && epx.f(this.g, pwmVar.g) && this.h == pwmVar.h && this.i == pwmVar.i && this.j == pwmVar.j && epx.f(this.k, pwmVar.k) && this.l == pwmVar.l && epx.f(this.m, pwmVar.m) && this.n == pwmVar.n && this.o == pwmVar.o;
    }

    public final int hashCode() {
        int a = urd0.a(qoy.b(shy.a(this.i, qoy.b((this.g.hashCode() + qoy.b(shy.a(this.e, qoy.b(qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31, this.f)) * 31, 31, this.h), 31), 31, this.j), 31, this.k);
        EduScheduleOnDayModel.ScheduleDayType scheduleDayType = this.l;
        int hashCode = (a + (scheduleDayType == null ? 0 : scheduleDayType.hashCode())) * 31;
        sr5 sr5Var = this.m;
        int hashCode2 = (hashCode + (sr5Var == null ? 0 : sr5Var.hashCode())) * 31;
        FolderType folderType = this.n;
        return Boolean.hashCode(this.o) + ((hashCode2 + (folderType != null ? folderType.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsToolbarViewState(isCallAvailable=");
        sb.append(this.a);
        sb.append(", isBackButtonAvailable=");
        sb.append(this.b);
        sb.append(", isTagsAvailable=");
        sb.append(this.c);
        sb.append(", isArchiveAvailable=");
        sb.append(this.d);
        sb.append(", archiveUnreadCount=");
        sb.append(this.e);
        sb.append(", isArchiveHasMentions=");
        sb.append(this.f);
        sb.append(", title=");
        sb.append(this.g);
        sb.append(", isBusinessNotificationsAvailable=");
        sb.append(this.h);
        sb.append(", businessNotificationsUnreadCount=");
        sb.append(this.i);
        sb.append(", isSilenceModeEnabled=");
        sb.append(this.j);
        sb.append(", silenceModeTill=");
        sb.append(this.k);
        sb.append(", silenceModeTillDay=");
        sb.append(this.l);
        sb.append(", avatarData=");
        sb.append(this.m);
        sb.append(", folderType=");
        sb.append(this.n);
        sb.append(", showTagsMenu=");
        return defpackage.q0.a(sb, this.o, ')');
    }
}
