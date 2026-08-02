package xsna;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.lifecycle.Lifecycle;
import com.vk.community.design.view.avatar.CommunityProfileAvatarViewContainer;
import com.vk.core.view.components.badge.VkContentBadge;
import com.vk.dto.common.VerifyInfo;
import com.vk.profile.design.view.ProfileTitleText;
import com.vkontakte.android.R;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.chromium.net.NetError;
import xsna.l3h;
import xsna.xrh;

/* compiled from: CommunityNormalInfoHeaderItem.kt */
/* loaded from: classes5.dex */
public final class cbh extends we6 {
    public final l3h g;
    public final xrh.d h;
    public final String i;
    public final a j;
    public final h7v k;
    public final Lifecycle l;
    public final f5z m;
    public final int n = NetError.ERR_CERT_DATE_INVALID;

    /* compiled from: CommunityNormalInfoHeaderItem.kt */
    public interface a {
        void a();

        void b();

        void c(String str, View view, boolean z);

        void d();

        void e();

        void f();

        void g(boolean z);

        void h();

        void i();

        void j();
    }

    public cbh(l3h l3hVar, xrh.d dVar, String str, a aVar, h7v h7vVar, Lifecycle lifecycle, f5z f5zVar) {
        this.g = l3hVar;
        this.h = dVar;
        this.i = str;
        this.j = aVar;
        this.k = h7vVar;
        this.l = lifecycle;
        this.m = f5zVar;
    }

    @Override // xsna.we6
    public final vif0<? extends we6> a(ViewGroup viewGroup) {
        return new b(viewGroup, this.i, this.j, this.k, this.h, this.l, this.m);
    }

    @Override // xsna.we6
    public final int h() {
        return this.n;
    }

    /* compiled from: CommunityNormalInfoHeaderItem.kt */
    public static final class b extends vif0<cbh> {
        public final xrh.d n;
        public final ViewGroup o;
        public final CommunityProfileAvatarViewContainer p;
        public final ProfileTitleText q;
        public final LinearLayout r;
        public final VkContentBadge s;
        public final VkContentBadge t;
        public final LinearLayout u;
        public final ksg v;
        public final t3i w;

        /* compiled from: CommunityNormalInfoHeaderItem.kt */
        /* renamed from: xsna.cbh$b$b, reason: collision with other inner class name */
        public static final /* synthetic */ class C2655b extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((a) this.receiver).e();
                return s3q0.a;
            }
        }

        /* compiled from: CommunityNormalInfoHeaderItem.kt */
        public static final /* synthetic */ class c extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((a) this.receiver).f();
                return s3q0.a;
            }
        }

        /* compiled from: CommunityNormalInfoHeaderItem.kt */
        public static final /* synthetic */ class d extends FunctionReferenceImpl implements yzs<View, String, Boolean, s3q0> {
            @Override // xsna.yzs
            public final s3q0 invoke(View view, String str, Boolean bool) {
                boolean booleanValue = bool.booleanValue();
                a aVar = (a) this.receiver;
                aVar.c(str, view, booleanValue);
                return s3q0.a;
            }
        }

        /* compiled from: CommunityNormalInfoHeaderItem.kt */
        public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<Boolean, s3q0> {
            @Override // xsna.izs
            public final s3q0 invoke(Boolean bool) {
                ((a) this.receiver).g(bool.booleanValue());
                return s3q0.a;
            }
        }

        /* compiled from: CommunityNormalInfoHeaderItem.kt */
        public static final /* synthetic */ class f extends FunctionReferenceImpl implements gzs<s3q0> {
            @Override // xsna.gzs
            public final s3q0 invoke() {
                ((a) this.receiver).d();
                return s3q0.a;
            }
        }

        public b(ViewGroup viewGroup, String str, a aVar, h7v h7vVar, xrh.d dVar, Lifecycle lifecycle, f5z f5zVar) {
            super(viewGroup, R.layout.item_community_normal_info_header, 0);
            this.n = dVar;
            this.o = (ViewGroup) this.itemView.findViewById(R.id.community_avatar_layout);
            this.p = (CommunityProfileAvatarViewContainer) this.itemView.findViewById(R.id.community_avatar);
            this.q = (ProfileTitleText) this.itemView.findViewById(R.id.community_title);
            this.r = (LinearLayout) this.itemView.findViewById(R.id.background_ll);
            this.s = (VkContentBadge) this.itemView.findViewById(R.id.community_header_age_mark);
            VkContentBadge vkContentBadge = (VkContentBadge) this.itemView.findViewById(R.id.community_header_a_plus);
            this.t = vkContentBadge;
            this.u = (LinearLayout) this.itemView.findViewById(R.id.reviews_ll);
            this.v = new ksg(str, h7vVar, new C2655b(0, aVar, a.class, "avatarClick", "avatarClick()V", 0), new c(0, aVar, a.class, "createStory", "createStory()V", 0), new d(3, aVar, a.class, "openStories", "openStories(Landroid/view/View;Ljava/lang/String;Z)V", 0), new e(1, aVar, a.class, "openProfilePhotos", "openProfilePhotos(Z)V", 0), new f(0, aVar, a.class, "changeProfilePhoto", "changeProfilePhoto()V", 0), lifecycle, f5zVar);
            this.w = new t3i();
            this.itemView.addOnAttachStateChangeListener(new a(aVar, this));
            iut0.q(vkContentBadge, new hnu0());
        }

        @Override // xsna.vif0
        public final void i6(cbh cbhVar) {
            cbh cbhVar2 = cbhVar;
            l3h l3hVar = cbhVar2.g;
            this.v.a(this.p, l3hVar.f, l3hVar.b, this.n);
            String str = l3hVar.c;
            VerifyInfo verifyInfo = l3hVar.d;
            boolean z = l3hVar.k;
            boolean z2 = l3hVar.l;
            boolean z3 = l3hVar.j;
            dbh dbhVar = new dbh(0, cbhVar2.j, a.class, "onGovernmentClicked", "onGovernmentClicked()V", 0);
            l3h.b bVar = l3hVar.n;
            i5f i5fVar = new i5f(cbhVar2, 6);
            pff pffVar = new pff(cbhVar2, 8);
            m2g m2gVar = new m2g(cbhVar2, 3);
            this.w.getClass();
            t3i.a(this.q, str, verifyInfo, bVar, false, z, z2, z3, dbhVar, i5fVar, pffVar, m2gVar);
            int a2 = e3m.a(R.dimen.vk_ui_spacing_size_xs, this.itemView.getContext());
            ProfileTitleText profileTitleText = this.q;
            f4m.q(a2, profileTitleText);
            bwt0.p0(this.u, false);
            f4m.t(0, profileTitleText);
            f4m.y(e3m.a(R.dimen.community_header_background_margin_top, this.itemView.getContext()), this.r);
            gnu0.a(this.s, l3hVar.e, new qc(cbhVar2, 26));
            bwt0.p0(this.t, l3hVar.o != null);
        }

        /* compiled from: CommunityNormalInfoHeaderItem.kt */
        public static final class a implements View.OnAttachStateChangeListener {
            public final /* synthetic */ a b;

            public a(a aVar, b bVar) {
                this.b = aVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewAttachedToWindow(View view) {
                this.b.getClass();
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public final void onViewDetachedFromWindow(View view) {
            }
        }
    }
}
