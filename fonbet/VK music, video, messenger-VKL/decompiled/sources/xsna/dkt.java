package xsna;

import android.content.Context;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.geo.api.data.GeoStaticPreviewInput;
import com.vk.geo.impl.presentation.staticpreview.GeoStaticPreview;
import kotlin.NotImplementedError;
import xsna.hyk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class dkt implements hyk0 {
    public final /* synthetic */ int a;

    public /* synthetic */ dkt(int i) {
        this.a = i;
    }

    @Override // xsna.hyk0
    public final hyk0.b a(Context context, GeoStaticPreviewInput geoStaticPreviewInput, SearchStaticMapPreviewVh searchStaticMapPreviewVh) {
        switch (this.a) {
            case 0:
                throw new NotImplementedError();
            default:
                GeoStaticPreview geoStaticPreview = new GeoStaticPreview(context);
                geoStaticPreview.setInput(geoStaticPreviewInput);
                geoStaticPreview.setReadyCallback(searchStaticMapPreviewVh);
                return geoStaticPreview;
        }
    }
}
