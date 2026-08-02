package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.RectF;
import android.provider.CalendarContract;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.unity3d.services.UnityAdsConstants;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.core.tips.Tooltip;
import com.vk.core.ui.themes.NavigationBarStyle;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.donut.video.model.domain.action.DonutVideoAction;
import com.vk.dto.common.Direction;
import com.vk.dto.common.Source;
import com.vk.dto.newsfeed.SituationalSuggest;
import com.vk.dto.photo.Photo;
import com.vk.dto.shortvideo.entries.ClipsGridHeaderEntry;
import com.vk.dto.stickers.StickerStockItem;
import com.vk.dto.user.RequestUserProfile;
import com.vk.ecomm.onlinebooking.impl.edit.BookingEditScreenState;
import com.vk.ecomm.onlinebooking.impl.edit.a;
import com.vk.feed.tool.view.posting.zoomimage.ZoomImageView;
import com.vk.log.L;
import com.vk.newsfeed.api.posting.PostingCreationEntryPoint;
import com.vk.newsfeed.impl.fragments.BaseCommentsFragment;
import com.vk.newsfeed.posting.music_picker.presentation.model.MusicPickerListItem;
import com.vk.photos.ui.profile.ProfileMainPhotosFragment;
import com.vk.pushes.PushOpenActivity;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.a;
import com.vk.stickers.details.AuthorSubscriptionRef;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import xsna.ad80;
import xsna.bja0;
import xsna.cco;
import xsna.dai;
import xsna.e3m;
import xsna.ee80;
import xsna.fss;
import xsna.hjl0;
import xsna.ipz;
import xsna.k840;
import xsna.w920;
import xsna.xbg0;
import xsna.znc;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class cy0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cy0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v37, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object bVar;
        boolean z;
        boolean z2;
        int i = this.b;
        int i2 = 28;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                com.vk.clips.sdk.shared.item.ads.c cVar = (com.vk.clips.sdk.shared.item.ads.c) obj2;
                return new py0(new d11(e3m.a(R.dimen.clip_owner_avatar_height, (Context) obj)), cVar.h, cVar.j.a instanceof ClipFeedTab.SingleAdv);
            case 1:
                o84 o84Var = (o84) obj2;
                Photo e = o84Var.e((PhotoAttachment) obj);
                if (e != null) {
                    o84Var.j(0, Collections.singletonList(e));
                }
                return s3q0.a;
            case 2:
                bja0.a aVar = (bja0.a) obj2;
                BaseCommentsFragment baseCommentsFragment = (BaseCommentsFragment) obj;
                int i3 = BaseCommentsFragment.l0;
                try {
                    aVar.a(4331, baseCommentsFragment);
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
                return s3q0.a;
            case 3:
                ((izs) obj2).invoke(new a.e.C0963a(((BookingEditScreenState.g) obj).b));
                return s3q0.a;
            case 4:
                ((izs) obj2).invoke(((znc.a) obj).a);
                return s3q0.a;
            case 5:
                afe afeVar = (afe) obj2;
                ((pee) afeVar.x.getValue()).a(afeVar.h, (ClipsGridHeaderEntry.Author) obj, new tm0(afeVar, i2));
                return s3q0.a;
            case 6:
                View view = (View) obj2;
                baf bafVar = (baf) obj;
                RectF rectF = new RectF(bwt0.C(view));
                rectF.bottom = dq.a(8.0f, rectF.bottom);
                Context context = view.getContext();
                Context context2 = view.getContext();
                String string = view.getContext().getString(R.string.clips_duet_rec_tip);
                pla.e().b().getClass();
                b1y b1yVar = new b1y((String) null);
                Tooltip.WindowStyle windowStyle = Tooltip.WindowStyle.FULLSCREEN;
                Context context3 = view.getContext();
                e3m.a aVar2 = e3m.a;
                bafVar.b = Tooltip.l(new Tooltip(context2, string, null, windowStyle, null, null, b1yVar, context3.getColor(R.color.vk_white), view.getContext().getColor(R.color.vk_gray_800), null, 0.6f, null, 0, false, NavigationBarStyle.DARK, 0, true, null, null, null, null, null, null, new t7(bafVar, 9), 5000L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, 0, null, null, null, null, -25249248, 15), context, rectF, true, true, false, true, 128);
                return s3q0.a;
            case 7:
                tmh tmhVar = (tmh) obj2;
                ExtendedCommunityProfile extendedCommunityProfile = (ExtendedCommunityProfile) obj;
                v1h v1hVar = tmhVar.j;
                tmhVar.f.setItems(v1hVar != null ? v1hVar.b(extendedCommunityProfile) : null);
                return s3q0.a;
            case 8:
                fqj fqjVar = (fqj) obj2;
                nqj nqjVar = (nqj) obj;
                fqjVar.e = new com.vk.movika.sdk.base.model.e(nqjVar, i2);
                fqjVar.g = new p4f(nqjVar, 11);
                return s3q0.a;
            case 9:
                c5m c5mVar = (c5m) obj2;
                Context context4 = (Context) obj;
                j4m j4mVar = c5mVar.e;
                (j4mVar != null ? j4mVar : null).S1(context4);
                dw20 dw20Var = c5mVar.f;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 10:
                hgm hgmVar = (hgm) obj2;
                Context context5 = hgmVar.d;
                VkImageSimple vkImageSimple = new VkImageSimple(context5, null, 6, 0);
                vkImageSimple.setImageResource(R.drawable.vk_icon_donut_color_12);
                vkImageSimple.setContentDescription(context5.getString(R.string.accessibility_donut_chat));
                int i4 = hgmVar.q0;
                vkImageSimple.setLayoutParams(egm.W(hgmVar, i4, i4, hgmVar.g0, 0, 0, hgmVar.v0, 24));
                ((ViewGroup) obj).addView(vkImageSimple);
                return vkImageSimple;
            case 11:
                DonutVideoAction donutVideoAction = (DonutVideoAction) obj;
                iie iieVar = ((dai.d) ((cco.a) obj2).b.getValue()).c;
                if (iieVar != null) {
                    iieVar.invoke(donutVideoAction);
                }
                return s3q0.a;
            case 12:
                Intent intent = (Intent) obj2;
                com.vk.attachpicker.screen.h hVar = (com.vk.attachpicker.screen.h) obj;
                if (intent != null && hVar.d() != null) {
                    j34 j34Var = hVar.j;
                    if (j34Var != null) {
                        j34Var.V2(intent);
                    } else {
                        j34 c = rwi.d().p().c(hVar.d());
                        if (c != null) {
                            c.V2(intent);
                        }
                    }
                }
                return s3q0.a;
            case 13:
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                ((izs) obj2).invoke(((euk0) qak0.t(snapshotStateList.b, snapshotStateList)).c);
                return s3q0.a;
            case 14:
                nis nisVar = (nis) obj2;
                nisVar.c.a(new fss.c((RequestUserProfile) obj, nisVar.b.H5()));
                return s3q0.a;
            case 15:
                csj0 csj0Var = (csj0) obj;
                ggc0 ggc0Var = ((nbv) obj2).c;
                if (ggc0Var != null) {
                    ggc0Var.a(csj0Var, PostingCreationEntryPoint.FeedPlus);
                }
                return s3q0.a;
            case 16:
                ((com.vk.newsfeed.posting.market_picker.presentation.base.view.d) obj2).b((ZoomImageView) obj);
                return s3q0.a;
            case 17:
                w920 w920Var = (w920) obj2;
                h8v h8vVar = w920Var.c;
                Direction direction = (Direction) obj;
                ReentrantReadWriteLock reentrantReadWriteLock = w920Var.t;
                f9w f9wVar = w920Var.g;
                int i5 = w920Var.e;
                ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
                readLock.lock();
                try {
                    w920Var.q.set(true);
                    if (!w920Var.c().o() && !w920Var.c().isEmpty()) {
                        int size = w920Var.c().size();
                        int max = (i5 > size && w920Var.c().c && w920Var.c().e) ? Math.max((i5 - size) / 2, 5) : (i5 <= size || w920Var.c().e) ? w920Var.f : Math.max(i5 - size, 5);
                        gj30 c2 = w920Var.c();
                        int[] iArr = w920.a.$EnumSwitchMapping$0;
                        int i6 = iArr[direction.ordinal()];
                        if (i6 == 1) {
                            z = c2.d;
                        } else {
                            if (i6 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            z = c2.b;
                        }
                        if (z) {
                            wj30 wj30Var = new wj30(h8vVar.a().b(w920Var.c(), direction), direction);
                            f9wVar.debug(new x5z(max, w920Var));
                            bVar = new ipz.a(wj30Var, Source.CACHE, max);
                        } else if (w920Var.p.get()) {
                            bVar = new ipz.b("loadNext: Skipped with isExpiredHistoryUpdating = true");
                        } else {
                            gj30 c3 = w920Var.c();
                            int i7 = iArr[direction.ordinal()];
                            if (i7 == 1) {
                                z2 = c3.e;
                            } else {
                                if (i7 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                z2 = c3.c;
                            }
                            if (z2) {
                                wj30 wj30Var2 = new wj30(h8vVar.a().b(w920Var.c(), direction), direction);
                                f9wVar.debug(new u920(max, w920Var));
                                bVar = new ipz.a(wj30Var2, Source.NETWORK, max);
                            } else {
                                bVar = new ipz.b("loadNext: canLoadNextHistory = false");
                            }
                        }
                        readLock.unlock();
                        return bVar;
                    }
                    bVar = new ipz.b("loadNext: skipped with history isFull = " + w920Var.c().o() + " and isEmpty = " + w920Var.c().isEmpty());
                    readLock.unlock();
                    return bVar;
                } catch (Throwable th) {
                    readLock.unlock();
                    throw th;
                }
            case 18:
                izs izsVar = (izs) obj2;
                ImageView imageView = (ImageView) obj;
                if (izsVar != null) {
                    izsVar.invoke(imageView);
                }
                return s3q0.a;
            case 19:
                ((izs) obj2).invoke(new gs40(((MusicPickerListItem.MusicTrackItem) ((MusicPickerListItem) obj)).b, true));
                return s3q0.a;
            case 20:
                oz60 oz60Var = (oz60) obj2;
                return new Result(oz60Var.g.f(new czi0((SituationalSuggest) obj, oz60Var.h)));
            case 21:
                ad80 ad80Var = (ad80) obj2;
                kd80 kd80Var = (kd80) obj;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(new dcg0(((ad80.a) ad80Var).c));
                kd80Var.g.b(ee80.a.a);
                return s3q0.a;
            case 22:
                ((ya) obj2).invoke((krd0) obj);
                return s3q0.a;
            case 23:
                final ProfileMainPhotosFragment profileMainPhotosFragment = (ProfileMainPhotosFragment) obj2;
                final kyd0 kyd0Var = (kyd0) obj;
                return new io.reactivex.rxjava3.functions.f() { // from class: xsna.jyd0
                    @Override // io.reactivex.rxjava3.functions.f
                    public final void accept(Object obj3) {
                        Throwable th2 = (Throwable) obj3;
                        L.i(th2);
                        ProfileMainPhotosFragment profileMainPhotosFragment2 = ProfileMainPhotosFragment.this;
                        profileMainPhotosFragment2.jo();
                        if (kyd0Var.n) {
                            cvk.u(R.string.default_network_error, false);
                        } else {
                            profileMainPhotosFragment2.so(th2);
                        }
                    }
                };
            case 24:
                okhttp3.l lVar = (okhttp3.l) obj;
                StringBuilder sb = new StringBuilder("proxy: ");
                sb.append(((okhttp3.l) obj2).d);
                sb.append(" -> ");
                sb.append(lVar.j());
                sb.append(" (");
                return ho8.a(sb, lVar.d, ')');
            case 25:
                Activity activity = (Activity) obj2;
                a.C1752a c1752a = (a.C1752a) obj;
                Intent intent2 = new Intent("android.intent.action.INSERT");
                intent2.setData(CalendarContract.Events.CONTENT_URI);
                intent2.putExtra("title", c1752a.a);
                intent2.putExtra("eventLocation", c1752a.d);
                intent2.putExtra("beginTime", c1752a.b.getTime());
                intent2.putExtra("endTime", c1752a.c.getTime());
                if (intent2.resolveActivity(activity.getPackageManager()) != null) {
                    activity.startActivity(intent2);
                }
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.ADD_TO_CALENDAR);
                return s3q0.a;
            case 26:
                ((xaf0) obj2).g.a.l.N((StickerStockItem) obj, AuthorSubscriptionRef.PACK_RECOMMENDATIONS_ALL_AUTHOR_PACKS);
                return s3q0.a;
            case 27:
                Context context6 = (Context) obj;
                xbg0 xbg0Var = (xbg0) obj2;
                int i8 = PushOpenActivity.f;
                String str = xbg0Var.l;
                xbg0.a aVar3 = xbg0Var.x;
                Intent a = PushOpenActivity.a.a(str, context6, "validate_login", aVar3.a("type"), aVar3.a(AndroidDynamicDeviceInfoDataSource.KEY_STAT_CONTENT), aVar3.a("need_track_interaction"));
                i35 i35Var = i35.c;
                a.setAction(String.valueOf(i35Var.e()));
                a.putExtra("code", aVar3.m);
                a.putExtra("target_user_id", aVar3.k);
                return t2i0.a(context6, i35Var.e(), a, 167772160);
            case 28:
                ((wh50) obj2).setValue(Boolean.FALSE);
                ((izs) obj).invoke(hjl0.a.i.b);
                return s3q0.a;
            default:
                ((izs) obj2).invoke(((hze) obj).a);
                return s3q0.a;
        }
    }

    public /* synthetic */ cy0(Context context, xbg0 xbg0Var) {
        this.b = 27;
        this.d = context;
        this.c = xbg0Var;
    }
}
