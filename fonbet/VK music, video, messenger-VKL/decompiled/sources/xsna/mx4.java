package xsna;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.l;
import com.vk.api.generated.audio.dto.AudioGetAudioPreviewUrlResponseDto;
import com.vk.api.generated.shortVideo.dto.ShortVideoPlaylistFullDto;
import com.vk.clips.viewer.impl.grid.ClipsGridFragment;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboarding;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingBlock;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingModal;
import com.vk.dto.group.creation_onboarding.GroupCreationOnboardingTooltip;
import com.vk.ecomm.cart.impl.search_address.model.SearchAddressResult;
import com.vk.ecomm.cart.impl.search_address.ui.fragment.SearchAddressFragment;
import com.vk.ecomm.market.api.bus.MarketEventGoodCreated;
import com.vk.log.L;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.profile.community.impl.ui.profile.actions.d;
import com.vk.profile.community.impl.ui.profile.state.CommunityProfileState;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vkontakte.android.api.ExtendedCommunityProfile;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.bi10;
import xsna.vvk0;
import xsna.wih0;
import xsna.xxd0;

/* compiled from: AudioSnippetInteractorImpl.kt */
/* loaded from: classes3.dex */
public final /* synthetic */ class mx4 extends FunctionReferenceImpl implements izs {
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.b = i3;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        GroupCreationOnboarding groupCreationOnboarding;
        GroupCreationOnboardingModal groupCreationOnboardingModal;
        boolean z;
        switch (this.b) {
            case 0:
                AudioGetAudioPreviewUrlResponseDto audioGetAudioPreviewUrlResponseDto = (AudioGetAudioPreviewUrlResponseDto) obj;
                ((bq4) this.receiver).getClass();
                return new i600(audioGetAudioPreviewUrlResponseDto.d() != null ? r2.intValue() : 0L, audioGetAudioPreviewUrlResponseDto.e() != null ? r2.intValue() : 0L, audioGetAudioPreviewUrlResponseDto.getUrl(), false);
            case 1:
                ((io.reactivex.rxjava3.subjects.d) ((fl6) this.receiver).s.getValue()).onNext(new xxd0.a((Throwable) obj));
                return s3q0.a;
            case 2:
                ((c4e) this.receiver).getClass();
                return c4e.a((ShortVideoPlaylistFullDto) obj);
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                ClipsGridFragment clipsGridFragment = (ClipsGridFragment) this.receiver;
                if (booleanValue != clipsGridFragment.y0) {
                    clipsGridFragment.y0 = booleanValue;
                    Intent intent = new Intent("request_update_bottom_theme_event");
                    Context context = e43.a;
                    cuz.a(context != null ? context : null).c(intent);
                    clipsGridFragment.mo().s2();
                    FragmentManager parentFragmentManager = clipsGridFragment.getParentFragmentManager();
                    parentFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                    aVar.n(clipsGridFragment);
                    aVar.l();
                    FragmentManager parentFragmentManager2 = clipsGridFragment.getParentFragmentManager();
                    parentFragmentManager2.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(parentFragmentManager2);
                    aVar2.b(new l.a(clipsGridFragment, 7));
                    aVar2.l();
                    clipsGridFragment.mo().G0();
                }
                return s3q0.a;
            case 4:
                MarketEventGoodCreated marketEventGoodCreated = (MarketEventGoodCreated) obj;
                com.vk.profile.community.impl.ui.profile.a aVar3 = (com.vk.profile.community.impl.ui.profile.a) this.receiver;
                aVar3.getClass();
                if (epx.f(marketEventGoodCreated.c, aVar3.i.a)) {
                    mmh mmhVar = aVar3.r;
                    ExtendedCommunityProfile extendedCommunityProfile = ((CommunityProfileState) aVar3.h.c).b;
                    Good good = marketEventGoodCreated.a;
                    MarketEventGoodCreated.Source source = marketEventGoodCreated.b;
                    mmhVar.getClass();
                    if (extendedCommunityProfile != null && (groupCreationOnboarding = extendedCommunityProfile.K2) != null) {
                        GroupCreationOnboardingBlock groupCreationOnboardingBlock = groupCreationOnboarding.e;
                        GroupCreationOnboardingBlock.Step step = groupCreationOnboardingBlock.b;
                        GroupCreationOnboardingBlock.Step step2 = GroupCreationOnboardingBlock.Step.MARKET;
                        if (step == step2 && (groupCreationOnboardingModal = groupCreationOnboardingBlock.j) != null) {
                            if (source == MarketEventGoodCreated.Source.CREATION_ONBOARDING_BLOCK && !good.V) {
                                kf8 kf8Var = mmhVar.d;
                                String str = groupCreationOnboardingModal.b;
                                String str2 = groupCreationOnboardingModal.c;
                                String str3 = groupCreationOnboardingModal.e;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                kf8Var.invoke(new d.j.q.c(str, str2, str3, mmhVar.c(extendedCommunityProfile.a.c, groupCreationOnboarding, GroupCreationOnboardingTooltip.Type.MARKET_ITEM, step2, false), good));
                            }
                            mmhVar.e.invoke(new CommunityProfileAction.o(true));
                        }
                    }
                }
                return s3q0.a;
            case 5:
                List list = (List) obj;
                ((sg10) this.receiver).getClass();
                Context context2 = e43.a;
                boolean b = i6m.b((SensorManager) (context2 != null ? context2 : null).getSystemService("sensor"));
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list) {
                    bi10 bi10Var = (bi10) obj2;
                    if ((bi10Var instanceof bi10.f) || (bi10Var instanceof bi10.a) || (bi10Var instanceof bi10.e)) {
                        z = true;
                    } else if (bi10Var instanceof bi10.d) {
                        z = sg10.d(((bi10.d) bi10Var).a, b);
                    } else {
                        if (!(bi10Var instanceof bi10.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        z = sg10.d(((bi10.b) bi10Var).a, b);
                    }
                    if (z) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList;
            case 6:
                SearchAddressFragment searchAddressFragment = (SearchAddressFragment) this.receiver;
                qcy<Object>[] qcyVarArr = SearchAddressFragment.S;
                searchAddressFragment.getClass();
                Intent intent2 = new Intent();
                Bundle bundle = new Bundle();
                bundle.putParcelable("search_found_custom_address_key", (SearchAddressResult) obj);
                s3q0 s3q0Var = s3q0.a;
                searchAddressFragment.Mf(-1, intent2.putExtra("search_found_address_extra", bundle));
                return s3q0.a;
            case 7:
                vvk0 vvk0Var = (vvk0) obj;
                wvk0 wvk0Var = (wvk0) this.receiver;
                a1r a1rVar = wvk0Var.c;
                View view = wvk0Var.a;
                if (vvk0Var instanceof vvk0.b) {
                    wvk0Var.b.a(view.getContext(), ((vvk0.b) vvk0Var).a);
                } else if (vvk0Var instanceof vvk0.e) {
                    wvk0Var.e.a(null);
                } else if (vvk0Var instanceof vvk0.c) {
                    String str4 = ((vvk0.c) vvk0Var).a;
                    Activity L = blk.L(view);
                    if (L != null) {
                        a1rVar.c(L, str4, com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.CLIPS));
                    }
                } else if (vvk0Var instanceof vvk0.a) {
                    Intent intent3 = ((vvk0.a) vvk0Var).a;
                    Activity L2 = blk.L(view);
                    if (L2 != null) {
                        L2.startActivity(intent3);
                    }
                } else if (vvk0Var instanceof vvk0.d) {
                    UserId userId = ((vvk0.d) vvk0Var).a.b;
                    if (userId != null) {
                        a1rVar.d(view.getContext(), userId, false);
                    }
                } else {
                    if (!(vvk0Var instanceof uvk0)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    uvk0 uvk0Var = (uvk0) vvk0Var;
                    wih0.d.a aVar4 = uvk0Var.b;
                    String str5 = uvk0Var.a;
                    String str6 = uvk0Var.c;
                    Activity L3 = blk.L(view);
                    if (L3 != null) {
                        l7s a = wvk0Var.d.a(L3);
                        gxk0 gxk0Var = wvk0Var.f;
                        if (gxk0Var != null) {
                            gxk0Var.a(a, str5, aVar4, str6);
                        }
                    }
                }
                return s3q0.a;
            default:
                L.i((Throwable) obj);
                return s3q0.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx4(ClipsGridFragment clipsGridFragment) {
        super(1, clipsGridFragment, ClipsGridFragment.class, "switchColorfulMode", "switchColorfulMode(Z)V", 0);
        this.b = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mx4(Object obj, int i) {
        super(1, obj, bq4.class, "map", "map(Lcom/vk/api/generated/audio/dto/AudioGetAudioPreviewUrlResponseDto;)Lcom/vk/music/snippet/api/domain/model/longtap/LongtapSnippetEntity;", 0);
        this.b = i;
        switch (i) {
            case 2:
                super(1, obj, c4e.class, "mapPlaylist", "mapPlaylist(Lcom/vk/api/generated/shortVideo/dto/ShortVideoPlaylistFullDto;)Lcom/vk/clips/favorites/api/model/ClipsFavoriteFolder;", 0);
                break;
            case 8:
                super(1, obj, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0);
                break;
            default:
                break;
        }
    }
}
