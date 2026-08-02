package xsna;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.ui.bottomsheet.internal.e;
import com.vk.dto.common.VideoEpisode;
import com.vk.dto.common.VideoFile;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.libvideo.autoplay.b;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.dw20;
import xsna.e3m;
import xsna.nzl;

/* compiled from: EpisodeBottomSheet.kt */
/* loaded from: classes2.dex */
public final class osp extends dw20 implements fcn, e88 {
    public static final int f1 = iah0.a(360);
    public static final nzl.a g1 = new nzl.a(0.75f);

    /* compiled from: EpisodeBottomSheet.kt */
    public static final class a extends dw20.b {
        public final VideoFile e;
        public final boolean f;
        public final gzs<s3q0> g;
        public final gzs<s3q0> h;
        public final boolean i;
        public final izs<osp, s3q0> j;
        public final osp k;
        public final h88 l;
        public final com.vk.core.ui.bottomsheet.internal.b m;
        public final msp n;
        public final isp o;
        public final io.reactivex.rxjava3.disposables.c p;
        public boolean q;

        public a(Activity activity, VideoFile videoFile, boolean z, gzs gzsVar, gzs gzsVar2, gzs gzsVar3, rcg0 rcg0Var, boolean z2, sc5 sc5Var, SearchStatsLoggingInfo searchStatsLoggingInfo) {
            super(activity, null);
            this.e = videoFile;
            this.f = z;
            this.g = gzsVar;
            this.h = gzsVar2;
            this.i = z2;
            this.j = sc5Var;
            this.k = new osp();
            h88 k = n34.k(activity);
            this.l = k;
            com.vk.core.ui.bottomsheet.internal.b nzlVar = new nzl(activity, osp.g1);
            this.m = k != null ? ((bus0) k).c(activity, nzlVar) : nzlVar;
            this.n = new msp(this, new l6s0[]{new fyy(new com.vk.movika.sdk.base.flow.binding.j(10, activity, this))});
            ezs0 s = fxc0.B().s();
            iie iieVar = new iie(this, 12);
            HashSet hashSet = iah0.a;
            isp ispVar = new isp(fnj.d(activity) ? R.layout.video_episode_full_tablet : R.layout.video_episode_full, gzsVar3, rcg0Var, s, z2, iieVar, searchStatsLoggingInfo);
            if (!fxc0.B().J().J1()) {
                ispVar.h.d.add(new jsp(ispVar));
            }
            this.o = ispVar;
            ftp ftpVar = new ftp(videoFile);
            asu0 asu0Var = asu0.a;
            asu0Var.getClass();
            this.p = ftpVar.f.r0(asu0.r()).a0(asu0Var.d()).subscribe(new wn(new l2k(this, 9), 25), new xn(new lbe(this, 21), 18));
        }

        public final void S0(h88 h88Var) {
            boolean r = iah0.r(this.c);
            Integer a = h88Var != null ? h88Var.a() : null;
            int intValue = this.i ? r ? osp.f1 : dw20.e1 : a != null ? a.intValue() : (!fnj.d(this.c) || r) ? r ? osp.f1 : dw20.e1 : iah0.f().widthPixels;
            this.d.A0 = intValue;
            this.k.J0 = intValue;
        }

        @Override // xsna.dw20.b, xsna.dw20.a
        public final dw20 f() {
            Context s;
            gpu0 gpu0Var;
            int f;
            long b;
            int i;
            if (this.q) {
                throw new IllegalArgumentException("don't reuse builder for creating about bottom sheet");
            }
            this.q = true;
            v0(R.string.video_episode_title);
            i(this.o, (r3 & 2) == 0, false);
            Context context = this.c;
            e3m.a aVar = e3m.a;
            y0(context.getColor(R.color.vk_gray_100));
            boolean z = this.i;
            if (z) {
                dhr0.a.getClass();
                s = dhr0.E();
            } else {
                dhr0.a.getClass();
                s = dhr0.s();
            }
            gpu0Var = new gpu0(s);
            gpu0Var.j = new nsp();
            HashSet hashSet = iah0.a;
            int i2 = 0;
            if (fnj.d(s)) {
                gpu0Var.e = 0;
                gpu0Var.h = iah0.a(4);
                gpu0Var.i = !iah0.s(s) ? iah0.a(20) : iah0.a(32);
            }
            l0(gpu0Var);
            c(this.m);
            if (z) {
                f = dhr0.Y(R.attr.vk_ui_background_modal, this.c);
            } else {
                dhr0.a.getClass();
                u0(dhr0.u().c);
                Context context2 = this.c;
                lpj lpjVar = context2 instanceof lpj ? (lpj) context2 : null;
                Integer valueOf = lpjVar != null ? Integer.valueOf(lpjVar.getThemeResId()) : null;
                int i3 = dhr0.u().c;
                if (valueOf == null || valueOf.intValue() != i3) {
                    context2 = new l7s(context2, dhr0.u().c);
                }
                f = e3m.f(R.attr.vk_ui_background_content, context2);
            }
            l(f);
            S(f);
            if (this.f) {
                s(enj.e(R.drawable.vk_icon_back_24, R.attr.vk_ui_icon_secondary, this.c));
            }
            wd3 wd3Var = new wd3(12, this, gpu0Var);
            e.a aVar2 = this.d;
            aVar2.b1 = wd3Var;
            S0(this.l);
            d0(new qzg(this, 14));
            a0(new ozf(this, 25));
            f0(new x2e(this, 15));
            n(this.n);
            J();
            q0(false);
            R0(false);
            v(0);
            aVar2.u1 = false;
            androidx.recyclerview.widget.g gVar = new androidx.recyclerview.widget.g();
            gVar.g = false;
            aVar2.t1 = gVar;
            if (fxc0.B().J().J1()) {
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                com.vk.libvideo.autoplay.b a = b.C1208b.a();
                VideoFile videoFile = this.e;
                yg5 e = a.e(videoFile, null);
                if (z) {
                    b = e.getPosition() / 1000;
                } else {
                    if (z) {
                        throw new NoWhenBranchMatchedException();
                    }
                    b = com.vk.libvideo.autoplay.j.b(videoFile) / 1000;
                }
                int i4 = (int) b;
                if (i4 < 0 || i4 > videoFile.getDuration()) {
                    i = -1;
                } else {
                    List<VideoEpisode> Y3 = videoFile.Y3();
                    Integer valueOf2 = Integer.valueOf(i4);
                    int size = Y3.size();
                    e43.q(Y3.size(), size);
                    int i5 = size - 1;
                    while (true) {
                        if (i2 > i5) {
                            i = -(i2 + 1);
                            break;
                        }
                        i = (i2 + i5) >>> 1;
                        int b2 = jw5.b(Integer.valueOf(Y3.get(i).b), valueOf2);
                        if (b2 >= 0) {
                            if (b2 <= 0) {
                                break;
                            }
                            i5 = i - 1;
                        } else {
                            i2 = i + 1;
                        }
                    }
                    if (i < 0) {
                        i = (-i) - 2;
                    }
                }
                aVar2.v1 = i != -1 ? Integer.valueOf(i) : null;
            }
            E0(true);
            aVar2.B1 = true;
            return this.k;
        }
    }

    public static void Yn(Dialog dialog) {
        View findViewById = dialog.findViewById(R.id.ivClose);
        View findViewById2 = dialog.findViewById(R.id.llTitleContainer);
        int a2 = iah0.r(findViewById.getContext()) ? iah0.a(4) : iah0.a(16);
        int a3 = iah0.a(12);
        f4m.s(a2, findViewById);
        f4m.s(a3 + a2, findViewById2);
    }

    @Override // xsna.fcn
    public final boolean M4() {
        return true;
    }

    @Override // xsna.fcn
    public final boolean N8() {
        return false;
    }

    @Override // xsna.fcn
    public final void b(boolean z) {
        Dialog dialog = this.s;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    @Override // xsna.dw20, xsna.dh6, androidx.fragment.app.d
    public final void dismiss() {
        b(false);
    }

    @Override // xsna.dw20, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        Dialog dialog;
        super.onConfigurationChanged(configuration);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (!fnj.d(requireContext) || (dialog = this.s) == null) {
            return;
        }
        Yn(dialog);
        Dialog dialog2 = this.s;
        RecyclerView recyclerView = dialog2 != null ? (RecyclerView) dialog2.findViewById(R.id.recycler) : null;
        RecyclerView.Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
        if (recyclerView != null) {
            recyclerView.setAdapter(adapter);
        }
    }

    @Override // xsna.fcn
    public final boolean v6() {
        return false;
    }

    @Override // xsna.dw20, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        Dialog yn = super.yn(bundle);
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (fnj.d(requireContext)) {
            Yn(yn);
        }
        return yn;
    }
}
