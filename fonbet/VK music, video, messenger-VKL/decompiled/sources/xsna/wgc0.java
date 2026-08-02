package xsna;

import com.vk.newsfeed.posting.impl.domain.model.e;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import xsna.efc0;

/* compiled from: PostingLinksParserFeatureDelegate.kt */
/* loaded from: classes4.dex */
public final class wgc0 {
    public final efc0.a a;
    public final io.reactivex.rxjava3.subjects.f<fmc0> b;

    public wgc0(efc0.a aVar) {
        this.a = aVar;
        io.reactivex.rxjava3.subjects.f<fmc0> fVar = new io.reactivex.rxjava3.subjects.f<>();
        this.b = fVar;
        aVar.a.e.b(fVar.y(500L, TimeUnit.MILLISECONDS).subscribe(new a960(new b810(this, 18), 11)));
    }

    public final void a(int i, ArrayList arrayList, ArrayList arrayList2) {
        if (arrayList.size() < i) {
            int size = arrayList2.size();
            int size2 = i - arrayList.size();
            if (size > size2) {
                size = size2;
            }
            for (int i2 = 0; i2 < size; i2++) {
                this.a.a(new e.b.h.a((ParsedAttachment) arrayList2.get(i2)));
            }
        }
    }
}
