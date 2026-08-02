package defpackage;

import com.ybsdk.widgets.common.bottomsheet.BottomSheetDialogView;

/* loaded from: classes4.dex */
public final class kf6 extends uwn {
    public final /* synthetic */ tls a;
    public final /* synthetic */ BottomSheetDialogView b;

    public kf6(tls tlsVar, BottomSheetDialogView bottomSheetDialogView) {
        this.a = tlsVar;
        this.b = bottomSheetDialogView;
    }

    @Override // defpackage.uwn, defpackage.t45
    public final void a() {
        boolean z;
        z = this.b.dismissByUser;
        this.a.invoke(Boolean.valueOf(z));
    }
}
