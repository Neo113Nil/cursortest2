package xsna;

import android.os.Bundle;
import com.vk.api.generated.core.RootResponseDto;
import com.vk.api.generated.stickers.dto.StickersPackPreviewsChunkDto;
import com.vk.api.generated.stories.dto.StoriesGetByIdExtendedResponseDto;
import com.vk.api.generated.superApp.dto.SuperAppGetShowcaseResponseDto;
import com.vk.api.generated.video.dto.VideoGetAdsResponseDto;
import com.vk.api.generated.video.dto.VideoGetVideoDiscoverResponseDto;
import com.vk.internal.api.GsonHolder;
import com.vk.internal.api.SingleRootResponseDto;
import com.vk.voip.OKVoipEngine;
import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class xul0 implements b03, io.reactivex.rxjava3.functions.l, f03, szs, io.reactivex.rxjava3.core.s, yads.wq, yads.iz {
    public final /* synthetic */ int b;

    public /* synthetic */ xul0(int i) {
        this.b = i;
    }

    @Override // yads.iz
    public void accept(Object obj) {
        ((yads.pk0) obj).b();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        switch (this.b) {
            case 1:
                return ((File) obj).getAbsolutePath();
            case 2:
            default:
                return io.reactivex.rxjava3.internal.operators.completable.i.b;
            case 3:
                return Integer.valueOf(((pfp0) obj).c);
        }
    }

    @Override // xsna.b03
    public Object e(wwx wwxVar) {
        switch (this.b) {
            case 0:
                return (StoriesGetByIdExtendedResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StoriesGetByIdExtendedResponseDto.class).getType())).a();
            case 6:
                return (VideoGetVideoDiscoverResponseDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, VideoGetVideoDiscoverResponseDto.class).getType())).a();
            default:
                return (StickersPackPreviewsChunkDto) ((SingleRootResponseDto) GsonHolder.a().fromJson(wwxVar, xtp0.getParameterized(SingleRootResponseDto.class, StickersPackPreviewsChunkDto.class).getType())).a();
        }
    }

    @Override // yads.wq
    public yads.xq fromBundle(Bundle bundle) {
        return yads.rm2.a(bundle);
    }

    @Override // xsna.f03
    public RootResponseDto g(InputStream inputStream) {
        switch (this.b) {
            case 2:
                return (RootResponseDto) com.vk.superapp.api.generated.GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, SuperAppGetShowcaseResponseDto.class).getType());
            default:
                return (RootResponseDto) GsonHolder.a().fromJson(new InputStreamReader(inputStream), xtp0.getParameterized(RootResponseDto.class, VideoGetAdsResponseDto.class).getType());
        }
    }

    @Override // io.reactivex.rxjava3.core.s
    public void subscribe(final io.reactivex.rxjava3.core.r rVar) {
        ParticipantStatesManager.Listener listener = new ParticipantStatesManager.Listener() { // from class: xsna.t3x0
            @Override // ru.ok.android.externcalls.sdk.participant.state.ParticipantStatesManager.Listener
            public final void onParticipantStateChanged(ParticipantStatesManager participantStatesManager, ParticipantStatesManager.StateChangedEvent stateChangedEvent) {
                io.reactivex.rxjava3.core.r.this.onNext(Boolean.valueOf(participantStatesManager.isOwnHandRaised()));
            }
        };
        rVar.i(new io.reactivex.rxjava3.disposables.a(new g66(listener, 9)));
        com.vk.voip.ui.c.r.getClass();
        OKVoipEngine.k.g(listener);
    }

    public /* synthetic */ xul0(izs izsVar, int i) {
        this.b = i;
    }
}
