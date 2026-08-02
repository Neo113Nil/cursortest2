package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Drawable;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import coil3.graphics.C0141a;
import coil3.size.Precision;
import coil3.size.Scale;
import com.yandex.delivery.mapper.model.CardsRevealing;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.rida.bids.controller.BidsControllerAction;
import com.yandex.go.rida.bids.interactor.a;
import com.yandex.mobile.drive.view.AlertView;
import defpackage.kev;
import defpackage.lev;
import defpackage.lg70;
import defpackage.m810;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.sb2;
import defpackage.uh;
import defpackage.xi91;
import defpackage.xis0;
import defpackage.y5e;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.Ref$ObjectRef;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;
import ru.yandex.taxi.address.design.AddressInputView;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.fragment.preorder.AddressMapFragment;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.accent_button.c;
import ru.yandex.taxi.search.view.AddressSearchView;

/* loaded from: classes5.dex */
public final /* synthetic */ class j0 implements sls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j0(vp1 vp1Var, tls tlsVar) {
        this.a = 22;
        this.c = vp1Var;
        this.b = tlsVar;
    }

    /* JADX WARN: Type inference failed for: r1v42, types: [T, java.lang.Object] */
    @Override // defpackage.sls
    public final Object invoke() {
        zy11 lambda$0$3;
        zy11 moveToPoint$lambda$0;
        zy11 onNewCurrentUserLocation$lambda$0;
        tpr createSuggestMenuPayload$lambda$3;
        zy11 dismiss$lambda$13;
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        zy11 zy11Var = zy11.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((tls) obj2).invoke((f7v0) obj);
                return zy11Var;
            case 1:
                ((tls) obj2).invoke(new c6(((mn0) obj).b));
                return zy11Var;
            case 2:
                lb lbVar = ((c) obj2).b;
                ob obVar = (ob) ((n351) obj);
                qa91 qa91Var = obVar.i;
                String str = obVar.j;
                lbVar.getClass();
                if (str != null) {
                    lbVar.c.x(str.concat(".Tapped"), null);
                }
                if (qa91Var instanceof tpi) {
                    lbVar.a.a(new p470(((tpi) qa91Var).b));
                } else if (qa91Var instanceof vpi) {
                    lbVar.b.e(((vpi) qa91Var).b);
                } else if (!(qa91Var instanceof upi) && !(qa91Var instanceof wpi)) {
                    w511.b();
                    return null;
                }
                return zy11Var;
            case 3:
                ((a) obj2).a.b((String) obj, BidsControllerAction.OnAcceptRequested);
                return zy11Var;
            case 4:
                com.yandex.go.shortcuts.impl.view.adapter.a aVar = (com.yandex.go.shortcuts.impl.view.adapter.a) obj2;
                ImageView imageView = aVar.m0;
                ca5 ca5Var = ((bv) obj).b.c.e;
                if (ca5Var != null) {
                    String str2 = ca5Var.a;
                    x1s0 x1s0Var = aVar.l0;
                    if (!x1s0Var.a.a.contains(str2) && qv10.d("ru.yandex.taxi.shortcuts.preferences.ShortcutsAnimationsPreferences.pref_show_count", str2, x1s0Var.b.a, 0) < ca5Var.b) {
                        if (gv.b[ca5Var.f.ordinal()] == 1) {
                            aVar.f0.updateAnimation(new xf2(ca5Var.a, ((imageView.getRight() - imageView.getLeft()) * ca5Var.g) + imageView.getLeft(), imageView.getTop() - ((imageView.getTop() - imageView.getBottom()) * ca5Var.h), s8o.m(ca5Var.c, imageView.getContext()), ca5Var.d, ca5Var.e, ca5Var.i, ca5Var.j), new j0(5, aVar, ca5Var));
                        }
                    }
                }
                return zy11Var;
            case 5:
                ca5 ca5Var2 = (ca5) obj;
                x1s0 x1s0Var2 = ((com.yandex.go.shortcuts.impl.view.adapter.a) obj2).l0;
                x1s0Var2.a.a.add(ca5Var2.a);
                w1s0 w1s0Var = x1s0Var2.b;
                String str3 = ca5Var2.a;
                w1s0Var.a.p(w1s0Var.a.i("ru.yandex.taxi.shortcuts.preferences.ShortcutsAnimationsPreferences.pref_show_count" + str3, 0) + 1, g8e.o("ru.yandex.taxi.shortcuts.preferences.ShortcutsAnimationsPreferences.pref_show_count", str3));
                return zy11Var;
            case 6:
                ((lw) ((g191) obj2).a).a((hhg) obj);
                return zy11Var;
            case 7:
                return new o6p((vfr) obj2, (yfr) obj, i2);
            case 8:
                return new com.yandex.payment.sdk.flex.impl.actions.a((vfr) obj2, (k5c) obj);
            case 9:
                return String.format("Fail to update '%s' with '%s' value", Arrays.copyOf(new Object[]{((a20) obj2).a(), obj}, 2));
            case 10:
                ((tls) obj2).invoke(((l5f) obj).getId());
                return zy11Var;
            case 11:
                ((tls) obj2).invoke(new ih0(((nh0) obj).b));
                return zy11Var;
            case 12:
                lambda$0$3 = AddressInputView.lambda$0$3((AddressInputView) obj2, (ww0) obj);
                return lambda$0$3;
            case 13:
                moveToPoint$lambda$0 = AddressMapFragment.moveToPoint$lambda$0((AddressMapFragment) obj2, (String) obj);
                return moveToPoint$lambda$0;
            case 14:
                onNewCurrentUserLocation$lambda$0 = AddressMapFragment.onNewCurrentUserLocation$lambda$0((AddressMapFragment) obj2, (zzs) obj);
                return onNewCurrentUserLocation$lambda$0;
            case 15:
                xx0 xx0Var = (xx0) obj2;
                xx0Var.k = null;
                zzs B = ((oce0) obj).f.B();
                xx0Var.g.b(AddressResolveRepository.State.LOADED);
                ddf ddfVar = (ddf) xx0Var.j;
                ((AddressMapFragment) ddfVar.b).requestFocusRect();
                dy0 dy0Var = xx0Var.c;
                wx0 wx0Var = new wx0(xx0Var, i3);
                dy0Var.getClass();
                dy0.a(dy0Var, B, wx0Var);
                ((AddressMapFragment) ddfVar.b).showControlElements();
                return zy11Var;
            case 16:
                createSuggestMenuPayload$lambda$3 = AddressSearchView.createSuggestMenuPayload$lambda$3((AddressSearchView) obj2, (x9v0) obj);
                return createSuggestMenuPayload$lambda$3;
            case 17:
                haq0 haq0Var = (haq0) obj2;
                u61 u61Var = (u61) obj;
                r9x0 r9x0Var = haq0Var.a;
                if (r9x0Var != null) {
                    ((ru.yandex.logistics.sdk.cargo_form.impl.domain.c) u61Var.d.get()).b(r9x0Var);
                } else {
                    x2s x2sVar = haq0Var.d;
                    if (x2sVar == null) {
                        x2sVar = null;
                    }
                    u1n.m(u61Var.a, x2sVar);
                    r61 r61Var = (r61) u61Var.c.get();
                    c0k0 c0k0Var = haq0Var.c;
                    vu0 vu0Var = haq0Var.b;
                    r61Var.getClass();
                    if (vu0Var instanceof tu0) {
                        yzj0 yzj0Var = c0k0Var instanceof yzj0 ? (yzj0) c0k0Var : null;
                        if (yzj0Var != null) {
                            int i4 = yzj0Var.a;
                            tu0 tu0Var = (tu0) vu0Var;
                            String str4 = tu0Var.a;
                            CardsRevealing cardsRevealing = tu0Var.b;
                            if (((qv0) kotlin.collections.a.S(i4, r61Var.b.getRoute().a)) == null) {
                                r61Var.a.e(str4, i4, cardsRevealing);
                            } else {
                                ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a.a(r61Var.h, Integer.valueOf(i4), null, 2);
                            }
                        }
                    } else if (c0k0Var instanceof yzj0) {
                        yzj0 yzj0Var2 = (yzj0) c0k0Var;
                        int i5 = yzj0Var2.a;
                        d51 d51Var = yzj0Var2.b;
                        if (d51Var instanceof c51) {
                            r61Var.a(new hu0(i5), vu0Var, false);
                        } else {
                            dv8.c(r61Var.a, d51Var, new hu0(i5), vu0Var, null, 24);
                        }
                    } else {
                        if (!(c0k0Var instanceof b0k0)) {
                            w511.b();
                            return null;
                        }
                        r61Var.b((b0k0) c0k0Var, vu0Var, new bgc(12));
                    }
                }
                return zy11Var;
            case 18:
                ((tls) obj2).invoke(((x61) obj).j);
                return zy11Var;
            case 19:
                ((tls) obj2).invoke(new m700((PlainAddress) obj));
                return zy11Var;
            case 20:
                on1 on1Var = (on1) obj2;
                on1Var.c.b.invoke();
                ((lhg) obj).b(on1Var.g, on1Var.f);
                return zy11Var;
            case 21:
                ((tls) obj2).invoke(((vn1) obj).b);
                return zy11Var;
            case 22:
                tls tlsVar = (tls) obj2;
                if (((vp1) obj).a) {
                    tlsVar.invoke(np1.a);
                } else {
                    tlsVar.invoke(pp1.a);
                }
                return zy11Var;
            case 23:
                dismiss$lambda$13 = AlertView.dismiss$lambda$13((AlertView) obj2, (sls) obj);
                return dismiss$lambda$13;
            case 24:
                ((xv1) obj2).T.invoke((String) obj);
                return zy11Var;
            case 25:
                ((Ref$ObjectRef) obj2).element = ((sls) obj).invoke();
                return zy11Var;
            case 26:
                ((ci9) obj2).d(obj);
                return zy11Var;
            case 27:
                return new r17(((Boolean) ((oz40) obj2).getValue()).booleanValue(), ((Number) ((m3u0) obj).getValue()).floatValue());
            case 28:
                final C0141a c0141a = (C0141a) obj2;
                final Ref$BooleanRef ref$BooleanRef = (Ref$BooleanRef) obj;
                xev xevVar = c0141a.a;
                if (c0141a.c) {
                    qq6 source = xevVar.source();
                    if (source.Q(0L, ayg.b) || source.Q(0L, ayg.a)) {
                        xevVar = eja1.b(new jci0(new pes(xevVar.source())), xevVar.getFileSystem());
                    }
                }
                try {
                    ImageDecoder.Source V = s8o.V(xevVar, c0141a.b, true);
                    if (V == null) {
                        qq6 source2 = xevVar.source();
                        try {
                            source2.S(ConfigConstants.VAL_WARNING_2001_VALUE_DISABLED);
                            ByteBuffer allocateDirect = ByteBuffer.allocateDirect((int) source2.h().b);
                            while (!source2.h().I1()) {
                                source2.h().read(allocateDirect);
                            }
                            allocateDirect.flip();
                            source2.close();
                            V = ImageDecoder.createSource(allocateDirect);
                        } finally {
                        }
                    }
                    Drawable decodeDrawable = ImageDecoder.decodeDrawable(V, new ImageDecoder.OnHeaderDecodedListener() { // from class: coil3.gif.AnimatedImageDecoder$decode$lambda$0$0$$inlined$decodeDrawable$1
                        @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
                        public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source3) {
                            Size size = imageInfo.getSize();
                            int width = size.getWidth();
                            int height = size.getHeight();
                            lg70 lg70Var = C0141a.this.b;
                            xis0 xis0Var = lg70Var.b;
                            Scale scale = lg70Var.c;
                            uh uhVar = kev.b;
                            long l = y5e.l(width, height, xis0Var, scale, (xis0) s8o.p(lg70Var, uhVar));
                            int i6 = (int) (l >> 32);
                            int i7 = (int) (l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                            if (width > 0 && height > 0 && (width != i6 || height != i7)) {
                                lg70 lg70Var2 = C0141a.this.b;
                                double m = y5e.m(width, height, i6, i7, lg70Var2.c, (xis0) s8o.p(lg70Var2, uhVar));
                                Ref$BooleanRef ref$BooleanRef2 = ref$BooleanRef;
                                boolean z = m < 1.0d;
                                ref$BooleanRef2.element = z;
                                if (z || C0141a.this.b.d == Precision.EXACT) {
                                    imageDecoder.setTargetSize(m810.a(width * m), m810.a(m * height));
                                }
                            }
                            lg70 lg70Var3 = C0141a.this.b;
                            imageDecoder.setAllocator(sb2.x(lev.a(lg70Var3)) ? 3 : 1);
                            imageDecoder.setMemorySizePolicy(!((Boolean) s8o.p(lg70Var3, lev.f)).booleanValue() ? 1 : 0);
                            uh uhVar2 = lev.b;
                            if (((ColorSpace) s8o.p(lg70Var3, uhVar2)) != null) {
                                imageDecoder.setTargetColorSpace((ColorSpace) s8o.p(lg70Var3, uhVar2));
                            }
                            if (s8o.p(lg70Var3, xi91.b) == null) {
                                imageDecoder.setPostProcessor(null);
                            } else {
                                ny61.u();
                            }
                        }
                    });
                    gwk0.m(xevVar, null);
                    return decodeDrawable;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        gwk0.m(xevVar, th);
                        throw th2;
                    }
                }
            default:
                ((View.OnClickListener) obj2).onClick((ViewGroup) obj);
                return zy11Var;
        }
    }

    public /* synthetic */ j0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
