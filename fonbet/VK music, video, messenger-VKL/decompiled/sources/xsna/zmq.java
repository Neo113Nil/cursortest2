package xsna;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.util.Size;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.attachments.SnippetAttachment;
import com.vk.dto.fave.MarketFavable;
import com.vk.dto.narratives.Narrative;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.ecomm.fave.api.models.FaveMarketItem;
import com.vk.fave.FaveItem;
import com.vk.fave.entities.FaveEntry;
import com.vk.fave.entities.FaveSource;
import com.vk.log.L;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PodcastAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashSet;
import kotlin.collections.EmptyList;
import xsna.ikv0;
import xsna.jnq;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class zmq implements izs {
    public final /* synthetic */ gmq b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ wzs d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Context f;
    public final /* synthetic */ pqq g;
    public final /* synthetic */ izs h;

    public /* synthetic */ zmq(gmq gmqVar, boolean z, wzs wzsVar, boolean z2, Context context, pqq pqqVar, izs izsVar) {
        this.b = gmqVar;
        this.c = z;
        this.d = wzsVar;
        this.e = z2;
        this.f = context;
        this.g = pqqVar;
        this.h = izsVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0266, code lost:
    
        if (xsna.pkv0.f(r7) == null) goto L126;
     */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ef  */
    /* JADX WARN: Type inference failed for: r1v64, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        Integer valueOf;
        boolean z;
        ikv0.d dVar;
        ikv0.d.c a;
        enq enqVar = enq.a;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        final gmq gmqVar = this.b;
        boolean z2 = this.e;
        if (booleanValue) {
            boolean z3 = this.c;
            gmqVar.s0(z3);
            wzs wzsVar = this.d;
            if (wzsVar != null) {
                wzsVar.invoke(Boolean.valueOf(z3), gmqVar);
            }
            if (z2) {
                boolean z4 = gmqVar instanceof VideoAttachment;
                final Context context = this.f;
                final pqq pqqVar = this.g;
                if (z4) {
                    VideoAttachment videoAttachment = (VideoAttachment) gmqVar;
                    if (!videoAttachment.C2()) {
                        enqVar.getClass();
                        nsq nsqVar = enq.c;
                        nsqVar.getClass();
                        ikv0.a aVar = new ikv0.a(context);
                        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_clock_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), (Size) null, 12);
                        aVar.u = new ikv0.d(context.getString(videoAttachment.k.X() ? R.string.fave_saved_in_watch_later : R.string.fave_removed_from_watch_later), (String) null, (ikv0.d.a) null, 6);
                        aVar.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(videoAttachment.k.X() ? R.string.fave_saved_in_watch_later_action_open : R.string.fave_removed_from_watch_later_action_cancel), new ua(nsqVar, context, videoAttachment, pqqVar, 1));
                        aVar.e = 2000L;
                        pkv0.e(aVar);
                        if (fxc0.B().J().E0()) {
                            HashSet hashSet = iah0.a;
                            if (fnj.d(context)) {
                                z = true;
                                dVar = aVar.u;
                                if (pkv0.c(context, (dVar != null || (a = dVar.a()) == null) ? null : a.a) != null) {
                                    aVar.l = Integer.valueOf(z ? 81 : 80);
                                    aVar.o = Integer.valueOf(context.getResources().getDimensionPixelSize(R.dimen.fave_video_snackbar_small_bottom_margin));
                                    aVar.n();
                                } else {
                                    if (z) {
                                        aVar.k = 1;
                                        aVar.g(1);
                                    }
                                    s3q0 s3q0Var = s3q0.a;
                                    ncb ncbVar = new ncb(aVar, 3);
                                    sim simVar = new sim(aVar, 4);
                                    Activity h = e3m.h(context);
                                    ((Handler) nsqVar.a.getValue()).postDelayed(new osq(h instanceof AppCompatActivity ? (AppCompatActivity) h : null, nsqVar, context, ncbVar, simVar), context.getResources().getInteger(android.R.integer.config_mediumAnimTime));
                                }
                            }
                        }
                        z = false;
                        dVar = aVar.u;
                        if (pkv0.c(context, (dVar != null || (a = dVar.a()) == null) ? null : a.a) != null) {
                        }
                    }
                }
                enqVar.getClass();
                boolean X = gmqVar.X();
                if (gmqVar instanceof Post) {
                    valueOf = Integer.valueOf(X ? R.string.fave_add_post_succcesssful : R.string.fave_remove_post_succcesssful);
                } else if (gmqVar instanceof ArticleAttachment) {
                    valueOf = Integer.valueOf(X ? R.string.fave_add_article_successful : R.string.fave_remove_article_succsessful);
                } else {
                    boolean z5 = gmqVar instanceof abz;
                    int i = R.string.fave_remove_link_successful;
                    if (z5 || (gmqVar instanceof SnippetAttachment)) {
                        if (X) {
                            i = R.string.fave_add_link_successful;
                        }
                        valueOf = Integer.valueOf(i);
                    } else {
                        boolean z6 = gmqVar instanceof MarketFavable;
                        if (z6 || (gmqVar instanceof FaveMarketItem)) {
                            if (gmqVar instanceof FaveMarketItem ? ((FaveMarketItem) gmqVar).b.V : z6 ? ((MarketFavable) gmqVar).e : false) {
                                valueOf = Integer.valueOf(gmqVar.X() ? R.string.fave_add_market_service_successful : R.string.fave_remove_market_service_successful);
                            } else {
                                valueOf = Integer.valueOf(gmqVar.X() ? R.string.fave_add_product_successful : R.string.fave_remove_product_successful);
                            }
                        } else if (z4) {
                            VideoAttachment videoAttachment2 = (VideoAttachment) gmqVar;
                            boolean C2 = videoAttachment2.C2();
                            boolean X2 = videoAttachment2.k.X();
                            valueOf = Integer.valueOf((C2 && X2) ? R.string.fave_add_clip_successful : (!C2 || X2) ? X2 ? R.string.fave_saved_in_watch_later : R.string.fave_removed_from_watch_later : R.string.fave_remove_clip_successful);
                        } else if (gmqVar instanceof PodcastAttachment) {
                            valueOf = Integer.valueOf(X ? R.string.fave_add_podcast_successful : R.string.fave_remove_podcast_successful);
                        } else if (gmqVar instanceof Narrative) {
                            valueOf = Integer.valueOf(X ? R.string.fave_add_narrative : R.string.fave_remove_narrative);
                        } else if (gmqVar instanceof e9z) {
                            if (X) {
                                i = R.string.fave_add_link_successful;
                            }
                            valueOf = Integer.valueOf(i);
                        } else {
                            valueOf = null;
                        }
                    }
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    final boolean X3 = gmqVar.X();
                    ikv0.a aVar2 = new ikv0.a(context);
                    aVar2.t = new ikv0.c.C3058c(R.drawable.vk_icon_bookmark_circle_fill_yellow_28, (Integer) null, (Size) null, 14);
                    aVar2.u = new ikv0.d(context.getString(intValue), (String) null, (ikv0.d.a) null, 6);
                    pkv0.e(aVar2);
                    aVar2.e = 2000L;
                    if (X3) {
                        aVar2.s = new ikv0.e.a(Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, context.getString(X3 ? R.string.fave_save_tip_tag : R.string.fave_cancel_remove), new izs() { // from class: xsna.cnq
                            @Override // xsna.izs
                            public final Object invoke(Object obj2) {
                                ikv0 ikv0Var = (ikv0) obj2;
                                boolean z7 = X3;
                                Context context2 = context;
                                gmq gmqVar2 = gmqVar;
                                pqq pqqVar2 = pqqVar;
                                if (z7) {
                                    int i2 = jnq.i;
                                    gnq.a.getClass();
                                    String h2 = gnq.e(gmqVar2).h();
                                    xuo0.a.getClass();
                                    jnq.a.a(context2, new FaveEntry(new FaveItem(h2, false, xuo0.c(), EmptyList.b, gmqVar2), false, gnq.b(gmqVar2)), pqq.a(pqqVar2, FaveSource.SNACKBAR));
                                    i0q0.d(300L, new wc2(ikv0Var, 4));
                                } else {
                                    enq.g(context2, gmqVar2, pqqVar2, null, null);
                                }
                                return s3q0.a;
                            }
                        });
                    }
                }
                L.l("Can't show toast without resId, for: " + gmqVar);
                s3q0 s3q0Var2 = s3q0.a;
            }
            enqVar.getClass();
            enq.c(gmqVar);
        } else {
            L.l("Can't fave toggle because server return false");
            izs izsVar = this.h;
            if (izsVar != null) {
                izsVar.invoke(gmqVar);
            }
            if (z2) {
                cvk.u(R.string.error, false);
            }
        }
        return s3q0.a;
    }
}
