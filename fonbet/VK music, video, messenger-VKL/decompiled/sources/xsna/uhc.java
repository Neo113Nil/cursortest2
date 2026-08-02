package xsna;

import com.vk.cachecontrol.api.CacheTarget;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.paging.PaginationKey;
import com.vk.newsfeed.impl.requests.WallGetMain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import ru.ok.android.externcalls.sdk.id.InternalIdsResolver;
import ru.ok.android.externcalls.sdk.id.mapping.MappingContext;
import xsna.f0r;
import xsna.qvq;
import xsna.s4r;
import xsna.ubx;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class uhc implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uhc(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Set lambda$resolveIdsAndGetFailed$0;
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                vhc vhcVar = (vhc) obj2;
                List<? extends CacheTarget> list = (List) obj;
                List<CacheTarget> list2 = vhcVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list2) {
                    if (!list.contains((CacheTarget) obj3)) {
                        arrayList.add(obj3);
                    }
                }
                vhcVar.b.invoke(list);
                if (!fxc0.B().J().Z0()) {
                    return arrayList;
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    if (((CacheTarget) next) != CacheTarget.DOWNLOADED_VIDEOS) {
                        arrayList2.add(next);
                    }
                }
                return arrayList2;
            case 1:
                f0r.v vVar = (f0r.v) obj2;
                wk50.a aVar = (wk50.a) obj;
                SdkVideoFile sdkVideoFile = vVar.b.b;
                vVar.i(aVar, Collections.singletonList(myc.d(vVar.d, sdkVideoFile, null, 6)), new f0r.m(PaginationKey.LoadedFull.b, PaginationKey.Initial.b), s4r.a.a, ubx.b.a, null, null);
                aVar.a(new qvq.q(sdkVideoFile));
                return s3q0.a;
            case 2:
                lambda$resolveIdsAndGetFailed$0 = ((InternalIdsResolver) obj2).lambda$resolveIdsAndGetFailed$0((MappingContext) obj);
                return lambda$resolveIdsAndGetFailed$0;
            default:
                return ((WallGetMain) obj2).a((JSONObject) obj);
        }
    }
}
