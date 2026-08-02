package xsna;

import android.net.Uri;
import com.unity3d.services.core.network.model.HttpRequest;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.shortvideo.ClipGridParams;
import com.vk.dto.shortvideo.ClipsAuthor;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ClipsGridLinkGeneratorImpl.kt */
/* loaded from: classes17.dex */
public final class qde implements pde {
    @Override // xsna.pde
    public final String a(ClipGridParams.Data data) {
        String str;
        Uri.Builder appendPath;
        boolean z = data instanceof ClipGridParams.Data.Profile;
        if (z) {
            str = emi.o(((ClipGridParams.Data.Profile) data).b.b);
            if (str == null) {
                str = a0a.d;
            }
        } else if (data instanceof ClipGridParams.Data.Music) {
            Owner owner = ((ClipGridParams.Data.Music) data).h;
            if (owner == null || (str = emi.o(owner)) == null) {
                str = a0a.d;
            }
        } else {
            str = a0a.d;
        }
        Uri.Builder appendPath2 = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority(str).appendPath("clips");
        if (data instanceof ClipGridParams.Data.Hashtag) {
            appendPath = appendPath2.appendPath("hashtag").appendPath(erm0.v0(1, ((ClipGridParams.Data.Hashtag) data).b));
        } else if (data instanceof ClipGridParams.Data.CameraMask) {
            appendPath = appendPath2.appendPath("effect").appendPath(((ClipGridParams.Data.CameraMask) data).b.Db());
        } else if (data instanceof ClipGridParams.Data.ClipCompilation) {
            appendPath = appendPath2.appendPath("compilation").appendPath(String.valueOf(((ClipGridParams.Data.ClipCompilation) data).b.b));
        } else if (data instanceof ClipGridParams.Data.Music) {
            Uri.Builder appendPath3 = appendPath2.appendPath("music");
            StringBuilder sb = new StringBuilder();
            ClipGridParams.Data.Music music = (ClipGridParams.Data.Music) data;
            sb.append(music.b.c);
            sb.append('_');
            sb.append(music.b.b);
            appendPath = appendPath3.appendPath(sb.toString());
        } else if (z) {
            ClipsAuthor clipsAuthor = ((ClipGridParams.Data.Profile) data).b;
            String str2 = clipsAuthor.e;
            if (str2 == null) {
                str2 = String.valueOf(clipsAuthor.b.b.b);
            }
            appendPath = appendPath2.appendPath(String.valueOf(str2));
        } else {
            if (!(data instanceof ClipGridParams.Data.GeoPlace)) {
                throw new NoWhenBranchMatchedException();
            }
            appendPath = appendPath2.appendPath("place").appendPath(String.valueOf(((ClipGridParams.Data.GeoPlace) data).b.c));
        }
        return appendPath.build().toString();
    }
}
