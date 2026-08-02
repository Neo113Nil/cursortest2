package xsna;

import com.vkontakte.android.api.ExtendedCommunityProfile;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class zg2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zg2(Object obj, boolean z, int i) {
        this.b = i;
        this.d = obj;
        this.c = z;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        switch (this.b) {
            case 0:
                if2 if2Var = (if2) this.d;
                tdu tduVar = (tdu) obj;
                tduVar.Y0(f370.i(1.0f, 0.5f));
                tduVar.A(((Number) if2Var.d()).floatValue());
                tduVar.B(((Number) if2Var.d()).floatValue());
                if (this.c) {
                    tduVar.b(((Number) if2Var.d()).floatValue());
                }
                break;
            default:
                o1i o1iVar = (o1i) this.d;
                ExtendedCommunityProfile extendedCommunityProfile = o1iVar.c;
                extendedCommunityProfile.I1 = this.c;
                o1iVar.d.dl(extendedCommunityProfile);
                break;
        }
        return s3q0.a;
    }
}
