package xsna;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.vk.im.ui.components.dialogs_list.ChooseMode;
import xsna.ltm;

/* compiled from: DialogsListConfig.kt */
/* loaded from: classes2.dex */
public final class fsm {
    public final Context a;
    public final zdw b;
    public final krl0 c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final gzs<Boolean> j;
    public final ChooseMode k;
    public final ltm l;
    public final boolean m;

    public fsm() {
        throw null;
    }

    public fsm(FragmentActivity fragmentActivity, zdw zdwVar, krl0 krl0Var, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, gzs gzsVar, ChooseMode chooseMode, mtm mtmVar, int i) {
        chooseMode = (i & 1024) != 0 ? null : chooseMode;
        ltm ltmVar = mtmVar;
        if ((i & 2048) != 0) {
            ltm.a.getClass();
            ltmVar = ltm.a.b;
        }
        boolean z7 = (i & 4096) == 0;
        this.a = fragmentActivity;
        this.b = zdwVar;
        this.c = krl0Var;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = gzsVar;
        this.k = chooseMode;
        this.l = ltmVar;
        this.m = z7;
    }

    public final boolean a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsm)) {
            return false;
        }
        fsm fsmVar = (fsm) obj;
        return epx.f(this.a, fsmVar.a) && epx.f(this.b, fsmVar.b) && epx.f(this.c, fsmVar.c) && this.d == fsmVar.d && this.e == fsmVar.e && this.f == fsmVar.f && this.g == fsmVar.g && this.h == fsmVar.h && this.i == fsmVar.i && epx.f(this.j, fsmVar.j) && epx.f(this.k, fsmVar.k) && epx.f(this.l, fsmVar.l) && this.m == fsmVar.m;
    }

    public final int hashCode() {
        int a = sf3.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        ChooseMode chooseMode = this.k;
        return Boolean.hashCode(this.m) + ((this.l.hashCode() + ((a + (chooseMode == null ? 0 : chooseMode.hashCode())) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DialogsListConfig(context=");
        sb.append(this.a);
        sb.append(", imUiModule=");
        sb.append(this.b);
        sb.append(", storiesBridge=");
        sb.append(this.c);
        sb.append(", isInfoBarEnabled=");
        sb.append(this.d);
        sb.append(", isEduBarEnabled=");
        sb.append(this.e);
        sb.append(", isPinEnabled=");
        sb.append(this.f);
        sb.append(", isPreviewEnabled=");
        sb.append(this.g);
        sb.append(", isBirthdaysEnabled=");
        sb.append(this.h);
        sb.append(", showSublistEntrypointsAsRegularDialog=");
        sb.append(this.i);
        sb.append(", isEduAccount=");
        sb.append(this.j);
        sb.append(", mode=");
        sb.append(this.k);
        sb.append(", dialogsListReporter=");
        sb.append(this.l);
        sb.append(", isPromoBannerEnabled=");
        return defpackage.q0.a(sb, this.m, ')');
    }
}
