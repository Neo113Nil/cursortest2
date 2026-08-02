package xsna;

import android.os.Bundle;
import com.vk.common.links.LinksParserData;
import com.vk.dto.user.ObsceneTextFilter;
import kotlin.Lazy;

/* compiled from: ClipsCommentsFormatterImpl.kt */
/* loaded from: classes17.dex */
public final class rnd implements qnd {
    public final Object a;
    public final Object b;

    public rnd(Lazy<? extends qdz> lazy, Lazy<? extends b25> lazy2) {
        this.a = lazy;
        this.b = lazy2;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.qnd
    public final CharSequence a(String str) {
        return ((qdz) this.a.getValue()).a().d(str, new LinksParserData(0, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) null, 0, (taz) null, ((b25) this.b.getValue()).i().U == ObsceneTextFilter.ENABLED, 8191));
    }
}
