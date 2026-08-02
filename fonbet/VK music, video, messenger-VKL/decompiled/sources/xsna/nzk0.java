package xsna;

import android.content.Context;
import android.text.Spannable;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.vk.attachpicker.widget.MaxWidthFrameLayout;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.status.StatusImageParticipants;
import com.vk.dto.status.StatusImagePopup;
import com.vk.dto.status.StatusImagePopupAnimation;
import com.vk.dto.status.StatusImagePopupBackground;
import com.vk.dto.status.StatusImagePopupPhoto;
import com.vk.imageloader.view.VKImageView;
import com.vk.stickers.views.animation.VKAnimationView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dw20;

/* compiled from: StatusImagePopupDialogBuilder.kt */
/* loaded from: classes5.dex */
public final class nzk0 extends dw20.b {
    public StatusImagePopup e;
    public boolean f;
    public gzs<s3q0> g;
    public gzs<s3q0> h;
    public io.reactivex.rxjava3.disposables.c i;
    public defpackage.s j;

    public nzk0(Context context) {
        super(context, null);
        this.f = true;
    }

    public static void T0(nzk0 nzk0Var, CharSequence charSequence, dw20 dw20Var) {
        if (charSequence instanceof Spannable) {
            qaz[] qazVarArr = (qaz[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), qaz.class);
            if (qazVarArr != null) {
                for (qaz qazVar : qazVarArr) {
                    qazVar.b(R.attr.vk_ui_text_link);
                    qazVar.j();
                    qazVar.j = new l340(dw20Var, 13);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final dw20 S0() {
        int i;
        StatusImagePopupAnimation statusImagePopupAnimation;
        StatusImagePopupPhoto statusImagePopupPhoto;
        String str;
        StatusImageParticipants statusImageParticipants;
        gzs<s3q0> gzsVar;
        Image image;
        ImageSize Cb;
        Image image2;
        ImageSize Cb2;
        StatusImagePopup statusImagePopup = this.e;
        if (statusImagePopup == null) {
            throw new IllegalStateException("status not set");
        }
        StatusImagePopupBackground statusImagePopupBackground = statusImagePopup.b;
        boolean z = statusImagePopup.j;
        pzk0 pzk0Var = new pzk0(this.c);
        pzk0Var.setId(R.id.status_image_popup);
        D0(pzk0Var, false);
        F0(true);
        u(0);
        x(0);
        Integer valueOf = Integer.valueOf(pzk0Var.getId());
        e.a aVar = this.d;
        aVar.m = valueOf;
        q(z);
        p(z);
        I(true);
        if (statusImagePopupBackground != null) {
            StatusImagePopupBackground.Theme theme = dhr0.a.c(this.c) ? statusImagePopupBackground.c : statusImagePopupBackground.b;
            if (theme != null) {
                i = theme.b;
                d1x c = gu9.c(R.attr.vk_ui_background_contrast_themed, this.c);
                if (i != 0) {
                    c.a(i);
                }
                y(c);
                aVar.w0 = cn70.b(8);
                statusImagePopupAnimation = statusImagePopup.c;
                ArrayList arrayList = null;
                if (statusImagePopupAnimation != null) {
                    VKAnimationView vKAnimationView = new VKAnimationView(this.c, null);
                    vKAnimationView.setRepeatCount(1);
                    vKAnimationView.clearAnimation();
                    vKAnimationView.setOnLoadAnimationCallback(new tfc(statusImagePopupAnimation, vKAnimationView));
                    String str2 = statusImagePopupAnimation.b;
                    if (str2.length() > 0) {
                        if (str2.equals(vKAnimationView.q)) {
                            vKAnimationView.l0();
                            a780 a780Var = vKAnimationView.p;
                            if (a780Var != null) {
                                a780Var.onSuccess();
                            }
                        } else {
                            if (vKAnimationView.q != null) {
                                vKAnimationView.l0();
                            }
                            vKAnimationView.r = false;
                            c7r0.g(str2, str2, false).subscribe(new t5n0(new tzq0(vKAnimationView, 1), 2), new epq0(new iyd0(vKAnimationView, 13), 2));
                            vKAnimationView.q = str2;
                        }
                    }
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(cn70.b(statusImagePopupAnimation.d), cn70.b(statusImagePopupAnimation.e));
                    layoutParams.setMarginStart(cn70.b(12));
                    layoutParams.setMarginEnd(cn70.b(12));
                    layoutParams.gravity = 80;
                    MaxWidthFrameLayout maxWidthFrameLayout = new MaxWidthFrameLayout(this.c);
                    maxWidthFrameLayout.b = iah0.a(400);
                    maxWidthFrameLayout.addView(vKAnimationView, layoutParams);
                    maxWidthFrameLayout.setLayoutParams(new CoordinatorLayout.f(-1, -2));
                    maxWidthFrameLayout.setMaxWidth(cn70.b(480));
                    aVar.l = maxWidthFrameLayout;
                }
                c(new jgj(pzk0Var, cn70.b(16), 0, 56));
                dw20 I0 = I0(null);
                pzk0Var.setOnDismissButtonClickListener(new a50(I0, 9));
                I0.Vn(new hri0(this, 2));
                a0(new uq50(this, 28));
                pzk0Var.setPerformClickActionButton(new com.vk.video.ui.discovery.minimizable.related_videos.j(this, I0, pzk0Var, 12));
                pzk0Var.setOnButtonsClickListener(new th4(3, this, I0));
                statusImagePopupPhoto = statusImagePopup.d;
                if (statusImagePopupBackground != null) {
                    StatusImagePopupBackground.Theme theme2 = dhr0.a.c(this.c) ? statusImagePopupBackground.c : statusImagePopupBackground.b;
                    if (theme2 != null && (image2 = theme2.c) != null && (Cb2 = image2.Cb(cn70.b(450), true, false)) != null) {
                        str = Cb2.d.d;
                        VKImageView vKImageView = pzk0Var.b;
                        vKImageView.load(str);
                        bwt0.p0(vKImageView, !(str != null || str.length() == 0));
                        boolean z2 = str != null || str.length() == 0;
                        int c2 = !z2 ? -16777216 : dhr0.t.c(R.attr.vk_ui_icon_medium);
                        int i2 = !z2 ? 61 : 31;
                        int c3 = z2 ? dhr0.t.c(R.attr.vk_ui_icon_medium) : -1;
                        lzk0 lzk0Var = pzk0Var.m;
                        lzk0Var.c.getPaint().setColor(c2);
                        lzk0Var.c.getPaint().setAlpha(i2);
                        lzk0Var.b.setTint(c3);
                        String str3 = (statusImagePopupPhoto != null || (image = statusImagePopupPhoto.c) == null || (Cb = image.Cb(cn70.b(72), true, false)) == null) ? null : Cb.d.d;
                        VKImageView vKImageView2 = pzk0Var.c;
                        vKImageView2.load(str3);
                        bwt0.p0(vKImageView2, !(str3 != null || str3.length() == 0));
                        pzk0Var.setIsPhotoRoundAsCircle(epx.f(statusImagePopupPhoto != null ? statusImagePopupPhoto.b : null, "avatar"));
                        pzk0Var.setTitle(statusImagePopup.e);
                        CharSequence U0 = U0(statusImagePopup.f);
                        T0(this, U0, I0);
                        pzk0Var.setText(U0);
                        statusImageParticipants = statusImagePopup.g;
                        if (statusImageParticipants != null) {
                            List<Owner> list = statusImageParticipants.b;
                            if (list != null) {
                                arrayList = new ArrayList();
                                Iterator<T> it = list.iterator();
                                while (it.hasNext()) {
                                    String f = ((Owner) it.next()).f(cn70.b(32));
                                    if (f != null) {
                                        arrayList.add(f);
                                    }
                                }
                            }
                            pzk0Var.a(statusImageParticipants.d - statusImageParticipants.c, arrayList);
                            pzk0Var.setParticipantsText(statusImageParticipants.e);
                        } else {
                            pzk0Var.a(0, null);
                            pzk0Var.setParticipantsText(null);
                        }
                        pzk0Var.setButtons(statusImagePopup.h);
                        CharSequence U02 = U0(statusImagePopup.i);
                        T0(this, U02, I0);
                        pzk0Var.setTerms(U02);
                        bwt0.p0(pzk0Var.j, false);
                        gzsVar = this.h;
                        if (gzsVar != null) {
                            gzsVar.invoke();
                        }
                        return I0;
                    }
                }
                str = null;
                VKImageView vKImageView3 = pzk0Var.b;
                vKImageView3.load(str);
                bwt0.p0(vKImageView3, !(str != null || str.length() == 0));
                if (str != null) {
                }
                if (!z2) {
                }
                if (!z2) {
                }
                if (z2) {
                }
                lzk0 lzk0Var2 = pzk0Var.m;
                lzk0Var2.c.getPaint().setColor(c2);
                lzk0Var2.c.getPaint().setAlpha(i2);
                lzk0Var2.b.setTint(c3);
                if (statusImagePopupPhoto != null) {
                }
                VKImageView vKImageView22 = pzk0Var.c;
                vKImageView22.load(str3);
                bwt0.p0(vKImageView22, !(str3 != null || str3.length() == 0));
                pzk0Var.setIsPhotoRoundAsCircle(epx.f(statusImagePopupPhoto != null ? statusImagePopupPhoto.b : null, "avatar"));
                pzk0Var.setTitle(statusImagePopup.e);
                CharSequence U03 = U0(statusImagePopup.f);
                T0(this, U03, I0);
                pzk0Var.setText(U03);
                statusImageParticipants = statusImagePopup.g;
                if (statusImageParticipants != null) {
                }
                pzk0Var.setButtons(statusImagePopup.h);
                CharSequence U022 = U0(statusImagePopup.i);
                T0(this, U022, I0);
                pzk0Var.setTerms(U022);
                bwt0.p0(pzk0Var.j, false);
                gzsVar = this.h;
                if (gzsVar != null) {
                }
                return I0;
            }
        }
        i = 0;
        d1x c4 = gu9.c(R.attr.vk_ui_background_contrast_themed, this.c);
        if (i != 0) {
        }
        y(c4);
        aVar.w0 = cn70.b(8);
        statusImagePopupAnimation = statusImagePopup.c;
        ArrayList arrayList2 = null;
        if (statusImagePopupAnimation != null) {
        }
        c(new jgj(pzk0Var, cn70.b(16), 0, 56));
        dw20 I02 = I0(null);
        pzk0Var.setOnDismissButtonClickListener(new a50(I02, 9));
        I02.Vn(new hri0(this, 2));
        a0(new uq50(this, 28));
        pzk0Var.setPerformClickActionButton(new com.vk.video.ui.discovery.minimizable.related_videos.j(this, I02, pzk0Var, 12));
        pzk0Var.setOnButtonsClickListener(new th4(3, this, I02));
        statusImagePopupPhoto = statusImagePopup.d;
        if (statusImagePopupBackground != null) {
        }
        str = null;
        VKImageView vKImageView32 = pzk0Var.b;
        vKImageView32.load(str);
        bwt0.p0(vKImageView32, !(str != null || str.length() == 0));
        if (str != null) {
        }
        if (!z2) {
        }
        if (!z2) {
        }
        if (z2) {
        }
        lzk0 lzk0Var22 = pzk0Var.m;
        lzk0Var22.c.getPaint().setColor(c2);
        lzk0Var22.c.getPaint().setAlpha(i2);
        lzk0Var22.b.setTint(c3);
        if (statusImagePopupPhoto != null) {
        }
        VKImageView vKImageView222 = pzk0Var.c;
        vKImageView222.load(str3);
        bwt0.p0(vKImageView222, !(str3 != null || str3.length() == 0));
        pzk0Var.setIsPhotoRoundAsCircle(epx.f(statusImagePopupPhoto != null ? statusImagePopupPhoto.b : null, "avatar"));
        pzk0Var.setTitle(statusImagePopup.e);
        CharSequence U032 = U0(statusImagePopup.f);
        T0(this, U032, I02);
        pzk0Var.setText(U032);
        statusImageParticipants = statusImagePopup.g;
        if (statusImageParticipants != null) {
        }
        pzk0Var.setButtons(statusImagePopup.h);
        CharSequence U0222 = U0(statusImagePopup.i);
        T0(this, U0222, I02);
        pzk0Var.setTerms(U0222);
        bwt0.p0(pzk0Var.j, false);
        gzsVar = this.h;
        if (gzsVar != null) {
        }
        return I02;
    }

    public final CharSequence U0(String str) {
        if (str == null || str.length() == 0) {
            return "";
        }
        if (this.f) {
            ucp ucpVar = ucp.a;
            return ucp.i(xwk.d().a().m(str));
        }
        ucp ucpVar2 = ucp.a;
        return ucp.i(n420.b(str));
    }
}
