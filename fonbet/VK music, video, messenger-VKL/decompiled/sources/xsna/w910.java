package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.opengl.GLES20;
import android.util.Size;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.catalog2.common.ui.mvp.holder.container.PagerGridListVh;
import com.vk.comments.core.BoardComment;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.common.data.VKList;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.user.UserProfile;
import com.vk.feed.settings.impl.presentation.filtered.tab.b;
import com.vk.feed.settings.impl.presentation.filtered.tab.f;
import com.vk.im.engine.models.LongPollType;
import com.vk.im.ui.fragments.SharedChatsFragment;
import com.vk.log.L;
import com.vk.reefton.Reef;
import com.vk.uxpolls.presentation.view.PollsWebView;
import com.vk.video.ui.smartcrop.impl.presentation.feature.entity.SmartCropState;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import one.video.gl.GLESUtils;
import one.video.smartcast.api.ConnectionState;
import xsna.hg1;
import xsna.i5e0;
import xsna.mik;
import xsna.sb40;
import xsna.sx40;
import xsna.tca0;
import xsna.ye50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class w910 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w910(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        m4b0 m4b0Var;
        int i = this.b;
        int i2 = 3;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.r(tgi0Var, "PostingCloseButtonMarket");
                qgi0.h(tgi0Var, ((com.vk.newsfeed.posting.market_picker.presentation.base.view.e) obj2).q.getContext().getString(R.string.previous_step_talkback_title));
                return s3q0.a;
            case 1:
                ConnectionState connectionState = (ConnectionState) obj;
                nit0 nit0Var = ((gr20) obj2).p;
                if (nit0Var != null && (m4b0Var = nit0Var.b) != null && m4b0Var.n != connectionState) {
                    m4b0Var.n = connectionState;
                    m4b0Var.b();
                }
                return s3q0.a;
            case 2:
                az20 az20Var = (az20) obj2;
                rzq0 rzq0Var = (rzq0) obj;
                ArrayList arrayList = new ArrayList(3);
                for (int i3 = 0; i3 < 3; i3++) {
                    arrayList.add(az20Var.g);
                }
                rzq0Var.b(arrayList, sdy.h);
                rzq0Var.a(fsk.d);
                return s3q0.a;
            case 3:
                L.i((Throwable) obj);
                ((u440) obj2).j.M();
                return s3q0.a;
            case 4:
                qb40 qb40Var = (qb40) obj2;
                da00 da00Var = (da00) obj;
                qb40Var.i.b(null);
                if (epx.f(da00Var, ggp.a)) {
                    qb40Var.b(sb40.d.e.a);
                } else {
                    qb40Var.b(new sb40.d.b(da00Var));
                }
                return s3q0.a;
            case 5:
                ((rw40) obj2).C(sx40.h.b);
                return s3q0.a;
            case 6:
                ((we50) obj2).T(ye50.a.b);
                return s3q0.a;
            case 7:
                zi50 zi50Var = (zi50) obj2;
                for (UserProfile userProfile : (List) obj) {
                    zi50Var.d.put(userProfile.c, userProfile);
                }
                return s3q0.a;
            case 8:
                fxc0.B().Y().D((Context) obj2, true);
                return s3q0.a;
            case 9:
                ui60 ui60Var = (ui60) obj2;
                ui60Var.c.a(b.e.a.b);
                ui60Var.d.c(new f.d.a((Throwable) obj));
                return s3q0.a;
            case 10:
                kr70 kr70Var = (kr70) obj2;
                return fae.b(kr70Var.i, (VideoGetCommentsExtendedResponseDto) obj, kr70Var.d, null, false, 56);
            case 11:
                ((Integer) obj).intValue();
                RecyclerView recyclerView = ((PagerGridListVh) obj2).m;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                return new s8a(recyclerView.getWidth(), null, null);
            case 12:
                tca0 tca0Var = (tca0) obj2;
                List list = (List) obj;
                CopyOnWriteArrayList<qba0> copyOnWriteArrayList = tca0Var.c;
                Set R0 = j5g.R0(copyOnWriteArrayList);
                ArrayList arrayList2 = new ArrayList(c5g.u(R0, 10));
                Iterator it = R0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(Integer.valueOf(((qba0) it.next()).j));
                }
                Set S0 = j5g.S0(arrayList2);
                List list2 = list;
                if (list2 instanceof RandomAccess) {
                    List list3 = list2;
                    int size = list3.size();
                    for (int i4 = 0; i4 < size; i4++) {
                        Object obj3 = list3.get(i4);
                        if (!S0.contains(Integer.valueOf(((qba0) obj3).j))) {
                            R0.add(obj3);
                        }
                    }
                } else {
                    for (Object obj4 : list2) {
                        if (!S0.contains(Integer.valueOf(((qba0) obj4).j))) {
                            R0.add(obj4);
                        }
                    }
                }
                copyOnWriteArrayList.clear();
                copyOnWriteArrayList.addAll(R0);
                io.reactivex.rxjava3.subjects.h hVar = tca0Var.b;
                hg1.c3 c3Var = new hg1.c3(tca0.e.b);
                hVar.getClass();
                return new io.reactivex.rxjava3.internal.operators.observable.i0(hVar, c3Var).U(new hg1.b3(tca0.f.b)).U(new he40(new pf40(tca0Var, 5), i2)).p0(j5g.O0(copyOnWriteArrayList));
            case 13:
                PollsWebView pollsWebView = (PollsWebView) obj2;
                int i5 = PollsWebView.h;
                pollsWebView.g((com.vk.uxpolls.presentation.js.model.a) obj);
                pollsWebView.i();
                return s3q0.a;
            case 14:
                ikc0 ikc0Var = (ikc0) obj2;
                ikc0Var.g.f();
                bkc0 bkc0Var = ikc0Var.t;
                sbc0 sbc0Var = ikc0Var.x;
                BoardComment boardComment = (sbc0Var != null ? sbc0Var : null).r;
                if (boardComment == null) {
                    return s3q0.a;
                }
                bkc0Var.b.Mf(-1, new Intent().putExtra("comment", boardComment));
                return s3q0.a;
            case 15:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.h(tgi0Var2, ((ikd0) obj2).b);
                qgi0.r(tgi0Var2, "product_card_community_icon");
                return s3q0.a;
            case 16:
                qgi0.r((tgi0) obj, "filter_item_" + ((nmo) obj2).g);
                return s3q0.a;
            case 17:
                ((tdu) obj).b(((Number) ((mtk0) obj2).getValue()).floatValue());
                return s3q0.a;
            case 18:
                q5e0 q5e0Var = (q5e0) obj2;
                i5e0.a aVar = q5e0Var.m;
                if (aVar != null) {
                    q5e0Var.l.u(aVar);
                }
                return s3q0.a;
            case 19:
                qcy<Object>[] qcyVarArr = PublishFragment.Q;
                ((PublishFragment) obj2).fo().b(new mbe0((PrivacySetting) obj, null));
                return s3q0.a;
            case 20:
                ote0 ote0Var = (ote0) obj2;
                ((wh50) ((zak0) ote0Var.e).getValue()).setValue(Boolean.FALSE);
                ote0Var.a.invoke((sx40) obj);
                return s3q0.a;
            case 21:
                aof0 b = ((Reef) obj2).d.b();
                ((Throwable) obj).getLocalizedMessage();
                b.b();
                return s3q0.a;
            case 22:
                Size size2 = (Size) obj;
                GLES20.glViewport(0, 0, size2.getWidth(), size2.getHeight());
                GLESUtils.c("glViewport", new int[0]);
                GLES20.glClearColor(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                GLESUtils.c("glClearColor", new int[0]);
                GLES20.glClear(16384);
                GLESUtils.c("glClear", 1285);
                ((s1t) obj2).d();
                return s3q0.a;
            case 23:
                return Boolean.valueOf(((kym0) obj) == ((kym0) obj2));
            case 24:
                s8i0 s8i0Var = (s8i0) obj2;
                VKList<Narrative> vKList = (VKList) obj;
                s8i0Var.c(vKList);
                HashSet<Narrative> hashSet = s8i0Var.s;
                ArrayList arrayList3 = new ArrayList();
                for (Narrative narrative : vKList) {
                    List<Integer> list4 = narrative.l;
                    StoryEntry storyEntry = s8i0Var.e;
                    if (j5g.P(list4, storyEntry != null ? Integer.valueOf(storyEntry.c) : null)) {
                        arrayList3.add(narrative);
                    }
                }
                g5g.y(arrayList3, hashSet);
                return s3q0.a;
            case 25:
                Collection collection = (Collection) obj;
                izs<lvi0, Boolean> izsVar = ((kwi0) obj2).b;
                if (izsVar == 0) {
                    return collection;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj5 : collection) {
                    if (((Boolean) izsVar.invoke(obj5)).booleanValue()) {
                        arrayList4.add(obj5);
                    }
                }
                return arrayList4;
            case 26:
                SharedChatsFragment sharedChatsFragment = (SharedChatsFragment) obj2;
                int i6 = SharedChatsFragment.V;
                sharedChatsFragment.U = ((u180) obj).b.a(LongPollType.MESSAGES);
                Toolbar toolbar = sharedChatsFragment.Q;
                (toolbar != null ? toolbar : null).setTitle(sharedChatsFragment.eo());
                return s3q0.a;
            case 27:
                ioj0 ioj0Var = (ioj0) obj2;
                View view = (View) obj;
                if (ioj0Var.n == null) {
                    return s3q0.a;
                }
                Activity c = g2u0.c(view);
                if (c == null) {
                    return s3q0.a;
                }
                uc.o(ioj0Var.l, c, true, null, null, null, 60);
                return s3q0.a;
            case 28:
                mik mikVar = (mik) obj2;
                SmartCropState smartCropState = (SmartCropState) obj;
                SmartCropState.CropVideoProgress cropVideoProgress = smartCropState.i;
                return SmartCropState.a(smartCropState, null, null, null, null, 0L, false, cropVideoProgress != null ? SmartCropState.CropVideoProgress.a(cropVideoProgress, null, ((mik.c) mikVar).a, 7) : null, false, false, null, 1919);
            default:
                s6k0 s6k0Var = (s6k0) obj2;
                vdx0 vdx0Var = e370.e;
                if (vdx0Var == null) {
                    vdx0Var = null;
                }
                return new io.reactivex.rxjava3.internal.operators.single.d0(vdx0Var.x().l(s6k0Var.x).l(new p5w(new c220(21), 19)), new zn(29), null);
        }
    }
}
