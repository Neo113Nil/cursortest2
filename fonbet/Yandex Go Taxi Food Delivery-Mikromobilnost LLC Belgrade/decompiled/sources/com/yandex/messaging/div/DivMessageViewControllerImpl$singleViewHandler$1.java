package com.yandex.messaging.div;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import com.yandex.div.legacy.view.DivView;
import com.yandex.messaging.MessengerEnvironment;
import com.yandex.messaging.internal.authorized.j;
import defpackage.abe;
import defpackage.at20;
import defpackage.b0x;
import defpackage.bn2;
import defpackage.ct21;
import defpackage.g191;
import defpackage.j3b;
import defpackage.mf1;
import defpackage.mrj;
import defpackage.pbj;
import defpackage.r100;
import defpackage.sml;
import defpackage.wls;
import defpackage.z83;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* synthetic */ class DivMessageViewControllerImpl$singleViewHandler$1 extends FunctionReferenceImpl implements wls {
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        String str;
        int i;
        Uri uri = (Uri) obj;
        DivView divView = (DivView) obj2;
        c cVar = (c) this.receiver;
        z83.g(null, cVar.a.w, divView.getView());
        pbj pbjVar = cVar.c;
        MessengerEnvironment messengerEnvironment = (MessengerEnvironment) pbjVar.c;
        boolean z = false;
        if (((j3b) pbjVar.A) != null && (str = (String) messengerEnvironment.c(new r100())) != null && str.equals(((j3b) pbjVar.A).e)) {
            Boolean bool = (Boolean) messengerEnvironment.c(new mf1((byte) 0, 18, uri.toString()));
            Objects.requireNonNull(bool);
            if (bool.booleanValue()) {
                Context context = ((abe) pbjVar.z).a;
                try {
                    i = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getInt("com.yandex.auth.INTERNAL_VERSION", 0);
                } catch (PackageManager.NameNotFoundException unused) {
                    i = 0;
                }
                if (i >= 70703) {
                    divView.switchToState(2);
                    bn2 bn2Var = (bn2) pbjVar.B;
                    if (bn2Var != null) {
                        bn2Var.cancel();
                        pbjVar.B = null;
                    }
                    pbjVar.B = new bn2(0, new ct21((j) ((g191) pbjVar.x).a, new mrj(uri, new at20(pbjVar, divView, false))));
                } else {
                    ((b0x) ((sml) pbjVar.w).a).d.a(uri);
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
