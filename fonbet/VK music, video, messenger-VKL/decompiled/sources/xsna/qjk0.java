package xsna;

import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.specials.dto.SpecialsGetEasterEggsResponseDto;
import com.vk.api.generated.storiesProfileDiscover.dto.StoriesProfileDiscoverGetResponseDto;
import com.vk.api.generated.superAppShowcase.dto.SuperAppShowcaseMarkBadgeAsClickedDataDto;
import com.vk.api.generated.users.dto.UsersGetContentTabsResponseDto;
import com.vk.api.generated.video.dto.VideoVideoLiveStatusItemDto;
import com.vk.api.generated.vmoji.dto.VmojiGetAvatarResponseDto;
import com.vk.api.generated.wall.dto.WallPostResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class qjk0 implements b03, f03, io.reactivex.rxjava3.functions.m {
    public final /* synthetic */ int b;

    public /* synthetic */ qjk0(int i) {
        this.b = i;
    }

    public static void a(StringBuilder sb, String str, String str2) {
        sb.append(str);
        gu8.c(str2, sb.toString());
    }

    public static /* synthetic */ boolean b(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, b5o0 b5o0Var) {
        while (!atomicReferenceFieldUpdater.compareAndSet(obj, b5o0Var, null)) {
            if (atomicReferenceFieldUpdater.get(obj) != b5o0Var) {
                return false;
            }
        }
        return true;
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (SpecialsGetEasterEggsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, SpecialsGetEasterEggsResponseDto.class).getType())).a();
            case 1:
            case 3:
            case 5:
            default:
                return (WallPostResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, WallPostResponseDto.class).getType())).a();
            case 2:
                return (BaseOkResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, BaseOkResponseDto.class).getType())).a();
            case 4:
                return (SuperAppShowcaseMarkBadgeAsClickedDataDto) ((com.vk.superapp.api.generated.SingleRootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(com.vk.superapp.api.generated.SingleRootResponseDto.class, SuperAppShowcaseMarkBadgeAsClickedDataDto.class).getType())).a();
            case 6:
                return (UsersGetContentTabsResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, UsersGetContentTabsResponseDto.class).getType())).a();
            case 7:
                return (List) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, xtp0.getParameterized(List.class, VideoVideoLiveStatusItemDto.class).getType()).getType())).a();
        }
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 1:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, StoriesProfileDiscoverGetResponseDto.class).getType());
            case 5:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseBoolIntDto.class).getType());
            case 8:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, BaseOkResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VmojiGetAvatarResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        return obj instanceof swz;
    }
}
