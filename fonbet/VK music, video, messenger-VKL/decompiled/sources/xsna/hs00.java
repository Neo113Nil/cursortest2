package xsna;

import android.content.Context;
import android.content.IntentFilter;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.validation.VkPhoneValidationErrorReason;
import com.vk.catalog2.feature.music.holders.MusicFollowCuratorButtonVh;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.spinner.VkSpinner;
import com.vk.dto.im.MsgType;
import com.vk.dto.photo.Photo;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.ecomm.reviews.impl.allreviews.presentation.c;
import com.vk.music.player.PlaybackActionMeta;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.poll.fragments.PollResultsFragment;
import com.vk.settings.impl.presentation.base.fragment.settings.RedesignNotificationSettingsFragment;
import com.vk.toggle.b;
import com.vkontakte.android.attachments.PhotoAttachment;
import kotlin.Lazy;
import xsna.isc0;
import xsna.nn20;
import xsna.no90;
import xsna.tj50;
import xsna.zjv;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class hs00 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ hs00(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x04e4, code lost:
    
        if (r3 <= 7000) goto L110;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Integer] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Integer b;
        dw20 dw20Var;
        int i = this.b;
        float f = 4.0f;
        int i2 = 24;
        int i3 = 16;
        int i4 = 7;
        int i5 = 8;
        int i6 = 17;
        int i7 = 5;
        int i8 = 0;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((com.vk.ecomm.reviews.impl.allreviews.presentation.b) obj2).T((c.m) obj);
                break;
            case 1:
                int i9 = MarketEditAlbumGoodsFragment.c1;
                ((MarketEditAlbumGoodsFragment) obj2).Mo();
                break;
            case 2:
                g010 g010Var = (g010) obj2;
                break;
            case 3:
                f910 f910Var = (f910) obj2;
                f910Var.p.setVisibility(8);
                VkSpinner vkSpinner = f910Var.l;
                if (vkSpinner != null) {
                    vkSpinner.setVisibility(0);
                }
                break;
            case 4:
                break;
            case 5:
                ((zak0) ((nn20.a) obj2).g).setValue((String) obj);
                break;
            case 6:
                break;
            case 7:
                e140 e140Var = (e140) obj2;
                e140Var.a();
                izs<? super MsgType, s3q0> izsVar = e140Var.s;
                if (izsVar == null) {
                    izsVar = null;
                }
                izsVar.invoke(null);
                break;
            case 8:
                VkButton vkButton = new VkButton((Context) obj, r10, 6, i8);
                vkButton.setSize(VkButton.Size.Medium);
                vkButton.setMode(VkButton.Mode.Secondary);
                vkButton.setAppearance(VkButton.Appearance.Neutral);
                vkButton.setText((CharSequence) null);
                vkButton.setIconSize(Integer.valueOf(iah0.a(24)));
                vkButton.setCornerRadius(Float.valueOf(iah0.b(4.0f)));
                jjc.g(vkButton, new o3w((s840) obj2, i6));
                break;
            case 9:
                ((MusicFollowCuratorButtonVh) obj2).f = null;
                break;
            case 10:
                dn40 dn40Var = (dn40) obj2;
                Long l = (Long) obj;
                long longValue = l.longValue();
                int i10 = dn40Var.c;
                b.d dVar = dn40Var.f;
                u2b0 u2b0Var = dn40Var.b;
                if (!dn40Var.g) {
                    bn40.f("ltseek: disabled - returning");
                } else if (!u2b0Var.I1()) {
                    bn40.f("ltseek: isContentMode - returning");
                } else if (longValue == 0) {
                    bn40.f("ltseek: diff==0 - returning");
                    u2b0Var.s(dn40Var.b(), false);
                } else if (!p1p0.a(dVar)) {
                    bn40.f("ltseek:  Disabled by tg - returning");
                } else if (-1 == longValue) {
                    bn40.f("ltseek:  LONGTAP_STARTED - returning");
                    dn40Var.a.performHapticFeedback(0);
                } else {
                    StringBuilder sb = new StringBuilder("ltseek: strategy: ");
                    sb.append(dVar != null ? dVar.b() : null);
                    bn40.f(sb.toString());
                    if (dVar == null || (b = dVar.b()) == null || b.intValue() != 1) {
                        if (longValue > 2000) {
                            if (longValue > 3000) {
                                if (longValue > 6000) {
                                    f = 32.0f;
                                }
                                f = 16.0f;
                            }
                            f = 8.0f;
                        }
                        bn40.f("ltseek: diff ", l, " current=", Long.valueOf(u2b0Var.C1()), "seekMultiplier=", Float.valueOf(500.0f), "multiplier=", Float.valueOf(f));
                        u2b0Var.s(f, false);
                        u2b0Var.G0((int) ((i10 * f * 500.0f) + (r3 * 1000)), new PlaybackActionMeta(17, 0L, 2, null));
                    } else {
                        if (longValue > 3000) {
                            if (longValue > 5000) {
                                break;
                            }
                        } else {
                            f = 2.0f;
                        }
                        bn40.f("ltseek: diff ", l, " current=", Long.valueOf(u2b0Var.C1()), "seekMultiplier=", Float.valueOf(500.0f), "multiplier=", Float.valueOf(f));
                        u2b0Var.s(f, false);
                        u2b0Var.G0((int) ((i10 * f * 500.0f) + (r3 * 1000)), new PlaybackActionMeta(17, 0L, 2, null));
                    }
                }
                break;
            case 11:
                CharSequence charSequence = (CharSequence) obj2;
                tgi0 tgi0Var = (tgi0) obj;
                if (charSequence != null) {
                    qgi0.h(tgi0Var, charSequence.toString());
                }
                break;
            case 12:
                ik70 ik70Var = (ik70) obj2;
                Context context = ik70Var.c;
                lpj lpjVar = context instanceof lpj ? (lpj) context : null;
                if (lpjVar != null) {
                    int themeResId = lpjVar.getThemeResId();
                    dhr0.a.getClass();
                    if (themeResId == dhr0.u().c && (dw20Var = ik70Var.b) != null) {
                        String str = dw20.d1;
                        dw20Var.Sn(null);
                    }
                }
                break;
            case 13:
                yp80 yp80Var = (yp80) obj2;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                break;
            case 14:
                zjv.a aVar = (zjv.a) obj2;
                break;
            case 15:
                ((m990) obj2).f.onNext((utk) obj);
                break;
            case 16:
                ((bo90) obj2).T(new no90.b.a((Throwable) obj));
                break;
            case 17:
                Object obj3 = ((v3a0) obj2).o;
                ((x3a0) (obj3 != null ? obj3 : null)).y0(VkPhoneValidationErrorReason.LATER);
                break;
            case 18:
                ana0 ana0Var = (ana0) obj;
                ((sma0) obj2).e.i(ana0Var.b.b);
                break;
            case 19:
                ee eeVar = (ee) obj2;
                if (((VKApiExecutionException) obj).s() == 253) {
                    PollResultsFragment.d.e(eeVar, true);
                } else {
                    r9 = false;
                }
                break;
            case 20:
                w2c0 w2c0Var = (w2c0) obj2;
                Lazy lazy = w2c0Var.f;
                p870 w = ((NewsFeedComponent) lazy.getValue()).w();
                v2c0 v2c0Var = w2c0Var.i;
                w.b(149, v2c0Var);
                ((NewsFeedComponent) lazy.getValue()).w().b(150, v2c0Var);
                ((NewsFeedComponent) lazy.getValue()).w().b(151, v2c0Var);
                IntentFilter intentFilter = new IntentFilter();
                while (i8 < 5) {
                    intentFilter.addAction(w2c0.j[i8]);
                    i8++;
                }
                Context context2 = e43.a;
                anj.d(context2 != null ? context2 : null, w2c0Var.h, intentFilter, hf8.a, 4);
                break;
            case 21:
                Photo photo = (Photo) obj2;
                Photo photo2 = ((PhotoAttachment) obj).l;
                break;
            case 22:
                qkc0 qkc0Var = (qkc0) obj2;
                tj50.a aVar2 = (tj50.a) obj;
                vpc0 vpc0Var = qkc0Var.d;
                ui uiVar = new ui(vpc0Var, 9);
                ao8 ao8Var = ao8.d;
                h0u0 a = aVar2.a(uiVar, ao8Var);
                h0u0 a2 = aVar2.a(new q99(vpc0Var, 5), ao8Var);
                h0u0 a3 = aVar2.a(new bzw(qkc0Var, 23), ao8Var);
                int i11 = 15;
                h0u0 a4 = aVar2.a(new ulz(i11), ao8Var);
                h0u0 a5 = aVar2.a(wkc0.b, ao8Var);
                h0u0 a6 = aVar2.a(new ye40(11), ao8Var);
                h0u0 a7 = aVar2.a(new x620(i6), ao8Var);
                int i12 = 12;
                h0u0 a8 = aVar2.a(new kl60(i12), ao8Var);
                h0u0 a9 = aVar2.a(new sux(i11), ao8Var);
                h0u0 a10 = aVar2.a(new y510(i11), ao8Var);
                h0u0 a11 = aVar2.a(new e810(qkc0Var, 20), ao8Var);
                h0u0 a12 = aVar2.a(new y160(i7), ao8Var);
                h0u0 a13 = aVar2.a(new f410(qkc0Var, i2), ao8Var);
                h0u0 a14 = aVar2.a(new lw3(vpc0Var, 10), ao8Var);
                h0u0 a15 = aVar2.a(new qey(25), ao8Var);
                h0u0 a16 = aVar2.a(new s55(vpc0Var, 13), ao8Var);
                h0u0 a17 = aVar2.a(new qcw(18), ao8Var);
                h0u0 a18 = aVar2.a(new nc90(3), ao8Var);
                int i13 = 27;
                h0u0 a19 = aVar2.a(new leq(i13), ao8Var);
                h0u0 a20 = aVar2.a(new gda0(qkc0Var, i7), ao8Var);
                h0u0 a21 = aVar2.a(new rkc0(qkc0Var), ao8Var);
                h0u0 a22 = aVar2.a(new kn20(qkc0Var, i13), ao8Var);
                h0u0 a23 = aVar2.a(new gz30(9), ao8Var);
                h0u0 a24 = aVar2.a(new q8w(i6), ao8Var);
                h0u0 a25 = aVar2.a(new p7x(i6), ao8Var);
                h0u0 a26 = aVar2.a(new c3v(i12), ao8Var);
                int i14 = 18;
                break;
            case 23:
                isc0.b bVar = (isc0.b) obj2;
                isc0.b.a(bVar, new ln20(bVar.b, i3));
                break;
            case 24:
                iui iuiVar = (iui) obj;
                iuiVar.a = new qg(i4, iuiVar.a(new smf0(((h5f0) obj2).d, new rr60())), iuiVar.a(new n4f0()));
                break;
            case 25:
                RedesignNotificationSettingsFragment.a aVar3 = RedesignNotificationSettingsFragment.Y;
                ((RedesignNotificationSettingsFragment) obj2).getFeature().C(new vf70(0));
                break;
            case 26:
                ((zak0) ((sjg0) obj2).u).setValue((String) obj);
                break;
            case 27:
                ((tdu) obj).b(((Number) ((c1h) obj2).t.getValue()).floatValue());
                break;
            case 28:
                g9i0 g9i0Var = (g9i0) obj2;
                g9i0Var.a.X0(((mai0) g9i0Var.d.getSelectedItem()).a, ((mai0) g9i0Var.f.getSelectedItem()).a);
                break;
            default:
                ((bei0) obj2).l((obi0) obj);
                break;
        }
        return s3q0.a;
    }
}
