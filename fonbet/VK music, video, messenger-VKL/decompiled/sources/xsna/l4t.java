package xsna;

import android.content.Intent;
import com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration;

/* compiled from: GalleryImageViewerImpl.kt */
/* loaded from: classes15.dex */
public final class l4t implements j34 {
    public final /* synthetic */ o4t b;
    public final /* synthetic */ izs<Intent, s3q0> c;

    /* JADX WARN: Multi-variable type inference failed */
    public l4t(o4t o4tVar, izs<? super Intent, s3q0> izsVar) {
        this.b = o4tVar;
        this.c = izsVar;
    }

    @Override // xsna.j34
    public final void V2(Intent intent) {
        o4t o4tVar = this.b;
        GalleryPickerSourceConfiguration galleryPickerSourceConfiguration = o4tVar.d.E;
        if (galleryPickerSourceConfiguration.b || galleryPickerSourceConfiguration.d == GalleryPickerSourceConfiguration.EntryPoint.IM) {
            if (o4tVar.m == null && o4tVar.n == null) {
                o4tVar.d().a();
            }
            com.vk.attachpicker.screen.p pVar = o4tVar.m;
            if (pVar != null) {
                pVar.m();
            }
            com.vk.attachpicker.screen.l lVar = o4tVar.n;
            if (lVar != null) {
                lVar.m();
            }
        }
        this.c.invoke(intent);
    }
}
