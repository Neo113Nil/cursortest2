package xsna;

import android.graphics.Bitmap;
import com.vk.profile.design.view.cover.SnowballsCoverView;

/* compiled from: SnowballsCoverHolder.kt */
/* loaded from: classes5.dex */
public final class gdk0 implements izs<Bitmap, SnowballsCoverView.a> {
    public final /* synthetic */ SnowballsCoverView.b b;

    public gdk0(SnowballsCoverView.b bVar) {
        this.b = bVar;
    }

    @Override // xsna.izs
    public final SnowballsCoverView.a invoke(Bitmap bitmap) {
        SnowballsCoverView.b bVar = this.b;
        return new SnowballsCoverView.a(bitmap, bVar.a, bVar.b);
    }
}
