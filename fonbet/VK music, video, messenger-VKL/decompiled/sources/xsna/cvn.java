package xsna;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.vk.api.base.Document;
import com.vk.dto.common.id.UserId;
import com.vk.file_picker.FilePickerFragment;
import com.vk.file_picker.external.ExternalFilePickerFragment;
import java.util.ArrayList;

/* compiled from: DocumentsRouterDefault.kt */
/* loaded from: classes18.dex */
public final class cvn implements bvn {
    @Override // xsna.bvn
    public final void a(jbs jbsVar) {
        oz50 cVar;
        ArrayList<String> arrayList = new ArrayList<>();
        if (gz80.a(30)) {
            cVar = new ExternalFilePickerFragment.a();
            Bundle bundle = cVar.j;
            bundle.putLong("size_limit", 10737418240L);
            bundle.putStringArrayList("unavailable_extensions", arrayList);
        } else {
            cVar = new FilePickerFragment.c(FilePickerFragment.class, null, null);
            Bundle bundle2 = cVar.j;
            bundle2.putLong("size_limit", 10737418240L);
            bundle2.putStringArrayList("unavailable_extensions", arrayList);
        }
        cVar.s(true);
        cVar.f = false;
        cVar.i(jbsVar, 103);
    }

    @Override // xsna.bvn
    public final void b(Context context, UserId userId, boolean z) {
        vun vunVar = new vun();
        vunVar.j.putBoolean("open_for_add", z);
        vunVar.y(userId);
        vunVar.k(context);
    }

    @Override // xsna.bvn
    public final void c(Activity activity, Document document) {
        Uri g = jeq0.g(document.k);
        if (vao.j(activity, g, true)) {
            return;
        }
        gvn.e(document, activity, new b1a(14, g, activity));
    }
}
