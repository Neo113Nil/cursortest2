package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.Lifecycle;
import com.vk.dto.common.VerifyInfo;
import com.vk.dto.common.id.UserId;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.net.NetError;
import xsna.f8h;
import xsna.gqh;
import xsna.j8h;
import xsna.l3h;
import xsna.qsg;
import xsna.xrh;

/* compiled from: CommunityLiveCoverHeaderRedesignItem.kt */
/* loaded from: classes5.dex */
public final class j8h extends qsg {
    public final d9h n;
    public final String o;
    public final UserId p;
    public final a q;
    public final c r;
    public final Lifecycle s;
    public final f5z t;
    public final wvw u;
    public final izs<CommunityProfileAction, s3q0> v;
    public final int w;

    /* compiled from: CommunityLiveCoverHeaderRedesignItem.kt */
    public interface a extends qsg.a {
        void i(f8h f8hVar);

        int m();

        f8h.a n();

        void o();
    }

    /* compiled from: CommunityLiveCoverHeaderRedesignItem.kt */
    public static class b extends qsg.b<j8h> {
        public final a w;
        public final w8h x;
        public final ViewGroup y;
        public final k8h z;

        /* compiled from: CommunityLiveCoverHeaderRedesignItem.kt */
        public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<Integer> {
            @Override // xsna.gzs
            public final Integer invoke() {
                return Integer.valueOf(((a) this.receiver).m());
            }
        }

        /* JADX WARN: Type inference failed for: r10v7, types: [xsna.k8h] */
        public b(View view, String str, final c cVar, a aVar, h7v h7vVar, Lifecycle lifecycle, f5z f5zVar, izs izsVar, wvw wvwVar) {
            super(view, str, aVar, h7vVar, lifecycle, f5zVar, izsVar, wvwVar);
            this.w = aVar;
            this.x = new w8h((FrameLayout) this.itemView.findViewById(R.id.community_live_cover_pager_container));
            this.y = (ViewGroup) this.itemView.findViewById(R.id.community_live_cover_info_frame);
            this.z = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: xsna.k8h
                @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
                public final void onWindowFocusChanged(boolean z) {
                    j8h.c.this.a().a(new gqh.b(z));
                }
            };
            CardView cardView = (CardView) this.itemView;
            cardView.setOutlineProvider(new m8h(cardView));
            cardView.addOnAttachStateChangeListener(new n8h(this));
        }

        @Override // xsna.vif0
        public final void i6(Object obj) {
            j8h j8hVar = (j8h) obj;
            c cVar = j8hVar.r;
            l3h l3hVar = j8hVar.g;
            this.t.a(this.n, l3hVar.f, l3hVar.b, j8hVar.j);
            String str = l3hVar.c;
            VerifyInfo verifyInfo = l3hVar.d;
            boolean z = l3hVar.k;
            boolean z2 = l3hVar.l;
            boolean z3 = l3hVar.j;
            a aVar = j8hVar.k;
            tsg tsgVar = new tsg(0, aVar, qsg.a.class, "openGovernmentOrganizationInfoDialog", "openGovernmentOrganizationInfoDialog()V", 0);
            l3h.b bVar = l3hVar.n;
            com.vk.movika.sdk.base.model.b bVar2 = new com.vk.movika.sdk.base.model.b(j8hVar, 29);
            com.vk.movika.sdk.base.model.e eVar = new com.vk.movika.sdk.base.model.e(j8hVar, 23);
            bb bbVar = new bb(j8hVar, 25);
            this.u.getClass();
            t3i.a(this.o, str, verifyInfo, bVar, true, z, z2, z3, tsgVar, bVar2, eVar, bbVar);
            ssg ssgVar = new ssg(2, aVar, qsg.a.class, "onAction", "onAction(Landroid/view/View;Lcom/vk/profile/community/impl/ui/tag/CommunityActionTags;)V", 0);
            gpg gpgVar = j8hVar.h;
            jpg jpgVar = this.v;
            b3h b3hVar = this.p;
            jpgVar.a(b3hVar, gpgVar, ssgVar, true);
            izs<View, s3q0> izsVar = j8hVar.l;
            if (izsVar != null) {
                izsVar.invoke(b3hVar.a);
            }
            bwt0.p0(this.q, false);
            gnu0.a(this.r, l3hVar.e, new com.vk.movika.sdk.base.logic.processor.h(j8hVar, 22));
            bwt0.p0(this.s, l3hVar.o != null);
            r8h c = cVar.c();
            c8h b = cVar.b();
            if (c == null || b == null) {
                return;
            }
            w8h w8hVar = this.x;
            if (epx.f(w8hVar.j, c)) {
                return;
            }
            if (c.d) {
                f8h e = cVar.e();
                if (e != null) {
                    e.d = c;
                    e.e = b;
                    w8h.a(e.n, c, b, c.c, 8);
                    return;
                }
                return;
            }
            w8h.a(w8hVar, c, b, 0, 12);
            w8hVar.b = new l8h(j8hVar, this, c, b, 0);
            if (c.h) {
                q6(j8hVar, w8hVar, c, b);
                b.a.invoke(new CommunityProfileAction.g.d.C1588g(false));
            }
        }

        public final void q6(j8h j8hVar, w8h w8hVar, r8h r8hVar, c8h c8hVar) {
            Activity h;
            if (r8hVar.d || (h = e3m.h(w8hVar.a.getContext())) == null) {
                return;
            }
            w8hVar.d();
            a aVar = j8hVar.q;
            c cVar = j8hVar.r;
            f8h f8hVar = new f8h(h, new f8h.b(w8hVar, this.y, cVar.d()), r8hVar, c8hVar, j8hVar.p, aVar.n(), new a(0, aVar, a.class, "getCurrentStatusBarHeight", "getCurrentStatusBarHeight()I", 0));
            ysg0<gqh> a2 = cVar.a();
            w8h w8hVar2 = f8hVar.n;
            w8hVar2.getClass();
            w8hVar2.g.b(a2.a.D0(BackpressureStrategy.BUFFER).subscribe(new j22(new kp1(1, w8hVar2, w8h.class, "consumeAndUpdateVisibility", "consumeAndUpdateVisibility(Lcom/vk/profile/community/impl/ui/item/header/livecover/CommunityProfileLifecycleEvent;)V", 0, 2), 18)));
            aVar.i(f8hVar);
        }
    }

    /* compiled from: CommunityLiveCoverHeaderRedesignItem.kt */
    public interface c {
        ysg0<gqh> a();

        c8h b();

        r8h c();

        View d();

        f8h e();
    }

    public j8h(d9h d9hVar, h7v h7vVar, xrh.d dVar, String str, UserId userId, a aVar, c cVar, izs izsVar, Lifecycle lifecycle, f5z f5zVar, wvw wvwVar, yte yteVar) {
        super(d9hVar.b, d9hVar.c, h7vVar, dVar, aVar, izsVar);
        this.n = d9hVar;
        this.o = str;
        this.p = userId;
        this.q = aVar;
        this.r = cVar;
        this.s = lifecycle;
        this.t = f5zVar;
        this.u = wvwVar;
        this.v = yteVar;
        this.w = NetError.ERR_CERT_COMMON_NAME_INVALID;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        Context context = viewGroup.getContext();
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(new ContextThemeWrapper(context, dhr0.z().c)).inflate(R.layout.item_community_live_cover_header_redesign, viewGroup, false);
        awt0.t(inflate, new jpf(this, 2));
        return new b(inflate, this.o, this.r, this.q, this.i, this.s, this.t, this.v, this.u);
    }

    @Override // xsna.qsg, xsna.we6
    public final int h() {
        return this.w;
    }
}
