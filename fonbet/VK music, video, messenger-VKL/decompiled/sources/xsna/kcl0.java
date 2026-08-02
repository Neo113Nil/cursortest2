package xsna;

import android.util.LruCache;
import com.vk.dto.stickers.PromoColor;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.StickerRender;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.stickers.StickerStockItemWithStickerId;
import com.vk.dto.stickers.StickerSuggestion;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.dto.stickers.StickersDictionaryItemLight;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.dto.stickers.VmojiConstructorOpenParamsModel;
import com.vk.repository.internal.repos.stickers.suggests.VmojiPromoInSuggestsRepositoryImpl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: StickersRepository.kt */
/* loaded from: classes5.dex */
public interface kcl0 extends xic {

    /* compiled from: StickersRepository.kt */
    public interface a {
        io.reactivex.rxjava3.internal.operators.single.y a(boolean z);

        io.reactivex.rxjava3.internal.operators.single.f0 b();

        io.reactivex.rxjava3.internal.operators.single.y c(boolean z);
    }

    /* compiled from: StickersRepository.kt */
    public interface b {
        List<StickerStockItemWithStickerId> a(int i);

        io.reactivex.rxjava3.internal.operators.observable.b0 b(int i, String str);

        String c(int i);

        void d(int i);
    }

    /* compiled from: StickersRepository.kt */
    public interface c {
        Map<String, StickersDictionaryItemLight> a();

        ArrayList b(String str);

        StickersDictionaryItem c(StickersDictionaryItemLight stickersDictionaryItemLight);
    }

    /* compiled from: StickersRepository.kt */
    public interface d {
        io.reactivex.rxjava3.internal.operators.single.f0 a(long j);

        List<ewp0> b(long j);

        boolean c(long j);

        io.reactivex.rxjava3.internal.operators.single.y d(long j);
    }

    /* compiled from: StickersRepository.kt */
    public interface e {
        List<StickerSuggestion> a(int i);

        io.reactivex.rxjava3.internal.operators.observable.b0 b(int i);

        void c(int i, String str);

        void d(int i);

        void e(int i, String str);
    }

    void A();

    boolean A0();

    r6e0 B();

    io.reactivex.rxjava3.internal.operators.single.f0 B0();

    p5n0 D0();

    void E(int i);

    StickerItem E0(int i, int i2);

    ArrayList F();

    boolean F0(StickerStockItem stickerStockItem);

    io.reactivex.rxjava3.core.q<List<StickerItem>> G();

    StickerStockItem H(int i);

    void H0(int i, d4r d4rVar);

    StickerStockItem I(int i);

    myb0 I0();

    LruCache<String, StickerRender> J();

    void K();

    boolean K0();

    VmojiPromoInSuggestsRepositoryImpl M0();

    int N();

    xi30 O();

    int O0();

    void P0();

    void Q();

    StickerStockItem Q0(StickerStockItem stickerStockItem);

    ArrayList R();

    void R0(boolean z);

    boolean T0(StickerStockItem stickerStockItem);

    ArrayList U();

    void U0();

    void V(boolean z);

    StickerStockItem V0(StickerStockItem stickerStockItem, boolean z, wzs<? super StickerStockItem, ? super StickerStockItem, s3q0> wzsVar);

    boolean W();

    boolean W0(int i);

    bcl0 X0();

    void Y(long j);

    boolean Y0();

    void Z(StickerStockItem stickerStockItem);

    void Z0();

    void a0(StickerItem stickerItem);

    void c();

    List<StickerItem> c0();

    boolean d();

    long d0();

    void e0(boolean z);

    void f(long j);

    CopyOnWriteArrayList f0();

    boolean g(int i);

    void h();

    List<StickerItem> i();

    List<StickerStockItem> i0();

    boolean j(StickerStockItem stickerStockItem);

    PromoColor j0();

    void k(StickerStockItem stickerStockItem);

    hwp0 k0();

    void m0(boolean z);

    void n(boolean z);

    void n0(StickerItem stickerItem);

    s6n0 o();

    void o0(long j);

    VmojiAvatarModel p();

    boolean p0(StickerStockItem stickerStockItem);

    boolean q();

    boolean q0();

    tux0 r();

    void s(StickerStockItem stickerStockItem, izs<? super StickerStockItem, s3q0> izsVar);

    int s0();

    void t(int i);

    void v(long j, boolean z);

    boolean v0();

    boolean w0();

    StickerStockItem x(int i);

    io.reactivex.rxjava3.core.q<List<StickerItem>> x0();

    VmojiConstructorOpenParamsModel y();

    void y0(StickerItem stickerItem);

    void z(int i, int i2);

    String z0(n1l0 n1l0Var, int i, boolean z);
}
