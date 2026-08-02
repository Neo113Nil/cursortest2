package xsna;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.view.disableable.DisableableRelativeLayout;
import com.vk.core.tool.view.vkblur.VkBlurContentView;
import com.vk.dto.common.Source;
import com.vk.dto.messages.MsgIdType;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.PinnedMsg;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.fragments.chat.ChatFragment;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.jr4;
import xsna.k840;

/* compiled from: BannerController.kt */
/* loaded from: classes2.dex */
public final class b26 {
    public static final long p = TimeUnit.SECONDS.toMillis(3);
    public final FragmentActivity a;
    public final mxv b;
    public final fl4 c;
    public final com.vk.im.engine.internal.storage.delegates.messages.b d;
    public final pim e;
    public final xam f;
    public final ebm g;
    public final jr4 h;
    public final qmb i;
    public final iem j;
    public p36 k;
    public boolean l;
    public ChatFragment.b m;
    public final LinkedHashSet n;
    public a o;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: BannerController.kt */
    public static final class a {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a BAR;
        public static final a BUSINESS_NOTIFY;
        public static final a CHAT_AUDIO_PLAYER;
        public static final a GROUP_CALL;
        public static final a PINNED;
        public static final a PLAYER;
        private final int priority;

        static {
            a aVar = new a("PINNED", 0, 1);
            PINNED = aVar;
            a aVar2 = new a("BUSINESS_NOTIFY", 1, 2);
            BUSINESS_NOTIFY = aVar2;
            a aVar3 = new a("BAR", 2, 3);
            BAR = aVar3;
            a aVar4 = new a("CHAT_AUDIO_PLAYER", 3, 4);
            CHAT_AUDIO_PLAYER = aVar4;
            a aVar5 = new a("PLAYER", 4, 4);
            PLAYER = aVar5;
            a aVar6 = new a("GROUP_CALL", 5, 5);
            GROUP_CALL = aVar6;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5, aVar6};
            $VALUES = aVarArr;
            $ENTRIES = new asp(aVarArr);
        }

        public a(String str, int i, int i2) {
            this.priority = i2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        public final int h() {
            return this.priority;
        }
    }

    /* compiled from: BannerController.kt */
    public final class b {
        public b() {
        }
    }

    /* compiled from: BannerController.kt */
    public final class c {
        public c() {
        }

        public final void a(boolean z) {
            b26 b26Var = b26.this;
            if (z) {
                b26.n(b26Var, a.BUSINESS_NOTIFY, true);
            } else {
                if (z) {
                    throw new NoWhenBranchMatchedException();
                }
                b26Var.g(a.BUSINESS_NOTIFY, true, 0L);
            }
        }
    }

    /* compiled from: BannerController.kt */
    public final class d {
        public d() {
        }
    }

    /* compiled from: BannerController.kt */
    public final class e {
        public e() {
        }
    }

    /* compiled from: BannerController.kt */
    public final class f {
        public f() {
        }
    }

    /* compiled from: BannerController.kt */
    public final class g implements jr4.a {
        public g() {
        }

        @Override // xsna.jr4.a
        public final void a() {
            b26 b26Var = b26.this;
            if (b26Var.h.j.t()) {
                b26.n(b26Var, a.PLAYER, true);
            } else {
                b26Var.g(a.PLAYER, true, 0L);
            }
        }

        @Override // xsna.jr4.a
        public final void b(i34 i34Var) {
            ChatFragment.b bVar = b26.this.m;
            if (bVar != null) {
                ChatFragment chatFragment = ChatFragment.this;
                mxv mxvVar = chatFragment.r0;
                Msg a = i34Var.b.a();
                PinnedMsg b = i34Var.b();
                if (a == null) {
                    if (b != null) {
                        o0w b2 = mxvVar.b();
                        FragmentActivity kn = chatFragment.kn();
                        DialogExt dialogExt = chatFragment.V;
                        b2.z(kn, b, dialogExt != null ? dialogExt : null, chatFragment.no());
                        return;
                    }
                    return;
                }
                DialogExt dialogExt2 = chatFragment.V;
                if (dialogExt2 == null) {
                    dialogExt2 = null;
                }
                if (dialogExt2.e != chatFragment.ho()) {
                    o0w b3 = mxvVar.b();
                    Context requireContext = chatFragment.requireContext();
                    Long valueOf = Long.valueOf(chatFragment.no().b);
                    DialogExt dialogExt3 = chatFragment.V;
                    o0w.x(b3, requireContext, valueOf, (dialogExt3 == null ? null : dialogExt3).e, dialogExt3 == null ? null : dialogExt3, null, new MsgListOpenAtMsgMode(MsgIdType.LOCAL_ID, a.b), true, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 1073741712);
                    return;
                }
                com.vk.im.ui.components.msg_list.a aVar = chatFragment.H0;
                if (aVar == null) {
                    aVar = null;
                }
                MsgIdType msgIdType = MsgIdType.LOCAL_ID;
                aVar.a2(msgIdType, a.b, "openAttachHolder");
                com.vk.im.ui.components.msg_list.a aVar2 = chatFragment.H0;
                (aVar2 != null ? aVar2 : null).w1(msgIdType, a.b);
            }
        }

        @Override // xsna.jr4.a
        public final void c() {
            b26.n(b26.this, a.PLAYER, true);
        }

        @Override // xsna.jr4.a
        public final void d() {
            b26.this.g(a.PLAYER, true, 0L);
        }
    }

    /* compiled from: BannerController.kt */
    public static final /* synthetic */ class h {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.PLAYER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.CHAT_AUDIO_PLAYER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[a.PINNED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[a.BUSINESS_NOTIFY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[a.BAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[a.GROUP_CALL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b26(FragmentActivity fragmentActivity, a1w a1wVar, mxv mxvVar, pbw pbwVar, fl4 fl4Var, kkm kkmVar, int i, com.vk.im.engine.internal.storage.delegates.messages.b bVar) {
        this.a = fragmentActivity;
        this.b = mxvVar;
        this.c = fl4Var;
        this.d = bVar;
        pim pimVar = new pim(a1wVar, pbwVar, kkmVar);
        this.e = pimVar;
        xam xamVar = new xam(fragmentActivity, a1wVar, mxvVar, pbwVar, kkmVar);
        this.f = xamVar;
        ebm ebmVar = new ebm(fragmentActivity, a1wVar, mxvVar, kkmVar);
        this.g = ebmVar;
        jr4 jr4Var = new jr4(a1wVar, mxvVar.m(), jw5.e, new g(), kkmVar);
        this.h = jr4Var;
        this.i = new qmb(fragmentActivity, new d(), fl4Var, k840.a.g().b(), kkmVar);
        this.j = i == 2 ? null : new iem(a1wVar, kkmVar, new e());
        pimVar.o = new f();
        xamVar.x = new b();
        ebmVar.p = new c();
        jr4Var.l = new g();
        this.n = new LinkedHashSet();
    }

    public static void n(b26 b26Var, a aVar, boolean z) {
        a aVar2;
        LinkedHashSet linkedHashSet = b26Var.n;
        if (b26Var.k == null || (aVar2 = b26Var.o) == aVar) {
            return;
        }
        if (aVar2 != null) {
            if (aVar.h() < aVar2.h()) {
                Iterator it = linkedHashSet.iterator();
                while (it.hasNext()) {
                    if (((a) it.next()) == aVar) {
                        it.remove();
                    }
                }
                linkedHashSet.add(aVar);
                return;
            }
            b26Var.o = aVar;
            Iterator it2 = linkedHashSet.iterator();
            while (it2.hasNext()) {
                if (((a) it2.next()) == aVar) {
                    it2.remove();
                }
            }
            linkedHashSet.add(aVar2);
            b26Var.h(aVar2, z, 0L);
            b26Var.o(aVar, z, 0L);
            return;
        }
        b26Var.o = aVar;
        b26Var.o(aVar, z, 0L);
        p36 p36Var = b26Var.k;
        if (p36Var != null) {
            jv1 jv1Var = (jv1) p36Var.u.getValue();
            if (!z) {
                jv1Var.a();
                View view = jv1Var.a;
                view.setVisibility(0);
                view.setAlpha(1.0f);
                return;
            }
            View view2 = jv1Var.a;
            if (jv1Var.f == null && !bwt0.K(view2)) {
                jv1Var.a();
                float alpha = jv1Var.g != null ? view2.getAlpha() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                view2.setVisibility(0);
                view2.setAlpha(alpha);
                ViewPropertyAnimator alpha2 = view2.animate().setStartDelay(0L).setInterpolator(jv1Var.b).setDuration(jv1Var.d).withEndAction(new iv1(jv1Var, 0)).alpha(1.0f);
                alpha2.start();
                jv1Var.f = alpha2;
            }
        }
    }

    public final void a(LayoutInflater layoutInflater, DisableableRelativeLayout disableableRelativeLayout, ViewStub viewStub) {
        Dialog dialog;
        qmb qmbVar = this.i;
        iem iemVar = this.j;
        pim pimVar = this.e;
        xam xamVar = this.f;
        p36 p36Var = new p36(pimVar, xamVar, this.g, this.h, qmbVar, iemVar, layoutInflater, disableableRelativeLayout, viewStub);
        this.k = p36Var;
        p36Var.w = this.m;
        ViewGroup viewGroup = p36Var.g;
        if (viewGroup != null) {
            awt0.i(viewGroup, new defpackage.h(this, 5));
        }
        if (pimVar.Z0()) {
            g(a.PINNED, false, 0L);
        } else {
            PinnedMsg a2 = pimVar.l.a();
            boolean b2 = pimVar.l.b();
            if (a2 == null || !b2) {
                g(a.PINNED, this.l, 0L);
            } else {
                n(this, a.PINNED, this.l);
            }
        }
        ktk0 ktk0Var = xamVar.t;
        if (ktk0Var.c && ktk0Var.a.d.d()) {
            g(a.BAR, false, 0L);
        } else if (xamVar.t.a() == null) {
            g(a.BAR, this.l, 0L);
        } else {
            n(this, a.BAR, this.l);
        }
        ypp yppVar = this.g.m.b;
        if ((yppVar == null || (dialog = (Dialog) yppVar.d) == null) ? false : dialog.Bb()) {
            n(this, a.BUSINESS_NOTIFY, false);
        }
        if (this.h.j.t()) {
            n(this, a.PLAYER, false);
        }
        if (this.i.l.b() != null) {
            n(this, a.CHAT_AUDIO_PLAYER, false);
        }
    }

    public final void b() {
        this.e.G0();
        this.f.G0();
        this.g.G0();
        this.h.G0();
        this.i.G0();
        iem iemVar = this.j;
        if (iemVar != null) {
            iemVar.G0();
        }
    }

    public final void c() {
        p36 p36Var = this.k;
        if (p36Var != null) {
            p36.a(p36Var.a, (tnp0) p36Var.o.getValue(), p36Var.h);
            p36.a(p36Var.b, (tnp0) p36Var.p.getValue(), p36Var.i);
            p36.a(p36Var.c, (tnp0) p36Var.q.getValue(), p36Var.j);
            p36.a(p36Var.d, (tnp0) p36Var.r.getValue(), p36Var.k);
            p36.a(p36Var.e, (tnp0) p36Var.s.getValue(), p36Var.l);
            iem iemVar = p36Var.f;
            if (iemVar != null) {
                p36.a(iemVar, (tnp0) p36Var.t.getValue(), p36Var.m);
            }
        }
        this.k = null;
    }

    public final int d() {
        p36 p36Var = this.k;
        if (p36Var != null) {
            return p36Var.c();
        }
        return 0;
    }

    public final int e() {
        View view;
        View view2;
        tim timVar = this.e.m;
        Integer num = null;
        Integer valueOf = (timVar == null || (view2 = timVar.b) == null) ? null : Integer.valueOf(view2.getMeasuredHeight());
        if (valueOf != null) {
            return valueOf.intValue();
        }
        zam zamVar = this.f.u;
        if (zamVar != null && (view = zamVar.b) != null) {
            num = Integer.valueOf(view.getMeasuredHeight());
        }
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    public final void f() {
        Dialog Cb;
        xam xamVar = this.f;
        ktk0 ktk0Var = xamVar.t;
        if (ktk0Var.h && (Cb = ktk0Var.a.Cb()) != null && Cb.t1() && !Cb.Jc()) {
            xamVar.n.b(xamVar.j.C(xamVar, new yim(Cb.Zb())).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new i22(new qp3(xamVar, 3), 16)));
        }
    }

    public final void g(a aVar, boolean z, long j) {
        a aVar2;
        Object next;
        if (this.k == null || (aVar2 = this.o) == null) {
            return;
        }
        LinkedHashSet linkedHashSet = this.n;
        if (aVar2 != aVar) {
            linkedHashSet.remove(aVar);
            return;
        }
        Iterator it = linkedHashSet.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                int h2 = ((a) next).h();
                do {
                    Object next2 = it.next();
                    int h3 = ((a) next2).h();
                    if (h2 < h3) {
                        next = next2;
                        h2 = h3;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        a aVar3 = (a) next;
        if (aVar3 != null) {
            this.o = aVar3;
            linkedHashSet.remove(aVar3);
            h(aVar, z, j);
            o(aVar3, z, j);
            return;
        }
        this.o = null;
        h(aVar, z, j);
        p36 p36Var = this.k;
        if (p36Var != null) {
            jv1 jv1Var = (jv1) p36Var.u.getValue();
            if (!z) {
                jv1Var.a();
                View view = jv1Var.a;
                view.setVisibility(8);
                view.setAlpha(1.0f);
                return;
            }
            View view2 = jv1Var.a;
            if (jv1Var.g == null && bwt0.K(view2)) {
                jv1Var.a();
                ViewPropertyAnimator viewPropertyAnimator = jv1Var.f;
                if (viewPropertyAnimator != null) {
                    j = 0;
                }
                float alpha = viewPropertyAnimator != null ? view2.getAlpha() : 1.0f;
                view2.setVisibility(0);
                view2.setAlpha(alpha);
                ViewPropertyAnimator alpha2 = view2.animate().setStartDelay(j).setInterpolator(jv1Var.c).setDuration(jv1Var.e).withEndAction(new hv1(jv1Var, 0)).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                alpha2.start();
                jv1Var.g = alpha2;
            }
        }
    }

    public final void h(a aVar, boolean z, long j) {
        iem iemVar;
        switch (h.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                p36 p36Var = this.k;
                if (p36Var != null) {
                    p36.d(z, p36Var.d, (tnp0) p36Var.r.getValue(), j);
                    return;
                }
                return;
            case 2:
                p36 p36Var2 = this.k;
                if (p36Var2 != null) {
                    p36.d(z, p36Var2.e, (tnp0) p36Var2.s.getValue(), j);
                    return;
                }
                return;
            case 3:
                p36 p36Var3 = this.k;
                if (p36Var3 != null) {
                    p36.d(z, p36Var3.a, (tnp0) p36Var3.o.getValue(), j);
                    return;
                }
                return;
            case 4:
                p36 p36Var4 = this.k;
                if (p36Var4 != null) {
                    p36.d(z, p36Var4.c, (tnp0) p36Var4.q.getValue(), j);
                    return;
                }
                return;
            case 5:
                p36 p36Var5 = this.k;
                if (p36Var5 != null) {
                    p36.d(z, p36Var5.b, (tnp0) p36Var5.p.getValue(), j);
                    return;
                }
                return;
            case 6:
                p36 p36Var6 = this.k;
                if (p36Var6 == null || (iemVar = p36Var6.f) == null) {
                    return;
                }
                p36.d(z, iemVar, (tnp0) p36Var6.t.getValue(), j);
                s3q0 s3q0Var = s3q0.a;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void i() {
        if (this.i.l.b() != null) {
            n(this, a.CHAT_AUDIO_PLAYER, false);
        } else {
            g(a.CHAT_AUDIO_PLAYER, false, 0L);
        }
    }

    public final void j() {
        if (this.h.j.t()) {
            n(this, a.PLAYER, false);
        } else {
            g(a.PLAYER, false, 0L);
        }
    }

    public final void k(DialogExt dialogExt) {
        ypp<Dialog> yppVar;
        pim pimVar = this.e;
        if (pimVar.l.b) {
            pimVar.b1();
        }
        if (dialogExt != null) {
            pimVar.a1(dialogExt);
        }
        xam xamVar = this.f;
        if (xamVar.t.b) {
            xamVar.d1();
        }
        if (dialogExt != null) {
            xamVar.c1(dialogExt);
        }
        ebm ebmVar = this.g;
        if (dialogExt != null) {
            ebmVar.getClass();
            yppVar = dialogExt.d;
        } else {
            yppVar = null;
        }
        fbm fbmVar = ebmVar.m;
        io.reactivex.rxjava3.disposables.b bVar = ebmVar.n;
        int i = 0;
        if (fbmVar.a) {
            bVar.e();
            fbm fbmVar2 = ebmVar.m;
            fbmVar2.b = null;
            fbmVar2.a = false;
            ibm ibmVar = ebmVar.o;
            if (ibmVar != null) {
                ebmVar.Z0(ibmVar);
            }
        }
        if (yppVar != null) {
            fbmVar.a = true;
            fbmVar.b = yppVar;
            bVar.b(ebmVar.j.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eyp(ebmVar, i)));
            ebmVar.Y0(Source.CACHE);
            ibm ibmVar2 = ebmVar.o;
            if (ibmVar2 != null) {
                ebmVar.Z0(ibmVar2);
            }
        }
        this.h.Y0();
        qmb qmbVar = this.i;
        qmbVar.l.P0(qmbVar.o, true);
        iem iemVar = this.j;
        if (iemVar != null) {
            io.reactivex.rxjava3.disposables.c cVar = iemVar.m;
            if (cVar != null) {
                cVar.dispose();
            }
            iemVar.m = null;
            if (dialogExt != null) {
                fhu fhuVar = iemVar.n;
                io.reactivex.rxjava3.internal.operators.observable.m1 a2 = fhuVar.a.l.a();
                asu0 asu0Var = asu0.a;
                int i2 = 18;
                int i3 = 20;
                io.reactivex.rxjava3.core.q t = new io.reactivex.rxjava3.internal.operators.observable.i0(a2.a0(asu0Var.c()), new u5(new defpackage.y(10, fhuVar, dialogExt), i2)).L(new qs6(new h1(16, fhuVar, dialogExt), i3), false).n0(fhuVar.a(dialogExt.e, Source.CACHE)).t(new d22(new m9(i2, dialogExt, fhuVar), i3));
                t.getClass();
                iemVar.m = new io.reactivex.rxjava3.internal.operators.observable.p1(io.reactivex.rxjava3.core.q.s(io.reactivex.rxjava3.core.q.T(dialogExt), t).U(new jo3(new f1j(fhuVar, i2), i3)), new defpackage.j0(new ehu(i))).a0(asu0Var.d()).r0(asu0Var.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new tp0(new s6k(iemVar, 2), i3));
            }
        }
    }

    public final void l(ChatFragment.b bVar) {
        this.m = bVar;
        p36 p36Var = this.k;
        if (p36Var != null) {
            p36Var.w = bVar;
        }
    }

    public final void m(VkBlurContentView vkBlurContentView) {
        this.e.getClass();
    }

    public final void o(a aVar, boolean z, long j) {
        iem iemVar;
        switch (h.$EnumSwitchMapping$0[aVar.ordinal()]) {
            case 1:
                p36 p36Var = this.k;
                if (p36Var != null) {
                    p36Var.e(z, p36Var.d, (tnp0) p36Var.r.getValue(), p36Var.k, j);
                    return;
                }
                return;
            case 2:
                p36 p36Var2 = this.k;
                if (p36Var2 != null) {
                    p36Var2.e(z, p36Var2.e, (tnp0) p36Var2.s.getValue(), p36Var2.l, j);
                    return;
                }
                return;
            case 3:
                p36 p36Var3 = this.k;
                if (p36Var3 != null) {
                    p36Var3.e(z, p36Var3.a, (tnp0) p36Var3.o.getValue(), p36Var3.h, j);
                    return;
                }
                return;
            case 4:
                p36 p36Var4 = this.k;
                if (p36Var4 != null) {
                    p36Var4.e(z, p36Var4.c, (tnp0) p36Var4.q.getValue(), p36Var4.j, j);
                    return;
                }
                return;
            case 5:
                p36 p36Var5 = this.k;
                if (p36Var5 != null) {
                    p36Var5.e(z, p36Var5.b, (tnp0) p36Var5.p.getValue(), p36Var5.i, j);
                    return;
                }
                return;
            case 6:
                p36 p36Var6 = this.k;
                if (p36Var6 == null || (iemVar = p36Var6.f) == null) {
                    return;
                }
                p36Var6.e(z, iemVar, (tnp0) p36Var6.t.getValue(), p36Var6.m, j);
                s3q0 s3q0Var = s3q0.a;
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final void p() {
        p36 p36Var = this.k;
        if (p36Var != null) {
            p36Var.a.V0();
            p36Var.b.V0();
            p36Var.c.V0();
            p36Var.d.V0();
            p36Var.e.V0();
            iem iemVar = p36Var.f;
            if (iemVar != null) {
                iemVar.V0();
            }
        }
    }

    public final void q() {
        p36 p36Var = this.k;
        if (p36Var != null) {
            p36Var.a.W0();
            p36Var.b.W0();
            p36Var.c.W0();
            p36Var.d.W0();
            p36Var.e.W0();
            iem iemVar = p36Var.f;
            if (iemVar != null) {
                iemVar.W0();
            }
        }
    }

    public final void r(DialogExt dialogExt) {
        xam xamVar = this.f;
        long j = xamVar.t.a.e;
        Number number = dialogExt.d.c;
        if ((number instanceof Long) && j == number.longValue()) {
            ktk0 ktk0Var = xamVar.t;
            ktk0Var.a = dialogExt;
            if (ktk0Var.c || ktk0Var.d) {
                return;
            }
            xamVar.X0();
            xamVar.e1();
            xamVar.a1(xamVar.t.a());
        }
    }
}
