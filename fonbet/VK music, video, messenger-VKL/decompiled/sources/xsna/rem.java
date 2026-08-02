package xsna;

import android.os.Bundle;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FaveEntry;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import kotlin.Result;
import xsna.ds60;
import xsna.ipq;
import xsna.mem;
import xsna.qn60;
import xsna.qr60;
import xsna.rpq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class rem implements bd70 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ rem(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Object obj) {
        mem.a aVar;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (i3) {
            case 0:
                sem semVar = (sem) obj2;
                Bundle bundle = (Bundle) obj;
                if (i == 9) {
                    if (epx.f(bundle != null ? bundle.getString("type") : null, "ugc_sticker") && (aVar = semVar.l) != null) {
                        aVar.b(null);
                        break;
                    }
                }
                break;
            default:
                apq apqVar = (apq) obj2;
                pn60 pn60Var = apqVar.g;
                qn60 qn60Var = apqVar.f;
                nn50<State, TaskId, OutTask, Patch, Event> nn50Var = apqVar.b;
                if (i == 1201) {
                    if (obj == null ? true : obj instanceof FaveTag) {
                        apqVar.a(new rpq.c.C3623c((FaveTag) obj));
                        break;
                    }
                }
                if (i != 1202 || !(obj instanceof FaveEntry)) {
                    if (i != 1204 || !(obj instanceof FaveTag)) {
                        if (i == 1205 && (obj instanceof FaveTag)) {
                            FaveTag faveTag = (FaveTag) obj;
                            FaveTag faveTag2 = ((kpq) nn50Var.getCurrentState()).c;
                            if (faveTag2 != null && faveTag.b == faveTag2.b) {
                                apqVar.e(new ipq.b.a(faveTag));
                            }
                            Object b = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new orq(faveTag, pn60Var)));
                            if (!(b instanceof Result.Failure)) {
                                qn60.c cVar = (qn60.c) b;
                                nn50Var.e(new hpq(new qr60.a.c(cVar.a, cVar.b, false, null, 24)));
                            }
                            Throwable a = Result.a(b);
                            if (a != null) {
                                com.vk.metrics.eventtracking.b.a.a(a);
                                break;
                            }
                        }
                    } else {
                        FaveTag faveTag3 = (FaveTag) obj;
                        FaveTag faveTag4 = ((kpq) nn50Var.getCurrentState()).c;
                        if (faveTag4 == null || faveTag4.b != faveTag3.b) {
                            FaveTag faveTag5 = ((kpq) nn50Var.getCurrentState()).c;
                            if (faveTag5 != null && faveTag3.b == faveTag5.b) {
                                apqVar.e(new ipq.b.a(faveTag3));
                            }
                            Object b2 = io.reactivex.rxjava3.internal.operators.mixed.n.b(qn60Var.f(new nrq(faveTag3, pn60Var)));
                            if (!(b2 instanceof Result.Failure)) {
                                qn60.c cVar2 = (qn60.c) b2;
                                nn50Var.e(new hpq(new qr60.a.c(cVar2.a, cVar2.b, false, null, 24)));
                            }
                            Throwable a2 = Result.a(b2);
                            if (a2 != null) {
                                com.vk.metrics.eventtracking.b.a.a(a2);
                                break;
                            }
                        }
                    }
                } else {
                    apqVar.a(new spq(new ds60.b(new NewsfeedExternalAction.c.f0((NewsEntry) obj))));
                    break;
                }
                break;
        }
    }
}
