package xsna;

import com.vk.api.generated.market.dto.MarketGetCommunityReviewFriendsResponseDto;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenEnvDto;
import com.vk.api.generated.messages.dto.MessagesGetCallTokenResponseDto;
import com.vk.core.view.AdsButton;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.photo.Photo;
import com.vk.dto.stickers.StickersDictionaryItem;
import com.vk.translate.impl.views.c;
import com.vk.voip.ui.calls.presentation.base.fragment.VoipCallServiceFragment;
import java.io.IOException;
import java.util.List;
import kotlin.Pair;
import ru.ok.android.sdk.api.token.ApiTokenInfoProvider;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class xb20 implements c.a, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.c, AdsButton.b, ApiTokenInfoProvider {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xb20(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // com.vk.core.view.AdsButton.b
    public void O2(int i) {
        ((dej0) this.c).O2(i);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 8:
                return (lu60) ((vx7) this.c).invoke(obj, obj2);
            default:
                return (MarketGetCommunityReviewFriendsResponseDto) ((vx7) this.c).invoke(obj, obj2);
        }
    }

    @Override // ru.ok.android.sdk.api.token.ApiTokenInfoProvider
    public ApiTokenInfoProvider.Info getTokenInfo() {
        String s;
        c2p0 c2p0Var = (c2p0) this.c;
        c2p0Var.c.a.invoke();
        MessagesGetCallTokenResponseDto messagesGetCallTokenResponseDto = null;
        if (bnw0.a().a()) {
            dz2 x = yfb.x(c2p0Var.a.m(MessagesGetCallTokenEnvDto.PRODUCTION));
            x.n = true;
            UserId f = bnw0.a().f();
            if (fkq0.c(f) && !o25.a().a(f) && (s = o25.a().s(f)) != null) {
                x.l = s;
                x.m = null;
            }
            messagesGetCallTokenResponseDto = (MessagesGetCallTokenResponseDto) x.u(0L);
        }
        if (messagesGetCallTokenResponseDto == null) {
            throw new IOException("Can't get token result for current user");
        }
        String e = messagesGetCallTokenResponseDto.e();
        String d = messagesGetCallTokenResponseDto.d();
        if (d == null) {
            d = (String) c2p0Var.d.invoke();
        }
        return new ApiTokenInfoProvider.Info(e, d);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 5:
                return ((Boolean) ((es00) this.c).invoke(obj)).booleanValue();
            case 6:
                return ((Boolean) ((jr3) this.c).invoke(obj)).booleanValue();
            case 15:
                return ((Boolean) ((nc90) this.c).invoke(obj)).booleanValue();
            case 26:
                return ((Boolean) ((g1s0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((u5u0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (Boolean) ((ogd) obj2).invoke(obj);
            case 2:
                return (io.reactivex.rxjava3.core.t) ((jr3) obj2).invoke(obj);
            case 3:
                return (Photo) ((es00) obj2).invoke(obj);
            case 4:
                return (jqz) ((es00) obj2).invoke(obj);
            case 5:
            case 6:
            case 8:
            case 12:
            case 14:
            case 15:
            case 19:
            case 26:
            default:
                return (Post) ((anw0) obj2).invoke(obj);
            case 7:
                return (io.reactivex.rxjava3.core.t) ((es00) obj2).invoke(obj);
            case 9:
                return (ybx0) ((nc90) obj2).invoke(obj);
            case 10:
                return (StickersDictionaryItem) ((ogd) obj2).invoke(obj);
            case 11:
                return (s3q0) ((waf0) obj2).invoke(obj);
            case 13:
                return (String) ((waf0) obj2).invoke(obj);
            case 16:
                return (Pair) ((bul0) obj2).invoke(obj);
            case 17:
                return (io.reactivex.rxjava3.core.t) ((waf0) obj2).invoke(obj);
            case 18:
                return (List) ((nc90) obj2).invoke(obj);
            case 20:
                return (zcq0) ((nc90) obj2).invoke(obj);
            case 21:
                return (Long) ((waf0) obj2).c;
            case 22:
                return (sfs0) ((nc90) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((whg0) obj2).invoke(obj);
            case 24:
                return (List) ((vat0) obj2).invoke(obj);
            case 25:
                return (io.reactivex.rxjava3.core.t) ((nc90) obj2).invoke(obj);
            case 27:
                int i2 = VoipCallServiceFragment.Y;
                return (String) ((d7l0) obj2).invoke(obj);
        }
    }
}
