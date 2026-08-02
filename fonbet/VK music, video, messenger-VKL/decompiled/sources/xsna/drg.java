package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextPaint;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.dto.newsfeed.FaveTag;
import com.vk.fave.entities.FaveSource;
import com.vk.fave.entities.FaveType;
import com.vk.music.di.StickyPlayerComponent;
import com.vk.music.pref.MusicPrefsComponent;
import com.vk.network.eventhub.impl.di.EventHubComponentImpl;
import com.vk.newsfeed.impl.fave_feed.presentation.fragment.FaveFeedFragment;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment.d;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchAllCatalogRootVh;
import com.vk.search.ui.impl.catalog.roots.GlobalSearchMarketCatalogRootVh;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.vkclient.js.bridge.api.di.JsVkclientDelegateComponent;
import com.vk.typography.FontFamily;
import com.vk.typography.TextSizeUnit;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.Map;
import kotlin.Result;
import kotlin.Triple;
import xsna.b0i;
import xsna.bsm;
import xsna.iuv;
import xsna.w2x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class drg implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ drg(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object obj2;
        Object parcelable;
        Object serializable;
        int i = this.b;
        int i2 = 25;
        FaveSource faveSource = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) obj3;
                int i3 = CommunityAddressesFragment.E0;
                communityAddressesFragment.S = communityAddressesFragment.new d();
                vqg vqgVar = communityAddressesFragment.A0;
                if (vqgVar == null) {
                    vqgVar = null;
                }
                vqgVar.c(true);
                CommunityAddressesFragment.g gVar = communityAddressesFragment.S;
                (gVar != null ? gVar : null).initialize();
                communityAddressesFragment.no();
                return s3q0.a;
            case 1:
                return Boolean.valueOf(((double) ((Number) ((c1h) obj3).u.getValue()).floatValue()) > 0.5d);
            case 2:
                return (StoryViewerComponent) ((k7m) m7m.f((vvh) obj3)).a(fpf0.a(StoryViewerComponent.class));
            case 3:
                ((fyh) obj3).i.c(b0i.a.a);
                return s3q0.a;
            case 4:
                return Boolean.valueOf(((h4i) obj3).b.getValue().floatValue() <= 0.5f);
            case 5:
                return new p180(new nq4((y8i) obj3, 4));
            case 6:
                ((zt4) obj3).invoke(null);
                return s3q0.a;
            case 7:
                ((com.vk.music.analytics.api.collector.strategy.a) ((w6e) obj3).c).h = null;
                return s3q0.a;
            case 8:
                return new bsm.d((bsm) obj3);
            case 9:
                a5n a5nVar = ((e4n) obj3).f;
                return new Result(a5nVar.b.f(new vxf0(), new gjj0(a5nVar.c)));
            case 10:
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                return new v6n(new yqf((DiscoverSimilarFeedFragment) obj3, 13));
            case 11:
                return new td60(((mqp) obj3).y);
            case 12:
                qcy<Object>[] qcyVarArr2 = EventHubComponentImpl.e;
                return new xzp(((EventHubComponentImpl) obj3).c9());
            case 13:
                qcy<Object>[] qcyVarArr3 = FaveFeedFragment.s0;
                Bundle requireArguments = ((FaveFeedFragment) obj3).requireArguments();
                int i4 = Build.VERSION.SDK_INT;
                if (i4 >= 33) {
                    serializable = requireArguments.getSerializable("fave_type", FaveType.class);
                    obj = serializable;
                } else {
                    Object serializable2 = requireArguments.getSerializable("fave_type");
                    if (!(serializable2 instanceof FaveType)) {
                        serializable2 = null;
                    }
                    obj = (FaveType) serializable2;
                }
                FaveType faveType = (FaveType) obj;
                if (i4 >= 33) {
                    parcelable = requireArguments.getParcelable("fave_tag", FaveTag.class);
                    obj2 = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("fave_tag");
                    if (!(parcelable2 instanceof FaveTag)) {
                        parcelable2 = null;
                    }
                    obj2 = (FaveTag) parcelable2;
                }
                FaveTag faveTag = (FaveTag) obj2;
                String string = requireArguments.getString("source");
                if (string != null) {
                    FaveSource.Companion.getClass();
                    faveSource = FaveSource.a.a(string);
                }
                return new zqq(faveType, faveTag, faveSource);
            case 14:
                ((pds) ((Fragment) obj3)).o1();
                return s3q0.a;
            case 15:
                ((com.vk.newsfeed.common.recycler.holders.a) obj3).s7();
                return s3q0.a;
            case 16:
                ((s3t) obj3).f.invoke();
                return s3q0.a;
            case 17:
                Triple triple = (Triple) obj3;
                StringBuilder sb = new StringBuilder("pendingMoveTransactionIdForPublishing = ");
                ((m300) triple.i()).getClass();
                sb.append((Object) m300.a(0L));
                sb.append(", ");
                sb.append(((Map) triple.j()).size());
                sb.append(", ");
                sb.append(triple.k());
                return sb.toString();
            case 18:
                return ((GlobalSearchAllCatalogRootVh) obj3).q;
            case 19:
                return ((GlobalSearchMarketCatalogRootVh) obj3).m.b.e;
            case 20:
                return ((y4u) obj3).n.t();
            case 21:
                ((ktv) obj3).h.b(iuv.e.a);
                return s3q0.a;
            case 22:
                mbx mbxVar = (mbx) obj3;
                uov uovVar = mbxVar.a;
                kbx kbxVar = new kbx(uovVar.getCtx(), new n5i(mbxVar, i2), new jcg(mbxVar, 27));
                Context ctx = uovVar.getCtx();
                HashSet hashSet = iah0.a;
                kbxVar.setLayoutParams(new FrameLayout.LayoutParams(!fnj.d(ctx) ? iah0.z(kbxVar.getContext()) - (iah0.a(48) * 2) : iah0.a(PsExtractor.VIDEO_STREAM_MASK), -2, 1));
                kbxVar.setTranslationY(iah0.b(127.0f));
                return kbxVar;
            case 23:
                xwv0 xwv0Var = ((n1y) obj3).b;
                if (xwv0Var != null) {
                    return xwv0Var.E();
                }
                return null;
            case 24:
                x6y x6yVar = (x6y) obj3;
                com.vk.superapp.vkclient.js.bridge.api.di.b v4 = ((JsVkclientDelegateComponent) x6y.H().a(fpf0.a(JsVkclientDelegateComponent.class))).v4();
                fvv0 M = x6yVar.M();
                fvv0 M2 = x6yVar.M();
                return v4.a(new t7y(M, x6yVar, M2 != null ? M2.d() : null, new r5i(x6yVar, i2), new z6y(x6yVar)));
            case 25:
                com.vk.voip.ui.c.C(com.vk.voip.ui.c.b, null, 0L, false, false, false, null, 191);
                ((w2x0.a) obj3).c.invoke();
                return s3q0.a;
            case 26:
                TextPaint textPaint = new TextPaint();
                textPaint.setColor(dhr0.t.c(R.attr.vk_ui_text_contrast));
                com.vk.typography.b.c(textPaint, ((hk30) obj3).a, FontFamily.REGULAR, Float.valueOf(e3m.a(R.dimen.vkim_msg_part_text_body, r7.a)), TextSizeUnit.PX);
                return textPaint;
            case 27:
                return (ImageView) ((un30) obj3).d.findViewById(R.id.ic_blocked_view);
            case 28:
                return ((MusicPrefsComponent) ((k7m) m7m.f((gn40) obj3)).a(fpf0.a(MusicPrefsComponent.class))).Q0();
            default:
                return (StickyPlayerComponent) ((k7m) m7m.c((com.vk.music.informer.mvi.f) obj3)).mo408a(fpf0.a(StickyPlayerComponent.class));
        }
    }
}
