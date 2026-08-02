package defpackage;

import android.net.Uri;

/* loaded from: classes10.dex */
public final class pp41 extends un2 {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pp41(String str, String str2, int i) {
        super(str, str2, 2);
        this.e = i;
    }

    @Override // defpackage.un2
    public final boolean a() {
        switch (this.e) {
            case 0:
                if (!super.a() || !hm91.d("MULTI_PROCESS")) {
                    return false;
                }
                Uri uri = rm41.a;
                if (qp41.F.a()) {
                    return im91.g().getStatics().isMultiProcessEnabled();
                }
                throw qp41.a();
            default:
                if (hm91.d("MULTI_PROFILE")) {
                    return super.a();
                }
                return false;
        }
    }
}
