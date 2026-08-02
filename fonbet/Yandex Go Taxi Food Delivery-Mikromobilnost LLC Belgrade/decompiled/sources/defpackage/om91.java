package defpackage;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import coil3.size.Scale;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.a;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinState;

/* loaded from: classes11.dex */
public abstract class om91 {
    public static final String[] a = {"⌚️", "📱️", "📲️", "💻️", "⌨️", "🖥️", "🖨️", "🖱️", "🖲️", "🕹️", "🗜️", "💽️", "💾️", "💿️", "📀️", "📼️", "📷️", "📸️", "📹️", "🎥️", "📽️", "🎞️", "📞️", "☎️", "📟️", "📠️", "📺️", "📻️", "🎙️", "🎚️", "🎛️", "⏱️", "⏲️", "⏰️", "🕰️", "⌛️", "⏳️", "📡️", "🔋️", "🔌️", "💡️", "🔦️", "🕯️", "🗑️", "🛢️", "💸️", "💵️", "💴️", "💶️", "💷️", "💰️", "💳️", "💎️", "⚖️", "🔧️", "🔨️", "⚒️", "🛠️", "⛏️", "🔩️", "⚙️", "⛓️", "🔫️", "💣️", "🔪️", "🗡️", "⚔️", "🛡️", "🚬️", "⚰️", "⚱️", "🏺️", "🔮️", "📿️", "💈️", "⚗️", "🔭️", "🔬️", "🕳️", "💊️", "💉️", "🌡️", "🚽️", "🚰️", "🚿️", "🛁️", "🛀️", "🛎️", "🔑️", "🗝️", "🚪️", "🛋️", "🛏️", "🛌️", "🖼️", "🛍️", "🛒️", "🎁️", "🎈️", "🎏️", "🎀️", "🎊️", "🎉️", "🎎️", "🏮️", "🎐️", "✉️", "📩️", "📨️", "📧️", "💌️", "📥️", "📤️", "📦️", "🏷️", "📪️", "📫️", "📬️", "📭️", "📮️", "📯️", "📜️", "📃️", "📄️", "📑️", "📊️", "📈️", "📉️", "🗒️", "🗓️", "📆️", "📅️", "📇️", "🗃️", "🗳️", "🗄️", "📋️", "📁️", "📂️", "🗂️", "🗞️", "📰️", "📓️", "📔️", "📒️", "📕️", "📗️", "📘️", "📙️", "📚️", "📖️", "🔖️", "🔗️", "📎️", "🖇️", "📐️", "📏️", "📌️", "📍️", "✂️", "🖊️", "🖋️", "✒️", "🖌️", "🖍️", "📝️", "✏️", "🔍️", "🔎️", "🔏️", "🔐️", "🔒️", "🔓"};

    public static final void a(int i, int i2, fid fidVar, f530 f530Var, List list, final boolean z) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1977766007);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.e(list) ? 32 : 16) | (btsVar.a(z) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        final int i4 = 0;
        final int i5 = 1;
        if (!btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            btsVar.Y();
            f530Var2 = f530Var;
        } else {
            if (list.isEmpty()) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new wm1(z, i, i2, list);
                    return;
                }
                return;
            }
            final jx41 jx41Var = (jx41) a.S(i, list);
            if (jx41Var == null) {
                jx41Var = (jx41) a.P(list);
            }
            c530 c530Var = c530.a;
            ydb1.a(an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), wwg.S(-671273971, true, new zls() { // from class: nx41
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i4;
                    zy11 zy11Var = zy11.a;
                    jx41 jx41Var2 = jx41Var;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i6) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                om91.b(jx41Var2.c, jx41Var2.d, x4c.G, z, null, btsVar2, 384);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                om91.b(jx41Var2.e, jx41Var2.f, x4c.I, z, null, btsVar3, 384);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, wwg.S(1926262146, true, new zls() { // from class: nx41
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i6 = i5;
                    zy11 zy11Var = zy11.a;
                    jx41 jx41Var2 = jx41Var;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    switch (i6) {
                        case 0:
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                om91.b(jx41Var2.c, jx41Var2.d, x4c.G, z, null, btsVar2, 384);
                                break;
                            }
                        default:
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                om91.b(jx41Var2.e, jx41Var2.f, x4c.I, z, null, btsVar3, 384);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, false, btsVar, 24624, 236);
            f530Var2 = c530Var;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new kj5(i, list, z, f530Var2, i2);
        }
    }

    public static final void b(CharSequence charSequence, CharSequence charSequence2, so5 so5Var, boolean z, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        int i2;
        c530 c530Var;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(456027072);
        int i3 = i | (btsVar.k(charSequence) ? 4 : 2) | (btsVar.k(charSequence2) ? 32 : 16) | (btsVar.a(z) ? 2048 : 1024) | HProv.ALG_CLASS_DATA_ENCRYPT;
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            sic a2 = qic.a(lr20.c, so5Var, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var2 = c530.a;
            f530 d = b.d(btsVar, c530Var2);
            ohd.G1.getClass();
            sls slsVar = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            if (z) {
                btsVar.e0(-1993903360);
                com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.q(c530Var2, 108.0f), 16.0f), cyk0.c(100.0f), false, null, null, null, false, btsVar, 6, 252);
                btsVar.t(false);
                z2 = true;
                c530Var = c530Var2;
            } else {
                btsVar.e0(-1993740331);
                if (charSequence2 == null) {
                    btsVar.e0(-1993727157);
                    btsVar.t(false);
                    i2 = i3;
                    c530Var = c530Var2;
                } else {
                    btsVar.e0(-1993727156);
                    i2 = i3;
                    qgy.b(charSequence2, null, c530Var2, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, 3456, 0, 12274);
                    c530Var = c530Var2;
                    btsVar = btsVar;
                    btsVar.t(false);
                }
                bts btsVar2 = btsVar;
                qgy.b(charSequence, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar2, (i2 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar = btsVar2;
                btsVar.t(false);
                z2 = true;
            }
            btsVar.t(z2);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(i, 15, charSequence, charSequence2, so5Var, f530Var2, z);
        }
    }

    public static final void c(rx41 rx41Var, tls tlsVar, f530 f530Var, wg6 wg6Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        wg6 wg6Var2;
        boolean z;
        int i3;
        f530 f530Var3;
        wg6 wg6Var3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-598933249);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(rx41Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i4 = i2 | 384;
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 = i2 | 1408;
        }
        if (btsVar.V(i4 & 1, (i4 & 1171) != 1170)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = new bgc(12);
                    btsVar.o0(Q);
                }
                sls slsVar = (sls) Q;
                z = true;
                wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, slsVar, btsVar, 0, 384, 4095);
                i3 = i4 & (-7169);
                f530Var3 = c530.a;
                wg6Var3 = a2;
            } else {
                btsVar.Y();
                wg6Var3 = wg6Var;
                i3 = i4 & (-7169);
                z = true;
                f530Var3 = f530Var;
            }
            btsVar.u();
            int i5 = 6;
            c.a(f530Var3, wg6Var3, null, false, false, null, null, wwg.S(1488659277, z, new asr0(i5, tlsVar), btsVar), null, null, null, wwg.S(-1684561825, z, new nhu0(i5, rx41Var, tlsVar), btsVar), btsVar, ((i3 >> 6) & 14) | 12582912, 48, 1916);
            btsVar = btsVar;
            f530Var2 = f530Var3;
            wg6Var2 = wg6Var3;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
            wg6Var2 = wg6Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0((Object) rx41Var, (Object) tlsVar, f530Var2, (Object) wg6Var2, i, 27);
        }
    }

    public static final ArrayList d(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            czb0 czb0Var = (czb0) it.next();
            qzb0 qzb0Var = czb0Var.a;
            PinState pinState = czb0Var.d;
            ezb0 ezb0Var = pinState == null ? null : new ezb0(qzb0Var, pinState);
            if (ezb0Var != null) {
                arrayList.add(ezb0Var);
            }
        }
        return new ArrayList(arrayList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005a, code lost:
    
        if (r2 == 1.0d) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Bitmap e(Drawable drawable, Bitmap.Config config, xis0 xis0Var, Scale scale, xis0 xis0Var2, boolean z) {
        Scale scale2 = scale;
        xis0 xis0Var3 = xis0Var2;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            if (bitmap.getConfig() == ((config == null || sb2.x(config)) ? Bitmap.Config.ARGB_8888 : config)) {
                if (!z) {
                    long l = y5e.l(bitmap.getWidth(), bitmap.getHeight(), xis0Var, scale2, xis0Var3);
                    double m = y5e.m(bitmap.getWidth(), bitmap.getHeight(), (int) (l >> 32), (int) (l & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), scale2, xis0Var2);
                    scale2 = scale2;
                    xis0Var3 = xis0Var2;
                }
                return bitmap;
            }
        }
        Drawable mutate = drawable.mutate();
        int b = zx21.b(mutate);
        if (b <= 0) {
            b = 512;
        }
        int a2 = zx21.a(mutate);
        int i = a2 > 0 ? a2 : 512;
        long l2 = y5e.l(b, i, xis0Var, scale2, xis0Var3);
        int i2 = i;
        double m2 = y5e.m(b, i2, (int) (l2 >> 32), (int) (l2 & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), scale2, xis0Var3);
        int a3 = m810.a(b * m2);
        int a4 = m810.a(m2 * i2);
        Bitmap createBitmap = Bitmap.createBitmap(a3, a4, (config == null || sb2.x(config)) ? Bitmap.Config.ARGB_8888 : config);
        Rect bounds = mutate.getBounds();
        int i3 = bounds.left;
        int i4 = bounds.top;
        int i5 = bounds.right;
        int i6 = bounds.bottom;
        mutate.setBounds(0, 0, a3, a4);
        mutate.draw(new Canvas(createBitmap));
        mutate.setBounds(i3, i4, i5, i6);
        return createBitmap;
    }
}
