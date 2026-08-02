package defpackage;

import kotlin.Metadata;
import kotlinx.serialization.descriptors.SerialDescriptor;

@gsq0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Ldgv;", "", "Companion", "zfv", "agv", "go-client-android.features.persuggest:api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class dgv {
    public static final agv Companion = new agv();
    public final String a;
    public final String b;

    public /* synthetic */ dgv(int i, String str, String str2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
    }

    public static final /* synthetic */ void b(dgv dgvVar, yjd yjdVar, SerialDescriptor serialDescriptor) {
        if (yjdVar.F() || dgvVar.a != null) {
            yjdVar.g(serialDescriptor, 0, auu0.a, dgvVar.a);
        }
        if (!yjdVar.F() && dgvVar.b == null) {
            return;
        }
        yjdVar.g(serialDescriptor, 1, auu0.a, dgvVar.b);
    }

    /* renamed from: a, reason: from getter */
    public final String getB() {
        return this.b;
    }

    public dgv() {
        this.a = null;
        this.b = null;
    }
}
