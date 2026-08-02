package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.newsfeed.Owner;

/* compiled from: PostLinkGeneratorImpl.kt */
/* loaded from: classes17.dex */
public final class o4c0 implements n4c0 {
    @Override // xsna.n4c0
    public final String a(Owner owner, int i) {
        String o = emi.o(owner);
        if (o == null) {
            o = a0a.d;
        }
        return new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(o).appendPath("wall" + owner.b + '_' + i).build().toString();
    }
}
