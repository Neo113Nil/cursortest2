package androidx.media3.exoplayer;

import defpackage.a9z0;
import defpackage.k4h;
import defpackage.s400;
import defpackage.sf10;
import defpackage.tf10;
import defpackage.uf10;
import defpackage.xe10;

/* loaded from: classes10.dex */
public final class k implements tf10 {
    public final s400 a = new s400(this);
    public final k4h b = new k4h();
    public boolean c;
    public final /* synthetic */ MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback w;

    public k(MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback metadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback) {
        this.w = metadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback;
    }

    @Override // defpackage.tf10
    public final void onSourceInfoRefreshed(uf10 uf10Var, a9z0 a9z0Var) {
        xe10 xe10Var;
        if (this.c) {
            return;
        }
        this.c = true;
        xe10 createPeriod = uf10Var.createPeriod(new sf10(a9z0Var.m(0)), this.b, 0L);
        MetadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback metadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback = this.w;
        metadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback.mediaPeriod = createPeriod;
        xe10Var = metadataRetriever$MetadataRetrieverInternal$MediaSourceHandlerCallback.mediaPeriod;
        xe10Var.l(this.a, 0L);
    }
}
