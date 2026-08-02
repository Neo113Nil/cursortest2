package xsna;

import android.content.Context;
import android.content.Intent;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import kotlin.jvm.internal.Ref$ObjectRef;

/* compiled from: GalleryFragmentImpl.kt */
/* loaded from: classes15.dex */
public final class x3t implements j34 {
    public final /* synthetic */ GalleryFragmentImpl b;
    public final /* synthetic */ Ref$ObjectRef<Integer> c;

    public x3t(GalleryFragmentImpl galleryFragmentImpl, Ref$ObjectRef<Integer> ref$ObjectRef) {
        this.b = galleryFragmentImpl;
        this.c = ref$ObjectRef;
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        GalleryFragmentImpl galleryFragmentImpl = this.b;
        if (intent != null) {
            boolean z = true;
            if (BuildInfo.t() || BuildInfo.s()) {
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                z = Preference.g(context).getBoolean("saveProcessedImage", true);
            }
            boolean z2 = galleryFragmentImpl.u0;
            boolean z3 = galleryFragmentImpl.z0;
            Ref$ObjectRef<Integer> ref$ObjectRef = this.c;
            galleryFragmentImpl.ko(intent, (z2 || !z3 || z) ? (z2 || !z3) ? ref$ObjectRef.element : null : ref$ObjectRef.element, new ecm(galleryFragmentImpl, 12));
        }
        em6 em6Var = galleryFragmentImpl.A0;
        if (em6Var == null) {
            em6Var = null;
        }
        if (em6Var != null) {
            em6Var.c();
        }
        galleryFragmentImpl.A0 = null;
    }
}
