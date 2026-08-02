package xsna;

import android.view.ViewGroup;
import androidx.car.app.hardware.common.CarZone;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.core.view.ConstrainedFrameLayout;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.rtj0;

/* compiled from: CommentAttachmentsAdapter.kt */
/* loaded from: classes4.dex */
public final class oag implements w8i {
    public final tdg b;
    public final zsj0 c;
    public ViewGroup d;
    public iag e;
    public ArrayList f;
    public final ArrayList<RecyclerView.e0> g;
    public s980 h;
    public final Object i;

    public oag(tdg tdgVar) {
        zsj0 zsj0Var = new zsj0();
        this.b = tdgVar;
        this.c = zsj0Var;
        this.g = new ArrayList<>(2);
        this.i = msy.a(LazyThreadSafetyMode.NONE, new hy2(8));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v38, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, kotlin.Lazy] */
    public final qi6 a(int i, ViewGroup viewGroup) {
        qi6 qi6Var;
        qi6 gqb0Var;
        nag nagVar = (nag) this.i.getValue();
        nagVar.getClass();
        ?? r1 = nagVar.b;
        if (i == 5) {
            qi6Var = new gfu(viewGroup, (kdg0) nagVar.d.getValue());
        } else if (i == 6) {
            qi6Var = ((Boolean) nagVar.a().f.getValue()).booleanValue() ? new sp4(viewGroup) : new rp4(viewGroup);
        } else if (i == 7) {
            qi6Var = new in2(viewGroup);
        } else if (i != 39) {
            qi6Var = null;
            if (i == 40) {
                gqb0Var = new gqb0(viewGroup, null);
            } else if (i == 76) {
                qi6Var = new ac4(viewGroup, true);
            } else if (i != 77) {
                switch (i) {
                    case 11:
                        int i2 = rtj0.J;
                        qi6Var = rtj0.a.a(viewGroup);
                        break;
                    case 54:
                        qi6Var = new h770(viewGroup);
                        break;
                    case 70:
                        viewGroup.getContext();
                        if (!((Boolean) nagVar.a().x.getValue()).booleanValue()) {
                            cr4 cr4Var = (cr4) r1.getValue();
                            nagVar.a();
                            qi6Var = new ohb0(viewGroup, cr4Var);
                            break;
                        } else {
                            qi6Var = new nhb0(viewGroup, (cr4) r1.getValue(), nagVar.a());
                            break;
                        }
                    case CarZone.CAR_ZONE_COLUMN_DRIVER /* 80 */:
                        qi6Var = new ot4(viewGroup, ((cr4) r1.getValue()).a(), (u750) ((cr4) r1.getValue()).g.getValue(), ((cr4) r1.getValue()).b());
                        break;
                    case 83:
                        qi6Var = new f6i(viewGroup);
                        break;
                    case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
                        qi6Var = new fjb0(viewGroup);
                        break;
                    case 143:
                        qi6Var = new nm4(viewGroup, R.layout.attach_audio_music_comment_attachment);
                        break;
                    case 148:
                        int i3 = p0o.T;
                        nagVar.a();
                        p0o p0oVar = new p0o(viewGroup);
                        p0oVar.itemView.setPadding(0, 0, 0, cn70.b(7));
                        f4m.t(cn70.b(2), p0oVar.J);
                        p0oVar.P = false;
                        qi6Var = p0oVar;
                        break;
                    case 187:
                        nagVar.a();
                        qi6Var = new ckt(viewGroup);
                        break;
                    case 245:
                        qi6Var = new wt00(viewGroup);
                        break;
                    case 297:
                        qi6Var = new sq7(viewGroup);
                        break;
                    default:
                        switch (i) {
                            case 33:
                                qi6Var = new lpm0(viewGroup);
                                break;
                            case 34:
                                qi6Var = new n0c(viewGroup);
                                break;
                            case 35:
                                qi6Var = new pj00(viewGroup);
                                break;
                            default:
                                switch (i) {
                                    case 42:
                                        qi6Var = new g27(viewGroup, (p20) nagVar.g.getValue(), (wvn) nagVar.f.getValue(), nagVar.a());
                                        break;
                                    case 43:
                                        qi6Var = new h9z(viewGroup);
                                        break;
                                    case 44:
                                        qi6Var = new kpx0(viewGroup);
                                        break;
                                    case 45:
                                        qi6Var = new ht4(viewGroup);
                                        break;
                                    case 46:
                                        if (!((Boolean) nagVar.a().x.getValue()).booleanValue()) {
                                            gqb0Var = new wz00(viewGroup, null);
                                            break;
                                        } else {
                                            qi6Var = new vz00(viewGroup, null, nagVar.a());
                                            break;
                                        }
                                    case 47:
                                        ((cr4) r1.getValue()).a();
                                        nagVar.a();
                                        qi6 e3k0Var = new e3k0(R.layout.attach_article_small, viewGroup);
                                        ConstrainedFrameLayout constrainedFrameLayout = (ConstrainedFrameLayout) e3k0Var.itemView.findViewById(R.id.container);
                                        constrainedFrameLayout.setMaxWidth(gbg0.a(e3k0Var.itemView.getResources(), 600.0f));
                                        constrainedFrameLayout.setMaxHeight(gbg0.a(e3k0Var.itemView.getResources(), 375.0f));
                                        qi6Var = e3k0Var;
                                        break;
                                    case 48:
                                        qi6Var = new wy6(viewGroup, ((cr4) r1.getValue()).a(), nagVar.a());
                                        break;
                                    case 49:
                                        qi6 g3d0Var = new g3d0(viewGroup, (ng30) nagVar.e.getValue());
                                        com.vk.metrics.eventtracking.b.a.a(new Exception("PrettyCardsHolder is used in comments."));
                                        qi6Var = g3d0Var;
                                        break;
                                    default:
                                        switch (i) {
                                            case 66:
                                                qi6Var = new n4l0(viewGroup);
                                                break;
                                            case 67:
                                                qi6Var = new bm2(viewGroup);
                                                break;
                                            case 68:
                                                qi6Var = new ncu(viewGroup);
                                                break;
                                        }
                                }
                        }
                }
            } else {
                qi6Var = new mu50(viewGroup);
            }
            qi6Var = gqb0Var;
        } else {
            qi6Var = new cun(viewGroup);
        }
        if (qi6Var != null) {
            qi6Var.itemView.setTag(R.id.view_type, Integer.valueOf(i));
        }
        return qi6Var;
    }
}
