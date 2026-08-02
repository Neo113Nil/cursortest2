package xsna;

import com.vk.dto.stickers.StickerPackPreviewModel;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;

/* compiled from: StickersRecommendationsRepositoryImpl.kt */
/* loaded from: classes5.dex */
public final class bcl0 {
    public final etj a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public Object c = EmptyList.b;

    public bcl0(etj etjVar) {
        this.a = etjVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.List<com.vk.dto.stickers.StickerPackPreviewModel>] */
    public final List<StickerPackPreviewModel> a() {
        return this.c;
    }

    public final void b(List<Integer> list, List<StickerPackPreviewModel> list2) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (list.contains(Integer.valueOf(((StickerPackPreviewModel) obj).e()))) {
                arrayList.add(obj);
            }
        }
        synchronized (this.c) {
            this.c = arrayList;
            s3q0 s3q0Var = s3q0.a;
        }
    }
}
