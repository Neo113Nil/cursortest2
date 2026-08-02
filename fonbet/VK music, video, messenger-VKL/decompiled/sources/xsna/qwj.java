package xsna;

import com.vk.dto.photo.Photo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Result;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class qwj implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Serializable d;
    public final /* synthetic */ Serializable e;

    public /* synthetic */ qwj(Object obj, Serializable serializable, Serializable serializable2, int i) {
        this.b = i;
        this.c = obj;
        this.d = serializable;
        this.e = serializable2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        Object obj;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar;
        com.vk.newsfeed.posting.market_picker.presentation.base.view.h hVar;
        switch (this.b) {
            case 0:
                ((swj) this.c).b.o(o25.a().c(), (String) this.d, (String) this.e);
                break;
            default:
                com.vk.newsfeed.posting.market_picker.presentation.base.view.f fVar = (com.vk.newsfeed.posting.market_picker.presentation.base.view.f) this.c;
                LinkedHashSet<Photo> linkedHashSet = (LinkedHashSet) this.d;
                ArrayList arrayList = (ArrayList) this.e;
                com.vk.core.view.components.spinner.c cVar = fVar.k;
                if (cVar != null) {
                    cVar.dismiss();
                }
                fVar.k = null;
                for (Photo photo : linkedHashSet) {
                    com.vk.newsfeed.posting.market_picker.presentation.base.view.e eVar2 = fVar.t;
                    if (eVar2 != null && (hVar = eVar2.l) != null) {
                        hVar.c(photo, fVar.e(photo), com.vk.newsfeed.posting.market_picker.presentation.base.view.f.g(photo));
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (((Result) obj).d() instanceof Result.Failure) {
                        }
                    } else {
                        obj = null;
                    }
                }
                Result result = (Result) obj;
                Throwable a = result != null ? Result.a(result.d()) : null;
                fVar.k(a);
                if (a == null && (eVar = fVar.t) != null) {
                    com.vk.newsfeed.posting.market_picker.presentation.base.view.e.c(eVar);
                    break;
                }
                break;
        }
    }
}
