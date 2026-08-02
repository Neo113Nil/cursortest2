package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.EditText;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.audiomsg.player.Speed;
import com.vk.avatarpicker.BaseAvatarPickerActivity;
import com.vk.channels.api.Channel;
import com.vk.clips.favorites.impl.ui.folders.list.c;
import com.vk.clips.playlists.ui.picker.c;
import com.vk.clips.playlists.ui.picker.e;
import com.vk.clips.sdk.shared.item.clips_grid_block.presentation.c;
import com.vk.clips.tool.view.viewer.feed.wrapper.fragment.FragmentContainerFrameLayout;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;
import com.vk.ecomm.catalog.impl.catalog.simple.ClassifiedsCatalogSimpleRootVh;
import com.vk.log.L;
import com.vk.photos.root.archive.presentation.ArchiveFragment;
import com.vk.rlottie.RLottieDrawable;
import com.vk.search.params.api.City;
import com.vk.voip.ui.BannedBottomSheet;
import com.vk.voip.ui.ext.VKCallUserInputData;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.Ref$IntRef;
import xsna.ai8;
import xsna.cwb0;
import xsna.dv7;
import xsna.ikv0;
import xsna.qbe;
import xsna.qvq;
import xsna.r2c;
import xsna.tj50;
import xsna.uuf;
import xsna.uxd0;
import xsna.xf8;
import xsna.z7b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class ix2 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ix2(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v24, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        FieldKey fieldKey;
        int i = this.b;
        Object obj2 = null;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                hx2<T> hx2Var = ((jx2) obj3).f;
                Throwable th = (Throwable) obj;
                if ((th instanceof VKApiExecutionException) && hx2Var != 0) {
                    hx2Var.e((VKApiExecutionException) th);
                } else if (hx2Var != 0) {
                    hx2Var.e(new VKApiExecutionException(1, "", false, "", null, null, null, null, 0, null, null, null, 4080));
                }
                return s3q0.a;
            case 1:
                int i2 = ArchiveFragment.e0;
                ((ArchiveFragment) obj3).getFeature().C((ig3) obj);
                return s3q0.a;
            case 2:
                ((EditText) ((ow3) obj3).e.getValue()).setHint((String) obj);
                return s3q0.a;
            case 3:
                Speed speed = (Speed) obj;
                rr4 rr4Var = ((jr4) obj3).s;
                if (rr4Var != null) {
                    rr4Var.d(speed);
                }
                return s3q0.a;
            case 4:
                ((vu4) obj3).Z0((Throwable) obj);
                return s3q0.a;
            case 5:
                Throwable th2 = (Throwable) obj;
                ((r46) obj3).k(new uxd0.w(th2));
                L.g("ProfileInfoModel", th2);
                return s3q0.a;
            case 6:
                List<BaseAvatarPickerActivity.ImageSourceAction> list = BaseAvatarPickerActivity.f;
                ((BaseAvatarPickerActivity) obj3).O1();
                return s3q0.a;
            case 7:
                ((c47) obj3).f.a((Throwable) obj);
                return s3q0.a;
            case 8:
                ((izs) obj3).invoke(dv7.c.b);
                return s3q0.a;
            case 9:
                ViewGroup viewGroup = (ViewGroup) obj;
                int i3 = c9k0.p;
                return new c9k0(e3m.b(viewGroup.getContext()).inflate(R.layout.vkim_snackbar, viewGroup, false), ((j38) obj3).h);
            case 10:
                ((wf8) obj3).d(xf8.g.a);
                return s3q0.a;
            case 11:
                yh8 yh8Var = (yh8) obj3;
                bzb0 bzb0Var = yh8Var.o;
                ai8 ai8Var = yh8Var.q;
                ai8.a aVar = ai8Var instanceof ai8.a ? (ai8.a) ai8Var : null;
                z = aVar != null && aVar.d;
                bzb0.d(bzb0Var, new cwb0.a1(z ? R.string.voip_broadcast_record_finish_submit_dialog_title : R.string.voip_broadcast_stream_finish_submit_dialog_title, null, z ? R.string.voip_broadcast_record_finish_submit_description : R.string.voip_broadcast_finish_submit_description, null, R.string.voip_broadcast_finish_submit_yes, null, R.string.voip_broadcast_finish_submit_no, null, null, null, 938), new com.vk.newsfeed.posting.mediapicker.photovk.base.a(yh8Var, 13), null, null, 28);
                return s3q0.a;
            case 12:
                gzs gzsVar = (gzs) obj3;
                whr0 whr0Var = (whr0) obj;
                ysg0<Object> ysg0Var = ysg0.b;
                int i4 = BannedBottomSheet.R;
                z = gzsVar != null;
                BannedBottomSheet bannedBottomSheet = new BannedBottomSheet();
                Bundle bundle = new Bundle();
                bundle.putParcelable("call_member", new VKCallUserInputData(whr0Var));
                bundle.putBoolean("has_callback", z);
                bannedBottomSheet.setArguments(bundle);
                ysg0Var.a(new shj0(bannedBottomSheet, gzsVar));
                return s3q0.a;
            case 13:
                return (com.vk.channels.impl.channel_screen.footer.k) obj3;
            case 14:
                i5b i5bVar = (i5b) obj3;
                p5b p5bVar = i5bVar.r;
                p5bVar.f = (Channel) obj;
                if (i5bVar.e && !p5bVar.e) {
                    i5bVar.Y0().a(i5bVar.r);
                }
                return s3q0.a;
            case 15:
                z7b z7bVar = (z7b) obj;
                a8b a8bVar = ((q7b) obj3).k1;
                if (a8bVar != null) {
                    Context context = a8bVar.a;
                    int i5 = 18;
                    if (z7bVar instanceof z7b.a) {
                        if (a8bVar.d == null) {
                            a8bVar.d = a8bVar.a(new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channels_payout_list_changed_error_title)), (ikv0.d.b) null, (ikv0.d.a) null, 6), new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(R.string.vkim_channels_payout_list_changed_error_button), new n40(a8bVar, 15)), new com.vk.movika.sdk.base.ui.g(a8bVar, i5));
                        }
                    } else {
                        if (!(z7bVar instanceof z7b.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        if (a8bVar.e == null && a8bVar.b != null) {
                            a8bVar.e = a8bVar.a(new ikv0.d(new ikv0.d.c(context.getString(R.string.vkim_channels_payout_loading_error_title)), (ikv0.d.b) null, new ikv0.d.a(context.getString(R.string.vkim_channels_payout_loading_error_button), null, new p40(a8bVar, 21), Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE), 2), null, new jd(a8bVar, i5));
                        }
                    }
                }
                return s3q0.a;
            case 16:
                return Boolean.valueOf(((ieb) obj3).b.contains(fpf0.a(((b180) obj).getClass())));
            case 17:
                q5c q5cVar = (q5c) obj3;
                City city = (City) obj;
                if (city != null && (fieldKey = q5cVar.d) != null) {
                    q5cVar.b.a(new r2c.v(city.b, city.c, fieldKey));
                }
                return s3q0.a;
            case 18:
                ((ClassifiedsCatalogSimpleRootVh) obj3).n0();
                return s3q0.a;
            case 19:
                int i6 = ClipFeedListFragment.a2;
                ((ClipFeedListFragment) obj3).Do().getFeature().a(new qvq.i.e(true, (String) obj));
                return s3q0.a;
            case 20:
                uzc uzcVar = (uzc) obj3;
                RLottieDrawable rLottieDrawable = (RLottieDrawable) obj;
                rLottieDrawable.i();
                rLottieDrawable.setCallback((Drawable.Callback) uzcVar.d.getValue());
                rLottieDrawable.k.q = 2;
                if (uzcVar.g) {
                    rLottieDrawable.j();
                    uzcVar.g = false;
                }
                uzcVar.f = rLottieDrawable;
                return s3q0.a;
            case 21:
                return o1d.l((o1d) obj3, (y0r) obj);
            case 22:
                w6d w6dVar = (w6d) obj3;
                w6dVar.e.a(k5d.b);
                w6dVar.g.g9(null, null, null);
                return s3q0.a;
            case 23:
                ((com.vk.clips.favorites.impl.ui.folders.list.b) obj3).T(c.d.b.b);
                return s3q0.a;
            case 24:
                com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a aVar2 = (com.vk.clips.sdk.shared.item.clips_grid_block.presentation.a) obj3;
                aVar2.k.a((Throwable) obj);
                aVar2.T(c.g.b.b);
                aVar2.l.b(qbe.b.a);
                return s3q0.a;
            case 25:
                Ref$IntRef ref$IntRef = (Ref$IntRef) obj3;
                int i7 = ref$IntRef.element;
                boolean z2 = i7 == 0;
                ref$IntRef.element = i7 + 1;
                return new Pair(Boolean.valueOf(z2), obj);
            case 26:
                ene eneVar = (ene) obj3;
                cne cneVar = (cne) obj;
                Iterator<T> it = eneVar.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (((bne) next).a == cneVar.a) {
                            obj2 = next;
                        }
                    }
                }
                bne bneVar = (bne) obj2;
                if (bneVar != null) {
                    bneVar.b(eneVar.d, eneVar.e);
                }
                return s3q0.a;
            case 27:
                com.vk.clips.playlists.ui.picker.b bVar = (com.vk.clips.playlists.ui.picker.b) obj3;
                bVar.T(new c.a(false));
                bVar.l.b(new e.a(mve.a));
                return s3q0.a;
            case 28:
                h4x h4xVar = (h4x) obj3;
                wuf wufVar = (wuf) obj;
                int i8 = ClipsWrapperFragment.Q0;
                FragmentContainerFrameLayout r = wufVar.r();
                int i9 = h4xVar.b;
                f4m.t(i9, r);
                f4m.t(i9, wufVar.k());
                f4m.q(h4xVar.d, wufVar.q());
                return s3q0.a;
            default:
                tj50.a aVar3 = (tj50.a) obj;
                vuf vufVar = ((itf) obj3).e;
                xsf xsfVar = new xsf(1, vufVar, vuf.class, "mapItems", "mapItems(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$ItemsData;", 0);
                ao8 ao8Var = ao8.d;
                return new uuf.b(aVar3.a(xsfVar, ao8Var), aVar3.a(new ysf(1, vufVar, vuf.class, "mapTitle", "mapTitle(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$TitleData;", 0), ao8Var), aVar3.a(new zsf(1, vufVar, vuf.class, "mapTooltip", "mapTooltip(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$TooltipData;", 0), ao8Var), aVar3.a(new atf(1, vufVar, vuf.class, "mapOnboarding", "mapOnboarding(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$OnboardingData;", 0), ao8Var), aVar3.a(new btf(1, vufVar, vuf.class, "mapStatistics", "mapStatistics(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$StatisticsData;", 0), ao8Var), aVar3.a(new ctf(1, vufVar, vuf.class, "mapDecoration", "mapDecoration(Lcom/vk/clips/viewer/impl/feed/wrapper/presentation/state/ClipsWrapperMviState;)Lcom/vk/clips/viewer/impl/feed/wrapper/ui/state/ClipsWrapperViewState$DecorationData;", 0), ao8Var));
        }
    }
}
