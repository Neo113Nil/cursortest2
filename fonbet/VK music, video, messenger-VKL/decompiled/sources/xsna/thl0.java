package xsna;

import android.os.Bundle;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.storiesProfileDiscover.dto.StoriesProfileDiscoverGetResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppGetSingleQueueResponseDto;
import com.vk.api.generated.users.dto.UsersUserFullProfileDto;
import com.vk.api.generated.video.dto.VideoGetAdsDataResponseDto;
import com.vk.api.generated.vmoji.dto.VmojiGetAvatarResponseDto;
import com.vk.api.generated.wall.dto.WallLastPostingInfoExtendedResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import xsna.j1v0;
import xsna.k6o0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class thl0 implements k6o0.a, b03, f03, yads.wq {
    public final /* synthetic */ int b;

    public /* synthetic */ thl0(int i) {
        this.b = i;
    }

    public static String a(StringBuilder sb, CharSequence charSequence, char c) {
        sb.append((Object) charSequence);
        sb.append(c);
        return sb.toString();
    }

    public static /* synthetic */ void c(AtomicReference atomicReference) {
        j1v0.a.C3091a c3091a;
        do {
            c3091a = j1v0.a.C3091a.a;
            if (atomicReference.compareAndSet(c3091a, j1v0.a.c.a)) {
                return;
            }
        } while (atomicReference.get() == c3091a);
    }

    public static /* synthetic */ boolean d(AtomicReferenceArray atomicReferenceArray, int i, b5o0 b5o0Var) {
        while (!atomicReferenceArray.compareAndSet(i, b5o0Var, null)) {
            if (atomicReferenceArray.get(i) != b5o0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.k6o0.a
    public void b(Object obj, Object obj2) {
        ((y980) obj).a();
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 1:
                return (StoriesProfileDiscoverGetResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesProfileDiscoverGetResponseDto.class).getType())).a();
            case 4:
                return (BaseBoolIntDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseBoolIntDto.class).getType())).a();
            case 8:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            default:
                return (VmojiGetAvatarResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VmojiGetAvatarResponseDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.kn1.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            case 3:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SuperAppGetSingleQueueResponseDto.class).getType());
            case 4:
            case 6:
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, WallLastPostingInfoExtendedResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, UsersUserFullProfileDto.class).getType());
            case 7:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetAdsDataResponseDto.class).getType());
        }
    }
}
