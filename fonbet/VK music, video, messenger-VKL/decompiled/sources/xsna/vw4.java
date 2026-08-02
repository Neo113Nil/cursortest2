package xsna;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.util.Log;
import androidx.compose.ui.platform.ComposeView;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthErrorType;
import com.vk.auth.modal.qrwithcode.b;
import com.vk.auth.modal.qrwithcode.c;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.feature.music.holders.artist.MusicPageInfoBlockNewVh;
import com.vk.ecomm.reviews.impl.communities.reviews.presentation.CommunityReviewsFragment;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.log.L;
import com.vk.newsfeed.api.data.NewsComment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.api.methods.batch.execute.BatchApiRequest;
import ru.ok.android.utils.Logger;
import xsna.ilq0;
import xsna.iv20;
import xsna.lp00;
import xsna.xn50;

/* compiled from: AudioRestrictionRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class vw4 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vw4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v57, types: [xsna.s3q0] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00c5 -> B:36:0x00e9). Please report as a decompilation issue!!! */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z = true;
        boolean z2 = true;
        int i = 0;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                L.i((Throwable) obj);
                return s3q0.a;
            case 2:
                L.i((Throwable) obj);
                return s3q0.a;
            case 3:
                return Boolean.valueOf(((NewsComment) this.receiver).zb((NewsComment) obj));
            case 4:
                List list = (List) obj;
                uhe uheVar = (uhe) this.receiver;
                int i2 = 0;
                return new io.reactivex.rxjava3.internal.operators.single.s(uheVar.b.c(list).t(list).l(new e8(new qr0(1, uheVar.c, yhe.class, "mapToSavedInterests", "mapToSavedInterests(Ljava/util/List;)Lcom/vk/dto/shortvideo/ClipsSavedInterests;", i2, 3), 13)), new nu0(new n99(1, uheVar.a, fhe.class, "updateSavedInterestsCacheIfExists", "updateSavedInterestsCacheIfExists(Lcom/vk/dto/shortvideo/ClipsSavedInterests;)Lio/reactivex/rxjava3/core/Completable;", i2, 1), 12)).g(new rhe(i, uheVar, list)).g(new ntb(uheVar, z2 ? 1 : 0));
            case 5:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).Y((com.vk.profile.community.impl.ui.profile.actions.d) obj);
                return s3q0.a;
            case 6:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                CommunityReviewsFragment communityReviewsFragment = (CommunityReviewsFragment) this.receiver;
                if (booleanValue) {
                    xo2.f(communityReviewsFragment.h0, true, true, 300L);
                } else {
                    ComposeView composeView = communityReviewsFragment.h0;
                    if (composeView != null) {
                        composeView.postDelayed(communityReviewsFragment.k0, 400L);
                    }
                }
                return s3q0.a;
            case 7:
                lp00 lp00Var = (lp00) obj;
                po00 po00Var = (po00) this.receiver;
                if (lp00Var instanceof lp00.a) {
                    po00Var.a.f(false);
                } else {
                    po00Var.getClass();
                    if (!(lp00Var instanceof lp00.b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    lp00.b bVar = (lp00.b) lp00Var;
                    po00Var.b.c().a(new jr00(bVar.a, bVar.b, bVar.c));
                }
                return s3q0.a;
            case 8:
                kzp0 kzp0Var = (kzp0) obj;
                qzl0 qzl0Var = ((kf10) this.receiver).c;
                if (qzl0Var != null) {
                    qzl0Var.invoke(kzp0Var);
                }
                return s3q0.a;
            case 9:
                String str = (String) obj;
                ((MusicPageInfoBlockNewVh) this.receiver).getClass();
                if (str == null) {
                    return null;
                }
                switch (str.hashCode()) {
                    case -1427272607:
                        if (str.equals("shuffle_outline_20")) {
                            return Integer.valueOf(R.drawable.vk_icon_shuffle_outline_20);
                        }
                        return null;
                    case -1229776965:
                        if (str.equals("share_outline_20")) {
                            return Integer.valueOf(R.drawable.vk_icon_share_outline_20);
                        }
                        return null;
                    case -520223515:
                        if (str.equals("story_outline_20")) {
                            return Integer.valueOf(R.drawable.vk_icon_story_outline_20);
                        }
                        return null;
                    case 937396206:
                        if (str.equals("music_note_wave_outline_20")) {
                            return Integer.valueOf(R.drawable.vk_icon_music_note_wave_outline_20);
                        }
                        return null;
                    case 1232246258:
                        if (str.equals("users_outline_20")) {
                            return Integer.valueOf(R.drawable.vk_icon_users_outline_20);
                        }
                        return null;
                    default:
                        return null;
                }
            case 10:
                yj50 yj50Var = (yj50) this.receiver;
                qcy<Object>[] qcyVarArr = yj50.m;
                Log.e(yj50Var.getClass().getCanonicalName(), "Error!", (Throwable) obj);
                return s3q0.a;
            case 11:
                ((dv60) this.receiver).c((xh60) obj);
                return s3q0.a;
            case 12:
                o3b0 o3b0Var = (o3b0) this.receiver;
                o3b0Var.getClass();
                xn50.a.c(o3b0Var, (h3b0) obj);
                return s3q0.a;
            case 13:
                com.vk.auth.modal.qrwithcode.c cVar = (com.vk.auth.modal.qrwithcode.c) obj;
                com.vk.auth.modal.qrwithcode.a aVar = (com.vk.auth.modal.qrwithcode.a) this.receiver;
                if (cVar instanceof c.a) {
                    aVar.h.e();
                } else {
                    aVar.getClass();
                    if (cVar instanceof c.b) {
                        QrWithCodeAuthErrorType qrWithCodeAuthErrorType = ((c.b) cVar).a;
                        if (qrWithCodeAuthErrorType == QrWithCodeAuthErrorType.CodeExpired) {
                            com.vk.registration.funnels.b bVar2 = com.vk.registration.funnels.b.a;
                            iv20.b bVar3 = aVar.d;
                            String str2 = (bVar3 != null ? bVar3 : null).f;
                            bVar2.getClass();
                            ArrayList arrayList = new ArrayList();
                            arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str2));
                            RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                            frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.ALERT_REFRESH_ERROR, arrayList, null, null, null, null, null, 252);
                        }
                        aVar.e(new b.c(qrWithCodeAuthErrorType), true);
                    } else if (!(cVar instanceof c.C0407c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                return s3q0.a;
            case 14:
                int intValue = ((Number) obj).intValue();
                ilq0.a aVar2 = ((ilq0) this.receiver).a;
                try {
                    Context context = e43.a;
                    if (context == null) {
                        context = null;
                    }
                    Cursor query = gr80.b(context).getReadableDatabase().query(aVar2.getTableName(), null, "id=" + intValue, null, null, null, null);
                    try {
                        try {
                            if (query.getCount() > 0) {
                                query.moveToFirst();
                                ContentValues contentValues = new ContentValues();
                                DatabaseUtils.cursorRowToContentValues(query, contentValues);
                                ?? d = aVar2.d(contentValues);
                                query.close();
                                r1 = d;
                                aVar2 = aVar2;
                                query = query;
                            } else {
                                s3q0 s3q0Var = s3q0.a;
                                query.close();
                                aVar2 = aVar2;
                                query = query;
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } catch (Throwable th2) {
                                ro.e(query, th);
                                throw th2;
                            }
                        }
                    } catch (Exception e) {
                        ?? r2 = "Error reading " + aVar2.getTableName() + " cache DB";
                        L.f("vk", r2, e);
                        aVar2 = r2;
                        query = s3q0.a;
                    }
                } catch (Exception e2) {
                    com.vk.metrics.eventtracking.b.a.a(e2);
                }
                return r1;
            case 15:
                com.vk.libvideo.autoplay.a aVar3 = (com.vk.libvideo.autoplay.a) obj;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.receiver;
                VideoAutoPlay.a aVar4 = VideoAutoPlay.q0;
                videoAutoPlay.getClass();
                if (videoAutoPlay.g1()) {
                    d3b0 d3b0Var = videoAutoPlay.p0;
                    if (d3b0Var != null) {
                        d3b0Var.a();
                    }
                    Objects.toString(aVar3);
                    new Exception();
                }
                return s3q0.a;
            default:
                ((j7t0) this.receiver).getClass();
                ArrayList<UIBlock> arrayList2 = ((UIBlockList) obj).y;
                if (arrayList2 == null || !arrayList2.isEmpty()) {
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        if (j7t0.b((UIBlock) it.next(), new h7t0(i))) {
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vw4(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 2:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 3:
                super(1, obj, NewsComment.class, "containsComment", "containsComment(Lcom/vk/newsfeed/api/data/NewsComment;)Z", 0);
                break;
            case 6:
                super(1, obj, CommunityReviewsFragment.class, "setScreenSpinnerVisibility", "setScreenSpinnerVisibility(Z)V", 0);
                break;
            case 10:
                super(1, obj, yj50.class, BatchApiRequest.FIELD_NAME_ON_ERROR, "onError(Ljava/lang/Throwable;)V", 0);
                break;
            case 11:
                super(1, obj, dv60.class, "sendEvent", "sendEvent(Lcom/vk/mvi/MviEvent;)V", 0);
                break;
            case 14:
                super(1, obj, ilq0.class, "getById", "getById(I)Ljava/lang/Object;", 0);
                break;
            default:
                break;
        }
    }
}
