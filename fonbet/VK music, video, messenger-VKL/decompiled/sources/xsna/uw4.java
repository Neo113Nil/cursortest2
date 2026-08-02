package xsna;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import com.vk.api.generated.account.dto.AccountGetProfileNavigationInfoResponseDto;
import com.vk.api.generated.account.dto.AccountNavigationInfoDto;
import com.vk.api.generated.account.dto.AccountSecurityRecommendationIndicatorDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.combo.dto.ComboSubscriptionsNavigationInfoDto;
import com.vk.api.generated.vkpay.dto.VkpayPaymentsNavigationInfoDto;
import com.vk.dto.video.VideoAlbumExtendedInfo;
import com.vk.ecomm.cart.impl.courier_map.ui.fragment.CourierMapFragment;
import com.vk.im.engine.models.dialogs.DialogsFilter;
import com.vk.log.L;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.account.ProfileNavigationInfo;
import com.vk.voip.ui.members.VoipDataProvider;
import io.requery.android.database.sqlite.SQLiteStatement;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.va9;
import xsna.wih0;
import xsna.xn50;
import xsna.xp00;

/* compiled from: AudioRestrictionRepositoryImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw4 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uw4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        w5w0 w5w0Var;
        ProfileNavigationInfo.SecurityInfo securityInfo;
        ProfileNavigationInfo.SecurityRecommendationIndicator securityRecommendationIndicator;
        int i = 0;
        ProfileNavigationInfo.Type type = null;
        switch (this.b) {
            case 0:
                L.i((Throwable) obj);
                return s3q0.a;
            case 1:
                w5w0 w5w0Var2 = (w5w0) obj;
                va9 va9Var = (va9) this.receiver;
                va9.g P0 = va9Var.h.P0();
                va9.b bVar = va9.r;
                if (P0 == null || (w5w0Var = P0.a) == null) {
                    w5w0Var = bVar;
                }
                if (!w5w0Var.equals(bVar) && !epx.f(w5w0Var.b(), w5w0Var2.b())) {
                    va9Var.n = w5w0Var2.b();
                    va9Var.a(w5w0Var2, false);
                }
                return s3q0.a;
            case 2:
                return (VideoAlbumExtendedInfo) ((Map) this.receiver).get((String) obj);
            case 3:
                L.i((Throwable) obj);
                return s3q0.a;
            case 4:
                ((jsh0) this.receiver).a((l3a) obj);
                return s3q0.a;
            case 5:
                ((com.vk.metrics.eventtracking.b) this.receiver).a((Throwable) obj);
                return s3q0.a;
            case 6:
                ((com.vk.profile.community.impl.ui.profile.a) this.receiver).T((com.vk.profile.community.impl.ui.profile.d) obj);
                return s3q0.a;
            case 7:
                CourierMapFragment courierMapFragment = (CourierMapFragment) this.receiver;
                courierMapFragment.getClass();
                xn50.a.c(courierMapFragment, (xyj) obj);
                return s3q0.a;
            case 8:
                Collection<nrm> collection = (Collection) obj;
                com.vk.im.engine.internal.storage.delegates.dialogs.b bVar2 = (com.vk.im.engine.internal.storage.delegates.dialogs.b) this.receiver;
                bVar2.getClass();
                if (!collection.isEmpty()) {
                    SQLiteStatement g = bVar2.b.b().g("\n            REPLACE INTO dialogs_history_meta(folder_id,filter_id,oldest_sort_id,fully_fetched,phase_id)\n            VALUES(?,?,?,?,?)\n            ");
                    try {
                        for (nrm nrmVar : collection) {
                            Pair e = com.vk.im.engine.internal.storage.delegates.dialogs.b.e(nrmVar.a);
                            int intValue = ((Number) e.d()).intValue();
                            DialogsFilter dialogsFilter = (DialogsFilter) e.g();
                            g.bindLong(1, intValue);
                            g.bindLong(2, dialogsFilter.i());
                            g.bindLong(3, nrmVar.b.a());
                            rdi.i(g, 4, nrmVar.c);
                            g.bindLong(5, nrmVar.d);
                            g.executeInsert();
                        }
                        s3q0 s3q0Var = s3q0.a;
                        g.close();
                    } finally {
                    }
                }
                return s3q0.a;
            case 9:
                AccountGetProfileNavigationInfoResponseDto accountGetProfileNavigationInfoResponseDto = (AccountGetProfileNavigationInfoResponseDto) obj;
                ((qp) this.receiver).getClass();
                ProfileNavigationInfo.SecurityInfo.a aVar = ProfileNavigationInfo.SecurityInfo.Companion;
                int i2 = accountGetProfileNavigationInfoResponseDto.f().d().i();
                aVar.getClass();
                ProfileNavigationInfo.SecurityInfo[] values = ProfileNavigationInfo.SecurityInfo.values();
                int length = values.length;
                int i3 = 0;
                while (true) {
                    if (i3 < length) {
                        securityInfo = values[i3];
                        if (securityInfo.h() != i2) {
                            i3++;
                        }
                    } else {
                        securityInfo = null;
                    }
                }
                if (securityInfo == null) {
                    securityInfo = ProfileNavigationInfo.SecurityInfo.NO_STATUS;
                }
                ProfileNavigationInfo.SecurityInfo securityInfo2 = securityInfo;
                ProfileNavigationInfo.SecurityRecommendationIndicator.a aVar2 = ProfileNavigationInfo.SecurityRecommendationIndicator.Companion;
                AccountSecurityRecommendationIndicatorDto e2 = accountGetProfileNavigationInfoResponseDto.f().e();
                Integer valueOf = e2 != null ? Integer.valueOf(e2.i()) : null;
                aVar2.getClass();
                if (valueOf != null) {
                    ProfileNavigationInfo.SecurityRecommendationIndicator[] values2 = ProfileNavigationInfo.SecurityRecommendationIndicator.values();
                    int length2 = values2.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 < length2) {
                            securityRecommendationIndicator = values2[i4];
                            if (securityRecommendationIndicator.h() != valueOf.intValue()) {
                                i4++;
                            }
                        } else {
                            securityRecommendationIndicator = null;
                        }
                    }
                    if (securityRecommendationIndicator == null) {
                        securityRecommendationIndicator = ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING;
                    }
                } else {
                    securityRecommendationIndicator = ProfileNavigationInfo.SecurityRecommendationIndicator.NO_WARNING;
                }
                ProfileNavigationInfo.SecurityRecommendationIndicator securityRecommendationIndicator2 = securityRecommendationIndicator;
                AccountNavigationInfoDto d = accountGetProfileNavigationInfoResponseDto.d();
                pzd0 pzd0Var = new pzd0(d.d(), d.e(), d.f(), d.g(), null, d.getUserId().b);
                VkpayPaymentsNavigationInfoDto g2 = accountGetProfileNavigationInfoResponseDto.g();
                String d2 = g2.d();
                if (d2 == null) {
                    d2 = "";
                }
                ProfileNavigationInfo.Type.a aVar3 = ProfileNavigationInfo.Type.Companion;
                String type2 = g2.getType();
                aVar3.getClass();
                ProfileNavigationInfo.Type[] values3 = ProfileNavigationInfo.Type.values();
                int length3 = values3.length;
                while (true) {
                    if (i < length3) {
                        ProfileNavigationInfo.Type type3 = values3[i];
                        if (epx.f(type3.h(), type2)) {
                            type = type3;
                        } else {
                            i++;
                        }
                    }
                }
                if (type == null) {
                    type = ProfileNavigationInfo.Type.OPEN;
                }
                ProfileNavigationInfo.b bVar3 = new ProfileNavigationInfo.b(g2.e(), d2, type);
                ComboSubscriptionsNavigationInfoDto e3 = accountGetProfileNavigationInfoResponseDto.e();
                return new ProfileNavigationInfo(pzd0Var, bVar3, new ProfileNavigationInfo.a(e3.d(), e3.e()), securityInfo2, securityRecommendationIndicator2);
            case 10:
                xp00 xp00Var = (xp00) obj;
                yp00 yp00Var = (yp00) this.receiver;
                a1r a1rVar = yp00Var.c;
                View view = yp00Var.a;
                if (xp00Var instanceof xp00.b) {
                    yp00Var.b.a(view.getContext(), ((xp00.b) xp00Var).a);
                } else if (xp00Var instanceof xp00.c) {
                    Activity L = blk.L(view);
                    if (L != null) {
                        a1rVar.c(L, null, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS));
                    }
                } else if (xp00Var instanceof xp00.d) {
                    xp00.d dVar = (xp00.d) xp00Var;
                    String str = dVar.a;
                    int i5 = dVar.b;
                    Activity L2 = blk.L(view);
                    if (L2 != null) {
                        a1rVar.b(L2, i5, str);
                    }
                } else if (xp00Var instanceof xp00.a) {
                    Intent intent = ((xp00.a) xp00Var).a;
                    Activity L3 = blk.L(view);
                    if (L3 != null) {
                        L3.startActivity(intent);
                    }
                } else {
                    if (!(xp00Var instanceof wp00)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wp00 wp00Var = (wp00) xp00Var;
                    wih0.b.a aVar4 = wp00Var.b;
                    String str2 = wp00Var.a;
                    String str3 = wp00Var.c;
                    Activity L4 = blk.L(view);
                    if (L4 != null) {
                        l7s a = yp00Var.d.a(L4);
                        er00 er00Var = yp00Var.e;
                        if (er00Var != null) {
                            er00Var.a(a, str2, aVar4, str3);
                        }
                    }
                }
                return s3q0.a;
            case 11:
                jzp0 jzp0Var = (jzp0) obj;
                izs<? super jzp0, s3q0> izsVar = ((jf10) this.receiver).c;
                if (izsVar != null) {
                    izsVar.invoke(jzp0Var);
                }
                return s3q0.a;
            case 12:
                ((jt4) this.receiver).getClass();
                return jt4.a((AudioPlaylistDto) obj);
            case 13:
                ((wn50) this.receiver).l((ao50) obj);
                return s3q0.a;
            case 14:
                ((f1o0) this.receiver).T((h1o0) obj);
                return s3q0.a;
            case 15:
                return ((ConcurrentHashMap) this.receiver).get((Integer) obj);
            default:
                return ((VoipDataProvider) this.receiver).h((Collection) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw4(Object obj, int i) {
        super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
        this.b = i;
        switch (i) {
            case 1:
                super(1, obj, va9.class, "handleCurrentUserSetAvatar", "handleCurrentUserSetAvatar(Lcom/vk/vmoji/storage/api/VmojiAvatar;)V", 0);
                break;
            case 3:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            case 5:
                super(1, obj, com.vk.metrics.eventtracking.b.class, "logException", "logException(Ljava/lang/Throwable;)V", 0);
                break;
            case 12:
                super(1, obj, jt4.class, "map", "map(Lcom/vk/api/generated/audio/dto/AudioPlaylistDto;)Lcom/vk/dto/music/Playlist;", 0);
                break;
            case 13:
                super(1, obj, wn50.class, "render", "render(Lcom/vk/mvi/core/data/MviViewState;)V", 0);
                break;
            default:
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw4(qp qpVar) {
        super(1, qpVar, qp.class, "mapToProfileNavigationInfo", "mapToProfileNavigationInfo(Lcom/vk/api/generated/account/dto/AccountGetProfileNavigationInfoResponseDto;)Lcom/vk/superapp/api/dto/account/ProfileNavigationInfo;", 0);
        this.b = 9;
    }
}
