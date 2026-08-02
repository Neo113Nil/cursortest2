package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.communitySubscriptions.dto.CommunitySubscriptionsChangePaymentMethodResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.photos.dto.PhotosGetAlbumsResponseDto;
import com.vk.api.generated.statEvents.dto.StatEventsBaseResponseDto;
import com.vk.api.generated.store.dto.StoreGetStickersBonusHistoryRecordsResponseDto;
import com.vk.api.generated.video.dto.VideoViewSegmentsResponseDto;
import com.vk.api.generated.wall.dto.WallEditResponseDto;
import com.vk.superapp.api.generated.GsonHolder;
import com.vk.superapp.api.generated.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;
import xsna.t4a;
import xsna.vlp0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class ky80 implements b03, f03, io.reactivex.rxjava3.functions.l, f0t, vlp0.j {
    public final /* synthetic */ int b;

    public /* synthetic */ ky80(int i) {
        this.b = i;
    }

    public static void b(int i, String str, StringBuilder sb) {
        sb.append(Integer.toHexString(i));
        sb.append(str);
    }

    public static boolean c(Class cls, String str) {
        return epx.f(str, t4a.a.b(fpf0.a(cls)));
    }

    public static /* synthetic */ boolean d(AtomicReference atomicReference, gag0 gag0Var) {
        while (!atomicReference.compareAndSet(null, gag0Var)) {
            if (atomicReference.get() != null) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.vlp0.j
    public void a(vlp0.i iVar, vlp0 vlp0Var, boolean z) {
        iVar.g(vlp0Var);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 2:
                return ((CommunitySubscriptionsChangePaymentMethodResponseDto) obj).d();
            case 3:
                lgd0 lgd0Var = lgd0.c;
                lgd0Var.b = (vo9) obj;
                return lgd0Var;
            default:
                return ((fjw0) obj).a;
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 7:
                return (StoreGetStickersBonusHistoryRecordsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, StoreGetStickersBonusHistoryRecordsResponseDto.class).getType())).a();
            case 8:
                return (BaseOkResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 11:
                return (VideoViewSegmentsResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, VideoViewSegmentsResponseDto.class).getType())).a();
            default:
                return (WallEditResponseDto) ((com.vk.internal.api.SingleRootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.internal.api.SingleRootResponseDto.class, WallEditResponseDto.class).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, PhotosGetAlbumsResponseDto.class).getType());
            case 5:
                return (RootResponseDto) com.vk.internal.api.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StatEventsBaseResponseDto.class).getType());
        }
    }

    public /* synthetic */ ky80(izs izsVar, int i) {
        this.b = i;
    }
}
