package xsna;

import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.InterfaceC4413l1;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.lists.ListDataSet;
import com.vk.newsfeed.api.data.NewsComment;
import com.vkontakte.android.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.core.ApiInvocationException;
import ru.ok.android.commons.http.Http;
import ru.ok.gl.tf.Tensorflow;

/* compiled from: CommentsAdapter.kt */
/* loaded from: classes4.dex */
public final class vdg extends zoj0<cbg, RecyclerView.e0> implements zzc0 {
    public final g3f0 e;
    public final s980 f;
    public final WeakReference<afg> g;
    public final ArrayList<WeakReference<RecyclerView.e0>> h;
    public int i;
    public String j;
    public String k;

    /* compiled from: CommentsAdapter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements gzs<s3q0> {
        @Override // xsna.gzs
        public final s3q0 invoke() {
            ((vdg) this.receiver).C0(new pl2(15));
            return s3q0.a;
        }
    }

    /* compiled from: CommentsAdapter.kt */
    public static final class b extends aa {
        public b(ViewGroup viewGroup) {
            super(new View(viewGroup.getContext()), viewGroup);
        }

        @Override // xsna.vif0
        public final /* bridge */ /* synthetic */ void i6(iag iagVar) {
        }
    }

    public vdg(mdg mdgVar, ListDataSet listDataSet, g3f0 g3f0Var, s980 s980Var) {
        super(listDataSet);
        this.e = g3f0Var;
        this.f = s980Var;
        this.g = new WeakReference<>(mdgVar);
        this.h = new ArrayList<>(50);
        this.i = -1;
    }

    @Override // xsna.zzc0
    public final String B(int i, int i2) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 420 || itemViewType == 438) {
            String str = this.k;
            return str == null ? hd60.a().a().u() : str;
        }
        uuk uukVar = this.c;
        if (i2 == 0) {
            return ((cbg) uukVar.c(i)).a.va();
        }
        Iterator<Attachment> it = ((cbg) uukVar.c(i)).a.u().iterator();
        int i3 = 0;
        while (it.hasNext()) {
            Parcelable parcelable = (Attachment) it.next();
            if ((parcelable instanceof tfw) && (i3 = i3 + 1) == i2) {
                return ((tfw) parcelable).h9();
            }
        }
        return null;
    }

    @Override // xsna.zzc0
    public final int G(int i) {
        int itemViewType = getItemViewType(i);
        if (itemViewType == 410 || itemViewType == 417 || itemViewType == 420 || itemViewType == 438) {
            return 1;
        }
        switch (itemViewType) {
            case 445:
            case 446:
            case 447:
                return 1;
            default:
                return 0;
        }
    }

    public final boolean K0() {
        UserId p;
        afg afgVar = this.g.get();
        if (afgVar == null || (p = afgVar.p()) == null) {
            return false;
        }
        return fkq0.b(p);
    }

    public final void L0(String str) {
        this.k = str;
        Iterator<WeakReference<RecyclerView.e0>> it = this.h.iterator();
        while (it.hasNext()) {
            RecyclerView.e0 e0Var = it.next().get();
            if (e0Var instanceof j3g0) {
                j3g0 j3g0Var = (j3g0) e0Var;
                j3g0Var.r = str;
                j3g0Var.p.o0(str == null ? hd60.a().a().u() : str, null);
            }
        }
    }

    public final void N0() {
        Iterator<WeakReference<RecyclerView.e0>> it = this.h.iterator();
        while (it.hasNext()) {
            RecyclerView.e0 e0Var = it.next().get();
            if (e0Var instanceof aa) {
                ((aa) e0Var).t6();
            } else {
                it.remove();
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemViewType(int i) {
        cbg cbgVar = (cbg) this.c.c(i);
        NewsComment newsComment = (NewsComment) cbgVar.a;
        int i2 = cbgVar.c;
        if ((!newsComment.u && !newsComment.v) || !ogg.a.contains(Integer.valueOf(i2))) {
            return i2;
        }
        if (i2 == 434 || i2 == 436) {
            return 412;
        }
        switch (i2) {
            case 417:
            case 418:
            case 419:
                return 414;
            default:
                switch (i2) {
                    case 421:
                    case 422:
                    case 423:
                        return Http.StatusCode.RANGE_NOT_SATISFIABLE;
                    default:
                        switch (i2) {
                            case 445:
                                if (K0()) {
                                    return 452;
                                }
                                return InterfaceC4413l1.a.b.k;
                            case 446:
                                if (K0()) {
                                    return ApiInvocationException.ErrorCodes.SESSION_REQUIRED;
                                }
                                return 413;
                            case 447:
                                if (K0()) {
                                    return ApiInvocationException.ErrorCodes.CENSOR_MATCH;
                                }
                                return 415;
                            default:
                                return InterfaceC4413l1.a.b.k;
                        }
                }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        String str;
        cbg cbgVar = (cbg) this.c.c(i);
        iag iagVar = cbgVar.a;
        aa aaVar = (aa) e0Var;
        if (aaVar instanceof seg) {
            ((seg) aaVar).Q4(this.f);
        }
        aaVar.q6(cbgVar);
        WeakReference<afg> weakReference = this.g;
        afg afgVar = weakReference.get();
        if (this.i == iagVar.getId()) {
            this.i = -1;
            aaVar.s6();
        }
        if (aaVar instanceof a4g0) {
            ((a4g0) aaVar).P3(afgVar != null && afgVar.Z());
        }
        if (aaVar instanceof ome) {
            ome omeVar = (ome) aaVar;
            omeVar.o = weakReference.get();
            omeVar.p = new a(0, this, vdg.class, "deleteClipsNegativeRepliesBlock", "deleteClipsNegativeRepliesBlock()V", 0);
        } else if (aaVar instanceof g9x0) {
            ((g9x0) aaVar).o = weakReference.get();
        } else {
            if (!(aaVar instanceof j3g0) || (str = this.k) == null) {
                return;
            }
            j3g0 j3g0Var = (j3g0) aaVar;
            j3g0Var.r = str;
            j3g0Var.p.o0(str, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        vif0 xy5Var;
        vif0 vif0Var;
        afg afgVar = this.g.get();
        if (afgVar == null) {
            return new b(viewGroup);
        }
        viewGroup.getContext();
        g3f0 g3f0Var = this.e;
        switch (i) {
            case 410:
            case 433:
                vif0Var = new sdg(viewGroup, afgVar, g3f0Var, this.j);
                break;
            case InterfaceC4413l1.a.b.k /* 411 */:
                vif0Var = new uj3(R.layout.wall_comment_deleted_v2, viewGroup, afgVar);
                break;
            case 412:
                vif0Var = new uj3(R.layout.video_comment_deleted_v2, viewGroup, afgVar);
                break;
            case 413:
            case 415:
                vif0Var = new uj3(R.layout.wall_comment_deleted_small_v2, viewGroup, afgVar);
                break;
            case 414:
            case Http.StatusCode.RANGE_NOT_SATISFIABLE /* 416 */:
                vif0Var = new uj3(R.layout.video_comment_deleted_small_v2, viewGroup, afgVar);
                break;
            case 417:
            case 421:
                g3k0 g3k0Var = new g3k0(R.layout.wall_comment_small, viewGroup, afgVar, g3f0Var);
                TextView textView = g3k0Var.H;
                textView.setOnTouchListener(g3k0Var);
                textView.setOnClickListener(g3k0Var);
                g3k0Var.D6(textView);
                vif0Var = g3k0Var;
                break;
            case 418:
            case 422:
                ntp0 ntp0Var = new ntp0(R.layout.type1_video_comment_small, viewGroup, afgVar, g3f0Var);
                ntp0Var.F6(R.color.type1_video_counters);
                vif0Var = ntp0Var;
                break;
            case 419:
            case 423:
                ptp0 ptp0Var = new ptp0(R.layout.type3_video_comment_small, viewGroup, afgVar, g3f0Var);
                ptp0Var.F6(R.color.type3_video_counters);
                vif0Var = ptp0Var;
                break;
            case 420:
            case 438:
                vif0Var = new j3g0(viewGroup, afgVar);
                break;
            case 424:
                vif0Var = new rij0(viewGroup, afgVar);
                break;
            case 425:
                vif0Var = new qvl(R.layout.wall_comment_deleted_v2, viewGroup, afgVar);
                break;
            case 426:
                vif0Var = new qvl(R.layout.video_comment_deleted_v2, viewGroup, afgVar);
                break;
            case 427:
                vif0Var = new qvl(R.layout.video_comment_deleted_small_v2, viewGroup, afgVar);
                break;
            case 428:
                vif0Var = new ifp(viewGroup, viewGroup.getResources().getString(R.string.comments_empty_title));
                break;
            case CommonGatewayClient.CODE_TOO_MANY_REQUESTS /* 429 */:
                vif0Var = new h0n(viewGroup, viewGroup.getResources().getString(R.string.comments_disabled_title));
                break;
            case 430:
                vif0Var = new ifp(viewGroup, viewGroup.getResources().getString(R.string.video_comments_empty_title));
                break;
            case 431:
                String string = viewGroup.getResources().getString(R.string.video_tree_comments_empty_title);
                vif0 xis0Var = new xis0(viewGroup, R.layout.empty_comments, 0);
                TextView textView2 = (TextView) xis0Var.itemView.findViewById(R.id.empty_comments_tv);
                textView2.setText(string);
                textView2.setCompoundDrawablePadding(iah0.a(12));
                textView2.setTextAppearance(R.style.VkUiTypography_Headline1Medium);
                textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, enj.e(R.drawable.vk_icon_comment_outline_56, R.attr.vk_ui_icon_secondary, xis0Var.itemView.getContext()), (Drawable) null, (Drawable) null);
                bwt0.p0(textView2, true);
                vif0Var = xis0Var;
                break;
            case Tensorflow.FRAME_WIDTH /* 432 */:
                vif0Var = new h0n(viewGroup, viewGroup.getResources().getString(R.string.video_comments_disabled_title));
                break;
            case 434:
            case 435:
                vif0Var = new mtp0(viewGroup, afgVar, g3f0Var, this.j);
                break;
            case 436:
            case 437:
                vif0Var = new otp0(viewGroup, afgVar, g3f0Var, this.j);
                break;
            case 439:
                xy5Var = new xy5(R.layout.wall_comment_donut_badge, viewGroup, this.j, afgVar, g3f0Var);
                vif0Var = xy5Var;
                break;
            case 440:
                xy5Var = new ry5(R.layout.wall_comment_badge, viewGroup, this.j, afgVar, g3f0Var);
                vif0Var = xy5Var;
                break;
            case 441:
                ome omeVar = new ome(viewGroup, R.layout.show_toxic_comments, 0);
                TextView textView3 = (TextView) omeVar.itemView.findViewById(R.id.banner_button);
                vif0Var = omeVar;
                if (textView3 != null) {
                    textView3.setOnClickListener(omeVar);
                    vif0Var = omeVar;
                    break;
                }
                break;
            case 442:
                vif0Var = new g9x0(viewGroup);
                break;
            case 443:
                vif0Var = new h9x0(R.layout.wall_comments_show_more_v2, viewGroup, afgVar);
                break;
            case 444:
                vif0Var = new h9x0(R.layout.wall_comments_show_more_wide_v2, viewGroup, afgVar);
                break;
            case 445:
                vif0Var = new u0c0(viewGroup, afgVar, g3f0Var, this.j);
                break;
            case 446:
            case 447:
                vif0Var = new k7c0(viewGroup, afgVar, g3f0Var);
                break;
            case 448:
                vif0Var = new o0c0(viewGroup, afgVar, g3f0Var, this.j);
                break;
            case 449:
                vif0Var = new p0c0(viewGroup, afgVar, g3f0Var, this.j);
                break;
            case 450:
                vif0Var = new ifp(viewGroup, viewGroup.getResources().getString(R.string.post_comments_empty_title));
                break;
            case 451:
                vif0Var = new h0n(viewGroup, viewGroup.getResources().getString(R.string.post_comments_disabled_title));
                break;
            case 452:
                vif0Var = new vj3(viewGroup, afgVar);
                break;
            case ApiInvocationException.ErrorCodes.SESSION_REQUIRED /* 453 */:
            case ApiInvocationException.ErrorCodes.CENSOR_MATCH /* 454 */:
                vif0Var = new wj3(viewGroup, afgVar);
                break;
            default:
                vif0Var = new b(viewGroup);
                break;
        }
        this.h.add(new WeakReference<>(vif0Var));
        return vif0Var;
    }
}
