package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.posting.impl.domain.model.PickerTechMetrics;
import java.util.LinkedHashSet;
import java.util.Set;

/* compiled from: VideoPickerState.kt */
/* loaded from: classes4.dex */
public final class c3t0 implements km50 {
    public final UserId b;
    public final e3t0<p2t0> c;
    public final Set<String> d;
    public final boolean e;
    public final fwp f;
    public final PickerTechMetrics g;
    public final boolean h;

    /* compiled from: VideoPickerState.kt */
    public static final class a {
        public static c3t0 a(UserId userId, Set set) {
            return new c3t0(userId, null, set, false, null, null, false);
        }
    }

    public c3t0(UserId userId, e3t0<p2t0> e3t0Var, Set<String> set, boolean z, fwp fwpVar, PickerTechMetrics pickerTechMetrics, boolean z2) {
        this.b = userId;
        this.c = e3t0Var;
        this.d = set;
        this.e = z;
        this.f = fwpVar;
        this.g = pickerTechMetrics;
        this.h = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static c3t0 a(c3t0 c3t0Var, e3t0 e3t0Var, LinkedHashSet linkedHashSet, boolean z, fwp fwpVar, PickerTechMetrics pickerTechMetrics, int i) {
        UserId userId = c3t0Var.b;
        if ((i & 2) != 0) {
            e3t0Var = c3t0Var.c;
        }
        e3t0 e3t0Var2 = e3t0Var;
        Set set = linkedHashSet;
        if ((i & 4) != 0) {
            set = c3t0Var.d;
        }
        Set set2 = set;
        if ((i & 8) != 0) {
            z = c3t0Var.e;
        }
        boolean z2 = z;
        if ((i & 16) != 0) {
            fwpVar = c3t0Var.f;
        }
        fwp fwpVar2 = fwpVar;
        if ((i & 32) != 0) {
            pickerTechMetrics = c3t0Var.g;
        }
        PickerTechMetrics pickerTechMetrics2 = pickerTechMetrics;
        boolean z3 = (i & 64) != 0 ? c3t0Var.h : true;
        c3t0Var.getClass();
        return new c3t0(userId, e3t0Var2, set2, z2, fwpVar2, pickerTechMetrics2, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c3t0)) {
            return false;
        }
        c3t0 c3t0Var = (c3t0) obj;
        return epx.f(this.b, c3t0Var.b) && epx.f(this.c, c3t0Var.c) && epx.f(this.d, c3t0Var.d) && this.e == c3t0Var.e && epx.f(this.f, c3t0Var.f) && epx.f(this.g, c3t0Var.g) && this.h == c3t0Var.h;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.b.b) * 31;
        e3t0<p2t0> e3t0Var = this.c;
        int b = qoy.b(fw3.b((hashCode + (e3t0Var == null ? 0 : e3t0Var.hashCode())) * 31, 31, this.d), 31, this.e);
        fwp fwpVar = this.f;
        int hashCode2 = (b + (fwpVar == null ? 0 : fwpVar.a.hashCode())) * 31;
        PickerTechMetrics pickerTechMetrics = this.g;
        return Boolean.hashCode(this.h) + ((hashCode2 + (pickerTechMetrics != null ? pickerTechMetrics.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoPickerState(ownerId=");
        sb.append(this.b);
        sb.append(", videos=");
        sb.append(this.c);
        sb.append(", selectedVideoIds=");
        sb.append(this.d);
        sb.append(", isLoading=");
        sb.append(this.e);
        sb.append(", errorLoading=");
        sb.append(this.f);
        sb.append(", techMetrics=");
        sb.append(this.g);
        sb.append(", isMeasuringColdStarted=");
        return defpackage.q0.a(sb, this.h, ')');
    }
}
