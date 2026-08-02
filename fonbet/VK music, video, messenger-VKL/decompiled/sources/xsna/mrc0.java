package xsna;

import com.vk.api.base.VkPaginationList;
import com.vk.dto.stories.model.StoryBackground;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import java.io.ByteArrayInputStream;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import xsna.h8z0;
import xsna.ocz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class mrc0 implements ptk0, a0i, io.reactivex.rxjava3.core.d, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, h8z0.b {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mrc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.h8z0.b
    public void a() {
        qiy0 qiy0Var = (qiy0) this.c;
        if (qiy0Var.a) {
            return;
        }
        qiy0Var.a = true;
        Iterator it = qiy0Var.b.keySet().iterator();
        while (it.hasNext()) {
            qiy0Var.a((ocz0.a) it.next());
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 4:
                return (StoryBackground) ((pb00) this.c).invoke(obj);
            case 5:
                return (List) ((odg) this.c).invoke(obj);
            case 6:
                return (VkPaginationList) ((e420) this.c).invoke(obj);
            case 7:
                return (List) ((qjm0) this.c).invoke(obj);
            case 8:
            case 9:
            case 11:
            case 12:
            default:
                return (Boolean) ((zzs0) this.c).invoke(obj);
            case 10:
                return (ByteArrayInputStream) ((e420) this.c).invoke(obj);
            case 13:
                return (xiw0) ((qjm0) this.c).invoke(obj);
        }
    }

    @Override // xsna.a0i
    public void c(zzh zzhVar) {
        m2g0 m2g0Var = (m2g0) this.c;
        t2g0 a = a3g0.a((mxh) zzhVar);
        if (a != null) {
            m2g0Var.a(a);
        }
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        switch (this.b) {
            case 3:
                StereoRoomManagerAdaptersKt.acceptPromotion$lambda$0((StereoRoomManager) this.c, bVar);
                return;
            default:
                ((dtz) this.c).getClass();
                throw null;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return ((Boolean) ((q8i0) this.c).invoke(obj)).booleanValue();
    }

    public /* synthetic */ mrc0(dtz dtzVar, smm0 smm0Var) {
        this.b = 8;
        this.c = dtzVar;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        erc0 erc0Var = ((PostponedPostsFragment) this.c).T;
        s3q0 s3q0Var = s3q0.a;
        erc0Var.b.r(s3q0Var, (htc0) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (Boolean) ((md8) this.c).invoke(obj, obj2);
    }
}
