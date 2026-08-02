package xsna;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.auth.passport.VkPassportContract$VkSecurityInfo;
import com.vk.auth.passport.VkPassportView;
import com.vk.auth.passport.c;
import com.vk.auth.passport.d;
import com.vk.auth.passport.e;
import com.vk.core.view.TextViewEllipsizeEnd;
import com.vk.dto.common.ImageSizeKey;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.webrtc.utils.retry.ExponentialAlgorithm;
import xsna.a3i0;
import xsna.hg1;

/* compiled from: VkBasePassportPresenter.kt */
/* loaded from: classes15.dex */
public class reu0 implements xav0 {
    public final VkPassportView a;
    public final seu0 b;
    public io.reactivex.rxjava3.disposables.c c;
    public io.reactivex.rxjava3.disposables.c d;
    public io.reactivex.rxjava3.disposables.c e;
    public boolean g;
    public gzs<Boolean> h;
    public izs<? super Boolean, Boolean> i;
    public izs<? super Boolean, Boolean> j;
    public final peu0 f = new peu0();
    public final bpn0 k = new bpn0(new mwm0(this, 19));

    /* compiled from: VkBasePassportPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<wav0, s3q0> {
        /* JADX WARN: Removed duplicated region for block: B:126:0x021d  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x0179  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x014f  */
        /* JADX WARN: Removed duplicated region for block: B:129:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:132:0x00b9  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00b0  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x0101  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0126  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x0175  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x01c3  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01e5  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x0255  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0262 A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:98:0x0376  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke(wav0 wav0Var) {
            String str;
            int i;
            com.vk.auth.passport.c cVar;
            com.vk.auth.passport.e eVar;
            Drawable drawable;
            int i2;
            ImageView imageView;
            ImageView imageView2;
            TextView textView;
            VkPassportView vkPassportView;
            io.reactivex.rxjava3.disposables.c cVar2;
            int color;
            int f;
            CharSequence text;
            CharSequence text2;
            wav0 wav0Var2 = wav0Var;
            reu0 reu0Var = (reu0) this.receiver;
            VkPassportView vkPassportView2 = reu0Var.a;
            vkPassportView2.a(8, 0, 8);
            com.vk.auth.passport.b bVar = vkPassportView2.u;
            if (bVar == null) {
                bVar = null;
            }
            View view = bVar.q;
            d.a aVar = wav0Var2.a;
            TextView textView2 = bVar.h;
            VkPassportView vkPassportView3 = bVar.a;
            ImageView imageView3 = bVar.i;
            View view2 = bVar.s;
            View view3 = bVar.n;
            View view4 = bVar.o;
            com.vk.core.ui.image.a<View> aVar2 = bVar.b;
            TextView textView3 = bVar.g;
            TextView textView4 = bVar.f;
            itk itkVar = bVar.c;
            em90 em90Var = bVar.C;
            pzd0 pzd0Var = aVar.a;
            em90Var.getClass();
            String str2 = pzd0Var.f;
            String str3 = pzd0Var.d;
            com.vk.auth.passport.b bVar2 = bVar;
            em90Var.b.h(pzd0Var.a, pzd0Var.e, adu0.a(6, em90Var.a.getContext()));
            String a = pzd0Var.a();
            String a2 = (a == null || drm0.N(a)) ? null : pzd0Var.a();
            String replace = (str3 == null || drm0.N(str3)) ? null : str3.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183);
            if (str2 == null || drm0.N(str2)) {
                str2 = null;
            }
            if (a2 != null) {
                if (replace != null) {
                    str2 = replace;
                }
                replace = a2;
            } else if (replace == null) {
                replace = str2;
                str = null;
                em90Var.c.setText(replace);
                em90Var.d.setText(str);
                int i3 = 1;
                if (itkVar.a(1)) {
                    i = 0;
                    aVar2.getView().setVisibility(0);
                } else {
                    f4m.j(aVar2.getView());
                    i = 0;
                }
                if (!itkVar.a(2) || (text2 = textView4.getText()) == null || drm0.N(text2)) {
                    f4m.j(textView4);
                } else {
                    textView4.setVisibility(i);
                }
                if (!itkVar.a(4) || (text = textView3.getText()) == null || drm0.N(text)) {
                    f4m.j(textView3);
                } else {
                    textView3.setVisibility(0);
                }
                if (itkVar.a(8)) {
                    view4.setVisibility(0);
                    view3.setVisibility(0);
                    view2.setVisibility(0);
                } else {
                    f4m.j(view4);
                    f4m.j(view3);
                    f4m.j(view2);
                }
                if (itkVar.a(63)) {
                    imageView3.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_secondary, vkPassportView3.getContext())));
                    textView2.setTextSize(14.0f);
                    f4m.u(textView2, 0, 0, 0, 0);
                } else {
                    imageView3.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_accent, vkPassportView3.getContext())));
                    textView2.setTextSize(14.0f);
                    f4m.u(textView2, iah0.a(2), iah0.a(3), 0, iah0.a(2.5f));
                }
                cVar = wav0Var2.c;
                TextView textView5 = bVar2.k;
                View view5 = bVar2.r;
                boolean z = cVar instanceof c.b;
                boolean z2 = !z;
                int i4 = z ? R.drawable.vk_profile_dashboard_vkpay_ripple_left_corner : R.drawable.vk_profile_dashboard_vkpay_ripple_left_right_corners;
                view2.setClipToOutline(z2);
                view3.setClipToOutline(z);
                view.setBackgroundResource(i4);
                awt0.v(view5, z2);
                awt0.v(view2, z2);
                awt0.v(bVar2.t, z2);
                bVar2.j.setText(vkPassportView3.getContext().getString(R.string.vk_profile_dashboard_vkcombo_caption));
                textView5.setText(cVar.a());
                du0 du0Var = new du0(20, bVar2, cVar);
                bpn0 bpn0Var = jjc.a;
                view5.setOnClickListener(new ijc(800L, du0Var));
                if (cVar instanceof c.a) {
                    krv0.q(textView5, R.attr.vk_ui_text_primary);
                }
                eVar = wav0Var2.b;
                bVar2.l.setText(vkPassportView3.getContext().getString(R.string.vk_profile_dashboard_vkpay_caption));
                TextView textView6 = bVar2.m;
                textView6.setText(eVar.a());
                if (!(eVar instanceof e.a)) {
                    drawable = null;
                    i2 = 0;
                } else {
                    if (!(eVar instanceof e.c)) {
                        if (eVar instanceof e.d) {
                            textView6.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                            krv0.q(textView6, R.attr.vk_ui_text_accent);
                        } else {
                            if (!(eVar instanceof e.b)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            textView6.setCompoundDrawablePadding(iah0.a(4));
                            textView6.setCompoundDrawablesWithIntrinsicBounds(enj.e(R.drawable.vk_icon_payment_card_outline_16, R.attr.vk_ui_icon_secondary, textView6.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
                            krv0.q(textView6, R.attr.vk_ui_text_primary);
                        }
                        view.setOnClickListener(new ijc(800L, new gs80(i3, bVar2, eVar)));
                        a3i0 a3i0Var = (a3i0) bVar2.B.getValue();
                        VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo = wav0Var2.d;
                        imageView = a3i0Var.e;
                        bpn0 bpn0Var2 = a3i0Var.f;
                        imageView2 = a3i0Var.d;
                        textView = a3i0Var.c;
                        vkPassportView = a3i0Var.a;
                        itk itkVar2 = a3i0Var.b;
                        boolean z3 = !itkVar2.a(16) && itkVar2.a(32);
                        if (e370.t != null || z3 || vkPassportContract$VkSecurityInfo == VkPassportContract$VkSecurityInfo.NO_WARNING) {
                            vkPassportView.setFlowTypeField(null);
                            f4m.j(textView);
                            f4m.j(imageView2);
                            f4m.j(imageView);
                        } else {
                            awt0.v(textView, !itkVar2.a(16));
                            awt0.v(imageView2, !itkVar2.a(16));
                            awt0.v(imageView, !itkVar2.a(32));
                            textView.setText(R.string.vk_security_protect_account_text);
                            vkPassportView.setStartIcon((Drawable) bpn0Var2.getValue());
                            vkPassportView.setActionIcon((Drawable) bpn0Var2.getValue());
                            int[] iArr = a3i0.a.$EnumSwitchMapping$0;
                            int i5 = iArr[vkPassportContract$VkSecurityInfo.ordinal()];
                            if (i5 == 1) {
                                color = vkPassportView.getContext().getColor(R.color.vk_red_nice);
                            } else if (i5 == 2) {
                                color = vkPassportView.getContext().getColor(R.color.vk_orange);
                            } else {
                                if (i5 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                color = android.R.color.transparent;
                            }
                            vkPassportView.setStartIconColor(color);
                            vkPassportView.setActionIconColor(color);
                            int i6 = iArr[vkPassportContract$VkSecurityInfo.ordinal()];
                            if (i6 == 1) {
                                vkPassportView.setFlowTypeField("warning_level_1");
                            } else if (i6 == 2) {
                                vkPassportView.setFlowTypeField("warning_level_2");
                            } else {
                                if (i6 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                vkPassportView.setFlowTypeField(null);
                            }
                            boolean z4 = (itkVar2.a(16) && itkVar2.a(32)) ? false : true;
                            int i7 = iArr[vkPassportContract$VkSecurityInfo.ordinal()];
                            if (i7 == 1) {
                                f = e3m.f(R.attr.vk_ui_text_accent, vkPassportView.getContext());
                            } else if (i7 == 2) {
                                f = e3m.f(R.attr.vk_ui_text_accent, vkPassportView.getContext());
                            } else {
                                if (i7 != 3) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                f = e3m.f(R.attr.vk_ui_icon_secondary, vkPassportView.getContext());
                            }
                            if (z4) {
                                vkPassportView.setEndIconColor(f);
                            }
                            if (!itkVar2.a(32)) {
                                String string = vkPassportView.getContext().getString(R.string.vk_security_protect_account_text);
                                TextViewEllipsizeEnd textViewEllipsizeEnd = vkPassportView.d;
                                if (textViewEllipsizeEnd == null) {
                                    textViewEllipsizeEnd = null;
                                }
                                textViewEllipsizeEnd.b(string, string, false, true);
                            }
                        }
                        rr1 rr1Var = vkPassportView3.y.a;
                        Object obj = rr1Var.c;
                        d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.SHOW_BAR_LK, (String) rr1Var.a, (String) rr1Var.b);
                        reu0Var.g = false;
                        cVar2 = reu0Var.e;
                        if (cVar2 != null) {
                            cVar2.dispose();
                        }
                        reu0Var.e = null;
                        return s3q0.a;
                    }
                    i2 = 0;
                    drawable = null;
                }
                textView6.setCompoundDrawablePadding(i2);
                textView6.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable, drawable, drawable);
                krv0.q(textView6, R.attr.vk_ui_text_accent);
                view.setOnClickListener(new ijc(800L, new gs80(i3, bVar2, eVar)));
                a3i0 a3i0Var2 = (a3i0) bVar2.B.getValue();
                VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo2 = wav0Var2.d;
                imageView = a3i0Var2.e;
                bpn0 bpn0Var22 = a3i0Var2.f;
                imageView2 = a3i0Var2.d;
                textView = a3i0Var2.c;
                vkPassportView = a3i0Var2.a;
                itk itkVar22 = a3i0Var2.b;
                if (itkVar22.a(16)) {
                }
                if (e370.t != null) {
                }
                vkPassportView.setFlowTypeField(null);
                f4m.j(textView);
                f4m.j(imageView2);
                f4m.j(imageView);
                rr1 rr1Var2 = vkPassportView3.y.a;
                Object obj2 = rr1Var2.c;
                d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.SHOW_BAR_LK, (String) rr1Var2.a, (String) rr1Var2.b);
                reu0Var.g = false;
                cVar2 = reu0Var.e;
                if (cVar2 != null) {
                }
                reu0Var.e = null;
                return s3q0.a;
            }
            str = str2;
            em90Var.c.setText(replace);
            em90Var.d.setText(str);
            int i32 = 1;
            if (itkVar.a(1)) {
            }
            if (itkVar.a(2)) {
            }
            f4m.j(textView4);
            if (itkVar.a(4)) {
            }
            f4m.j(textView3);
            if (itkVar.a(8)) {
            }
            if (itkVar.a(63)) {
            }
            cVar = wav0Var2.c;
            TextView textView52 = bVar2.k;
            View view52 = bVar2.r;
            boolean z5 = cVar instanceof c.b;
            boolean z22 = !z5;
            if (z5) {
            }
            view2.setClipToOutline(z22);
            view3.setClipToOutline(z5);
            view.setBackgroundResource(i4);
            awt0.v(view52, z22);
            awt0.v(view2, z22);
            awt0.v(bVar2.t, z22);
            bVar2.j.setText(vkPassportView3.getContext().getString(R.string.vk_profile_dashboard_vkcombo_caption));
            textView52.setText(cVar.a());
            du0 du0Var2 = new du0(20, bVar2, cVar);
            bpn0 bpn0Var3 = jjc.a;
            view52.setOnClickListener(new ijc(800L, du0Var2));
            if (cVar instanceof c.a) {
            }
            eVar = wav0Var2.b;
            bVar2.l.setText(vkPassportView3.getContext().getString(R.string.vk_profile_dashboard_vkpay_caption));
            TextView textView62 = bVar2.m;
            textView62.setText(eVar.a());
            if (!(eVar instanceof e.a)) {
            }
            textView62.setCompoundDrawablePadding(i2);
            textView62.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable, drawable, drawable);
            krv0.q(textView62, R.attr.vk_ui_text_accent);
            view.setOnClickListener(new ijc(800L, new gs80(i32, bVar2, eVar)));
            a3i0 a3i0Var22 = (a3i0) bVar2.B.getValue();
            VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo22 = wav0Var2.d;
            imageView = a3i0Var22.e;
            bpn0 bpn0Var222 = a3i0Var22.f;
            imageView2 = a3i0Var22.d;
            textView = a3i0Var22.c;
            vkPassportView = a3i0Var22.a;
            itk itkVar222 = a3i0Var22.b;
            if (itkVar222.a(16)) {
            }
            if (e370.t != null) {
            }
            vkPassportView.setFlowTypeField(null);
            f4m.j(textView);
            f4m.j(imageView2);
            f4m.j(imageView);
            rr1 rr1Var22 = vkPassportView3.y.a;
            Object obj22 = rr1Var22.c;
            d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.SHOW_BAR_LK, (String) rr1Var22.a, (String) rr1Var22.b);
            reu0Var.g = false;
            cVar2 = reu0Var.e;
            if (cVar2 != null) {
            }
            reu0Var.e = null;
            return s3q0.a;
        }
    }

    /* compiled from: VkBasePassportPresenter.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<vgg, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(vgg vggVar) {
            vgg vggVar2 = vggVar;
            reu0 reu0Var = (reu0) this.receiver;
            reu0Var.getClass();
            Throwable th = vggVar2.a;
            reu0Var.a.a(4, 8, 0);
            reu0Var.g = true;
            if (!(th instanceof IOException) && (!(th instanceof VKApiExecutionException) || ((VKApiExecutionException) th).s() != -1)) {
                vggVar2.c();
            } else if (!hg1.d(reu0Var.e)) {
                com.vk.core.utils.newtork.b.a.getClass();
                io.reactivex.rxjava3.subjects.d<com.vk.core.utils.newtork.d> dVar = com.vk.core.utils.newtork.b.d;
                dVar.getClass();
                reu0Var.e = new io.reactivex.rxjava3.internal.operators.observable.i0(new io.reactivex.rxjava3.internal.operators.observable.y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a), new hg1.r4()).U(new hg1.q4()).y(2L, TimeUnit.SECONDS).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new j3z(new xvl0(reu0Var, 16), 24));
            }
            return s3q0.a;
        }
    }

    public reu0(VkPassportView vkPassportView, seu0 seu0Var) {
        this.a = vkPassportView;
        this.b = seu0Var;
    }

    @Override // xsna.xav0
    public final void a() {
        d(true, false);
    }

    @Override // xsna.xav0
    public final void b(com.vk.auth.passport.e eVar) {
        boolean z = eVar instanceof e.d;
        seu0 seu0Var = this.b;
        if (z) {
            d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLICK_VK_PAY, (String) seu0Var.a.a, null);
        } else if ((eVar instanceof e.a) || (eVar instanceof e.c)) {
            d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLICK_VK_PAY, (String) seu0Var.a.a, null);
        } else {
            if (!(eVar instanceof e.b)) {
                throw new NoWhenBranchMatchedException();
            }
            d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLICK_VK_PAY, (String) seu0Var.a.a, null);
        }
    }

    @Override // xsna.xav0
    public final void c(com.vk.auth.passport.c cVar) {
        boolean z = cVar instanceof c.a;
        seu0 seu0Var = this.b;
        if (z) {
            d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLICK_VK_COMBO, (String) seu0Var.a.a, null);
        } else if (cVar instanceof c.C0412c) {
            d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.CLICK_VK_COMBO, (String) seu0Var.a.a, null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0155, code lost:
    
        if (r4 == null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0447  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(boolean z, boolean z2) {
        int i;
        Drawable drawable;
        int i2;
        ImageView imageView;
        ImageView imageView2;
        TextView textView;
        VkPassportView vkPassportView;
        io.reactivex.rxjava3.disposables.c cVar;
        int color;
        int f;
        CharSequence text;
        CharSequence text2;
        io.reactivex.rxjava3.core.x xVar;
        io.reactivex.rxjava3.core.x oVar;
        peu0 peu0Var = this.f;
        com.vk.auth.passport.a aVar = peu0Var.a;
        wav0 wav0Var = peu0Var.b;
        if (peu0Var.c + ExponentialAlgorithm.DEFAULT_MAX_INTERVAL_MS < SystemClock.elapsedRealtime() || wav0Var == null) {
            wav0Var = null;
        }
        boolean z3 = z || (wav0Var == null && !hg1.d(this.c));
        int i3 = 2;
        int i4 = 20;
        if (z3) {
            io.reactivex.rxjava3.disposables.c cVar2 = this.c;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            peu0 peu0Var2 = this.f;
            int i5 = 24;
            if (z3 || peu0Var2.b == null) {
                com.vk.auth.passport.a aVar2 = peu0Var2.a;
                wdx0 wdx0Var = e370.f;
                if (wdx0Var == null) {
                    wdx0Var = null;
                }
                if (wdx0Var.k()) {
                    vdx0 vdx0Var = e370.e;
                    if (vdx0Var == null) {
                        vdx0Var = null;
                    }
                    xVar = vdx0Var.a().h().l(new s7(new qey(aVar2, i4), 28));
                } else {
                    xVar = io.reactivex.rxjava3.internal.operators.single.a0.b;
                }
                s440 s440Var = new s440(new mmm0(peu0Var2, 18), i5);
                xVar.getClass();
                oVar = new io.reactivex.rxjava3.internal.operators.single.o(xVar, s440Var);
            } else {
                oVar = io.reactivex.rxjava3.core.x.k(peu0Var2.b);
            }
            this.c = mnh0.C(z2 ? new io.reactivex.rxjava3.internal.operators.single.n(oVar, new miq0(new j6l0(this, 24), i3)) : oVar, (ygg) this.k.getValue(), new a(1, this, reu0.class, "onSuccess", "onSuccess(Lcom/vk/auth/passport/VkPassportContract$PassportData;)V", 0), new b(1, this, reu0.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Lcom/vk/superapp/core/errors/CommonApiError;)V", 0), null);
            return;
        }
        if (wav0Var != null) {
            VkPassportView vkPassportView2 = this.a;
            vkPassportView2.a(8, 0, 8);
            com.vk.auth.passport.b bVar = vkPassportView2.u;
            if (bVar == null) {
                bVar = null;
            }
            View view = bVar.q;
            d.a aVar3 = wav0Var.a;
            TextView textView2 = bVar.h;
            VkPassportView vkPassportView3 = bVar.a;
            ImageView imageView3 = bVar.i;
            View view2 = bVar.s;
            View view3 = bVar.n;
            View view4 = bVar.o;
            com.vk.core.ui.image.a<View> aVar4 = bVar.b;
            TextView textView3 = bVar.g;
            TextView textView4 = bVar.f;
            itk itkVar = bVar.c;
            em90 em90Var = bVar.C;
            pzd0 pzd0Var = aVar3.a;
            em90Var.getClass();
            String str = pzd0Var.f;
            String str2 = pzd0Var.d;
            com.vk.auth.passport.b bVar2 = bVar;
            em90Var.b.h(pzd0Var.a, pzd0Var.e, adu0.a(6, em90Var.a.getContext()));
            String a2 = pzd0Var.a();
            String a3 = (a2 == null || drm0.N(a2)) ? null : pzd0Var.a();
            String replace = (str2 == null || drm0.N(str2)) ? null : str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183);
            if (str == null || drm0.N(str)) {
                str = null;
            }
            if (a3 == null) {
                if (replace != null) {
                    a3 = replace;
                    replace = str;
                } else {
                    a3 = str;
                    replace = null;
                }
            }
            em90Var.c.setText(a3);
            em90Var.d.setText(replace);
            if (itkVar.a(1)) {
                f4m.j(aVar4.getView());
                i = 0;
            } else {
                i = 0;
                aVar4.getView().setVisibility(0);
            }
            if (itkVar.a(2) || (text2 = textView4.getText()) == null || drm0.N(text2)) {
                f4m.j(textView4);
            } else {
                textView4.setVisibility(i);
            }
            if (itkVar.a(4) || (text = textView3.getText()) == null || drm0.N(text)) {
                f4m.j(textView3);
            } else {
                textView3.setVisibility(0);
            }
            if (itkVar.a(8)) {
                f4m.j(view4);
                f4m.j(view3);
                f4m.j(view2);
            } else {
                view4.setVisibility(0);
                view3.setVisibility(0);
                view2.setVisibility(0);
            }
            if (itkVar.a(63)) {
                imageView3.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_text_accent, vkPassportView3.getContext())));
                textView2.setTextSize(14.0f);
                f4m.u(textView2, iah0.a(2), iah0.a(3), 0, iah0.a(2.5f));
            } else {
                imageView3.setImageTintList(ColorStateList.valueOf(e3m.f(R.attr.vk_ui_icon_secondary, vkPassportView3.getContext())));
                textView2.setTextSize(14.0f);
                f4m.u(textView2, 0, 0, 0, 0);
            }
            com.vk.auth.passport.c cVar3 = wav0Var.c;
            TextView textView5 = bVar2.k;
            View view5 = bVar2.r;
            boolean z4 = cVar3 instanceof c.b;
            boolean z5 = !z4;
            int i6 = !z4 ? R.drawable.vk_profile_dashboard_vkpay_ripple_left_corner : R.drawable.vk_profile_dashboard_vkpay_ripple_left_right_corners;
            view2.setClipToOutline(z5);
            view3.setClipToOutline(z4);
            view.setBackgroundResource(i6);
            awt0.v(view5, z5);
            awt0.v(view2, z5);
            awt0.v(bVar2.t, z5);
            bVar2.j.setText(vkPassportView3.getContext().getString(R.string.vk_profile_dashboard_vkcombo_caption));
            textView5.setText(cVar3.a());
            du0 du0Var = new du0(20, bVar2, cVar3);
            bpn0 bpn0Var = jjc.a;
            view5.setOnClickListener(new ijc(800L, du0Var));
            if (cVar3 instanceof c.a) {
                krv0.q(textView5, R.attr.vk_ui_text_primary);
            }
            com.vk.auth.passport.e eVar = wav0Var.b;
            bVar2.l.setText(vkPassportView3.getContext().getString(R.string.vk_profile_dashboard_vkpay_caption));
            TextView textView6 = bVar2.m;
            textView6.setText(eVar.a());
            if (eVar instanceof e.a) {
                drawable = null;
                i2 = 0;
            } else {
                if (!(eVar instanceof e.c)) {
                    if (eVar instanceof e.d) {
                        textView6.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                        krv0.q(textView6, R.attr.vk_ui_text_accent);
                    } else {
                        if (!(eVar instanceof e.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        textView6.setCompoundDrawablePadding(iah0.a(4));
                        textView6.setCompoundDrawablesWithIntrinsicBounds(enj.e(R.drawable.vk_icon_payment_card_outline_16, R.attr.vk_ui_icon_secondary, textView6.getContext()), (Drawable) null, (Drawable) null, (Drawable) null);
                        krv0.q(textView6, R.attr.vk_ui_text_primary);
                    }
                    view.setOnClickListener(new ijc(800L, new gs80(1, bVar2, eVar)));
                    a3i0 a3i0Var = (a3i0) bVar2.B.getValue();
                    VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo = wav0Var.d;
                    imageView = a3i0Var.e;
                    bpn0 bpn0Var2 = a3i0Var.f;
                    imageView2 = a3i0Var.d;
                    textView = a3i0Var.c;
                    vkPassportView = a3i0Var.a;
                    itk itkVar2 = a3i0Var.b;
                    boolean z6 = !itkVar2.a(16) && itkVar2.a(32);
                    if (e370.t != null || z6 || vkPassportContract$VkSecurityInfo == VkPassportContract$VkSecurityInfo.NO_WARNING) {
                        vkPassportView.setFlowTypeField(null);
                        f4m.j(textView);
                        f4m.j(imageView2);
                        f4m.j(imageView);
                    } else {
                        awt0.v(textView, !itkVar2.a(16));
                        awt0.v(imageView2, !itkVar2.a(16));
                        awt0.v(imageView, !itkVar2.a(32));
                        textView.setText(R.string.vk_security_protect_account_text);
                        vkPassportView.setStartIcon((Drawable) bpn0Var2.getValue());
                        vkPassportView.setActionIcon((Drawable) bpn0Var2.getValue());
                        int[] iArr = a3i0.a.$EnumSwitchMapping$0;
                        int i7 = iArr[vkPassportContract$VkSecurityInfo.ordinal()];
                        if (i7 == 1) {
                            color = vkPassportView.getContext().getColor(R.color.vk_red_nice);
                        } else if (i7 == 2) {
                            color = vkPassportView.getContext().getColor(R.color.vk_orange);
                        } else {
                            if (i7 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            color = android.R.color.transparent;
                        }
                        vkPassportView.setStartIconColor(color);
                        vkPassportView.setActionIconColor(color);
                        int i8 = iArr[vkPassportContract$VkSecurityInfo.ordinal()];
                        if (i8 == 1) {
                            vkPassportView.setFlowTypeField("warning_level_1");
                        } else if (i8 == 2) {
                            vkPassportView.setFlowTypeField("warning_level_2");
                        } else {
                            if (i8 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            vkPassportView.setFlowTypeField(null);
                        }
                        boolean z7 = (itkVar2.a(16) && itkVar2.a(32)) ? false : true;
                        int i9 = iArr[vkPassportContract$VkSecurityInfo.ordinal()];
                        if (i9 == 1) {
                            f = e3m.f(R.attr.vk_ui_text_accent, vkPassportView.getContext());
                        } else if (i9 == 2) {
                            f = e3m.f(R.attr.vk_ui_text_accent, vkPassportView.getContext());
                        } else {
                            if (i9 != 3) {
                                throw new NoWhenBranchMatchedException();
                            }
                            f = e3m.f(R.attr.vk_ui_icon_secondary, vkPassportView.getContext());
                        }
                        if (z7) {
                            vkPassportView.setEndIconColor(f);
                        }
                        if (!itkVar2.a(32)) {
                            String string = vkPassportView.getContext().getString(R.string.vk_security_protect_account_text);
                            TextViewEllipsizeEnd textViewEllipsizeEnd = vkPassportView.d;
                            if (textViewEllipsizeEnd == null) {
                                textViewEllipsizeEnd = null;
                            }
                            textViewEllipsizeEnd.b(string, string, false, true);
                        }
                    }
                    rr1 rr1Var = vkPassportView3.y.a;
                    Object obj = rr1Var.c;
                    d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.SHOW_BAR_LK, (String) rr1Var.a, (String) rr1Var.b);
                    this.g = false;
                    cVar = this.e;
                    if (cVar != null) {
                        cVar.dispose();
                    }
                    this.e = null;
                }
                i2 = 0;
                drawable = null;
            }
            textView6.setCompoundDrawablePadding(i2);
            textView6.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable, drawable, drawable);
            krv0.q(textView6, R.attr.vk_ui_text_accent);
            view.setOnClickListener(new ijc(800L, new gs80(1, bVar2, eVar)));
            a3i0 a3i0Var2 = (a3i0) bVar2.B.getValue();
            VkPassportContract$VkSecurityInfo vkPassportContract$VkSecurityInfo2 = wav0Var.d;
            imageView = a3i0Var2.e;
            bpn0 bpn0Var22 = a3i0Var2.f;
            imageView2 = a3i0Var2.d;
            textView = a3i0Var2.c;
            vkPassportView = a3i0Var2.a;
            itk itkVar22 = a3i0Var2.b;
            if (itkVar22.a(16)) {
            }
            if (e370.t != null) {
            }
            vkPassportView.setFlowTypeField(null);
            f4m.j(textView);
            f4m.j(imageView2);
            f4m.j(imageView);
            rr1 rr1Var2 = vkPassportView3.y.a;
            Object obj2 = rr1Var2.c;
            d0h0.a(SchemeStatSak$TypeVkConnectNavigationItem.EventType.SHOW_BAR_LK, (String) rr1Var2.a, (String) rr1Var2.b);
            this.g = false;
            cVar = this.e;
            if (cVar != null) {
            }
            this.e = null;
        }
    }
}
