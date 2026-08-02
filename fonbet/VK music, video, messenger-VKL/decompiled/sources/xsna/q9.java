package xsna;

import com.vk.api.generated.groups.dto.GroupsGroupFullDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.ecomm.market.good.GoodFragment;
import com.vk.libvideo.bottomsheet.about.delegate.o;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.photogallery.LocalGalleryProvider;
import java.util.HashSet;
import java.util.List;
import xsna.bfx;
import xsna.cxl;
import xsna.i0p;
import xsna.tq70;
import xsna.wwf;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class q9 implements io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.l, wwf.b, tq70.b, io.reactivex.rxjava3.functions.g, io.reactivex.rxjava3.functions.m, ptk0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q9(com.vk.music.fragment.impl.model.a aVar, Throwable th) {
        this.b = 8;
        this.c = th;
    }

    @Override // xsna.ptk0
    public void a(lm50 lm50Var) {
        wic wicVar = ((NewsfeedSearchFragment) this.c).Z;
        s3q0 s3q0Var = s3q0.a;
        ((ul50) wicVar.c).r(s3q0Var, (wy60) lm50Var);
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((p9) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        List reloadFromMediaStore$lambda$22;
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (o.a) ((cj1) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((wd3) obj2).invoke(obj);
            case 3:
                return (List) ((zj) obj2).invoke(obj);
            case 4:
                return (String) ((cj1) obj2).invoke(obj);
            case 5:
            case 8:
            case 9:
            case 13:
            case 16:
            case 24:
            default:
                int i2 = ProfileFriendsFragment.k0;
                return (String) ((ehu) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((cj1) obj2).invoke(obj);
            case 7:
                return (j8n) ((cj1) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((arf) obj2).invoke(obj);
            case 11:
                return (HashSet) ((dh5) obj2).invoke(obj);
            case 12:
                return (Boolean) ((cj1) obj2).invoke(obj);
            case 14:
                return (GroupsGroupFullDto) ((cj1) obj2).invoke(obj);
            case 15:
                return (it80) ((ehu) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.b0) ((arf) obj2).invoke(obj);
            case 18:
                return (bfx.a) ((arf) obj2).invoke(obj);
            case 19:
                reloadFromMediaStore$lambda$22 = LocalGalleryProvider.reloadFromMediaStore$lambda$22((arf) obj2, obj);
                return reloadFromMediaStore$lambda$22;
            case 20:
                return (ei00) ((ehu) obj2).invoke(obj);
            case 21:
                return (io.reactivex.rxjava3.core.t) ((nt10) obj2).invoke(obj);
            case 22:
                return (hda) ((xkb) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.b0) ((zgb) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.e) ((wd3) obj2).invoke(obj);
            case 26:
                return (lna0) ((c4r) obj2).invoke(obj);
            case 27:
                return (io.reactivex.rxjava3.core.b0) ((com.vk.newsfeed.impl.presenters.a) obj2).invoke(obj);
            case 28:
                return (io.reactivex.rxjava3.core.t) ((wd3) obj2).invoke(obj);
        }
    }

    @Override // xsna.wwf.b
    public void b(twf twfVar) {
        ((exl) this.c).a.invoke(new cxl.e(((lwl) twfVar).c));
    }

    public com.vk.im.engine.models.c c() {
        return ((a1w) this.c).r().h;
    }

    @Override // io.reactivex.rxjava3.functions.g
    public Object d(Object obj, Object obj2, Object obj3) {
        return (bpd) ((hx9) this.c).invoke(obj, obj2, obj3);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        cj1 cj1Var = (cj1) this.c;
        qcy<Object>[] qcyVarArr = GoodFragment.U0;
        return ((Boolean) cj1Var.invoke(obj)).booleanValue();
    }

    public /* synthetic */ q9(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((i0p.a) obj).a((VKApiExecutionException) ((Throwable) this.c));
    }
}
