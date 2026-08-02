package xsna;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.InfoBar;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.im.ui.views.InfoBarView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.b26;

/* compiled from: DialogBarComponent.kt */
/* loaded from: classes2.dex */
public final class xam extends j8i {
    public static final f9w y = e9w.a(xam.class);
    public static final String z = xam.class.getSimpleName();
    public final FragmentActivity i;
    public final a1w j;
    public final mxv k;
    public final pbw l;
    public final kkm m;
    public io.reactivex.rxjava3.disposables.c o;
    public io.reactivex.rxjava3.disposables.c p;
    public io.reactivex.rxjava3.disposables.c q;
    public io.reactivex.rxjava3.disposables.c r;
    public io.reactivex.rxjava3.disposables.c s;
    public zam u;
    public io.reactivex.rxjava3.disposables.c v;
    public io.reactivex.rxjava3.disposables.c w;
    public b26.b x;
    public final io.reactivex.rxjava3.disposables.b n = new io.reactivex.rxjava3.disposables.b();
    public ktk0 t = new ktk0(new DialogExt(0, (ProfilesInfo) null, 2, (zcl) null));

    /* compiled from: DialogBarComponent.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[InfoBar.Style.values().length];
            try {
                iArr[InfoBar.Style.OUTAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InfoBar.Style.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoBar.ButtonType.values().length];
            try {
                iArr2[InfoBar.ButtonType.LINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[InfoBar.ButtonType.GIFTS_LINK.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InfoBar.ButtonType.CALLBACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InfoBar.ButtonType.OPEN_MSG_PUSH_SETTINGS.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InfoBar.ButtonType.MESSAGE_REQUEST_DECLINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InfoBar.ButtonType.FRIEND_ADD.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[InfoBar.ButtonType.SPAM.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[InfoBar.ButtonType.OPEN_BUSINESS_NOTIFICATION_INFO.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[InfoBar.ButtonType.ANTISPAM.ordinal()] = 9;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[InfoBar.ButtonType.HIDE_BANNER.ordinal()] = 10;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[InfoBar.ButtonType.POPUP.ordinal()] = 11;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public xam(FragmentActivity fragmentActivity, a1w a1wVar, mxv mxvVar, pbw pbwVar, kkm kkmVar) {
        this.i = fragmentActivity;
        this.j = a1wVar;
        this.k = mxvVar;
        this.l = pbwVar;
        this.m = kkmVar;
    }

    public static String Y0(InfoBar infoBar) {
        Object obj;
        Iterator<T> it = infoBar.j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((InfoBar.Button) obj).d == InfoBar.ButtonType.ANTISPAM) {
                break;
            }
        }
        InfoBar.Button button = (InfoBar.Button) obj;
        if (button != null) {
            return button.g;
        }
        return null;
    }

    @Override // xsna.j8i
    public final View L0(LayoutInflater layoutInflater, ViewGroup viewGroup, ViewStub viewStub, Bundle bundle) {
        zam zamVar = new zam(layoutInflater, viewGroup, this.m);
        zamVar.h = new qkr0(this);
        this.u = zamVar;
        e1();
        return this.u.b;
    }

    @Override // xsna.j8i
    public final void M0() {
        if (this.t.b) {
            d1();
        }
        io.reactivex.rxjava3.disposables.c cVar = this.w;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.j8i
    public final void N0() {
        zam zamVar = this.u;
        if (zamVar != null) {
            zamVar.h = null;
            zamVar.b();
        }
        this.u = null;
    }

    public final void X0() {
        if (this.t.a.d.d()) {
            ktk0 ktk0Var = this.t;
            if (ktk0Var.c || ktk0Var.d) {
                return;
            }
            ktk0Var.d = true;
            int i = 0;
            this.n.b(this.j.F(this, new noz(ktk0Var.a.e, z)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new eu0(new xv2(1, this, xam.class, "onUpdateAllByActualSuccess", "onUpdateAllByActualSuccess(Lcom/vk/im/engine/models/EntityMap;)V", i, 10), 21), new t00(new q69(1, this, xam.class, "onUpdateAllByActualError", "onUpdateAllByActualError(Ljava/lang/Throwable;)V", i, 6), 22)));
        }
    }

    public final void Z0(InfoBar infoBar, String str) {
        Serializer.c<Peer> cVar = Peer.CREATOR;
        this.j.D(this, new pfm(Peer.a.b(this.t.a.e), infoBar.b, str));
        if (epx.f(this.t.g, infoBar)) {
            ktk0 ktk0Var = this.t;
            if (ktk0Var.g != null) {
                ktk0Var.g = null;
                a1(ktk0Var.a());
            }
        }
    }

    public final void a1(InfoBar infoBar) {
        b26.b bVar = this.x;
        if (bVar != null) {
            b26 b26Var = b26.this;
            if (infoBar == null) {
                b26Var.g(b26.a.BAR, true, 0L);
            } else {
                b26.n(b26Var, b26.a.BAR, true);
            }
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public final void b1(InfoBar infoBar, String str, InfoBar.ButtonType buttonType) {
        ChatFragment.b bVar;
        String str2 = infoBar.b;
        b25 a2 = o25.a();
        if (epx.f(str2, "birthday") && o25.b(a2)) {
            b26.b bVar2 = this.x;
            if (bVar2 != null && (bVar = b26.this.m) != null) {
                imv imvVar = ChatFragment.this.J0;
                if (imvVar == null) {
                    imvVar = null;
                }
                imvVar.q();
            }
        } else {
            b26.b bVar3 = this.x;
            if (bVar3 != null) {
                b26 b26Var = b26.this;
                b26Var.b.k().b(b26Var.a, str);
            }
        }
        this.l.r().d(this.t.a.e, buttonType);
    }

    public final void c1(DialogExt dialogExt) {
        ktk0 ktk0Var = new ktk0(dialogExt);
        this.t = ktk0Var;
        ktk0Var.b = true;
        Peer peer = dialogExt.f;
        FragmentActivity fragmentActivity = this.i;
        lsp0 lsp0Var = new lsp0(peer, Integer.valueOf(e3m.f(R.attr.vk_ui_icon_secondary, fragmentActivity)), fragmentActivity.getString(R.string.vkim_allow_community_send_message));
        a1w a1wVar = this.j;
        int i = 25;
        this.w = a1wVar.C(this, lsp0Var).subscribe(new tf1(new h6g(this, 8), 17), new um0(new v7(i), 24));
        io.reactivex.rxjava3.disposables.c subscribe = a1wVar.l.a().a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new kyp(this));
        io.reactivex.rxjava3.disposables.b bVar = this.n;
        bVar.b(subscribe);
        e1();
        if (a1wVar.u()) {
            ktk0 ktk0Var2 = this.t;
            if (ktk0Var2.c) {
                return;
            }
            ktk0Var2.c = true;
            ktk0Var2.e = null;
            e1();
            b26.b bVar2 = this.x;
            if (bVar2 != null) {
                b26.this.g(b26.a.BAR, false, 0L);
                s3q0 s3q0Var = s3q0.a;
            }
            int i2 = 0;
            int i3 = 7;
            bVar.b(a1wVar.F(this, new qpz(this.t.a.e, z)).m(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new j50(new e15(1, this, xam.class, "onLoadInitSuccess", "onLoadInitSuccess(Lcom/vk/im/engine/models/EntityMap;)V", i2, i3), 16), new nf1(new g15(1, this, xam.class, "onLoadInitError", "onLoadInitError(Ljava/lang/Throwable;)V", i2, i3), i)));
        }
    }

    public final void d1() {
        this.n.e();
        io.reactivex.rxjava3.disposables.c cVar = this.o;
        if (cVar != null) {
            cVar.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar2 = this.p;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar3 = this.s;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar4 = this.q;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        io.reactivex.rxjava3.disposables.c cVar5 = this.r;
        if (cVar5 != null) {
            cVar5.dispose();
        }
        this.t = new ktk0(new DialogExt(0L, (ProfilesInfo) null, 2, (zcl) null));
        e1();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0090, code lost:
    
        if (r6.t.a.Bb() == null) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e1() {
        InfoBar a2;
        zam zamVar;
        zam zamVar2;
        zam zamVar3;
        ktk0 ktk0Var = this.t;
        if (ktk0Var.c && ktk0Var.a.d.d()) {
            zam zamVar4 = this.u;
            if (zamVar4 != null) {
                zamVar4.c();
                zamVar4.d.setVisibility(0);
            }
        } else {
            ktk0 ktk0Var2 = this.t;
            Throwable th = ktk0Var2.e;
            if (th != null) {
                zam zamVar5 = this.u;
                if (zamVar5 != null) {
                    zamVar5.c();
                    TextView textView = zamVar5.e;
                    textView.setVisibility(0);
                    textView.setText(zk70.b(th));
                }
            } else {
                InfoBar a3 = ktk0Var2.a();
                if (a3 != null && (a2 = this.t.a()) != null) {
                    if (this.j.r().h.D()) {
                        List<InfoBar.Button> list = a2.j;
                        if (!(list instanceof Collection) || !list.isEmpty()) {
                            Iterator<T> it = list.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    break;
                                } else if (((InfoBar.Button) it.next()).d == InfoBar.ButtonType.ANTISPAM) {
                                    if (this.t.b() == null) {
                                    }
                                }
                            }
                        }
                    }
                    zam zamVar6 = this.u;
                    if (zamVar6 != null) {
                        zamVar6.c();
                        InfoBarView infoBarView = zamVar6.c;
                        infoBarView.setVisibility(0);
                        infoBarView.setFromBar(a3);
                    }
                    if (!this.t.f) {
                        List<InfoBar.Button> list2 = a3.j;
                        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                        Iterator<T> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(((InfoBar.Button) it2.next()).d);
                        }
                        pbw pbwVar = this.l;
                        pbwVar.r().e(this.t.a.e, arrayList);
                        pbwVar.r().c(a3.b);
                        this.t.f = true;
                    }
                }
            }
        }
        if (hg1.d(this.v) && (zamVar3 = this.u) != null) {
            com.vk.im.popup.a a4 = zamVar3.a();
            ImFeatures imFeatures = ImFeatures.IM_CHAT_MODALS_REDESIGN;
            imFeatures.getClass();
            a4.b(new dhd0(com.vk.toggle.b.A.a(imFeatures)), new b1j(zamVar3, 8));
        }
        if (hg1.d(this.o) && (zamVar2 = this.u) != null) {
            zamVar2.d();
        }
        if (!hg1.d(this.p) || (zamVar = this.u) == null) {
            return;
        }
        zamVar.d();
    }
}
