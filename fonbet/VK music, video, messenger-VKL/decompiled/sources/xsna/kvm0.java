package xsna;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.vk.api.parsers.BadgesParsers;
import com.vk.auth.ui.consent.g;
import com.vk.auth.ui.consent.h;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoUrl;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.external.miniapp.net.app.WebApiApplication;
import com.vk.feed.core.parse.NewsfeedParseException;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.ui.views.WriteBarDisabled;
import com.vk.lists.RecyclerPaginatedView;
import com.vk.log.L;
import com.vk.newsfeed.posting.impl.domain.model.upload.UploadUpdate;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentSkipListSet;
import kotlin.Pair;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.dpt0;
import xsna.h5j0;
import xsna.iat0;
import xsna.l1x0;
import xsna.m5x0;
import xsna.nbq0;
import xsna.t70;
import xsna.tlw0;
import xsna.vuw0;
import xsna.xn50;
import xsna.y5j;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class kvm0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kvm0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        int i2 = 28;
        int i3 = 8;
        r4 = null;
        r4 = null;
        Post post = null;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((uvm0) obj2).b(true);
                return s3q0.a;
            case 1:
                qkn0 qkn0Var = (qkn0) obj2;
                qkn0Var.getClass();
                qkn0Var.f = SystemClock.elapsedRealtime();
                io.reactivex.rxjava3.subjects.f<s3q0> fVar = qkn0Var.c;
                s3q0 s3q0Var = s3q0.a;
                fVar.onNext(s3q0Var);
                return s3q0Var;
            case 2:
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) obj2;
                bVar.b1(new na7(i2, bVar, (List) obj));
                return s3q0.a;
            case 3:
                h5j0.b bVar2 = (h5j0.b) obj2;
                List list = (List) obj;
                bVar2.getClass();
                return Boolean.valueOf(((Number) list.get(2)).longValue() - ((Number) list.get(0)).longValue() < bVar2.b);
            case 4:
                ((s0p0) obj2).i(new t70.b(((Boolean) obj).booleanValue()));
                return s3q0.a;
            case 5:
                ((Boolean) obj).booleanValue();
                ((m6p0) obj2).e.invoke();
                return s3q0.a;
            case 6:
                ((ikv0) obj).a();
                ((fw) obj2).e(true);
                return s3q0.a;
            case 7:
                nbq0 nbq0Var = (nbq0) obj2;
                ConcurrentSkipListSet<Integer> concurrentSkipListSet = nbq0Var.c;
                k170 k170Var = nbq0Var.b;
                UploadNotification.b bVar3 = (UploadNotification.b) obj;
                int i4 = bVar3.a;
                int i5 = nbq0.a.$EnumSwitchMapping$0[bVar3.b.ordinal()];
                if (i5 == 1) {
                    concurrentSkipListSet.remove(Integer.valueOf(i4));
                    k170Var.invoke(new UploadUpdate.Done(i4, bVar3.e));
                } else if (i5 != 2) {
                    k170Var.invoke(new UploadUpdate.Progress(i4, bVar3.c, bVar3.d));
                } else {
                    concurrentSkipListSet.remove(Integer.valueOf(i4));
                    k170Var.invoke(new UploadUpdate.Failed(i4, bVar3.f));
                }
                return s3q0.a;
            case 8:
                ((View) obj2).performClick();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 9:
                RecyclerPaginatedView recyclerPaginatedView = ((d9r0) obj2).a.e;
                (recyclerPaginatedView != null ? recyclerPaginatedView : null).g0();
                return s3q0.a;
            case 10:
                ((nrr0) obj2).l.v();
                return s3q0.a;
            case 11:
                nts0 nts0Var = (nts0) obj2;
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    View view = nts0Var.i;
                    if (view == null) {
                        view = null;
                    }
                    view.setBackgroundResource(R.color.vk_black_alpha75);
                    FrameLayout frameLayout = nts0Var.p;
                    if (frameLayout == null) {
                        frameLayout = null;
                    }
                    frameLayout.setBackground(null);
                } else {
                    View view2 = nts0Var.i;
                    (view2 != null ? view2 : null).setBackground(new BitmapDrawable(nts0Var.getContext().getResources(), bitmap));
                }
                nts0Var.getRootView();
                nts0Var.postInvalidate();
                ViewTreeObserver x = bwt0.x(nts0Var);
                if (x != null) {
                    x.removeOnPreDrawListener(nts0Var.B);
                }
                return s3q0.a;
            case 12:
                iat0.a aVar = (iat0.a) obj2;
                if (aVar != null) {
                    aVar.b();
                }
                return s3q0.a;
            case 13:
                fpt0 fpt0Var = (fpt0) obj;
                apt0 apt0Var = ((dpt0.a) obj2).i;
                ArrayList a = i7o0.a(apt0Var.h);
                ArrayList arrayList = new ArrayList();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    hfz hfzVar = (hfz) it.next();
                    VideoUrl videoUrl = fpt0Var != null ? fpt0Var.b : null;
                    fpt0 fpt0Var2 = hfzVar instanceof fpt0 ? (fpt0) hfzVar : null;
                    if (videoUrl == (fpt0Var2 != null ? fpt0Var2.b : null)) {
                        hfzVar = fpt0Var;
                    }
                    if (hfzVar != null) {
                        arrayList.add(hfzVar);
                    }
                }
                apt0Var.setItems(arrayList);
                return s3q0.a;
            case 14:
                WebApiApplication webApiApplication = (WebApiApplication) obj2;
                w73 w73Var = (w73) obj;
                return g.a.a(com.vk.auth.ui.consent.g.h, webApiApplication.c, new h.b(webApiApplication.d.a(iah0.a(56)).b), new fyd0(w73Var, 27), new skj0(w73Var, 17), new gyo0(w73Var, 11), 32);
            case 15:
                Pair pair = (Pair) obj2;
                i6j i6jVar = (i6j) obj;
                ((pco) pair.d()).getClass();
                float f = ((pco) pair.g()).b;
                s5j s5jVar = new s5j("anchor");
                s5j s5jVar2 = new s5j("balloon");
                y5j.a d = i6jVar.d(f - e06.ForVerticalBalloons.h());
                i6jVar.c(s5jVar, new tml0(i3));
                i6jVar.c(s5jVar2, new bnc0(d, i2));
                return s3q0.a;
            case 16:
                Throwable th = (Throwable) obj;
                r6y r6yVar = ((pwv0) obj2).b;
                if (r6yVar != null) {
                    r6yVar.z(JsApiMethodType.LEAVE_GROUP, th);
                }
                return s3q0.a;
            case 17:
                return ((ProfilesInfo) obj).Bb((Peer.Member) obj2);
            case 18:
                ylw0 ylw0Var = (ylw0) obj2;
                int i6 = ylw0.x1;
                tlw0.d dVar = tlw0.d.b;
                ylw0Var.getClass();
                xn50.a.c(ylw0Var, dVar);
                return s3q0.a;
            case 19:
                Throwable th2 = (Throwable) obj;
                L.j(th2, "Exception during init load ");
                ((puw0) obj2).T(new vuw0.a(th2));
                return s3q0.a;
            case 20:
                l1x0.b bVar4 = (l1x0.b) obj2;
                int i7 = l1x0.k1;
                bVar4.a.setVisibility(8);
                bVar4.b.setVisibility(8);
                bVar4.d.setVisibility(8);
                bVar4.e.setVisibility(8);
                bVar4.c.setVisibility(0);
                return s3q0.a;
            case 21:
                ((f6x0) obj2).b.b.C(m5x0.c.b);
                return s3q0.a;
            case 22:
                bax0 bax0Var = ((j9x0) obj2).s;
                JSONObject jSONObject = ((JSONObject) obj).getJSONObject("response");
                JSONArray optJSONArray = jSONObject.optJSONArray("items");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    try {
                        post = p6c0.b(optJSONArray.getJSONObject(0), tci.r(jSONObject), BadgesParsers.b(jSONObject), vj90.e(jSONObject), 16);
                    } catch (Throwable th3) {
                        com.vk.metrics.eventtracking.b.a.a(new NewsfeedParseException(th3));
                    }
                }
                if (post != null) {
                    return post;
                }
                throw new IllegalStateException(("WallEditApiRequest: null response for " + bax0Var.a + '_' + bax0Var.I).toString());
            default:
                return Integer.valueOf(((kkm) obj).f(((WriteBarDisabled) obj2).g.i()));
        }
    }
}
