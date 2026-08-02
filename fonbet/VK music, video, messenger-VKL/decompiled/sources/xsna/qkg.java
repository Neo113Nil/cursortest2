package xsna;

import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.vk.attachpicker.impl.ImagePickerActivity;
import com.vk.core.widget.LifecycleHandler;
import com.vk.dto.common.id.UserId;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;
import xsna.sw50;

/* compiled from: CommonImagePickerBridge.kt */
/* loaded from: classes7.dex */
public final class qkg implements sw50.f {
    @Override // xsna.sw50.f
    public final boolean a(Intent intent) {
        int i = ImagePickerActivity.p;
        return intent.getBooleanExtra("wasPicked", false);
    }

    @Override // xsna.sw50.f
    public final void b(LifecycleHandler lifecycleHandler) {
        int i = ImagePickerActivity.p;
        ImagePickerActivity.a aVar = new ImagePickerActivity.a();
        aVar.i = 1;
        aVar.j = 1;
        lifecycleHandler.g(11, String.valueOf(new b5z().b), aVar.a(lifecycleHandler.b));
    }

    @Override // xsna.sw50.f
    public final void c(u90 u90Var, UserId userId, String str, int i) {
        int i2 = ImagePickerActivity.p;
        ImagePickerActivity.a aVar = new ImagePickerActivity.a();
        aVar.b = true;
        aVar.c = true;
        aVar.k = userId;
        aVar.l = str;
        aVar.j = 1;
        u90Var.D(aVar.a(u90Var.B()), i, null);
    }

    @Override // xsna.sw50.f
    public final void d(Fragment fragment, int i, int i2, sw50.f.a aVar) {
        int i3 = ImagePickerActivity.p;
        ImagePickerActivity.a aVar2 = new ImagePickerActivity.a();
        aVar2.i = 1;
        aVar2.j = i2;
        Boolean bool = aVar.a;
        if (bool != null) {
            aVar2.d = bool.booleanValue();
        }
        Intent intent = aVar.b;
        if (intent != null) {
            aVar2.h = intent;
        }
        Boolean bool2 = aVar.c;
        if (bool2 != null) {
            aVar2.e = bool2.booleanValue();
        }
        Boolean bool3 = aVar.d;
        if (bool3 != null) {
            aVar2.f = bool3.booleanValue();
        }
        GalleryPickerSourceConfiguration.EntryPoint entryPoint = aVar.e;
        if (entryPoint != null) {
            aVar2.g = entryPoint;
        }
        fragment.startActivityForResult(aVar2.a(fragment.getActivity()), i);
    }

    @Override // xsna.sw50.f
    public final void e(jbs jbsVar) {
        int i = ImagePickerActivity.p;
        ImagePickerActivity.a aVar = new ImagePickerActivity.a();
        aVar.b = false;
        aVar.j = 1;
        jbsVar.D(aVar.a(jbsVar.B()), 1234, null);
    }
}
