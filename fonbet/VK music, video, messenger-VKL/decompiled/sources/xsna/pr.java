package xsna;

import com.vk.api.generated.account.dto.AccountGetEmailResponseDto;
import com.vk.api.generated.apps.dto.AppsAdsSlotsDto;
import com.vk.api.generated.auth.dto.AuthTerminateAuthCodeResponseDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.calls.dto.CallsGetAsrTranscriptionsResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsResumeResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.donut.dto.DonutGetSubscriptionsResponseDto;
import com.vk.api.generated.friends.dto.FriendsSearchResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetAddressesResponseDto;
import com.vk.api.generated.groups.dto.GroupsGetNameHistoryResponseDto;
import com.vk.api.generated.market.dto.MarketReferenceDto;
import com.vk.api.generated.market.dto.MarketSettingsDto;
import com.vk.api.generated.messages.dto.MessagesGetReactionsAssetsResponseDto;
import com.vk.libvideo.live.impl.activity.LivePlayerActivity;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import com.yandex.div.internal.parser.JsonTopologicalSorting;
import com.yandex.div.internal.parser.ValueValidator;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.by1;
import xsna.ihz;
import xsna.tlo0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class pr implements f03, b03, io.reactivex.rxjava3.functions.l, ihz.a, ValueValidator, whp, io.reactivex.rxjava3.functions.m, plp0, xos {
    public final /* synthetic */ int b;

    public /* synthetic */ pr(int i) {
        this.b = i;
    }

    public static String b(StringBuilder sb, tlo0.f fVar, char c) {
        sb.append(fVar);
        sb.append(c);
        return sb.toString();
    }

    @Override // xsna.whp
    public String a() {
        return "";
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 9:
                return EmptyList.b;
            case 10:
                return ((GroupsGetAddressesResponseDto) obj).d();
            case 25:
                dh20 dh20Var = (dh20) obj;
                dh20Var.getClass();
                y8e0 y8e0Var = n8e0.a;
                y8e0Var.getClass();
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    y8e0Var.a(dh20Var, byteArrayOutputStream);
                } catch (IOException unused) {
                }
                return byteArrayOutputStream.toByteArray();
            case 26:
                return (List) obj;
            default:
                return t850.a((u850) obj);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 2:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 4:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 5:
                return (AuthTerminateAuthCodeResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, AuthTerminateAuthCodeResponseDto.class).getType())).a();
            case 18:
                return (GroupsGetNameHistoryResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, GroupsGetNameHistoryResponseDto.class).getType())).a();
            case 21:
                return (MarketReferenceDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, MarketReferenceDto.class).getType())).a();
            case 24:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 0:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AccountGetEmailResponseDto.class).getType());
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, AppsAdsSlotsDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 6:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CallsGetAsrTranscriptionsResponseDto.class).getType());
            case 8:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 11:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, CommunitySubscriptionsResumeResponseDto.class).getType());
            case 15:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, DonutGetSubscriptionsResponseDto.class).getType());
            case 16:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, FriendsSearchResponseDto.class).getType());
            case 22:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MarketSettingsDto.class).getType());
            default:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, MessagesGetReactionsAssetsResponseDto.class).getType());
        }
    }

    @Override // xsna.ihz.a
    public void invoke(Object obj) {
        ((by1) obj).getClass();
    }

    @Override // com.yandex.div.internal.parser.ValueValidator
    public boolean isValid(Object obj) {
        boolean TYPE_VALIDATOR$lambda$0;
        switch (this.b) {
            case 13:
                return ((Long) obj).longValue() >= 0;
            case 14:
                return ((Long) obj).longValue() >= 0;
            default:
                TYPE_VALIDATOR$lambda$0 = JsonTopologicalSorting.TYPE_VALIDATOR$lambda$0((String) obj);
                return TYPE_VALIDATOR$lambda$0;
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = LivePlayerActivity.M;
        return false;
    }

    public /* synthetic */ pr(by1.a aVar, int i) {
        this.b = 12;
    }

    public /* synthetic */ pr(izs izsVar, int i) {
        this.b = i;
    }

    @Override // xsna.xos
    public String c(String str) {
        return str;
    }
}
