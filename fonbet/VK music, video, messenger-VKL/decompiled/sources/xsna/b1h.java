package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog.mvi.block.video.impl.video.largelist.entity.VideoLargeListState;
import com.vk.core.compose.component.datetime.DateTimePickerState;
import com.vk.core.compose.component.datetime.b;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.dto.search.SearchStatsLoggingInfo;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.feature.c;
import com.vk.ecomm.verifiedseller.impl.screens.linkvkbid.LinkVKBidFragment;
import com.vk.folders.impl.show.FoldersShowFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.engine.lifecycle.di.ImEngineLifecycleComponent;
import com.vk.profile.community.details.impl.name_history.CommunityNameHistoryFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionArguments;
import com.vk.video.ui.upload.impl.publish.presentation.description.fragment.DescriptionModalInternalComponent;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import one.video.exo.codecs.DecoderSupportInfo;
import one.video.player.BaseVideoPlayer;
import one.video.player.OneVideoPlayer;
import xsna.l2s;
import xsna.nbx.a;
import xsna.o0r0;
import xsna.qvq;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class b1h implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b1h(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [android.os.Parcelable] */
    /* JADX WARN: Type inference failed for: r2v20, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        int i = this.b;
        int i2 = 8;
        byte b = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                c1h c1hVar = (c1h) obj;
                float floatValue = ((Number) ((zak0) c1hVar.k).getValue()).floatValue();
                float x = c1hVar.x();
                float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                if (x != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    f = floatValue / x;
                }
                return Float.valueOf(f);
            case 1:
                int i3 = CommunityNameHistoryFragment.S;
                FragmentActivity activity = ((CommunityNameHistoryFragment) obj).getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 2:
                CommunityProfileFragment communityProfileFragment = (CommunityProfileFragment) obj;
                int i4 = CommunityProfileFragment.k0;
                Bundle requireArguments = communityProfileFragment.requireArguments();
                ynh ynhVar = communityProfileFragment.V;
                c3i c3iVar = (c3i) ynhVar.V0.getValue();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("search_stats_logging_info", SearchStatsLoggingInfo.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    ?? parcelable5 = requireArguments.getParcelable("search_stats_logging_info");
                    parcelable = (SearchStatsLoggingInfo) (parcelable5 instanceof SearchStatsLoggingInfo ? parcelable5 : null);
                }
                return c3iVar.a((azh0) ynhVar.b.getValue(), (SearchStatsLoggingInfo) parcelable);
            case 3:
                return (ucg0) ((vuh) obj).q.getValue();
            case 4:
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) obj;
                mfy mfyVar = communityReviewsFragment.i0;
                WriteBar writeBar = communityReviewsFragment.g0;
                EditText input = writeBar != null ? writeBar.getInput() : null;
                mfyVar.getClass();
                int i5 = CommunityReviewsFragment.o0;
                xn50.a.c(communityReviewsFragment, c.u.b.b);
                s3q0 s3q0Var = s3q0.a;
                if (mfyVar.a && input != null) {
                    input.post(new sc4(input, i2));
                }
                return s3q0.a;
            case 5:
                return (TextView) ((s5i) obj).a.findViewById(R.id.nativeads_age_restrictions);
            case 6:
                DateTimePickerState dateTimePickerState = (DateTimePickerState) obj;
                if (!dateTimePickerState.a.c()) {
                    return null;
                }
                try {
                    b.C0739b c0739b = com.vk.core.compose.component.datetime.h.a;
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault());
                    simpleDateFormat.setLenient(false);
                    return simpleDateFormat.parse(dateTimePickerState.a.b());
                } catch (ParseException unused) {
                    return null;
                }
            case 7:
                return Boolean.valueOf(DecoderSupportInfo.b(((DecoderSupportInfo) obj).a, DecoderSupportInfo.CodecType.HW));
            case 8:
                return ((ugl) obj).l;
            case 9:
                com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b bVar = (com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b) obj;
                qcy<Object>[] qcyVarArr = com.vk.video.ui.upload.impl.publish.presentation.description.fragment.b.j1;
                Bundle requireArguments2 = bVar.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable4 = requireArguments2.getParcelable("arguments", DescriptionArguments.class);
                    parcelable3 = (Parcelable) parcelable4;
                } else {
                    ?? parcelable6 = requireArguments2.getParcelable("arguments");
                    parcelable3 = (DescriptionArguments) (parcelable6 instanceof DescriptionArguments ? parcelable6 : null);
                }
                f2m f2mVar = new f2m((DescriptionArguments) parcelable3);
                l7m d = m7m.d(bVar);
                DescriptionModalInternalComponent.c.getClass();
                return (DescriptionModalInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, f2mVar, fpf0.a(DescriptionModalInternalComponent.class), new kli(b, 2))).a(fpf0.a(DescriptionModalInternalComponent.class));
            case 10:
                while (true) {
                    Object obj2 = null;
                    for (Object obj3 : (List) obj) {
                        if (obj3 instanceof n880) {
                            obj2 = obj3;
                        } else if ((obj3 instanceof z780) && obj2 != null && ((z780) obj3).Z2(0L)) {
                            ((n880) obj2).i3();
                        }
                    }
                    return s3q0.a;
                }
            case 11:
                a5 a5Var = ((r2r) obj).e;
                if (a5Var != null) {
                    a5Var.invoke(Boolean.FALSE);
                }
                return s3q0.a;
            case 12:
                ((n4r) obj).c.invoke(qvq.j.a.b);
                return s3q0.a;
            case 13:
                com.vk.newsfeed.common.recycler.holders.a aVar = (com.vk.newsfeed.common.recycler.holders.a) obj;
                return new fii0(aVar.P, aVar.Q);
            case 14:
                ((io.reactivex.rxjava3.core.y) obj).onSuccess(Boolean.TRUE);
                return s3q0.a;
            case 15:
                FoldersShowFragment foldersShowFragment = (FoldersShowFragment) obj;
                qas qasVar = foldersShowFragment.U;
                qcy<Object> qcyVar = FoldersShowFragment.W[0];
                Long l = (Long) qasVar.b(foldersShowFragment);
                return l == null ? l2s.a.a : new l2s.b(l.longValue());
            case 16:
                return new androidx.lifecycle.m((nbs) obj, true);
            case 17:
                qfs qfsVar = qfs.this;
                OneVideoPlayer.State state = OneVideoPlayer.State.PLAYING;
                vw3 vw3Var = BaseVideoPlayer.H;
                qfsVar.s0(state, null);
                return s3q0.a;
            case 18:
                com.vk.geo.impl.presentation.b bVar2 = (com.vk.geo.impl.presentation.b) obj;
                return new efe0(bVar2.n, bVar2.m, bVar2.D, bVar2.g.getResources(), new atm(bVar2, 7), new m1o(bVar2, 6), new btm(bVar2, i2), new tbh(bVar2, 19), (q6r) bVar2.B.getValue(), bVar2.X(), new s1m(bVar2, 12), new mxj(bVar2, 18), new lkt(1, null), new gbj(bVar2, 14), new m8(bVar2, 4), new b5h(bVar2, 17), new clh(bVar2), new nh0(17));
            case 19:
                ((g8u) obj).n.a();
                return s3q0.a;
            case 20:
                int i6 = HomeFragment2.x0;
                cn o = o25.a().o();
                xwk.e().m(((HomeFragment2) obj).requireContext(), o.a, new o0r0.a(false, null, null, null, null, o.b, o.c, o.j, false, false, false, null, null, null, 65311));
                return s3q0.a;
            case 21:
                return (ImEngineLifecycleComponent) ((g8m) obj).a(fpf0.a(ImEngineLifecycleComponent.class));
            case 22:
                ((h5x) obj).setStyleChooserExpanded(!r7.getStyleChooserExpanded());
                return s3q0.a;
            case 23:
                return ((nbx) obj).new a();
            case 24:
                return (ImageView) ((qex) obj).itemView.findViewById(R.id.video_single_clip_like);
            case 25:
                return Boolean.valueOf(((p5z) obj).g.a());
            case 26:
                qcy<Object>[] qcyVarArr2 = LinkVKBidFragment.S;
                return ((BridgeComponent) ((k7m) m7m.f((LinkVKBidFragment) obj)).a(fpf0.a(BridgeComponent.class))).p().e();
            case 27:
                return Boolean.valueOf(((VideoLargeListState) ((b2a) ((ars0) obj).b.b).getCurrentState()).o);
            case 28:
                return com.vk.clips.sdk.shared.item.market_ads.b.t((com.vk.clips.sdk.shared.item.market_ads.b) obj);
            default:
                return new o810(((f910) obj).A, 0);
        }
    }
}
