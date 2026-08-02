package xsna;

import com.vk.photo.editor.features.crop.models.params.CropAspectRatioFormat;
import java.util.Set;
import xsna.oik;

/* compiled from: CropViewModelFactory.kt */
/* loaded from: classes4.dex */
public final class pik extends opf0<oik> {
    public final com.vk.photo.editor.ivm.d a;
    public final CropAspectRatioFormat b;
    public final Set<ghk> c;

    public pik(com.vk.photo.editor.ivm.d dVar, CropAspectRatioFormat cropAspectRatioFormat, Set<ghk> set) {
        this.a = dVar;
        this.b = cropAspectRatioFormat;
        this.c = set;
    }

    @Override // xsna.opf0
    public final oik e() {
        oik oikVar = new oik();
        oikVar.b = this.a;
        oikVar.d = new oik.a(this.b, this.c);
        return oikVar;
    }

    @Override // xsna.opf0
    public final void f(oik oikVar) {
        oikVar.b = this.a;
    }
}
