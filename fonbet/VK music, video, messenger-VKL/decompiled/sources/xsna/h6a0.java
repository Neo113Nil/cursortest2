package xsna;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import xsna.g760;
import xsna.ofk;

/* compiled from: PhotoEditorDelegate.kt */
/* loaded from: classes4.dex */
public final class h6a0 implements g760.a {
    public final /* synthetic */ k6a0 a;

    public h6a0(k6a0 k6a0Var) {
        this.a = k6a0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v5, types: [android.os.Parcelable] */
    @Override // xsna.g760.a
    public final void V2(Intent intent) {
        Parcelable parcelable;
        Object parcelableExtra;
        ArrayList parcelableArrayList;
        k6a0 k6a0Var = this.a;
        vfk vfkVar = k6a0Var.a;
        Bundle bundleExtra = intent != null ? intent.getBundleExtra("result_attachments") : null;
        Uri uri = (bundleExtra == null || (parcelableArrayList = bundleExtra.getParcelableArrayList("result_files")) == null) ? null : (Uri) j5g.a0(parcelableArrayList);
        if (intent != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelableExtra = intent.getParcelableExtra("edited_content_uri", Uri.class);
                parcelable = (Parcelable) parcelableExtra;
            } else {
                ?? parcelableExtra2 = intent.getParcelableExtra("edited_content_uri");
                parcelable = parcelableExtra2 instanceof Uri ? parcelableExtra2 : null;
            }
            r2 = (Uri) parcelable;
        }
        if (r2 != null) {
            uri = r2;
        }
        if (uri != null) {
            vfkVar.invoke(new ofk.c());
            vfkVar.invoke(new ofk.k(uri));
        }
        com.vk.core.simplescreen.a aVar = k6a0Var.c;
        if (aVar != null) {
            aVar.a();
        }
        com.vk.core.simplescreen.a aVar2 = k6a0Var.c;
        if (aVar2 != null) {
            aVar2.dismiss();
        }
    }
}
