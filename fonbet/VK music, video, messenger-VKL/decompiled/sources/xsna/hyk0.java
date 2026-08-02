package xsna;

import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.geo.api.data.GeoStaticPreviewInput;

/* compiled from: StaticPreviewFactory.kt */
/* loaded from: classes18.dex */
public interface hyk0 {

    /* compiled from: StaticPreviewFactory.kt */
    public interface a {
    }

    /* compiled from: StaticPreviewFactory.kt */
    public interface b {
        ont a();

        View getGeoStaticPreview();

        void setInput(GeoStaticPreviewInput geoStaticPreviewInput);
    }

    /* compiled from: StaticPreviewFactory.kt */
    public interface c {
        void a(String str);

        void b();
    }

    b a(Context context, GeoStaticPreviewInput geoStaticPreviewInput, SearchStaticMapPreviewVh searchStaticMapPreviewVh);
}
