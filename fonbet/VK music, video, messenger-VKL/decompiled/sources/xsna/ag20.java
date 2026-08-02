package xsna;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.holders.search.SearchContentVh;
import com.vk.catalog2.feature.music.holders.MusicGridLinkVh;
import com.vk.catalog2.feature.music.ui.holder.MusicCatalogRootVh;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.dto.common.Peer;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.ecomm.orders.api.model.ReviewSuggestion;
import com.vk.ecomm.orders.impl.orderlist.presentation.OrderListFragment;
import com.vk.im.engine.models.dialogs.ChatPermissions;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.reporters.api.msg.OpenMessagesHistoryReporter;
import com.vk.method.selector.api.MethodSelectorComponent;
import com.vk.music.player.cache.MusicPlayerCacheComponentImpl;
import com.vk.newsfeed.impl.newsfeed.presentation.base.fragment.NewsfeedFragment;
import com.vk.newsfeed.impl.posting.PostingFragment;
import com.vk.posting.di.PostingComponent;
import com.vk.profile.user.api.di.UserProfileComponent;
import com.vk.search.fragment.RestoreSearchFragment;
import com.vk.search.params.api.VkPeopleSearchParams;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.search.ui.impl.catalog.roots.MusicSearchCatalogRootVh;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.video.ui.upload.impl.publish.presentation.publish.feature.entity.PublishState;
import com.vkontakte.android.R;
import java.io.File;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.d960;
import xsna.e3m;
import xsna.fia0;
import xsna.fqv;
import xsna.nyd0.k;
import xsna.r070;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ag20 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ag20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x02e0, code lost:
    
        if (r0 != false) goto L113;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v18, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ChatSettings Hb;
        PrivateFiles.a b;
        Matrix o;
        Parcelable parcelable;
        Object parcelable2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((mdz) ((bg20) obj).f.getValue()).a(OpenMessagesHistoryReporter.Span.BUILD_ADAPTER_ENTRY_LIST);
            case 1:
                com.vk.im.ui.formatters.spans.dialogitem.a aVar = (com.vk.im.ui.formatters.spans.dialogitem.a) obj;
                return Integer.valueOf(e3m.f((aVar.b && aVar.d) ? R.attr.vk_ui_text_subhead : aVar.c ? R.attr.vk_ui_text_primary : R.attr.vk_ui_text_tertiary, aVar.a));
            case 2:
                Context e = ((zn30) obj).e();
                e3m.a aVar2 = e3m.a;
                return Integer.valueOf(e.getColor(R.color.vk_clear));
            case 3:
                Dialog Cb = ((kz30) obj).k.Cb();
                if (Cb != null && (Hb = Cb.Hb()) != null) {
                    Peer peer = Hb.d;
                    boolean z = Hb.q;
                    Peer a = com.vk.dto.common.a.a(o25.a().c());
                    ChatPermissions chatPermissions = Hb.B;
                    Object obj2 = chatPermissions != null ? chatPermissions.d : null;
                    boolean f = epx.f(obj2, "owner") ? epx.f(peer, a) : !epx.f(obj2, "owner_and_admins") || epx.f(peer, a) || Hb.e.contains(a);
                    if (z) {
                    }
                }
                r1 = false;
                return Boolean.valueOf(r1);
            case 4:
                ((MusicCatalogRootVh) obj).D.d();
                return s3q0.a;
            case 5:
                MusicGridLinkVh musicGridLinkVh = (MusicGridLinkVh) obj;
                return new nm40(musicGridLinkVh.d, musicGridLinkVh.f, musicGridLinkVh.e, new nq1(musicGridLinkVh, 9));
            case 6:
                qcy<Object>[] qcyVarArr = MusicPlayerCacheComponentImpl.d;
                b = e8r.a.b(r6, PrivateSubdir.MUSIC_PLAYER_CACHE.h(), true);
                File file = b.a;
                nwy nwyVar = ((MusicPlayerCacheComponentImpl) obj).a;
                qcy<Object> qcyVar = MusicPlayerCacheComponentImpl.d[0];
                r9g0 r9g0Var = (r9g0) nwyVar.c();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                return new androidx.media3.datasource.cache.c(file, r9g0Var, new xc40(context.getApplicationContext(), "music_cache.db", null, 1), false);
            case 7:
                return ((MusicSearchCatalogRootVh) obj).x.e;
            case 8:
                return (TextView) ((y750) obj).findViewById(R.id.tvTrackName);
            case 9:
                d960 d960Var = (d960) obj;
                d960.b bVar = (d960.b) d960Var.r.getValue();
                Context context2 = d960Var.itemView.getContext();
                bVar.getClass();
                return new d960.a(d960Var, new d960.b.a(bVar, LayoutInflater.from(context2).inflate(R.layout.item_new_user_onboarding_card, (ViewGroup) null, false)));
            case 10:
                return (SharingComponent) ((k7m) m7m.f((com.vk.newsfeed.common.helpers.a) obj)).a(fpf0.a(SharingComponent.class));
            case 11:
                return ((NewsfeedFragment) obj).k0;
            case 12:
                return ((UserProfileComponent) ((mo60) obj).c().mo408a(fpf0.a(UserProfileComponent.class))).m3();
            case 13:
                ((FunctionReferenceImpl) obj).invoke(r070.e.C3587e.b);
                return s3q0.a;
            case 14:
                j270 j270Var = (j270) obj;
                Path path = new Path((Path) brv.a.getValue());
                float f2 = j270Var.a;
                RectF rectF = (RectF) j270Var.g.b.get();
                path.computeBounds(rectF, true);
                float f3 = rectF.right;
                if (f3 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    float f4 = rectF.bottom;
                    if (f4 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                        k270 k270Var = (k270) j270Var.c;
                        float f5 = k270Var.c * f2;
                        float f6 = k270Var.d * f2;
                        float f7 = f5 / f3;
                        if (f7 < 1.0f) {
                            f7 = 1.0f / f7;
                        }
                        float f8 = f6 / f4;
                        if (f8 < 1.0f) {
                            f8 = 1.0f / f8;
                        }
                        o = s1v.o(f7, f8);
                        path.transform(o);
                        Path path2 = new Path((Path) brv.b.getValue());
                        path2.transform(o);
                        return new fqv.a(path, path2);
                    }
                }
                o = s1v.o(f2, f2);
                path.transform(o);
                Path path22 = new Path((Path) brv.b.getValue());
                path22.transform(o);
                return new fqv.a(path, path22);
            case 15:
                w970 w970Var = (w970) obj;
                if (!w970Var.e.isEmpty()) {
                    w970Var.a();
                }
                return s3q0.a;
            case 16:
                qcy<Object>[] qcyVarArr2 = b080.q1;
                return ((b080) obj).requireArguments().getString("HINT_ID");
            case 17:
                OrderListFragment orderListFragment = (OrderListFragment) obj;
                qcy<Object>[] qcyVarArr3 = OrderListFragment.Q;
                kw00 Y4 = ((MarketComponent) m7m.d(orderListFragment).a(fpf0.a(MarketComponent.class))).Y4();
                Bundle requireArguments = orderListFragment.requireArguments();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable2 = requireArguments.getParcelable("review_suggestion_arg", ReviewSuggestion.class);
                    parcelable = (Parcelable) parcelable2;
                } else {
                    Object parcelable3 = requireArguments.getParcelable("review_suggestion_arg");
                    parcelable = (ReviewSuggestion) (parcelable3 instanceof ReviewSuggestion ? parcelable3 : null);
                }
                return new hw80(new dw80((ReviewSuggestion) parcelable, 2043), Y4);
            case 18:
                return ((MethodSelectorComponent) m7m.d((mm90) obj).mo408a(fpf0.a(MethodSelectorComponent.class))).a();
            case 19:
                return ((VkPeopleSearchParams) ((zak0) ((lv90) obj).l1).getValue()).b;
            case 20:
                ((qia0) obj).e.invoke(fia0.b.b);
                return s3q0.a;
            case 21:
                return Float.valueOf(f17.e((h17) obj));
            case 22:
                return new ctu(new mga0((com.vk.channels.impl.post_settings.b) obj, 5));
            case 23:
                int i2 = PostingFragment.s0;
                return ((PostingComponent) m7m.d((PostingFragment) obj).mo408a(fpf0.a(PostingComponent.class))).G4();
            case 24:
                return Integer.valueOf(((ond0) obj).getBindingAdapterPosition());
            case 25:
                return ((nyd0) obj).new k();
            case 26:
                PublishState publishState = (PublishState) obj;
                return Boolean.valueOf((((Boolean) publishState.V.getValue()).booleanValue() || ((Boolean) publishState.W.getValue()).booleanValue()) ? false : true);
            case 27:
                int i3 = RestoreSearchFragment.h0;
                return ((SearchParamsComponent) ((k7m) m7m.f((RestoreSearchFragment) obj)).a(fpf0.a(SearchParamsComponent.class))).Db();
            case 28:
                om6<?> om6Var = ((dxh0) obj).a;
                ysg0<Object> ysg0Var = ysg0.b;
                ysg0Var.a(om6Var.d());
                ysg0Var.a(new hru0());
                return s3q0.a;
            default:
                o0i0 o0i0Var = (o0i0) obj;
                return new SearchContentVh(o0i0Var.b(o0i0Var.d, false, null), o0i0Var.b(o0i0Var.e, true, o0i0Var.g), new z24(o0i0Var, 4), new q60(o0i0Var, 10));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ ag20(izs izsVar) {
        this.b = 13;
        this.c = (FunctionReferenceImpl) izsVar;
    }
}
