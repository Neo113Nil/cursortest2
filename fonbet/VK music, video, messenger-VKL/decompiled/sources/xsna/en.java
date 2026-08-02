package xsna;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.exoplayer.audio.AudioOutput;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.vk.api.generated.account.dto.AccountGetHelpHintsResponseDto;
import com.vk.api.generated.apps.dto.AppsGetSecretHashResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsStartResponseDto;
import com.vk.api.generated.catalog.dto.CatalogCatalogResponseObjectDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsGetDetailsResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.database.dto.DatabaseGetUniversitiesResponseDto;
import com.vk.api.generated.fave.dto.FaveGetExtendedResponseDto;
import com.vk.api.generated.market.dto.MarketRestoreCommunityReviewCommentResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetConversationMembersDto;
import com.vk.api.generated.narratives.dto.NarrativesSaveCustomCoverResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.ListValidator;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import xsna.by1;
import xsna.ihz;
import xsna.l8x;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes14.dex */
public final /* synthetic */ class en implements f03, b03, ihz.a, io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.m, m6o, ListValidator, ValueValidator, l8x.a, Continuation {
    public final /* synthetic */ int b;

    public /* synthetic */ en(int i) {
        this.b = i;
    }

    public static int a(Parcelable.Creator creator, Parcel parcel, ArrayList arrayList, int i, int i2) {
        arrayList.add(creator.createFromParcel(parcel));
        return i + i2;
    }

    public static String d(StringBuilder sb, oh30 oh30Var, char c) {
        sb.append(oh30Var);
        sb.append(c);
        return sb.toString();
    }

    public static void f(Integer num, slv0 slv0Var, String str) {
        slv0Var.a(Integer.valueOf(num.intValue()), str);
    }

    public static /* synthetic */ boolean h(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, lq9 lq9Var, z670 z670Var, wq9 wq9Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(lq9Var, z670Var, wq9Var)) {
            if (atomicReferenceFieldUpdater.get(lq9Var) != z670Var) {
                return false;
            }
        }
        return true;
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        return (fjw0) obj;
    }

    @Override // xsna.m6o
    public double b(double d) {
        float[] fArr = h8g.a;
        return h8g.d(h8g.d, d);
    }

    @Override // xsna.l8x.a
    public te c(ym5 ym5Var, dkh0 dkh0Var, n3y0 n3y0Var) {
        return new hcq(ym5Var, n3y0Var);
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 3:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (AppsGetSecretHashResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AppsGetSecretHashResponseDto.class).getType())).a();
            case 5:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 8:
                return (CallsStartResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CallsStartResponseDto.class).getType())).a();
            case 10:
                return (CatalogCatalogResponseObjectDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CatalogCatalogResponseObjectDto.class).getType())).a();
            case 14:
                return (CommunitySubscriptionsGetDetailsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, CommunitySubscriptionsGetDetailsResponseDto.class).getType())).a();
            case 22:
                return (BaseBoolIntDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 23:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (NarrativesSaveCustomCoverResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, NarrativesSaveCustomCoverResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetHelpHintsResponseDto.class).getType());
            case 12:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DatabaseGetUniversitiesResponseDto.class).getType());
            case 20:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FaveGetExtendedResponseDto.class).getType());
            case 25:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketRestoreCommunityReviewCommentResponseDto.class).getType());
            case 26:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetConversationMembersDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        switch (this.b) {
            case 6:
                ((AudioOutput.a) obj).c();
                break;
            default:
                ((by1) obj).getClass();
                break;
        }
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        return ((Long) obj).longValue() >= 0;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return bool.booleanValue();
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return 403;
    }

    public /* synthetic */ en(int i, xzs xzsVar) {
        this.b = i;
    }

    @Override // com.yandex.div.internal.parser.ListValidator
    public boolean isValid(List list) {
        return list.size() >= 1;
    }

    public /* synthetic */ en(by1.a aVar, int i) {
        this.b = 16;
    }
}
