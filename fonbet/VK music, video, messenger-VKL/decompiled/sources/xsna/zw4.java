package xsna;

import com.vk.api.generated.audio.dto.AudioAudioIdDto;
import com.vk.api.generated.audio.dto.AudioPlaylistDto;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseOkResponseDto;
import java.util.List;

/* compiled from: AudioSavePlaylistRequests.kt */
/* loaded from: classes14.dex */
public final class zw4 extends com.vk.api.request.rx.batch.d<AudioPlaylistDto, AudioPlaylistDto, BaseOkResponseDto, List<? extends AudioAudioIdDto>, BaseBoolIntDto, ax4> {
    public final cx4 v;

    public zw4(rsg0<AudioPlaylistDto> rsg0Var, rsg0<AudioPlaylistDto> rsg0Var2, rsg0<BaseOkResponseDto> rsg0Var3, rsg0<List<AudioAudioIdDto>> rsg0Var4, rsg0<BaseBoolIntDto> rsg0Var5, cx4 cx4Var) {
        super(rsg0Var, rsg0Var2, rsg0Var3, rsg0Var4, rsg0Var5);
        this.v = cx4Var;
    }

    @Override // com.vk.api.request.rx.batch.d
    public final ax4 K0(bv6<AudioPlaylistDto> bv6Var, bv6<AudioPlaylistDto> bv6Var2, bv6<BaseOkResponseDto> bv6Var3, bv6<List<? extends AudioAudioIdDto>> bv6Var4, bv6<BaseBoolIntDto> bv6Var5) {
        AudioPlaylistDto audioPlaylistDto = bv6Var.a;
        AudioPlaylistDto audioPlaylistDto2 = bv6Var2.a;
        if (audioPlaylistDto.getId() > 0) {
            return new ax4(audioPlaylistDto.getId(), audioPlaylistDto.q(), audioPlaylistDto.d());
        }
        int id = audioPlaylistDto2.getId();
        cx4 cx4Var = this.v;
        return id > 0 ? new ax4(audioPlaylistDto2.getId(), cx4Var.a, cx4Var.c) : new ax4(cx4Var.b, cx4Var.a, cx4Var.c);
    }
}
