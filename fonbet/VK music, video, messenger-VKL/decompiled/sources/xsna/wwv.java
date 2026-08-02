package xsna;

import android.app.Activity;
import com.vk.permission.PermissionHelper;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.xal;

/* compiled from: ImAudioMsgPlayerProvider.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class wwv extends FunctionReferenceImpl implements izs<xal.d, s3q0> {
    @Override // xsna.izs
    public final s3q0 invoke(xal.d dVar) {
        xal.d dVar2 = dVar;
        vwv vwvVar = (vwv) this.receiver;
        vwv vwvVar2 = vwv.b;
        vwvVar.getClass();
        c63 c63Var = c63.a;
        Activity b = c63.b();
        if (b == null) {
            dVar2.getClass();
        } else {
            PermissionHelper permissionHelper = PermissionHelper.a;
            permissionHelper.getClass();
            permissionHelper.d(b, PermissionHelper.o, R.string.vkim_permissions_storage_voice_msg, R.string.vkim_permissions_storage_voice_msg, new flu(dVar2, 4), new ayo(dVar2, 10));
        }
        return s3q0.a;
    }
}
