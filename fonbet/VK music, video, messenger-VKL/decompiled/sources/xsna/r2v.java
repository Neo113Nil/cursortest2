package xsna;

import com.vk.api.generated.users.dto.UsersUserFullDto;
import com.vk.core.tips.Tooltip;
import com.vk.friends.discover.UsersDiscoverPresenter;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.superapp.pip.impl.overlay.MiniAppPiPOverlayService;
import com.vk.video.ui.discovery.catalog.VideoDiscoveryCatalogRepository$Section;
import java.util.List;
import kotlin.Pair;
import xsna.bzp0;
import xsna.ngl;
import xsna.nh60;
import xsna.s8z0;
import xsna.xex0;
import xsna.zrz;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class r2v implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, Tooltip.c, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.h, ngl.a, s8z0.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ r2v(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                return (zrz.a) ((bbw) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((bbw) obj2).invoke(obj);
            case 5:
                Long l = MiniAppPiPOverlayService.f;
                return (Boolean) ((bbw) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.e) ((xxh) obj2).invoke(obj);
            case 7:
            case 8:
            case 9:
            case 11:
            case 17:
            case 21:
            case 23:
            case 24:
            case 25:
            case 26:
            default:
                return (ke3) ((xex0.c) obj2).invoke(obj);
            case 10:
                return (io.reactivex.rxjava3.core.b0) ((isg) obj2).invoke(obj);
            case 12:
                return (ncq0) ((zos) obj2).invoke(obj);
            case 13:
                return (io.reactivex.rxjava3.core.t) ((o6e0) obj2).invoke(obj);
            case 14:
                return (Pair) ((bbw) obj2).invoke(obj);
            case 15:
                return (io.reactivex.rxjava3.core.t) ((n7b0) obj2).invoke(obj);
            case 16:
                return (io.reactivex.rxjava3.core.e) ((ogm0) obj2).invoke(obj);
            case 18:
                return (List) ((epj0) obj2).invoke(obj);
            case 19:
                return (UsersDiscoverPresenter.a) ((epj0) obj2).invoke(obj);
            case 20:
                return (VideoDiscoveryCatalogRepository$Section) ((ufs0) obj2).invoke(obj);
            case 22:
                return (UsersUserFullDto) ((xep0) obj2).invoke(obj);
            case 27:
                return (Boolean) ((epj0) obj2).invoke(obj);
        }
    }

    @Override // com.vk.core.tips.Tooltip.c
    public void c(int i) {
        ((wmd0) this.c).invoke();
    }

    @Override // xsna.ngl.a
    public void e(bzp0.c cVar) {
        ((com.vk.auth.ui.password.askpassword.a) this.c).b.hh(cVar.a);
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (nh60.a) ((ani) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // xsna.s8z0.a
    public void i(z9z0 z9z0Var) {
        ((acz0) this.c).i = z9z0Var;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 1:
                return ((Boolean) ((x96) this.c).invoke(obj)).booleanValue();
            case 7:
                return ((Boolean) ((zos) this.c).invoke(obj)).booleanValue();
            case 17:
                return ((Boolean) ((c3k0) this.c).invoke(obj)).booleanValue();
            case 21:
                return ((Boolean) ((sys0) this.c).invoke(obj)).booleanValue();
            case 23:
                return ((Boolean) ((epj0) this.c).invoke(obj)).booleanValue();
            case 25:
                return ((Boolean) ((epj0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((wjw0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                return (kqs) ((ncb) obj3).invoke(obj, obj2);
            case 8:
                return (List) ((j89) obj3).invoke((List) obj, obj2);
            default:
                int i2 = PollResultsFragment.b0;
                return (io.reactivex.rxjava3.core.q) ((jkg) obj3).invoke(obj, obj2);
        }
    }
}
