package xsna;

import com.vk.dto.shortvideo.ClipGridParams;

/* compiled from: ClipsGridBannerDataSource.kt */
/* loaded from: classes17.dex */
public final class jae {
    public final pkd a;
    public final lec b;
    public final ojd c;

    public jae(pkd pkdVar, lec lecVar, ojd ojdVar) {
        this.a = pkdVar;
        this.b = lecVar;
        this.c = ojdVar;
    }

    public final boolean a(ClipGridParams.Data data) {
        ClipGridParams.Data.Hashtag hashtag = data instanceof ClipGridParams.Data.Hashtag ? (ClipGridParams.Data.Hashtag) data : null;
        String str = hashtag != null ? hashtag.b : null;
        pkd pkdVar = this.a;
        return str == null ? !pkdVar.e().e().d() : pkdVar.e().e().c(str).h();
    }
}
