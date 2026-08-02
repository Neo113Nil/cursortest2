package xsna;

import android.content.Context;
import com.vk.superapp.vkhealth.permissions.api.SelectedDataSource;
import com.vk.superapp.vksteps.VkStepsSyncReason;
import java.util.List;

/* compiled from: UpdateStepsPayload.kt */
/* loaded from: classes6.dex */
public final class e9q0 {
    public final Context a;
    public final VkStepsSyncReason b;
    public final Long c;
    public final Long d;
    public final izs<Exception, s3q0> e;
    public final gzs<s3q0> f;
    public final izs<List<m0l0>, s3q0> g;
    public final SelectedDataSource h;

    public /* synthetic */ e9q0(Context context, VkStepsSyncReason vkStepsSyncReason, SelectedDataSource selectedDataSource) {
        this(context, vkStepsSyncReason, null, null, null, null, null, selectedDataSource);
    }

    public final Context a() {
        return this.a;
    }

    public final Long b() {
        return this.d;
    }

    public final izs<Exception, s3q0> c() {
        return this.e;
    }

    public final izs<List<m0l0>, s3q0> d() {
        return this.g;
    }

    public final gzs<s3q0> e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e9q0)) {
            return false;
        }
        e9q0 e9q0Var = (e9q0) obj;
        return epx.f(this.a, e9q0Var.a) && this.b == e9q0Var.b && epx.f(this.c, e9q0Var.c) && epx.f(this.d, e9q0Var.d) && epx.f(this.e, e9q0Var.e) && epx.f(this.f, e9q0Var.f) && epx.f(this.g, e9q0Var.g) && this.h == e9q0Var.h;
    }

    public final SelectedDataSource f() {
        return this.h;
    }

    public final Long g() {
        return this.c;
    }

    public final VkStepsSyncReason h() {
        return this.b;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        Long l = this.c;
        int hashCode2 = (hashCode + (l == null ? 0 : l.hashCode())) * 31;
        Long l2 = this.d;
        int hashCode3 = (hashCode2 + (l2 == null ? 0 : l2.hashCode())) * 31;
        izs<Exception, s3q0> izsVar = this.e;
        int hashCode4 = (hashCode3 + (izsVar == null ? 0 : izsVar.hashCode())) * 31;
        gzs<s3q0> gzsVar = this.f;
        int hashCode5 = (hashCode4 + (gzsVar == null ? 0 : gzsVar.hashCode())) * 31;
        izs<List<m0l0>, s3q0> izsVar2 = this.g;
        return this.h.hashCode() + ((hashCode5 + (izsVar2 != null ? izsVar2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "UpdateStepsPayload(context=" + this.a + ", stepsSyncReason=" + this.b + ", startTime=" + this.c + ", endTime=" + this.d + ", onError=" + this.e + ", onSuccessStepsSyncCompleted=" + this.f + ", onSuccessStepsReceivedFromDataSource=" + this.g + ", selectedDataSource=" + this.h + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e9q0(Context context, VkStepsSyncReason vkStepsSyncReason, Long l, Long l2, izs<? super Exception, s3q0> izsVar, gzs<s3q0> gzsVar, izs<? super List<m0l0>, s3q0> izsVar2, SelectedDataSource selectedDataSource) {
        this.a = context;
        this.b = vkStepsSyncReason;
        this.c = l;
        this.d = l2;
        this.e = izsVar;
        this.f = gzsVar;
        this.g = izsVar2;
        this.h = selectedDataSource;
    }
}
