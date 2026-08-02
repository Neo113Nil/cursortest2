package xsna;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import com.vk.dto.ads.PixelStats;
import com.vk.httpexecutor.api.NetworkClient;
import com.vk.media.MediaUtils;
import com.vk.toggle.b;
import com.vk.toggle.internal.ToggleManager;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.mqa0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class kqa0 implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ kqa0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.b) {
            case 0:
                mqa0 mqa0Var = (mqa0) this.c;
                PixelStats pixelStats = (PixelStats) this.d;
                if (((NetworkClient) mqa0Var.b.getValue()).a(pixelStats.b) != null) {
                    return pixelStats;
                }
                throw new mqa0.a();
            case 1:
                b.c cVar = (b.c) this.c;
                d0r0 d0r0Var = (d0r0) this.d;
                List<b.d> list = cVar.b;
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (true) {
                    boolean z = false;
                    if (!it.hasNext()) {
                        ArrayList arrayList2 = new ArrayList();
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            b.d dVar = (b.d) it2.next();
                            ToggleManager toggleManager = d0r0Var.a;
                            String obj = dVar.b.toString();
                            ToggleManager.a aVar = ToggleManager.z;
                            b.d j = toggleManager.j(obj, false);
                            if (j != null) {
                                arrayList2.add(j);
                            }
                        }
                        return arrayList2;
                    }
                    Object next = it.next();
                    String obj2 = ((b.d) next).b.toString();
                    d0r0Var.getClass();
                    try {
                        Pair pair = new Pair(d0r0Var.a.h.b(obj2, false), d0r0Var.a.h.b(obj2, true));
                        b.d dVar2 = (b.d) pair.d();
                        b.d dVar3 = (b.d) pair.g();
                        if (dVar2 != null && dVar3 != null) {
                            z = d0r0.b(dVar2, dVar3);
                        }
                    } catch (Exception unused) {
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                break;
            default:
                qis0 qis0Var = (qis0) this.c;
                String str = (String) this.d;
                MediaUtils.d dVar4 = new MediaUtils.d(e3m.a(R.dimen.filter_picker_item_width, qis0Var.h.getContext()), e3m.a(R.dimen.filter_picker_item_height, qis0Var.h.getContext()));
                Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                z310 z310Var = new z310(0L, ref$ObjectRef, dVar4, 1);
                MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                try {
                    mediaMetadataRetriever.setDataSource(str);
                    z310Var.invoke(mediaMetadataRetriever);
                } catch (Exception unused2) {
                } catch (Throwable th) {
                    mediaMetadataRetriever.release();
                    throw th;
                }
                mediaMetadataRetriever.release();
                Bitmap bitmap = (Bitmap) ref$ObjectRef.element;
                if (bitmap != null) {
                    return bitmap;
                }
                throw new IllegalStateException("could not extract preview bitmap from video fragment ".concat(str));
        }
    }
}
