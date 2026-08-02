package xsna;

import com.vk.vmoji.character.model.VmojiStickerPackPreviewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.abw0;
import xsna.sf90;
import xsna.waw0;

/* compiled from: VmojiRecommendationsReducer.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class uaw0 extends FunctionReferenceImpl implements izs<waw0.a, abw0.b> {
    @Override // xsna.izs
    public final abw0.b invoke(waw0.a aVar) {
        waw0.a aVar2 = aVar;
        ((saw0) this.receiver).getClass();
        ArrayList arrayList = new ArrayList();
        List<VmojiStickerPackPreviewModel> list = aVar2.d;
        ArrayList arrayList2 = new ArrayList(c5g.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(new o6w0((VmojiStickerPackPreviewModel) it.next()));
        }
        arrayList.addAll(arrayList2);
        sf90 sf90Var = aVar2.f;
        if (!(sf90Var instanceof sf90.b)) {
            if (sf90Var instanceof sf90.c) {
                arrayList.add(u990.b);
            } else {
                if (!(sf90Var instanceof sf90.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                arrayList.add(new n990(((sf90.a) sf90Var).b));
            }
        }
        return new abw0.b(aVar2.b, aVar2.c, arrayList, aVar2.e instanceof waw0.a.AbstractC3923a.b);
    }
}
