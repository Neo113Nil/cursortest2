package defpackage;

import android.view.ViewGroup;
import com.yandex.mapkit.map.Map;
import java.util.HashMap;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.banners.c;
import ru.yandex.taxi.banners.presentation.fullscreen.a;
import ru.yandex.taxi.multiexit.MultiexitModalView;
import ru.yandex.taxi.order.OrderFragment;
import ru.yandex.taxi.search.address.view.NoInternetConnectionModalView;
import ru.yandex.taxi.search.address.view.h;
import ru.yandex.taxi.search.view.AddressSearchModalView;
import ru.yandex.taxi.stories.presentation.story.g;
import ru.yandex.taxi.superapp.chat.view.SuperAppChatView;
import ru.yandex.taxi.widget.ModalView;
import ru.yandex.taxi.zalogin.k;

/* loaded from: classes14.dex */
public final class ou4 extends s45 {
    public final /* synthetic */ int a;
    public Object b;
    public final /* synthetic */ Object c;

    public ou4(apf apfVar, s45 s45Var) {
        this.a = 3;
        this.c = apfVar;
        this.b = s45Var;
    }

    private final void e(int i) {
    }

    private final void f(int i) {
    }

    private final void g(int i) {
    }

    private final void h(int i) {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    @Override // defpackage.s45
    public final void a(int i) {
        int i2 = this.a;
        Object obj = this.c;
        switch (i2) {
            case 0:
                xg.b(((c) this.b).A, (ViewGroup) obj, null, 6);
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((s45) this.b).a(i);
                break;
            case 4:
                a aVar = (a) this.b;
                ((ViewGroup) obj).setBackgroundColor(((avj0) aVar.o).a(mqg0.black_alpha50));
                ((eis) aVar.a).pausePlayback();
                break;
            case 5:
                r0 r0Var = ((k) this.b).j;
                Boolean bool = Boolean.TRUE;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
            case 6:
                uq40 uq40Var = (uq40) this.b;
                MultiexitModalView multiexitModalView = uq40Var.I;
                if (multiexitModalView != null) {
                    qq40 qq40Var = (qq40) obj;
                    a3v a3vVar = uq40Var.g;
                    float contentHeight = multiexitModalView.getContentHeight() - multiexitModalView.getTranslationY();
                    if (contentHeight < 0.0f) {
                        contentHeight = 0.0f;
                    }
                    a3vVar.Td((int) contentHeight, MultiexitModalView.class);
                    qq40Var.run();
                    break;
                }
                break;
            case 7:
                ((h) this.b).F.Td(((NoInternetConnectionModalView) obj).getContentHeight(), NoInternetConnectionModalView.class);
                break;
            case 8:
            case 9:
                break;
            case 10:
                g gVar = (g) this.b;
                ((ViewGroup) obj).setBackgroundColor(((avj0) gVar.o).a(mqg0.black_alpha50));
                ((gpu0) gVar.a).pausePlayback();
                break;
            case 11:
                ((SuperAppChatView) this.b).requestFocus();
                break;
            default:
                zyx0 zyx0Var = (zyx0) ((jhu0) this.b).a;
                ah00 ah00Var = zyx0Var.D;
                if (ah00Var != null) {
                    gh00 gh00Var = (gh00) ah00Var;
                    Map map = gh00Var.b;
                    if (map != null) {
                        map.setScrollGesturesEnabled(false);
                    }
                    Map map2 = gh00Var.b;
                    if (map2 != null) {
                        map2.setZoomGesturesEnabled(false);
                    }
                }
                zyx0Var.r(new bkx0(18));
                break;
        }
    }

    @Override // defpackage.s45
    public final void b() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                c cVar = (c) this.b;
                cVar.g.run();
                cVar.A.c((ViewGroup) obj);
                break;
            case 1:
            case 2:
                break;
            case 3:
                ((s45) this.b).b();
                break;
            case 4:
                a aVar = (a) this.b;
                ((ViewGroup) obj).setBackgroundColor(((avj0) aVar.o).a(mqg0.transparent));
                ((eis) aVar.a).resumePlayback();
                break;
            case 5:
                ((Runnable) obj).run();
                r0 r0Var = ((k) this.b).j;
                Boolean bool = Boolean.FALSE;
                r0Var.getClass();
                r0Var.m(null, bool);
                break;
            case 6:
            case 7:
            case 8:
            case 9:
                break;
            case 10:
                g gVar = (g) this.b;
                ((ViewGroup) obj).setBackgroundColor(((avj0) gVar.o).a(mqg0.transparent));
                ((gpu0) gVar.a).resumePlayback();
                break;
            case 11:
                break;
            default:
                ((izx0) obj).d = null;
                zyx0 zyx0Var = (zyx0) ((jhu0) this.b).a;
                ah00 ah00Var = zyx0Var.D;
                if (ah00Var != null) {
                    gh00 gh00Var = (gh00) ah00Var;
                    Map map = gh00Var.b;
                    if (map != null) {
                        map.setScrollGesturesEnabled(true);
                    }
                    Map map2 = gh00Var.b;
                    if (map2 != null) {
                        map2.setZoomGesturesEnabled(true);
                    }
                }
                zyx0Var.r(new bkx0(19));
                break;
        }
    }

    @Override // defpackage.s45
    public void c() {
        ModalView modalView;
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 1:
                l30 l30Var = (l30) this.b;
                if (l30Var != null) {
                    l30Var.cancel();
                    break;
                }
                break;
            case 2:
                l30 l30Var2 = (l30) this.b;
                if (l30Var2 != null) {
                    l30Var2.cancel();
                    break;
                }
                break;
            case 3:
                ((s45) this.b).c();
                ((apf) obj).f();
                break;
            case 8:
                AddressSearchModalView addressSearchModalView = (AddressSearchModalView) this.b;
                OrderFragment orderFragment = (OrderFragment) obj;
                modalView = orderFragment.suggestedDestinationsModalView;
                if (addressSearchModalView == modalView) {
                    orderFragment.suggestedDestinationsModalView = null;
                    break;
                }
                break;
            case 11:
                ((Runnable) obj).run();
                break;
        }
    }

    @Override // defpackage.s45
    public void d() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 1:
                ljz ljzVar = (ljz) ((q4g) obj).w;
                this.b = ljzVar.a.c(new ydf(1));
                break;
            case 2:
                ljz ljzVar2 = (ljz) ((k1a) obj).J;
                this.b = ljzVar2.a.c(new ydf(1));
                break;
            case 3:
                ((s45) this.b).d();
                break;
            case 9:
                String str = (String) obj;
                zow0 zow0Var = ((vpw0) ((bkv) this.b).J).c;
                zow0Var.getClass();
                HashMap hashMap = new HashMap();
                if (str != null) {
                    hashMap.put("selection_key", str);
                }
                zow0Var.a.a("SurgeCard.Selector.Modal.Shown", hashMap, 1, new HashMap());
                break;
        }
    }

    public /* synthetic */ ou4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ ou4(ViewGroup viewGroup, hz4 hz4Var, int i) {
        this.a = i;
        this.c = viewGroup;
        this.b = hz4Var;
    }

    public /* synthetic */ ou4(int i, Object obj) {
        this.a = i;
        this.c = obj;
    }
}
