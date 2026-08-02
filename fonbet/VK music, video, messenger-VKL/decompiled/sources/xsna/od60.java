package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import com.vk.permission.PermissionHelper;
import java.io.File;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class od60 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ od60(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.b;
        r1 = false;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                qd60 qd60Var = (qd60) obj;
                qd60Var.b();
                qd60Var.e.a.clear();
                File[] listFiles = qd60Var.d.listFiles();
                if (listFiles == null) {
                    return null;
                }
                for (File file : listFiles) {
                    file.delete();
                }
                return s3q0.a;
            case 1:
                PostingAttachLocationFragment postingAttachLocationFragment = (PostingAttachLocationFragment) obj;
                int i2 = PostingAttachLocationFragment.I0;
                if (hd60.a().x1(postingAttachLocationFragment.kn())) {
                    PermissionHelper permissionHelper = PermissionHelper.a;
                    Context requireContext = postingAttachLocationFragment.requireContext();
                    permissionHelper.getClass();
                    if (PermissionHelper.c(requireContext, PermissionHelper.i)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 2:
                return Long.valueOf(((b3k0) obj).a());
            default:
                return Uri.parse((String) obj);
        }
    }
}
