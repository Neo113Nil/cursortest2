package xsna;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.dto.newsfeed.Owner;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FavePage;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import com.vk.log.L;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.dw20;

/* compiled from: FaveCustomizeTagsView.kt */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes4.dex */
public final class jnq extends omq {
    public static final /* synthetic */ int i = 0;
    public final gux0 g;
    public final l2o0 h;

    /* compiled from: FaveCustomizeTagsView.kt */
    public static final class a {

        /* compiled from: FaveCustomizeTagsView.kt */
        /* renamed from: xsna.jnq$a$a, reason: collision with other inner class name */
        public static final class C3131a implements hz20 {
            public final /* synthetic */ jnq b;
            public final /* synthetic */ pqq c;

            public C3131a(jnq jnqVar, pqq pqqVar) {
                this.b = jnqVar;
                this.c = pqqVar;
            }

            @Override // xsna.hz20
            public final void a(int i) {
                pqq pqqVar = this.c;
                jnq jnqVar = this.b;
                Context context = jnqVar.getContext();
                gux0 gux0Var = jnqVar.g;
                ArrayList arrayList = jnqVar.h.f;
                try {
                    rsg0 h = jnq.h(gux0Var, arrayList, pqqVar);
                    if (h == null) {
                        L.l("Can't setTags without request");
                        cvk.u(R.string.error, false);
                        return;
                    }
                    io.reactivex.rxjava3.disposables.c subscribe = rsg0.y0(h, null, null, 3).subscribe(new f50(new hnq(0, arrayList, gux0Var, context, pqqVar), 29), new inq(knq.b, 0));
                    Activity h2 = e3m.h(context);
                    if (h2 != null) {
                        ver0.b(h2, subscribe);
                    }
                } catch (Throwable unused) {
                    cvk.u(R.string.error, false);
                }
            }
        }

        public static void a(Context context, gux0 gux0Var, pqq pqqVar) {
            dw20.a c;
            if (context == null) {
                L.l("Can't open customize dialog without context");
                return;
            }
            jnq jnqVar = new jnq(context, gux0Var);
            dw20.b i0 = ((dw20.b) new dw20.b(context, null).v0(R.string.fave_tags_title).F(uko.e(m33.a(R.drawable.vk_icon_edit_outline_28, context), ColorStateList.valueOf(dhr0.t.c(R.attr.vk_ui_icon_accent))), context.getResources().getString(R.string.accessibility_edit))).b0(new dxh(jnqVar, 14)).D0(jnqVar, false).i0(R.string.fave_tags_save_title, new C3131a(jnqVar, pqqVar));
            i0.getClass();
            i0.K0(32);
            c = i0.u0(dhr0.C().c).c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
            int i = omq.f;
            ((dw20.b) c).I0("omq");
        }
    }

    /* compiled from: FaveCustomizeTagsView.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            jnq jnqVar = (jnq) this.receiver;
            int i = jnq.i;
            mqq.a(jnqVar.getContext(), null);
            return s3q0.a;
        }
    }

    /* compiled from: FaveCustomizeTagsView.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        public static final c b = new c(1, h03.class, "showToastError", "showToastError(Ljava/lang/Throwable;)V", 1);

        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            h03.b(th);
            return s3q0.a;
        }
    }

    public jnq(Context context, gux0 gux0Var) {
        super(context);
        this.g = gux0Var;
        l2o0 l2o0Var = new l2o0(new b(0, this, jnq.class, "openCreateNewTag", "openCreateNewTag()V", 0));
        this.h = l2o0Var;
        e();
        l2o0Var.f.addAll(gux0Var.U1());
        getPaginatedView().setAdapter(l2o0Var);
    }

    public static s3q0 g(com.vk.lists.c cVar, jnq jnqVar, List list) {
        cVar.r(false);
        jnqVar.setTags(list);
        return s3q0.a;
    }

    public static rsg0 h(gux0 gux0Var, ArrayList arrayList, pqq pqqVar) {
        boolean z;
        FaveSource faveSource = pqqVar.d;
        String str = pqqVar.b;
        String str2 = null;
        if (!(gux0Var instanceof FaveEntry)) {
            if (!(gux0Var instanceof FavePage)) {
                L.l("Can't find suitable request for " + gux0Var);
                return null;
            }
            Owner owner = ((FavePage) gux0Var).e;
            if (owner == null) {
                L.l("Can't create request for tags without owner " + gux0Var);
                return null;
            }
            UserId userId = owner.b;
            z = faveSource != null && faveSource == FaveSource.SNACKBAR;
            eos eosVar = new eos("fave.setPageTags");
            eosVar.F(fkq0.a(userId), fkq0.b(userId) ? "group_id" : "user_id");
            eosVar.K("tag_ids", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new io3(18), 30));
            if (str != null) {
                eosVar.K("ref", str);
            }
            eosVar.R("is_from_snackbar", z);
            return eosVar;
        }
        gmq gmqVar = ((FaveEntry) gux0Var).i.f;
        gnq.a.getClass();
        FaveType e = gnq.e(gmqVar);
        String f = gnq.f(gmqVar, false);
        UserId d = gnq.d(gmqVar);
        FaveType faveType = FaveType.LINK;
        Integer valueOf = (e == faveType || f == null) ? null : Integer.valueOf(Integer.parseInt(f));
        if (e != faveType) {
            f = null;
        }
        if (e == faveType && (gmqVar instanceof SnippetAttachment)) {
            str2 = ((SnippetAttachment) gmqVar).f.b;
        }
        z = faveSource != null && faveSource == FaveSource.SNACKBAR;
        un unVar = new un("fave.setTags");
        unVar.K("item_type", e.h());
        if (valueOf != null) {
            unVar.C(valueOf.intValue(), "item_id");
        }
        if (d != null) {
            unVar.F(d, "item_owner_id");
        }
        if (str != null) {
            unVar.K("ref", str);
        }
        unVar.R("is_from_snackbar", z);
        if (f != null && f.length() != 0) {
            unVar.K("link_id", f);
        } else if (str2 != null) {
            unVar.K("link_url", str2);
        }
        unVar.K("tag_ids", j5g.g0(arrayList, StringUtils.COMMA, null, null, 0, new cj1(24), 30));
        return unVar;
    }

    private final void setTags(List<FaveTag> list) {
        this.h.L0(list);
    }

    @Override // xsna.omq
    public final void a(FaveTag faveTag) {
        l2o0 l2o0Var = this.h;
        l2o0Var.f.add(faveTag);
        ArrayList arrayList = new ArrayList(l2o0Var.K0());
        arrayList.add(0, faveTag);
        l2o0Var.L0(arrayList);
    }

    @Override // xsna.omq
    public final void b(FaveTag faveTag) {
        int i2;
        l2o0 l2o0Var = this.h;
        ArrayList arrayList = l2o0Var.f;
        int i3 = faveTag.b;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = -1;
            if (i5 >= size) {
                i5 = -1;
                break;
            }
            Object b0 = j5g.b0(i5, arrayList);
            if ((b0 instanceof FaveTag) && i3 == ((FaveTag) b0).b) {
                break;
            } else {
                i5++;
            }
        }
        ArrayList arrayList2 = (ArrayList) l2o0Var.y0();
        int size2 = arrayList2.size();
        while (true) {
            if (i4 >= size2) {
                break;
            }
            Object b02 = j5g.b0(i4, arrayList2);
            if ((b02 instanceof FaveTag) && i3 == ((FaveTag) b02).b) {
                i2 = i4;
                break;
            }
            i4++;
        }
        if (i5 >= 0) {
            arrayList.remove(i5);
        }
        if (i2 >= 0) {
            ((ArrayList) l2o0Var.y0()).remove(i2);
            l2o0Var.L0(l2o0Var.K0());
        }
        if (i5 < 0 || i2 >= 0) {
            return;
        }
        L.l("Incorrect state of selected for remove tag");
    }

    @Override // xsna.omq
    public final void c(FaveTag faveTag) {
        int i2;
        l2o0 l2o0Var = this.h;
        ArrayList arrayList = l2o0Var.f;
        int i3 = faveTag.b;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            i2 = -1;
            if (i5 >= size) {
                i5 = -1;
                break;
            }
            Object b0 = j5g.b0(i5, arrayList);
            if ((b0 instanceof FaveTag) && i3 == ((FaveTag) b0).b) {
                break;
            } else {
                i5++;
            }
        }
        ArrayList arrayList2 = (ArrayList) l2o0Var.y0();
        int size2 = arrayList2.size();
        while (true) {
            if (i4 >= size2) {
                break;
            }
            Object b02 = j5g.b0(i4, arrayList2);
            if ((b02 instanceof FaveTag) && i3 == ((FaveTag) b02).b) {
                i2 = i4;
                break;
            }
            i4++;
        }
        if (i5 >= 0) {
            arrayList.remove(i5);
            arrayList.add(i5, faveTag);
        }
        if (i2 >= 0) {
            ((ArrayList) l2o0Var.y0()).remove(i2);
            ((ArrayList) l2o0Var.y0()).add(i2, faveTag);
            l2o0Var.notifyItemChanged(i2);
        }
        if (i5 < 0 || i2 >= 0) {
            return;
        }
        L.l("Incorrect state of selected for rename tag");
    }

    @Override // xsna.omq
    public final void d(List<FaveTag> list) {
        this.h.L0(list);
    }

    @Override // xsna.omq
    public int getMinHeightForRecyclerView() {
        return (iah0.f().heightPixels / 2) - (iah0.a(56) * 2);
    }

    @Override // com.vk.lists.c.k
    public final io.reactivex.rxjava3.core.q<List<FaveTag>> hj(com.vk.lists.c cVar, boolean z) {
        return rsg0.y0(new jqq(), null, null, 3);
    }

    @Override // com.vk.lists.c.l
    public final io.reactivex.rxjava3.core.q<List<? extends FaveTag>> ui(int i2, com.vk.lists.c cVar) {
        return rsg0.y0(new jqq(), null, null, 3);
    }

    @Override // com.vk.lists.c.k
    public final void wd(io.reactivex.rxjava3.core.q<List<FaveTag>> qVar, boolean z, com.vk.lists.c cVar) {
        qVar.subscribe(new mp0(new u6(18, cVar, this), 22), new el6(c.b, 24));
    }
}
